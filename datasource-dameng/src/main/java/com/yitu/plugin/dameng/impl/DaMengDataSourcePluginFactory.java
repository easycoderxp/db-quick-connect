package com.yitu.plugin.dameng.impl;

import com.google.auto.service.AutoService;
import com.yitu.db.common.enums.DbType;
import com.yitu.db.plugin.DataSourcePlugin;
import com.yitu.db.plugin.DataSourcePluginFactory;
import com.yitu.db.plugin.SpiIdentify;

/**
 * @author xiap
 * @since 2025-11-27-10:06
 */
@AutoService(DataSourcePluginFactory.class)
public class DaMengDataSourcePluginFactory implements DataSourcePluginFactory {
    @Override
    public String getName() {
        return DbType.DAMENG.getName();
    }

    @Override
    public DataSourcePlugin create() {
        return new DaMengDataSourcePlugin();
    }

    @Override
    public SpiIdentify getIdentify(){
        return SpiIdentify.builder().name(getName()).build();
    }
}
