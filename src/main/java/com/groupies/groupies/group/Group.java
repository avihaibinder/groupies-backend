package com.groupies.groupies.group;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "GROUPS")
public class Group {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CREATION_DATE")
    private LocalDate creationDate;

    private Group() {
    }

    public Group(Long id, String name, LocalDate creationDate) {
        if (id <= 0) {
            throw new IllegalArgumentException("id is not positive");
        }
        this.id = id;
        this.name = Objects.requireNonNull(name, "name is null");
        this.creationDate = Objects.requireNonNull(creationDate);
        ;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }
}
