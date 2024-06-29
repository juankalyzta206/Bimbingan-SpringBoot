package com.bimbingan.tugasakhir.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "admin")
public class Admin {
    private Long idAdmin;
    private String namaAdmin;
    private String passwordAdmin;
    private String emailAdmin;
    private String telpAdmin;
    private String alamatAdmin;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_admin")
    public Long getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(Long idAdmin) {
        this.idAdmin = idAdmin;
    }

    @Column(name = "nama_admin")
    public String getNamaAdmin() {
        return namaAdmin;
    }

    public void setNamaAdmin(String namaAdmin) {
        this.namaAdmin = namaAdmin;
    }

    @Column(name = "password_admin")
    public String getPasswordAdmin() {
        return passwordAdmin;
    }

    public void setPasswordAdmin(String passwordAdmin) {
        this.passwordAdmin = passwordAdmin;
    }

    @Column(name = "email_admin")
    public String getEmailAdmin() {
        return emailAdmin;
    }

    public void setEmailAdmin(String emailAdmin) {
        this.emailAdmin = emailAdmin;
    }

    @Column(name = "telp_admin")
    public String getTelpAdmin() {
        return telpAdmin;
    }

    public void setTelpAdmin(String telpAdmin) {
        this.telpAdmin = telpAdmin;
    }

    @Column(name = "alamat_admin")
    public String getAlamatAdmin() {
        return alamatAdmin;
    }

    public void setAlamatAdmin(String alamatAdmin) {
        this.alamatAdmin = alamatAdmin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return Objects.equals(idAdmin, admin.idAdmin) && Objects.equals(namaAdmin, admin.namaAdmin) && Objects.equals(passwordAdmin, admin.passwordAdmin) && Objects.equals(emailAdmin, admin.emailAdmin) && Objects.equals(telpAdmin, admin.telpAdmin) && Objects.equals(alamatAdmin, admin.alamatAdmin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAdmin, namaAdmin, passwordAdmin, emailAdmin, telpAdmin, alamatAdmin);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "idAdmin='" + idAdmin + '\'' +
                ", namaAdmin='" + namaAdmin + '\'' +
                ", passwordAdmin='" + passwordAdmin + '\'' +
                ", emailAdmin='" + emailAdmin + '\'' +
                ", telpAdmin='" + telpAdmin + '\'' +
                ", alamatAdmin='" + alamatAdmin + '\'' +
                '}';
    }
}
