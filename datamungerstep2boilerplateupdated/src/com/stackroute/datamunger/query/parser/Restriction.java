package com.stackroute.datamunger.query.parser;
/*
 * This class is used for storing name of field, condition and value for 
 * each conditions
 * generate getter and setter for this class,
 * Also override toString method
 * */
public class Restriction {
	private String fieldName, fieldCondition, fieldValue;
	// Write logic for constructor
	public Restriction(final String name,final String value,final String condition) {
		this.fieldName = name;
		this.fieldCondition = condition;
		this.fieldValue = value;
	}
	public String getRestriction() {
		return this.toString();
	}
	public void setRestriction(final String name,final String value,final String condition) {
		this.fieldName = name;
		this.fieldCondition = condition;
		this.fieldValue = value;
	}
	public String toString() {
		return this.fieldName+" "+this.fieldValue+" "+this.fieldCondition;
	}	
}