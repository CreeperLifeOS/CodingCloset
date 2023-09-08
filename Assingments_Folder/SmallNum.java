import java.util.Scanner;
public class SmallNum{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); // Makes a new class for user input
        System.out.print("Please enter an amount of pepperoni: ");

        int pep; // Declaring the variable before user input
        if(scanner.hasNextInt()){
            pep = scanner.nextInt(); // Allows user to input an integer
            System.out.println("Your amount of pepperoni shall be taken into consideration! Thank you!");
        } else {
            System.out.println("Sorry, your input is invalid, please try again!");
            return;
        }
        
        scanner.close();
        System.out.println(" ");

        int[] num = {68,45,90,54,21,30,pep};
        
        int min = num[0];
        for(int index = 0; index < num.length; index++){
            if(min > num[index]){
                min = num[index];
                System.out.println("The new minimum amount of pepperoni is " + min + " pepperoni!");
                System.out.println(" ");
            } else {
                System.out.println("The minimum pepperoni considered (" + num[index] + ") could not be accepted!");
                System.out.println(" ");
            }
        }
    System.out.println("The minimum amount of pepperoni allowed on pizza is " + min + " pepperoni!");
    System.out.println("I hope that's at least enough pepperoni on pizza!");

    }
}