package com.company.balance;

import com.company.vis.BalanceFrame;

/**
 * Created by Piotr on 15.12.2015.
 */
public class Test {

    public static void main(String[] args) {

        // init queries;

        CellWeight cellWeight = new CellWeight();
        cellWeight.put("R", 0.30f);
        cellWeight.put("G", 0.10f);
        cellWeight.put("B", 0.60f);

        // init pebbleWeightses
        PebbleWeight[] pebbleWeights = new PebbleWeight[4];
        pebbleWeights[0] = new PebbleWeight().addQuery("R", .1f).addQuery("G", .1f).addQuery("B", .8f);
        pebbleWeights[1] = new PebbleWeight().addQuery("R", .1f).addQuery("G", .1f).addQuery("B", .8f);
        pebbleWeights[2] = new PebbleWeight().addQuery("R", .1f).addQuery("G", .1f).addQuery("B", .8f);
        pebbleWeights[3] = new PebbleWeight().addQuery("R", .1f).addQuery("G", .1f).addQuery("B", .8f);

        Balance algorithm = new Balance(cellWeight, pebbleWeights);

        String[] result = algorithm.run();

        BalanceFrame bf = new BalanceFrame();
        bf.setVisible(true);
    }

}
