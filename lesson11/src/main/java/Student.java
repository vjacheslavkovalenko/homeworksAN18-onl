import java.util.List;

class Student {
    private String name;
    private String gender;
    private int age;
    private List<String> subjects;

    public Student(String name, String gender, int age, List<String> subjects) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public List<String> getSubjects() {
        return subjects;
    }
}