public class School {

    public static void main(String[] args){
        Student studentOne = new Student("Jane", "Doe", "Computer Scient", 3.4, 2023);
        System.out.println(studentOne.fName + "graduation year is " + studentOne.graduationYear);
        studentOne.incrementGradYear();
        System.out.println("Due to schedule changes the new gradutation year is:");
        System.out.println(studentOne.graduationYear);
    }
}
