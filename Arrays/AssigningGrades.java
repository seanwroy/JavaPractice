package Arrays;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Creates an array that contains total number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();
        int[] grades = new int[numberOfStudents];

        //Stores grades for each array index depending on the # of students
        System.out.print("Enter " + numberOfStudents + " scores: ");
        for(int i = 0; i < numberOfStudents; i++) {
        		grades[i] = input.nextInt();
        }
        
        showGrades(grades);
        
        input.close();
    }
    
    //Assigns letter grade depending on how much less grade is than highest grade
    public static char giveLetterGrade(int grade, int highestGrade) {

        if (highestGrade - grade <= 10)
            return 'A';
        else if (highestGrade - grade <= 20)
            return 'B';
        else if (highestGrade - grade <= 30)
            return 'C';
        else if (highestGrade - grade <= 20)
            return 'D';
        else 
            return 'F';
    }
    
    //Takes in grades array and returns highest value
    public static int bestGrade(int[] grades) {
        int highest = grades[0];

        for (int grade : grades) {
            if (grade > highest)
                highest = grade;
        }

        return highest;
    }
    
    //Takes in grades array and prints out each student's number, grade, and letter grade
    public static void showGrades(int[] grades) {
        int highest = bestGrade(grades);
        
        for (int i = 0; i < grades.length; i++) {
            System.out.printf("Student " + i + "'s grade is " + grades[i] + 
            		" and their letter grade is " + giveLetterGrade(grades[i], highest) + "\n");
        }
    }
}
