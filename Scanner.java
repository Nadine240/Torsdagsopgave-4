import java.util.Scanner; //2.c import scanner class

//2.a create a Main class with a main method.
public class Retirement {
	public static void main (String [] args){

//2.c opret scanner objekt 
	Scanner scanner = new Scanner (System.in); 

//2.b print the message 
	System.out.println( "Please type your name"); 

//2.d  
	String name = scanner.nextLine(); 

//2.e print navnet på brugeren 
	System.out.println ("Hello " + name); 
	System.out.println ("please type your age"); 

//2.f deklerer int variable age 
	int age = scanner.nextInt(); 

//2.g print brugerens alder 
	System.out.println (" you are " + age + " years old ");

//2.h beregn år til pension  
	int Retirement = 67; 
	int yearsToPension = Retirement - age;

System.out.println(" you have " + yearsToPension + " years until retirement "); 

	}
}