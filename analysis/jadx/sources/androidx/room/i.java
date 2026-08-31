package androidx.room;

import j2.InterfaceC1161g;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends D {
    public abstract void bind(InterfaceC1161g interfaceC1161g, Object obj);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int handle(Object obj) {
        InterfaceC1161g interfaceC1161gAcquire = acquire();
        try {
            bind(interfaceC1161gAcquire, obj);
            return interfaceC1161gAcquire.q();
        } finally {
            release(interfaceC1161gAcquire);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int handleMultiple(Iterable<Object> entities) {
        kotlin.jvm.internal.m.e(entities, "entities");
        InterfaceC1161g interfaceC1161gAcquire = acquire();
        try {
            Iterator<Object> it = entities.iterator();
            int iQ = 0;
            while (it.hasNext()) {
                bind(interfaceC1161gAcquire, it.next());
                iQ += interfaceC1161gAcquire.q();
            }
            return iQ;
        } finally {
            release(interfaceC1161gAcquire);
        }
    }

    public final int handleMultiple(Object[] entities) {
        kotlin.jvm.internal.m.e(entities, "entities");
        InterfaceC1161g interfaceC1161gAcquire = acquire();
        try {
            int iQ = 0;
            for (Object obj : entities) {
                bind(interfaceC1161gAcquire, obj);
                iQ += interfaceC1161gAcquire.q();
            }
            return iQ;
        } finally {
            release(interfaceC1161gAcquire);
        }
    }
}
