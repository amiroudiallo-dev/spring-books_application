/**
 * @author : Amirou Yannick Wendpuiré DIALLO
 * @version : 1.0
 * @email: <A HREF="mailto:amiroudiallo.yw@gmail.com">DIALLO Amirou Y. W</A>
 * @since: 23/12/2023 23:29
 * Copyright (c) 2023, All rights reserved
 */

package com.amiroudiallo.booksapplication.dao.dto;

import com.amiroudiallo.booksapplication.exception.ApiError;

import java.time.LocalDateTime;
import java.util.List;

public class ApiResponseDto <T> {

    private Integer status;

    private String message;

    private T data;

    private List<ApiError> otherErrors;

    private String debugMessage;

    private LocalDateTime dateTime;

    public ApiResponseDto() {
        dateTime = LocalDateTime.now();
    }

    public ApiResponseDto(final int status) {
        this();
        this.status = status;
    }

    public ApiResponseDto(final int status, final Throwable exception) {
        this(status);
        this.message = "Erreur inattendue";
        this.debugMessage = exception.getLocalizedMessage();
    }

    public ApiResponseDto(final int status, final String message, final Throwable ex) {
        this(status);
        this.message = message;
        this.debugMessage = ex.getLocalizedMessage();
    }

    public ApiResponseDto(final int status, final String message, final T data) {
        this(status);
        this.message = message;
        this.data = data;
    }

    public ApiResponseDto(final int status, String message) {
        this(status);
        this.message = message;
    }

}
