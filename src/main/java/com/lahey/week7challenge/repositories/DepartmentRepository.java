package com.lahey.week7challenge.repositories;

import com.lahey.week7challenge.entities.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department,Long> {


}