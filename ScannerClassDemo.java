package ScannerClass;
import java.util.Scanner;

public class ScannerClassDemo {
public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your college name:");
	String collegeName = sc.nextLine();
	
	System.out.println("Enter your conselling code:");
	int code= sc.nextInt();
    System.out.println("The college name is "+ collegeName +"and the conselling code "+ code);
	
}
}
