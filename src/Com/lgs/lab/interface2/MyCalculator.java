package Com.lgs.lab.interface2;

import Com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {

     double a ;
     double b ;

    public MyCalculator(double a, double b) {
        this.a = a;
        this.b = b;
    }



    @Override
    public double divide() {
        return a / b;


    }

    @Override
    public double minus() {
        return a - b;

    }

    @Override
    public double multiply() {
        return a * b;

    }

    @Override
    public double add() {
        return a + b;

    }
}
