package day10question;

import java.util.Arrays;

public class MultiChoice extends Question{
	private Option [] options;
	private char[] answer;
	
	public MultiChoice(){
		
	}
	
	public MultiChoice(int id,String text,Option[] options,char[] answer){
		this.id = id;
		this.text = text;
		this.options = options;
		this.answer = answer;
	}

	public Option[] getOptions() {
		return options;
	}

	public void setOptions(Option[] options) {
		this.options = options;
	}

	public char[] getAnswer() {
		return answer;
	}

	public void setAnswer(char[] answer) {
		this.answer = answer;
	}

	@Override
	public void show() {
		System.out.println(this.text);
		for(int i=0;i<options.length;i++){
			Option o = options[i];
			System.out.println(o.getId()+"."+o.getText()+"\t");
		}
		System.out.println();
		
	}

	@Override
	public boolean check(char[] answer) {
		return Arrays.equals(this.answer,answer);
	}
	

}
