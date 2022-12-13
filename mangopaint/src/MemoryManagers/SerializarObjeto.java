/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MemoryManagers;

/**
 *
 * @author eparr
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class SerializarObjeto {

    public static boolean serializarObjeto(String direccionArchivo, Serializable objeto) {
        boolean sw = false;
        String sCarpAct = System.getProperty("user.dir");
        try (FileOutputStream fos = new FileOutputStream(sCarpAct + "/src/OUTPUT_BINDER/" + direccionArchivo);
                ObjectOutputStream salida = new ObjectOutputStream(fos);) {
            salida.writeObject(objeto);
            sw = true; System.out.println("OBJETO SERIALIZADO");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sw;
    }

    public static <E> E deserializarObjeto(String direccionArchivo, Class<E> claseObjetivo) {
        E objeto = null;
        String sCarpAct = System.getProperty("user.dir");
     
        try (FileInputStream fis = new FileInputStream(sCarpAct + "/src/OUTPUT_BINDER/" + direccionArchivo);
                ObjectInputStream entrada = new ObjectInputStream(fis);) {
            objeto = (E) entrada.readObject(); System.out.println("RECEIBED DATA");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objeto;
    }

}

