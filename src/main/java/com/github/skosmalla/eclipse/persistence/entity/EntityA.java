package com.github.skosmalla.eclipse.persistence.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EntityA {

    private static long i = 1;

    @Id
    private Long id;

    @Basic
    private String propertyA;

    @Basic
    private String propertyB;


    public EntityA() {

    }


    @SuppressWarnings("boxing")
    public EntityA(String propertyA, String propertyB) {
        this.propertyA = propertyA;
        this.propertyB = propertyB;
        this.id = i++;
    }


    public String getPropertyA() {
        return this.propertyA;
    }


    public void setPropertyA(String propertyA) {
        this.propertyA = propertyA;
    }


    public String getPropertyB() {
        return this.propertyB;
    }


    public void setPropertyB(String propertyB) {
        this.propertyB = propertyB;
    }


    public Long getId() {
       return id;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.propertyA == null) ? 0 : this.propertyA.hashCode());
        result = prime * result + ((this.propertyB == null) ? 0 : this.propertyB.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EntityA other = (EntityA) obj;
        if (this.propertyA == null) {
            if (other.propertyA != null)
                return false;
        } else if (!this.propertyA.equals(other.propertyA))
            return false;
        if (this.propertyB == null) {
            if (other.propertyB != null)
                return false;
        } else if (!this.propertyB.equals(other.propertyB))
            return false;
        return true;
    }


}
