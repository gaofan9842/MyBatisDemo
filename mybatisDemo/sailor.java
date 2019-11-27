package mybatisDemo;

public class sailor {
	private int sid;
    private String sname;
    private int rating;
    private int age;
    
    public int getsid() {
        return sid;
    }
    public void setsid(int num) {
        this.sid = num;
    }
    public String getsname() {
        return sname;
    }
    public void setsname(String name) {
        this.sname = name;
    }
    public int getrating() {
        return rating;
    }
    public void setrating(int rating) {
        this.rating = rating;
    }
  
    
    public int getage() {
        return age;
    }
    public void setage(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "sailors [sid=" + sid + ", sname=" + sname + ", rating=" + rating +", age="+age+"]";
    }
}
