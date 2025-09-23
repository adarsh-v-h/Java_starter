import java.util.Random; // so Random is a class from java.util package 
import java.util.Scanner;;
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
        
    }   
}
