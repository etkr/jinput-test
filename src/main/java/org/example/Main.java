package org.example;

import net.java.games.input.*;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        Event event = new Event();

        Controller controller = ControllerEnvironment.getDefaultEnvironment().getControllers()[0];

        /* Get the available controllers */
        while (controller.poll()) {
            /* Remember to poll each one */

            /* Get the controllers event queue */
            EventQueue queue = controller.getEventQueue();

            /* For each object in the queue */
            while (queue.getNextEvent(event)) {
                /* Get event component */
                Component comp = event.getComponent();

                /* Process event (your awesome code) */
                System.out.println(comp.getPollData());
            }
        }

        System.out.println("Hello world!");
    }
}