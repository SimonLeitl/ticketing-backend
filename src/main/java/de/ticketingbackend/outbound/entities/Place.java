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
@Table(name = "")
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
    @UpdateTimestamp
    private Date updatedAt;

    @Column(insertable = false, updatable = false)
    @CreationTimestamp
    private Date createdAt;
}