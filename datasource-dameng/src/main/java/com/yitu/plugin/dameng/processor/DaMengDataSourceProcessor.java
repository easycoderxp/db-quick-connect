package com.yitu.plugin.dameng.processor;

import com.google.auto.service.AutoService;
import com.yitu.db.common.constants.DataSourceConstants;
import com.yitu.db.common.enums.DbType;
import com.yitu.db.core.param.ConnectionParam;
import com.yitu.db.core.processor.AbstractDataSourceProcessor;
import com.yitu.db.core.processor.DataSourceProcessor;
import com.yitu.plugin.dameng.param.DaMengConnectionParam;
import lombok.extern.slf4j.Slf4j;

import java.util.Properties;

/**
 * @author xiap
 * @since 2025-11-27-10:03
 */
@Slf4j
@AutoService(DataSourceProcessor.class)
public class DaMengDataSourceProcessor extends AbstractDataSourceProcessor {
    @Override
    public Properties getConnectionProperties(ConnectionParam connectionParam) {
        DaMengConnectionParam daMengConnectionParam = (DaMengConnectionParam) connectionParam;
        Properties connectionProperties = super.getConnectionProperties(connectionParam);
        connectionProperties.putAll(daMengConnectionParam.getOther());
        //优先级更高，可以覆盖jdbc url中的参数
        return connectionProperties;
    }

    @Override
    public DbType getDbType() {
        return DbType.DAMENG;
    }

    @Override
    public String getDefaultJdbcUrlTemplate() {
        return DataSourceConstants.JdbcUrl.DAMENG + "{host}:{port}/{dbName}";
    }
}
