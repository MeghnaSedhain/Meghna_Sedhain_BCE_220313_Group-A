public class Student {
    
    String name;
    String phone;
    String address;

    public Student() {
        this.name = "Zake";
        this.phone = "123456789";
        this.address = "Kathmandu";
    }

    public static void main(String[] args) {

        Student studentObject = new Student();

        System.out.println(studentObject.name);
        System.out.println(studentObject.phone);
        System.out.println(studentObject.address);

        System.out.println(studentObject.name + studentObject.phone + studentObject.address);

        System.out.println(studentObject.name);
        System.out.println(studentObject.phone);
        System.out.println(studentObject.address);
    }
}