package com.hatala.jhdemo8json;

import com.hatala.jhdemo8json.workspace.WorkspacesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkspacesController {

	@Autowired
	private WorkspacesService workspaceService;

	@JsonGetMapping("/workspaces/{role}")
	public WorkspacesResponse getWorkspaces(@PathVariable(value = "role") String role) {
		return workspaceService.getWorkspacesByUserRole(role);
	}
}
