package cz.wikkiw.fitnessfunctions;

import cz.wikkiw.fitnessfunctions.objects.Boundary;

/**
 *
 * @author adam
 */
public class Griewank implements FitnessFunction {

    @Override
    public double getValue(double[] features) {
        
        double sum = 0;
        double product = 1;
        int dimension = features.length;
        double toRet;
        
        for(int i=0; i< dimension; i++){
            
            sum += features[i] * features[i];
            product = product * Math.cos((features[i]) / Math.sqrt(i+1));
        }
        
        toRet = (1/4000.0) * sum - product + 1;
        
        return toRet;
        
    }

    @Override
    public Boundary getBoundary() {
        return new Boundary(-600, 600);
    }

    @Override
    public double getOptimum(int dimension) {
        return 0;
    }

    @Override
    public double getFal(int dimension) {
        
        if(dimension <= 1){
            return Math.pow(10,-7);
        }
        else if (dimension <= 10) {
            return Math.pow(10,-6);
        }
        else {
            return Math.pow(10,-5);
        }
        
    }
    
}
