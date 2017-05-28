//A simple program to find a substring in a String by using an inbuilt method of String class.
import java.util.*;
public class String2{

    public static void main(String []args){
          String string,subString;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the string");
          string=sc.next();//takes string as input
          System.out.println("Enter any substring");
          subString=sc.next();//takes substring as input
          if(string.contains(subString))//if string contains the substring,then
               System.out.println("Substring found");
  
              else//if string dont contains the substring
                 System.out.println("Substring not found");
    }
}
