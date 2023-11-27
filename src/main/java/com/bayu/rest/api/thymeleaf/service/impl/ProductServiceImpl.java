package com.bayu.rest.api.thymeleaf.service.impl;

import com.bayu.rest.api.thymeleaf.repository.ProductRepository;
import com.bayu.rest.api.thymeleaf.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

}
