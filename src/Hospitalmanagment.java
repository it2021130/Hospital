import java.util.ArrayList;
//export file
import java.io.FileWriter;//eggrafh dedomenvn se eksoeriko arxeio 
import java.io.IOException;//για περιπτωσεις σφαλματων σηνδεσεις με εξωτερικο αρχειο
import java.util.Scanner;


public class Hospitalmanagment {

	public static void saveAssigmentsToFile(ArrayList<patient> patients, ArrayList<Doctor> doctor) {
		try {
			FileWriter writer = new FileWriter("assigments.txt");  //c:\\ 
		 for(patient p : patients) {
			 Doctor assignedDoctor = null;
			 if(p.isadult() && p.hascancer()) {
				 assignedDoctor =dr3;
			 }if(p.isadult() && !p.hascancer()) {
				 assignedDoctor =dr2;
			 }if(!p.isadult()) {
				 assignedDoctor =dr1;
			 }
			 writer.write(assignedDoctor.getName() +" ( " +assignedDoctor.getSpeciality()+ ") -> "+p.getName()+ "\n");
		 }	
		 writer.close();
		 System.out.println("επιτυχης αποθηκευση");
		}catch(IOException e) {
			System.out.println("ποεκυψε σφαλμα στην αποθηκευση του εξωτερηκου αρχειου");
		}
	}
	
	
	
	
	
	
	
	
public static void additionToFile(ArrayList<patient> patients,ArrayList<Doctor> doctor ) {
	try {
		FileWriter writer =new FileWriter("assigments.txt");
		//scan
		//enter to list
		//enterwriter.write());
		writer.close();
	}catch(IOException e) {
		System.out.println("ποεκυψε σφαλμα");
	}
	
	
}
	
	
public static void doctorAddition(ArrayList<Doctor> doctor) {
	
	
	
	
}
	
	
	public static void main(String[] args) {
		
		///DOCTOR
		///DOCTOR
		ArrayList<Doctor> alldoctor = new ArrayList<>();
		
		Doctor dr1 =new Doctor ("Smith","παιδιατρος");
		Doctor dr2 =new Doctor ("χρονοποθλου","παθολογος");
		Doctor dr3 = new Doctor("petropoylos","ogkologow");
		
		alldoctor.add(dr1);
		alldoctor.add(dr2);
		alldoctor.add(dr3);
		
	   ////PATIENT
	   ////PATIENT
		ArrayList<patient> allpatients = new ArrayList<>();
		
		patient p1 =new patient ("giannis",25,"gripi",false);
		patient p2 =new patient ("eleni",16,"asthma",false);
		patient p3 =new patient ("kostas",40,"diabetic",false);
		patient p4 =new patient ("maria",10,"vtitida",false);
		patient p5 =new patient ("giorgos ",8 ,"anemovlogia",false);
		patient p6 =new patient ("filipow ",45 ,"ipatitida",true);
		patient p7 =new patient ("katerina",67,"ogkow ston pnaymoa",true);
		
		allpatients.add(p1);
		allpatients.add(p2);
		allpatients.add(p3);
		allpatients.add(p4);
		allpatients.add(p5);
		allpatients.add(p6);
		allpatients.add(p7);
		
		
		//anathesi asthenon stous giatrous
	/*	dr1.addpatient(p2);
		dr1.addpatient(p4);
		dr1.addpatient(p5);
		
		dr2.addpatient(p1);
		dr2.addpatient(p3);
		
		*/
		for(patient p : allpatients) {
			if(p.isadult()) {
			   if(p.hascancer()) {
				dr3.addpatient(p);
			}else {
				dr2.addpatient(p);
			}
		dr2.addpatient(p);
			}else {
				dr1.addpatient(p);
			}
		}
		
	
		
		
////////////////////BEGINING
		/// 
		///
		///
		
		
		int choice;
		do{
			
		System.out.println("---- μενου επιλογων ----");//
		System.out.println("1.αποθηκευση σε αρχειο");//
		System.out.println("2.προσθηκη σε αρχειο");//
		System.out.println("3.προσθηκη νεου ιατρου");//
		System.out.println("4.διαγραφη ασθενους");//
		System.out.println("5.εμφανιση ασθενων");//
		System.out.println("6.εξοδος απο το μενου");
		
		Scanner sc =new Scanner(System.in);
		choice =sc.nextInt();
		
		switch(choice) {
		//"1.αποθηκευση σε αρχειο"
		case 1://
			saveAssigmentsToFile(allpatients,dr1,dr2,dr3);
		
		//"2.προσθηκη σε αρχειο"
		case 2:
			additionToFile(allpatients,alldoctor);
	                                                     //////////////////////////////
			
		//"3.προσθηκη νεου ιατρου"	
		case 3:
			doctorAddition(alldoctor);
		case 4:
		case 5:
		}	
		
		
		
		
		
		
	}while(choice != 6);

		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
  }
}


/*ektyposi litvn asuenon ana giatro 
		dr1.displaypatient();
		System.out.println();
		dr2.displaypatient();
		System.out.println();
		dr3.displaypatient();
		*/
		