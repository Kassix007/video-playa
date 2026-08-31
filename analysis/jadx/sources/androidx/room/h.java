package androidx.room;

import android.content.Context;
import j2.InterfaceC1157c;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1157c f9736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D2.o f9737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f9738e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f9739g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f9740h;
    public final Executor i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f9741k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Set f9742l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f9743m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f9744n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h(Context context, String str, InterfaceC1157c interfaceC1157c, D2.o migrationContainer, List list, boolean z5, int i, Executor queryExecutor, Executor transactionExecutor, boolean z6, boolean z7, Set set, List typeConverters, List autoMigrationSpecs) {
        kotlin.jvm.internal.m.e(migrationContainer, "migrationContainer");
        k1.i.p(i, "journalMode");
        kotlin.jvm.internal.m.e(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.m.e(transactionExecutor, "transactionExecutor");
        kotlin.jvm.internal.m.e(typeConverters, "typeConverters");
        kotlin.jvm.internal.m.e(autoMigrationSpecs, "autoMigrationSpecs");
        this.f9734a = context;
        this.f9735b = str;
        this.f9736c = interfaceC1157c;
        this.f9737d = migrationContainer;
        this.f9738e = list;
        this.f = z5;
        this.f9739g = i;
        this.f9740h = queryExecutor;
        this.i = transactionExecutor;
        this.j = z6;
        this.f9741k = z7;
        this.f9742l = set;
        this.f9743m = typeConverters;
        this.f9744n = autoMigrationSpecs;
    }
}
