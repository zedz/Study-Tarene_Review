package day10question;

public abstract class Question {
	protected int id;
	protected String text;
	
	public Question(){	
	}
	public Question(String txt, int id){
		this.text = txt;
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTxt() {
		return text;
	}
	public void setTxt(String txt) {
		this.text = txt;
	}
	public abstract void show();
	public abstract boolean check(char[] answer);

	
}
