/**
 * 인터페이스
 * @author TJ
 *
 */
interface PersonAction {
	
	int giveMoney();
	void sayName();
	
}

interface DogAction {
	void bark();
}

class Person implements PersonAction, DogAction {

	@Override
	public int giveMoney() {
		return 100;
	}
	
	@Override
	public void sayName(){
		System.out.println("하악");
	}
	
	@Override 
	public void bark() {
		System.out.println("왈왈");
	}
}


public class InterfaceExample {

	 public static void main(String[] args) {
		 Person p = new Person();
		 p.sayName();
		
		 PersonAction action = new Person(); 
		 DogAction dAction = new Person();
		 
		 action.sayName();
		 dAction.bark();
		 ((PersonAction)dAction).sayName();
		 ((Person)dAction).bark();
		 ((Person)dAction).sayName();
		 ((Person)dAction).giveMoney();
		 
		 System.out.println("action instance of PersonAction" + (action instanceof PersonAction));
		 System.out.println("action instance of PersonAction" + (action instanceof DogAction));
		 System.out.println("action instance of PersonAction" + (action instanceof Person));
		 System.out.println("action instance of PersonAction" + (action instanceof Object));
			
		 //-- 익명 구현객체
		 PersonAction anoObj = new PersonAction() {

			@Override
			public int giveMoney() {
				// TODO Auto-generated method stub
				return 2000;
			}

			@Override
			public void sayName() {
				// TODO Auto-generated method stub
				System.out.println("익명객체에서 구현");
			}
			 
		 };
		 
		 anoObj.sayName();

	 }
}
