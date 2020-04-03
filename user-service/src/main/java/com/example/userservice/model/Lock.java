package com.example.userservice.model;

import lombok.Data;

/**
 * @author zhaolei
 * Create: 2020/2/24 11:20
 * Modified By:
 * Description: redis全局锁，包括锁的名称
 */
@Data
public class Lock {
    private String name;
    private String value;
}
