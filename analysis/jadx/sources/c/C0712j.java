package c;

import P.C0345b;
import P.C0371o;
import kotlin.jvm.internal.n;
import m5.C1386y;
import n5.AbstractC1397A;

/* JADX INFO: renamed from: c.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0712j extends n implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f10068q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ B5.e f10069r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f10070s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0712j(boolean z5, B5.e eVar, int i) {
        super(2);
        this.f10068q = z5;
        this.f10069r = eVar;
        this.f10070s = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iW = C0345b.w(this.f10070s | 1);
        AbstractC1397A.f(this.f10068q, this.f10069r, (C0371o) obj, iW);
        return C1386y.f15098a;
    }
}
