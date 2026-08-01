package com.polling.pollingapp.repositories;

import com.polling.pollingapp.model.Poll;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PollRepository extends JpaRepository<Poll, Long> {
}
