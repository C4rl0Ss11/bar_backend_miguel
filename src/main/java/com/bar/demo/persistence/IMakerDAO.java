package com.bar.demo.persistence;

import com.bar.demo.entity.Maker;

import java.util.List;
import java.util.Optional;

public interface IMakerDAO {
    List<Maker> findAll();
    Optional<Maker> findById(Long id);

    void save(Maker maker);

    void deleteById(Long id);
}
