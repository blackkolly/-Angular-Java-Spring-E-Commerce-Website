package School;

public class Student {
    private String FirstName;
    private String LastName;
    private int Age;
    private String Dept;
    public Student(String FirstName,String LastName,int Age,String Dept) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Age = Age;
        this.Dept = Dept;
    }
    public String getfirstName() {
        return FirstName;
    }
    public void setfirstName(String FirstName) {
        this.FirstName = FirstName;
    }
    public String getlastName() {
        return LastName;
    }
    public void setlastName(String LastName) {
        this.LastName = LastName;
    }
    public int getage() {
        return Age;
    }
    public void setage(int Age) {
        this.Age = Age;
    }
    public String getdept() {
        return Dept;
    }
    public void setdept(String Dept) {
        this.Dept = Dept;
    }

    @Override
    public String toString(){
        return "FirstName :" + FirstName + " LastName:" + LastName + " Age:" + Age + " Department:" + Dept ;

    }
}


