package week04;

class tmethod{
	String title;
	String author;
	void show() {System.out.println(title + " " + author);}
	
	public tmethod() {this("",""); System.out.println("생성자 호출됨");}
	
	public tmethod(String title) {this(title, "작자미상");}
	
	public tmethod(String title, String author) {this.title = title; this.author = author;}
}

public class P203_this메소드 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tmethod LP = new tmethod("어린왕자", "생텍쥐페리");
		tmethod LS = new tmethod("춘향전");
		tmethod EB = new tmethod();
		
		LP.show();
		LS.show();
		EB.show();
		

	}

}
