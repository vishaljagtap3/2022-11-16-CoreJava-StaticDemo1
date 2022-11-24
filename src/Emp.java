public class Emp {
    private int id;
    private String name;
    private int sal;
    private static String company = "BitCode"; //special type of member
    private static int nextEmpId = 0;

    public Emp(String name, int sal) {
        this.id = ++nextEmpId;
        this.name = name;
        this.sal = sal;
    }

    public void display() {
        System.out.println("id = " + id + " name = " + name + " sal = " + sal + " company = " + company );
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public static String getCompany() {

        return company;
    }

    public static void setCompany(String company) {
        Emp.company = company;
    }
}


//static
/**
 * Static members are allocated memory at compile time.
 * Static  members are allocated memory only once and are shared among all the objects
 * of the class
 */

