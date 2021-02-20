package org.example;

import javax.persistence.*;

@Entity
@Table(name="indians")
public class India {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String teamName;
    private String coach;
    private String owner;

    @Override
    public String toString() {
        return "India{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teamName='" + teamName + '\'' +
                ", coach='" + coach + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public India(Long id, String name, String teamName, String coach, String owner) {
        this.id = id;
        this.name = name;
        this.teamName = teamName;
        this.coach = coach;
        this.owner = owner;

    }

    public India() {

    }
}
