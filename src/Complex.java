public class Complex {

    private double first;
    private double second;

    public Complex(double a) {
        this (a, 0.0);
    }

    public Complex(double a, double b) {
        first = a;
        second = b;
    }

    public double abs() {
        return Math.sqrt(first*first + second*second);
    }

    public String toString() {
        return first + " + " + second + "i";
    }

    public Complex add(Complex c) {
        return new Complex(this.first + c.first, this.second + c.second);
    }

    public Complex add(double d) {
       return new Complex (first + d, second);
    }

    public Complex multiply(Complex c) {
        return new Complex(this.first*c.first - this.second*c.second,this.second*c.first + this.first*c.second);
    }

    public Complex multiply(double d) {
        return new Complex(this.first*d,this.second*d);
    }

    public static void main (String[] args) {

        Complex c1 = new Complex(7,24);
        Complex c2 = new Complex(3,4);
        System.out.println("");
        System.out.println("Complex Number 1: " + c1.toString());
        System.out.println("Complex Number 2: " + c2.toString());
        System.out.println("");
        System.out.println("Hypotenuse of Complex Number 1: " + c1.abs());
        System.out.println("Hypotenuse of Complex Number 2: " + c2.abs());
        System.out.println("");
        System.out.println("(" + c1 + ") + (" + c2 + ") = " + c1.add(c2));
        System.out.println("(" + c1 + ")(" + c2 + ") = " + c1.multiply(c2));
    }

}
