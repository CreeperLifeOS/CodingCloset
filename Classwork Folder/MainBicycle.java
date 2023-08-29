public class MainBicycle{

	public static void main(String[] args){
		Bicycle A = new Bicycle(true,3,true);

            if(A.haveBrakes() == true){
                System.out.println("Bicycle has Brakes.");
            }

            for(int i = 0; i<10; i++){
                A.Pedal();
            }

            A.Brake();
            A.getSpeed();

	}
	
	

}
