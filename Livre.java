public class Livre {
    private String  titre ;
    private String  auteur ;
    private String isbn ;
    private boolean disponible;

    // Constructeur 
    public Livre (String titre ,String auteur, String isbn){
        this.titre = titre ;
        this.auteur = auteur ;
        this.isbn = isbn ;
        this.disponible = true ;
    }
    // Getters
    public String getTitre() {
        return titre;
    }
    public String getAuteur() {
        return auteur;
    }
    public String getIsbn() {
        return isbn;
    }
    public boolean isDisponible() {
        return disponible;
    }
    public boolean emprunter(){
        if (this.disponible){
            this.disponible = false ;
            return true ;
        }
        else {
            return false ;
        }
    } 
    public boolean retourner(){
        if (!this.disponible){
            this.disponible = true ;
            return true ;
        }
        else {
            return false ;
        }
    }
    @Override 
    public String toString(){
        return "Titre : " + this.titre + ", Auteur : " + this.auteur + ", ISBN : " + this.isbn + ", Disponible : " + (this.disponible ? "Oui " : "Non " );
    }   



}