package springbootrest.springbootrest.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "Tunnit", schema = "dbo", catalog = "Asikastietokanta")
public class TunnitEntity {
    private int tunnitId;
    private Integer id;
    private Integer projektiId;
    private Integer henkilotId;
    private Timestamp pvm;
    private BigDecimal tunnit;

    @Id
    @Column(name = "Tunnit_id")
    public int getTunnitId() {
        return tunnitId;
    }

    public void setTunnitId(int tunnitId) {
        this.tunnitId = tunnitId;
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
    @Column(name = "Projekti_id")
    public Integer getProjektiId() {
        return projektiId;
    }

    public void setProjektiId(Integer projektiId) {
        this.projektiId = projektiId;
    }

    @Basic
    @Column(name = "Henkilot_id")
    public Integer getHenkilotId() {
        return henkilotId;
    }

    public void setHenkilotId(Integer henkilotId) {
        this.henkilotId = henkilotId;
    }

    @Basic
    @Column(name = "PVM")
    public Timestamp getPvm() {
        return pvm;
    }

    public void setPvm(Timestamp pvm) {
        this.pvm = pvm;
    }

    @Basic
    @Column(name = "Tunnit")
    public BigDecimal getTunnit() {
        return tunnit;
    }

    public void setTunnit(BigDecimal tunnit) {
        this.tunnit = tunnit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TunnitEntity that = (TunnitEntity) o;

        if (tunnitId != that.tunnitId) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (projektiId != null ? !projektiId.equals(that.projektiId) : that.projektiId != null) return false;
        if (henkilotId != null ? !henkilotId.equals(that.henkilotId) : that.henkilotId != null) return false;
        if (pvm != null ? !pvm.equals(that.pvm) : that.pvm != null) return false;
        if (tunnit != null ? !tunnit.equals(that.tunnit) : that.tunnit != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tunnitId;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (projektiId != null ? projektiId.hashCode() : 0);
        result = 31 * result + (henkilotId != null ? henkilotId.hashCode() : 0);
        result = 31 * result + (pvm != null ? pvm.hashCode() : 0);
        result = 31 * result + (tunnit != null ? tunnit.hashCode() : 0);
        return result;
    }
}
