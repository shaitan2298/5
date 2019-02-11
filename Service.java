package com.cg.eis.service;

import com.cg.eis.bean.InsuranceScheme;

public class Service implements EmployeeService
{
   double salary;
   String designation;
   
   public Service(double salary, String designation)
   {
	   this.salary = salary;
	   this.designation = designation;
   }
   
   public void servicesOffered()
   {
	   if(salary < 30000 && designation == "Analyst")
	   {
		   System.out.println(InsuranceScheme.SchemeC);
	   }
	   else if(salary > 30000 && salary < 50000 && designation == "SeniorAnalyst")
	   {
		   System.out.println(InsuranceScheme.SchemeB);
	   }
	   else
	   {
		   System.out.println(InsuranceScheme.SchemeA);
	   }
   }
}
