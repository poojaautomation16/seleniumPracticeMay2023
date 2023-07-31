package testngSessions;

import org.testng.annotations.Test;

public class CRUDOperationTest {
public void createUser() {
	System.out.println("create User");   
   }
   
public void getUser() {
	System.out.println("get User"); 
   }

public void updateUser() {
	System.out.println("update User");    
}

public void deleteUser() {
	System.out.println("delete User");  
}
@Test
public void createUserTest() {
	createUser();   
}
@Test
public void getUserTest() {
	createUser();
	getUser();
}
@Test
public void updateUserTest() {
	createUser();
	getUser();
	updateUser();
	getUser();
}
@Test
public void deleteUserTest() {
	createUser();
	getUser();
	deleteUser();
	getUser();
}
	
	
}
