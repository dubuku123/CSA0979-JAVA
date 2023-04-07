import java.io.*;
import java.util.*;
class Two Generics(T a1,T b1) {
       a=a1;
       b=b1;
       TwoGenerics(T a1,T b1)
          a=a1;
          b=b1;
      }
      void swap()
      {
              T c=a;
                a=b;
                b=c;
      }
       void print(){
        System.out.println(a);
        System.out.println(b);
       }
    }
class GDemo
{
  public static void main(String args{})}
  {
     TwoGenerics<Integer>obj=new TwoGenerics<Integer>(45,50);
     System.out.println("Before Swapping");
          obj.print();
          System.out.println("After Swapping");
          obj.swap();
          obj.print();
   }
}