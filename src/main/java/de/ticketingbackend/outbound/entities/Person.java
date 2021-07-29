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
public class Person {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String firstname;

    @Column(nullable = false)
    private String lastname;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String street;

    @Column(nullable = false)
    private String houseNumber;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String postcode;

    @Column(insertable = false)
    private Date updatedAt = new Date(System.currentTimeMillis());

    @Column(insertable = false, updatable = false)
    private Date createdAt = new Date(System.currentTimeMillis());
}