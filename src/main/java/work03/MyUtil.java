package work03;

public class MyUtil {
//    double weight;
//    double height;

//      3.2 Create a method named "calculateBMI" in "MyUtil" class. 
//          This method receives two parameters of type "double" 
//          named "weight" and "height" and it returns a "double" 
//          which is the result of "weight" divided by "height"^2.
    public static double calculateBMI(double weight,double height) {
        double BMI;
        BMI = weight / Math.pow(height/100,2); // height/100 ^ 2
        return BMI;
    }
//      3.3 Create a method named "average" in "MyUtil" class.
//          This method receives three parameters of type "int" named
//          "v1", "v2", "v3" and it returns a "double" which is 
//          the average values of the three parameters.
     public static double average(int v1,int v2,int v3) {
        double b = (v1 + v2 + v3) / 3;
        return b;
    }
    
   
    
}
