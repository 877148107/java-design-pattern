package com.design.pattern.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Demeter01
 * =================================================
 * @Description: Java设计模式迪米特法则
 * 1) 一个对象应该对其他对象保持最少的了解
 * 2) 类与类关系越密切，耦合度越大
 * 3) 迪米特法则(Demeter Principle)又叫最少知道原则，即一个类对自己依赖的类知道的越少越好。
 *      也就是说，对于被依赖的类不管多么复杂，都尽量将逻辑封装在类的内 部。对外除了提供的public 方法，不对外泄露任何信息
 * 4) 迪米特法则还有个更简单的定义：只与直接的朋友通信
 * 5) 直接的朋友：每个对象都会与其他对象有耦合关系，只要两个对象之间有耦合关系，我们就说这两个对象之间是朋友关系。耦合的方式很多，依赖，关联，组合，聚合等。
 *      其中，我们称出现成员变量，方法参数，方法返回值中的类为直接的朋友，而出现在局部变量中的类不是直接的朋友。也就是说，陌生的类最好不要以局部变量的形式出现在类的内部。
 *
 *  迪米特法则的核心是降低类之间的耦合 。注意：由于每个类都减少了不必要的依赖，因此迪米特法则只是要求降低类间(对象间)耦合关系， 并不是要求完全没有依赖关系
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/3/25 22:41
 * @Version: V1.0
 */
public class Demeter01 {

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
}

/**
 * 部门处理
 * 分析是否遵循迪米特法则（直接朋友关系）
 * 1.出现成员变量，方法参数，方法返回值中的类为直接的朋友
 * Department出现在返回值中
 * EmployeeService出现在方法参数中
 *
 * Employee没有出现在成员变量，方法参数，方法返回值中的类为直接的朋友。因此printName方法中存在没有遵守迪米特法则，改进Demeter02
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
        List<Employee> employees = employeeService.getAllEmployee();
        employees.stream().map(employee -> employee.getName()).forEach(System.out::println);
        System.out.println("打印部门名称。。。。。。。。。。。。。。。");
        List<Department> departments = getAllDepartment();
        departments.stream().map(department -> department.getName()).forEach(System.out::println);
    }
}
