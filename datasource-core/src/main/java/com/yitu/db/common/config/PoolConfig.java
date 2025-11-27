package com.yitu.db.common.config;

import lombok.Data;

/**
 * @author xiap
 * @since 2025-11-20-18:00
 */
@Data
public class PoolConfig {
    /**
     * 最小空闲连接数
     */
    private int minIdle = 5;
    /**
     * 最大连接数
     */
    private int maxPoolSize = 10;
    /**
     * 等待获取连接超时时间，单位毫秒
     */
    private long connectionTimeoutMs = 10_000L;


    public static final PoolConfig DEFAULT = new PoolConfig();
}
