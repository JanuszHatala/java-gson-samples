package com.hatala.jhdemo8json;


public enum AppType {

	EXPLORER("Explorer", "Explorer App"),
	INCOME("Income", "Income App"),
	CREDIT("Credit", "Credit App"),
	DATA("Data", "Data App"),
	CONDITIONS("Conditions", "Conditions App"),
	DOCS("Docs", "Docs App");

	private String name;
	private String path;

	AppType(String urlKey, String path) {
		this.name = urlKey;
		this.path = path;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
