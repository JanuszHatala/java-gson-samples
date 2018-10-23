package com.jhexample.jhdemo8json;

import com.jhexample.jhdemo8json.workspace.WorkspacesResponse;
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
