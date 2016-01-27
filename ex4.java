import java.util.Scanner;
class MicrowaveMenu{

	public static void main (String args[]) {
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter Cook time:");
	 String time =scanner.nextLine().trim();
	 if (time.length() <= 2) {
	  if(time.length() == 0) {
		System.out.println("Your time: 0:00");
	  }
	  else if (time.length() == 1) {
		System.out.println("Your time: " + "0:0" + time);
	  }
	  else if (time.length() == 2) {
		System.out.println("Your time: " + "0:" + time);
	  }

	 }
	 else {
	   if (time.length() % 2 == 0) {
			System.out.println("Your time: " + time.substring(0, time.length()/2) + ":" + time.substring(time.length()/2, time.length()));
		}
		else {
			System.out.println("Your time: " + time.substring(0, time.length()-2) + ":" + time.substring(time.length()-2, time.length()));	
		}
	 }







	}










}