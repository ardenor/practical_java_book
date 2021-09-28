public class Method2 {
    public void pupAge(){
        int age = 0;
        age = age + 7;
        System.out.println("Puppy age is: " + age);
    }

    public static void main(String[] args) {
        Method2 test = new Method2(); //create a method2 object
        test.pupAge(); //call pupAge method of Method2 object/class
    }
}
