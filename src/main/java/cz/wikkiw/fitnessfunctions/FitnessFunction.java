package cz.wikkiw.fitnessfunctions;

import cz.wikkiw.fitnessfunctions.objects.Boundary;

/**
 *
 * @author adam
 */
public interface FitnessFunction {
    
    public void init(int dim);
    public String getName();
    public double getValue(double[] features);
    public Boundary getBoundary();
    public double getOptimum(int dimension);
    public double getFal(int dimension);
    
}
