package com.design.pattern.bean;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;

/**
 * @ClassName: Employee
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/4/1 22:14
 * @Version: V1.0
 */
public class Employee implements Cloneable, Serializable {

    private String name;

    private int age;

    private Department department;

    /**
     * 深拷贝方式一
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //这里只完成对基本数据的克隆
        Employee employee = (Employee) super.clone();
        //引用的数据类型单独进行克隆
        employee.department = (Department) department.clone();
        return employee;
    }

    /**
     * 深拷贝方式二,通过对象序列化
     * @return
     */
    protected Object deepClone(){
        //创建流对象
        //字节输出流
        ByteArrayOutputStream bos = null;
        //对象输出流
        ObjectOutputStream oos = null;
        //字节输入流
        ByteArrayInputStream bis = null;
        //对象输入流
        ObjectInputStream ois = null;

        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            //当前这个对象以输出流的方式输出
            oos.writeObject(this);

            //反序列
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Employee employee = (Employee) ois.readObject();
            return employee;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }


        //序列化

    }

    public Employee(String name, int age, Department department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", department=" + department +
                '}';
    }
}
