import java.util.*;
class EvenOdd{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check whether its even or odd  : ");
		int n = sc.nextInt();
		if(n%2==0){
			System.out.println("Number is even");
		}else{
			System.out.println("Number is odd ");
		}}}