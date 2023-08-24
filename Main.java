public class Main{

	public static void main(String[] args){
//		Trapezoid A = new Trapezoid(7,2,8);
//		A.printArea();

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
