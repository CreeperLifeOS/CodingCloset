public class BigNum{
    
    public static void main(String[] args){
        
        int [] numbers = {7,2,10,40,25};
        // One version of how to initialize on array called numbers of implements
        
        int [] nums = new int[5];
        nums[0] = 25;
        nums[1] = 80;
        nums[2] = 5;
        nums[3] = 240;
        nums[4] = 6;
        // Alternate way of declaring array and filling it up!
        // Both are the same array contents!! Only have different names and address is unique
        
        /*
        We will be making a section of code that compares values and finds the largest
        number in an array of ints.
        We will use loops, conditionals, and arrays to do this.
        */
       
        int max = numbers[0];
        for(int index = 0; index < numbers.length; index++){
        
            if(max < numbers[index]){
                max = numbers[index];
            }

        }

        System.out.println("The MAX integer in the first array is: " + max);

        int min = numbers[0];
        for(int index = 0; index < numbers.length; index++){

            if(min > numbers[index]){
                min = numbers[index];
            }

        }

        System.out.println("The MIN integer in the first array is: " + min);

        int maxb = nums[0];
        for(int index = 0; index < nums.length; index++){

            if(maxb < nums[index]){
                maxb = nums[index];
            }
        }

        System.out.println("The MAX integer in the second array is: " + maxb);

        int minb = nums[0];
        for(int index = 0; index < nums.length; index++){

            if(minb > nums[index]){
                minb = nums[index];
            }
        }

        System.out.println("The MIN integer in the second array is: " + minb);
    }
}