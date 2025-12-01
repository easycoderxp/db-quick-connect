package com.yitu.db.common.enums;

import com.google.common.base.Functions;
import lombok.Getter;

import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;

import static java.util.stream.Collectors.toMap;

/**
 * @author xiap
 * @since 2025-11-10-15:51
 */
@Getter
public enum DbType {
    /**
     * mysql
     */
    MYSQL(0, "mysql", "mysql"),
    POSTGRESQL(1, "postgresql", "postgresql"),
    HIVE(2, "hive", "hive"),
    SPARK(3, "spark", "spark"),
    CLICKHOUSE(4, "clickhouse", "clickhouse"),
    ORACLE(5, "oracle", "oracle"),
    SQLSERVER(6, "sqlserver", "sqlserver"),
    DB2(7, "db2", "db2"),
    PRESTO(8, "presto", "presto"),
    H2(9, "h2", "h2"),
    DAMENG(10, "dameng", "dameng"),
    OCEANBASE(11, "oceanbase", "oceanbase"),
    SSH(12, "ssh", "ssh"),
    DORIS(13, "doris", "doris"),
    K8S(14, "k8s", "k8s"),
    KINGBASE(15, "kingbase", "kingbase"),;

    private static final Map<Integer, DbType> DB_TYPE_MAP =
            Arrays.stream(DbType.values()).collect(toMap(DbType::getCode, Functions.identity()));
    private final int code;
    private final String name;
    private final String desc;

    DbType(int code, String name, String desc) {
        this.code = code;
        this.name = name;
        this.desc = desc;
    }

    public static DbType of(int type) {
        if (DB_TYPE_MAP.containsKey(type)) {
            return DB_TYPE_MAP.get(type);
        }
        return null;
    }

    public static DbType ofName(String name) {
        return Arrays.stream(DbType.values()).filter(e -> e.name().equals(name)).findFirst()
                .orElseThrow(() -> new NoSuchElementException("no such db type"));
    }

}
