package com.company.balance;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by Piotr Lasek on 15.12.2015.
 */
public class Balance {

    PebbleWeight[] pebbleWeights;
    CellWeight cellWeight;

    /**
     *
     * @param cellWeight
     * @param pebbleWeights
     */
    public Balance(CellWeight cellWeight, PebbleWeight[] pebbleWeights) {
        this.pebbleWeights = pebbleWeights;
        this.cellWeight = cellWeight;
    }


    /**
     *
     */
    public void run() {
        for(PebbleWeight pw : pebbleWeights) {
            //
            Set<String> colors = cellWeight.getColors();

            HashMap<String, Float> tmp = new HashMap<>();

            for(String color : colors) {
                Float pebbleColorWeight = pw.getWeight(color);
                Float cellColorWeight = cellWeight.getWeight(color);
                tmp.put(color, pebbleColorWeight * cellColorWeight);
            }

            Float max = (Float) Collections.max(tmp.values());
            String maxColor = null;
            Float maxColorWeight = null;

            for(String color : tmp.keySet()) {
                Float weight = tmp.get(color);
                if (weight == max) {
                    maxColor = color;
                    maxColorWeight = cellWeight.getWeight(color);
                    break;
                }
            }

            cellWeight.put(maxColor, maxColorWeight - pw.getWeight(maxColor));
        }
    }

}
