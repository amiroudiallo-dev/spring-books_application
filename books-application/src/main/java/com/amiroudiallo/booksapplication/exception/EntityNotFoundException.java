/**
 * This class managed the entity not found exception.
 * @author : Amirou Yannick Wendpuiré DIALLO
 * @version : 1.0
 * @email: <A HREF="mailto:amiroudiallo.yw@gmail.com">DIALLO Amirou Y. W</A>
 * @since: 23/12/2023 23:19
 * Copyright (c) 2023, All rights reserved
 */

package com.amiroudiallo.booksapplication.exception;

public class EntityNotFoundException extends Exception {

    public EntityNotFoundException(final String message) {
        super(message);
    }
}
