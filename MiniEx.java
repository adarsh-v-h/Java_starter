import java.util.Scanner;

// Calculate the area of a rectangle
public class MiniEx{
	public static void main(String[] args){
		double width = 0;
		double height = 0;
		double area = 0;
		boolean valid = false;
		Scanner scanner = new Scanner(System.in);
		while (!valid){
			System.out.print("Enter the width: ");
			if(scanner.hasNextDouble()){
				width = scanner.nextDouble();
				scanner.nextLine();
				if(width >= 0){
					valid = true;
				} else{
					System.out.println("Enter a non negative number....");
				}
			}else{
				System.out.println("Enter only a number... ");
				scanner.nextLine();
			}

		}
		valid = false;
		while (!valid){
			System.out.print("Enter the height: ");
			if(scanner.hasNextDouble()){
				height = scanner.nextDouble();
				scanner.nextLine();
				if(height >= 0){
					valid = true;
				}else{
					System.out.println("Enter a non negative number...");
				}
			}else{
				System.out.println("Enter only a number ");
				scanner.nextLine();
			}
		}
		area = height * width;
		System.out.println("The area is: "+area+"px sq");		
}
}