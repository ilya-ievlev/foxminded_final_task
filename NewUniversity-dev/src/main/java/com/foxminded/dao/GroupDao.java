package com.foxminded.dao;

import java.util.List;

import com.foxminded.domain.Group;

public interface GroupDao {

    Group create(Group group);

    List<Group> findAll();

    Group findById(int id);

    List<Group> findByChairId(int chairId);

    Group update(Group group);

    void delete(int id);

}
