public class Membre {
    // < >
    private  String numero;
    private String nom;
    private int nombreEmpruntsEnCours  ;
    public Membre(String numero, String nom ){
        this.numero = numero;
        this.nom = nom;
        this.nombreEmpruntsEnCours = 0;
    }
    public String getNumero(){
        return this.numero;
    }
    public String getNom(){
        return this.nom;
    }
    public int getNbrEmpruntEnCours(){
        return this.nombreEmpruntsEnCours;
    }
    public boolean  emprunter(){
        if (this.getNbrEmpruntEnCours() == 3){
            return false;
        }
       
         this.nombreEmpruntsEnCours += 1;
            return  true;

    }
    public  boolean rendre(){
        if(this.getNbrEmpruntEnCours() == 0 ){
            return false;
        }
        this.nombreEmpruntsEnCours -= 1;
        return true;
    }




}
