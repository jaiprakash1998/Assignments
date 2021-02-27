abstract class newclass{

}
abstract class notEmptyClass{
	void method(){System.out.println("not empty class");}
}

class Assignment2Q4 extends notEmptyClass{
	@Override
	void method(){
		System.out.println("Override class");
	}
	public static void main(String[] args) {
		Assignment2Q4 a=new Assignment2Q4();
		a.method();
	}
}