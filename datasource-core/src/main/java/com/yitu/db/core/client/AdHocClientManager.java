package com.yitu.db.core.client;

import com.yitu.db.common.enums.DbType;
import com.yitu.db.core.param.BaseConnectionParam;
import com.yitu.db.core.param.ConnectionParam;
import com.yitu.db.plugin.DataSourcePlugin;
import com.yitu.db.plugin.DataSourcePluginManager;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author xiap
 * @since 2025-11-26-11:11
 */
public class AdHocClientManager {
    private static final DataSourcePluginManager PLUGIN_MANAGER = DataSourcePluginManager.getInstance();

    public Connection getConnection(DbType dbType, ConnectionParam param) throws SQLException {
        AdHocDataSourceClient client = getClient(dbType, param);
        return client.getConnection();
    }

    public AdHocDataSourceClient getClient(DbType dbType, ConnectionParam param) {
        BaseConnectionParam baseParam = (BaseConnectionParam) param;
        DataSourcePlugin plugin = PLUGIN_MANAGER.getDataSourcePlugin(dbType);
        if (plugin == null) {
            throw new RuntimeException("Plugin not found for: " + dbType.getName());
        }
        return plugin.createAdHocDataSourceClient(baseParam, dbType);
    }
}
