
 
class patient {
 
	String name;
	int age ;
	String illness;
	boolean cancer;
	
	//condtructor
	public patient(String name, int age ,String illness,boolean cancer) {
		this.name=name;
		this.age=age;
		this.illness=illness;
		this.cancer=cancer;
	}
	
	public void printInfo() {
		System.out.println("ασθενης:"+this.name);
		System.out.println("ηληκια:"+this.age);
		System.out.println("ασθενεια:"+this.illness);
	}
	
	
	public boolean isadult() {
		return this.age >=18;
		
	}
	
	public boolean hascancer() {
		return this.cancer;
	}
	
	//////
	public String getName() {
		return this.name;
	}
	
}
