public class Student extends User {

    public Student(String name, String membership) {
    } // will inherit everything from User

    public Student() {

    }

    void status() {
        System.out.println("verifying with email");
        set_status(true);
    }

}