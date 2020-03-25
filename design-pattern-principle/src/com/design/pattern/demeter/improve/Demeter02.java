package com.design.pattern.demeter.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Demeter02
 * =================================================
 * @Description: Java设计模式迪米特法则
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/3/25 22:41
 * @Version: V1.0
 */
public class Demeter02 {

    public static void main(String[] args) {
        DepartmentService service = new DepartmentService();
        service.printName(new EmployeeService());
    }
}

/**
 * 员工
 */
class Employee{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

/**
 * 部门
 */
class Department{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

/**
 * 员工处理
 * 分析是否遵循迪米特法则（直接朋友关系）
 * 1.出现成员变量，方法参数，方法返回值中的类为直接的朋友
 * Employee出现在返回值中
 */
class EmployeeService{

    public List<Employee> getAllEmployee(){
        List<Employee> list = new ArrayList<Employee>();
        for (int i = 0; i < 5; i++) {
            Employee emp = new Employee();
            emp.setName("员工"+i);
            list.add(emp);
        }
        return list;
    }

    public void printName(){
        List<Employee> employees = getAllEmployee();
        employees.stream().map(employee -> employee.getName()).forEach(System.out::println);
    }
}

/**
 * 部门处理
 * 分析是否遵循迪米特法则（直接朋友关系）
 * 1.出现成员变量，方法参数，方法返回值中的类为直接的朋友
 * Department出现在返回值中
 * EmployeeService出现在方法参数中
 */
class DepartmentService{

    public List<Department> getAllDepartment(){
        List<Department> list = new ArrayList<Department>();
        for (int i = 0; i < 5; i++) {
            Department dept = new Department();
            dept.setName("部门"+i);
            list.add(dept);
        }
        return list;
    }

    /**
     * 打印员工和部门名称
     */
    public void printName(EmployeeService employeeService){
        System.out.println("打印员工名称。。。。。。。。。。。。。。。");
        employeeService.printName();
        System.out.println("打印部门名称。。。。。。。。。。。。。。。");
        List<Department> departments = getAllDepartment();
        departments.stream().map(department -> department.getName()).forEach(System.out::println);
    }
}
