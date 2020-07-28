package com.example.mall.config;

import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class DataConfig {
    public DataSourceConfig dataSourceConfig(){
        DataSourceConfig dsc =new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://192.168.1.136:3306/mall?useUnicode=true&characterEncoding=utf8&autoReconnect=true&rewriteBatchedStatements=TRUE");
        // dsc.setSchemaName("public");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("root");
        return dsc;
    }
}
