package com.hao.model.ao;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * com.hao.model.ao.CityAO.java
 *
 * @author Hao
 * @version v1.0
 * @since 2020/5/2 18:10
 */
@Getter
@Setter
@ToString
@Accessors(chain = true)
public class CityAO {

    private Integer id;
    private String name;
    private String countryCode;
    private String district;
    private Integer population;

}
