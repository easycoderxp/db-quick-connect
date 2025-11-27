package com.yitu.plugin.kingbase.client;

import com.yitu.db.common.config.PoolConfig;
import com.yitu.db.common.enums.DbType;
import com.yitu.db.core.client.BasePooledDataSourceClient;
import com.yitu.db.core.param.BaseConnectionParam;

/**
 * @author xiap
 * @since 2025-11-27-14:34
 */
public class KingBasePooledDataSourceClient extends BasePooledDataSourceClient {
    public KingBasePooledDataSourceClient(BaseConnectionParam baseConnectionParam, DbType dbType, PoolConfig poolConfig) {
        super(baseConnectionParam, dbType, poolConfig);
    }
}
