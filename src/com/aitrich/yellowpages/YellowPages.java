package com.aitrich.yellowpages;
import com.aitrich.yellowpages.domain.City;
import com.aitrich.yellowpages.domain.Company;
import com.aitrich.yellowpages.domain.Employee;

public class YellowPages {		
	public Company[] addCompany() {
		Company cmpobj1=new Company(1,"google",City.trissur,1234567891,"google@gmail.com","google.com");
		Company cmpobj2=new Company(2,"amazon",City.chavakad,987456321,"amazon@gmail.com","amazon.com");
		Company cmpobj3=new Company(3,"Facebook",City.kollam,987456336,"facebook@gmail.com","facebook.com");
		Company cmpobj4=new Company(4,"Ibm",City.kodungaloor,987456378,"ibm@gmail.com","ibm.com");
		Company cmpobj5=new Company(5,"swiggy",City.triprayyar,987456388,"swiggy@gmail.com","swiggy.com");
		Company cmpobj6=new Company();
		cmpobj6.setCompanyid(6);
		cmpobj6.setCompanyName("dell");
		cmpobj6.setcity(City.kottayam);
		cmpobj6.setNumber(1111111111);
		cmpobj6.setCompanyEmail("dell@gmail.com");
		cmpobj6.setCompanyWeb("dell.com");
		Company arr[]= {cmpobj1,cmpobj2,cmpobj3,cmpobj4,cmpobj5,cmpobj6};
	
		return arr;
//		System.out.println(cmpobj1);
//		System.out.println(cmpobj2);
//		System.out.println(cmpobj3);
//		System.out.println(cmpobj4);
//		System.out.println(cmpobj5);
//		System.out.println(cmpobj6);
	}
	public Employee[] addEmployee() {
		Company[] a=addCompany();
		Employee empobjt1= new Employee(1,"joyel","cloud engineer",City.chavakad,"male",1234567891,a[0]);
		Employee empobjt2= new Employee(2,"jerry","cloud specialist",City.kodungaloor,"male",1234567231,a[1]);
		Employee empobjt3= new Employee(3,"tom","security engineer",City.kollam,"female",1234567879,a[2]);
		Employee empobjt4= new Employee(4,"mr been","project manager",City.kottayam,"male",1234527891,a[3]);
		Employee empobjt5= new Employee(5,"lack","softwear engineer",City.triprayyar,"female",1234567891,a[4]);
		Employee empobjt6= new Employee();
		empobjt6.setEmployeeId(6);
		empobjt6.setEmployeeName("raju");
		empobjt6.setEmployeeDesignation("softwear developerhghfghfghnn");
		empobjt6.setEmployeeCity(City.trissur);
		empobjt6.setEmployeeGenter("male");
		empobjt6.setEmployeeNumber(1245124512);
		empobjt6.setEmployeeCompany(a[5]);
		Employee emparray[]= {empobjt1,empobjt2,empobjt3,empobjt4,empobjt5,empobjt6};
//		System.out.println(empobjt1);
//		System.out.println(empobjt2);
//		System.out.println(empobjt3);
//		System.out.println(empobjt4);
//		System.out.println(empobjt5);
//		System.out.println(empobjt6);
		return emparray;
	}
	public void findAcompany() {
		String name;
		Company[] Acmp=addCompany();
		for(int i=0;i<Acmp.length;i++) {
			name=Acmp[i].getCompanyname();
			if(name.charAt(0)=='A'|| name.charAt(0)=='a') {
			 System.out.println(name);
			}
			
		}
		
	}
	public void listAllemployeegiven() {
		String cmpname="amazon";
		String name;
		//Company[] cmp=addCompany();
		Employee[] listcmp=addEmployee();
		for(int i=0;i<listcmp.length;i++) {
			//name=cmp[i].getCompanyname();
			if(cmpname==listcmp[i].getEmployeeCompany().getCompanyname()) {
				System.out.println(listcmp[i]);
			}
		}
	}
}