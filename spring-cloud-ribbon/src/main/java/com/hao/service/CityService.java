package com.hao.service;

import com.hao.model.ao.CityAO;

import java.util.List;

/**
 * com.hao.service.CityService.java
 *
 * @author Hao
 * @version v1.0
 * @since 2020/5/2 11:11
 */
public interface CityService {

    /**
     * find all cities
     *
     * @return a collection of CityAO
     */
    List<CityAO> findAll();

}
