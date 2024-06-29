package com.bimbingan.tugasakhir.service.impl;

import com.bimbingan.tugasakhir.model.Admin;
import com.bimbingan.tugasakhir.model.dto.AdminDto;
import com.bimbingan.tugasakhir.repository.AdminRepository;
import com.bimbingan.tugasakhir.service.AdminService;
import com.bimbingan.tugasakhir.utils.PaginatedListRequest;
import com.bimbingan.tugasakhir.utils.PaginatedListResponse;
import com.bimbingan.tugasakhir.utils.PagingInfo;
import jakarta.persistence.EntityManager;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    private final AdminRepository adminRepository;
    private final EntityManager entityManager;

    public AdminServiceImpl(AdminRepository adminRepository, EntityManager entityManager) {
        this.adminRepository = adminRepository;
        this.entityManager = entityManager;
    }

    @Override
    public PaginatedListResponse<AdminDto> findAdminPaginated(PaginatedListRequest<AdminDto> request) {
        AdminDto wrapper = request.getWrapper();
        PagingInfo pagingInfo = request.getPagingInfo();
        Pageable paging = PageRequest.of(pagingInfo.getCurrentPage(), pagingInfo.getPageSize());
        Page<Object[][]> dataPage = adminRepository.findDataAdminPaginated(wrapper.getIdAdmin(), wrapper.getNamaAdmin(), paging);
        List<Object[][]> datas = dataPage.getContent();
        List<AdminDto> resultList = new ArrayList<AdminDto>();
        int dataSize = datas.size();
        if (!datas.isEmpty()) {
            for (Object[] data : datas) {
                dataSize += 1;
                AdminDto wrapper2 = new AdminDto();
                wrapper2.setIdAdmin((Long) data[0]);
                wrapper2.setNamaAdmin((String) data[1]);
                wrapper2.setAlamatAdmin((String) data[2]);
                wrapper2.setEmailAdmin((String) data[3]);
                wrapper2.setTelpAdmin((String) data[4]);

                resultList.add(wrapper2);
            }
        } else {
            resultList = new ArrayList<AdminDto>();
        }

        PaginatedListResponse<AdminDto> paginatedList = new PaginatedListResponse<>();
        paginatedList.setDataList(resultList);
        paginatedList.setPagingInfo(pagingInfo);
        paginatedList.setTotalRowCount((int) dataPage.getTotalElements());

        return paginatedList;
    }

    @Override
    public AdminDto save(AdminDto wrapper) throws Exception {
        try {
            if (wrapper.getIdAdmin() == null) {

                Admin admin = new Admin();
                admin.setIdAdmin(wrapper.getIdAdmin());
                admin.setPasswordAdmin(wrapper.getPasswordAdmin());
                admin.setNamaAdmin(wrapper.getNamaAdmin());
                admin.setAlamatAdmin(wrapper.getAlamatAdmin());
                admin.setEmailAdmin(wrapper.getEmailAdmin());
                admin.setTelpAdmin(wrapper.getTelpAdmin());

                admin = adminRepository.save(admin);
                AdminDto result = new AdminDto();
                return result;
            }
            else {
                Admin admin = adminRepository.findById(wrapper.getIdAdmin())
                        .orElseThrow(() -> new Exception("ID not found"));
                admin.setIdAdmin(wrapper.getIdAdmin());
                admin.setPasswordAdmin(wrapper.getPasswordAdmin());
                admin.setNamaAdmin(wrapper.getNamaAdmin());
                admin.setAlamatAdmin(wrapper.getAlamatAdmin());
                admin.setEmailAdmin(wrapper.getEmailAdmin());
                admin.setTelpAdmin(wrapper.getTelpAdmin());

                admin = adminRepository.save(admin);
                AdminDto result = new AdminDto();
                return result;
            }
        }  catch (Exception e) {
            throw new Exception(e);
        }

    }

}