import java.util.*;
class Salary{
public static void main(String[] args) {
	int BasicSal = 20000;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your daily allowance : ");
	int a = sc.nextInt();
	System.out.println("Enter your travelling allowance : ");
	int b= sc.nextInt();
	System.out.println("Enter your house rent : ");
	int c = sc.nextInt();
	int GrassSal = BasicSal + (a+b+c);
	System.out.println("Your gross salary is :" + GrassSal);
} 
}