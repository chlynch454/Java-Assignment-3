class CollegeStudent extends Student{
    protected String major;
    protected int year;

    CollegeStudent(String name, int age, String gender, String idNum, double gpa, String major, int year ) {
        super(name, age, gender, idNum, gpa);
        this.major = major;
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
       this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){
        return super.toString() + major + " " + year;
    }
}



