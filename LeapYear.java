import java.util.Scanner;
class LeapYear{
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter year");
		int year = sc.nextInt();
		if ( year == 0 || year <0){
			System.out.println("Enter a valid year")
		}
		if (year % 100!=0){
			if (year%4 ==0){
				System.out.println("Leap Year");
			}
			else {
				System.out.println(" Not Leap Year");

			} }else {
				if (year% 400 ==0){
					System.out.println(" Century Leap Year");
				
			}
				else{
					System.out.println(" Not Century Leap Year");
				
			}	
		}
	}
}