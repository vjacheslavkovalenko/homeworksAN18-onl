/*
 * Домашнее задание.
 ** Задание 1
 *** Необходимо создать класс User со следующими полями:
 ***	имя - строковой параметр;
 ***	профессия - enum (DIRECTOR, WORKER, HR);
 ***	стаж работы - число.
 *** Так же надо создать метод, который будет выводить зарплату данного пользователя.
 *** Подсчет зп должен учитывать стаж работы и профессию (1000 * стаж работы * коэффициент профессии).
 ***
 *** Создайте несколько пользователей с разными параметрами.
 *** Выведете зп каждого сотрудника.
 ***
 *** Создайте еще один метод подсчета зп, но он должен принимать параметр - доп оплата.
 *** Его задача - подсчитывать ЗП и добавлять к ней доп плату.
 *** Проверить правильность работы данного метода.
 */


public class User {

    private String name;
    private Profession profession;
    private Integer workExperience;

    public User(String name, Profession profession, Integer workExperience){
        this.name = name;
        this.profession = profession;
        this.workExperience = workExperience;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Profession getProfession(){
        return profession;
    }

    public void setProfession(Profession profession){
        this.profession = profession;
    }

    public Integer getWorkExperience(){
        return workExperience;
    }

    public void setWorkExperience (Integer workExperience){
        this.workExperience = workExperience;
    }


       // Метод для вывода информации о пользователе
//        @Override
//        public String toString() {
//            return  "name='" + name +
//                    ", profession=" + profession +
//                    ", workExperience=" + workExperience;
//        }

}