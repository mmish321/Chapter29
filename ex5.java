import java.util.Scanner;
class DocumentationPrinter {
  
  public static void main (String args[]) {
   Scanner scanner = new Scanner(System.in);
    while (scanner.hasNextLine()) {
    	String line = scanner.nextLine();
    	if (line.substring(0,2).equals("//")) {
    		System.out.println(line);
    	}
    }
    System.out.println("");
  }





}