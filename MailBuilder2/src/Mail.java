
public class Mail {
	private String text;
	private Friends friend;
	private String topic;

	Mail(String str, Friends f) {
		text = str;
		friend = f;
		topic = "";

	}

	String getText() {
		return text;
	}

	void setFriend(Friends f) {
		friend = f;
	}

	Friends getFriend() {
		return friend;
	}

	String getTopic() {
		return topic;
	}

	void setTopic(String t) {
		topic = t;
	}
}
