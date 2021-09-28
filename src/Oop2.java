class Math2 {
    public int W;

    public Math2(){

    }
    public double add(double x, double y){
        return x + y;
    }
    public int add(int x, int y){
        return x + y;
    }
}

class Oop2{
    public static void main(String[] args) {
        Math2 m = new Math2();
        System.out.println(m.add(3,2));
        System.out.println(m.add(4.0,2.1));
        System.out.println(m.W);
    }
}
