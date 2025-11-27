package com.yitu.plugin.dameng.client;

import com.yitu.db.common.enums.DbType;
import com.yitu.db.core.client.BaseAdHocDataSourceClient;
import com.yitu.db.core.param.BaseConnectionParam;

/**
 * @author xiap
 * @since 2025-11-27-10:00
 */
public class DaMengAdHocDataSourceClient extends BaseAdHocDataSourceClient {

    public DaMengAdHocDataSourceClient(BaseConnectionParam baseConnectionParam, DbType dbType) {
        super(baseConnectionParam, dbType);
    }
}
