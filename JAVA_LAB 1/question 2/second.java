import java.util.Scanner;

public class second{
    
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter a string : ");
        String string = scanner.nextLine();
        System.out.println("Entered string : " + string);
        System.out.print("Enter the number : ");
        int number = scanner.nextInt();
        loop(string, number);
        

    }

    public static void loop(String s, int n){
        for(int i=0;i<n;i++){
            System.out.println(s);
        }
    }

}
