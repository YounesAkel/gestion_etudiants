
package Getudiant;

public class Etudiant {
    
    private  String Matricule;
    private String Nom;
    private float Notemoyen;
    private String Sexe;
     private static int id=0;
   
    public Etudiant(String Matricule,String Nom, float Notemoyen, String Sexe) {
        
        this.Matricule=Matricule+(++id);
        this.Nom = Nom;
        this.Notemoyen = Notemoyen;
        this.Sexe = Sexe;
        
    }

    /*Etudiant() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
 public String getMatricule() {
        return Matricule;
    }
    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public float getNotemoyen() {
        return Notemoyen;
    }

    public void setNotemoyen(float Notemoyen) {
        this.Notemoyen = Notemoyen;
    }

    public String getSexe() {
        return Sexe;
    }

    public void setSexe(String Sexe) {
        this.Sexe = Sexe;
    }

    public void setMatricule(String Matricule) {
        this.Matricule = Matricule;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
    
}
