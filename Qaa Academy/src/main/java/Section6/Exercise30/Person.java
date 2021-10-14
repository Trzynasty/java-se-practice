package Section6.Exercise30;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0 || age>100) this.age = 0;
        else this.age = age;
    }

    public boolean isTeen(){
        return age > 12 && age < 20;
    }

    public String getFullName(){
        String s;
        if(firstName.isEmpty() || lastName.isEmpty()) s=firstName+lastName;
        else s=this.getFirstName() + " " + this.getLastName();
        return s;
    }
}
