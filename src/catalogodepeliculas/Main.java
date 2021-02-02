/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogodepeliculas;

/**
 *
 * @author ericm
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Catalogue prueba = new Catalogue();
        Cover cover1 = new Cover("cover1");
        Cover cover2 = new Cover("cover2");
        Cover cover3 = new Cover("cover3");
        Movie m1 = new Movie(cover1,"Space Jam", "Joe Pytka", "Michael Jordan","deporte",10,120);
        Movie m2 = new Movie(cover2,"Piratas del Caribe", "Rob Marshall", "Johnny Deep","fantasía",8,150);
        Movie m3 = new Movie(cover3,"Niños Grandes", "Dennis Dugan", "Adam Sandler","comedia",7,110);
        
        prueba.AddMovie(m1);
        prueba.AddMovie(m2);
        prueba.AddMovie(m3);
        
        prueba.OrderGender();
        prueba.MostrarLista();
        prueba.OrderValorate();
        prueba.MostrarLista();
        
    }
    
}
