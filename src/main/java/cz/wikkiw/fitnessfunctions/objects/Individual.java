package cz.wikkiw.fitnessfunctions.objects;

import java.util.Arrays;

/**
 *
 * @author adam
 */
public class Individual {
    
    private double[] features;
    private double fitness;

    public Individual() {
    }

    public Individual(double[] features, double fitness) {
        this.features = features;
        this.fitness = fitness;
    }

    public double[] getFeatures() {
        return features;
    }

    public void setFeatures(double[] features) {
        this.features = features;
    }

    public double getFitness() {
        return fitness;
    }

    public void setFitness(double fitness) {
        this.fitness = fitness;
    }

    @Override
    public String toString() {
        return "Individual{" + "features=" + Arrays.toString(features) + ", fitness=" + fitness + '}';
    }

}
