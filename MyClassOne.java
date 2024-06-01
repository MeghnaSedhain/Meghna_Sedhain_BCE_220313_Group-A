public class MyClassOne {

    private String name;
    private String phone;
    private final String address = "Kathmandu";

    public MyClassOne() {
        this.name = "John";
        this.phone = "123";
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public static void main(String[] args) {
        
        MyClassOne myClassOne = new MyClassOne();

        System.out.println("Name: " + myClassOne.getName());
        System.out.println("Phone: " + myClassOne.getPhone());
        System.out.println("Address: " + myClassOne.getAddress());

    }
}
