package com.gbkanev18.vacationmanager.dao;

import com.gbkanev18.vacationmanager.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, String> {


}