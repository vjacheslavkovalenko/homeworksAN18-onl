public class LoginService {

    public void login(User user){
        Validator validator = new Validator();
        try {
            validator.validate(user);
        }catch (AgeRangeException exc){
                user.setAge(20);
        }

        System.out.println("Save user to database");
    }
}
