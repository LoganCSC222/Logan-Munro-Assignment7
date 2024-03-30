public class TestMe {
  //adds two integers and returns the result
  public int add(int a, int b) {
    return a + b;
  } //end add
  //subtracts two integers and returns the result
  public int subtract(int a, int b) {
    return a - b;
  } //end subtract
  //multiplies two integers and returns the result
  public int multiply(int a, int b) {
    return a * b;
  } //end multiply
  //divides two doubles and returns the result
  public double divide(double a, double b) {
    return a/b;
  } //end divide
  //determines whether the input is even and returns true or false
  public boolean isEven(int a) {
    return a % 2 == 0;
  } //end isEven
  // Check if the string contains the substring

  public boolean containsSubstring(String str, String sub) {
    return str.contains(sub);
  } //end containsSubstring
}