package com.raupp.userApp;


import java.io.Serializable;
import java.math.BigInteger;

public class UserId implements Serializable {

    private BigInteger userId;
    private BigInteger courseId;

    public UserId() {
    }

    public BigInteger getUserId() {
        return userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
    }

    public BigInteger getCourseId() {
        return courseId;
    }

    public void setCourseId(BigInteger courseId) {
        this.courseId = courseId;
    }
}
