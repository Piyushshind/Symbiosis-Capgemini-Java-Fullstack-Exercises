package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<StudentEntity, Long>{

}


//<dependency>
//<groupId>com.mysql</groupId>
//<artifactId>mysql-connector-j</artifactId>
//<scope>runtime</scope>
//</dependency>
