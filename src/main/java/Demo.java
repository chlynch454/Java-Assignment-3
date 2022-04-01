public class Demo {
    public static void main(String[] args) {
        Person bob = new Person("Coach Bob", 27,"M");
        System.out.println(bob);

        Student lynne = new Student("Lynne Brooks", 16, "F", "HS95129", 3.5);
        System.out.println(lynne);

        Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
        System.out.println(mrJava);

        CollegeStudent ima  = new CollegeStudent("ima", 18, "F", "UCB123", 4.0, "business", 1);
        System.out.println(ima);
    }
}

