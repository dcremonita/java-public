package superClass;

public class otherOne {

    String text="hello";
    otherOne() {}
    protected otherOne(String text) {}
    protected void setText(String text) { this.text = text; }
    public String toString() {  return text;  }
}