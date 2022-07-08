package com.springcore.collections.standalone;


//import java.util.List;
//import java.util.Map;
//import java.util.Properties;

import java.util.*;

public class Person {

	private List<String> friends;
	private Map<String, Integer> feeStruc;
	private Properties prop;
	
	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	
	public Map<String, Integer> getFeeStruc() {
		return feeStruc;
	}

	public void setFeeStruc(Map<String, Integer> feeStruc) {
		this.feeStruc = feeStruc;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + "]";
	}

	

}