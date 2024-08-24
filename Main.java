import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        int[] marks = new int[5];
        System.out.println("Enter The Obtained Marks In Math Physics Chemistry Biology English ");
        for (int i = 0; i < 5; i++) {
            marks[i] = o.nextInt();
        }
        o.close();
        int totalMarks = 0;
        for (int i = 0; i < 5; i++) {
            totalMarks += marks[i];
        }
        double avgMarks = ((double) totalMarks / 500) * 100;
        System.out.println("Marks: "+Arrays.toString(marks));
        System.out.println("SCORE: "+avgMarks+"%");
        String grade;
        if(avgMarks>90)
            grade="A1";
        else if(avgMarks>80)
                grade="A2";
        else if(avgMarks>70)
            grade="B1";
        else if(avgMarks>60)
            grade="B2";
        else if(avgMarks>50)
            grade="C1";
        else if(avgMarks>40)
            grade="C2";
        else if(avgMarks>33)
            grade="D";
        else if(avgMarks>20)
            grade="E1";
        else
            grade="E2";
        System.out.println("GRADE: "+grade);
        if(avgMarks>33)
            System.out.println("RESULT: PASS");
        else
            System.out.println("RESULT: FAIL");
    }
    

}