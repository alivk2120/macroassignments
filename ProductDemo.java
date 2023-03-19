//3. Online Store: Create a class called Product that represents a product in an online store, and a class called Store that represents the store. The store class should have methods to add, remove, and display products. You can also create a custom exception called ProductNotFoundException to throw when a product is not found in the store.
import java.util.Scanner;
class ProductNotFoundException extends Exception{
  ProductNotFoundException(String str){
    super(str);
  }
}
class Product{
  String pname;
}
class Store{
  int n=3;
  Product p[]=new Product[n];
  Scanner s=new Scanner(System.in);
  void addProduct(){
      for(int i=0;i<p.length;i++){
         p[i]=new Product();
      
        System.out.println("enter Product name");
        p[i].pname=s.next();
        
        }
}
  void display(){
    for(int i=0;i<n;i++){
        System.out.println((i+1)+". "+p[i].pname);
        
      }
  }
  void removeProduct() throws ProductNotFoundException{
     int index=-1;
    
    System.out.println("enter product name to remove");
    String rem=s.next();
    for(int i=0;i<p.length-1;i++){
      if(rem.equals(p[i].pname)){
        index=i;
        break;
      }
    }
    if(index>=0){
      for(int i=index;i<p.length-1;i++){
        p[i]=p[i+1];
      }
      n--;
      display();
    }
    else {
      throw new ProductNotFoundException("Invalid product");
      
    }
  }
}
class ProductDemo{
  public static void main(String args[]){
    Store s=new Store();
    s.addProduct();
    s.display();
    try{
    s.removeProduct();
    }
    catch(ProductNotFoundException e){
      System.out.println(e);
    }
  }
}