import java.util.Scanner;
class DocumentationPrinter2 {
 public static void main (String args[]) {
 Scanner scanner = new Scanner(System.in);
 boolean meep = false;
  while (scanner.hasNextLine()) {
    	String line = scanner.nextLine();
    	String beg = line.substring(0,2);
    	if (beg.equals("//") || beg.equals("*/") || meep) {
    		System.out.println(line);
    	}
        if (beg.equals("/*")) {
           System.out.println(line);
           meep = true;
         }
    	if(line.substring(line.length() - 2, line.length()).equals("*/")) { 
    		meep = false; 
    	}
    }
    System.out.println("");
  }

 }


