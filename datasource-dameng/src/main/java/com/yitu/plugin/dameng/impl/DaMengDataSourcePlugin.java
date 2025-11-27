package com.yitu.plugin.dameng.impl;

import com.yitu.db.common.config.PoolConfig;
import com.yitu.db.common.enums.DbType;
import com.yitu.db.core.client.AdHocDataSourceClient;
import com.yitu.db.core.client.PooledDataSourceClient;
import com.yitu.db.core.param.BaseConnectionParam;
import com.yitu.db.plugin.DataSourcePlugin;
import com.yitu.plugin.dameng.client.DaMengAdHocDataSourceClient;
import com.yitu.plugin.dameng.client.DaMengPooledDataSourceClient;

/**
 * @author xiap
 * @since 2025-11-27-10:05
 */
public class DaMengDataSourcePlugin implements DataSourcePlugin {
    @Override
    public AdHocDataSourceClient createAdHocDataSourceClient(BaseConnectionParam baseConnectionParam, DbType dbType) {
        return new DaMengAdHocDataSourceClient(baseConnectionParam, dbType);
    }

    @Override
    public PooledDataSourceClient createPooledDataSourceClient(BaseConnectionParam baseConnectionParam, DbType dbType,
                                                               PoolConfig poolConfig) {
        return new DaMengPooledDataSourceClient(baseConnectionParam, dbType, poolConfig);
    }
}
