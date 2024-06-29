package com.bimbingan.tugasakhir.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;

@JsonTypeIdResolver(LowerCaseClassNameResolver.class)
@JsonInclude(JsonInclude.Include.ALWAYS)
public class ApiResponseTemplate {
    private Boolean status;
    private String message;
    private Object object;

    public ApiResponseTemplate(Boolean status, String message, Object object) {
        this.status = status;
        this.message = message;
        this.object = object;
    }

    public ApiResponseTemplate(Boolean status, Object object) {
        this.status = status;
        this.message = null;
        this.object = object;
    }

    public Boolean getStatus() {
        return this.status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObject() {
        return this.object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
