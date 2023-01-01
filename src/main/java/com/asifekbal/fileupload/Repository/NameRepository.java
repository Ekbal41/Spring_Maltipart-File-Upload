package com.asifekbal.fileupload.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.asifekbal.fileupload.model.Name;
 

public interface NameRepository extends JpaRepository<Name,Long> {
 
}