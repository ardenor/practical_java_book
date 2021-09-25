import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextRead1 {
    public static void main(String[] args) {
        String filename = "";
        if(args.length==1){
            filename = args[0];
        } else{
            System.out.println("Usage: java TextRead1 Filename.txt");
            System.exit(0);
        }

        try{
            FileReader file = new FileReader(filename);
            BufferedReader filebuff = new BufferedReader(file);
            boolean endof = false;
            String line;
            while(!endof){ //by default its not the end of the file
                line = filebuff.readLine(); //read file contents
                if(line == null){ //if the read ever returns null, then it is endof and break
                    endof = true;
                    break;
                }
                System.out.println(line);
            }
            System.out.println("End of file...");
            file.close();
        } catch (IOException e){
            System.err.println("Error -- " + e.toString());
        }
    }
}
