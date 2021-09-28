public class Method3 {
    public static void main(String[] args) {
        double x = Integer.parseInt(args[0]), y = Integer.parseInt(args[1]); //takes first and second args
        double s = add(x, y);
        System.out.println("The sum of x and y is: " + s);
    }

    //add method
    private static double add (double x, double y){
        return x + y;
    }
}
