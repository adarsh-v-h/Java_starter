import java.util.Scanner;
public class Fourth {
    public static void main(String[] agrs){
        /*Syntax: 
         variable = (condition) ? ifTrue: ifFalse
         */
        int score = 70;
        String report = (score >= 45)? "pass" : "fail";
        System.out.printf("Reprort: %s\n",report);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        String state = (number%2 == 0)? "even": "odd";
        System.out.printf("The %d is %s\n", number, state);
        int hours = 13;
        String clock = (hours >=12) ? "PM": "AM";
        System.out.printf("time is %d%s\n", hours, clock);
        int income = 10000000;
        double taxRate = (income > 1200000)? 5.0 : 0;
        System.out.printf("your tax rate is: %.2f \n", taxRate);

        double temp, newTemp;
        String unit;
        System.out.print("convert to Celsius or Fahrenheit (C or F):");
        unit = scanner.next().toUpperCase();
        scanner.nextLine();
        System.out.print("Enter the value in Fahrenheit: ");
        temp = scanner.nextDouble();
        newTemp = (unit.equals("C"))? (temp-32)*5/9 : (temp*5/9)+32;
        System.out.println(newTemp+ "'" + unit);
        scanner.close();   
    }
}
