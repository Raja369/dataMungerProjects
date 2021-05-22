package com.stackroute.datamunger.query.parser;
/* This class is used for storing name of field, aggregate function for 
 * each aggregate function
 * generate getter and setter for this class,
 * Also override toString method
 * */
public class AggregateFunction {
	private String nameOfField, aggFnctn;
	// Write logic for constructor
	public AggregateFunction(final String field,final String function) {
		this.nameOfField = field;
		this.aggFnctn = function;
	}
	public String getAggregateFunction() {
		return this.toString();
	}
	public void setAggregateFunction(final String field,final String aggFunction) {
		this.nameOfField = field;
		this.aggFnctn = aggFunction;
		
	}
	public String toString() {
		return this.nameOfField +" "+ this.aggFnctn;
		
	}
}