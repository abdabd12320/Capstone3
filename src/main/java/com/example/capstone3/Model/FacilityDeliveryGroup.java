package com.example.capstone3.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class FacilityDeliveryGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JsonIgnore
    private Facility facility;



    @Pattern(regexp = "^(north|west|east|south)$")
    @NotEmpty(message = "region should be not empty")
    private String region;

    private int period ;


    @Column(columnDefinition = "int not null")
    private double price = 0 ;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "deliveryGroup")
    private Set<Student> students;

    @OneToOne
    @JsonIgnore
    private Captain captain;


}
