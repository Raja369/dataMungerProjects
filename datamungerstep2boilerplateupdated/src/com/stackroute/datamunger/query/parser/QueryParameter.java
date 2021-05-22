package com.stackroute.datamunger.query.parser;
import java.util.List;
/* 
 * This class will contain the elements of the parsed Query String such as conditions,
 * logical operators,aggregate functions, file name, fields group by fields, order by
 * fields, Query Type
 * */
public class QueryParameter {
	private String fileName,baseQuery;
	private List<Restriction> getConditions;
	private List<String> getLogical,getField,getGroupBy,getOrderBy;
	private List<AggregateFunction> getAggregateFunction;
/*	public QueryParameter(String fileName, String baseQuery, List<Restriction> getConditions, List<String> getLogical,
			List<String> getField, List<String> getGroupBy, List<String> getOrderBy,
			List<AggregateFunction> getAggregateFunction) {
		super();
		this.fileName = fileName;
		this.baseQuery = baseQuery;
		this.getConditions = getConditions;
		this.getLogical = getLogical;
		this.getField = getField;
		this.getGroupBy = getGroupBy;
		this.getOrderBy = getOrderBy;
		this.getAggregateFunction = getAggregateFunction;
	} */
		public String getFileName() {
			return this.fileName;
		}
	public String getBaseQuery() {
		return this.baseQuery;
	}
	public List<Restriction> getRestrictions() {
		return this.getConditions;
	}
	public List<String> getLogicalOperators() {
		return this.getLogical;
	}
	public List<String> getFields() {
		return this.getField;
	}
	public List<AggregateFunction> getAggregateFunctions() {
		return this.getAggregateFunction;
	}
	public List<String> getGroupByFields() {
		return this.getGroupBy;
	}
	public List<String> getOrderByFields() {
		return this.getOrderBy;
	}
	public String setFileName(final String fileName) {
		 this.fileName = fileName;
		 return fileName;
	}
	public void setBaseQuery(final String baseQuery) {
		this.baseQuery = baseQuery;
	}
	public void setGetConditions(final List<Restriction> getConditions) {
		this.getConditions = getConditions;
	}
	public void setGetLogical(final List<String> getLogical) {
		this.getLogical = getLogical;
	}
	public void setGetFields(final List<String> getFields) {
		this.getField = getFields;
	}
	public void setGetGroupBy(final List<String> getGroupBy) {
		this.getGroupBy = getGroupBy;
	}
	public void setGetOrderBy(final List<String> getOrderBy) {
		this.getOrderBy = getOrderBy;
	}
	public void setGetAggregateFunction(final List<AggregateFunction> getAggregateFunction) {
		this.getAggregateFunction = getAggregateFunction;
	}
}