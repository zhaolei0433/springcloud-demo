package com.example.userservice.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

/**
 * @author zhaolei
 * Create: 2019/4/19 14:50
 * Modified By:
 * Description:
 */
@Data
@Entity
@Table(name = "user_info")
@DynamicUpdate()
@DynamicInsert()
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 相当于identity主键生成策略
    private Integer id;

    @Column(name = "user_name", nullable = false, columnDefinition = "varchar(100) COMMENT '用户名'")
    private String userName;

    @Column(name = "password", nullable = false, columnDefinition = "varchar(100) COMMENT '密码'")
    private String password;

    @Column(name = "phone", nullable = false, columnDefinition = "varchar(100) COMMENT '电话号码'")
    private String phone;

    @Column(name = "mail_box", nullable = false, columnDefinition = "varchar(100) COMMENT '邮箱'")
    private String mailBox;

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", mailBox='" + mailBox + '\'' +
                '}';
    }
}
