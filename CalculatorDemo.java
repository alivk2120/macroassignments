//5. Calculator: Create a class called Calculator that can perform basic arithmetic operations and a custom exception called InvalidExpressionException that should be thrown when the expression to be evaluated is invalid.
class InvalidExpressionException extends Exception{
  InvalidExpressionException(String str){
    super(str);
  }
}
class Calculator{
  void add(int a,int b){
    int add=a+b;
    System.out.println("sum is:"+add);
  }
  void sub(int a,int b){
    int sub=a-b;
    System.out.println("difference is:"+sub);
  }
  void mul(int a,int b){
    int mul=a*b;
    System.out.println("product is:"+mul);
  }
  void div(int a,int b) throws InvalidExpressionException{
    int div=a/b;
    if(b==0){
      throw new InvalidExpressionException("divided by zero");
    }
    System.out.println("quotient is:"+div);
  }
}
class CalculatorDemo{
  public static void main(String args[]){
    Calculator c=new Calculator();
    c.add(2,5);
    c.sub(4,2);
    c.mul(2,6);
    try{
    c.div(3,0);
    }
    catch(InvalidExpressionException e){
      System.out.println(e);
    }
  }
}