
package classifier;

public class NeuralNetwork {
    public double funcPiecewiseLinear(double x, double xMin, double xMax, double b, double m) {
        double nilaiFungsiPiecewise;
        
        if(x <= xMin){
            nilaiFungsiPiecewise = 0;
            
        }else if(x >= xMax){
            nilaiFungsiPiecewise = 1;
            
        }else if(x >= xMin && x <= xMax){
            nilaiFungsiPiecewise = m*x+b;
        }else {
            nilaiFungsiPiecewise = 0;
        }       
        return nilaiFungsiPiecewise;
    }
    
}
