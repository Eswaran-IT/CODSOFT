package random_Number_Generator;

import java.util.Random;

public class Generator {
	//attributes
   private int randomNumber;
   Random createRandom=new Random();
   
   //Object creation to evaluate
   Evaluator evalveEvaluator = new Evaluator();
   
	//Method to generate random number
	public void randomNum() {
		randomNumber=createRandom.nextInt(1,100);
		System.out.println("-------------------------------------");
		System.out.println("<------Let's Begin the Game------>");
		System.out.println("Random Number Generated!");
		evalveEvaluator.checkRandom(randomNumber);
		System.out.println("-------------------------------------");
	}

}
