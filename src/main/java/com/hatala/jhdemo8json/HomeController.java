package com.hatala.jhdemo8json;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "Endpoint for Home Page.")
public class HomeController {

	@JsonGetMapping("/")
	@ApiOperation("Shows HOME info page")
	public String home() {
		return "View endpoints:\n" +
				"localhost:8080/v2/api-docs\n" +
				"\n" +
				"View Swagger UI:\n" +
				"localhost:8080/swagger-ui.html\n" +
				"\n" +
				"View Role\n" +
				"localhost:8080/workspaces/Role1\n" +
				"localhost:8080/workspaces/Role2\n" +
				"localhost:8080/workspaces/Role3\n" +
				"\n" +
				"localhost:8080/workspaces?role=Role1\n" +
				"localhost:8080/workspaces?role=Role2\n" +
				"localhost:8080/workspaces?role=Role3\n" +
				"";
	}

}
