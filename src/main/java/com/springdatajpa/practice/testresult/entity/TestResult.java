package com.springdatajpa.practice.testresult.entity;

import lombok.Builder;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "member_test_result")
public class TestResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "result_code")
    private int resultCode;

    @Column(name = "test_date", columnDefinition = "VARCHAR(20)")
    private Date testDate;

    @Column(name = "depression_total_score")
    private int depressionTotalScore;

    @Column(name = "anxiety_total_score")
    private int anxietyTotalScore;

    @Column(name = "bipolar_total_score")
    private int bipolarTotalScore;

    @Column(name = "ocd_total_score")
    private int ocdTotalScore;

    @Column(name = "user_id")
    private String userId;

    public TestResult resultCode(int val){
        this.resultCode = val;
        return this;
    }

    public TestResult testDate(Date val){
        this.testDate = val;
        return this;
    }

    public TestResult depressionTotalScore(int val){
        this.depressionTotalScore = val;
        return this;
    }

    public TestResult anxietyTotalScore(int val){
        this.anxietyTotalScore = val;
        return this;
    }

    public TestResult bipolarTotalScore(int val){
        this.bipolarTotalScore = val;
        return this;
    }

    public TestResult ocdTotalScore(int val){
        this.ocdTotalScore = val;
        return this;
    }

    public TestResult userId(String val){
        this.userId = val;
        return this;
    }

    public TestResult builder(){
        return new TestResult(resultCode, testDate, depressionTotalScore, anxietyTotalScore, bipolarTotalScore, ocdTotalScore, userId);
    }

    protected TestResult(){}

    public TestResult(int resultCode, Date testDate, int depressionTotalScore, int anxietyTotalScore, int bipolarTotalScore, int ocdTotalScore, String userId) {
        this.resultCode = resultCode;
        this.testDate = testDate;
        this.depressionTotalScore = depressionTotalScore;
        this.anxietyTotalScore = anxietyTotalScore;
        this.bipolarTotalScore = bipolarTotalScore;
        this.ocdTotalScore = ocdTotalScore;
        this.userId = userId;
    }

    public int getResultCode() {
        return resultCode;
    }


    public Date getTestDate() {
        return testDate;
    }


    public int getDepressionTotalScore() {
        return depressionTotalScore;
    }


    public int getAnxietyTotalScore() {
        return anxietyTotalScore;
    }


    public int getBipolarTotalScore() {
        return bipolarTotalScore;
    }


    public int getOcdTotalScore() {
        return ocdTotalScore;
    }


    public String getUserId() {
        return userId;
    }


    @Override
    public String toString() {
        return "MemberTestResult{" +
                "resultCode=" + resultCode +
                ", testDate=" + testDate +
                ", depressionTotalScore=" + depressionTotalScore +
                ", anxietyTotalScore=" + anxietyTotalScore +
                ", bipolarTotalScore=" + bipolarTotalScore +
                ", ocdTotalScore=" + ocdTotalScore +
                ", userId='" + userId + '\'' +
                '}';
    }
}
