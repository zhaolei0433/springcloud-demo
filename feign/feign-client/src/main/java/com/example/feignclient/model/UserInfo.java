package com.example.feignclient.model;

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
public class UserInfo {
    private Integer id;
    private String userName;
    private String password;
    private String phone;
    private String mailBox;
}
