package com.github.yuyenews.data.processing;

import com.github.yuyenews.data.processing.concurrent.collection.ConcurrentCollectionAsync;
import com.github.yuyenews.data.processing.concurrent.collection.ConcurrentCollectionSync;
import com.github.yuyenews.data.processing.concurrent.map.ConcurrentMapAsync;
import com.github.yuyenews.data.processing.concurrent.map.ConcurrentMapSync;
import com.github.yuyenews.data.processing.concurrent.task.ConcurrentTaskSync;
import com.github.yuyenews.data.processing.pac.MagicianProducerAndConsumerManager;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/**
 * 项目入口
 * 从这里，你可以创建本项目的任意对象
 */
public class MagicianDataProcessing {

    /**
     * 创建Collection并发执行对象（同步）
     * @return
     */
    public static ConcurrentCollectionSync getConcurrentCollectionSync() {
        return new ConcurrentCollectionSync();
    }

    /**
     * 创建Collection并发执行对象（异步）
     * @param corePoolSize 核心线程数
     * @param maximumPoolSize 最大线程数
     * @param keepAliveTime 最大空闲时间
     * @param unit 最大空闲时间的单位
     * @param threadFactory 拒绝策略
     * @return
     */
    public static ConcurrentCollectionAsync getConcurrentCollectionAsync(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, ThreadFactory threadFactory) {
        return new ConcurrentCollectionAsync(corePoolSize, maximumPoolSize, keepAliveTime, unit, threadFactory);
    }

    /**
     * 创建Collection并发执行对象（异步）
     * @param corePoolSize 核心线程数
     * @param maximumPoolSize 最大线程数
     * @param keepAliveTime 最大空闲时间
     * @param unit 最大空闲时间的单位
     * @return
     */
    public static ConcurrentCollectionAsync getConcurrentCollectionAsync(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit) {
        return new ConcurrentCollectionAsync(corePoolSize, maximumPoolSize, keepAliveTime, unit);
    }

    /**
     * 创建Collection并发执行对象（异步）
     * @param corePoolSize 核心线程数
     * @param maximumPoolSize 最大线程数
     * @return
     */
    public static ConcurrentCollectionAsync getConcurrentCollectionAsync(int corePoolSize, int maximumPoolSize) {
        return new ConcurrentCollectionAsync(corePoolSize, maximumPoolSize, 1, TimeUnit.MINUTES);
    }

    /**
     * 创建Map并发执行对象（同步）
     * @return
     */
    public static ConcurrentMapSync getConcurrentMapSync(){
        return new ConcurrentMapSync();
    }

    /**
     * 创建Map并发执行对象（异步）
     * @param corePoolSize 核心线程数
     * @param maximumPoolSize 最大线程数
     * @param keepAliveTime 最大空闲时间
     * @param unit 最大空闲时间的单位
     * @param threadFactory 拒绝策略
     * @return
     */
    public static ConcurrentMapAsync getConcurrentMapAsync(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, ThreadFactory threadFactory) {
        return new ConcurrentMapAsync(corePoolSize, maximumPoolSize, keepAliveTime, unit, threadFactory);
    }

    /**
     * 创建Map并发执行对象（异步）
     * @param corePoolSize 核心线程数
     * @param maximumPoolSize 最大线程数
     * @param keepAliveTime 最大空闲时间
     * @param unit 最大空闲时间的单位
     * @return
     */
    public static ConcurrentMapAsync getConcurrentMapAsync(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit) {
        return new ConcurrentMapAsync(corePoolSize, maximumPoolSize, keepAliveTime, unit);
    }

    /**
     * 创建Map并发执行对象（异步）
     * @param corePoolSize 核心线程数
     * @param maximumPoolSize 最大线程数
     * @return
     */
    public static ConcurrentMapAsync getConcurrentMapAsync(int corePoolSize, int maximumPoolSize) {
        return new ConcurrentMapAsync(corePoolSize, maximumPoolSize, 1, TimeUnit.MINUTES);
    }

    /**
     * 创建任务并发执行对象（同步）
     * @return
     */
    public static ConcurrentTaskSync getConcurrentTaskSync(){
        return new ConcurrentTaskSync();
    }

    /**
     * 创建任务生产者、消费者模型对象
     * @return
     */
    public static MagicianProducerAndConsumerManager getProducerAndConsumerManager(){
        return new MagicianProducerAndConsumerManager();
    }

}
