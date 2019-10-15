package io.codefountain.project.lombok.accessors;

import lombok.Getter;

public class LazyGetter {

    @Getter(lazy = true)
    private final double[] cachedData = loadData();

    public double[] loadData(){

        double[] dataSet = new double[100000000];
        for(int i=1; i<dataSet.length; i++){
            dataSet[i] += Math.random();
        }
        return dataSet;
    }
}
