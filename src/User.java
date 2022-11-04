// the idea of incapsulation is that you can hide details from users who does not need them and prevent working with vars directly
// getters and setters - methoss to pass class attributes to object or call them
import java.util.List;

// here we store things we want to save about every user
public abstract class User { // abstract class extends Object class

    // STATIC DATA MEMBERS - Anything static on the class is accessed from the class directly
    public static List<User> admins; // create static variable -> list of Users / now can access users directly through User class


    // ATTRIBUTES
    private String _name = "MR. BEAN"; // private - this variable will be accessible only here and not in other class
    private String _membership = "GOLD"; // if not mentioned when creating an object - will be null
    private boolean _status = false; // shouldn't be seen from another classes as variable
    //int age; // if not mentioned when creating an object - will be 0



    // CONSTRUCTORS. after created custom constructor - cant use default anymore. don't have any return. use to force proper data
    public User() { // create default constructor to create inheritance
    }

    //if we want both default and custom constructors we need to define both inside the class
    public User(String name) { // default constructor / we will add it to users.add() as a class constructor
        set_name(name);
    }

    public User(String name, String membership) { // custom constructor - place arguments when create instance, if argument not passed- will use default on 0/null
        set_name(name);
        set_membership(membership);
    }


    // METHODS ENCAPSULATION (getters and setters) (ex. cell wall that controls what enters and what exits)
    void set_membership (String membership) { // to give _name a  value / also method allows to do some processing
        System.out.println(">>> Into membership: " + membership);
        _membership = membership;
    }

    void set_name (String name) { // we use this to give _name a  value / also method allows to do some processing
        System.out.println(">>> Into name: " + name); // can put anything here
        _name = name;
    }

    String get_membership() { // we use this to get _name value
        System.out.println(">>> Get membership: " + _membership);
        return _membership; // returns a string
    }

    String get_name() { // we use this to get _name value
        System.out.println(">>> Get name: " + _name);
        return _name; // returns a string
    }

    void set_status(boolean status) { //does not return anything
        _status = status;
    }

    boolean get_status() { //returns boolean value
        return _status;
    }
    void status() {
        System.out.println("verifying...");
        set_status(true);
    }

    // METHOD OVERLOADING - if you want to create different variations of methods with diff datatypes
    // create enum constructor
    public enum MembershEnum {
        Gold, Silver, Bronze;
    }

    void set_membership (MembershEnum membership) { // we use this to give _name a value / also method allows to add some processing
        System.out.println(">>> Into MembershEnum: " + membership);
        _membership = membership.name(); // name() default method returns name of enum constant (Gold)
    }


    // STATIC METHODS - ex to read data from a file not to create function by its own
    //when we create new user - we access data on this user object
    //with static methods and variables - we access User class directly
    public static void PrintAdmins() { //access data directly without
        System.out.println(">> print admins");
    for (User user : admins) // for every user (Users) print name . because implicitly its mentioned above
        System.out.println(user.get_name());
    }


    // METHOD OVERRIDING
    public boolean equals(User user) { // override equals()
        if (user.get_name() == get_name()
                && user.get_membership() == get_membership()) {
            return true;
        }
        else {return false;}
    }

    @Override
    public String toString() {
        return "User{" +
                "_name='" + _name + '\'' +
                ", _membership='" + _membership + '\'' +
                '}';
    }
}