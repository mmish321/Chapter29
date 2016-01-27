import java.util.*;

class PasswordChecker {
 
 public static void main(String[] args) {
 	
 	Scanner scanner = new Scanner(System.in);
 	
 	System.out.println("Please enter a password:");
 	
 	String password = scanner.nextLine().trim();
 	int passwordlength = password.length();
 	

 	boolean hasUp = false;
 	boolean hasnum = false;
 	boolean haslow = false;

 	if (passwordlength >= 7) {
      for (int i = 0; i < pass.length; i++) {
      	char currChar = password.charAt(i);
        if (Character.isUpperCase(currChar)) { hasUp = true; }
	    if (Character.isLowerCase(currChar)) { haslow = true; }
        if (currChar >= '0' && currChar <= '9') {
        	hasnum = true;
        }
      }
     }
      if (haslow && hasnum && hasUp) {
      	System.out.println("That is a valid password");
      	System.exit(0);
      }
      else {
      	System.out.println("That is not a valid password");
      main(args);
       }
 	}

}














