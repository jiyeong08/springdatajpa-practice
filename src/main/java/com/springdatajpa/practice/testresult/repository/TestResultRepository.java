package com.springdatajpa.practice.testresult.repository;

import com.springdatajpa.practice.testresult.dto.MemberDTO;
import com.springdatajpa.practice.testresult.entity.Member;
import com.springdatajpa.practice.testresult.entity.TestResult;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestResultRepository extends JpaRepository<TestResult, Integer> {

    List<TestResult> findByDepressionTotalScoreGreaterThan(Integer testScore, Sort sort);

    List<TestResult> findByAnxietyTotalScoreGreaterThan(Integer testScore, Sort sort);

    List<TestResult> findByBipolarTotalScoreGreaterThan(Integer testScore, Sort sort);

    List<TestResult> findByOcdTotalScoreGreaterThan(Integer testScore, Sort sort);
}
