
public class MailBuilder {

	FriendMailBuilder AddText(String str) { // тело сообщения
		return new FriendMailBuilder(str);
	}

	public class FriendMailBuilder {

		private String text;

		FriendMailBuilder(String str) { // конструктор
			text = str;
		}

		FinalMailBuilder addFriend(Friends f) {// получатель
			return new FinalMailBuilder(text, f);
		}

	}

	public class FinalMailBuilder {
		private Mail obj;

		FinalMailBuilder(String str, Friends f) { // конструктор
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
				System.out.println("Письмо отправлено. Получатель: " + obj.getFriend() + "\t Текст: " + obj.getText()
						+ "\t Тема: " + obj.getTopic());
			else
				System.out.println("Письмо отправлено. Получатель: " + obj.getFriend() + " Текст: " + obj.getText());
		}

		public void setTopic(String str) {
			obj.setTopic(str);
		}
	}

}
