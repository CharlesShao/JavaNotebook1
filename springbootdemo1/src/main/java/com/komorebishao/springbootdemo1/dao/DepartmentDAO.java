package com.komorebishao.springbootdemo1.dao;

import com.komorebishao.springbootdemo1.pojo.Department;

import java.util.HashMap;
import java.util.Map;

//部门dao
public class DepartmentDAO {
    private static Map<Integer, Department> departments = null;
    //模拟数据库中的数据
    static{
        departments = new HashMap<Integer, Department>();//创建一个部门表
        departments.put(101,new Department(101,"教学部"));
        departments.put(101,new Department(102,"市场部"));
        departments.put(101,new Department(103,"运营部"));
        departments.put(101,new Department(104,"监管部"));
        departments.put(101,new Department(105,"技术部"));
    }
}
