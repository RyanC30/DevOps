/**
 * Created by ryanc on 19/04/2017.
 */
public class Calculator {

    public static void main(String args[]) throws ClassNotFoundException {
        System.out.println("Welcome to my calculator version 3.1 working so far!!");

    }

        public double add ( double a, double b){
            return a + b;
        }


    public double sqrt(double a) {return  a = Math.sqrt(a); }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }


}

