import java.util.Scanner;

class TitleApplier {

 public static void main (String args[]) {
 Scanner sc = new Scanner(System.in);
 String[] femalenames = { "Amy", "Buffy" , "Cathy"};
 String[] malenames = {"Elroy", "Fred", "Graham"};
 
 System.out.println("Please Enter your name");
 String name = sc.nextLine().trim();
 int namelength = name.length();
 if (name.equals("")) {
 	System.exit(0);
 }
 
  while(namelength > 0) {
    for(int i = 0; i < femalenames.length; i++) {
    	if (name.equals(femalenames[i])) {
    		name = "Mrs." + name;
    	}
    }
    for(int i = 0; i < malenames.length; i++) {
    	if (name.equals(malenames[i])) {
       name = "Mr." + name;
    	}
    }
   System.out.println(name);
   main(args);
  }

 }

}