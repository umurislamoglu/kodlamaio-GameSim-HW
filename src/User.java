
public class User {
 private int id;
 private String firstName;
 private String lastName;
 private Games[] games;  
 private String userName ;
 private String birthYear ;
 private String tckn;
 
public User() {
	
}
public User(int id, String firstName, String lastName,String birthYear,String tckn) {
	
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.birthYear =birthYear;
	this.tckn = tckn;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public Games[] getGames() {
	return games;
}
public void setGames(Games[] games) {
	this.games = games;
}
public String getUserName() {
	return userName;
}
public void setUserName() {
	this.userName = this.firstName+this.lastName;
}
public String getBirthYear() {
	return birthYear;
}
public void setBirthYear(String birthYear) {
	this.birthYear = birthYear;
}
public String getTckn() {
	return tckn;
}
public void setTckn(String tckn) {
	this.tckn = tckn;
}
	
}
