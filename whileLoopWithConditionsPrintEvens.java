package day16_StringMethod;

public class whileLoopWithConditionsPrintEvens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * using if conditon within while loop
 * start varible number with 1
 * and loop untill 100
 * check if number is even
 * if it is even print the number 
 * 
 */
	// so first i need to initailitze my stariting point so the starting number is 1
	//therefore int i=1;
	//i will give my condition under while loop -----as ---->while(num<=100)
	//if i only want to print our even numbers i can make conditonal statment under while loop
    //then print out the numbers
	//i need to give increamt to my num after out of loop to make it fase so my loop will stop printing
		
	int num=1;
	while(num<=100) {
		if(num%2==0) {
			System.out.println(num);
			
		}
		num++;
	}
		
		
		
		
	}

}
