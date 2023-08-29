public class Test{
    
    public static void main(String[] args){
        int count = 0;
        while(count < 10){
            count++;
            System.out.print(count + " ");
        }

        System.out.println(" ");
        for(int i = 0; i <= 10; i++){
            System.out.println("This will print out 10 times " + i);
        }

        int num = 0;
        do{
            System.out.println("This loop will keep going while condition is true. " + num);
            num++;
        }while(num <= 5);
    }
}