package com.mycompany.pro1p1_joselobo;

import java.util.ArrayList;

/**
 *
 * @author Rafa
 */
public class Labotifi_Code {

    public ArrayList<String> Canciones = new ArrayList();
    public ArrayList<String> Albunes = new ArrayList();
    public ArrayList<String> Artistas = new ArrayList();
    public ArrayList<Integer> Lanzamientos = new ArrayList();
    public ArrayList<Integer> Duraciones = new ArrayList();

    public void CrearCancion(String nombre, String albun, String artista, int lanzamiento, int duracion) {

        Canciones.add(nombre);
        Albunes.add(albun);
        Artistas.add(artista);
        Lanzamientos.add(lanzamiento);
        Duraciones.add(duracion);

    }//CrearCancion

    public String getCancion(int id) {
        id--;
        return Canciones.get(id);
    }

    public String getAlbun(int id) {
        id--;
        return Albunes.get(id);
    }

    public String getArtist(int id) {
        id--;
        return Artistas.get(id);
    }

    public int getLanzamiento(int id) {
        id--;
        return Lanzamientos.get(id);
    }

    public int getDuracion(int id) {
        id--;
        return Duraciones.get(id);
    }//los gets

    public String MandarLista() {
        String temp = "";
        for (int i = 1; i <= Canciones.size(); i++) {
            temp += i + ". " + Canciones.get(i - 1) + "\n";
        }//for i
        return temp;
    }//MandarLista

    public void Eliminar(int id) {
        id--;
        Canciones.remove(id);
        Albunes.remove(id);
        Artistas.remove(id);
        Lanzamientos.remove(id);
        Duraciones.remove(id);
    }

    public String MostrarPropiedad(int id) {
        id--;
        String temp = "Nombre de la Cancion: " + Canciones.get(id) + "\nNombre del Albun: " + Albunes.get(id) + "\nNombre Artista: " + Artistas.get(id) + "\nNombre de la Cancion: " + Lanzamientos.get(id) + "\nNombre de la Cancion: " + Duraciones.get(id);
        return temp;
    }

    public void ModificarDatos(String nombre, String albun, String artista, int lanzamiento, int duracion, int id) {
        id--;
        Canciones.remove(id);
        Albunes.remove(id);
        Artistas.remove(id);
        Lanzamientos.remove(id);
        Duraciones.remove(id);

        Canciones.add(id, nombre);
        Albunes.add(id, albun);
        Artistas.add(id, artista);
        Lanzamientos.add(id, lanzamiento);
        Duraciones.add(id, duracion);

    }//CrearCancion
}//Principal
