package day30exceptionsinterface;

public class CustomExceptions01 {
    public static void main(String[] args) {
    getStudentGrade(87);
    getTheNumberOfStudents(-45);

    }
    public static void getStudentGrade(int grade){

        if (grade<0 || grade>100){
            try {
                throw new InvalidStudentGradeExceptions("Student's grades cannot be less than 0 greater than 100");
            } catch (InvalidStudentGradeExceptions e) {
                e.printStackTrace();
            }
        }else
            System.out.println(grade);
    }
    public static void getTheNumberOfStudents(int numOfStudents){
        if (numOfStudents<0){
            try {
                throw new InvalidNumberExceptions("Student number cannot be negative");
            }catch (InvalidNumberExceptions e){
                System.err.println(e.getMessage());
            }
            }else
            System.out.println(numOfStudents);
    }
}
