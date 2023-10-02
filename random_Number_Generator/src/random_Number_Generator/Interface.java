package random_Number_Generator;

public class Interface {

	public static void main(String[] args) {
		System.out.println("<------Random_Number_Generator------>");
		System.out.println("Rules:\n1.ATTEMPTS->3"
				+ "\n2.POINTS:\nFirst_attempt-100 points\nSecond_attempt-60 points\nThird_attempt-20 points");
		Generator objectGenerator=new Generator();
		objectGenerator.randomNum();
		System.out.println("Sucessfully completed!!!");
	}

}
