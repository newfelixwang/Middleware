package com.felixwang.site.config;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

/**
 * @program: middleware
 * @Author felixwang
 * @Date on 2021/4/8  16:50
 * @Https https:felixwang.site
 * @QQ 2115376870
 * @Description 自定义数据库分表方式
 */
public class ShardingTableAlgorithm implements PreciseShardingAlgorithm<Long> {


    /**
     * 日志打印
     */
    private final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     *
     * @param collection  现在本系统中存在的表
     * @param preciseShardingValue  采用精准分表的方式，这个是分片项，例如采用ID分表(主要用这个) 或者其他日期字段分库
     * @return 返回的具体分到的表的名称
     */
    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Long> preciseShardingValue) {

        //循环所以本系统中的库
        for(String dbName : collection){
            //在本系统中选取，采用分片项对3取余，就会产生 3个库
            //分库策略 如果id%2==0 就去db_0 如果等于1 就是db_1
            if(dbName.endsWith(preciseShardingValue.getValue()%2+"")){
                //分片项，是根据这个表中那个字段分库的
                logger.info("系统中存在-----表为：{}, 表分片项为：{},数据表分片字段{},数据库表分片值{}," +
                                " 最终被分到的表为：【{}】", collection, preciseShardingValue,
                        preciseShardingValue.getColumnName(),preciseShardingValue.getValue(), dbName);
                return dbName;
            }
        }
        throw new IllegalArgumentException();
    }

}
