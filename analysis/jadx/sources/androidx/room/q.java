package androidx.room;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import j2.InterfaceC1155a;
import j2.InterfaceC1161g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import k2.C1183g;
import n5.AbstractC1397A;
import o.C1407c;
import o.C1410f;
import o5.C1425g;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String[] f9755o = {"UPDATE", "DELETE", "INSERT"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f9756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f9757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f9758c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f9760e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f9761g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile InterfaceC1161g f9762h;
    public final K2.a i;
    public final Z.m j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final A1.b f9766n;
    public final AtomicBoolean f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C1410f f9763k = new C1410f();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f9764l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f9765m = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f9759d = new LinkedHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q(WorkDatabase_Impl workDatabase_Impl, HashMap map, HashMap map2, String... strArr) {
        String lowerCase;
        this.f9756a = workDatabase_Impl;
        this.f9757b = map;
        this.f9758c = map2;
        this.i = new K2.a(strArr.length);
        this.j = new Z.m(workDatabase_Impl);
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale US = Locale.US;
            kotlin.jvm.internal.m.d(US, "US");
            String lowerCase2 = str.toLowerCase(US);
            kotlin.jvm.internal.m.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            this.f9759d.put(lowerCase2, Integer.valueOf(i));
            String str2 = (String) this.f9757b.get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(US);
                kotlin.jvm.internal.m.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.f9760e = strArr2;
        for (Map.Entry entry : this.f9757b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale US2 = Locale.US;
            kotlin.jvm.internal.m.d(US2, "US");
            String lowerCase3 = str3.toLowerCase(US2);
            kotlin.jvm.internal.m.d(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
            if (this.f9759d.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(US2);
                kotlin.jvm.internal.m.d(lowerCase4, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f9759d;
                linkedHashMap.put(lowerCase4, n5.x.J(lowerCase3, linkedHashMap));
            }
        }
        this.f9766n = new A1.b(13, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(n nVar) {
        Object obj;
        o oVar;
        boolean z5;
        String[] strArrE = e(nVar.f9748a);
        ArrayList arrayList = new ArrayList(strArrE.length);
        for (String str : strArrE) {
            LinkedHashMap linkedHashMap = this.f9759d;
            Locale US = Locale.US;
            kotlin.jvm.internal.m.d(US, "US");
            String lowerCase = str.toLowerCase(US);
            kotlin.jvm.internal.m.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = (Integer) linkedHashMap.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str));
            }
            arrayList.add(num);
        }
        int[] iArrA0 = n5.l.A0(arrayList);
        o oVar2 = new o(nVar, iArrA0, strArrE);
        synchronized (this.f9763k) {
            C1410f c1410f = this.f9763k;
            C1407c c1407cD = c1410f.d(nVar);
            if (c1407cD != null) {
                obj = c1407cD.f15311r;
            } else {
                C1407c c1407c = new C1407c(nVar, oVar2);
                c1410f.f15320t++;
                C1407c c1407c2 = c1410f.f15318r;
                if (c1407c2 == null) {
                    c1410f.f15317q = c1407c;
                    c1410f.f15318r = c1407c;
                } else {
                    c1407c2.f15312s = c1407c;
                    c1407c.f15313t = c1407c2;
                    c1410f.f15318r = c1407c;
                }
                obj = null;
            }
            oVar = (o) obj;
        }
        if (oVar == null) {
            K2.a aVar = this.i;
            int[] tableIds = Arrays.copyOf(iArrA0, iArrA0.length);
            aVar.getClass();
            kotlin.jvm.internal.m.e(tableIds, "tableIds");
            synchronized (aVar) {
                z5 = false;
                for (int i : tableIds) {
                    long[] jArr = (long[]) aVar.f2860c;
                    long j = jArr[i];
                    jArr[i] = 1 + j;
                    if (j == 0) {
                        aVar.f2859b = true;
                        z5 = true;
                    }
                }
            }
            if (z5) {
                WorkDatabase_Impl workDatabase_Impl = this.f9756a;
                if (workDatabase_Impl.isOpenInternal()) {
                    g(((C1183g) workDatabase_Impl.getOpenHelper()).a());
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final B b(String[] strArr, boolean z5, Callable callable) {
        String[] strArrE = e(strArr);
        for (String str : strArrE) {
            Locale US = Locale.US;
            kotlin.jvm.internal.m.d(US, "US");
            String lowerCase = str.toLowerCase(US);
            kotlin.jvm.internal.m.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!this.f9759d.containsKey(lowerCase)) {
                throw new IllegalArgumentException("There is no table with name ".concat(str).toString());
            }
        }
        Z.m mVar = this.j;
        mVar.getClass();
        return new B((WorkDatabase_Impl) mVar.f8312r, mVar, z5, callable, strArrE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c() {
        if (!this.f9756a.isOpenInternal()) {
            return false;
        }
        if (!this.f9761g) {
            ((C1183g) this.f9756a.getOpenHelper()).a();
        }
        if (this.f9761g) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(n nVar) {
        o oVar;
        boolean z5;
        synchronized (this.f9763k) {
            oVar = (o) this.f9763k.g(nVar);
        }
        if (oVar != null) {
            K2.a aVar = this.i;
            int[] iArr = oVar.f9750b;
            int[] tableIds = Arrays.copyOf(iArr, iArr.length);
            aVar.getClass();
            kotlin.jvm.internal.m.e(tableIds, "tableIds");
            synchronized (aVar) {
                z5 = false;
                for (int i : tableIds) {
                    long[] jArr = (long[]) aVar.f2860c;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        z5 = true;
                        aVar.f2859b = true;
                    }
                }
            }
            if (z5) {
                WorkDatabase_Impl workDatabase_Impl = this.f9756a;
                if (workDatabase_Impl.isOpenInternal()) {
                    g(((C1183g) workDatabase_Impl.getOpenHelper()).a());
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String[] e(String[] strArr) {
        C1425g c1425g = new C1425g();
        for (String str : strArr) {
            Locale US = Locale.US;
            kotlin.jvm.internal.m.d(US, "US");
            String lowerCase = str.toLowerCase(US);
            kotlin.jvm.internal.m.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            HashMap map = this.f9758c;
            if (map.containsKey(lowerCase)) {
                String lowerCase2 = str.toLowerCase(US);
                kotlin.jvm.internal.m.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Object obj = map.get(lowerCase2);
                kotlin.jvm.internal.m.b(obj);
                c1425g.addAll((Collection) obj);
            } else {
                c1425g.add(str);
            }
        }
        return (String[]) AbstractC1397A.m(c1425g).toArray(new String[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(InterfaceC1155a interfaceC1155a, int i) {
        interfaceC1155a.l("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.f9760e[i];
        for (int i7 = 0; i7 < 3; i7++) {
            String str2 = f9755o[i7];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + g.b(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i + " AND invalidated = 0; END";
            kotlin.jvm.internal.m.d(str3, "StringBuilder().apply(builderAction).toString()");
            interfaceC1155a.l(str3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(InterfaceC1155a database) {
        kotlin.jvm.internal.m.e(database, "database");
        if (database.y()) {
            return;
        }
        try {
            Lock closeLock$room_runtime_release = this.f9756a.getCloseLock$room_runtime_release();
            closeLock$room_runtime_release.lock();
            try {
                synchronized (this.f9764l) {
                    int[] iArrC = this.i.c();
                    if (iArrC != null) {
                        if (database.D()) {
                            database.L();
                        } else {
                            database.h();
                        }
                        try {
                            int length = iArrC.length;
                            int i = 0;
                            int i7 = 0;
                            while (i < length) {
                                int i8 = iArrC[i];
                                int i9 = i7 + 1;
                                if (i8 == 1) {
                                    f(database, i7);
                                } else if (i8 == 2) {
                                    String str = this.f9760e[i7];
                                    String[] strArr = f9755o;
                                    for (int i10 = 0; i10 < 3; i10++) {
                                        String str2 = "DROP TRIGGER IF EXISTS " + g.b(str, strArr[i10]);
                                        kotlin.jvm.internal.m.d(str2, "StringBuilder().apply(builderAction).toString()");
                                        database.l(str2);
                                    }
                                }
                                i++;
                                i7 = i9;
                            }
                            database.J();
                            database.g();
                        } catch (Throwable th) {
                            database.g();
                            throw th;
                        }
                    }
                }
            } finally {
                closeLock$room_runtime_release.unlock();
            }
        } catch (SQLiteException e7) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e7);
        } catch (IllegalStateException e8) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e8);
        }
    }
}
