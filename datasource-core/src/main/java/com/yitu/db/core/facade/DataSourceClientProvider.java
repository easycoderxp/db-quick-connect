package com.yitu.db.core.facade;

import com.yitu.db.common.config.HikariPoolMetrics;
import com.yitu.db.common.config.PoolConfig;
import com.yitu.db.core.client.*;
import com.yitu.db.core.client.AdHocClientManager;
import com.yitu.db.core.client.PooledClientManager;
import com.yitu.db.core.param.ConnectionParam;
import com.yitu.db.common.enums.DbType;
import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.concurrent.ExecutionException;

/**
 * @author xiap
 * @since 2025-11-10-17:50
 */
@Slf4j
public class DataSourceClientProvider {
    private static final PooledClientManager POOLED_MANAGER = new PooledClientManager();
    private static final AdHocClientManager ADHOC_MANAGER = new AdHocClientManager();

    public static Connection getPooledConnection(DbType dbType, ConnectionParam connectionParam)
            throws SQLException {
        return POOLED_MANAGER.getConnection(dbType, connectionParam, PoolConfig.DEFAULT);
    }

    public static Connection getPooledConnection(DbType dbType, ConnectionParam connectionParam,
                                                 PoolConfig poolConfig) throws SQLException {
        return POOLED_MANAGER.getConnection(dbType, connectionParam, poolConfig);
    }

    public static void closePooledClient(DbType dbType, ConnectionParam param) {
        POOLED_MANAGER.closeClient(dbType, param);
    }

    public static HikariPoolMetrics getMetrics(DbType dbType, ConnectionParam param) {
        return POOLED_MANAGER.getMetrics(dbType, param);
    }


    public static Connection getAdHocConnection(DbType dbType, ConnectionParam connectionParam) throws SQLException {
        return ADHOC_MANAGER.getConnection(dbType, connectionParam);
    }

    public static boolean testConnection(DbType dbType, ConnectionParam connectionParam) throws SQLException {
        try (Connection connection = getAdHocConnection(dbType, connectionParam)) {
            return connection.isValid(5);
        }
    }
}
