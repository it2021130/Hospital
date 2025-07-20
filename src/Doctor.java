import java.util.ArrayList;


 class Doctor {

   String name;
   String speciality;
	ArrayList<patient> patients;//mia klash poy ilopoihh thn klash patiemce 
    
   public Doctor(String name, String speciality) {
	   this.name=name;
	   this.speciality=speciality;
	   //pow dexete thn lista 
	   this.patients = new ArrayList<>();
   }
   
   //methodos poypernei ton asuenei pou eisagei ton katalilo atheni stin lista toy giatroy
   
   public void addpatient(patient p) {
	   patients.add(p);
   }
   
   //methodos pou emfanizi touw asthenis pou exoun anatethi ston giatro
   
   public void displaypatient() {
	   System.out.println("ο γιατρος "+ name +" εχει τους ασθενεις :");
	   for(patient p : patients) {
		    p.printInfo();
		    System.out.println("--------------------------------------");
	   }
   }
   
   ///////getters
   public String getName() {
	   return this.name;
   }
   
   public String getSpeciality() {
	   return this.speciality;
   }

   public ArrayList<patient> getPatients() {
	return null;
   }
   
 
   
}
