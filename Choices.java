package com.cg.eis.pl;
import com.cg.eis.bean.Employee;
import com.cg.eis.service.Service;
import java.util.Scanner;
public class Choices 
{
   public static void main(String args[])
   {
	   Scanner sc = new Scanner(System.in);
	   Employee e1 = new Employee();
	   System.out.println("Enter your choices: ");
	   int choice = sc.nextInt();
	   switch(choice)
	   {
	     case 1: System.out.println("Get input from the user:");
	     System.out.println("Enter the empId: ");
	     int id = sc.nextInt();
	     e1.setEmpId(id);
	     System.out.println("Enter the empName: ");
	     String name = sc.next();
	     e1.setEmpName(name);
	     System.out.println("Enter the empDesignation: ");
	     String designation = sc.next();
	     e1.setEmpDesignation(designation);
	     System.out.println("Enter the empSalary: ");
	     double sal = sc.nextDouble();
	     e1.setEmpSalary(sal);
	     break;
	     
	     case 2: System.out.println("Enter the empDesignation: ");
	     String desig = sc.next();
	     e1.setEmpDesignation(desig);
	     System.out.println("Enter the empSalary: ");
	     double salary = sc.nextDouble();
	     e1.setEmpSalary(salary);
	     Service service = new Service(salary,desig);
	     service.servicesOffered();
	     break;
	     
	     case 3: System.out.println("Employee Details are as: "); 
	     System.out.println("EmpId : " + e1.getEmpId() + "EmpName: " + e1.getEmpName() + "EmpDesignation: " 
	     + e1.getEmpDesignation() + "EmpSalary: " + e1.getEmpSalary() + "InsuranceScheme: " + e1.getInsuranceScheme());
	     break;
	     
	     case 4: System.out.println("Invalid Choice!");
	   }
   }
}
