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
public class Movie {
    private Cover cover;
    private String title;
    private String director;
    private String actors;
    private String gender;
    private int qualification;
    private int duration;
    
    public Movie (Cover cover, String title, String director, String actors, String gender, int qualification, int duration){
        this.cover = cover;
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.gender = gender;
        this.qualification = qualification;
        this.duration = duration;
    }
    
    public Cover getCover(){
        return cover;
    }
    public String getTitle(){
        return title;
    }
    public String getDirector(){
        return director;
    }
    public String getActors(){
        return actors;
    }
    public String getGender(){
        return gender;
    }
    public int getQualification(){
        return qualification;
    }
    public int getDuration(){
        return duration;
    }
}
