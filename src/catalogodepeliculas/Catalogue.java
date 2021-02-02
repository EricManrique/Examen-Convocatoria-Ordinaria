/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogodepeliculas;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author ericm
 */
public class Catalogue {
    private List<Movie> catalogo = new ArrayList();
    
    public Catalogue(){
        
    }
    
    
    public void OrderGender(){
       Collections.sort(catalogo, new ComparadorGender());
    }
    
    public void OrderValorate(){
        Collections.sort(catalogo, new ComparadorValoracion());
    }
    
    public void OrderView(){
        
    }
    
    public void AddMovie(Movie m1){
        catalogo.add(m1);
    }
    
    public void DeleteMovie(Movie m1){
        catalogo.remove(m1);
    }
    
    public int CompareTo(Movie m1, Movie m2){
        return (m1.getGender()).compareTo(m2.getGender());
    }
    
    public void MostrarLista(){
        for (int i=0; i<catalogo.size();i++){
            System.out.println(catalogo.get(i).getTitle());
        }
    }
    
    public static class ComparadorGender implements Comparator<Movie> {
        @Override
        public int compare(Movie f1, Movie f2){
            
            int c = 0;
            
            c = f1.getGender().compareTo(f2.getGender());
            if(c != 0){
                return c;
            }
            return 0; //Va detrás
        }
    }
    
    public static class ComparadorValoracion implements Comparator<Movie> {
        @Override
        public int compare(Movie m1, Movie m2){
            
            int c = 0;
            
            c = ((Integer) m1.getQualification()).compareTo(m2.getQualification());
            if(c != 0){
                return c;
            }
            return 0; //Va detrás
        }
    }
}

