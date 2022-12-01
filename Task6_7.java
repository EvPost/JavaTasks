import java.io.*;
import java.nio.ByteBuffer;
import java.nio.file.*;

public class Task6_7 {
    public static void main(String[] args) throws IOException{
        String filename = "file1";
        byte[] allBytes = Files.readAllBytes(Paths.get(filename));
        int times = Double.SIZE/ Byte.SIZE;
        double[] doubles = new double[byteArray.length / times];
        for(int i=0;i<doubles.length;i++){
            doubles[i] = ByteBuffer.wrap(byteArray, i*times, times).getDouble();
        }

        double maxS = 0;
        for(int i=0;i<doubles.length;i=i+4){
            if((doubles[i+2]-doubles[i])*(doubles[i+1]-doubles[i+3])>maxS){
                maxS = (doubles[i+2]-doubles[i])*(doubles[i+1]-doubles[i+3]);
            }
        }
        System.out.println("Максимальна площя: "+maxS);
    }
    
}
