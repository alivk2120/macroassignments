//5. Calculator: Create a class called Calculator that can perform basic arithmetic operations and a custom exception called InvalidExpressionException that should be thrown when the expression to be evaluated is invalid.
import java.util.Scanner;
class InvalidExpressionException extends Exception{
  InvalidExpressionException(String str){
    super(str);
  }
}
class Calculator{
  Scanner s=new Scanner(System.in);
 void operations(int a,int b) throws InvalidExpressionException{
   System.out.println("1.Addition (+)");
    System.out.println("2.subtraction (-)");
    System.out.println("3.Multiplication  (*)");
    System.out.println("4.Division  (/)");
   System.out.println("Enter your choice");
   char ch=next().charAt(0);
   switch(ch){
     case '+': int add=a+b;
             System.out.println("sum is:"+add);
       break;
     case '-': int sub=a-b;
             System.out.println("difference is:"+sub);
       break;
     case '*': int mul=a*b;
             System.out.println("Product is:"+mul);
       break;
     case '/': try{
       double div=a/b;
       System.out.println("division is:"+div);
     }
       catch(ArithmeticException e){
         System.out.println(e);
       }
             
       break;
     default: throw new InvalidExpressionException("Invalid choice");
   }
   
 }
}
class CalcDemo{
  public static void main(String args[]){
    Calculator c=new Calculator();
    
    try{
    c.operations(5,5);
    }
    catch(InvalidExpressionException e){
      System.out.println(e);
    }
  }
}