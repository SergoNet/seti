package ru.nsu.fit.netesov.snake;

import ru.nsu.fit.netesov.PlayerController;

public class SnakeViewController {
    private PlayerController playerController;

    public SnakeViewController(PlayerController playerController, SnakeView snakeView) {
        playerController.getNewMessageSubject().subscribe(messageWithSender -> {
            if (messageWithSender.getMessage().hasState()) {
                snakeView.setState(messageWithSender.getMessage().getState().getState());
            }
        });
    }
}
