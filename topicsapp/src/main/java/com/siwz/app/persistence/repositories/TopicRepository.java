package com.siwz.app.persistence.repositories;

import com.siwz.app.persistence.dto.Topic;
import com.siwz.app.utils.errors.ApplicationException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Long> {

    List<Topic> findAllBySubject(Long subjectId);

    @Query(value = "SELECT t FROM TOPICS t " +
            "WHERE t.top_id = " +
            "(SELECT r.trs_top_id FROM TOPIC_RESERVATIONS r " +
            "WHERE r.trs_usr_id = ?1) AND t.top_sub_id = ?2", nativeQuery = true)
    Optional<Topic> findByUserAndSubject(Long userId, Long subjectId);

    @Query(value = "SELECT t FROM TOPICS t " +
            "WHERE t.top_id = " +
            "(SELECT r.trs_top_id FROM TOPIC_RESERVATIONS r " +
            "WHERE r.trs_usr_id = ?1)", nativeQuery = true)
    List<Topic> findByUser(Long userId);

    Optional<Topic> findByIdAndSubject(Long topicId, Long subjectId) throws ApplicationException;
}
