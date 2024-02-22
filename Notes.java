import java.util.Scanner;
class Notes {
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Amount ");
		int note = sc.nextInt();
		System.out.println("Enter Range of note like 2000/500/200");
		int range = sc.nextInt();
		int n1 = 0;
		switch (range){
		case 2000 : 
			 n1= note/2000;
			note = note % 2000;
			System.out.println("No of 2000 note is" + n1);

			case 500 : 
		    n1= note/500;
			note = note % 500;
			System.out.println("No of 500 note is" + n1);

			case 200: 
		    n1= note/200;
			note = note % 200;
			System.out.println("No of 200 note is" + n1);

			case 100 : 
			n1= note/100;
			note = note % 100;
			System.out.println("No of 100 note is" + n1);

			case 50 : 
			n1= note/50;
			note = note % 50;
			System.out.println("No of 50 note is" + n1);

			case 20 : 
			n1= note/20;
			note = note % 20;
			System.out.println("No of 20 note is" + n1);

			case 10 : 
		    n1= note/10;
			note = note % 10;
			System.out.println("No of 10 note is" + n1);

			case 5 : 
			n1= note/5;
			note = note % 2000;
			System.out.println("No of 5 note is" + n1);

			case 2 : 
			n1= note/2;
			note = note % 2;
			System.out.println("No of 2 note is" + n1);

			case 1: 
			n1= note/1;
			note = note % 1;
			System.out.println("No of 1 note is" + n1);
			break;

			default : 
			
			System.out.println("Enter valid input");
			break;
		}

	}
}