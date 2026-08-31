package androidx.work.impl;

import E.Y;
import O3.B;
import a3.C0625d;
import android.app.ActivityManager;
import android.content.Context;
import androidx.room.h;
import androidx.room.t;
import androidx.room.w;
import androidx.work.Clock;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.PreferenceDao;
import androidx.work.impl.model.RawWorkInfoDao;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import j2.C1156b;
import j2.InterfaceC1157c;
import j2.InterfaceC1158d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import k1.i;
import k2.C1183g;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import n.C1388a;

/* JADX INFO: loaded from: classes.dex */
public abstract class WorkDatabase extends w {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.work.impl.WorkDatabase.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC1158d create$lambda$0(Context context, C1156b configuration) {
            m.e(configuration, "configuration");
            m.e(context, "context");
            String str = configuration.f13739b;
            Y callback = configuration.f13740c;
            m.e(callback, "callback");
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
            }
            C1156b c1156b = new C1156b(context, str, callback, true, true);
            return new C1183g(c1156b.f13738a, c1156b.f13739b, c1156b.f13740c, c1156b.f13741d, c1156b.f13742e);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final WorkDatabase create(Context context, Executor queryExecutor, Clock clock, boolean z5) {
            t tVar;
            int i;
            String str;
            m.e(context, "context");
            m.e(queryExecutor, "queryExecutor");
            m.e(clock, "clock");
            if (z5) {
                tVar = new t(context, null);
                tVar.i = true;
            } else {
                if (J5.m.U0(WorkDatabasePathHelperKt.WORK_DATABASE_NAME)) {
                    throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                }
                t tVar2 = new t(context, WorkDatabasePathHelperKt.WORK_DATABASE_NAME);
                tVar2.f9775h = new C0625d(context);
                tVar = tVar2;
            }
            tVar.f = queryExecutor;
            CleanupCallback cleanupCallback = new CleanupCallback(clock);
            ArrayList arrayList = tVar.f9771c;
            arrayList.add(cleanupCallback);
            tVar.a(Migration_1_2.INSTANCE);
            tVar.a(new RescheduleMigration(context, 2, 3));
            tVar.a(Migration_3_4.INSTANCE);
            tVar.a(Migration_4_5.INSTANCE);
            tVar.a(new RescheduleMigration(context, 5, 6));
            tVar.a(Migration_6_7.INSTANCE);
            tVar.a(Migration_7_8.INSTANCE);
            tVar.a(Migration_8_9.INSTANCE);
            tVar.a(new WorkMigration9To10(context));
            tVar.a(new RescheduleMigration(context, 10, 11));
            tVar.a(Migration_11_12.INSTANCE);
            tVar.a(Migration_12_13.INSTANCE);
            tVar.a(Migration_15_16.INSTANCE);
            tVar.a(Migration_16_17.INSTANCE);
            tVar.a(new RescheduleMigration(context, 21, 22));
            tVar.f9776k = false;
            tVar.f9777l = true;
            Executor executor = tVar.f;
            if (executor == null && tVar.f9774g == null) {
                a2.c cVar = C1388a.f;
                tVar.f9774g = cVar;
                tVar.f = cVar;
            } else if (executor != null && tVar.f9774g == null) {
                tVar.f9774g = executor;
            } else if (executor == null) {
                tVar.f = tVar.f9774g;
            }
            HashSet hashSet = tVar.f9781p;
            LinkedHashSet linkedHashSet = tVar.f9780o;
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if (linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                        throw new IllegalArgumentException(i.i(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ").toString());
                    }
                }
            }
            InterfaceC1157c b7 = tVar.f9775h;
            if (b7 == null) {
                b7 = new B(23);
            }
            InterfaceC1157c interfaceC1157c = b7;
            if (tVar.f9778m > 0) {
                if (tVar.f9770b != null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
            }
            boolean z6 = tVar.i;
            int i7 = tVar.j;
            if (i7 == 0) {
                throw null;
            }
            Context context2 = tVar.f9769a;
            if (i7 != 1) {
                i = i7;
            } else {
                Object systemService = context2.getSystemService("activity");
                ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                i = (activityManager == null || activityManager.isLowRamDevice()) ? 2 : 3;
            }
            Executor executor2 = tVar.f;
            if (executor2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor3 = tVar.f9774g;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            h hVar = new h(context2, tVar.f9770b, interfaceC1157c, tVar.f9779n, arrayList, z6, i, executor2, executor3, tVar.f9776k, tVar.f9777l, linkedHashSet, tVar.f9772d, tVar.f9773e);
            Package r12 = WorkDatabase.class.getPackage();
            m.b(r12);
            String fullPackage = r12.getName();
            String canonicalName = WorkDatabase.class.getCanonicalName();
            m.b(canonicalName);
            m.d(fullPackage, "fullPackage");
            if (fullPackage.length() != 0) {
                canonicalName = canonicalName.substring(fullPackage.length() + 1);
                m.d(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            String strReplace = canonicalName.replace('.', '_');
            m.d(strReplace, "replace(...)");
            String strConcat = strReplace.concat("_Impl");
            try {
                if (fullPackage.length() == 0) {
                    str = strConcat;
                } else {
                    str = fullPackage + '.' + strConcat;
                }
                Class<?> cls = Class.forName(str, true, WorkDatabase.class.getClassLoader());
                m.c(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
                w wVar = (w) cls.getDeclaredConstructor(null).newInstance(null);
                wVar.init(hVar);
                return (WorkDatabase) wVar;
            } catch (ClassNotFoundException unused) {
                throw new RuntimeException("Cannot find implementation for " + WorkDatabase.class.getCanonicalName() + ". " + strConcat + " does not exist");
            } catch (IllegalAccessException unused2) {
                throw new RuntimeException("Cannot access the constructor " + WorkDatabase.class.getCanonicalName());
            } catch (InstantiationException unused3) {
                throw new RuntimeException("Failed to create an instance of " + WorkDatabase.class.getCanonicalName());
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    public static final WorkDatabase create(Context context, Executor executor, Clock clock, boolean z5) {
        return Companion.create(context, executor, clock, z5);
    }

    public abstract DependencyDao dependencyDao();

    public abstract PreferenceDao preferenceDao();

    public abstract RawWorkInfoDao rawWorkInfoDao();

    public abstract SystemIdInfoDao systemIdInfoDao();

    public abstract WorkNameDao workNameDao();

    public abstract WorkProgressDao workProgressDao();

    public abstract WorkSpecDao workSpecDao();

    public abstract WorkTagDao workTagDao();
}
