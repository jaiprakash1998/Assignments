class Rectangle5 extends Shape5 {
    @Override
    public String draw() {
    	return "rectangle class";
    }
}

class Line5 extends Shape5{
    @Override
    public String draw() {
    	return "Line class";
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {
    	return "circle class";
    }
}
abstract class Shape5 {
    abstract public String draw();
}
class Assignment2Q5{
    public static void main(String[] args) {
    	Cube5 c=new Cube5();
    	Rectangle5 r=new Rectangle5();
    	Line5 l=new Line5();
    	c.draw();
    	r.draw();
    	l.draw();
    }
}