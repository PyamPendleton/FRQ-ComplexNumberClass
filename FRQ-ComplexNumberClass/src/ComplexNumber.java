public class ComplexNumber {

    private double real, imaginary;

    public ComplexNumber(int a, int b) {
        this.real = a;
        this.imaginary = b;
    }

    public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
        ComplexNumber sum = new ComplexNumber(0,0);
        sum.real = c1.real + c2.real;
        sum.imaginary = c1.imaginary + c2.imaginary;
        return sum;
    }

    public static ComplexNumber multiply(ComplexNumber c1, ComplexNumber c2) {
        ComplexNumber product = new ComplexNumber(0,0);
        product.real = (c1.real * c2.real) - (c1.imaginary * c2.imaginary);
        product.imaginary = (c1.real * c2.imaginary) + (c1.imaginary * c2.real);
        return product;
    }


    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
}
