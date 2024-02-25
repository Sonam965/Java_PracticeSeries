import java.util.*;
class Largest{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter any three number to check the amongst three numbers : ");
System.out.println("Enter 1st Number : ");
int a = sc.nextInt();
System.out.println("Enter 2nd Number : ");
int b = sc.nextInt();
System.out.println("Enter 3rd Number : ");
int c = sc.nextInt();
if ((a > b ) && (a >c)){
	System.out.println("First number is largest amongst three numbers .");
} else if(b>c){
	System.out.println("Second number is largest amongst three numbers .");
} else{
	System.out.println("Third number is largest amongst three numbers .");
}
}
}
