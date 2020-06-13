package com.hao.controller;

import com.hao.model.ao.CityAO;
import com.hao.model.ao.HttpResponse;
import com.hao.service.CityService;
import com.hao.util.HttpResponseUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
 * @since 2020/5/2 18:03
 */
@RestController
public class CityController {

    private static final Logger logger = LoggerFactory.getLogger(CityController.class);

    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @HystrixCommand(fallbackMethod = "findAllFallBack")
    @GetMapping(path = "cities")
    public HttpResponse findAll() {

        List<CityAO> cities = cityService.findAll();
        logger.info("### Size: {} ###", cities.size());
        return HttpResponseUtil.success(cities);
    }

    private HttpResponse findAllFallBack() {
        return HttpResponseUtil.failed(new CityAO().setId(-1));
    }

}
