package cz.wikkiw.fitnessfunctions;

import cz.wikkiw.cec2015.testfunc;
import cz.wikkiw.fitnessfunctions.objects.Boundary;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adam
 */
public class f15 implements FitnessFunction {

    @Override
    public String getName() {
        return "f15";
    }

    @Override
    public double getValue(double[] features) {
        
        testfunc tf = new testfunc();
        double[] f = new double[1];
        try {
            tf.test_func(features,f,features.length,1,15);
        } catch (Exception ex) {
            Logger.getLogger(f15.class.getName()).log(Level.SEVERE, null, ex);
        }
        return f[0];
        
    }

    @Override
    public Boundary getBoundary() {
        return new Boundary(-100,100);
    }

    @Override
    public double getOptimum(int dimension) {
        return 1500.0;
    }

    @Override
    public double getFal(int dimension) {
        return Math.pow(10, -8);
    }
    
}
