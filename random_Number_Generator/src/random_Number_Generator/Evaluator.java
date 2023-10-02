package random_Number_Generator;

import java.util.Scanner;

public class Evaluator {
	//attributes
	private int userInput,differValue,point=140;
	private boolean successValue=false; 
	
	//user input variable
	Scanner getScanner=new Scanner(System.in);
	

	//method to check value
	void checkRandom(int value) {
		System.out.println(value);
	  		for (int i = 0; i < 3; i++) 
	  		{
	  		System.out.println("-------------------------------------");
	  	  	System.out.println("Attempt:"+(i+1));
	  	  	System.out.println("Enter the Guessed Number between 1-100\n");
		  	userInput=getScanner.nextInt();
		  	differValue=value-userInput;
		  	if (userInput>=1 && userInput <=100) {
		  	  	checkNum(value);
		  	    if (successValue) {
					break;
				}
			}
		  	else {
				System.out.println("Error!!!\nEnter a valid number between 1-100.");
				point=0;
				break;
			}
	  		}
	  		displayPoints(point);
	}
	
	
	public void checkNum(int value) {
		 if (userInput==value) {
 	  		  System.out.println("<---Congratulations!,Correct answer--->");
		   successValue=true;
				
		 }
 	  	 else if(differValue >=20 ) {
 	  		  System.out.println("You are too far!");
 	  	  }
		 else {
			System.out.println("You are too close!");
		} 
		 this.point-=40;
	}
	
   public void displayPoints(int points) {
	System.out.println("Points Scored:"+points); 

}	

}
