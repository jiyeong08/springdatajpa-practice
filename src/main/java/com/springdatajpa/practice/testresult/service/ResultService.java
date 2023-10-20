package com.springdatajpa.practice.testresult.service;

import com.springdatajpa.practice.testresult.dto.MemberDTO;
import com.springdatajpa.practice.testresult.dto.TestResultDTO;
import com.springdatajpa.practice.testresult.entity.Member;
import com.springdatajpa.practice.testresult.entity.TestResult;
import com.springdatajpa.practice.testresult.repository.MemberRepository;
import com.springdatajpa.practice.testresult.repository.TestResultRepository;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ResultService {

    private final TestResultRepository resultRepository;
    private final ModelMapper modelMapper;
    private final MemberRepository memberRepository;

    public ResultService(TestResultRepository resultRepository, ModelMapper modelMapper, MemberRepository memberRepository){

        this.resultRepository = resultRepository;
        this.modelMapper = modelMapper;
        this.memberRepository = memberRepository;

    }

    public TestResultDTO findResultByCode(int resultCode) {

        TestResult result = resultRepository.findById(resultCode).orElseThrow(IllegalArgumentException::new);

        return modelMapper.map(result, TestResultDTO.class);

    }

    public Page<TestResultDTO> findResultList(Pageable pageable) {

        pageable = PageRequest.of(pageable.getPageNumber() <= 0?0 : pageable.getPageNumber() -1,
                                pageable.getPageSize(),
                                Sort.by("resultCode").descending());
        Page<TestResult> resultList = resultRepository.findAll(pageable);

        return resultList.map(result -> modelMapper.map(result, TestResultDTO.class));

    }

    public List<MemberDTO> findAllMember() {

        List<Member> memberList = memberRepository.findAllMember();

        return memberList.stream()
                        .map(member -> modelMapper.map(member, MemberDTO.class))
                        .collect(Collectors.toList());

    }

    @Transactional
    public void registNewResult(TestResultDTO newResult1, MemberDTO newResult2) {

        resultRepository.save(modelMapper.map(newResult1, TestResult.class));
        Member foundMember = (Member) memberRepository.findByUserId(newResult2.getUserId()).orElseThrow(IllegalArgumentException::new);
        foundMember = foundMember.userId(newResult2.getUserId()).builder();

    }

    @Transactional
    public void deleteResult(Integer resultCode) {

        resultRepository.deleteById(resultCode);

    }

    public void modifyResult(TestResultDTO resultDTO) {

        TestResult foundResult = resultRepository.findById(resultDTO.getResultCode()).orElseThrow(IllegalArgumentException::new);
        foundResult = foundResult.depressionTotalScore(resultDTO.getDepressionTotalScore())
                                    .anxietyTotalScore(resultDTO.getAnxietyTotalScore())
                                    .bipolarTotalScore(resultDTO.getBipolarTotalScore())
                                    .ocdTotalScore(resultDTO.getOcdTotalScore())
                                    .builder();
        resultRepository.save(foundResult);

    }

    public List<TestResultDTO> findByScore(String testItem, Integer testScore) {

        List<TestResult> resultList = new ArrayList<>();
        if(testItem == "우울") {
            resultList = resultRepository
                        .findByDepressionTotalScoreGreaterThan(testScore, Sort.by("testScore").descending());
        } else if (testItem == "불안") {
            resultList = resultRepository
                        .findByAnxietyTotalScoreGreaterThan(testScore, Sort.by("testScore").descending());
        } else if (testItem == "양극성") {
            resultList = resultRepository
                        .findByBipolarTotalScoreGreaterThan(testScore, Sort.by("testScore").descending());
        } else if (testItem == "강박성") {
            resultList = resultRepository
                        .findByOcdTotalScoreGreaterThan(testScore, Sort.by("testScore").descending());
        }

        return resultList.stream()
                        .map(result -> modelMapper.map(result, TestResultDTO.class))
                        .collect(Collectors.toList());

    }
}
