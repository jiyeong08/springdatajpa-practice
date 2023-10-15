package com.springdatajpa.practice.testresult.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "member_test_result")
public class MemberTestResult {

    @Id
    @Column(name = "result_code")
    private int resultCode;

    @Column(name = "test_date")
    private String testDate;

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

    protected MemberTestResult(){}

    public MemberTestResult(int resultCode, String testDate, int depressionTotalScore, int anxietyTotalScore, int bipolarTotalScore, int ocdTotalScore, String userId) {
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

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getTestDate() {
        return testDate;
    }

    public void setTestDate(String testDate) {
        this.testDate = testDate;
    }

    public int getDepressionTotalScore() {
        return depressionTotalScore;
    }

    public void setDepressionTotalScore(int depressionTotalScore) {
        this.depressionTotalScore = depressionTotalScore;
    }

    public int getAnxietyTotalScore() {
        return anxietyTotalScore;
    }

    public void setAnxietyTotalScore(int anxietyTotalScore) {
        this.anxietyTotalScore = anxietyTotalScore;
    }

    public int getBipolarTotalScore() {
        return bipolarTotalScore;
    }

    public void setBipolarTotalScore(int bipolarTotalScore) {
        this.bipolarTotalScore = bipolarTotalScore;
    }

    public int getOcdTotalScore() {
        return ocdTotalScore;
    }

    public void setOcdTotalScore(int ocdTotalScore) {
        this.ocdTotalScore = ocdTotalScore;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "MemberTestResult{" +
                "resultCode=" + resultCode +
                ", testDate='" + testDate + '\'' +
                ", depressionTotalScore=" + depressionTotalScore +
                ", anxietyTotalScore=" + anxietyTotalScore +
                ", bipolarTotalScore=" + bipolarTotalScore +
                ", ocdTotalScore=" + ocdTotalScore +
                ", userId='" + userId + '\'' +
                '}';
    }
}
