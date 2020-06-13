package com.hao.controller;

import com.hao.model.ao.HttpResponse;
import com.hao.model.entity.CityDO;
import com.hao.service.CityService;
import com.hao.util.HttpResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * com.hao.controller.CityController.java
 *
 * @author Hao
 * @version v1.0
 * @since 2020/5/2 11:11
 */
@RestController
public class CityController {

    private static final Logger logger = LoggerFactory.getLogger(CityController.class);

    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping(path = "cities")
    public HttpResponse findAll() {

        List<CityDO> cities = cityService.findAll();
        logger.info("### Size: {} ###", cities.size());
        return HttpResponseUtil.success(cities);
    }

}
