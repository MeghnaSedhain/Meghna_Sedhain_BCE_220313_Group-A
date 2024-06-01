public class TestStatic {
    
    public static void myStaticMethod() {
        System.out.println("I am a static method");
    }

    public void allFreeMethod() {
        System.out.println("I am a non-static method");
    }

    public static void main(String[] args) {
        
        TestStatic.myStaticMethod();

        TestStatic testStaticObject = new TestStatic();

        testStaticObject.allFreeMethod();
    }
}