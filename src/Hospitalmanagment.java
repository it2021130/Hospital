import java.util.ArrayList;
//export file
import java.io.FileWriter;//eggrafh dedomenvn se eksoeriko arxeio 
import java.io.IOException;//για περιπτωσεις σφαλματων σηνδεσεις με εξωτερικο αρχειο
import java.util.Scanner;


public class Hospitalmanagment {

	public static void saveAssigmentsToFile(ArrayList<patient> patients, Doctor dr3, Doctor dr2, Doctor dr1) {
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
	
	
	public static void additionToFile(ArrayList<patient> patients, ArrayList<Doctor> doctors) {
	    try {
	        FileWriter writer = new FileWriter("assigments.txt", true); // true σημαίνει append
	        for (Doctor doc : doctors) {
	            for (patient p : doc.getPatients()) {
	                writer.write(doc.getName() + " ( " + doc.getSpeciality() + " ) -> " + p.getName() + "\n");
	            }
	        }
	        writer.close();
	        System.out.println("Επιτυχής προσθήκη στο αρχείο.");
	    } catch (IOException e) {
	        System.out.println("Προέκυψε σφάλμα κατά την αποθήκευση στο εξωτερικό αρχείο.");
	    }
	}
	
	
	

public static void doctorAddition(ArrayList<Doctor> doctors) {
    try {Scanner sc = new Scanner(System.in);
    System.out.print("Εισάγετε όνομα νέου ιατρού: ");
    String name = sc.nextLine();
    System.out.print("Εισάγετε ειδικότητα: ");
    String specialty = sc.nextLine();
    
    Doctor newDoctor = new Doctor(name, specialty);
    doctors.add(newDoctor);
    System.out.println("Ο γιατρός προστέθηκε επιτυχώς.");
    } catch (Exception e) {
        System.out.println("Προέκυψε σφάλμα κατά την αποθήκευση στο εξωτερικό αρχείο.");
    }
    }


public static void deletePatient(ArrayList<patient> patients, ArrayList<Doctor> doctors) {
    try {Scanner sc = new Scanner(System.in);
    System.out.print("Εισάγετε το όνομα του ασθενούς που θέλετε να διαγράψετε: ");
    String nameToDelete = sc.nextLine();

    boolean found = false;
    for (int i = 0; i < patients.size(); i++) {
        if (patients.get(i).getName().equalsIgnoreCase(nameToDelete.trim())) {
            patient toRemove = patients.get(i);
            patients.remove(i);
            for (Doctor d : doctors) {
                d.getPatients().remove(toRemove);
            }
            System.out.println("Ο ασθενής διαγράφηκε επιτυχώς.");
            found = true;
            break;
        }
    }
    if (!found) {
        System.out.println("Δεν βρέθηκε ασθενής με αυτό το όνομα.");
        }
    } catch (Exception e) {
        System.out.println("Προέκυψε σφάλμα κατά την αποθήκευση στο εξωτερικό αρχείο.");
    }
}

public static void displayPatients(ArrayList<patient> patients) {
    System.out.println("--- Λίστα Ασθενών ---");
    try {
        for (patient p : patients) {
            System.out.println(
                "Όνομα: " + p.getName() +
                ", Ηλικία: " + p.getAge() +
                ", Ασθένεια: " + p.getIllness() +
                ", Καρκίνος: " + (p.hascancer() ? "Ναι" : "Όχι")
            );
        }
    } catch (Exception e) {
        System.out.println("Προέκυψε σφάλμα κατά την εμφάνιση της λίστας ασθενών.");
        e.printStackTrace(); // προαιρετικό για debugging
    }
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
		
		
		Scanner sc = new Scanner(System.in);
		int choice;

		do {
		    System.out.println("---- μενου επιλογων ----");
		    System.out.println("1. αποθηκευση σε αρχειο");
		    System.out.println("2. προσθηκη σε αρχειο");
		    System.out.println("3. προσθηκη νεου ιατρου");
		    System.out.println("4. διαγραφη ασθενους");
		    System.out.println("5. εμφανιση ασθενων");
		    System.out.println("6. εξοδος απο το μενου");

		    choice = sc.nextInt();

		    switch (choice) {
		        case 1:
		            saveAssigmentsToFile(allpatients, dr1, dr2, dr3);
		            break;
		        case 2:
		            additionToFile(allpatients, alldoctor);
		            break;
		        case 3:
		            doctorAddition(alldoctor);
		            break;
		        case 4:
		            deletePatient(allpatients, alldoctor);
		            break;
		        case 5:
		            displayPatients(allpatients);
		            break;
		        case 6:
		            System.out.println("Εξοδος απο το μενου.");
		            break;
		        default:
		            System.out.println("Μη έγκυρη επιλογή. Προσπαθησε ξανα.");
		    }

		} while (choice != 6);

	
  }
}


/*ektyposi litvn asuenon ana giatro 
		dr1.displaypatient();
		System.out.println();
		dr2.displaypatient();
		System.out.println();
		dr3.displaypatient();
		*/
		