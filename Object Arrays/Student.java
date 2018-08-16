
package Arrays;

public class Student {
    
    private String name;
    private int grade;
    private char letterGrade;

    public Student() {
    }

    public Student(String name, int grade, char letterGrade) {
        this.name = name;
        this.grade = grade;
        this.letterGrade = letterGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(char letterGrade) {
        this.letterGrade = letterGrade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
    	return getName() + "'s grade is " + getGrade() + 
        		" and their letter grade is " + getLetterGrade() + "\n";
    }
}
