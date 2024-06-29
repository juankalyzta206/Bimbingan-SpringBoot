package com.bimbingan.tugasakhir.service;

import com.bimbingan.tugasakhir.model.dto.AdminDto;
import com.bimbingan.tugasakhir.utils.PaginatedListRequest;
import com.bimbingan.tugasakhir.utils.PaginatedListResponse;

public interface AdminService {
    PaginatedListResponse<AdminDto> findAdminPaginated(PaginatedListRequest<AdminDto> request);

    AdminDto save(AdminDto request) throws Exception;
}
