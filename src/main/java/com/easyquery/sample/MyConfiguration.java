//package com.easyquery.sample;
//
//import com.easy.query.api4j.client.DefaultEasyQuery;
//import com.easy.query.api4j.client.EasyQuery;
//import com.easy.query.core.api.client.EasyQueryClient;
//import com.easy.query.core.basic.jdbc.conn.ConnectionManager;
//import com.easy.query.core.bootstrapper.EasyQueryBootstrapper;
//import com.easy.query.core.configuration.nameconversion.NameConversion;
//import com.easy.query.core.configuration.nameconversion.impl.LowerCamelCaseNameConversion;
//import com.easy.query.core.configuration.nameconversion.impl.UnderlinedNameConversion;
//import com.easy.query.core.datasource.DataSourceUnitFactory;
//import com.easy.query.oracle.config.OracleDatabaseConfiguration;
//import com.easy.query.sql.starter.conn.SpringConnectionManager;
//import com.easy.query.sql.starter.conn.SpringDataSourceUnitFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//
///**
// * create time 2023/9/5 22:15
// * 文件说明
// *
// * @author xuejiaming
// */
//@Configuration
//public class MyConfiguration {
//    @Bean("myeq")
//    public EasyQuery easyQuery1(DataSource dataSource){
//        EasyQueryClient easyQueryClient = EasyQueryBootstrapper.defaultBuilderConfiguration()
//                .setDefaultDataSource(dataSource)
//                .replaceService(DataSourceUnitFactory.class, SpringDataSourceUnitFactory.class)
//                .replaceService(ConnectionManager.class, SpringConnectionManager.class)
//                .replaceService(NameConversion.class, UnderlinedNameConversion.class)
//                .optionConfigure(builder -> {
//                    builder.setDeleteThrowError(easyQueryProperties.getDeleteThrow());
//                    builder.setInsertStrategy(easyQueryProperties.getInsertStrategy());
//                    builder.setUpdateStrategy(easyQueryProperties.getUpdateStrategy());
//                    builder.setMaxShardingQueryLimit(easyQueryProperties.getMaxShardingQueryLimit());
//                    builder.setExecutorMaximumPoolSize(easyQueryProperties.getExecutorMaximumPoolSize());
//                    builder.setExecutorCorePoolSize(easyQueryProperties.getExecutorCorePoolSize());
//                    builder.setThrowIfRouteNotMatch(easyQueryProperties.isThrowIfRouteNotMatch());
//                    builder.setShardingExecuteTimeoutMillis(easyQueryProperties.getShardingExecuteTimeoutMillis());
//                    builder.setQueryLargeColumn(easyQueryProperties.isQueryLargeColumn());
//                    builder.setMaxShardingRouteCount(easyQueryProperties.getMaxShardingRouteCount());
//                    builder.setExecutorQueueSize(easyQueryProperties.getExecutorQueueSize());
//                    builder.setDefaultDataSourceName(easyQueryProperties.getDefaultDataSourceName());
//                    builder.setDefaultDataSourceMergePoolSize(easyQueryProperties.getDefaultDataSourceMergePoolSize());
//                    builder.setMultiConnWaitTimeoutMillis(easyQueryProperties.getMultiConnWaitTimeoutMillis());
//                    builder.setWarningBusy(easyQueryProperties.isWarningBusy());
//                    builder.setInsertBatchThreshold(easyQueryProperties.getInsertBatchThreshold());
//                    builder.setUpdateBatchThreshold(easyQueryProperties.getUpdateBatchThreshold());
//                    builder.setPrintSql(easyQueryProperties.isPrintSql());
//                    builder.setStartTimeJob(easyQueryProperties.isStartTimeJob());
//                    builder.setDefaultTrack(easyQueryProperties.isDefaultTrack());
//                    builder.setRelationGroupSize(easyQueryProperties.getRelationGroupSize());
//                    builder.setNoVersionError(easyQueryProperties.isNoVersionError());
//                })
//                .useDatabaseConfigure(new OracleDatabaseConfiguration())
//                .build();
//        return new DefaultEasyQuery(easyQueryClient);
//    }
//}
