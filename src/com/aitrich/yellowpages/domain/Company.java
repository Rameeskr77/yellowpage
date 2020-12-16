package com.aitrich.yellowpages.domain;

public class Company {
	int companyId;
	String name;
	String city;
	int number;
	String email;
	String web;
		
		public Company () {
			this.companyId=0;
			this.name=null;
			this.city=null;
			this.number=0;
			this.email=null;
			this.web=null;
		}
		public Company(int cmpid,String cmpname,String city,int num,String email,String web) {
			this.companyId=cmpid;
			this.name=cmpname;
			this.city=city;
			this.number=num;
			this.email=email;
			this.web=web;
		}
		
		public int getCompanyid() {
			return companyId;
		}
		public void setCompanyid(int id) {
			this.companyId=id;
		}
		public String getCompany() {
			return name;
		}
		public void setCompanyName(String cname) {
			this.name=cname;
		}
		public String getCity() {
			return city;
		}
		public void setcity(String ccity) {
			this.city=ccity;
		}
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number=number;
		}
		public String getCompanyEmail() {
			return email;
		}
		public void setCompanyEmail(String cemail) {
			this.email=cemail;
		}
		public String getCompanyWeb() {
			return web;
		}
		
		public void setCompanyWeb(String cweb) {
			this.web=cweb;
		}
		
		@Override
		public String toString() {
			return "Company [companyId=" + companyId + ", name=" + name + ", city=" + city + ", number=" + number
					+ ", email=" + email + ", web=" + web + "]";
		}
}

