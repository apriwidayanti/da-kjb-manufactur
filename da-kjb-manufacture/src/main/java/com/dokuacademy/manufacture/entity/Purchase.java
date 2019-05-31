package com.dokuacademy.manufacture.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * This is a Javadoc comment
 */
@lombok.Data
@Entity
@Table (name = "Purchase")
public class Purchase implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "purchase_id")
    private Long purchaseId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "barang_id")
    private Long barangId;

    @Column(name = "tgl_transaksi")
    private Date tglTransaksi;

    @Column(name = "qty_barang")
    private Integer qtyBarang;

    @Column(name = "amount")
    private Double amount;

}
