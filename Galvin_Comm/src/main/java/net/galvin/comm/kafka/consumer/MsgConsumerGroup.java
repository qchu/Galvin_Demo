package net.galvin.comm.kafka.consumer;


/**
 * 消费者组接口
 */
public interface MsgConsumerGroup {

    /**
     *  消费消息
     * @param msgProcessor 消息处理器
     */
    void execute(MsgProcessor msgProcessor);

    /**
     * 关闭消费者
     */
    void shutdown();

}
