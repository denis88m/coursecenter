package com.sda.java11.coursecenter.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "course")
public class Course extends BaseEntities {
    @Column(name = "name")
    protected String name;

    @Column(name = "price")
    protected Double price;

    @Column(name = "duration")
    protected Integer duration;

    @Column(name = "description")
    protected String description;

    @Column(name = "discount")
    protected Boolean discount;

    @Column(name = "discount_price")
    protected Double discountPrice;

    @OneToMany(mappedBy = "course")
    protected List<Subscription> subscriptions;
}
