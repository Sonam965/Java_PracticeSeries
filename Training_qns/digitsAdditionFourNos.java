import java.util.Scanner;
class digitsAdditionFourNos{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 4 digits Number");
		int a = sc.nextInt() ;  //eg. 1124
		 int n1 = a % 10;     //extracts the last digit 4
        a = a / 10;           //removes 112
        int n2 = a % 10;      // remaining digit is 112 , so extract the last digit 2
        a = a / 10;             // removes 1
        int n3 = a % 10;      // remaining digit is 11 , so extract the last digit 1
        a = a / 10; 
        int n4 = a % 10;        // extract the last digit 1 
        int res = n1 + n2 + n3 + n4;  // 4 + 2 + 1+1
		System.out.println("The addition of digits are : " +res);

	}}