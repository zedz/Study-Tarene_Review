package day10question;

public class Option {
	private char id;
	private String text;
	
	public Option(){
		
	}
	public Option(char id,String text){
		this.text=text;
		this.id=id;
	}
	public char getId() {
		return id;
	}
	public void setId(char id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
}
