package androidx.room;

import com.google.android.gms.internal.measurement.AbstractC0836n2;
import j2.InterfaceC1161g;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C1193b;
import o5.C1420b;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends D {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(w database) {
        super(database);
        kotlin.jvm.internal.m.e(database, "database");
    }

    public abstract void bind(InterfaceC1161g interfaceC1161g, Object obj);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void insert(Object obj) {
        InterfaceC1161g interfaceC1161gAcquire = acquire();
        try {
            bind(interfaceC1161gAcquire, obj);
            interfaceC1161gAcquire.U();
        } finally {
            release(interfaceC1161gAcquire);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long insertAndReturnId(Object obj) {
        InterfaceC1161g interfaceC1161gAcquire = acquire();
        try {
            bind(interfaceC1161gAcquire, obj);
            return interfaceC1161gAcquire.U();
        } finally {
            release(interfaceC1161gAcquire);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long[] insertAndReturnIdsArray(Collection<Object> entities) {
        kotlin.jvm.internal.m.e(entities, "entities");
        InterfaceC1161g interfaceC1161gAcquire = acquire();
        try {
            long[] jArr = new long[entities.size()];
            int i = 0;
            for (Object obj : entities) {
                int i7 = i + 1;
                if (i < 0) {
                    AbstractC0836n2.N();
                    throw null;
                }
                bind(interfaceC1161gAcquire, obj);
                jArr[i] = interfaceC1161gAcquire.U();
                i = i7;
            }
            release(interfaceC1161gAcquire);
            return jArr;
        } catch (Throwable th) {
            release(interfaceC1161gAcquire);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Long[] insertAndReturnIdsArrayBox(Collection<Object> entities) {
        kotlin.jvm.internal.m.e(entities, "entities");
        InterfaceC1161g interfaceC1161gAcquire = acquire();
        Iterator<Object> it = entities.iterator();
        try {
            int size = entities.size();
            Long[] lArr = new Long[size];
            for (int i = 0; i < size; i++) {
                bind(interfaceC1161gAcquire, it.next());
                lArr[i] = Long.valueOf(interfaceC1161gAcquire.U());
            }
            return lArr;
        } finally {
            release(interfaceC1161gAcquire);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<Long> insertAndReturnIdsList(Object[] entities) {
        kotlin.jvm.internal.m.e(entities, "entities");
        InterfaceC1161g interfaceC1161gAcquire = acquire();
        try {
            C1420b c1420b = new C1420b(10);
            for (Object obj : entities) {
                bind(interfaceC1161gAcquire, obj);
                c1420b.add(Long.valueOf(interfaceC1161gAcquire.U()));
            }
            C1420b c1420bG = AbstractC0836n2.g(c1420b);
            release(interfaceC1161gAcquire);
            return c1420bG;
        } catch (Throwable th) {
            release(interfaceC1161gAcquire);
            throw th;
        }
    }

    public final void insert(Object[] entities) {
        kotlin.jvm.internal.m.e(entities, "entities");
        InterfaceC1161g interfaceC1161gAcquire = acquire();
        try {
            for (Object obj : entities) {
                bind(interfaceC1161gAcquire, obj);
                interfaceC1161gAcquire.U();
            }
        } finally {
            release(interfaceC1161gAcquire);
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Object[] entities) {
        kotlin.jvm.internal.m.e(entities, "entities");
        InterfaceC1161g interfaceC1161gAcquire = acquire();
        C1193b c1193bH = kotlin.jvm.internal.m.h(entities);
        try {
            int length = entities.length;
            Long[] lArr = new Long[length];
            for (int i = 0; i < length; i++) {
                bind(interfaceC1161gAcquire, c1193bH.next());
                lArr[i] = Long.valueOf(interfaceC1161gAcquire.U());
            }
            return lArr;
        } finally {
            release(interfaceC1161gAcquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Object[] entities) {
        kotlin.jvm.internal.m.e(entities, "entities");
        InterfaceC1161g interfaceC1161gAcquire = acquire();
        try {
            long[] jArr = new long[entities.length];
            int length = entities.length;
            int i = 0;
            int i7 = 0;
            while (i < length) {
                int i8 = i7 + 1;
                bind(interfaceC1161gAcquire, entities[i]);
                jArr[i7] = interfaceC1161gAcquire.U();
                i++;
                i7 = i8;
            }
            return jArr;
        } finally {
            release(interfaceC1161gAcquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(Collection<Object> entities) {
        kotlin.jvm.internal.m.e(entities, "entities");
        InterfaceC1161g interfaceC1161gAcquire = acquire();
        try {
            C1420b c1420b = new C1420b(10);
            Iterator<T> it = entities.iterator();
            while (it.hasNext()) {
                bind(interfaceC1161gAcquire, it.next());
                c1420b.add(Long.valueOf(interfaceC1161gAcquire.U()));
            }
            C1420b c1420bG = AbstractC0836n2.g(c1420b);
            release(interfaceC1161gAcquire);
            return c1420bG;
        } catch (Throwable th) {
            release(interfaceC1161gAcquire);
            throw th;
        }
    }

    public final void insert(Iterable<Object> entities) {
        kotlin.jvm.internal.m.e(entities, "entities");
        InterfaceC1161g interfaceC1161gAcquire = acquire();
        try {
            Iterator<Object> it = entities.iterator();
            while (it.hasNext()) {
                bind(interfaceC1161gAcquire, it.next());
                interfaceC1161gAcquire.U();
            }
        } finally {
            release(interfaceC1161gAcquire);
        }
    }
}
