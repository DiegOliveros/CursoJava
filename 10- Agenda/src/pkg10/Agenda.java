/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author natog
 */
public class Agenda {

    private Contacto[] contactos;

    public Agenda() {
        this.contactos = new Contacto[10];
    }

    public Agenda(int tamanio) {
        this.contactos = new Contacto[tamanio];
    }

    public Contacto[] getContactos() {
        return contactos;
    }

    public void aniadirContacto(Contacto c) {
        if (existeContacto(c)) {
            JOptionPane.showMessageDialog(null, "El contacto con ese nombre ya existe");
        } else if (agendaLlena()) {
            JOptionPane.showMessageDialog(null, "La agenda esta llena, no se pueden ingresar mas contactos");
        } else {
            boolean encontrado = false;
            for (int i = 0; i < contactos.length && !encontrado; i++) {
                if (contactos[i] == null) {
                    contactos[i] = c;
                    encontrado = true;
                }
            }

            if (encontrado) {
                JOptionPane.showMessageDialog(null, "Se ha añadido");
            } else {
                JOptionPane.showMessageDialog(null, "No se ha podido añadir");
            }
        }
    }

    public void eliminarContacto(Contacto c) {
        boolean encontrado = false;
        for (int i = 0; i < contactos.length && !encontrado; i++) {
            if (contactos[i] != null && contactos[i].equals(c)) {
                contactos[i] = null;
                encontrado = true;
            }
        }

        if (encontrado) {
            JOptionPane.showMessageDialog(null, "Se ha eliminado el contacto");
        } else {
            JOptionPane.showMessageDialog(null, "El Contacto no existe");
        }
    }

    public boolean existeContacto(Contacto c) {
        for (Contacto contacto : contactos) {
            if (contacto != null && c.equals(contacto)) {
                return true;
            }
        }
        return false;
    }

    public boolean agendaLlena() {
        for (Contacto contacto : contactos) {
            if (contacto == null) {
                return false;
            }
        }
        return true;
    }

   
}
