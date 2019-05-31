package com.dokuacademy.manufacture.entity;


import javax.persistence.*;
import java.io.Serializable;

/**
 * This is a Javadoc comment
 */
@lombok.Data
@Entity
@Table (name = "Distributor")
public class Distributor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "distributor_id")
    private Long distributorId;

    @Column(name = "nama_distributor")
    private String namaDistributor;

    @Column(name = "alamat")
    private String alamat;

    @Column(name = "status")
    private String status;
}
