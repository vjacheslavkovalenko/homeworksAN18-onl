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

}