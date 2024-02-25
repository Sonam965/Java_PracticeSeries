import java.util.*;
class Largest1{
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter any three number to check the amongst three numbers : ");
System.out.println("Enter 1st Number : ");
int a = sc.nextInt();
System.out.println("Enter 2nd Number : ");
int b = sc.nextInt();
System.out.println("Enter 3rd Number : ");
int c = sc.nextInt();
if(a>b){
	if(a>c){
		System.out.println( a+ " is largest amongst three numbers.");
	}else{
		System.out.println( c+ " is largest amongst three numbers.");
	}} else{
		if(b>c){
			System.out.println( b + " is largest amongst three numbers.");
		}else{
			System.out.println( c+ " is largest amongst three numbers.");
		}
	}
	}
}
