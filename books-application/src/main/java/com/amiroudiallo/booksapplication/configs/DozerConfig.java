/**
 * This class manage the configuration of dozer for the mapping.
 * @author : Amirou Yannick Wendpuiré DIALLO
 * @version : 1.0
 * @email: <A HREF="mailto:amiroudiallo.yw@gmail.com">DIALLO Amirou Y. W</A>
 * @since: 26/12/2023 20:56
 * Copyright (c) 2023, All rights reserved
 */

package com.amiroudiallo.booksapplication.configs;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import com.github.dozermapper.core.loader.api.BeanMappingBuilder;
import com.github.dozermapper.core.loader.api.TypeMappingOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DozerConfig {

    private static final BeanMappingBuilder builder = new BeanMappingBuilder() {
        @Override
        protected void configure() {
            mapping(String.class, String.class, TypeMappingOptions.mapNull(false));
        }
    };

    @Bean
    public Mapper buildDozerMapper() {
        return DozerBeanMapperBuilder
                .create()
                .withMappingBuilder(builder)
                .build();
    }
}
