package com.binus.portalnilai;

import java.util.UUID;

import javax.validation.constraints.NotBlank;

public class Grade {

    @NotBlank(message = "Nama tidak boleh kosong")
    private String nama;
    @NotBlank(message = "Mata kuliah tidak boleh kosong")
    private String mataKuliah;
    @Score(message = "Nilai harus berupa huruf [A+..F]")
    private String nilai;
    private String id;


    public Grade() {
        this.id = UUID.randomUUID().toString();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public String getNilai() {
        return nilai;
    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
