package bd;
// Generated Mar 19, 2020 9:51:45 AM by Hibernate Tools 4.3.1

import java.util.Objects;

/**
 * Appartenirgroupe generated by hbm2java
 */
public class Appartenirgroupe implements java.io.Serializable {

    private AppartenirgroupeId id;
    private Etudiant etudiant;
    private Groupe groupe;

    public Appartenirgroupe() {
    }

    public Appartenirgroupe(AppartenirgroupeId id, Etudiant etudiant, Groupe groupe) {
        this.id = id;
        this.etudiant = etudiant;
        this.groupe = groupe;
    }

    public AppartenirgroupeId getId() {
        return this.id;
    }

    public void setId(AppartenirgroupeId id) {
        this.id = id;
    }

    public Etudiant getEtudiant() {
        return this.etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Groupe getGroupe() {
        return this.groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Appartenirgroupe other = (Appartenirgroupe) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
