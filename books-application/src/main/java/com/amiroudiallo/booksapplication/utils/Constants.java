/**
 * This class groups all together constants that will be used.
 *
 * @author : Amirou Yannick Wendpuiré DIALLO
 * @version : 1.0
 * @email: <A HREF="mailto:amiroudiallo.yw@gmail.com">DIALLO Amirou Y. W</A>
 * @since: 24/12/2023 00:06
 * Copyright (c) 2023, All rights reserved
 */

package com.amiroudiallo.booksapplication.utils;

public class Constants {

    public static final String defaultUser = "ADMIN_2@23";

    public static class Status {
        public static final String OK = "200";
        public static final String CREATED = "201";
        public static final String BADREQUEST = "400";
        public static final String FORBBIDEN = "403";
        public static final String NOT_FOUNT = "404";
        public static final String INTERNAL_SERVER_ERROR = "500";
    }

    public static class Uri {
        public static final String SWAGGER_UI = "/swagger-ui/**";
        public static final String OPEN_API_DOCS = "/v3/api-docs/**";
        public static final String ACTUATOR = "/actuator/**";
        public static final String BASE = "/v1/api";
        public static final String USERS = "/users";
        public static final String SIGNIN = "/signin";
        public static final String NOT_EXIST = "/non-existent";
    }
}
