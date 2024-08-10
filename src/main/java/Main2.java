public class Main2 {
    public static void main(String[] args) {
//        try (User user = new User()) {
//
//        }catch (Exception exc) {
//
//        }

        User user = new User("abcasas",10);
        LoginService loginService = new LoginService();
        loginService.login(user);
    }

}
