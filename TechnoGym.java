public class TechnoGym{


	public static void main (String[] Args){

		CloneFactory equipmentMaker = new CloneFactory();

		Treadmill treadmill = new Treadmill();

		Treadmill clonedTreadmill = (Treadmill) equipmentMaker.getClone(treadmill);

		System.out.println(treadmill);
		System.out.println(clonedTreadmill);

	
  	System.out.println("treadmill HashCode: " + System.identityHashCode(System.identityHashCode(treadmill)));   
    
    System.out.println("clonedTreadMill HashCode: " + System.identityHashCode(System.identityHashCode(clonedTreadmill)));
    

	}


}