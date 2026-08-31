package t;

import c0.C0717e;
import m5.C1386y;
import z0.AbstractC1932I;
import z0.AbstractC1933J;

/* JADX INFO: renamed from: t.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1610i extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1612k f16609q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractC1933J f16610r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f16611s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1610i(C1612k c1612k, AbstractC1933J abstractC1933J, long j) {
        super(1);
        this.f16609q = c1612k;
        this.f16610r = abstractC1933J;
        this.f16611s = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        C0717e c0717e = this.f16609q.f16617G.f16620b;
        AbstractC1933J abstractC1933J = this.f16610r;
        AbstractC1932I.e((AbstractC1932I) obj, abstractC1933J, c0717e.a((((long) abstractC1933J.f18665r) & 4294967295L) | (((long) abstractC1933J.f18664q) << 32), this.f16611s, W0.l.f8022q));
        return C1386y.f15098a;
    }
}
