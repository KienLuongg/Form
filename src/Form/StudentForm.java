package Form;

public class StudentForm {
    private String name;
    private String email;
    private String mark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public StudentForm() {
    }

    public StudentForm(String name, String email, String mark) {
        this.name = name;
        this.email = email;
        this.mark = mark;
    }

    public String toString(){


        return this.name+"--"+this.email+"--"+this.mark+"\n";
    }
}