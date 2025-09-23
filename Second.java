import java.util.Scanner;
public class Second{
	public static void main(String[] args){
		// int age1 = 10;
		// int age2 = 18;
		// int age3 = -10;
		// int age4 = 111;
		// int age = age1;
		Scanner inp = new Scanner(System.in);
		// have tp declare and intialize a value to vairable in the right scope
		int age =0;
		boolean valid = false;
		String name = "";
		while(!valid){
			System.out.print("Enter you name: ");
			name = inp.nextLine();
			if(name.isEmpty()){
				System.out.println("oh So you have no name huh ?? nice try");
			}else{
				valid = true;
			}
		}
		valid = false;
		while (!valid){
			System.out.print("Enter the age: ");
			if(inp.hasNextInt()){
				age = inp.nextInt();
				inp.nextLine();
				valid = true;
			}else{
				System.out.println("age should be a number, try again...");
				inp.next(); // to consume invalid inputs
		}
	}
		System.out.println("Hello, "+name);
		if (age > 18 && age <= 100){
			System.out.println("You are adult");
		}else if(age == 18){
			System.out.println("Welcome to the real world");
		}else if (age <= 0 || age >100){
			System.out.println("Are you kidding me ??");
		}else{
			System.out.println("you are still a child ");
		}
	}
}