package constructor;

public class Test_Construct {
    public static void main(String[] args) {
       // Student student1 = new Student();
        Student obj = new Student("Prasanth", 28, "Male", 1234.00f);

        System.out.println(obj.Name);
        System.out.println(obj.Age);
        System.out.println(obj.Gender);
        System.out.println(obj.Salary);
    }
}
