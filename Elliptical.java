
public class Elliptical implements Equipment{


	int equipmentID;
	String equipmentLocation;


	public Elliptical(int id, String location){
		equipmentID = id;
		equipmentLocation = location;

		System.out.println("Elliptical is made");
	}


	public Elliptical makeCopy(){

		System.out.println("Elliptical is being copied");

		Elliptical ellipticalObject = null;

			try {

				ellipticalObject = (Elliptical) super.clone();
			}
			catch (CloneNotSupportedException e){

				System.out.println("The elliptical was unable to be copied");
				e.printStackTrace();


			}
		return ellipticalObject;
		
		}





	public String toString(){

				return "Elliptical Object Okay ID is " + equipmentID+ "location is" + equipmentLocation + "\n";
	}


}