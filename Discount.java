import java.util.Scanner;
class Discount{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Cost Price");
		int costPrice = sc.nextInt();
		System.out.println("Are you a student (y/n) ? ");
		char s = sc.next().charAt(0);
		if(s == 'y'){
			if(costPrice >=500){
				int discount = (costPrice* 10)/100;
				System.out.println("Your total Discount is " + discount);
			} else{
				int d = (costPrice *5)/100;
				System.out.println("Your total Discount is " + d);
			}

		} else {
			

			if(costPrice >= 500){
				int d1= (costPrice*8)/100;         // 8 % discount is provided if the user is not student and costprice is greater than 500
				System.out.println("Your total Discount is = " + d1 );
			} else{
				int d2 = (costPrice*2)/100;

				System.out.println("Your total Discount is = " + d2 );
			}
		}
	}
}