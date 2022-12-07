package ru.nsu.fit.netesov.gui;

import me.ippolitov.fit.snakes.SnakesProto;
import ru.nsu.fit.netesov.PlayerController;
import ru.nsu.fit.netesov.datatypes.MessageWithSender;
import ru.nsu.fit.netesov.snake.SnakeView;
import ru.nsu.fit.netesov.snake.SnakeViewController;
import ru.nsu.fit.netesov.gui.components.GamesList;
import ru.nsu.fit.netesov.gui.components.PlayersTable;
import ru.nsu.fit.netesov.gui.components.SnakeCanvas;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.BindException;
import java.util.logging.LogManager;

public class GameUI {
    PlayerController player;
    SnakeView snakeView;
    private void joinGame(MessageWithSender gameMessage) {
        player.joinGame(gameMessage);
    }
    private void initUI() {
        var frame = new JFrame("Game");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contents = new JPanel();
        contents.setLayout(new BorderLayout());
        var controlPanel = new JPanel(new GridLayout(2, 1));
        var playersPanel = new JPanel(new GridLayout(4, 1));
        playersPanel.setBorder(BorderFactory.createTitledBorder("Players"));
        playersPanel.setLayout(new GridLayout(1, 1));
        playersPanel.add(new PlayersTable(player.getPlayersManager()));
        controlPanel.add(playersPanel);
        var joinPanel = new JPanel();
        joinPanel.setBorder(BorderFactory.createTitledBorder("Join or create a game"));
        joinPanel.setLayout(new GridLayout(2, 1));
        joinPanel.add(new JScrollPane(new GamesList(player.getAvailableGamesManager(), this::joinGame)));
        var createButton = new JButton("Create game");
        createButton.addActionListener(v -> player.createGame());
        joinPanel.add(createButton);
        controlPanel.add(joinPanel);
        contents.add(controlPanel, BorderLayout.EAST);
        contents.add((Component) snakeView, BorderLayout.WEST);
        frame.setContentPane(contents);
        frame.pack();
        frame.setSize(865, 330);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    GameUI() throws IOException {
        var i = 0;
        for (i = 0; i < 10; i++) {
            try {
                player = new PlayerController("Game Player", 5000 + i, SnakesProto.NodeRole.NORMAL);
            } catch (BindException e) {
                continue;
            }
            break;
        }
        if (i == 10) {
            throw new RuntimeException("All ports are taken");
        }
        snakeView = new SnakeCanvas(player.getControlSubject());
        snakeView.setState(SnakesProto.GameState.getDefaultInstance());
        new SnakeViewController(player, snakeView);
        SwingUtilities.invokeLater(this::initUI);
    }

    public static void main(String[] args) throws IOException {
        LogManager.getLogManager().readConfiguration(GameUI.class.getResourceAsStream("/logging.properties"));
        new GameUI();
    }
}
