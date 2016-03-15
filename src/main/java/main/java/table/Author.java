package main.java.table;

import javax.persistence.*;

@Entity
@Table(name = "author")
public class Author {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String fierstName;

    @Column
    private String LastName;

    @Column
    private String midletName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFierstName() {
        return fierstName;
    }

    public void setFierstName(String fierstName) {
        this.fierstName = fierstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getMidletName() {
        return midletName;
    }

    public void setMidletName(String midletName) {
        this.midletName = midletName;
    }
}
