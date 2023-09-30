package work04;

public class Person {
//          This class contains the following field and methods.
//          4.1.1 a private "id" field of type "int".
    
    private int id;
    
//          4.1.2 a public constructor that receives 
//                an "id" parameter to set the "id" field.
    
     public Person(int id) {
        this.id = id;  //Constructor
    }
     
//          4.1.3 public getter/setter methods.
     
      public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }  
    
//          4.1.4 @Override a public "toString" method that 
//                returns a "String" of value "Person(id)" 
//                where "id" is the "id" field.
    
    @Override 
    public String toString() {
        //return "Person(" + id +")";   //print = Person(id)
        return "Person ID : " + id + "";  //print = Person ID : id
        //return "Person" + id;  //print = Personid
    }
    
   
    
    
    
   
}
