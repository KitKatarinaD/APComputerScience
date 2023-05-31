package Prog7000l;
import java.util.ArrayList;
import  java.util.Arrays;
public class LinearRegression {
    private double theta0;
    private double theta1;
    private double alpha;
    private double tolerance;
    private double[] objective;


    public LinearRegression(double thetaOne, double thetaZero, double learning_rate, double tol){
        theta1 = thetaOne;
        theta0 = thetaZero;
        alpha = learning_rate;
        tolerance = tol;
    }

    public void fit(double[][] X_train, double[] y_train, int epochs) {
        //epochs is # of taining iterations to run
        int m = X_train.length;
    }

    public double getIntercept() { return theta0;}
    public double getSlope() {return theta1;}
    public double predict(double x) {return theta1 * x + theta0;}

    public String toString() {
        return "Regression Line: y = " + theta1 + " * + " + theta0 + "\nObjective:" + (double)Arrays.stream(objective).min().getAsDouble();
    }



}
