package com.jhexample.jhdemo8json.workspace;

import com.jhexample.jhdemo8json.BizAppType;

import java.util.List;

public class Workspace {

	private String name;
	private String displayName;
	private BizAppType defaultAppName;
	private List<WorkspaceApp> apps;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public List<WorkspaceApp> getApps() {
		return apps;
	}

	public BizAppType getDefaultAppName() {
		return defaultAppName;
	}

	public void setDefaultAppName(BizAppType defaultAppName) {
		this.defaultAppName = defaultAppName;
	}

	public void setApps(List<WorkspaceApp> apps) {
		this.apps = apps;
	}
}
