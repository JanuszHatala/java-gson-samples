package com.jhexample.jhdemo8json;


public enum BizAppType {

	WEB_DOC_EXPLORER("docExplorer", "docExplorer"),
	WEB_INCOME_ANALYZER("incomeAnalyzerURL", "incomeanalyzer"),
	WEB_CREDIT_ANALYZER("creditAnalyzerURL", "creditanalyzer"),
	WEB_DATA_AUDIT("dataAuditURL", "dataaudit"),
	WEB_CONDITIONS("conditionsWidgetURL", ""),
	WEB_FILED_DOCS("filedDocsURL", "fileddocs");

	private String urlKey;
	private String path;

	BizAppType(String urlKey, String path) {
		this.urlKey = urlKey;
		this.path = path;
	}

	public String getUrlKey() {
		return urlKey;
	}

	public void setUrlKey(String urlKey) {
		this.urlKey = urlKey;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
