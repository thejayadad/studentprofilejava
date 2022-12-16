public class Student {
    String fName;
    String lName;
    String major;
    double gpa;
    int graduationYear;

    public Student(String fName, String lName, String major, double gpa, int graduationYear){
        this.fName = fName;
        this.lName = lName;
        this.major = major;
        this.gpa = gpa;
        this.graduationYear = graduationYear;


    }
    public void incrementGradYear(){
        this.graduationYear = this.graduationYear + 1;
    }
}
