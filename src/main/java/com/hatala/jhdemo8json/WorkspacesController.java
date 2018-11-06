package com.hatala.jhdemo8json;

import com.hatala.jhdemo8json.workspace.WorkspacesResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "Endpoints for workspaces configuration presentation.")
public class WorkspacesController {

	@Autowired
	private WorkspacesService workspaceService;

	@JsonGetMapping("/workspaces/{role}")
	@ApiOperation("Shows workspaces definition for specified user role. User role as a resource")
	public WorkspacesResponse getWorkspacesResource(
			@ApiParam("User Role, eg: Role1, Role2, Role3. Cannot be empty.")
			@PathVariable(value = "role") String role) {
		return workspaceService.getWorkspacesByUserRole(role);
	}

	@JsonGetMapping("/workspaces")
	@ApiOperation("Shows workspaces definition for specified user role. User role as parameter.")
	public WorkspacesResponse getWorkspacesParam(
			@ApiParam("User Role, eg: Role1, Role2, Role3. Cannot be empty.")
			@RequestParam(value = "role", defaultValue = "Role1") String role) {
		return workspaceService.getWorkspacesByUserRole(role);
	}
}
