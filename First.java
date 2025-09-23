import java.util.Scanner; // to get the user input, Scanner is a class 

public class First{ // this is a whole class, and the main below it is a method of it.
	public static void main(String[] args){ // this is where the JVM starts its execution
		// We write main(String[] args) to tell the JVM where to start form, cause thats what the jVM is looking for..
	System.out.println("Hello, monkey");
	Scanner scanner = new Scanner(System.in); // here we are creating an object of the class,
	System.out.print("Enter your first name: ");
	String firstName = scanner.next(); // this read only first word
	scanner.nextLine(); // the problem is the left over buffer from the next(), like it reads first word if there is any other word and the next line 
	// this eats up those useless stuff and makes next inputs cleaner..
	System.out.print("Enter you last name: ");
	String lastName = scanner.nextLine(); // use newLine to read the entire input of the users with spaces 
	
	System.out.print("Enter your age: ");
	int age = scanner.nextInt(); // this take input of an integer
	
	System.out.print("What is your gpq: ");
	double gpa = scanner.nextDouble(); // nextDouble() method to take input of double
	
	System.out.print("Are you male? (true/false): ");
	boolean isMale = scanner.nextBoolean();
	
	System.out.print("Are you intersted in coding? (y/n)");
	char interest = scanner.next().charAt(0); // this only takes the first charcter of any entered string formate
	scanner.nextLine();// to clear the buffer
	 
	System.out.println("name: " + firstName + " " + lastName);
	System.out.println("your age: " + age);
	System.out.println("Your gpa: " + gpa);
	if (isMale){
		System.out.println("NICE...");
	}
	else{
		System.out.println("GREATT....");
	}
	if (interest == 'y' || interest == 'Y'){
		System.out.println("Welcome to the community");
	}
	else{
		System.out.println("boring....");
	}
	// there is problem that happens when we use nextInt or nextDouble and then a string type with next or nextline, 
	// i.e is again the buffer overflow problem, here is how it looks
	System.out.print("enter a number: ");
	int num = scanner.nextInt();
	scanner.nextLine();
	System.out.print("Enter a string: ");
	String test = scanner.nextLine();
	System.out.println("your string "+ test + " and num "+ num);
	/*output without buffer clearing: 
	enter a number: 1
	Enter a string: your string  and num 1

	output with buffer control: 
	enter a number: 12
	Enter a string: adarsh
	your string adarsh and num 12
	*/
	scanner.close(); // close the scanner, frees resources
	}
}