package minitest;

import java.io.*;
import java.util.ArrayList;

public class ReadFile<T>{
    public static <T>ArrayList<T> readFile (){
        File file =new File("D:\\Md2\\MD2_W4_Minitest\\src\\minitest\\contact.txt");
        ArrayList<T>Contact = new ArrayList<>();
        try {
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

            Contact = (ArrayList<T>) ois.readObject();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Contact;
    }
}
