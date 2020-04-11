package com.online.taxi.client.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.online.taxi.client.entity.Emp;

@Mapper
@Repository
public interface EmpMapper {

    List<Emp> selectEmp();

    Emp selectEmpById(Integer empno);

    Integer addEmp(Emp emp);

    Integer updateEmp(Emp emp);

    Integer deleteEmp(Integer empno);
}
