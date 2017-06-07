import java.util.Scanner;

public class HelloWorld
{
   public static void main(String []args)
  {
        
   char ch;
        
   System.out.println("Enter the value");
  
   Scanner in=new Scanner(System.in);

   ch=in.next().charAt(0);
       
   if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
  
   {       
    System.out.println("The given character is vowel");
   
   }
   
   else
    
    System.out.println("The given character is consonant");

  }

}

