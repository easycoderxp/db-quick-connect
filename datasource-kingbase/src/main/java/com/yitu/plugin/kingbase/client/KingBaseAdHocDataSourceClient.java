package com.yitu.plugin.kingbase.client;

import com.yitu.db.common.enums.DbType;
import com.yitu.db.core.client.BaseAdHocDataSourceClient;
import com.yitu.db.core.param.BaseConnectionParam;

/**
 * @author xiap
 * @since 2025-11-27-14:33
 */
public class KingBaseAdHocDataSourceClient extends BaseAdHocDataSourceClient {
    public KingBaseAdHocDataSourceClient(BaseConnectionParam baseConnectionParam, DbType dbType) {
        super(baseConnectionParam, dbType);
    }
}
