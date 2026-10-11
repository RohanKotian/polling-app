package com.polling.pollingapp.repositories;

import com.polling.pollingapp.model.Poll;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PollRepository extends JpaRepository<Poll, Long> {
}
