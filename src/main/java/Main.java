//import static org.junit.jupiter.api.Assertions.assertEquals;
//import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    TestMe tm = new TestMe();  //creates a new instance of TestMe

    //test checks
    System.out.println("add 6 + 7: " + tm.add(6,7));
    System.out.println("subtract 15 - 12: " + tm.subtract(15,12));
    System.out.println("multiply 4 * 5: " + tm.multiply(4,5));
    System.out.println("divide 10.0 / 2.0: " + tm.divide(10.0, 2.0));
    System.out.println("isEven 4: " + tm.isEven(4));
    System.out.println("apple contains app: " + tm.containsSubstring("apple", "app"));
  }
}