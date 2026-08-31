package Q5;

import java.util.Arrays;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: renamed from: Q5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0422b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public AbstractC0424d[] f6599q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f6600r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6601s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public D f6602t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AbstractC0424d b() {
        AbstractC0424d abstractC0424dC;
        D d5;
        synchronized (this) {
            try {
                AbstractC0424d[] abstractC0424dArrD = this.f6599q;
                if (abstractC0424dArrD == null) {
                    abstractC0424dArrD = d();
                    this.f6599q = abstractC0424dArrD;
                } else if (this.f6600r >= abstractC0424dArrD.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(abstractC0424dArrD, abstractC0424dArrD.length * 2);
                    kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
                    this.f6599q = (AbstractC0424d[]) objArrCopyOf;
                    abstractC0424dArrD = (AbstractC0424d[]) objArrCopyOf;
                }
                int i = this.f6601s;
                do {
                    abstractC0424dC = abstractC0424dArrD[i];
                    if (abstractC0424dC == null) {
                        abstractC0424dC = c();
                        abstractC0424dArrD[i] = abstractC0424dC;
                    }
                    i++;
                    if (i >= abstractC0424dArrD.length) {
                        i = 0;
                    }
                } while (!abstractC0424dC.a(this));
                this.f6601s = i;
                this.f6600r++;
                d5 = this.f6602t;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (d5 != null) {
            d5.t(1);
        }
        return abstractC0424dC;
    }

    public abstract AbstractC0424d c();

    public abstract AbstractC0424d[] d();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(AbstractC0424d abstractC0424d) {
        D d5;
        int i;
        InterfaceC1524c[] interfaceC1524cArrB;
        synchronized (this) {
            try {
                int i7 = this.f6600r - 1;
                this.f6600r = i7;
                d5 = this.f6602t;
                if (i7 == 0) {
                    this.f6601s = 0;
                }
                kotlin.jvm.internal.m.c(abstractC0424d, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                interfaceC1524cArrB = abstractC0424d.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC1524c interfaceC1524c : interfaceC1524cArrB) {
            if (interfaceC1524c != null) {
                interfaceC1524c.resumeWith(C1386y.f15098a);
            }
        }
        if (d5 != null) {
            d5.t(-1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final D f() {
        D d5;
        synchronized (this) {
            d5 = this.f6602t;
            if (d5 == null) {
                int i = this.f6600r;
                d5 = new D(1, Integer.MAX_VALUE);
                d5.n(Integer.valueOf(i));
                this.f6602t = d5;
            }
        }
        return d5;
    }
}
