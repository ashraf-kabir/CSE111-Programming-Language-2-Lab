package CSE111lab08.task20;

public class CSE111Student extends CSEStudent {
	
	public String msg;
	
    public CSE111Student(){
        this.msg = "I love Java Programming";
    }
    public String shout(){
        return msg;
    }

}
