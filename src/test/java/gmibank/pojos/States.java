package gmibank.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class States {
    private int id;
    private String name;

    public String getTpcountry() {
        return Tpcountry;
    }

    public void setTpcountry(String tpcountry) {
        Tpcountry = tpcountry;
    }

    private String Tpcountry;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
