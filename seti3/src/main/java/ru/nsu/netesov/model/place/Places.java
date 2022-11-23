package ru.nsu.netesov.model.place;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Places {
    @JsonProperty("features")
    private ArrayList<Place> places;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < places.size(); i++) {
            builder.append(i+1).append(") ").append(places.get(i)).append("\n");
        }
        return builder.toString();
    }

    public String getXidOfPlaceById(int id) {
        return places.get(id).getPlace().getXid();
    }
}
