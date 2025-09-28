import java.util.Random; // so Random is a class from java.util package 
import java.util.Scanner;
public class Third {
    public static void main(String[] agrs){
        Random random = new Random(); // we are creating a new object of class Random and type Random 
        int number =  random.nextInt(1,100); // the created object random is calling the methods of its class, i.e nextInt(something range), returns in range exclusive to the second value
        System.out.println(number);
        // similar to nextInt, we have
        double number1 = random.nextDouble(); // only returns value from 0 to 1, excluding 1
        boolean cond = random.nextBoolean();
        System.out.println(number1+"  "+cond);

        //---------------------------------------------
        // we have one more class Math
        System.out.println(Math.PI); // pi value 
        System.out.println(Math.E); // e value
        double result = Math.pow(2,3); // its like 2^3
        result = Math.abs(-5); // absolute value i.e 5
        result = Math.sqrt(9); // returns sqaure root
        result = Math.round(9.999); // rounds to closes integer, 
        // right now the type is double so it will be 10.0
        result = Math.ceil(9.1); // its gives 10.0, next integer value
        result = Math.floor(9.99); // gives 9.0, last integer value
        result = Math.max(10.,20); // returs the maximum value, similar min for minimum
        System.out.println(result);
        //-------------------------
        //Pythogoraes theorem
        Scanner input = new Scanner(System.in);
        double a,b,c;
        System.out.print("Enter in length of sides: ");
        a = input.nextDouble();
        System.out.print("The other side: ");
        b = input.nextDouble();
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.printf("The hypotenuse: %.4f \n",c); // use printf to format output...
        //------------------------------
        // area of circle
        double radius, circumference, area;
    
        System.out.print("Enter the radius:");
        radius = input.nextDouble();
        circumference = 2*Math.PI*radius;
        area = Math.PI*Math.pow(radius, 2);
        System.out.printf("The circumfernce: %.4f squared cm \n", circumference);
        System.out.printf("The area: %.4f cubed cm \n", area);
        //--------------------------------
        // more of printf
        String name = "Adarsh";
        char letter = 'A';
        int height = 30;
        double blah = 10.0;
        boolean isGay = false;
        System.out.printf("Hello, %s\n", name);
        System.out.printf("your first letter is: %c\n", letter);
        System.out.printf("You are %d inches tall", height);
        System.out.printf("the blahs %f\n", blah);
        System.out.printf("Gay ? %b \n",isGay);
        System.out.printf("is gay ? %b and of height %d cm\n",isGay, height);// order matters

        // we can also use certian operation on these to print out a type of value
        // %[flag][width][.precision][specifier-character]
        /*Here are few flags:
         * + = output a plus if positive and - if negative
         * , = grouping stuff after every 1000's place
         * ( = negative numbers are enclosed in ()
         * space = display a minus if negative, space if positive
         */
        double price1 = -09.999;
        double price2 = 123123.23230;
        double price3 = 0.00000000001;
        // after the point we have precision, digits after the decimal point
        //
        System.out.printf("% .2f\n", price1);
        System.out.printf("% .2f\n", price2);
        System.out.printf("% .2f\n", price3);

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;
        // in width we have 2 things
        /*0= zero padding
         * number = right justified padding
         * negative number = left justified padding
         */
        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);
        input.close();
    }   
}
