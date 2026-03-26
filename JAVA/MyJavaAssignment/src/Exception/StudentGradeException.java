package Exception;

class InvalidMarksException extends Exception {
    InvalidMarksException(String msg) {
        super(msg);
    }
}

class NullNameException extends Exception {
    NullNameException(String msg) {
        super(msg);
    }
}

public class StudentGradeException {
    public static void main(String[] args) {

        String name = null;   
        int marks = 105;     

        try {
            if (name == null) {
                throw new NullNameException("Student name cannot be null");
            }

            if (marks < 0 || marks > 100) {
                throw new InvalidMarksException("Marks should be between 0 and 100");
            }

            System.out.println("Valid student data. Grade assigned.");

        } catch (NullNameException | InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Process Completed");
        }
    }
}