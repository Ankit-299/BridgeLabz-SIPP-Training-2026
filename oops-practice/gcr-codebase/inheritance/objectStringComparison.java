import java.util.Objects;

public class objectStringComparison {
    static class Student {
        int id;
        String name;

        Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return id == student.id && Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Vinit");
        Student s2 = new Student(101, "Vinit");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}

