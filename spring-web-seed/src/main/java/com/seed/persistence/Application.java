package com.seed.persistence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by jiachiliu on 6/15/14.
 */
@Entity
public class Application {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String appName;
    private Timestamp created;
    private String category;
    private Float price;

    public Application(){}

    public Long getId() {
        return id;
    }

    public String getAppName() {
        return appName;
    }

    public Timestamp getCreated() {
        return created;
    }

    public String getCategory() {
        return category;
    }

    public Float getPrice() {
        return price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Application{" +
                "id=" + id +
                ", appName='" + appName + '\'' +
                ", created=" + created +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Application that = (Application) o;

        if (!appName.equals(that.appName)) return false;
        if (category != null ? !category.equals(that.category) : that.category != null) return false;
        if (!created.equals(that.created)) return false;
        if (!id.equals(that.id)) return false;
        if (!price.equals(that.price)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + appName.hashCode();
        result = 31 * result + created.hashCode();
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + price.hashCode();
        return result;
    }
}
