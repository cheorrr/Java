package HomeworkAndReview0109;

public class charAtExample {
	public static void main(String[] args) {
		String ssn = "9506241230123";
		char gender = ssn.charAt(6);
		switch (gender) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		}
	}
}
