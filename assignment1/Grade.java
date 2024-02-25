import java.util.*;
class Grade{
	public static void main(String[] args) {
		
		int marks[] = new int[6];
		int total=0,avg ;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<6;i++)
		{
			System.out.println("Enter marks of subject " + (i+1) + ":");
			marks[i] = sc.nextInt();
			total = total + marks[i];
		}
		avg = total/6;
		System.out.println("The Grade of the student is : ");
		if(avg>=80){
			System.out.println(" The Grade of the student is : A");
		} else if(avg>=60 && avg<80)
        {
           System.out.print("The Grade of the student is : B");
        } 
        else if(avg>=40 && avg<60)
        {
            System.out.print("The Grade of the student is : C");
        }
        else
        {
            System.out.print("The Grade of the student is : D");
        }

	}
}