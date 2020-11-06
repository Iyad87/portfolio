package com.iyadaltoubah.Interfaces;

import com.iyadaltoubah.Models.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository  extends CrudRepository<Project, Long> {
    Iterable<Project> findAllByViewableIsTrue();

}
