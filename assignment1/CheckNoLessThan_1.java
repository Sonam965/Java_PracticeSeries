import java.util.Scanner;
class checkNoLessThan_1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		if(n<20){
			System.out.println("Number is less than 20");
		} else{
			System.out.println("Number is not less than 20");
		}
	}
}