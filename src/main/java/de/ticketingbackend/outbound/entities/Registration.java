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
public class Registration {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private Long bookerID;

    @Column(nullable = false)
    private Long placeID;

    private String comment;

    @Column(nullable = false)
    private Boolean alreadyPayed;

    @Column(insertable = false)
    private Date updatedAt = new Date(System.currentTimeMillis());

    @Column(insertable = false, updatable = false)
    private Date createdAt = new Date(System.currentTimeMillis());
}