package com.evan.wj.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

@Entity
@Table(name = "user")
//Jackson 解析json数据之忽略解析字段注解('https://blog.csdn.net/ngl272/article/details/70217104')
//指定的字段不会被序列化和反序列化。
//添加 handler 和 hibernateLazyInitializer 这两个无须 json 化的属性
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})

public class User {
//    标注用于声明一个实体类的属性映射为数据库的主键列
    @Id
//    用于标注主键的生成策略,自动生成id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    String username;
    String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

