

public class WSIB_week2_11 {
    public String StudentName;
    public int StudentID;
    public String StudentStatus;

    public void ProfileStudent() {
        StudentName = "Lisa Palombo";
        StudentID = 123456789;
        StudentStatus = "Active";

        System.out.println( "Student Name:" + StudentName );
        System.out.println( "Student ID: " + StudentID );
        System.out.println( "Student Status: " + StudentStatus );
    }

    public void main(String[] args) {
        ProfileStudent();
    }
}