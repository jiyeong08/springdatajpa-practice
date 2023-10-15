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

    @Column(name = "test_status")
    private char testStatus;

    @Column(name = "relation_ck")
    private char relationCK;

    @Column(name = "etc_content")
    private String etcContent;

    @Column(name = "therapist_gender_ck")
    private char therapistGenderCK;

    protected Member(){}

    public Member(String userId, char testStatus, char relationCK, String etcContent, char therapistGenderCK) {
        this.userId = userId;
        this.testStatus = testStatus;
        this.relationCK = relationCK;
        this.etcContent = etcContent;
        this.therapistGenderCK = therapistGenderCK;
    }

    public String getUserId() {
        return userId;
    }

    public char getTestStatus() {
        return testStatus;
    }

    public char getRelationCK() {
        return relationCK;
    }

    public String getEtcContent() {
        return etcContent;
    }

    public char getTherapistGenderCK() {
        return therapistGenderCK;
    }

    @Override
    public String toString() {
        return "Member{" +
                "userId='" + userId + '\'' +
                ", testStatus=" + testStatus +
                ", relationCK=" + relationCK +
                ", etcContent='" + etcContent + '\'' +
                ", therapistGenderCK=" + therapistGenderCK +
                '}';
    }
}
