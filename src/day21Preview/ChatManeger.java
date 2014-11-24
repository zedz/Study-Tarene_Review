package day21Preview;

public class ChatManeger {
	private ChatManeger(){}
	private static final ChatManeger cm = new ChatManeger();
	public static ChatManeger getChatManeger(){
		return cm;
		
	}
}
