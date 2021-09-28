interface Animal2{
    public void speak();
}

class Dog2{
    public static void main(String[] args) {
        //anonymous inner class
        new Animal2(){
            public void speak(){
                System.out.println("Woof woof!");
            }
        }.speak();
    }
}
