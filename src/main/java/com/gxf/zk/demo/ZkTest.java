package com.gxf.zk.demo;


/**
 * @Author: <guanxianseng@163.com>
 * @Description:
 * @Date: Created in : 2018/10/28 下午10:32
 **/
public class ZkTest {

    public static void main(String[] args) {
        BaseZookeeper baseZookeeper = new BaseZookeeper();
        try {
            baseZookeeper.connectZookeeper("127.0.0.1");
//            baseZookeeper.createNode("/name", "guanxiangfei".getBytes());
            while(true){
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
