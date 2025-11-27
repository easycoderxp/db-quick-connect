package com.yitu.plugin.kingbase.processor;

import com.google.auto.service.AutoService;
import com.yitu.db.common.constants.DataSourceConstants;
import com.yitu.db.common.enums.DbType;
import com.yitu.db.core.param.ConnectionParam;
import com.yitu.db.core.processor.AbstractDataSourceProcessor;
import com.yitu.db.core.processor.DataSourceProcessor;
import com.yitu.plugin.kingbase.param.KingBaseConnectionParam;
import lombok.extern.slf4j.Slf4j;

import java.util.Properties;

/**
 * @author xiap
 * @since 2025-11-27-14:35
 */
@Slf4j
@AutoService(DataSourceProcessor.class)
public class KingBaseDataSourceProcessor extends AbstractDataSourceProcessor {
    @Override
    public DbType getDbType() {
        return DbType.KINGBASE;
    }

    @Override
    public Properties getConnectionProperties(ConnectionParam connectionParam) {
        KingBaseConnectionParam kingBaseConnectionParam = (KingBaseConnectionParam) connectionParam;
        Properties connectionProperties = super.getConnectionProperties(connectionParam);
        connectionProperties.putAll(kingBaseConnectionParam.getOther());
        //优先级更高，可以覆盖jdbc url中的参数
        return connectionProperties;
    }

    @Override
    public String getDefaultJdbcUrlTemplate() {
        return DataSourceConstants.JdbcUrl.KINGBASE + "{host}:{port}/{dbName}";
    }
}
