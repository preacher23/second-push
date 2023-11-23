package employee;

public class EmpBusinessLogic {
   // Calculate the yearly salary of employee
   public double calculateYearlySalary(EmployeeDetails employeeDetails) {

      double yearlySalary = 0;
      yearlySalary = employeeDetails.getMonthlySalary() * 12;

      return yearlySalary;
   }
	
   // Calculate the appraisal amount of employee
   public double calculateAppraisal(EmployeeDetails employeeDetails) {
      double appraisal = 0;
      System.out.println("one");
      if(employeeDetails.getMonthlySalary() < 10000){
         System.out.println("two");
         appraisal = 500;
      }else{
         System.out.println("three");
         appraisal = 1000;
      }
		
      return appraisal;
   }
}