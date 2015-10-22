package cz.wikkiw.fitnessfunctions.objects;

/**
 *
 * @author adam
 */
public class Boundary {
    
    private double min;
    private double max;

    public Boundary() {
    }

    public Boundary(double min, double max) {
        this.min = min;
        this.max = max;
    }
    
    public double getRange(){
        return this.max-this.min;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }
    
    
    
}
