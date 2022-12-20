18import java.io.*;
import java.util.*;
class DOB
{
    public static void main(String args[])
    {
      int a;
      System.out.println("enter the age:");
      Scanner s=new Scanner(System.in);
      a=s.nextInt();
      if(a>=18)
      {
        System.out.println("YOUR can go");
      }
      else 
      {
        System.out.println("your cannot go");
      }
   }
}