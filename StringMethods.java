import java.util.Scanner;
public class StringMethods {
    public static void main(String[] args){
        String name = " Adarsh V H ";
        int length = name.length(); // returns lenght of type int
        char letter = name.charAt(0); // like indexing, returns first letter from name
        int index = name.indexOf(" "); // take a char and returns it location in string value, its first occurance
        int last_index = name.lastIndexOf("o");// same as indexOf but give the last occurance

        name = name.toUpperCase(); // everything goes to upper case
        name = name.toLowerCase(); // everything to lower
        name = name.trim(); // remove the spaces at the beginning or at the end
        name = name.replace("a", "x"); // replaces a with x
        boolean isIt = name.isEmpty(); // return true if empty, return type is boolean
        if (isIt){
            System.out.println("Is not empty..");
        }
        boolean spaces = name.contains(" "); // if it contains a given string, in this case space " "
        boolean same = name.equals("Adarh V H"); //retuns true if equal, return type is boolean
        boolean sameNoCase = name.equalsIgnoreCase("adarsh v h"); // same as equals but not case sensitive
        
        Scanner scanner = new Scanner(System.in);
        String email;
        // String email = "adarshvh@gmail.com";
        System.out.print("Enter your email: ");
        email =  scanner.nextLine();
        if(email.contains("@")){
            String username = email.substring(0, 8); // 8 is exclusive
            String domain = email.substring(email.indexOf("@"));
            username = email.substring(0, email.indexOf("@")); // returns the index of @, then its taken as last_index of substring 
            System.out.printf("email: %s \n", email);
            System.out.printf("username: %s \n",username);
            System.out.printf("Domain: %s \n", domain);
        }else{
            System.out.println("The email should contain @ character..");
        }
        scanner.close();
    }
}
