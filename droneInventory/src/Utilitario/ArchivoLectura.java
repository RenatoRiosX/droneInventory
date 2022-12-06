
package Utilitario;

/**
 *@autor Kevin Helle - Estudiante: 208084;
 *@autor  Renato Rios - Estudiante: 270586;
 */
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ArchivoLectura {

    private Scanner in;
    private String linea;

    public ArchivoLectura(String unNombre) {
        try {
            Path path = Paths.get(unNombre);
            //path.toAbsolutePath();
            in = new Scanner(path.toAbsolutePath());
        } catch (IOException e) {
            System.exit(1);
        }
    }

    public boolean hayMasLineas() {
        boolean hay = false;
        linea = null;
        if (in.hasNext()) {
            linea = in.nextLine();
            hay = true;
        }
        return hay;
    }

    // devuelve la última linea leida
    public String linea() {
        return linea;
    }

    public void cerrar() {
        in.close();
    }
}
