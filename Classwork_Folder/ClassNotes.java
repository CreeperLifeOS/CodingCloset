public class ClassNotes{

    public static void main(String[] args){

        int finalcount = 0;
        int count = 0;

        for(int x = 1; x < 10; x++){
            count = x * x;
            System.out.println("count is now: " + count);
            finalcount = finalcount + count;
            System.out.println("finalcount is now: " + finalcount);
        }

        System.out.println("finalcount is equal to " + finalcount);
    }
}