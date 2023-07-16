import java.util.Scanner;

public class Main{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the value of n : ");
        int number = Integer.parseInt(args[0]);

	OutPrime(number);


	}
	public static boolean IsPrime(int number){
	if (number <= 1){
	return false;
	}
	else{
	for (int i = 2; i*i < number;i++ ){
	if (number%i == 0){
	return false;
	}
	
	}
	return true;
	}
}
public static void OutPrime(int n){
	int count = 0;
	int num = 2;
	while(count < n){
	if(IsPrime(num)){
	System.out.println(num + " ");
	count++;
	}
	num++;
	}
}

}
        
// ➜  quetion 1 git:(main) ✗ java Main 6
// Enter the value of n : 
// 2 
// 3 
// 4 
// 5 
// 7 
// 9 




