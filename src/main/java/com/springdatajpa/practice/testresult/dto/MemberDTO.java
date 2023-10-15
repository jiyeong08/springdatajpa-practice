package com.springdatajpa.practice.testresult.dto;

public class MemberDTO {

    private String userId;
    private char testStatus;
    private char relationCK;
    private String etcContent;
    private char therapistGenderCK;

    public MemberDTO() {
    }

    public MemberDTO(String userId, char testStatus, char relationCK, String etcContent, char therapistGenderCK) {
        this.userId = userId;
        this.testStatus = testStatus;
        this.relationCK = relationCK;
        this.etcContent = etcContent;
        this.therapistGenderCK = therapistGenderCK;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public char getTestStatus() {
        return testStatus;
    }

    public void setTestStatus(char testStatus) {
        this.testStatus = testStatus;
    }

    public char getRelationCK() {
        return relationCK;
    }

    public void setRelationCK(char relationCK) {
        this.relationCK = relationCK;
    }

    public String getEtcContent() {
        return etcContent;
    }

    public void setEtcContent(String etcContent) {
        this.etcContent = etcContent;
    }

    public char getTherapistGenderCK() {
        return therapistGenderCK;
    }

    public void setTherapistGenderCK(char therapistGenderCK) {
        this.therapistGenderCK = therapistGenderCK;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "userId='" + userId + '\'' +
                ", testStatus=" + testStatus +
                ", relationCK=" + relationCK +
                ", etcContent='" + etcContent + '\'' +
                ", therapistGenderCK=" + therapistGenderCK +
                '}';
    }
}
