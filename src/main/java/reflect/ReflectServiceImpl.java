package reflect;

public class ReflectServiceImpl {
    public String name;

    public ReflectServiceImpl() {    }

    public ReflectServiceImpl(String name) {
        this.name = name;
    }

    public void sayHi() {
        System.out.println("Hi " + this.name);
    }

    public void location(String country, String city) {
        System.out.println("Country: " + country + " City: " + city);
    }
}
