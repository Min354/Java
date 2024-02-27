package 과제4;


interface Speakable{
	void speak();
}

class Dog implements Speakable{
	public void speak() {
		System.out.println("멍멍");
	}
}

class Person implements Speakable{
	int age;
	String name;
	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}
	public void speak() {
		if(this.age<2)
			System.out.println("응애");
		else
			System.out.println("안녕");
	}
}

public class 과제4_Practice48 {
	public static void speak3Times(Dog d) {
		d.speak(); d.speak(); d.speak();
	}
	public static void speak3Times(Person p) {
		p.speak(); p.speak(); p.speak();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog myDog = new Dog();
		Person p1 = new Person("김동덕", 1);
		Person p2 = new Person("홍길동", 20);
		
		speak3Times(myDog);
		speak3Times(p1);
		speak3Times(p2);
	}

}
