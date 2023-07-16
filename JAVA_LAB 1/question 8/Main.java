import java.util.Scanner;

interface ThreeDShapes {
    void printVolume();
    void printArea();
}

class Cylinder implements ThreeDShapes {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public void printVolume() {
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of the cylinder: " + volume);
    }

    public void printArea() {
        double area = 2 * Math.PI * radius * (radius + height);
        System.out.println("Surface area of the cylinder: " + area);
    }
}

class Sphere implements ThreeDShapes {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public void printVolume() {
        double volume = (4 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("Volume of the sphere: " + volume);
    }

    public void printArea() {
        double area = 4 * Math.PI * Math.pow(radius, 2);
        System.out.println("Surface area of the sphere: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- 3D Shapes Program ---");
        System.out.println("1. Calculate Cylinder");
        System.out.println("2. Calculate Sphere");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the cylinder: ");
                double cylinderRadius = scanner.nextDouble();
                System.out.print("Enter the height of the cylinder: ");
                double cylinderHeight = scanner.nextDouble();

                Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);
                cylinder.printVolume();
                cylinder.printArea();
                break;
            case 2:
                System.out.print("Enter the radius of the sphere: ");
                double sphereRadius = scanner.nextDouble();

                Sphere sphere = new Sphere(sphereRadius);
                sphere.printVolume();
                sphere.printArea();
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        scanner.close();
    }
}/*--- 3D Shapes Program ---
1. Calculate Cylinder
2. Calculate Sphere
Enter your choice: 1
Enter the radius of the cylinder: 2
Enter the height of the cylinder: 3
Volume of the cylinder: 37.69911184307752
Surface area of the cylinder: 62.83185307179586*/
