package com.company.balance;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by Piotr on 15.12.2015.
 */
public class CellWeight {

    private HashMap<String, Float> colorsWeights;

    public CellWeight() {
        colorsWeights = new HashMap<>();
    }

    public void put(String color, Float weight) {
        colorsWeights.put(color, weight);
    }

    public Float getWeight(String color) {
        return colorsWeights.get(color);
    }

    public Set<String> getColors() {
        return colorsWeights.keySet();
    }

}
