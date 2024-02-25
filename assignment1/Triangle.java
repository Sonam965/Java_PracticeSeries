import java.util.*;
class Triangle{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first side of Triangle");
		int a = sc.nextInt();
		System.out.println("Enter second side of Triangle");
		int b = sc.nextInt();
		System.out.println("Enter third side of Triangle");
		int c = sc.nextInt();
		int sum = a +b + c;
		if(sum == 180){
			System.out.println("it is a triangle");
		} else{
		System.out.println("it is not a triangle");	
		}
	}
}