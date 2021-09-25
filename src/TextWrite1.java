import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextWrite1 {
    public static void main(String[] args) {
        String filename = "";
        if(args.length==1){
            filename = args[0];
        } else {
            System.out.println("Usage: java TextWrite1 Filename.txt");
            System.exit(0);
        }

        try{
            FileWriter file = new FileWriter(filename); //writes the new file
            BufferedWriter filebuff = new BufferedWriter(file); //sets a buffer to add to file
            for(int i = 0; i < 10; i++){
                filebuff.write(i  + "\t" + i * i + "\n"); //write in buffer normally in small write requests
            }
            filebuff.flush(); //when buffer is full or flush is called, whole buffer written to file in one go
            file.close();
        } catch(IOException e){
            System.err.println("Error -- " + e.toString());
        }


    }
}
