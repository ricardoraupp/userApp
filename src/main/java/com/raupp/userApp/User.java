package com.raupp.userApp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;
import java.math.BigInteger;
import java.net.UnknownServiceException;

@Entity
@IdClass(UserId.class)
@JsonIgnoreProperties({"hibernateLazyInitalizer","handler"})
public class User{
    @Id
    private BigInteger userId;
    @Id
    private BigInteger courseId;
    private String username;

    public User() {
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
