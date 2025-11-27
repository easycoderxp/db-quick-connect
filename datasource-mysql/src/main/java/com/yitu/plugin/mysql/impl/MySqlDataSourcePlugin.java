package com.yitu.plugin.mysql.impl;

import com.yitu.db.common.config.PoolConfig;
import com.yitu.db.core.client.AdHocDataSourceClient;
import com.yitu.db.core.param.BaseConnectionParam;
import com.yitu.db.plugin.DataSourcePlugin;
import com.yitu.db.core.client.PooledDataSourceClient;
import com.yitu.db.common.enums.DbType;
import com.yitu.plugin.mysql.client.MySqlAdHocDataSourceClient;
import com.yitu.plugin.mysql.client.MySqlPooledDataSourceClient;

/**
 * @author xiap
 * @since 2025-11-10-18:11
 */
public class MySqlDataSourcePlugin implements DataSourcePlugin {
    @Override
    public AdHocDataSourceClient createAdHocDataSourceClient(BaseConnectionParam baseConnectionParam, DbType dbType) {
        return new MySqlAdHocDataSourceClient(baseConnectionParam, dbType);
    }

    @Override
    public PooledDataSourceClient createPooledDataSourceClient(BaseConnectionParam baseConnectionParam,
                                                               DbType dbType, PoolConfig poolConfig) {
        return new MySqlPooledDataSourceClient(baseConnectionParam, dbType, poolConfig);
    }
}
