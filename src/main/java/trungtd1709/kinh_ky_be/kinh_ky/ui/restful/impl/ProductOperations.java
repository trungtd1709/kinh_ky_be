package trungtd1709.kinh_ky_be.kinh_ky.ui.restful.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.UnsupportedEncodingException;

@RequestMapping("${application-context-name}/api/v1/private/products")
public interface ProductOperations {
    @PostMapping
    ResponseEntity<GeneralResponse<String>> create(@RequestBody @Valid ProductDTO dto) throws UnsupportedEncodingException, JsonProcessingException;
}
