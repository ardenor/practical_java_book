interface Animal1{
    public void speak();
}

class Dog implements Animal1{ //implements is meant for interfaces
    public void speak(){
        System.out.println("Woof woof!");
    }

    public static void main(String[] args) {
        Dog p = new Dog();
        p.speak();
    }
}

