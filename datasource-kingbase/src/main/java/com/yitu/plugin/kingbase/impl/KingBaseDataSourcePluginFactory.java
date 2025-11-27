package com.yitu.plugin.kingbase.impl;

import com.google.auto.service.AutoService;
import com.yitu.db.common.enums.DbType;
import com.yitu.db.plugin.DataSourcePlugin;
import com.yitu.db.plugin.DataSourcePluginFactory;
import com.yitu.db.plugin.SpiIdentify;

/**
 * @author xiap
 * @since 2025-11-27-14:42
 */
@AutoService(DataSourcePluginFactory.class)
public class KingBaseDataSourcePluginFactory implements DataSourcePluginFactory {
    @Override
    public String getName() {
        return DbType.KINGBASE.getName();
    }

    @Override
    public DataSourcePlugin create() {
        return new KingBaseDataSourcePlugin();
    }

    @Override
    public SpiIdentify getIdentify() {
        return SpiIdentify.builder().name(getName()).build();
    }
}
