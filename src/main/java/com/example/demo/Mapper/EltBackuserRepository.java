package com.example.demo.Mapper;

import com.example.demo.po.EltBackuser;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 后台登录
 * @author Admin
 *
 */
@CacheConfig(cacheNames = "eltbackuser")
public interface EltBackuserRepository extends JpaRepository<EltBackuser, Long> {

    @Cacheable(key = "#p0")
    EltBackuser findByusername(String name);
}