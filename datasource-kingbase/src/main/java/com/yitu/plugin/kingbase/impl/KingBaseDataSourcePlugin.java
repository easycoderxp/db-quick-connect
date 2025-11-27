package com.yitu.plugin.kingbase.impl;

import com.yitu.db.common.config.PoolConfig;
import com.yitu.db.common.enums.DbType;
import com.yitu.db.core.client.AdHocDataSourceClient;
import com.yitu.db.core.client.PooledDataSourceClient;
import com.yitu.db.core.param.BaseConnectionParam;
import com.yitu.db.plugin.DataSourcePlugin;
import com.yitu.plugin.kingbase.client.KingBaseAdHocDataSourceClient;
import com.yitu.plugin.kingbase.client.KingBasePooledDataSourceClient;

/**
 * @author xiap
 * @since 2025-11-27-14:40
 */
public class KingBaseDataSourcePlugin implements DataSourcePlugin {

    @Override
    public AdHocDataSourceClient createAdHocDataSourceClient(BaseConnectionParam baseConnectionParam, DbType dbType) {
        return new KingBaseAdHocDataSourceClient(baseConnectionParam, dbType);
    }

    @Override
    public PooledDataSourceClient createPooledDataSourceClient(BaseConnectionParam baseConnectionParam, DbType dbType,
                                                               PoolConfig poolConfig) {
        return new KingBasePooledDataSourceClient(baseConnectionParam, dbType, poolConfig);
    }
}
