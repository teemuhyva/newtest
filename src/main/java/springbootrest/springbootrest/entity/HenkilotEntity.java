package springbootrest.springbootrest.entity;

import javax.persistence.*;

@Entity
@Table(name = "Henkilot", schema = "dbo", catalog = "Asikastietokanta")
public class HenkilotEntity {
    private int henkilotId;
    private Integer id;
    private String etunimi;
    private String sukunimi;
    private String osoite;
    private Integer esimies;

    @Id
    @Column(name = "Henkilot_id")
    @GeneratedValue
    public int getHenkilotId() {
        return henkilotId;
    }

    public void setHenkilotId(int henkilotId) {
        this.henkilotId = henkilotId;
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
    @Column(name = "Etunimi")
    public String getEtunimi() {
        return etunimi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    @Basic
    @Column(name = "Sukunimi")
    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    @Basic
    @Column(name = "Osoite")
    public String getOsoite() {
        return osoite;
    }

    public void setOsoite(String osoite) {
        this.osoite = osoite;
    }

    @Basic
    @Column(name = "Esimies")
    public Integer getEsimies() {
        return esimies;
    }

    public void setEsimies(Integer esimies) {
        this.esimies = esimies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HenkilotEntity that = (HenkilotEntity) o;

        if (henkilotId != that.henkilotId) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (etunimi != null ? !etunimi.equals(that.etunimi) : that.etunimi != null) return false;
        if (sukunimi != null ? !sukunimi.equals(that.sukunimi) : that.sukunimi != null) return false;
        if (osoite != null ? !osoite.equals(that.osoite) : that.osoite != null) return false;
        if (esimies != null ? !esimies.equals(that.esimies) : that.esimies != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = henkilotId;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (etunimi != null ? etunimi.hashCode() : 0);
        result = 31 * result + (sukunimi != null ? sukunimi.hashCode() : 0);
        result = 31 * result + (osoite != null ? osoite.hashCode() : 0);
        result = 31 * result + (esimies != null ? esimies.hashCode() : 0);
        return result;
    }
}
