package com.stackroute.datamunger.query;
public class DataTypeDefinitions {
	/*
	 * This class should contain a member variable which is a String array, to hold
	 * the data type for all columns for all data types
	 */
		private	String[] dataTypes;
	public DataTypeDefinitions(final String ...dataTypes) {
		super();
		this.dataTypes = dataTypes;
	}
	public String[] getDataTypes() {
		return dataTypes;
	}
	public void setDataTypes(final String ...dataTypes) {
		this.dataTypes = dataTypes;
	}
}