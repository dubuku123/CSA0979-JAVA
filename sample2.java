import java.io.*;
import java.util.*;
class sample2
{
  public static void main(String arg[])
  {
    Scanner Sc=new Scanner(System.in);
    int a,b,c;
    a=Sc.nextInt();
    b=Sc.nextInt();
    c=Sc.nextInt();
    
    if(a>b && a>c)
        System.out.println("a is greater");
    if(b>c && b>c)
        System.out.println("b is greater");
    else
        System.out.println("c is greater");
  } 
}
