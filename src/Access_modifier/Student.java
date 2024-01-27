package Access_modifier;

public class Student {
    private String name;
    private String classes;
    private Student(){
        this.name = "john";
        this.classes = "C02";
    }
    public void setName(String name){
        this.name = name;
    }
    public void setClasses(String classes){
        this.classes = classes;
    }
}
