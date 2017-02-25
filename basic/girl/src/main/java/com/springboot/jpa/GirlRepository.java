package com.springboot.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by wei11 on 2017/2/24.
 */
public interface GirlRepository extends JpaRepository<Girl, Integer> {

    // 通过年龄来查询
    // 方法名不能乱写，根据方法名来确定查询字段
    public List<Girl> findByAge(Integer age);
}
