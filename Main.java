public class Main{ //---- so we have to keep the java file name same as the public class name, and its good to keep the first word capital to avoid warnings
   public static void main(String[] args){  //---- this will create a file main.class
      System.out.print("Hey man, "); //---- print to print anything on the display, 
      System.out.println("nice to meet you"); // println same as print but will add a new line.
      System.out.print("bye bye \n"); // or use /n escape character to move to new line
      /* in java we have variables of 2 types
      1. primitive:  simple values stored directly in memory(stack), int, double, char, boolean
      2. Referbce: memory address is stored in stack that points to a location on heap, string, array, object
      */ 
      int age; // declaration of variable..
      age = 20; // assignment,
      System.out.println(age); // will print 19
      int year = 2025; // dec and assign in same statement
      System.out.println(year);
      System.out.println("This year is " + year); // sting with a varaiable, use the + to combine them..
      double weight = 95.6;
      System.out.println("I weigh " + weight);
      // int age = 19.5 will give an error, but 
      double game = 19; // this wont, it will just convert it to double format
      System.out.println(game); // output: 19.0

      char grade = 'A'; // single quotes
      char symbol = '$';
      System.out.println(grade);
      System.out.println("out currency " + symbol);

      boolean isStudent = true;
      boolean isOnline = false;
      System.out.println(isOnline);
      // booleans are most used with control flow statements
      if(isStudent){
         System.out.println("you are a student");
      }
      else{
         System.out.println("you are not a student");
      }

      String name = "Adarsh"; // double quotes
      System.out.println("Heloo, "+ name);
      System.out.println("i am " + name + " and i am " + age + " years old"); //output: i am Adarsh and i am 20 years old
      System.out.println(name + age); // output: Adarsh20
      String age1 = "19";
      // if(age1 == age){ //you will get an error, saying you are trying to compare different data types, not false but error
      //    System.out.println("weird language");
      // }
      // else{
      //    System.out.println("nice lang");
      // }
      if(isOnline){
         System.out.println("The person is online");
      }
      else{
         System.out.println("They are offline");
      }
      }
}
