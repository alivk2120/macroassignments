//4. Employee Management: Create a class called Employee that represents an employee and a class called Company that represents a company. The company class should have methods to add, remove, and display employees. You can also create a custom exception called InvalidSalaryException to throw when an employee's salary is below the minimum wage.
import java.util.Scanner;
class InvalidSalaryException extends Exception{
  InvalidSalaryException(String str){
    super(str);
  }
}
class Employee{
  String ename;
  int salary;
}
class Company{
  int n=3;
  int min=10000;
  Employee e[]=new Employee[n];
  Scanner s=new Scanner(System.in);
  void add() {
     for(int i=0;i<e.length;i++){
         e[i]=new Employee();
      
        System.out.println("enter employee name");
        e[i].ename=s.next();
         System.out.println("enter Employee");
        e[i].salary=s.nextInt();
    
      
  }
  }
  void checkSalary() throws InvalidSalaryException{
    for(int i=0;i<e.length;i++){
    if(e[i].salary<min){
         throw new InvalidSalaryException("Minimum slary of "+e[i].ename);
       }
  }
       
  }
  void display(){
    for(int i=0;i<n;i++){
        System.out.println((i+1)+". "+e[i].ename+" "+e[i].salary);
        
      }
  }
  void remove(){
     int index=-1;
    
    System.out.println("enter employee name to remove");
    String rem=s.next();
    for(int i=0;i<e.length;i++){
      if(rem.equals(e[i].ename)){
        index=i;
        break;
      }
    }
    if(index>=0){
      for(int i=index;i<e.length-1;i++){
        e[i]=e[i+1];
      }
      n--;
      display();
      
    }
    else {
      System.out.println("Invalid name");
      
    }
  }
  }
class EmployeeDemo{
  public static void main(String args[]){
    
    Company c=new Company();
    c.add();
    try{
     c.checkSalary();
    }
    catch(InvalidSalaryException e){
      System.out.println(e);
    }
    c.remove();
  }
}