package com.gva.test;

import com.gva.json.Employee;
import com.gva.util.JsonUtil;

public class test {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.setEmpNo(100);
		emp.setName("Ganesh");
		emp.setSalary(20000);
		//To convert Java to JSON
		String jsonEmp=JsonUtil.convertJavaToJson(emp);
		System.out.println("Final json format:"+jsonEmp);
		
		//To convert JSOn to Java
		/*
		 * System.out.println("====================");
		 * System.out.println("Final java object format"); Employee
		 * emp1=JsonUtil.convertJsonToJava(jsonEmp, Employee.class);
		 * System.out.println(emp1.getEmpNo()+"  "+emp1.getName()+"  "+emp1.getSalary())
		 * ;
		 */
		

	}

}
