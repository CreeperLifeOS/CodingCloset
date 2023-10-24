public class SubTest{
    public boolean posNeg(int a, int b, boolean negative){
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