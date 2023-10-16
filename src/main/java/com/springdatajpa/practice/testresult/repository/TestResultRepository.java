package com.springdatajpa.practice.testresult.repository;

import com.springdatajpa.practice.testresult.dto.MemberDTO;
import com.springdatajpa.practice.testresult.entity.Member;
import com.springdatajpa.practice.testresult.entity.TestResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestResultRepository extends JpaRepository<TestResult, Integer> {


    public void modifyMember(MemberDTO newResult2){
        Member foundMember = memberRe
    };
}
