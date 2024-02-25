import java.util.*;
class ScoredDistinction{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your score : ");
		int m = sc.nextInt();
		if(m>=75){
			System.out.println("Congratulations ! You have scored a distinction.");
		}else{
			System.out.println(" You have not scored a distinction.");
		}
	}
}