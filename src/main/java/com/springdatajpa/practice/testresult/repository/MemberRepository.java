package com.springdatajpa.practice.testresult.repository;

import com.springdatajpa.practice.testresult.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Integer> {

    @Query(value = "SELECT user_id, test_status, relation_ck, etc_content, therapist_gender_ck, nickname FROM member ORDER BY user_id ASC"
            , nativeQuery = true)
    List<Member> findAllMember();

    Optional<Object> findByUserId(String userId);
}
