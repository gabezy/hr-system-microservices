package com.gabezy.payrollapi.clients;

import com.gabezy.payrollapi.domain.entities.dtos.UserClientDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-api")
public interface UserApiClient {

    @GetMapping("/api/users/{id}")
    ResponseEntity<UserClientDTO> findById(@PathVariable Long id);

}
