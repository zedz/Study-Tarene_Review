package day10question1;

public abstract class Question {
  protected int id; 
  /** ???????????? */
  protected String text;
  
  public Question() {
  }
  public Question(String text) {
    this.text = text;
  }
  
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }
  
  public abstract void show() ;
  
  public abstract boolean check(
      char[] answer) ;
  
  
}
