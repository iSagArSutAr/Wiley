package Assignment;

public class Date {
	int dd,mm,yy;
	
	public Date(int dd,int mm,int yy) {
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public void displayDate() {
		System.out.println(dd+"/"+mm+"/"+yy);
	}
	
	public void checkDate() {
		int dd=this.dd,mm=this.mm,yy=this.yy;
		
		if(dd==0||mm==0||yy==0||dd>31||mm>12) {
			System.out.println("Not valid");
		}else
			System.out.println("valid");
	}
	
	public static void main(String[] a) {
		Date date=new Date(91,1,2121);
		date.displayDate();
		date.checkDate();
	}
	

}
