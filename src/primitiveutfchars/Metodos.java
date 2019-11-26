package primitiveutfchars;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Alba
 */
public class Metodos {

    public static void gravarUTFChars() throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream("texto6.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            DataOutputStream dos = new DataOutputStream(bos);
            FileInputStream fis = new FileInputStream("texto6.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            DataInputStream dis = new DataInputStream(bis);

            String s = "Está en casa";
            System.out.println("WriteUTF escribiu: " + s);
            System.out.println("WriteChars escribiu: " + s);
            System.out.println("WriteUTF escribiu: " + s);
            System.out.println("");
            
            dos.writeUTF(s);
            dos.writeChars(s);
            dos.writeUTF(s);
            dos.close();

                System.out.println("Lemos a primeira cadea mediante readUTF: " + dis.readUTF());


            System.out.print("Lemos a segunda cadea mediante readChar (con bucle): ");
            for (int i = 0; i < s.length(); i++) {
                System.out.print(dis.readChar());
            }


            System.out.println("\nLemos a terceira cadea  mediante readUTF: " + dis.readUTF());

            dis.close();
//            bos.close(); //no son estrictamente necesarios
//            fos.close();
//            bis.close();
//            fis.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
