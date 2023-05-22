package com.foxminded.dao;

import java.util.List;

import com.foxminded.domain.Chair;

public interface ChairDao {

    Chair create(Chair chair);

    List<Chair> findAll();

    Chair findById(int id);

    Chair update(Chair chair);

    void delete(int id);

}
