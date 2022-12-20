import java.io.*;
import java.util.*;
class Register
{
   void register()
   { 
      int p;
      String n,e;  //n-name,p-password,e-email
      Scanner s=new Scanner(System.in);
      System.out.println("enter the name:");
      n=s.next();
      System.out.println("enter the password:");
      p=s.nextInt();
      System.out.println("enter the email:");
      e=s.next();
      System.out.println("register successful");
    }
}
class Login extends Register
{
   void Login()
   {
     int p1;
     String n1,n;
     Scanner s=new Scanner(System.in);
     System.out.println("enter the your username:");
     n1=s.next();
     System.out.println("enter the your password:");
     p1=s.nextInt();
     if(n1!=n1)
     {
       System.out.println("INVALIT USERNAME OR PASSWORD");
     }
     else
     {
         System.out.println("LOGIN SUCCESSFUL");
     }
   }
}
class Form
  {
     public static void main(String args[])
     {
       int r;
       Login b1=new Login();
       System.out.println("IF YOU HAVE ANY ACCOUNT OR NOT:1.YES\t2.NO:");
       Scanner s=new Scanner(System.in);
       r=s.nextInt();
       if(r==1)
        {
            b1.Login();
        }
       else
        {
           b1.register();
        }
    }
}



      
  