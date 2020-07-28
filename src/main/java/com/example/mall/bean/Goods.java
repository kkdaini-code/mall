package com.example.mall.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author kkdaini
 * @since 2020-07-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 价格
     */
    private Double price;

    /**
     * 折扣价格
     */
    private Double discountPrice;

    /**
     * 货号
     */
    private String itm;

    /**
     * 货品状态默认0（未上架）1（上架）
     */
    private Integer status;


}
