package com.design.pattern.bean;

import com.design.pattern.bean.Department;
import com.design.pattern.bean.Employee;

/**
 * @ClassName: CloneTest
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/4/1 22:17
 * @Version: V1.0
 */
public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Department department = new Department("采购部");
        Employee employee = new Employee("张三",25,department);
        System.out.println("拷贝前employee："+employee+",HashCode:"+employee.getDepartment().hashCode());
        Employee employee2 = (Employee) employee.deepClone();
        System.out.println("拷贝后employee2："+employee2+",HashCode:"+employee2.getDepartment().hashCode());
        employee.getDepartment().setName("财务部");
        System.out.println("拷贝前employee："+employee+",HashCode:"+employee.getDepartment().hashCode());
        System.out.println("拷贝后employee2："+employee2+",HashCode:"+employee2.getDepartment().hashCode());
    }
}
