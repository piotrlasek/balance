package com.company.balance;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by Piotr on 12/18/2015.
 */
public class CategoryColor {

    HashMap<String, Float> colorHue;

    public CategoryColor() {
        colorHue = new HashMap<>();
    }


    public void refreshColors() {
        Set<String> categories = colorHue.keySet();
        float delta = 256 / categories.size();
    }



}
