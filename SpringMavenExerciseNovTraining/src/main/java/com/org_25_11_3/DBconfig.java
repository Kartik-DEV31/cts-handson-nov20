package com.org_25_11_3;

import org.springframework.stereotype.Component;

@Component
public class DBconfig {

	String Dburl;
	String Dbname;
	String Dbpassword;
	
	@Override
	public String toString() {
		return "DBconfig [Dburl=" + Dburl + ", Dbname=" + Dbname + ", Dbpassword=" + Dbpassword + "]";
	}
	public String getDburl() {
		return Dburl;
	}
	public void setDburl(String dburl) {
		Dburl = dburl;
	}
	public String getDbname() {
		return Dbname;
	}
	public void setDbname(String dbname) {
		Dbname = dbname;
	}
	public String getDbpassword() {
		return Dbpassword;
	}
	public void setDbpassword(String dbpassword) {
		Dbpassword = dbpassword;
	}
	
	
	
}
