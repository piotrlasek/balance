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
     * @return
     */
    public int getPebblesCount() {
        return pebbleWeights.length;
    }

    /**
     *
     * @param color
     * @return
     */
    public Float getPebblesWeightsSum(String color) {
        Float weightsSum = 0f;

        for(PebbleWeight pw : pebbleWeights) {
            weightsSum += pw.getWeight(color);
        }

        return weightsSum;
    }

    /**
     *
     * @param color
     * @return
     */
    public Float getMaxPebblesWeight(String color) {
        Float max = 0f;

        for (PebbleWeight pw : pebbleWeights) {
           if (pw.getWeight(color) > max) {
               max = pw.getWeight(color);
           }
        }

        return max;
    }

    /**
     *
     */
    public void printCellWeights() {

        System.out.print("C: ");
        Set<String> colors = cellWeight.getColors();
        for(String c : colors) {
            System.out.print(c + " " + cellWeight.getWeight(c) + "\t\t");
        }
        System.out.println();
    }

    /**
     *
     */
    public String[] run() {
        String[] result = new String[pebbleWeights.length];
        int index = 0;
        printCellWeights();
        System.out.println("--------------------");

        for(PebbleWeight pw : pebbleWeights) {
            HashMap<String, Float> tmp = new HashMap<>();
            Set<String> colors = cellWeight.getColors();

            System.out.print("P: ");

            for(String color : colors) {
                Float pebbleColorWeight = pw.getWeight(color);
                System.out.print(color + " " + pebbleColorWeight + "\t");
                Float cellColorWeight = cellWeight.getWeight(color);
                tmp.put(color, pebbleColorWeight * cellColorWeight);
            }

            Float max = Collections.max(tmp.values());
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

            result[index++] = maxColor;

            System.out.println("=> " + maxColor);
            Float maxWeight = getMaxPebblesWeight(maxColor);
            Float sumWeight = getPebblesWeightsSum(maxColor);
            Float delta =
                    pw.getWeight(maxColor) * (maxWeight / sumWeight);
                    //pw.getWeight(maxColor) / 4;
            cellWeight.put(maxColor, maxColorWeight - delta);
            printCellWeights();
        }

        return result;
    }
}
