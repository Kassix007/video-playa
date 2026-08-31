package androidx.room;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import e2.AbstractC1037b;
import e2.InterfaceC1036a;
import j2.InterfaceC1155a;
import j2.InterfaceC1158d;
import j2.InterfaceC1160f;
import j2.InterfaceC1161g;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import k2.C1182f;
import k2.C1183g;
import m5.C1383v;
import m5.InterfaceC1364c;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    public static final v Companion = new v();
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;
    private AbstractC0663a autoCloser;
    private final Map<String, Object> backingFieldMap;
    private InterfaceC1158d internalOpenHelper;
    private Executor internalQueryExecutor;
    private Executor internalTransactionExecutor;
    protected List<? extends u> mCallbacks;
    protected volatile InterfaceC1155a mDatabase;
    private final Map<Class<?>, Object> typeConverters;
    private boolean writeAheadLoggingEnabled;
    private final q invalidationTracker = createInvalidationTracker();
    private Map<Class<? extends InterfaceC1036a>, InterfaceC1036a> autoMigrationSpecs = new LinkedHashMap();
    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public w() {
        Map<String, Object> mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        kotlin.jvm.internal.m.d(mapSynchronizedMap, "synchronizedMap(mutableMapOf())");
        this.backingFieldMap = mapSynchronizedMap;
        this.typeConverters = new LinkedHashMap();
    }

    @InterfaceC1364c
    public static /* synthetic */ void getMCallbacks$annotations() {
    }

    @InterfaceC1364c
    public static /* synthetic */ void getMDatabase$annotations() {
    }

    public static /* synthetic */ void isOpen$annotations() {
    }

    public static /* synthetic */ void isOpenInternal$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ Cursor query$default(w wVar, InterfaceC1160f interfaceC1160f, CancellationSignal cancellationSignal, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i & 2) != 0) {
            cancellationSignal = null;
        }
        return wVar.query(interfaceC1160f, cancellationSignal);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        assertNotMainThread();
        InterfaceC1155a interfaceC1155aA = ((C1183g) getOpenHelper()).a();
        getInvalidationTracker().g(interfaceC1155aA);
        if (interfaceC1155aA.D()) {
            interfaceC1155aA.L();
        } else {
            interfaceC1155aA.h();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && isMainThread$room_runtime_release()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.suspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        ((C1183g) getOpenHelper()).a().g();
        if (inTransaction()) {
            return;
        }
        q invalidationTracker = getInvalidationTracker();
        if (invalidationTracker.f.compareAndSet(false, true)) {
            invalidationTracker.f9756a.getQueryExecutor().execute(invalidationTracker.f9766n);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC1364c
    public void beginTransaction() {
        assertNotMainThread();
        a();
    }

    public abstract void clearAllTables();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.readWriteLock.writeLock();
            kotlin.jvm.internal.m.d(writeLock, "readWriteLock.writeLock()");
            writeLock.lock();
            try {
                getInvalidationTracker().getClass();
                ((C1183g) getOpenHelper()).close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC1161g compileStatement(String sql) {
        kotlin.jvm.internal.m.e(sql, "sql");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return ((C1183g) getOpenHelper()).a().r(sql);
    }

    public abstract q createInvalidationTracker();

    public abstract InterfaceC1158d createOpenHelper(h hVar);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC1364c
    public void endTransaction() {
        b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Map<Class<? extends InterfaceC1036a>, InterfaceC1036a> getAutoMigrationSpecs() {
        return this.autoMigrationSpecs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public List<AbstractC1037b> getAutoMigrations(Map<Class<? extends InterfaceC1036a>, InterfaceC1036a> autoMigrationSpecs) {
        kotlin.jvm.internal.m.e(autoMigrationSpecs, "autoMigrationSpecs");
        return n5.s.f15299q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Map<String, Object> getBackingFieldMap() {
        return this.backingFieldMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Lock getCloseLock$room_runtime_release() {
        ReentrantReadWriteLock.ReadLock lock = this.readWriteLock.readLock();
        kotlin.jvm.internal.m.d(lock, "readWriteLock.readLock()");
        return lock;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q getInvalidationTracker() {
        return this.invalidationTracker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC1158d getOpenHelper() {
        InterfaceC1158d interfaceC1158d = this.internalOpenHelper;
        if (interfaceC1158d != null) {
            return interfaceC1158d;
        }
        kotlin.jvm.internal.m.k("internalOpenHelper");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        kotlin.jvm.internal.m.k("internalQueryExecutor");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Set<Class<? extends InterfaceC1036a>> getRequiredAutoMigrationSpecs() {
        return n5.u.f15301q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return n5.t.f15300q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        kotlin.jvm.internal.m.k("internalTransactionExecutor");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public <T> T getTypeConverter(Class<T> klass) {
        kotlin.jvm.internal.m.e(klass, "klass");
        return (T) this.typeConverters.get(klass);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean inTransaction() {
        return ((C1183g) getOpenHelper()).a().y();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void init(h configuration) {
        kotlin.jvm.internal.m.e(configuration, "configuration");
        D2.o oVar = configuration.f9737d;
        List list = configuration.f9744n;
        List list2 = configuration.f9743m;
        this.internalOpenHelper = createOpenHelper(configuration);
        Set<Class<? extends InterfaceC1036a>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        BitSet bitSet = new BitSet();
        Iterator<Class<? extends InterfaceC1036a>> it = requiredAutoMigrationSpecs.iterator();
        while (true) {
            int i = -1;
            if (it.hasNext()) {
                Class<? extends InterfaceC1036a> next = it.next();
                int size = list.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i7 = size - 1;
                        if (next.isAssignableFrom(list.get(size).getClass())) {
                            bitSet.set(size);
                            i = size;
                            break;
                        } else if (i7 < 0) {
                            break;
                        } else {
                            size = i7;
                        }
                    }
                }
                if (i < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                this.autoMigrationSpecs.put(next, (InterfaceC1036a) list.get(i));
            } else {
                int size2 = list.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i8 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        }
                        if (i8 < 0) {
                            break;
                        } else {
                            size2 = i8;
                        }
                    }
                }
                Iterator<AbstractC1037b> it2 = getAutoMigrations(this.autoMigrationSpecs).iterator();
                while (true) {
                    boolean zContainsKey = false;
                    if (!it2.hasNext()) {
                        break;
                    }
                    AbstractC1037b next2 = it2.next();
                    int i9 = next2.startVersion;
                    int i10 = next2.endVersion;
                    LinkedHashMap linkedHashMap = oVar.f1433a;
                    if (linkedHashMap.containsKey(Integer.valueOf(i9))) {
                        Map map = (Map) linkedHashMap.get(Integer.valueOf(i9));
                        if (map == null) {
                            map = n5.t.f15300q;
                        }
                        zContainsKey = map.containsKey(Integer.valueOf(i10));
                    }
                    if (!zContainsKey) {
                        oVar.b(next2);
                    }
                }
                InterfaceC1158d openHelper = getOpenHelper();
                if (!C.class.isInstance(openHelper)) {
                    openHelper = null;
                }
                if (openHelper != null) {
                    throw new ClassCastException();
                }
                InterfaceC1158d openHelper2 = getOpenHelper();
                if ((AbstractC0664b.class.isInstance(openHelper2) ? openHelper2 : null) != null) {
                    throw new ClassCastException();
                }
                boolean z5 = configuration.f9739g == 3;
                C1183g c1183g = (C1183g) getOpenHelper();
                if (c1183g.f14109v.f15087r != C1383v.f15095a) {
                    C1182f sQLiteOpenHelper = (C1182f) c1183g.f14109v.getValue();
                    kotlin.jvm.internal.m.e(sQLiteOpenHelper, "sQLiteOpenHelper");
                    sQLiteOpenHelper.setWriteAheadLoggingEnabled(z5);
                }
                c1183g.f14110w = z5;
                this.mCallbacks = configuration.f9738e;
                this.internalQueryExecutor = configuration.f9740h;
                this.internalTransactionExecutor = new F(configuration.i);
                this.allowMainThreadQueries = configuration.f;
                this.writeAheadLoggingEnabled = z5;
                Map<Class<?>, List<Class<?>>> requiredTypeConverters = getRequiredTypeConverters();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry<Class<?>, List<Class<?>>> entry : requiredTypeConverters.entrySet()) {
                    Class<?> key = entry.getKey();
                    for (Class<?> cls : entry.getValue()) {
                        int size3 = list2.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i11 = size3 - 1;
                                if (cls.isAssignableFrom(list2.get(size3).getClass())) {
                                    bitSet2.set(size3);
                                    break;
                                } else if (i11 < 0) {
                                    break;
                                } else {
                                    size3 = i11;
                                }
                            }
                        } else {
                            size3 = -1;
                        }
                        if (!(size3 >= 0)) {
                            throw new IllegalArgumentException(("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.").toString());
                        }
                        this.typeConverters.put(cls, list2.get(size3));
                    }
                }
                int size4 = list2.size() - 1;
                if (size4 < 0) {
                    return;
                }
                while (true) {
                    int i12 = size4 - 1;
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException("Unexpected type converter " + list2.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                    if (i12 < 0) {
                        return;
                    } else {
                        size4 = i12;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void internalInitInvalidationTracker(InterfaceC1155a db) {
        kotlin.jvm.internal.m.e(db, "db");
        q invalidationTracker = getInvalidationTracker();
        invalidationTracker.getClass();
        synchronized (invalidationTracker.f9765m) {
            if (invalidationTracker.f9761g) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            db.l("PRAGMA temp_store = MEMORY;");
            db.l("PRAGMA recursive_triggers='ON';");
            db.l("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            invalidationTracker.g(db);
            invalidationTracker.f9762h = db.r("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            invalidationTracker.f9761g = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isMainThread$room_runtime_release() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isOpen() {
        InterfaceC1155a interfaceC1155a = this.mDatabase;
        return kotlin.jvm.internal.m.a(interfaceC1155a != null ? Boolean.valueOf(interfaceC1155a.isOpen()) : null, Boolean.TRUE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isOpenInternal() {
        InterfaceC1155a interfaceC1155a = this.mDatabase;
        return interfaceC1155a != null && interfaceC1155a.isOpen();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Cursor query(InterfaceC1160f query) {
        kotlin.jvm.internal.m.e(query, "query");
        return query$default(this, query, null, 2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void runInTransaction(Runnable body) {
        kotlin.jvm.internal.m.e(body, "body");
        beginTransaction();
        try {
            body.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setAutoMigrationSpecs(Map<Class<? extends InterfaceC1036a>, InterfaceC1036a> map) {
        kotlin.jvm.internal.m.e(map, "<set-?>");
        this.autoMigrationSpecs = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC1364c
    public void setTransactionSuccessful() {
        ((C1183g) getOpenHelper()).a().J();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public Cursor query(String query, Object[] objArr) {
        kotlin.jvm.internal.m.e(query, "query");
        return ((C1183g) getOpenHelper()).a().P(new Z.m(query, objArr));
    }

    public Cursor query(InterfaceC1160f query, CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.m.e(query, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal != null) {
            return ((C1183g) getOpenHelper()).a().x(query, cancellationSignal);
        }
        return ((C1183g) getOpenHelper()).a().P(query);
    }

    public <V> V runInTransaction(Callable<V> body) {
        kotlin.jvm.internal.m.e(body, "body");
        beginTransaction();
        try {
            V vCall = body.call();
            setTransactionSuccessful();
            return vCall;
        } finally {
            endTransaction();
        }
    }
}
