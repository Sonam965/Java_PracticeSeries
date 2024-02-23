import java.util.*;
class BasicCalci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two values ");
		while(true){
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("1: Addition");
		System.out.println("2: Subtraction");
		System.out.println("3: Multiplcation");
		System.out.println("4: Division");
		System.out.println("5: Exit");
		System.out.println("Select any choice");
		int n = sc.nextInt();
		switch(n){
		case 1: 
			System.out.println("Addition is = " + (a + b));
			break;

        case 2:
			System.out.println("Subtraction is = " + (a - b));
			break;

        case 3:
			System.out.println("Multiplication is = " + (a*b));
			break;

		case 4:
			
			 if (b != 0) {
                    System.out.println("Division is = " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
			break;

		case 5 : System.exit(0);
		
	    default:
	    	System.out.println("Enter a valid input !!");

	}
}
}
}