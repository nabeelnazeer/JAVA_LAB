import java.util.Scanner;

class Box{
    private double length;
    private double breadth;
    private double height;
    private double area;
    private double volume;

    public Box(){
        this.length = 0;
        this.breadth = 0;
        this.height = 0;
    }

    public Box(double side) {
        this.length = side;
        this.breadth = side;
        this.height = side;
    
    }

    public Box(double side1, double side2) {
        this.length = side1;
        this.breadth = side2;
        this.height = side2;
    }

    public Box(double side1, double side2, double side3) {
        this.length = side1;
        this.breadth = side2;
        this.height = side3;
    }

    public void calculateArea() {
        area = 2 * (length*breadth + breadth*height + height*length);
    }

    public void calculateVolume() {
        volume = length*breadth*height;
    }

    public double getArea(){
        return area;
    }
    public double getVolume(){
        return volume;
    }

}    
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Enter the dimensions: ");
            System.out.print("Length: ");
            double length = scanner.nextDouble();
            System.out.print("Breadth:");
            double breadth = scanner.nextDouble();
            System.out.print("height: ");
            double height = scanner.nextDouble();

            Box box;

            if (length == breadth && breadth == height) {
                box = new Box(length);
            }
            else if (breadth == height) {
                box = new Box(length, breadth);
            }
            else {
                box = new Box(length, breadth, height);
            }

            box.calculateArea();
            box.calculateVolume();

            System.out.print("area: "+box.getArea());
            System.out.print("volume: "+box.getVolume());

            System.out.print("Do you want to continue (Y/N: )");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
    }

    

}
/*Enter the dimensions: 
Length: 2
Breadth:3
height: 4
area: 52.0volume: 24.0Do you want to continue (Y/N: )n*/