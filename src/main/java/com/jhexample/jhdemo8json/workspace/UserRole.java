package com.jhexample.jhdemo8json.workspace;

import java.util.List;

public class UserRole {

	private String name;
	private String defaultWorkspaceName;
	private List<Workspace> workspaces;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDefaultWorkspaceName() {
		return defaultWorkspaceName;
	}

	public void setDefaultWorkspaceName(String defaultWorkspaceName) {
		this.defaultWorkspaceName = defaultWorkspaceName;
	}

	public List<Workspace> getWorkspaces() {
		return workspaces;
	}

	public void setWorkspaces(List<Workspace> workspaces) {
		this.workspaces = workspaces;
	}
}
