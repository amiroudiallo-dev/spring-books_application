/**
 * This class extends {@link ApiError} and expresses validation problems
 * encountered when calling APIs.
 * @author : Amirou Yannick Wendpuiré DIALLO
 * @version : 1.0
 * @email: <A HREF="mailto:amiroudiallo.yw@gmail.com">DIALLO Amirou Y. W</A>
 * @since: 23/12/2023 23:43
 * Copyright (c) 2023, All rights reserved
 */

package com.amiroudiallo.booksapplication.dao.dto;

import com.amiroudiallo.booksapplication.exception.ApiError;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@EqualsAndHashCode(callSuper = false, onlyExplicitlyIncluded = true)
public class ApiValidationErrorDto extends ApiError {

    private String object;

    private String field;

    private Object rejectValue;

    private String message;

    public ApiValidationErrorDto(final String object, final String message) {
        this.object = object;
        this.message = message;
    }

    public ApiValidationErrorDto() {
    }
}
