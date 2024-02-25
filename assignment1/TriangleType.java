import java.util.*;
class TriangleType{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first side of Triangle");
		int side1= sc.nextInt();
		System.out.println("Enter second side of Triangle");
		int side2 = sc.nextInt();
		System.out.println("Enter third side of Triangle");
		int side3= sc.nextInt();
		 if (side1 == side2 && side2 == side3) {
            System.out.println("It's an equilateral triangle.");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("It's an isosceles triangle.");
        } else {
            System.out.println("It's a scalene triangle.");
        }
	}
}