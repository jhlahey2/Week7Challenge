package com.lahey.week7challenge.repositories;

import com.lahey.week7challenge.entities.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {

//    default List<EmployeeRepository> findAllByDepartment(long department_id) {
//        return null;
//    }

}