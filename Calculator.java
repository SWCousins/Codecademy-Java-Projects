/* -- A Simple Calculator program --
    implemented as a Java Class with
    .add .subtract .multiply .divide .modulo
   Methods take two(2) integer arguments and return a single int
   */

public class Calculator {
  
  Calculator() {
    
  }
  
  public static int add(int a, int b) {
    return(a+b);
  }
  
  public static int subtract(int a, int b) {
    return(a-b);
  }
  
  public static int multiply(int a, int b) {
    return(a*b);
  }
  
  public static int divide(int a, int b) {
    if(b!=0){
      return(a/b);
    } else {
      System.out.println("No way!");
      return(0);
    }
  }
  
  public static int modulo(int a, int b) {
    if(b == 0) {
      System.out.println("Nope-sky, friend...");
      return(0);
    } else {
      return(a%b);
    }
  }
  
  public static void main(String[] args) {
    Calculator myCalculator = new Calculator();
    System.out.println(add(5,7));
    System.out.println(subtract(45,11));
  }
  
}