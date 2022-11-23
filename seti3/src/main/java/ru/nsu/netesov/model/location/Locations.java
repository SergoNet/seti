package ru.nsu.netesov.model.location;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


import java.util.ArrayList;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Locations {


    private ArrayList<Location> hits;
    private long took;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < hits.size(); i++) {
            builder.append(i+1).append(") ").append(hits.get(i)).append("\n");
        }
        return builder.toString();
    }

    public Point getCoordsOfLocationById(int id) {
        return hits.get(id).getPoint();
    }
}
