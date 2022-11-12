package com.sda.java11.coursecenter.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Getter
@Setter
@Entity(name = "subscription")
public class Subscription extends BaseEntities{
    @Email
    protected  String email;
    @NotBlank
    @Column(name = "card_number")
    protected String cardnumber;
    @Column(name = "first_name")
    protected String firstname;
    @Column(name = "last_name")
    protected String lastname;
    @Column(name = "course_id")
    @Type(type = "org.hibernate.type.UUIDCharType")
    protected UUID courseid;
    @ManyToOne
    @JoinColumn(insertable = false, updatable = false, name = "course_id")
    protected Course course;
}