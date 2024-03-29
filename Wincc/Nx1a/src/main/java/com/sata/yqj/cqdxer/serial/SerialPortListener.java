package com.sata.yqj.cqdxer.serial;

import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;

/**
 * @Description: 串口监听服务
 * @author YQJ
 * @date 2020年9月4日 上午12:24:34
 */
public class SerialPortListener implements SerialPortEventListener {
    @Override
    public void serialEvent(SerialPortEvent serialPortEvent) {
        switch (serialPortEvent.getEventType()) {
        case SerialPortEvent.DATA_AVAILABLE: // 1.串口存在有效数据
            SerialPortManager.getManager().readData();
            break;

        case SerialPortEvent.OUTPUT_BUFFER_EMPTY: // 2.输出缓冲区已清空
            break;

        case SerialPortEvent.CTS: // 3.清除待发送数据
            break;

        case SerialPortEvent.DSR: // 4.待发送数据准备好了
            break;

        case SerialPortEvent.RI: // 5.振铃指示
            break;

        case SerialPortEvent.CD: // 6.载波检测
            break;

        case SerialPortEvent.OE: // 7.溢位（溢出）错误
            break;

        case SerialPortEvent.PE: // 8.奇偶校验错误
            break;

        case SerialPortEvent.FE: // 9.帧错误
            break;

        case SerialPortEvent.BI: // 10.通讯中断
            break;

        default:
            break;
        }
    }

}
