package grade_calculator;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	int n=0;
	Scanner  getScanner=new Scanner(System.in);
	System.out.println("Grade Calculator");
	System.out.println();
	System.out.println("Enter number of subject:");
	System.out.println();
	n=getScanner.nextInt();
	int marksArrayList[]=new int[n];
	for (int i = 0; i <n; i++) {
		System.out.println("Enter marks for subject:"+(i+1));
		marksArrayList[i]=getScanner.nextInt();
	}
	MarkCalculator objCalculator=new MarkCalculator();
	
	int size=n;
	objCalculator.average(marksArrayList,size);
	
	getScanner.close();
}

}
