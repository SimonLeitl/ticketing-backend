package de.ticketingbackend.outbound.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Place {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private Integer number;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private Integer maxNumberOfPersons;

    private String description;

    @Column(insertable = false)
    private Date updatedAt = new Date(System.currentTimeMillis());

    @Column(insertable = false, updatable = false)
    private Date createdAt = new Date(System.currentTimeMillis());
}