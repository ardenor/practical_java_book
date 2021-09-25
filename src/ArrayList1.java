import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i, j;
        for(i = 0; i < 4; i++){
            list.add(i);
        }
        System.out.println("The total elements of Arraylist list is: " + list.size());

        System.out.println(list);

        System.out.println("The second element is: ");
        System.out.println(list.get(1));
        System.out.println("Now remove the second element: ");
        list.remove(1);
        System.out.println(list);
    }
}
