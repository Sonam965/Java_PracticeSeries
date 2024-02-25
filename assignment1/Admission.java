import java.util.*;
class Admission{
	public static void main(String[] args) {
		int marks[] = new int[6];
	Scanner sc = new Scanner(System.in);
	int total =0;
	for(int i=1;i<6; i++){
		System.out.print ("Enter marks of subject" +i+":"   );
		marks[i]=sc.nextInt();
		total = total + marks[i];	
	}
	int per = (total * 100)/500;
	System.out.print("Enter your gender (m/f) :");
	char gender = sc.next().charAt(0);

	if(per>=60 & gender =='m'){
		System.out.println("You are eligible for Admission !");	
	} else if(per >80 && gender=='f'){
		System.out.println("You are eligible for Admission.");

	}else{
		System.out.println("You are not eligible for Admission !");	
	}}}