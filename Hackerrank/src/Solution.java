import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      BigInteger n = in.nextBigInteger();
      in.close();
       BigInteger val;
       int flag=0;
      // Write your code here.
       if(n.equals(new BigInteger("2"))){
           System.out.println("prime");
       }
       else if(n.remainder(new BigInteger("2")).equals(new BigInteger("0")) || n.equals(new BigInteger("1"))){
           System.out.println("not prime");
       }else{
       val=n.divide(new BigInteger("2"));
       BigInteger baseValue=new BigInteger("3");
       while(val.compareTo(baseValue)==1){
           // System.out.println("Inside not prime");
         if(n.remainder(baseValue).equals(new BigInteger("0"))){
             System.out.println("not prime");
             flag=1;
             break;         
         }
         baseValue=baseValue.add(new BigInteger("1"));
         System.out.println("Base Val"+baseValue);
       }
           if(flag==0){
               System.out.println("prime");
           }
       } 
       
   }
}
