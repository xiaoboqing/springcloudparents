package com.wang.emqx.entity;
/**
 *
 */

import lombok.Data;
@Data
public class SignIn {
    /**
     * 编号
     */
    private Integer id;
    /**
     * 设备编号
     */
    private String sn;
    /**
     * 机构编号
     */
    private String firmId;
    /**
     * 产品编号
     */
    private String productId;
    /**
     * 请求的时间戳
     */
    private String requestTimestamp;
    /**
     * 签名
     */
    private String sign;
}
