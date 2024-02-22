class Admission {
	public static void main ( String[] args){
		int p1 = 60, p2= 65, p3 = 70;
		char gender = 'f';
		int total = p1 + p2 + p3;
		int per = (total * 100) /300 ;
		if ( per >= 62 && gender =='m' ){
			System.out.println("Can take Admission");
		}
		else {
			System.out.println("Can not take admission");
		}
	}
}