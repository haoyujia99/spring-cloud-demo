package com.hao.model.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

/**
 * com.hao.model.entity.CityDO.java
 *
 * @author Hao
 * @version v1.0
 * @since 2020/5/2 10:59
 */
@Getter
@Setter
@ToString
@Entity
@Table(catalog = "world", name = "city")
public class CityDO {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Name")
    private String name;

    @Column(name = "CountryCode")
    private String countryCode;

    @Column(name = "District")
    private String district;

    @Column(name = "Population")
    private Integer population;

}
