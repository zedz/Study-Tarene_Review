package day10question1;


public class SingleQuestion 
   extends Question{

  /** ???????????? */
  private Option[] options;
  /** ???????????????????????? */
  private char answer;

  public SingleQuestion() {
  }
  
  public SingleQuestion(int id, String text, 
      Option[] options, char answer) {
    //super(text);
    this.options = options;
    this.answer = answer;
    this.text = text;
    this.id = id;
    //setText(text);
  }  
  
  public char getAnswer() {
    return answer;
  }
  public void setAnswer(char answer) {
    this.answer = answer;
  }
  public Option[] getOptions() {
    return options;
  }
  public void setOptions(Option[] options) {
    this.options = options;
  }
  
  public boolean check(char[] answer) {
    return answer[0]==this.answer;
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
