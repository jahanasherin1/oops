import java.util.Scanner;
class Employee
{
    int eNo,eSalary;
    String eName;
    Employee(int eno,int esalary,String ename)
    {
      eNo=eno;
      eSalary=esalary;
      eName=ename;
      }
      void display()
        {
          System.out.println("\nEmployee No:"+eNo);
          System.out.println("Employee Name:"+eName);
          System.out.println("Employee Salary:"+eSalary);
         }
       }
       class Employe
       {

       public static void main(String args[])
       {
       int n,i,result=1,eno,esal,enumber;
       String ename;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of employees:");
       n=sc.nextInt();
       Employee Obj[]= new Employee[n];
          for(i=0;i<n;i++)
          {
          System.out.println("Enter Employee No:");
          eno=sc.nextInt();
          System.out.println("Enter Employee Name:");
          ename=sc.next();
          System.out.println("Enter Employee Salary:");
          esal=sc.nextInt();
          Obj[i]=new Employee(eno,esal,ename);
          }
          System.out.println("\n Employee Details:");
          
          for(i=0;i<n;i++)
          {
          Obj[i].display();
          }
          System.out.println("Enter the employee number to be searched:");
          enumber=sc.nextInt();
          for(i=0;i<n;i++)
          {
          if(Obj[i].eNo==enumber)
          {
          result=1;
          Obj[i].display();
          break;
          }
          else
          {
          result=0;
          }
          }
          if(result==0)
          {
          System.out.println("Not found");
          }
          }
          }



(base) ksb@ksb-H410M-H-V2:~/jahana/oops$ javac Employe.java
(base) ksb@ksb-H410M-H-V2:~/jahana/oops$ java Employe
Enter the number of employees:
2
Enter Employee No:
1
Enter Employee Name:
jahana
Enter Employee Salary:
10000
Enter Employee No:
2
Enter Employee Name:
frina
Enter Employee Salary:
12000

 Employee Details:

Employee No:1
Employee Name:jahana
Employee Salary:10000

Employee No:2
Employee Name:frina
Employee Salary:12000
Enter the employee number to be searched:
2

Employee No:2
Employee Name:frina
Employee Salary:12000
