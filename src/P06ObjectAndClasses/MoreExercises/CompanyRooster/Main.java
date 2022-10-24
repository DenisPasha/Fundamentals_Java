package P06ObjectAndClasses.MoreExercises.CompanyRooster;

import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        String email="";
        int age=0;

        List<Employee>employeeList=new ArrayList<>();

        for (int i = 1; i <=n ; i++) {
            String input=scanner.nextLine();

            int length=input.split(" ").length;



            String name=input.split(" ")[0];
            double  salary= Double.parseDouble(input.split(" ")[1]);
            String position=input.split(" ")[2];
            String department=input.split(" ")[3];


          if (length==4 ){
               email="n/a";
               age=-1;
          } else if (length==5) {
              //check if last section is the age or email and adding to the object
              String lastSection=input.split(" ")[length-1];
              if (lastSection.length()>=3){
                  age=-1;
                  email=input.split(" ")[4];
              }else {
                  age= Integer.parseInt(input.split(" ")[4]);
                  email="n/a";
              }
          }else {
               email=input.split(" ")[4];
               age= Integer.parseInt(input.split(" ")[5]);
          }


            Employee employee= new Employee(name,salary,position,department,email,age);
            employeeList.add(employee);


            age=0;
            email="";

        }

        //sorting by department
        List<String> departmentsList = employeeList.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());

        double maxAvgSalary=0;
        double avgSalary=0;
        String winningDepartment="";

        //looping through every department
        for (int i = 0; i < departmentsList.size(); i++) {
            double salarySum=0;
            int employeesInDepartmentCount=0;
            String currentDepartment=departmentsList.get(i);
            //
            for (int j = 0; j < employeeList.size(); j++) {

                Employee currentEmployee=employeeList.get(j);
                if (currentDepartment.equals(currentEmployee.getDepartment())){
                    salarySum=salarySum+currentEmployee.getSalary();
                    employeesInDepartmentCount++;

                }
            }
            avgSalary = salarySum / employeesInDepartmentCount;
            if (avgSalary > maxAvgSalary){
                maxAvgSalary = avgSalary;
                winningDepartment=currentDepartment;
            }
        }
        System.out.printf("Highest Average Salary: %s%n",winningDepartment);
        employeeList.sort(Comparator.comparing(Employee::getSalary).reversed());

        for (int i = 0; i < employeeList.size(); i++) {
            Employee currentEmployee=employeeList.get(i);


            if (winningDepartment.equals(currentEmployee.getDepartment())){

                System.out.println(currentEmployee.toString());
            }
        }

    }
}
