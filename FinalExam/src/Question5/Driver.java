package question5;


/**
 *
 * @author Sandeep Nadendla
 */


public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ComparableCircle circle1 = new ComparableCircle(3.0);
        ComparableCircle circle2 = new ComparableCircle(4.0);
        int compare = circle1.compareTo(circle2);
        System.out.println("Question 5 Answer:Sandeep Nadendla");
        if (compare == 1) {
            System.out.println("Circle1 is larger");
        } else if (compare == -1) {
            System.out.println("Circle2 is larger");
        } else {
            System.out.println("Both Circles are of equal area.");
        }

    }

}

    
    

