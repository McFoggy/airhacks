/*
 */
package com.airhacks.serviceloader.client;

import com.airhacks.serviceloader.Messenger;
import java.util.Optional;
import java.util.ServiceLoader;

/**
 *
 * @author airhacks.com
 */
public class MessageSupplierTest {

    //../serviceloader-modules
    //java -p . -m  serviceloader.messagesuppliertest/com.airhacks.serviceloader.client.MessageSupplierTest
    public static void main(String[] args) {

        ServiceLoader<Messenger> serviceLoader = ServiceLoader.load(Messenger.class);
        Optional<Messenger> optionalMessenger = serviceLoader.findFirst();
        System.out.println("Messenger exists? = " + optionalMessenger.isPresent());
        Messenger messenger = optionalMessenger.get();

        System.out.println("message = " + messenger.message());

    }

}
