package com.dokuacademy.manufacture.entity;


import javax.persistence.*;
import java.io.Serializable;

/**
 * This is a Javadoc comment
 */
@lombok.Data
@Entity
@Table(name ="Stock")
public class Stock implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "stock_id")
    private Long stockId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "barang_id")
    private Long barangId;

    @Column(name = "nama_barang")
    private String namaBarang;

    @Column(name = "stock_awal",nullable = false)
    private Integer stockAwal;

    @Column(name = "stock_masuk",nullable = false)
    private Integer stockMasuk;

    @Column(name = "stock_terjual",nullable = false)
    private Integer terjual;

    @Column(name = "stock_tersisa",nullable = false)
    private Integer stockTersisa;

    @Column(name = "harga_supplier", nullable = false)
    private Integer hargaSupplier;

    @Column(name = "harga_jual", nullable = false)
    private Integer hargaJual;

}
