public class Count{

	public static void main(String[] args){
		int count = 0;
		System.out.println(count);
		count++;
		System.out.println(count);
		System.out.println(++count);
		System.out.println(count--);
		System.out.println(--count);

		if(count == 0){
			System.out.println("Count is currently equal to: " + count);

		}
		
		if(count == 1){
			System.out.println("This should not get executed, bozo!");

		}
		else{
			System.out.println("This should get executed, congrats!");
		}

	}
}
