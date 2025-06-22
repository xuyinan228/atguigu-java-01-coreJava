package com.atguigu.thread.communication;

import com.atguigu.thread.utils.RandomUtils;
import com.atguigu.thread.utils.ThreadUtils;
import com.oracle.jrockit.jfr.Producer;

public class  ProducerConsumerTest {

    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Runnable producer = () -> {
            while (true) {
                clerk.produce();
                ThreadUtils.sleep(RandomUtils.random(50, 100));
            }
        };

        Runnable consumer = () -> {
            while (true) {
                clerk.consume();
                ThreadUtils.sleep(RandomUtils.random(50, 100));
            }
        };

        new Thread(producer, "生产者1").start();
        new Thread(producer, "生产者2").start();
        new Thread(producer, "生产者3").start();
        new Thread(producer, "生产者4").start();

        new Thread(consumer, "消费者1").start();
        new Thread(consumer, "消费者2").start();
        new Thread(consumer, "消费者3").start();
        new Thread(consumer, "消费者4").start();
     }

}

class Clerk {
    private int count = 0;

    public void consume() {
        synchronized (this) {
            while (count <= 0 ) {
                ThreadUtils.wait(this);
            }
            count--;
            System.out.println(Thread.currentThread().getName() + "消费1件：剩余" + count + "件");
            ThreadUtils.notifyAll(this);
        }
    }

    public void produce() {
        synchronized (this) {
            while (count >= 20) {
                ThreadUtils.wait(this);
            }
            count++;
            System.out.println(Thread.currentThread().getName() + "生产1件：剩余" + count + "件");
            ThreadUtils.notifyAll(this);

        }
    }

}
