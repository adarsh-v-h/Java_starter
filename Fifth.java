import java.util.Scanner;
public class Fifth {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the day: ");
        String day = input.next().toLowerCase();
        input.nextLine();
        switch(day){
            case "monday" -> System.out.print("Its the beginning of the week");
            // if we have same output for any input case, we write all of them in single case by separating them with commas
            case "tuesday", "wednesday", "thursday" -> System.out.print("It is a week day");
            // case "wednesday" -> System.out.print("It is a week day");
            // case "thursday" -> System.out.print("It is a week day");
            case "friday" -> System.out.print("Closer to weekend");
            case "saturday", "sunday" -> System.out.print("Its weekend");
            // case "sundaty" -> System.out.print("Its weekend"); //same here
            default -> System.out.printf("%s is not a day", day);
        }
        input.close();
    }
}
