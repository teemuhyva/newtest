package springbootrest.springbootrest.entity;

import javax.persistence.*;

@Entity
@Table(name = "Projektit", schema = "dbo", catalog = "Asikastietokanta")
public class ProjektitEntity {
    private int projektiId;
    private Integer id;
    private String nimi;

    @Id
    @Column(name = "Projekti_id")
    public int getProjektiId() {
        return projektiId;
    }

    public void setProjektiId(int projektiId) {
        this.projektiId = projektiId;
    }

    @Basic
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Nimi")
    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjektitEntity that = (ProjektitEntity) o;

        if (projektiId != that.projektiId) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (nimi != null ? !nimi.equals(that.nimi) : that.nimi != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = projektiId;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (nimi != null ? nimi.hashCode() : 0);
        return result;
    }
}
