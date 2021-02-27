class Student {
    private int subjectA,subjectB,subjectC;

    public int studentsTotalMarksInAllSubjects(Student[] students) {
        int l=students.length;
        int totalMarks=0;
        for (int i=0;i<l ;i++ ) {
            totalMarks =totalMarks +{students[i].subjectA+students[i].subjectB+students[i].subjectC};
        }
        return totalMarks;
    }
    public double studentsAverageMarksInAllSubjects(Student[] students) {
        int totalMarks=studentsTotalMarksInAllSubjects(students);
        
    }
    public int[] subjectWiseMarks(Student[] students,String subjectName){

    }
    public int subjectATotalByStudents(int[] marks) {

    }
    public int subjectBTotalByStudents(int[] marks) {

    }
    public int subjectCTotalByStudents(int[] marks) {

    }

   public int subjectTotalByStudents(int[] marks){

   }

    public double subjectAAverageByStudents(int[] marks) {

    }
    public double subjectBAverageByStudents(int[] marks) {

    }
    public double subjectCAverageByStudents(int[] marks) {

    }

}

public class Assignment1Q9 {

    public static void main(String[] args) {}
}

