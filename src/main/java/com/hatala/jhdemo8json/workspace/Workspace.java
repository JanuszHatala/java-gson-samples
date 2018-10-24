package com.hatala.jhdemo8json.workspace;

import com.hatala.jhdemo8json.AppType;

import java.util.List;

public class Workspace {

	private String name;
	private String displayName;
	private AppType defaultAppName;
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

	public AppType getDefaultAppName() {
		return defaultAppName;
	}

	public void setDefaultAppName(AppType defaultAppName) {
		this.defaultAppName = defaultAppName;
	}

	public void setApps(List<WorkspaceApp> apps) {
		this.apps = apps;
	}
}
