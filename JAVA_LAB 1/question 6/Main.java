import java.util.Scanner;

class Rectangle{
    protected double length;
    protected double breadth;
    protected double area;

    public void calculateArea(){
        area = length + breadth;
    }

    public double getArea() {
        return area;
    }

}

class Box extends Rectangle{
    private double height;
    private double volume;
   
    public void setHeight(double h) {
        height = h;
    }

    public void calculateVolume() {
        volume = length * breadth * height;
    }

    public double getVolume() {
        return volume;
    }
}
public class rectangle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Length : ");
        double length = scanner.nextDouble();
        System.out.print("Breadth : ");
        double breadth = scanner.nextDouble();
        System.out.print("height : ");
        double height = scanner.nextDouble();

        Box box = new Box();
        box.length = length;
        box.breadth = breadth;
        box.setHeight(height);

        box.calculateArea();
        box.calculateVolume();

        System.out.println("Area : " + box.getArea());
        System.out.println("Volume : " + box.getVolume());
    }
}
