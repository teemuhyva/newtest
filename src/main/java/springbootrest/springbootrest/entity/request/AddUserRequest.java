package springbootrest.springbootrest.entity.request;

public class AddUserRequest {

    private int henkilotId;
    private int id;
    private String etunimi;
    private String sukunimi;
    private String osoite;

    public AddUserRequest() {
    }

    public int getHenkilotId() {
        return henkilotId;
    }

    public void setHenkilotId(int henkilotId) {
        this.henkilotId = henkilotId;
    }

    public int getId() {
        return id;

    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEtunimi() {
        return etunimi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public String getOsoite() {
        return osoite;
    }

    public void setOsoite(String osoite) {
        this.osoite = osoite;
    }

    public int getEsimies() {
        return esimies;
    }

    public void setEsimies(int esimies) {
        this.esimies = esimies;
    }

    private int esimies;

}
