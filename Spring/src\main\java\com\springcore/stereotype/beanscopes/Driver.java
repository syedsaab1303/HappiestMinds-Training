package com.springcore.stereotype.beanscopes;


import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

 
// T+he thing which we do with xml file same thing we do with the help of annotation for eg. @Component this create an object of class and @Value this gives value.
//	StereoType Annotations
//@Component		// Default("driver")
@Component("don")		// Parameterized used to declare variable name explicitly
@Scope("prototype")   // 5  types of scope define , here we use prototype(other famous are singleton and singleton is bydefault) 
public class Driver {

	@Value("Syed Tamzeed")
	private String name;
	@Value("1234")
	private int vehNo;
	@Value("Bhopal")
	private String city;
	
	
	@Value("#{mymap}")     //  this id match with config.xml and  this is  SpEL (Spring Expression Language ) 
	private Map<String, Integer> rate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getVehNo() {
		return vehNo;
	}
	public void setVehNo(int vehNo) {
		this.vehNo = vehNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Driver [name=" + name + ", vehNo=" + vehNo + ", city=" + city + "]";
	}
	public Map<String, Integer> getRate() {
		return rate;
	}
	public void setRate(Map<String, Integer> rate) {
		this.rate = rate;
	}
	
	
}
