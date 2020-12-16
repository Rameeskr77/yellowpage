package com.aitrich.yellowpages;

import com.aitrich.yellowpages.domain.Company;
import com.aitrich.yellowpages.domain.Employee;

public class YellowPages {		
	public Company[] addCompany() {
		Company cmpobj1=new Company(1,"google","trissur",1234567891,"google@gmail.com","google.com");
		Company cmpobj2=new Company(2,"Amazon","kodungalur",987456321,"amazon@gmail.com","amazon.com");
		Company cmpobj3=new Company(3,"Facebook","triprayar",987456336,"facebook@gmail.com","facebook.com");
		Company cmpobj4=new Company(4,"Ibm","chavakad",987456378,"ibm@gmail.com","ibm.com");
		Company cmpobj5=new Company(5,"swiggy","palakad",987456388,"swiggy@gmail.com","swiggy.com");
		Company cmpobj6=new Company();
		cmpobj6.setCompanyid(6);
		cmpobj6.setCompanyName("dell");
		cmpobj6.setcity("kazarcode");
		cmpobj6.setNumber(1111111111);
		cmpobj6.setCompanyEmail("dell@gmail.com");
		cmpobj6.setCompanyWeb("dell.com");
		Company[] arr=new Company[6];
		arr[0]=cmpobj1;
		arr[1]=cmpobj2;
		arr[2]=cmpobj3;
		arr[3]=cmpobj4;
		arr[4]=cmpobj5;
		arr[5]=cmpobj6;
		return arr;
//		System.out.println(cmpobj1);
//		System.out.println(cmpobj2);
//		System.out.println(cmpobj3);
//		System.out.println(cmpobj4);
//		System.out.println(cmpobj5);
//		System.out.println(cmpobj6);
	}
	public void addEmployee() {
		Company[] a=addCompany();
		Employee empobjt1= new Employee(1,"joyel","cloud engineer","chalakudy","male",1234567891,a[0]);
		Employee empobjt2= new Employee(2,"jerry","cloud specialist","trissur","male",1234567231,a[1]);
		Employee empobjt3= new Employee(3,"tom","security engineer","triprayar","female",1234567879,a[2]);
		Employee empobjt4= new Employee(4,"mr been","project manager","kodungaloor","male",1234527891,a[3]);
		Employee empobjt5= new Employee(5,"lack","softwear engineer","vadanapily","female",1234567891,a[4]);
		Employee empobjt6= new Employee();
		empobjt6.setEmployeeId(6);
		empobjt6.setEmployeeName("raju");
		empobjt6.setEmployeeDesignation("softwear developerhghfghfghnn");
		empobjt6.setEmployeeCity("kozhikode");
		empobjt6.setEmployeeGenter("male");
		empobjt6.setEmployeeNumber(1245124512);
		empobjt6.setEmployeeCompany(a[5]);
		System.out.println(empobjt1);
		System.out.println(empobjt2);
		System.out.println(empobjt3);
		System.out.println(empobjt4);
		System.out.println(empobjt5);
		System.out.println(empobjt6);
	}
}