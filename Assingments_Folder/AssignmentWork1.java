/* Make a variable of integer type and have the value change
and print corresponding statements where you change the value 4 times and print out
changes when the conditional is true
*/

public class AssignmentWork1{

    public static void main(String[] args){
        int value = 0;
        value = 1;

        if(value == 1){
	        System.out.println("The pizza has " + value + " pepperoni, could you add a bit more?");

        }

        value++;

        if(value == 2){
            System.out.println("The pizza has changed! It currently has " + value + " pepperoni! We're making progress, just add a little more!");
        }

        value--;

        if(value == 1){
            System.out.println("The pizza has reverted to having " + value + " pepperoni... T-T Back to square one...");
        }

        value = value + 2728;

        if(value == 2729){
            System.out.println("WHAT THE ACTUAL PIZZA!? WHY IS THERE " + value + " PEPPERONI ON THE PIZZA!?!?!?");
        }

    }
}