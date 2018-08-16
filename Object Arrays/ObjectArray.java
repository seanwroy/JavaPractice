import java.util.InputMismatchException;
import java.util.Scanner;

public class ObjectArray {
    public static void main(String[] args) throws InputMismatchException, Exception {
        Scanner input = new Scanner(System.in);
        
        //Try block to catch an input mismatch and general exception
        try {
	        //Creates an array that contains total number of students
	        System.out.print("Enter number of students: ");
	        int numberOfStudents = input.nextInt();
	        int[] grades = new int[numberOfStudents];
	        
	        //Initializes array of student objects with numberOfStudents as the amount
	        Student[] students = new Student[numberOfStudents];
	        for(int i = 0; i < students.length; i++) {
	        	students[i] = new Student();
	        }
	        
	        //Sets each student object's name and grade
	        for(int i = 0; i < students.length; i++) {
	            System.out.print("Enter student #" + i + "'s name: ");
	    		String name = input.next();
	    		students[i].setName(name);
	    		System.out.print("Enter student #" + i + "'s grade: ");
	    		int grade = input.nextInt();
	    		students[i].setGrade(grade);
	        }
	
	        //Sets each student object's grade
	        for(int i = 0; i < students.length; i++) {
	        	int temp = students[i].getGrade();
	        	grades[i] = temp;
	        }
	        
	        //Sets each student object's letter grade
	        int highest = bestGrade(grades);
	        for(int i = 0; i < students.length; i++) {
	        	students[i].setLetterGrade(giveLetterGrade(grades[i], highest));
	        }
	        
	        //Prints each student's name, grade, and letter grade
	        for(int i = 0; i < students.length; i++) {
	        	System.out.println(students[i].toString());
	        }
        }catch (InputMismatchException e) {
        	System.out.println("Use characters only for names and numbers only "
        			+ "for grades.");
        }catch (Exception e) {
        	System.out.println("Error. Please try again.");
        }
        
        input.close();
    }
    
    //Assigns letter grade depending on how much less grade is than highest grade
    public static char giveLetterGrade(int grade, int highestGrade) {
        if (grade >= highestGrade - 10)
            return 'A';
        else if (grade >= highestGrade - 20)
            return 'B';
        else if (grade >= highestGrade - 30)
            return 'C';
        else if (grade >= highestGrade - 40)
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
}
