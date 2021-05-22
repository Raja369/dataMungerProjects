package com.stackroute.datamunger.query;
public class Header {
	/*
	 * This class should contain a member variable which is a String array, to hold
	 * the headers.
	 */
	private	String[] headers;
	public Header(final String ...headers) {
		super();
		this.headers = headers;
	}
	public String[] getHeaders() {
		return headers;
	}
	public void setHeaders(final String ...headers) {
		this.headers = headers;
	}
}