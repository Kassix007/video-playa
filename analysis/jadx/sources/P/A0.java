package P;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import r.C1570v;

/* JADX INFO: loaded from: classes.dex */
public final class A0 implements Iterable, C5.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public C1570v f5264A;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f5266r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f5268t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f5269u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f5271w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f5272x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public HashMap f5274z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int[] f5265q = new int[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object[] f5267s = new Object[0];

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f5270v = new Object();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList f5273y = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int d(C0343a c0343a) {
        if (this.f5271w) {
            AbstractC0373p.c("Use active SlotWriter to determine anchor location instead");
        }
        if (!c0343a.a()) {
            AbstractC0362j0.a("Anchor refers to a group that was removed");
        }
        return c0343a.f5384a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g() {
        this.f5274z = new HashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final z0 h() {
        if (this.f5271w) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f5269u++;
        return new z0(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final D0 i() {
        if (this.f5271w) {
            AbstractC0373p.c("Cannot start a writer when another writer is pending");
        }
        if (this.f5269u > 0) {
            AbstractC0373p.c("Cannot start a writer when a reader is pending");
        }
        this.f5271w = true;
        this.f5272x++;
        return new D0(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new J(this, 0, this.f5266r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean j(C0343a c0343a) {
        int iE;
        return c0343a.a() && (iE = C0.e(this.f5273y, c0343a.f5384a, this.f5266r)) >= 0 && kotlin.jvm.internal.m.a(this.f5273y.get(iE), c0343a);
    }
}
