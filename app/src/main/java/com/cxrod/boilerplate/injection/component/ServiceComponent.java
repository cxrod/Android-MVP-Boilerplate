package com.cxrod.boilerplate.injection.component;

import com.cxrod.boilerplate.injection.PerService;
import com.cxrod.boilerplate.injection.module.ServiceModule;
import com.cxrod.boilerplate.service.SyncService;

import dagger.Component;

/**
 * Created by crodriguez on 6/14/17.
 */

@PerService
@Component(dependencies = ApplicationComponent.class, modules = ServiceModule.class)
public interface ServiceComponent {

    void inject(SyncService service);

}