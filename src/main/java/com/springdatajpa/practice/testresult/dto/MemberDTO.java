package com.springdatajpa.practice.testresult.dto;

public class MemberDTO {

    private String userId;
    private String nickname;
    private char testStatus;
    private char relationCK;
    private char therapistGenderCK;

    public MemberDTO() {
    }

    public MemberDTO(String userId, String nickname, char testStatus, char relationCK, char therapistGenderCK) {
        this.userId = userId;
        this.nickname = nickname;
        this.testStatus = testStatus;
        this.relationCK = relationCK;
        this.therapistGenderCK = therapistGenderCK;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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
                ", nickname='" + nickname + '\'' +
                ", testStatus=" + testStatus +
                ", relationCK=" + relationCK +
                ", therapistGenderCK=" + therapistGenderCK +
                '}';
    }
}
