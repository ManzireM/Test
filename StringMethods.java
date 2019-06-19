package day16_StringMethod;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Create String variable garage and assign Toyota, Nissan, Honda, BMW, Mazerati, Ford"
		
		String garrage="Toyota, Nissan, Honda, BMW, Mazerati, Ford";
		
//convert whole garage in to lowercase letters
		
	garrage=garrage.toLowerCase();
System.out.println(garrage);
	
//if the garage is empty print "no cars in garage'
	
if(garrage.isEmpty()) {
	System.out.println("no cars in garage");

}if(garrage.contains("toyota") || garrage.contains("nissan")) {
	
System.out.println("There is a Japanese car in the garrage");
}else {
	System.out.println("No Japanesse cars");
	if(garrage.contains("bmw")) {
		System.out.println("there is a german car in garage");
	}else {
		System.out.println("no german cars");
	}if(garrage.contains("Mazerati")) {
		System.out.println("there is an italian car in garage");
	}else {
		System.out.println("no italian cars");
	}

	
	
	
	
	
	
	
	}
}
	}

