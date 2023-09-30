package int101.homework01;
import work03.MyUtil;
import work04.Person;
import work04.BankAccount;

public class Int101Homework01 {

    public static void main(String[] args) {
        work01Question(true, false, true, false, true, false);
        work01Answer(true, false, true, false, true, false);
        work02Question(1, 2, 3, 4, 5, 6);
        work02Answer(1, 2, 3, 4, 5, 6);
        work03UseOfUtilityClass();
        work04UseOfObjectClass();
    }
    static void work01Question(boolean b1, boolean b2, boolean b3, 
       boolean b4, boolean b5, boolean b6) {
       // do nothing in this method; do your work in work01Question()
       boolean b = ((b1 ^ (b2 | b3)) && b4) || (b5 & b6); 
       System.out.println("Work01:Question: b = " + b);
    }
    static void work01Answer(boolean b1, boolean b2, boolean b3, 
       boolean b4, boolean b5, boolean b6) {
       // remove () as many as possible from the following expression
       // but do not change the meaning of the expression; 
       // regardless of the values of the parameters: b1-b6 .
       boolean b = b1 ^ b2 | b3 && b4 || b5 & b6; 
       System.out.println("Work01:Answer: b = " + b);
    }
    static void work02Question(int v1, int v2, int v3, int v4, int v5, int v6) {
       // do nothing in this method; do your work in work02Question()
       boolean b = ((v1 << v2) < v3) != (v3 > ((v4 ^ v5) | v6)); 
       System.out.println("Work02:Question: b = " + b);
    }
    static void work02Answer(int v1, int v2, int v3, int v4, int v5, int v6) {
       // remove () as many as possible from the following expression
       // but do not change the meaning of the expression; 
       // regardless of the values of the parameters: b1-b6 .
       boolean b = (v1 << v2) < v3 != v3 > (v4 ^ v5 | v6); 
       System.out.println("Work02: Question: b = " + b);
    }

   static void work03UseOfUtilityClass() {
      /*
      3.4 Show in this "work03UseOfUtilityClass" method how to use 
          "calculateBMI" and "average" methods of "MyUtil" class.
      */
       System.out.println("Work03: CalculateBMI = " + MyUtil.calculateBMI(38,152 ));
       System.out.println("Work03: Average = " + MyUtil.average(5, 18, 25));
   }

   static void work04UseOfObjectClass() {
      /*
      4.3 Show in this "work04UseOfObjectClass" method how to use 
          each method of "Person" and "BankAccount" objects.
      */
      Person p = new Person(1);
      System.out.println("Account1 = " + p);
     
      BankAccount a = new BankAccount(1,p);  //create BankAccount a own by owner p
      a.deposits(800);  //get money into account (save money)
      a.withdraw(500);  //get money out (use money)
      System.out.println("Amount of Account1 = " + a.getBalance() + " Baht"); // amount that left
      
      Person s = new Person(2);
      System.out.println("Account2 = " + s);
      Person r = new Person(3);
      BankAccount n = new BankAccount(3,r);  //create BankAccount n own by owner r
      
      BankAccount c = new BankAccount(2,s);
      c.deposits(5000);  //get money into account (save money)
      c.withdraw(1500);  //get money out (use money)
      c.transfer(1000, n);  //get money to bank n(owner r)
      System.out.println("Amount of Account2 = " + c.getBalance() + " Baht");  // amount that left
      
      
   }
}
