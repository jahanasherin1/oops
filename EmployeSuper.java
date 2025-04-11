import java.util.Scanner;
class Employee
{
  int Empid,Salary;
  String Name,Address;
  
  Employee(int eid,int sal,String name,String addr)
  {
    Empid=eid;
    Salary=sal;
    Name=name;
    Address=addr;
    
   }
   }
     
      class Teacher extends Employee
      {
       String department,subjects_taught;
       Teacher(int eid,int sal,String name,String addr,String dept,String sub)
       {
        super(eid,sal,name,addr);
        department=dept;
        subjects_taught=sub;
       }
       void display()
       {
         System.out.println("\nEmployee Id:" + Empid);
         System.out.println("\nEmployee Name:" + Name);
         System.out.println("\nSalary:" + Salary);
         System.out.println("\nAddress:" + Address);
         System.out.println("\nDepartment:" + department);
         System.out.println("\nSubjects Taught:" +subjects_taught );
         
        }
        }
        class EmployeSuper
         {
          public static void main( String args[] )
          {
           int i,n,eid,salary;
           String name,subj,addr,dept;
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the number of employees:");
           n=sc.nextInt();  
           Teacher teacher[]=new Teacher[n];
           for(i=0;i<n;i++) 
           {
           System.out.println("\nEnter the employee id:");
           eid = sc.nextInt();

           System.out.println("\nEnter the employee Name:");
           name = sc.next();

           System.out.println("\nEnter the Salary:");
           salary = sc.nextInt();

           System.out.println("\nEnter the Address:");
           addr = sc.next();

           System.out.println("\nEnter the Department:");
           dept = sc.next();

           System.out.println("\nEnter the Subject taught:");
           subj = sc.next();

           teacher[i] = new Teacher(eid, salary, name, addr, dept, subj);
           }

           System.out.println("\n Details of Teachers");
           System.out.println("-------------------------------");
           for(i=0;i<n;i++)
           {
             teacher[i].display();             
           }
        }
        }      
        
        
        
        
        
        
        
        
        
        
        
