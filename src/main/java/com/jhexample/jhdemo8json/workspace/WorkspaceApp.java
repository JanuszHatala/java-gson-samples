package com.jhexample.jhdemo8json.workspace;


import com.jhexample.jhdemo8json.BizAppType;

public class WorkspaceApp {

	private BizAppType name;
	private String displayName;
	private Integer index;

	public BizAppType getName() {
		return name;
	}

	public void setName(BizAppType name) {
		this.name = name;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}
}
