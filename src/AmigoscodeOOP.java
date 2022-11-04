import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;

public class AmigoscodeOOP { // loads main class not the java file (should be compiled)
    public static void main(String[] args) {
        String name = new String("amigos");
        System.out.println(name.toUpperCase()); // with reference types you have building behaviours


        //PRIMITIVE DT
        int a = 10;
        int b = a; // created as a copy of a - b is untouched
        a = 100; //
        System.out.println(a + " " + b);

        //REFERENCE DT
        // Person("Alex") is actual object address 200
        // alex is reference to this object has address 201 points to 200
        // alex is reference to this object has address 202 points to 200

        Person alex = new Person("Alex"); // in main we create new person from class person and pass a name as a class attribute
        Person mariam = alex; // now they are objects of class Person with same id 30f39991

        System.out.println("before change");
        System.out.println(alex.name);
        System.out.println(mariam.name);

        alex.name = "Alexander"; // another object will also change name
//        mariam.name = "Marie";

        System.out.println("after change");
        System.out.println(alex.name);
        System.out.println(mariam.name);

        //STRING DT
        String my_name = new String("inga"); //my name is object of class
        String my_name1 = "inga"; //my name is object of class SAME!!!
        System.out.println(my_name1);
        System.out.println(my_name.toUpperCase()); //behavior
        System.out.println(my_name.toLowerCase()); //behavior
        System.out.println(my_name.charAt(0)); //behavior
        System.out.println(my_name.charAt(1)); //behavior
        System.out.println(my_name.contains("a"));
        System.out.println(my_name1.equals(my_name));

        //DATES
        LocalDate localDate = LocalDate.now(); // used without new
        Date date = new Date();
        Date dateSql = new java.sql.Date(30);
        LocalDateTime localDateTime = LocalDateTime.now(); // used without new
        System.out.println(date.getMonth()); // ref datatype 9
        System.out.println(localDateTime);
        System.out.println(localDate);
        System.out.println(date);
        System.out.println(dateSql);

        //MATH
//        Math.abs();
//        Math.max();
//        (int) Math.pow(5, 2); returns a decimal. to convert use (int)

        //ARRAY
        int [] nums = {1, 2, 3}; //always 1 type and always 3 elements
        String [] str = {"1", "2", "3"}; // [1,2,3]
        str[0] = "65";
        System.out.println(str); // [Ljava.lang.String;@19469ea2
        System.out.println(Arrays.toString(str));

        // BOOLEAN
        System.out.println( 10 > 8 && 2 > 2  && true && my_name.contains("i"));

        // if statement
        int age = 22;
        String message = age >= 20 ? // if age > 20
                "yes" : "no"; // returns yes, else: no and puts it into variable
        System.out.println(message);

    }

    static class Person { // this is a class where we can create reference types = objects
        String name;
        Person (String name) {
            this.name = name;
        }
    }
}

/*
multicomment
 */