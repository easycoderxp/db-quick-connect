package com.yitu.plugin.mysql.client;

import com.yitu.db.common.config.PoolConfig;
import com.yitu.db.core.client.BasePooledDataSourceClient;
import com.yitu.db.core.param.BaseConnectionParam;
import com.yitu.db.common.enums.DbType;

/**
 * @author xiap
 * @since 2025-11-10-18:11
 */
public class MySqlPooledDataSourceClient extends BasePooledDataSourceClient {
    public MySqlPooledDataSourceClient(BaseConnectionParam baseConnectionParam, DbType dbType, PoolConfig poolConfig) {
        super(baseConnectionParam, dbType, poolConfig);
    }
}
