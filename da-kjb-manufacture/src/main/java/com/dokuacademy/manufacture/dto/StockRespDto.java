package com.dokuacademy.manufacture.dto;

import javax.validation.constraints.NotNull;

/**
 * This is a Javadoc comment
 */
@lombok.Data
public class StockRespDto {

    @NotNull
    private Long stockId;

    @NotNull
    private Long barangId;

    @NotNull
    private String namaBarang;

    @NotNull
    private Integer stockAwal;

    @NotNull
    private Integer stockMasuk;

    @NotNull
    private Integer terjual;

    @NotNull
    private Integer stockTersisa;

    @NotNull
    private Integer hargaSupplier;

    @NotNull
    private Integer hargaJual;
}

