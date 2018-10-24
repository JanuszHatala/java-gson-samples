package com.hatala.jhdemo8json.workspace;


import com.hatala.jhdemo8json.AppType;

public class WorkspaceApp {

	private AppType name;
	private String displayName;
	private Integer index;

	public AppType getName() {
		return name;
	}

	public void setName(AppType name) {
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
