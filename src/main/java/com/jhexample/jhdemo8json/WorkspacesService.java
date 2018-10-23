package com.jhexample.jhdemo8json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.gson.Gson;
import com.jhexample.jhdemo8json.workspace.*;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

@Service
public class WorkspacesService {
	private static final String ROLE_LIST_DEF_JSON_PATH = "/json/UserRoleWorkspacesMockData.json";
	private static final String ROLES_DEF_JSON_PATH = "/json/UserRolesWorkspaceMockData.json";

	private List<UserRole> userRolesRepo;

	public WorkspacesResponse getWorkspacesByUserRole(String role) {

		loadRolesDataSet();
		if (userRolesRepo != null) {
			UserRole userRole = userRolesRepo.stream()
					.filter(item -> item.getName().equalsIgnoreCase(role))
					.findFirst()
					.orElse(null)
					;

			if (userRole != null) {
				WorkspacesResponse resp = new WorkspacesResponse();
				resp.setDefaultWorkspaceName(userRole.getDefaultWorkspaceName());
				resp.setWorkspaces(userRole.getWorkspaces());
				return resp;
			}
		}

		return null;
	}

	private void loadRolesDataSet() {
		// Jackson
//		ObjectMapper mapper = new ObjectMapper();
//		TypeReference<List<UserRole>> typeReference = new TypeReference<List<UserRole>>() {};
//		InputStream inputStream = TypeReference.class.getResourceAsStream("/json/UserRoleWorkspacesMockData.json");
//		try {
//			List<UserRole> userRolesRepo = mapper.readValue(inputStream, typeReference);
//
//			System.out.println("-------------->");
//			userRolesRepo.stream().forEach(
//					item -> System.out.println(item.getName())
//			);
//			System.out.println("-------------->");
//
//		} catch (IOException e) {
//			System.out.println("Unable load User Roles: " + e.getMessage());
//		}

		// Gson
		try {
//			UserRole[] roles = fromJson(ROLE_LIST_DEF_JSON_PATH, UserRole[].class);
			UserRoles roles = fromJson(ROLES_DEF_JSON_PATH, UserRoles.class);

			if (roles != null) {
//				userRolesRepo = Arrays.asList(roles);
				userRolesRepo = roles.getRoles();
			}
			System.out.println("-------------->");

			userRolesRepo.forEach(
					item -> {
						System.out.println("ROLE: " + item.getName());
						if (item.getWorkspaces() != null) {
							item.getWorkspaces().stream().forEach(
									workspace -> {
										System.out.println("WORKSPACE: " + workspace.getName());
										if (workspace.getApps() != null) {
											workspace.getApps().stream().forEach(
													workspaceApp -> {
														System.out.println("WORKSPACE APP: " + workspaceApp.getName());
													}
											);
										}
									}
							);
						}
					}
			);
			System.out.println("-------------->");

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("FAILURE: " + e.getMessage());
		}

	}

	private <T> T fromJson(String resourcePath, Class<T> targetClass) throws IOException {
		Gson gson = new Gson();

		InputStream inputStream = TypeReference.class.getResourceAsStream(resourcePath);

		if (inputStream == null) {
			return null;
		} else {
			T result = gson.fromJson(new InputStreamReader(inputStream), targetClass);

			inputStream.close();
			return result;
		}

//	private UserRoleList fromJson() throws IOException {
//		Gson gson = new Gson();
//		InputStream inputStream = WorkspaceService.class.getResourceAsStream(ROLES_DEF_JSON_PATH);
//
//		if (inputStream == null) {
//			return null;
//		} else {
//			UserRoleList result = gson.fromJson(new InputStreamReader(inputStream), UserRoleList.class);
//
//			inputStream.close();
//			return result;
//		}
//	}

		// different way of loading resource from path
//		InputStream stream = WorkspacesService.class.getClassLoader().getResourceAsStream(resourcePath);
//		if (stream == null) {
//			System.out.println("--->>> NO RESOURCE FOUND: " + resourcePath);
//			return null;
//		}
//		else {
//			T result = gson.fromJson(new InputStreamReader(stream), targetClass);
//
//			stream.close();
//			return result;
//		}

	}

}
