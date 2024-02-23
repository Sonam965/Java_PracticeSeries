import java.util.*;
class Week{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weekdays ");
		String days = sc.next().toLowerCase();
		if(days.equals("sunday") || days.equals("saturday")){
			System.out.println("Print WeekEnds");
		} else {
			System.out.println("Print WeekDays");

		}
	}
}