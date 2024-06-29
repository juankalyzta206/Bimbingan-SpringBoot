package com.bimbingan.tugasakhir.repository;

import com.bimbingan.tugasakhir.model.Admin;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

    @Query(value =
            "select id_admin,nama_admin,alamat_admin,email_admin,telp_admin \n" +
                    "from admin a where (:idAdmin IS NULL OR a.id_admin = :idAdmin) \n" +
                    "AND (:namaAdmin IS NULL OR a.nama_admin = :namaAdmin)", nativeQuery = true)
    Page<Object[][]> findDataAdminPaginated(Long idAdmin, String namaAdmin, Pageable paging);
}
