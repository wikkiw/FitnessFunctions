package cz.wikkiw.fitnessfunctions;

import cz.wikkiw.fitnessfunctions.objects.Boundary;

/**
 *
 * @author adam
 */
public interface FitnessFunction {
    
    public String getName();
    public double getValue(double[] features);
    public Boundary getBoundary();
    public double getOptimum(int dimension);
    public double getFal(int dimension);
    
}
