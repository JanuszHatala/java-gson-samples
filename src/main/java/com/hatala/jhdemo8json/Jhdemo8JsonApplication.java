package com.hatala.jhdemo8json;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Jhdemo8JsonApplication {

	public static void main(String[] args) {

//		String fileName = "/json/UserRoleListWorkspacesMockData.json";
//		ClassLoader classLoader = new Jhdemo8JsonApplication().getClass().getClassLoader();
//
//		File file = new File(classLoader.getResource(fileName).getFile());
//
//		//File is found
//		System.out.println("File Found : " + file.exists());
//
//		//Read File Content
//		String content = null;
//		try {
//			content = new String(Files.readAllBytes(file.toPath()));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		System.out.println(content);


//		URL resource = Jhdemo8JsonApplication.class.getClassLoader().getResource("/json/UserRoleListWorkspacesMockData.json");
//		InputStream inputStream = null;
//		try {
//			inputStream = resource.openStream();
//			System.out.println("---->STREAM: " + inputStream.toString());
//		} catch (IOException e) {
//			e.printStackTrace();
//			System.out.println("---->STREAM ERROR: " + e.getMessage());
//		}

//		try {
//			FileReader fileReader = new FileReader("/json/UserRoleListWorkspacesMockData.json");
//			System.out.println("---->FILE: " + fileReader.getEncoding());
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//			System.out.println("---->ERROR: " + e.getMessage());
//		}
		SpringApplication.run(Jhdemo8JsonApplication.class, args);
	}
}
