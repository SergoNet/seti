package ru.nsu.netesov.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import ru.nsu.netesov.model.location.Locations;
import ru.nsu.netesov.model.location.Point;
import ru.nsu.netesov.model.place.PlaceDescription;
import ru.nsu.netesov.model.place.Places;
import ru.nsu.netesov.model.weather.AllWeatherInfo;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Data {
    private Locations locations;
    private AllWeatherInfo weatherInfo;
    private Places places;
    private PlaceDescription description;

    public Point getCoordsOfLocationById(int id) {
        return locations.getCoordsOfLocationById(id);
    }
    public String getXidById(int id) {
        return places.getXidOfPlaceById(id);
    }
}
