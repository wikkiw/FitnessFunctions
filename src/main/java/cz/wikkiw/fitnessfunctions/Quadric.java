package cz.wikkiw.fitnessfunctions;

import cz.wikkiw.fitnessfunctions.objects.Boundary;

/**
 *
 * @author adam
 */
public class Quadric implements FitnessFunction {

    @Override
    public double getValue(double[] features) {
        
        double sum = 0;
        double tmp = 0;
        int dimension = features.length;
        
        for(int i=0; i<dimension; i++){
            
            tmp = 0;
            for(int j=0; j<=i; j++){
                tmp += features[j];
            }
            sum += tmp*tmp;
            
        }
        
        return sum;
        
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
        
        if (dimension <= 2){
            return Math.pow(10, -4);
        } else if (dimension <= 5){
            return Math.pow(10, -3);
        } else if (dimension <= 14){
            return Math.pow(10, -2);
        } else {
            return Math.pow(10, -1);
        }
        
    }
    
    @Override
    public String getName() {
        return "Quadric";
    }
    
}
