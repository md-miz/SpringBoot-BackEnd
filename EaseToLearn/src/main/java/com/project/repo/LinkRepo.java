package com.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.Link;

public interface LinkRepo extends JpaRepository<Link, Integer> {

}
