package cz.wikkiw.fitnessfunctions;

import cz.wikkiw.fitnessfunctions.objects.Boundary;

/**
 *
 * @author adam
 */
public class Schwefel implements FitnessFunction {

    @Override
    public double getValue(double[] features) {
        
        double sum = 0;
        int dimension = features.length;
        
        for(int i=0; i<dimension; i++){
            sum += (features[i]*Math.sin(Math.sqrt(Math.abs(features[i]))));
        }
        
        return -sum;
        
    }

    @Override
    public Boundary getBoundary() {
        return new Boundary(-500, 500);
    }

    @Override
    public double getOptimum(int dimension) {
        return -418.982887272433799807913601398 * dimension;
    }

    @Override
    public double getFal(int dimension) {
        
        if(dimension <= 1){
            return Math.pow(10, -6);
        } else if (dimension < 15){
            return Math.pow(10, -5);
        } else {
            return Math.pow(10, -4);
        }
        
    }
    
    @Override
    public String getName() {
        return "Schwefel";
    }

    @Override
    public void init(int dim) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
