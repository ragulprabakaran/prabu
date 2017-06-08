import java.util.*;

public class Alphabets
{
    
 public static void main(String []args)
 {
        
  char ch;
       
  Scanner in=new Scanner(System.in);
     
  System.out.println("Enter the character");
     
  ch=in.next().charAt(0);
      
  if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')
    
  {
        
   System.out.println("The given character is an alphabet");  
  
  }
     
  else
      
   System.out.println("The given character is not an alphabet");  
        

 }

}
