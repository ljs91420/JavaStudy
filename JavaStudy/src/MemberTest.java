public class MemberTest {
	public static void main(String[] args) {
		Member person = new Member();
		System.out.println(person.toString());
	}
}

class Member {
	String userId;
	String name;
	int age;
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return String.format("회원 아이디: %s, 회원 이름: %s, 회원 나이: %d", userId, name, age);
	}
	
	public Member() {
		name = "홍길동";
		userId = "user01";
		age = 100;
	}
}