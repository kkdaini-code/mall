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
 * @since 2020-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Discount implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 满
     */
    private Double full;

    /**
     * 减
     */
    private Double less;


}
