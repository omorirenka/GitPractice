package dto;

public class Account16 {
	private int id,age;
	private String name,gender,tel,mail,salt,password;

	public Account16(int id, String name, int age, String gender, String tel, String mail, String salt,String password) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.tel = tel;
		this.mail = mail;
		this.salt = salt;
		this.password = password;
	}
	

	public Account16(String name,int age,  String gender, String tel, String mail) {
		super();
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.tel = tel;
		this.mail = mail;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
