import java.util.Scanner;
class noReverse {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 3 digits Number");
		int a = sc.nextInt() ;  //eg. 124
		 int n1 = a % 10;     //extracts the last digit 4
        a = a / 10;           //removes 12
        int n2 = a % 10;      // remaining digit is 12 , so extract the last digit 2
        a = a / 10;             // removes 1
        int n3 = a % 10;        // extract the last digit 1 
        int res = n1 * 100 + n2 * 10 + n3;  
		System.out.println("The addition of digits are : " +res);

	}}