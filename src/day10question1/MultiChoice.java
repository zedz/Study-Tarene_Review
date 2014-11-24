package day10question1;

import java.util.Arrays;

public class MultiChoice extends Question {

  private Option[] options;
  private char[] answers;
  
  public MultiChoice() {
  }  
  public MultiChoice(int id, String text,
      Option[] options, char[] answers) {
    this.id = id;
    this.answers = answers;
    this.options = options;
    this.text = text;
  }
  public char[] getAnswers() {
    return answers;
  }
  public void setAnswers(char[] answers) {
    this.answers = answers;
  }
  public Option[] getOptions() {
    return options;
  }
  public void setOptions(Option[] options) {
    this.options = options;
  }
  public boolean check(char[] answer) {
    return Arrays.equals(this.answers, answer);
  }
  public void show() {
    System.out.println(text);
    for (int i = 0; i < options.length; i++) {
      Option o = options[i];
      System.out.print(o.getId() + 
            "." + o.getText() + "\t");
    }
    System.out.println();

  }
  
}
