package com.omnius.omniuseventstore.repository;

import com.omnius.omniuseventstore.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TaskRepository extends JpaRepository<Task, UUID> {
}
