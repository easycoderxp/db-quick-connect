package com.yitu.plugin.mysql.client;

import com.yitu.db.core.client.BaseAdHocDataSourceClient;
import com.yitu.db.core.param.BaseConnectionParam;
import com.yitu.db.common.enums.DbType;
import com.yitu.plugin.mysql.param.MySqlConnectionParam;


/**
 * @author xiap
 * @since 2025-11-10-18:12
 */
public class MySqlAdHocDataSourceClient extends BaseAdHocDataSourceClient {
    public MySqlAdHocDataSourceClient(BaseConnectionParam baseConnectionParam, DbType dbType) {
        super(baseConnectionParam, dbType);
        if (!(baseConnectionParam instanceof MySqlConnectionParam)) {
            throw new IllegalArgumentException("Expected MySqlConnectionParam for MySQL client");
        }
    }
}
