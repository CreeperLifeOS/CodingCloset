import java.util.Scanner;
public class Modulo{
	public static void main(String[] args){
		System.out.println("Below we will divide ? by ? and get a remainder of: ");
		System.out.println(1%1);
		System.out.println("We'll now divide ? by ? and get a remainder of: ");
		System.out.println(1%1);
		System.out.println("Let's try another! Dividing ? by ? gets a remainder of: ");
		System.out.println(1%1);
		System.out.println("One more before we bump it up a notch! Dividing ? by ? gets a remainder of: ");
		System.out.println(1%1);
		System.out.println(" ");
		System.out.println("Let's try something new!");
		System.out.println(" ");
		System.out.println("Now lets use the number of your choice!");

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number: ");

		if(scanner.hasNextInt()){
			int numA = scanner.nextInt();
			System.out.println("Your number is valid! Number choosen: " + numA);
		} 
		else {
			System.out.println("Invalid Input! Please enter a valid number next time.");
		}
		scanner.close();

		while(numA < 10){
			if(numA % 2 == 0){
				System.out.println("Great, there are 0 remainders left using " + numA + "!");
				break;
			}
			else{
				System.out.println("There are still remainders using " + numA + ". Lets add it by 1!");
				numA++;
			}
		}
	}

}