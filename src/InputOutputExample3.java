import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutputExample3 {
    
    public static void main(String[] args) throws IOException {
        Double i = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//feed system.in into inputstreamreader which goes into bufferedreader
        System.out.print("Enter number: ");
        Double s = Double.parseDouble(br.readLine());
        System.out.print("Enter number again: ");
        try{
            i = Double.parseDouble(br.readLine());//converts strings to integers, integer prompt takes input to the buffer as a string and then gets converted
            
        } catch(NumberFormatException nfe) {
            System.err.println("Invalid format!");
        }
        Double z = s + i;
        System.out.println(z);
    }
}
