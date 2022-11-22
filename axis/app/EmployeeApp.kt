package com.axis.app
import com.axis.model.Employee
import com.axis.service.EmployeeService
fun main(args: Array<String>) {
    println("===employee app====")
    var employee=Employee(1,"sourab",45000)
    var employeeService=EmployeeService()
    employeeService.displayEmployeeDetails(employee)
    println(" per day salary ${employeeService.perDaySalary(employee)}")
    println("increase salary by 10% ${employeeService.increaseSalaryByTenPercentage(employee)}")

}