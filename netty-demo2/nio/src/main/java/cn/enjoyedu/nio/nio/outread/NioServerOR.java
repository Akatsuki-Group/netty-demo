package cn.enjoyedu.nio.nio.outread;

import static cn.enjoyedu.nio.Const.DEFAULT_PORT;

/**
 * @author yct
 * 类说明：nio通信服务端
 */
public class NioServerOR {
    private static NioServerORHandle nioServerHandle;

    public static void main(String[] args){
        nioServerHandle = new NioServerORHandle(DEFAULT_PORT);
        new Thread(nioServerHandle,"Server").start();
    }

}
