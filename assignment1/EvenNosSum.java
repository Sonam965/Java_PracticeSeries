import java.util.Scanner;
class EvenNosSum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n to calculate sum of first n even numbers");
		int n = sc.nextInt();
		int sum=0;
		for(int i =0;i<=n ; i++){
			int evenNo = 2*i;
			sum = sum + evenNo;
		}
		System.out.println("Sum of " + n + "even number is : " + sum);
	}
}