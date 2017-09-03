//요 객체를 세션에 담을 거임
package auth.service;

public class User {
	
	private String id;
	private String name;
	
	public User(String id, String name){
		this.id=id;
		this.name=name;
	}
	
	public String getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}

}
