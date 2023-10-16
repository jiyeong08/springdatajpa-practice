package com.springdatajpa.practice.testresult.dto;

public class TestResultDTO {

    private int resultCode;
    private String testDate;
    private int depressionTotalScore;
    private int anxietyTotalScore;
    private int bipolarTotalScore;
    private int ocdTotalScore;
    private String userId;

    public TestResultDTO() {
    }

    public TestResultDTO(int resultCode, String testDate, int depressionTotalScore, int anxietyTotalScore, int bipolarTotalScore, int ocdTotalScore, String userId) {
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

    public String getUserID() {
        return userId;
    }

    public void setUserID(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "MemberTestResultDTO{" +
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
