import java.util.Scanner;
public class ConvertKgToLbs {
    // weight conversion program 
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        double weigth, newWeight;
        int choice;
        System.out.println("Weight Conversion Program");
        System.out.println("1. convert lbs to kgs");
        System.out.println("2. Convert kgs to lbs");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        if(choice == 1){
            System.out.print("Enter the weight in lbs: ");
            weigth = scanner.nextDouble();
            newWeight = weigth * 0.453592;
            System.out.printf("The old weight: %.2f lbs to new weight %.2f kg\n", weigth, newWeight);
        }else if(choice == 2){
            System.out.print("Enter the weight in kg: ");
            weigth = scanner.nextDouble();
            newWeight = weigth / 0.453592;
            System.out.printf("The old weight: %.2f kg to new weight %.2f lbs\n", weigth, newWeight);
        }else{
            System.out.println("Dumb f*** choose 1 or 2..");
        }

        scanner.close();
    }
}
