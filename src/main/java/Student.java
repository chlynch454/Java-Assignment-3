 class Student extends Person {
    protected String myIdNum;
    protected double myGPA;

     Student(String name, int age, String gender, String idNum, double gpa){
         super(name, age,  gender);
         myIdNum = idNum;
         myGPA = gpa;

     }
     public String getMyIdNum() {
         return myIdNum;
     }

     public void setMyIdNum(String myIdNum) {
         this.myIdNum = myIdNum;
     }

     public double getMyGPA() {
         return myGPA;
     }

     public void setMyGPA(double myGPA) {
         this.myGPA = myGPA;
     }


}
