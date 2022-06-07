package ObjectOrientedProgramming;

public class GetterSetters {

    private String name;
    private int age;
    private int year;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void lars(){
        GetterSetters a = new GetterSetters();
        a.setAge(24);
        a.setName("Lars");
        a.setYear(1998);
        System.out.println(a.getName() + "\n" + a.getAge() + "\n" + a.getYear());
    }


    public static void main(String[] args) {
        GetterSetters go = new GetterSetters();
        go.lars();
    }
}
