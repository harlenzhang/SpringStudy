package com.harlen;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 * Created by harlenzhang on 16/9/6.
 */
public class server {
    public static void main(String[] args) {
        Server server = new Server(8086);
        WebAppContext context = new WebAppContext();
        context.setContextPath("/");
        context.setDescriptor("./src/main/webapp/WEB-INF/web.xml");
        context.setResourceBase("./src/main/webapp");
        context.setParentLoaderPriority(true);
        server.setHandler(context);
        try {
            server.start();
            server.join();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
