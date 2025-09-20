import java.util.Scanner;
// Password gen
public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int birthYear = 0, favNum = 0, choice = 0;
		String petName = "", birthPlace = "", passWord = "";
		System.out.print("Enter you birth place: ");
		birthPlace = scanner.nextLine();
		System.out.print("Enter your pet name: ");
		petName = scanner.nextLine();
		System.out.print("Enter your fav number: ");
		boolean valid = false;
		while (!valid){
			if(scanner.hasNextInt()){
				favNum = scanner.nextInt();
				scanner.nextLine();
				valid = true;
			}else{
				System.out.println("you df, i said fav Number");
				System.out.print("Enter your fav number: ");
				scanner.next(); 
			}
		}
		valid = false;
		System.out.print("Enter your year of birth: ");
		while(!valid) {
			if(scanner.hasNextInt()){
				birthYear = scanner.nextInt();
				scanner.nextLine();
				if(birthYear >=1920 && birthYear < 2025){
					valid = true;
				}else{
					System.out.println("proper year of birth please");
					System.out.print("Enter your year of birth: ");
				}
			}else{
				System.out.println("year is a digit...");
				System.out.print("Enter your year pf birth: ");
				scanner.next();
			}
		}
		System.out.println("Here are your combinations: ");
		System.out.println("1. "+petName+favNum+birthPlace+birthYear);
		System.out.println("2. "+favNum+petName+birthYear+birthPlace);
		System.out.println("3. "+birthYear+birthPlace+petName+favNum);
		System.out.println("4. "+birthPlace+favNum+petName+birthYear);
		// note: we cant let 2 ints together with parantesis or else they will add themselves into
		valid = false;
		System.out.print("Enter your choice of password(1-4): ");
		while(!valid){
			if(scanner.hasNextInt()){
				choice= scanner.nextInt();
				scanner.nextLine();
				if(choice == 1){
					passWord = petName+favNum+birthPlace+birthYear;
					valid = true;
				}else if(choice == 2){
					passWord = favNum+petName+birthYear+birthPlace;
					valid = true;
				} else if(choice == 3){
					passWord = birthYear+birthPlace+petName+favNum;
					valid = true;
				} else if(choice == 4){
					passWord = birthPlace+favNum+petName+birthYear;
					valid = true;
				}
				else{
					System.out.println("proper choice (1-4) please");
					System.out.print("Enter your choice number: ");
				}
			}else{
				System.out.println("year is a digit...");
				System.out.print("Enter your choice number: ");
			}
		}System.out.println("Your password is: "+passWord);
		scanner.close();
	}
}