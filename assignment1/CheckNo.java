import java.util.*;
class CheckNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check whether its positive, negative or zero : ");
		int n = sc.nextInt();
		if(n>0){
			System.out.println("Entered number is a positive number");
		}else if (n <0 ){
			System.out.println("Entered number is a negative number");
		}else{
			System.out.println("Entered number is a Zero");
		}
	}
}