public class Main {
    public static void main(String[] args) {


        ComplexNumber c1 = new ComplexNumber(3,6);
        ComplexNumber c2 = new ComplexNumber(-4,2);

        ComplexNumber sum = ComplexNumber.add(c1, c2);
        if (sum.getImaginary() < 0) {
            System.out.println(sum.getReal() + " - " + (sum.getImaginary() * -1) + "i");
        } else if (sum.getImaginary() == 0) {
            System.out.println(sum.getReal());
        } else if (sum.getReal() == 0) {
        System.out.println(sum.getImaginary() + "i");
        } else {
            System.out.println(sum.getReal() + " + " + sum.getImaginary() + "i");
        }

        ComplexNumber product = ComplexNumber.multiply(c1, c2);
        if (product.getImaginary() < 0) {
            System.out.println(product.getReal() + " - " + (product.getImaginary() * -1) + "i");
        } else if (product.getImaginary() == 0) {
            System.out.println(product.getReal());
        } else if (product.getReal() == 0) {
            System.out.println(product.getImaginary() + "i");
        } else {
            System.out.println(product.getReal() + " + " + product.getImaginary() + "i");
        }
    }
}
