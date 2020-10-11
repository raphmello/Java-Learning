public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add (double n1, double n2) {
        this.real = this.getReal() + n1;
        this.imaginary = this.getImaginary() + n2;
    }

    public void add (ComplexNumber n1) {
        this.real = this.getReal() + n1.getReal();
        this.imaginary = this.getImaginary() + n1.getImaginary();
    }

    public void subtract (ComplexNumber n1) {
        this.real = this.getReal() - n1.getReal();
        this.imaginary = this.getImaginary() - n1.getImaginary();
    }

    public void subtract (double n1, double n2) {
        this.real = this.getReal() - n1;
        this.imaginary = this.getImaginary() - n2;
    }
}
