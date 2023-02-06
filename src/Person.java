import java.time.LocalDate;

public class Person {
    private String firstname;
    private String lastname;
    private LocalDate dateofbirth;

    public void setFirstname(String name1){
        firstname=name1;
    }
    public String getFirstname(){
        return firstname;
    }

    public void setLastname(String name2){
        lastname=name2;
    }
    public String getLastname(){
        return lastname;
    }

    public void setDateofbirth(LocalDate date){
        dateofbirth=date;
    }
    public LocalDate getDateofbirth(){
        return dateofbirth;
    }


}
