package grade_calculator;


public class MarkCalculator {
    
    public void average(int[] marksArrayList,int g) {
        int sum = 0;
        int h=g*100;
        System.out.println("Marks are Evaluating..!!");
        for (int i = 0; i < marksArrayList.length; i++) {
            sum += marksArrayList[i];
        }
        System.out.println();
        System.out.println("Total Marks: " + sum + "/" + h);
        
        float average=(sum*100)/h;
        System.out.println("Average percentage: " + average + "%");
        String grade;

        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Grade: " + grade);
    }
}
