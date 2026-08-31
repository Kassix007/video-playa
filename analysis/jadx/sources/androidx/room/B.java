package androidx.room;

import androidx.lifecycle.G;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class B extends G {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final WorkDatabase_Impl f9692l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Z.m f9693m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f9694n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Callable f9695o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0666d f9696p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f9697q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AtomicBoolean f9698r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f9699s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final A f9700t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final A f9701u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public B(WorkDatabase_Impl workDatabase_Impl, Z.m container, boolean z5, Callable callable, String[] strArr) {
        kotlin.jvm.internal.m.e(container, "container");
        this.f9692l = workDatabase_Impl;
        this.f9693m = container;
        this.f9694n = z5;
        this.f9695o = callable;
        this.f9696p = new C0666d(strArr, this, 1);
        this.f9697q = new AtomicBoolean(true);
        this.f9698r = new AtomicBoolean(false);
        this.f9699s = new AtomicBoolean(false);
        this.f9700t = new A(this, 0);
        this.f9701u = new A(this, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.G
    public final void g() {
        Z.m mVar = this.f9693m;
        mVar.getClass();
        ((Set) mVar.f8313s).add(this);
        boolean z5 = this.f9694n;
        WorkDatabase_Impl workDatabase_Impl = this.f9692l;
        (z5 ? workDatabase_Impl.getTransactionExecutor() : workDatabase_Impl.getQueryExecutor()).execute(this.f9700t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.G
    public final void h() {
        Z.m mVar = this.f9693m;
        mVar.getClass();
        ((Set) mVar.f8313s).remove(this);
    }
}
