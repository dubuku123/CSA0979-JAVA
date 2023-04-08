import java.util.*;
class employee
{
public static void main(String[] args)
{
 double bonus,bonus1,paid;
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the salary");
 double sal= sc.nextDouble();
 System.out.println("enter the employee grade:");
 char gr= sc.next().charAt(0);
 
 if (gr=='A'&&sal>10000)
 {
   bonus=(sal*5)/100+sal;
   paid=sal+bonus;
   System.out.println("the bonus of grade A :" +bonus);
   System.out.println("the paid amount of grade A:" +paid);
  }
  else if (gr=='B' && sal>10000)
  {
   bonus=sal*(0.1)+sal;
   paid=sal+bonus;
   System.out.println("the bonus of grade B :" +bonus);
   System.out.println("the paid amount of grade B:" +paid);
   
  }
  else if (gr=='A' && sal<=10000)
 {
   bonus=sal*(0.05);
   bonus1=sal*(0.02);
   paid=sal+bonus+bonus1;
   System.out.println("the bonus of grade A :" +bonus);
   System.out.println("the paid amount of grade A with extra 2%:" +paid);
  }
  else if (gr=='B' && sal<=10000)
 {
   bonus=sal*(0.1);
   bonus1=sal*(0.02);
   paid=sal+bonus+bonus1;
   System.out.println("the bonus of grade B :" +bonus);
   System.out.println("the paid amount of grade B with extra 2%:" +paid);
  }
  else
  System.out.println("there is no bonus");
  System.out.println("the salary is" +sal);
  }
  }

