public class User {

    private String login;
    private Integer age;

    public User(String login, Integer age){
        this.login = login;
        this.age = age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public Integer getAge() {
        return age;
    }
}
