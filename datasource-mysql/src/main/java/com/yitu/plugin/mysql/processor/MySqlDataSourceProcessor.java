package com.yitu.plugin.mysql.processor;

import com.google.auto.service.AutoService;
import com.yitu.db.common.constants.DataSourceConstants;
import com.yitu.db.core.processor.AbstractDataSourceProcessor;
import com.yitu.db.core.processor.DataSourceProcessor;
import com.yitu.db.core.param.ConnectionParam;
import com.yitu.db.common.enums.DbType;
import com.yitu.plugin.mysql.param.MySqlConnectionParam;
import lombok.extern.slf4j.Slf4j;

import java.util.*;

/**
 * @author xiap
 * @since 2025-11-10-18:05
 */

@Slf4j
@AutoService(DataSourceProcessor.class)
public class MySqlDataSourceProcessor extends AbstractDataSourceProcessor {

    @Override
    public Properties getConnectionProperties(ConnectionParam connectionParam) {
        MySqlConnectionParam mysqlConnectionParam = (MySqlConnectionParam) connectionParam;
        Properties connectionProperties = super.getConnectionProperties(connectionParam);
        connectionProperties.putAll(mysqlConnectionParam.getOther());
        //优先级更高，可以覆盖jdbc url中的参数
        return connectionProperties;
    }

    @Override
    public DbType getDbType() {
        return DbType.MYSQL;
    }

    @Override
    public String getDefaultJdbcUrlTemplate() {
        return DataSourceConstants.JdbcUrl.MYSQL + "{host}:{port}/{dbName}";
    }

}
