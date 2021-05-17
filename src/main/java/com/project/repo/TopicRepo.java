package com.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.Topic;

public interface TopicRepo extends JpaRepository<Topic,Integer> {

}
