public class School15{
    
    public static void main(String[] args) {
        System.out.println("Let's begin checking quiz answers");
        System.out.println("Let's look at question 1 and some examples");
        System.out.println();
        System.out.println("goToSchool(true,false) " + "Should be true. Actual: " + goToSchool(true,false));
        System.out.println("goToSchool(false,false) " + "Should be false. Actual: " + goToSchool(false,false));
        System.out.println("goToSchool(false,true) " + "Should be false. Actual: " + goToSchool(false, true));
        System.out.println("goToSchool(true,true) " + "Should be false. Actual: " + goToSchool(true, true));
        System.out.println();
        System.out.println("Now let's move on to question 2:"); 
        System.out.println("makes15(9,6) " + "Should be true. Actual: " + makes15(9,6));
        System.out.println("makes15(3,15) " + "Should be true. Actual: " + makes15(3,15));
        System.out.println("makes15(2,6) " + "Should be false. Actual: " + makes15(2,6));
        System.out.println("makes15(15,7) " + "Should be true. Actual: " + makes15(15, 7));
        System.out.println("makes15(7,8) " + "Should be true. Actual: " + makes15(7, 8));
        System.out.println("makes15(12,1) " + "Should be false. Actual: " + makes15(12, 1));
        System.out.println("makes15(0,0) " + "Should be false. Actual: " + makes15(0, 0));
        
    }

    public static boolean goToSchool(boolean weekday, boolean vacation){

        if(weekday && vacation){
            return false;
        }
        if(vacation){
            return false;
        }
        if(weekday){
            return true;
        }

        return false;
    }

    public static boolean makes15(int a, int b){

        int c = a + b;

        if(a == 15 || b == 15 || c == 15){
            return true;
        }

        return false;
    }
}