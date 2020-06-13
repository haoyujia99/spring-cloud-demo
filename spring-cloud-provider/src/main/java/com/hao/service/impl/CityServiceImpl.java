package com.hao.service.impl;

import com.hao.model.entity.CityDO;
import com.hao.repository.CityRepository;
import com.hao.service.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

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

    private final CityRepository cityRepository;

    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    /**
     * find all cities
     *
     * @return a collection of CityDO
     */
    @Override
    public List<CityDO> findAll() {

        List<CityDO> cities = cityRepository.findAll();
        cities.forEach(city -> logger.debug("### {} ###", city));
        return cities;
    }

}
