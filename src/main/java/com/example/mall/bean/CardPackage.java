package com.example.mall.bean;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author kkdaini
 * @since 2020-07-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CardPackage implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    private Integer uid;

    /**
     * 优惠券ID
     */
    private Integer did;

    /**
     * 数量
     */
    private Integer number;


}
