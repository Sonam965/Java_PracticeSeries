import java.util.Scanner;
class lastDigit {
	public static void main (String[] args){
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter any number to find its last digit" );
	int n = sc.nextInt();
	int res = n % 10;
	System.out.println("The last digit is "+res);
}
}