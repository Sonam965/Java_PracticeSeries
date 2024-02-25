import java.util.*;
class VowelOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Character to check whether its vowel or not");
		char alpha = sc.next().charAt(0);
		alpha = Character.toLowerCase(alpha); //converts char to lowercase
		if(alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u' ){
			System.out.println("It is a Vowel ");
		} else{
			System.out.println("It is a Consonant");
		}}}