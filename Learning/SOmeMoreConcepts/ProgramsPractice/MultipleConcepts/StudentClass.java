package Learning.SOmeMoreConcepts.ProgramsPractice.MultipleConcepts;

public class StudentClass {
    final double STUDENT_MARKS;
    String name;
    int age;
    
    // 70-76 challenge questions

    public StudentClass(){
        this.STUDENT_MARKS = 0;
        this.name = "nameless";
        this.age = 0;
    }
    public StudentClass(double sTUDENT_MARKS, String name, int age) {
        STUDENT_MARKS = sTUDENT_MARKS;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentClass [name=" + name + ", age=" + age + "]";
    }

    public static void main(String[] args) {
        StudentClass student = new StudentClass();
        student.name = "Krina";
        student.age = 16;
        // student.STUDENT_MARKS = 50; The final class attribute cannot be assigned except through a constructor
        System.out.println(student.toString());

        String str1 = "Krina";
        String str2 = "Patel";
        System.out.printf("%S %S", str1, str2);

        double radius = 10.5;
        double areaOfCircle = Math.PI*Math.pow(radius, 2);
        System.out.printf("Area of circle = %f", areaOfCircle);
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println((int)Math.ceil(Math.random()*6));
        }
        
        String[] arr = new String[]{"This","is","the","best","part","of","this","code"};
        StringBuilder sb = new StringBuilder();
        for (String s: arr){
            sb.append(s + " ");
        }
        System.out.println(sb);

        StudentClass stu = new StudentClass(45, "Krina", 20);
        System.out.println(stu.STUDENT_MARKS);
    }
}
