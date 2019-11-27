package mybatisDemo;
public class boats {
	private int bid;
    private String bname;
    private String color;

    
    public int getbid() {
        return bid;
    }
    public void setbid(int num) {
        this.bid = num;
    }
    public String getbname() {
        return bname;
    }
    public void setbname(String name) {
        this.bname = name;
    }
    public String getcolor() {
        return color;
    }
    public void setcolor(String color) {
        this.color = color;
    }
  
    @Override
    public String toString() {
        return "boats [bid=" + bid + ", bname=" + bname + ", color=" + color +"]";
    }

}
