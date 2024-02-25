import java.util.*;
class ASCIICode_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Character : ");
		char c =  sc.next().charAt(0);
		if((c >= 'A' && c<='Z') || (c >= 'a' && c <= 'z')){
			System.out.println("Entered Character is an alphabet");
			
		if(c >= 'A' && c<='Z'){
			System.out.println("Entered Character is in uppercase");
		}else{
		    System.out.println("Entered Character is in lowercase");    	
		}
	}
		else if( c>= '0' && c<='9'){
			System.out.println("Entered Character is a digit"); 
		} else{
			System.out.println("Entered Character is a Special Character");

		}
		sc.close();
	}
}