package com.hatala.jhdemo8json;

import com.hatala.jhdemo8json.workspace.WorkspacesResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "Endpoints for workspaces configuration presentation.")
public class WorkspacesController {

	@Autowired
	private WorkspacesService workspaceService;

	@JsonGetMapping("/workspaces/{role}")
	@ApiOperation("Shows workspaces definition for specified user role")
	public WorkspacesResponse getWorkspaces(
			@ApiParam("User Role, eg: Role1, Role2, Role3. Cannot be empty.")
			@PathVariable(value = "role") String role) {
		return workspaceService.getWorkspacesByUserRole(role);
	}
}
