package com.step.tourist_agency.entity;

import com.step.tourist_agency.entity.parent.NameEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "ta_customer")
public class Customer extends NameEntity {

    @Basic
    @Column(name = "last_name")
    private String lastName;

    //------------------------------------------------------------------------------------------------------------------

    @OneToMany(mappedBy = "customer")
    private List<Order> orderList;
}
