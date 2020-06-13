package com.hao.service.impl;

import com.hao.model.ao.CityAO;
import com.hao.model.ao.HttpResponse;
import com.hao.service.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

/**
 * com.hao.service.impl.CityServiceImpl.java
 *
 * @author Hao
 * @version v1.0
 * @since 2020/5/2 11:11
 */
@Service
public class CityServiceImpl implements CityService {

    private static final Logger logger = LoggerFactory.getLogger(CityServiceImpl.class);

    private final RestTemplate restTemplate;

    public CityServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * find all cities
     *
     * @return a collection of CityAO
     */
    @SuppressWarnings(value = "unchecked")
    @Override
    public List<CityAO> findAll() {

        ResponseEntity<HttpResponse> entity = restTemplate.getForEntity("http://localhost:8080/cities", HttpResponse.class);
        Optional<HttpResponse> httpResponse = Optional.ofNullable(entity.getBody());
        logger.info("### {} ###", httpResponse);
        return (List<CityAO>) httpResponse.orElseThrow(NullPointerException::new).getData();
    }

}
