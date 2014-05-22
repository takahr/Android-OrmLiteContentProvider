package com.tojc.ormlite.android.framework.event.dispatcher;

import com.tojc.ormlite.android.framework.event.EventDispatcherBase;
import com.tojc.ormlite.android.framework.event.multievent.listener.OnDeleteMultiEventListener;
import com.tojc.ormlite.android.framework.event.multievent.object.OnDeleteMultiEventObject;

/**
 * Created by Jaken on 2014/05/05.
 */
public final class OnDeleteEventDispatcher
        extends EventDispatcherBase<OnDeleteMultiEventListener, OnDeleteMultiEventObject> {

    public OnDeleteEventDispatcher() {
        super();
    }

    @Override
    public void dispatch(OnDeleteMultiEventListener listener, OnDeleteMultiEventObject param) {
        listener.onDelete(param);
    }
}
