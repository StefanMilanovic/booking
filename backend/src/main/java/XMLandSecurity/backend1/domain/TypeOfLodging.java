package XMLandSecurity.backend1.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "typesoflodgings")
public class TypeOfLodging implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "label", nullable = false)
    private String label;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "type", cascade = CascadeType.ALL)
    private List<Lodging> lodgingList = new ArrayList<Lodging>();

    public TypeOfLodging() {
    }

    public TypeOfLodging(String label, String name, List<Lodging> lodgingList) {
        this.label = label;
        this.name = name;
        this.lodgingList = lodgingList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Lodging> getLodgingList() {
        return lodgingList;
    }

    public void setLodgingList(List<Lodging> lodgingList) {
        this.lodgingList = lodgingList;
    }
}
