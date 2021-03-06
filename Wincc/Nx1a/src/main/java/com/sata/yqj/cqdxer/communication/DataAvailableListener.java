package com.sata.yqj.cqdxer.communication;

/**
 * @Description: 串口存在有效数据监听
 * @author YQJ  
 * @date 2020年9月4日 上午12:23:48
 */
public interface DataAvailableListener {
    /**
     * @Description: 串口存在有效数据
     * @return void    
     * @date 2020年9月4日 上午12:24:06
     */
    void dataAvailable();
}
