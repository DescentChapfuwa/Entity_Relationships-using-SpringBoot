package com.entity_relationships.one_to_one.entities;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "address")
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "adress_name")
    private String addressName;

    @Column(name = "adress_type")
    private String addressType;


}

