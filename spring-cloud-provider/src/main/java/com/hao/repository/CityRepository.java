package com.hao.repository;

import com.hao.model.entity.CityDO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * com.hao.repository.CityRepository.java
 *
 * @author Hao
 * @version v1.0
 * @since 2020/5/2 11:10
 */
public interface CityRepository extends JpaRepository<CityDO, Integer> {

}
