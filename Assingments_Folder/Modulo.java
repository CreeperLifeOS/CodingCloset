import java.util.Scanner;
public class Modulo{
	public static void main(String[] args){
		System.out.println("Below we will divide 6 by 4 and get a remainder of: ");
		System.out.println(6%4);
		System.out.println("We'll now divide 35 by 8 and get a remainder of: ");
		System.out.println(35%8);
		System.out.println("Let's try another! Dividing 60 by 6 gets a remainder of: ");
		System.out.println(60%6);
		System.out.println("One more before we bump it up a notch! Dividing 127 by 3 gets a remainder of: ");
		System.out.println(127%3);
		System.out.println(" ");
		System.out.println("Let's try something new!");
		System.out.println(" ");
		System.out.println("Now lets use the number of your choice!");

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number: ");

		int numA;
		if(scanner.hasNextInt()){
			numA = scanner.nextInt();
			System.out.println("Your number is valid! Number choosen: " + numA);
		} 
		else {
			System.out.println("Invalid Input! Please enter a valid number next time.");
			return;
		}

		System.out.print("Now enter a number to divide it with: ");
		int numB;
		if(scanner.hasNextInt()){
			numB = scanner.nextInt();
			System.out.println("Your number is valid! Number choosen: " + numB);
		} 
		else {
			System.out.println("Invalid Input! Please enter a valid number next time.");
			return;
		}
		scanner.close();

		int numC;
		while(numA < 5000){
			if(numA % numB == 0){
				System.out.println("Great, there are 0 remainders left using " + numA + "!");
				break;
			}
			else{
				numC = numA % numB;
				System.out.println("There are still " + numC + " remainders using " + numA + ". Lets add it by 1!");
				numA++;
			}
		}
	}

}