/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_joseluispereirao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 *
 */
public class admin_usuario {

    private ArrayList<Usuario> listaPersona = new ArrayList();
    private File Archvio = null;

    public admin_usuario(String path) {
        this.Archvio = new File(path);
    }

    public ArrayList<Usuario> getListaPersona() {
        return listaPersona;
    }

    public void setListaPersona(ArrayList<Usuario> listaPersona) {
        this.listaPersona = listaPersona;
    }

    public File getArchvio() {
        return Archvio;
    }

    public void setArchvio(File Archvio) {
        this.Archvio = Archvio;
    }

    public void setPersona(Usuario p) {
        this.listaPersona.add(p);

    }

    @Override
    public String toString() {
        return "adminPersona{" + "listaPersona=" + listaPersona + '}';
    }

    public void cargarArchivo() {
        try {
            listaPersona = new ArrayList<>();
            Usuario temp;
            if (Archvio.exists()) {
                FileInputStream entrada = new FileInputStream(Archvio);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Usuario) objeto.readObject()) != null) {
                        listaPersona.add(temp);

                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;

        try {
            fw = new FileOutputStream(Archvio);
            bw = new ObjectOutputStream(fw);
            for (Usuario persona : listaPersona) {
                bw.writeObject(persona);
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }

        }
    }
}
