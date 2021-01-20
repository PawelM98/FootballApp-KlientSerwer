package com.michcinski.demo.repo;

import com.michcinski.demo.model.SavedFixture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FixtureRepo extends JpaRepository<SavedFixture, Long> {
}
