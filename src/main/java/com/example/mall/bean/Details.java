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
public class Details implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商品表ID
     */
    private Integer gid;

    /**
     * 商品标题
     */
    private String title;

    /**
     * 商品介绍
     */
    private String introduction;


}
