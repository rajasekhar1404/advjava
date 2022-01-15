import java.io.Serializable;

// public Student(){}

public class Student implements java.io.Serializable{
    private int rollnumber;
    private String name;

    public String getName()
    {
        return name;
    }
    public void setName(String r)
    {
        name=r;
    }

    public int getRollnumber()
    {
        return rollnumber;
    }
    public void setRollnumber(int r)
    {
        rollnumber=r;
    }
}