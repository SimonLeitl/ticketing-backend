package de.ticketingbackend.outbound.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "registration")
public class RegistrationEntity {
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
    @UpdateTimestamp
    private Date updatedAt;

    @Column(insertable = false, updatable = false)
    @CreationTimestamp
    private Date createdAt;
}