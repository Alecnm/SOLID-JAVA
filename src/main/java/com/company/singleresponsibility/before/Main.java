package com.company.singleresponsibility.before;

import java.io.IOException;

//Main class to test
public class Main {
	//A valid USER JSON String
	private static final String VALID_USER_JSON = "{\"name\": \"Alec\",
													 \"email\": \"Alecnm@email.com\",
													  \"address\":\"606 Cold Street\"
													}";
	
	//Invalid USER JSON String - email format wrong
	private static final String INVALID_USER_JSON = "{\"name\": \"Adri\", 
                                                        \"email\": \"adri@email\",
                                                        \"address\":\"203 Sloth Park\"
                                                        }";
	
	public static void main(String[] args) throws IOException {
		UserController controller = new UserController();
		//Check with valid JSON
		String response = controller.createUser(VALID_USER_JSON);	
		if(!response.equalsIgnoreCase("SUCCESS")) {
			System.err.println("Failed");
		}
		System.out.println("Valid JSON received response: "+response);
		//Check with invalid JSON
		response = controller.createUser(INVALID_USER_JSON);
		if(!response.equalsIgnoreCase("ERROR")) {
			System.err.println("Failed");
		}
		System.out.println("Invalid JSON received response: "+response);
	}

}
