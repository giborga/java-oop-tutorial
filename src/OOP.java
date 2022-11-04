//https://www.youtube.com/watch?v=F16DPObd1hY&list=PL_c9BZzLwBRLW7Kw8bqc_PJqAnjCJI63P&index=4

import java.util.ArrayList;
import java.util.List;

public class OOP {

    public static void main (String[] args) { // static ran immediately, you don't have to create an instance of the class

        TeacherStudentInherit();

    }

        public static void newUserDefault () {
//            User new_user2 = new User(); //implement default constructor
//            new_user2.set_name("Inga"); // create for specific object - use set method. These methods can still be used on User object
//            new_user2.set_membership("Not detected yet"); // will be overwritten
//            System.out.println(new_user2.get_name());
//            System.out.println(new_user2.get_membership()); // returns "Not detected yet" using method from User class

        }

        public static void newUserMethOverload () {
//            User new_user3 = new User(); //implement default constructor
//            System.out.println("> For user 3: \n");
//            System.out.println(new_user3.get_membership()); // default parameter Gold
//            new_user3.set_membership(User.MembershEnum.Bronze); //access enum and overwrite membership
//            System.out.println(new_user3.get_membership()); // overwritten
//            System.out.println(new_user3.get_name()); // get for specific object - use get method
        }

        //METHOD OVERRIDING - when we pass an object to method that works with a string, you need to call .toString();
        public static void MethodOverriding () {
            // 2 different objects
//            User new_user4 = new User("Damien", "Bronze"); //implement default constructor
//            User new_user5 = new User("Damien", "Bronze");
//
//            System.out.println(new_user4);
//            System.out.println(new_user4);
//            System.out.println(new_user4.equals(new_user5)); //OVERRIDDEN equals
//            new_user5 = new_user4;
//            System.out.println(new_user4 == new_user5); //reassign
        }

        // GENERIC LISTS - can hold all users
        public static void userLists () {
//            List<User> users = new ArrayList<User>(); // more general on the left create array using User class
//            users.add(new User("Ingeborga")); // any users can be added to list / assign name with set_name()
//            users.add(new User("Pasha", "Silver")); //when we create new user - we access data on this User object
//            users.add(new User("Masha"));
//            System.out.println(">>>> Print a list of users: ");
//            System.out.println(users.get(0).get_name()); //got name of user #0
//
//            for (User user : users) { // for every user (type Users) in users print name
//                System.out.println(user.get_name());
//                System.out.println(user.get_membership());
            }


    //STATIC VARIABLES - we can access users directly from User class
    public static void StaticDataMembers() {
//        User.admins = new ArrayList<User>(); // more general on the left create array using User class
//        System.out.println(">> create objects");
//        User.admins.add(new User("Ingeborga")); // any users can be added to list / assign name with set_name()
//        User.admins.add(new User("Pasha"));
//        User.admins.add(new User("Masha"));
//        System.out.println(">>>> Print a list of users"); // for ex .out is static method if System class and we dont need to instanciate it :)
//        // STATIC METHOD
//        User.PrintAdmins(); // call method directly from the class
//        //System.out.println(User.admins.get(0).get_name()); //got name of user #0

    }

    // INHERITANCE and POLYMORPHISM
    //* abstract class cannot be instantiated
    public static void StudentInherits() { // java does not have multiple inheritance. also can ovverride custom methods :)

        Student new_student = new Student(); //create student from child class

        System.out.println(new_student.get_status()); //returns false as default
        new_student.set_membership("Silver");
        System.out.println(new_student.get_membership()); // returns Silver using method from User class

        //User new_user1 = new User("Inga", "Membership not defined yet"); //create object new User() - invoke constructor for the User class / its working because class User(args) exists / we instanciated a class into an object

//        System.out.println("> For user 1");
//        System.out.println(new_user1.get_membership());
//        new_user1.set_membership(User.MembershEnum.Bronze); //access enum and overwrites membership
//        System.out.println(new_user1.get_name()); //// get for specific object - use get method
//        System.out.println(new_user1.get_membership());
//        System.out.println();
    }

    public static void TeacherStudentInherit() { // java does not have multiple inheritance. also can ovverride custom methods :)
        Student new_student = new Student();
        new_student.set_name("Jimmy Hendrix");
        Teacher new_teacher = new Teacher(); //create teacher from child class
        new_teacher.set_name("Lenny Kravitz");

        User.admins = new ArrayList<>();
        User.admins.add(new_student);
        User.admins.add(new_teacher);
        User.admins.add(new Student("Prince", "Bronze" ));

        System.out.println(new_teacher.get_name());
        System.out.println(new_student.get_membership());
        System.out.println(new_teacher.get_status());

        for (User u: User.admins) { // will return compatible "verify" for each user
            u.status();
        }
    }
}