
public class MailBuilder {

	FriendMailBuilder AddText(String str) { // ���� ���������
		return new FriendMailBuilder(str);
	}

	public class FriendMailBuilder {

		private String text;

		FriendMailBuilder(String str) { // �����������
			text = str;
		}

		FinalMailBuilder addFriend(Friends f) {// ����������
			return new FinalMailBuilder(text, f);
		}

	}

	public class FinalMailBuilder {
		private Mail obj;

		FinalMailBuilder(String str, Friends f) { // �����������
			obj = new Mail(str, f);
		}

		public Mail Build() {
			return obj;
		}

		public void addOtherFriends(Friends... fs) {
			for (Friends newf : fs) {
				obj.setFriend(newf);
				sendMail();
			}
		}

		public void sendMail() {
			if (obj.getTopic() != "")
				System.out.println("������ ����������. ����������: " + obj.getFriend() + "\t �����: " + obj.getText()
						+ "\t ����: " + obj.getTopic());
			else
				System.out.println("������ ����������. ����������: " + obj.getFriend() + " �����: " + obj.getText());
		}

		public void setTopic(String str) {
			obj.setTopic(str);
		}
	}

}
