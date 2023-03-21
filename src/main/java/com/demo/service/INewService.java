package com.demo.service;

import com.demo.dto.NewDTO;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface INewService {
    NewDTO save(NewDTO newDTO);
    void delete(long[] ids);
    List<NewDTO> findAll(Pageable pageable);
    int totalItem();
}
