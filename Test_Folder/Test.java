public class Test{

    public static void main(String[] args){
        

            System.out.println("posNeg is " + posNeg(1,1,true));
    }
    public static boolean posNeg(int a, int b, boolean negative){
        if(a > 0 && b < 0){
            if(negative == true){
                return false;
            }
            else{
                return true;
            }
        }
        if(a < 0 && b > 0){
            if(negative == true){
                return false;
            }
            else{
                return true;
            }
        }
        if(a < 0 && b < 0){
            if(negative == true){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
}