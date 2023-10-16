package com.springdatajpa.practice.testresult.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "member")
public class Member {

    @Id
    @Column(name = "user_id")
    private String userId;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "test_status")
    private char testStatus;

    @Column(name = "therapist_gender_ck")
    private char therapistGenderCK;

    public Member userId(String val){
        userId = val;
        return this;
    }

    public Member nickname(String val){
        nickname = val;
        return this;
    }

    public Member testStatus(char val){
        this.testStatus = val;
        return this;
    }

    public Member therapistGenderCK(char val){
        this.therapistGenderCK = val;
        return this;
    }

    public Member builder(){
        return new Member(userId, nickname, testStatus, therapistGenderCK);
    }

    protected Member(){}

    public Member(String userId, String nickname, char testStatus, char therapistGenderCK) {
        this.userId = userId;
        this.nickname = nickname;
        this.testStatus = testStatus;
        this.therapistGenderCK = therapistGenderCK;
    }

    public String getUserId() {
        return userId;
    }

    public String getNickname() {
        return nickname;
    }

    public char getTestStatus() {
        return testStatus;
    }

    public char getTherapistGenderCK() {
        return therapistGenderCK;
    }

    @Override
    public String toString() {
        return "Member{" +
                "userId='" + userId + '\'' +
                ", nickname='" + nickname + '\'' +
                ", testStatus=" + testStatus +
                ", therapistGenderCK=" + therapistGenderCK +
                '}';
    }
}
