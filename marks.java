import java.util.*;


class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
    	double totalmarks=subject1Marks+subject2Marks+subject3Marks;
    	if(totalmarks>60){
    		return "Passed";
    	}
    	else if(subject1Marks+subject2Marks>60 || subject1Marks+subject3Marks>60 || subject2Marks+subject3Marks>60){
    		return "Promoted";
    	}
    	else if(subject1Marks>60||subject2Marks>60||subject3Marks>60||totalmarks<60){
    		return "Failed";
    	}
    	else 
    		return "No Result";
    }

}
 class maincls {
    public static void main(String[] args) {
    	 double subject1Marks;double subject2Marks;double subject3Marks;
    	ResultDeclaration r=new ResultDeclaration();
    	r.declareResults(10.0,10.0,10.0);
    }
}
