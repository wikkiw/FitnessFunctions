package cz.wikkiw.fitnessfunctions;

import cz.wikkiw.fitnessfunctions.objects.Boundary;

/**
 *
 * @author adam
 */
public class Rosenbrock implements FitnessFunction {

    @Override
    public double getValue(double[] features) {
        
        int dimension = features.length;
        double sum = 0;
        
        for(int i=0; i<dimension-1; i++){
            
            sum += 100*Math.pow(features[i+1]-Math.pow(features[i],2),2) + Math.pow(features[i] - 1,2);
            
        }
        
        return sum;
        
    }

    @Override
    public Boundary getBoundary() {
        return new Boundary(-2.048, 2.048);
    }

    @Override
    public double getOptimum(int dimension) {
        return 0;
    }

    @Override
    public double getFal(int dimension) {
        
        if(dimension <= 4){
            return Math.pow(10, -5);
        } else if(dimension <= 19){
            return Math.pow(10, -4);
        } else {
            return Math.pow(10, -3);
        }
        
    }
    
    @Override
    public String getName() {
        return "Rosenbrock";
    }

    @Override
    public void init(int dim) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
