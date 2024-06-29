package com.bimbingan.tugasakhir.controller;


import com.bimbingan.tugasakhir.model.Admin;
import com.bimbingan.tugasakhir.model.dto.AdminDto;
import com.bimbingan.tugasakhir.repository.AdminRepository;
import com.bimbingan.tugasakhir.service.AdminService;
import com.bimbingan.tugasakhir.utils.ApiResponseTemplate;
import com.bimbingan.tugasakhir.utils.ApiTemplateMessage;
import com.bimbingan.tugasakhir.utils.PaginatedListRequest;
import com.bimbingan.tugasakhir.utils.PaginatedListResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.servlet.http.HttpSession;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/micro/admin")
public class AdminController {
    private final AdminService adminService;
    private final ApiTemplateMessage templateMessage;
    private final HttpSession httpSession;
    private final AdminRepository adminRepository;
    public AdminController(AdminService adminService, ApiTemplateMessage templateMessage, HttpSession httpSession, AdminRepository adminRepository) {
        this.adminService = adminService;
        this.templateMessage = templateMessage;
        this.httpSession = httpSession;
        this.adminRepository = adminRepository;
    }

    @GetMapping
    public List<Admin> getAll(){
        return adminRepository.findAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<Object> getEmployeeById(@PathVariable Long id) throws Exception {
        Admin admin = adminRepository.findById(id)
                .orElseThrow(() -> new Exception("Employee not exist with id:" + id));
        return templateMessage.buildResponseEntity(new ApiResponseTemplate(true, admin));
    }

    @Operation(summary = "Find Admin Paging")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "OK")})
    @PostMapping(value="/findAdminPaginated", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> findAdminPaginated(@RequestBody PaginatedListRequest<AdminDto> request) {
        PaginatedListResponse<AdminDto> result = adminService.findAdminPaginated(request);
        return templateMessage.buildResponseEntity(new ApiResponseTemplate(true, result));
    }

    @Operation(summary = "Save and Update")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "OK")})
    @PutMapping(value="/save", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> save(@RequestBody AdminDto request) throws Exception {
        AdminDto result = adminService.save(request);
        return templateMessage.buildResponseEntity(new ApiResponseTemplate(true, result));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> deleteEmployee(@PathVariable Long id) throws Exception {
        Admin admin = adminRepository.findById(id)
                .orElseThrow(() -> new Exception("Employee not exist with id: " + id));
        adminRepository.delete(admin);
        return templateMessage.buildResponseEntity(new ApiResponseTemplate(true, "Success"));

    }
}
