package com.bimbingan.tugasakhir.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ApiTemplateMessage {
    public ApiTemplateMessage() {
    }

    public ResponseEntity<Object> buildResponseEntity(ApiResponseTemplate template) {
        return new ResponseEntity(template, HttpStatus.OK);
    }
}
