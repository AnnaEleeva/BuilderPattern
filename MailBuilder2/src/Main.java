
public class Main {

	public static void main(String[] args) {
		// Mail myMail1=new
		// MailBuilder().AddText("Hello").addFriend(Friends.Alex).Build();//build должен
		// вернуть Mail

		MailBuilder.FinalMailBuilder finb = new MailBuilder().AddText("Hello").addFriend(Friends.Alex);
		Mail myMail1 = finb.Build();
		finb.setTopic("Животные");
		finb.sendMail();
		finb.addOtherFriends(Friends.Bob, Friends.Masha, Friends.Ivan);

	}

}
