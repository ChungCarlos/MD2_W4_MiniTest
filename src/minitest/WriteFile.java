package minitest;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteFile <T> {
    public static void writeFile(List<Contact>dataList){
        try{
            File file = new File("D:\\Md2\\MD2_W4_Minitest\\src\\minitest\\contact.txt");
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(dataList);
            oos.close();
            os.close();
        } catch (FileNotFoundException e){
            throw new RuntimeException();
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
