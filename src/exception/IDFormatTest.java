package exception;

public class IDFormatTest {
	private String userID;
	private String userPass;
	
	public String getUserID() {
		return userID;
	}
	public String getUserPass() {
		return userPass;
	}
	
	public void setUserID(String userID) throws IDFormatException {
		if(userID == null) {
			throw new IDFormatException("아이디는 null일 수 없습니다.");
		} else if(userID.length()<8 || userID.length()>20) {
			throw new IDFormatException("아이디는 8자이상 20자이하로 쓰세요.");
		}
	this.userID = userID;
	}
	
	public void setUserPass(String userPass) throws PassFormatException {
		if(userPass == null) {
			throw new PassFormatException("비밀번호는 null일 수 없습니다.");
		} else if(userPass.matches("[a-zA-Z]+")) {
			throw new PassFormatException("비밀번호는 문자로만 이루질 수 없습니다.");
		} else if(userPass.length()<5) {
			throw new PassFormatException("비밀번호는 5자이상으로 쓰세요.");
		}
	this.userPass = userPass;
	}
	
	
	public static void main(String[] args) {
		IDFormatTest test = new IDFormatTest();
		
		String userID = null;
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		userID = "1234567";
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		userID = "12345678822";
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(test.getUserID());
		System.out.println();
		
		String userPass = null;
		try {
			test.setUserPass(userPass);
		} catch (PassFormatException e) {
			System.out.println(e.getMessage());
		}
		userPass = "asd";
		try {
			test.setUserPass(userPass);
		} catch (PassFormatException e) {
			System.out.println(e.getMessage());
		}
		userPass = "33";
		try {
			test.setUserPass(userPass);
		} catch (PassFormatException e) {
			System.out.println(e.getMessage());
		}
		userPass = "ABC12345";
		try {
			test.setUserPass(userPass);
		} catch (PassFormatException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(test.getUserPass());
	}
}
