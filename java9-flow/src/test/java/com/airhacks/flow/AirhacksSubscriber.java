
package com.airhacks.flow;

import java.util.concurrent.Flow;

/**
 *
 * @author airhacks.com
 */
public class AirhacksSubscriber implements Flow.Subscriber<String> {

    private Flow.Subscription subsription;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        System.out.println("subscription = " + subscription);
        this.subsription = subscription;
        //this.subsription.request(1);
    }

    @Override
    public void onNext(String item) {
        System.out.println("item = " + item);
        this.subsription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("throwable = " + throwable);
    }

    @Override
    public void onComplete() {
        System.out.println("complete");
    }

}
