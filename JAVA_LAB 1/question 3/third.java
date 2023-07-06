import java.util.Scanner;

class Student{
    private String StudentName;
    private int RollNo;
    private int[] marks;
    private int total;

    public Student(String name, int RollNo){
	Scanner scanner = new Scanner(System.in);    
        this.StudentName = name;
        this.RollNo = RollNo;
        marks = new int[5];
        String[] subjects = {"physiscs", "chemistry", "english", "biology", "maths"};

        System.out.println("Enter "+StudentName+  "'s marks for five subjects : ");

	for(int i = 0;i < 5; i++){
	         System.out.print("Enter marks for "+ subjects[i]+ " : ");
		 marks[i] = scanner.nextInt();
	}


    }
    public int GetTotal(){
	    for(int i = 0;i<5;i++){
	    total = total + marks[i];
	    }
	    return total;
    }
    public String GetName(){
	    return StudentName;
    }
    public int GetRollNo(){
	return RollNo;    
    }
    public void GetMarks(){
        String[] subjects = {"physiscs", "chemistry", "english", "biology", "maths"};
        for(int i = 0; i<5;i++){
            System.out.println("Marks for " + subjects[i] + " : " + marks[i]);
        }
    }




}
public class third{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
		System.out.print("Enter the name of first student : ");
		String name1 = scanner.nextLine();
		System.out.print("Enter Roll noo. : ");
		int roll1 = scanner.nextInt();
        System.out.print("Enter the name of second student : ");
        String name2 = scanner2.nextLine();
        System.out.print("Enter Roll noo. : ");
        int roll2 = scanner2.nextInt();

		Student student1, student2;
	        student1 = new Student(name1, roll1);
            student2 = new Student(name2, roll2);
		int  Total_1 = student1.GetTotal();
        int Total_2 = student2.GetTotal();
        if (Total_1 > Total_2){
            System.out.println("Student name : "+ student1.GetName());
            System.out.println("Student Roll no. : " + student1.GetRollNo());
            student1.GetMarks();
        }
        else{
            System.out.println("Student name : "+ student2.GetName());
            System.out.println("Student Roll no. : " + student2.GetRollNo());
            student2.GetMarks();


        }

	}
}
