import java.util.Scanner;

class Complex{
    private double real;
    private double imaginary;

    public Complex(double a, double b){
        this.real =  a;
        this.imaginary = b;
    }

    public void PrintComplex(){
        if (imaginary < 0) {
            System.out.println(real + " - " + (-imaginary) + "i");
        } else {
            System.out.println(real + " + " + imaginary + "i");
        }
    }

}
public class fourth{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the real part : ");
        double RealPart = scanner.nextDouble();

        System.out.print("Enter the imaginary part : ");
        double ImaginaryPart = scanner.nextDouble();

        Complex complex =  new Complex(RealPart, ImaginaryPart);
        complex.PrintComplex();
    } 
}