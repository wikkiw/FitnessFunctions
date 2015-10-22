package cz.wikkiw.fitnessfunctions;

import cz.wikkiw.fitnessfunctions.objects.Boundary;

/**
 *
 * @author adam
 */
public class Salomon implements FitnessFunction{

    @Override
    public double getValue(double[] features) {
        
        double first_sum = 0;
        int dimension = features.length;
        double toRet;
        
        for(int i=0; i<dimension; i++){
            
            first_sum += features[i] * features[i];

        }
        
        toRet = -Math.cos(2*Math.PI*first_sum) + 0.1*Math.sqrt(first_sum) + 1;
        
        return toRet;
        
    }

    @Override
    public Boundary getBoundary() {
        return new Boundary(-100, 100);
    }

    @Override
    public double getOptimum(int dimension) {
        return 0;
    }

    @Override
    public double getFal(int dimension) {
        return Math.pow(10, -7);
    }
    
    @Override
    public String getName() {
        return "Salomon";
    }
    
}
