//import java.lang.CloneNotSupportedExcepton;

public class Treadmill implements Equipment{


	public Treadmill(){
		System.out.println("Treadmill is made");
	}


	public Treadmill makeCopy(){

		System.out.println("Treadmill is being copied");

		Treadmill treadMillObject = null;

			try {

				treadMillObject = (Treadmill) super.clone();
			}
			catch (CloneNotSupportedException e){

				System.out.println("The treadmill was unable to be copied");
				e.printStackTrace();


			}
		return treadMillObject;
		
		}





	public String toString(){

		return "Treadmill Object Okay";
	}


}