package com.yitu.plugin.dameng.client;

import com.yitu.db.common.config.PoolConfig;
import com.yitu.db.common.enums.DbType;
import com.yitu.db.core.client.BasePooledDataSourceClient;
import com.yitu.db.core.param.BaseConnectionParam;

/**
 * @author xiap
 * @since 2025-11-27-10:01
 */
public class DaMengPooledDataSourceClient extends BasePooledDataSourceClient {
    public DaMengPooledDataSourceClient(BaseConnectionParam baseConnectionParam, DbType dbType, PoolConfig poolConfig) {
        super(baseConnectionParam, dbType, poolConfig);
    }
}
