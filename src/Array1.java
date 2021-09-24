public class Array1 {
    public static void main(String[] args) {
        int[] x;
        double[][] y;
        int i, j, row, col;
        if(args.length!=2){
            System.out.println("Usage: java array1 row columns");
            System.exit(0);
        }

        //init the arrays
        row = Integer.parseInt(args[0]); //converts args as String to int
        col = Integer.parseInt(args[1]);
        x = new int[row];
        y = new double [row][col];
        for (i=0;i<row;i++){
            x[i] = i;
        }
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                y[i][j] = Math.random();
            }
        }

        //display the arrays
        System.out.print("x[]=");
        for(i=0;i<row;i++){
            System.out.print(x[i] + "\t");
        }
        System.out.println();
        System.out.println("y[][]=");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                System.out.print(y[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
