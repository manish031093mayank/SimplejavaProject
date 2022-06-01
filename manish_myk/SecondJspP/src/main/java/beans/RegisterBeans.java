package beans;

public class RegisterBeans 
{
  private String name,email,mobile,password;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
	System.out.println(name);
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
	System.out.println(email);
}

public String getMobile() {
	return mobile;
}

public void setMobile(String mobile) {
	this.mobile = mobile;
	System.out.println(mobile);
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
	System.out.println(password);
}
}
