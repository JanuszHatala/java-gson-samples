package com.hatala.jhdemo8json.workspace;


import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WorkspacesResponse {

	private String defaultWorkspaceName;
	private List<Workspace> workspaces;

	public List<Workspace> getWorkspaces() {
		return workspaces;
	}

	public void setWorkspaces(List<Workspace> workspaces) {
		this.workspaces = workspaces;
	}

	public String getDefaultWorkspaceName() {
		return defaultWorkspaceName;
	}

	public void setDefaultWorkspaceName(String defaultWorkspaceName) {
		this.defaultWorkspaceName = defaultWorkspaceName;
	}
}
