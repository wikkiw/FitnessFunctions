package cz.wikkiw.fitnessfunctions;

import cz.wikkiw.fitnessfunctions.objects.Boundary;

/**
 *
 * @author adam
 */
public class Ackley implements FitnessFunction {

    @Override
    public double getValue(double[] features) {

        int dimension = features.length;
        double D = dimension;
        double first_sum = 0;
        double second_sum = 0;
        double to_ret;
        
        for(int i = 0; i < dimension; i++){
            
            first_sum += features[i]*features[i];
            second_sum += Math.cos(2*Math.PI*features[i]);
            
        }
        
        to_ret = -20 * Math.exp( -0.2 * Math.sqrt((1/D) * first_sum)) - Math.exp((1/D) * second_sum) + 20 + Math.E;
        
        return to_ret;
    
    }

    @Override
    public Boundary getBoundary() {
        return new Boundary(-32, 32);
    }

    @Override
    public double getOptimum(int dimension) {
        return 0;
    }

    @Override
    public double getFal(int dimension) {
        return Math.pow(10,-7);
    }
    
}
