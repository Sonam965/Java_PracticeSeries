import java.util.*;
class SumOfDigit{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check whether its SumOfDigit is greater than 10 or not :");
		int n = sc.nextInt();
		int sum =0,rem;
		while(n>0){
		rem= n%10;
		sum = sum + rem;
		n = n/10;
	}
		if(sum >10){
			System.out.println( " Sum of digit is greater than 10");
		}else{
			System.out.println( " Sum of digit is not greater than 10");
		}
	}
}