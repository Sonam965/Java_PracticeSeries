import java.util.*;
class TotalPer{
	public static void main(String[] args) {
		System.out.println("Enter marks of any 5 subjects : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of 1st subject: ");
		int a = sc.nextInt();
		System.out.println("Enter marks of 2nd subject: ");
		int b = sc.nextInt();
		System.out.println("Enter marks of 3rd subject: ");
		int c = sc.nextInt();
		System.out.println("Enter marks of 4th subject: ");
		int d = sc.nextInt();
		System.out.println("Enter marks of 5th subject: ");
		int e = sc.nextInt();
		int total = a + b + c+d +e;
		int per = (total *100)/500;
		System.out.println("Your total marks of 5 subjects = " + total);
		System.out.println("Your Percentage  = " + per + "%");
	}
}