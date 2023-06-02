package com.bbportfolio.personaljobtracker.jobads;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobAdRepository extends JpaRepository<JobAdEntity,Long> {



}
