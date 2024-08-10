public class Validator {

    public void validate(User user){
        String login = user.getLogin();
        Integer age = user.getAge();

        if (login == null || login.length() < 5){
            throw new LoginInputException();
        }

        if (age == null || age < 20 || age > 100){
            throw new AgeRangeException();
        }

    }

}
