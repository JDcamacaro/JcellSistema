package com.jcell.sistemajcell.InfoRepository;

import com.jcell.sistemajcell.InfoModel.InfoModel;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface InfoRepository extends JpaRepository<InfoModel, Long> {




}
