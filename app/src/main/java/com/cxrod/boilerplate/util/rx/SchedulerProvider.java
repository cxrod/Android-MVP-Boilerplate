package com.cxrod.boilerplate.util.rx;

import io.reactivex.Scheduler;

/**
 * Created by crodriguez on 6/14/17.
 */

public interface SchedulerProvider {

    Scheduler ui();

    Scheduler computation();

    Scheduler io();

}
