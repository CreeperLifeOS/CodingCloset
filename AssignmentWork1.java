/* Make a variable of integer type and have the value change
and print corresponding statements where you change the value 4 times and print out
changes when the conditional is true
*/

public class AssignmentWork1{

    public static void main(String[] args){
        int value = 0;
        value = 1;

        if(value == 1){
	        System.out.println("The value currenlty is: " + value);

        }

        value++;

        if(value == 2){
            System.out.println("The value has changed! It currently is: " + value);
        }

        

    }
}