package com.desk.implement.services;

import com.desk.implement.dto.DepartmentDTO;
import com.desk.implement.entities.Department;
import com.desk.implement.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Transactional(readOnly = true)
    public List<DepartmentDTO> findAll() {

        List<Department> list = departmentRepository.findAll(Sort.by("name"));
        return list.stream().map(x -> new DepartmentDTO(x)).collect(Collectors.toList());
    }
}
