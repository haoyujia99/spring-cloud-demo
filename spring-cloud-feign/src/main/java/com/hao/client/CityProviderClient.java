package com.hao.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.hao.model.ao.HttpResponse;

/**
 * com.hao.client.CityProviderClient.java
 *
 * @author Hao
 * @version v1.0
 * @since 6/13/2020 10:46 AM
 */
@FeignClient(value = "spring-boot-provider")
public interface CityProviderClient {

    /**
     * findAll
     *
     * @return HttpResponse
     */
    @GetMapping(path = "cities")
    HttpResponse findAll();

}