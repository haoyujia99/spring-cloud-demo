package com.hao.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.hao.client.CityProviderClient;
import com.hao.model.ao.CityAO;
import com.hao.model.ao.HttpResponse;
import com.hao.service.CityService;

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

    private final CityProviderClient cityProviderClient;

    public CityServiceImpl(CityProviderClient cityProviderClient) {
        this.cityProviderClient = cityProviderClient;
    }

    /**
     * find all cities
     *
     * @return a collection of CityAO
     */
    @SuppressWarnings(value = "unchecked")
    @Override
    public List<CityAO> findAll() {

        Optional<HttpResponse> httpResponse = Optional.ofNullable(cityProviderClient.findAll());
        logger.info("### {} ###", httpResponse);
        return (List<CityAO>) httpResponse.orElseThrow(NullPointerException::new).getData();
    }

}
