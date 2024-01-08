public class App {
    public static void main(String[] args) throws Exception {

        Student student1 = new Student(null, 0, 0);
        student1.setName("Othman Alkous");
        student1.setAge(23);
        student1.setGpa(3.29);

        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("GPA: " + student1.getGpa());

    }
}
