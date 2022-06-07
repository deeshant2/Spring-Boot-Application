package com.springboot.deeshant.airline.data;

import javax.persistence.*;

@Entity
@Table(name = "PLANE")
public class Plane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PLANE_ID")
    private long planeId;

    @Column(name = "MODEL")
    private String model;

    public long getPlaneId() {
        return planeId;
    }

    public void setPlaneId(long planeId) {
        this.planeId = planeId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
