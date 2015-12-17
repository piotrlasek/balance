package com.company.balance;

import java.util.HashMap;

/**
 * Created by Piotr Lasek on 15.12.2015.
 */
public class PebbleWeight {

    private HashMap<String, Float> colorsWeigts;

    /**
     *
     */
    public PebbleWeight() {
        colorsWeigts = new HashMap<>();
    }

    /**
     *
     * @param query
     * @param value
     */
    public PebbleWeight addQuery(String query, Float value) {
        colorsWeigts.put(query, value);
        return this;
    }

    /**
     *
     * @return
     */
    public Float getWeight(String color) {
        Float weight = colorsWeigts.get(color);
        return weight;
    }

    /**
     * Publishes advert for a given query and decreases budget.
     * @param query
     */
    public void publish(String query) {
        Float payment = colorsWeigts.get(query);
    }

}
