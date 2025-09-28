import java.util.Scanner;
public class Calculator {
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        double num1, num2, result;
        char operator;
        System.out.print("Enter the first number:");
        num1 = input.nextDouble();
        System.out.print("Enter an operator (+,-,*,/,^,%):");
        operator = input.next().charAt(0);
        System.out.print("Enter the first number:");
        num2 = input.nextDouble();
        switch(operator){
            // using : and {} for multiple statements
            case '+': {result = num1+num2;
                System.out.printf("Your result: %.2f %c %.2f = %.2f \n",num1,operator,num2,result);
                break;
            }
            case '-':  {result = num1-num2;
                System.out.printf("Your result: %.2f %c %.2f = %.2f \n",num1,operator,num2,result);
                break;
            }
            case '*':  {result = num1*num2;
                System.out.printf("Your result: %.2f %c %.2f = %.2f \n",num1,operator,num2,result);
                break;
            }
            case '/':  {
                if(num2 !=0){
                    result = num1/num2;
                    System.out.printf("Your result: %.2f %c %.2f = %.2f \n",num1,operator,num2,result);
                    break;
                }else{
                    System.out.println("Invalid input, divisionByZero Error");
                    break;
                }
            }
            case '%':{
                if(num2 !=0){
                    result = num1%num2;
                    System.out.printf("Your result: %.2f %c %.2f = %.2f \n",num1,operator,num2,result);
                    break;
                }else{
                    System.out.println("Invalid input, divisionByZero Error");
                    break;
                }
            }
            case '^':{
                result = Math.pow(num1, num2);
                System.out.printf("Your result: %.2f %c %.2f = %.2f \n",num1,operator,num2,result);
            }
            default: {
                System.out.println("Invalid input for the operator");
                System.out.println("Here is a description of operators you can use:");
                System.out.println("+ : for addition");
                System.out.println("- : for subraction");
                System.out.println("* : for multiplication");
                System.out.println("/ : for division");
                System.out.println("% : for reminder ");
                System.out.println("^ : for exponetial value");
                System.out.println("You can try again with the above give operators");
            }
        }
        input.close();
    }
}
