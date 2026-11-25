public class Bibliotheque {
    private String nom;
    private Livre[] livres;
    private Membre[] membres;
    private int cptLivres = 0;
    private int cptMembre = 0;
    public Bibliotheque(String nom){
        this.nom = nom;
        this.livres = new Livre[100];
        this.membres = new  Membre[100];
    }
    public String getNom(){
        return this.nom;
    }
    public boolean ajouterLivre(Livre l){
        if(this.livres.length == 100 ){
            return false;
        }
        for (int i = 0 ; i < cptLivres; i++){
            if(livres[i].getIsbn().equals(l.getTitre()))
                return false;
        }
        livres[cptLivres] = l;
        cptLivres++;
        return true;
    }
    public boolean ajouterMembre(Membre m){
        if(this.membres.length == 100)
            return false;
        membres[cptMembre] = m;
        cptMembre += 1;
        return true ;
    }

}
