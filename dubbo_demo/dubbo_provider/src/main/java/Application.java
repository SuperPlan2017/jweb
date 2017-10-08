import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/*******************************************************************************
 * Copyright (c) 2017 daixinlian.com
 *
 * All rights reserved. 
 *
 * Contributors:
 *   Miller Ming - Initial implementation
 *   2017/10/8
 *******************************************************************************/
public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext_dubbo_zookeeper.xml");
        applicationContext.start();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
