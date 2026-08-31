package O3;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class V0 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f4643q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f4644r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0271b1 f4645s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ V0(C0271b1 c0271b1, AtomicReference atomicReference, int i, boolean z5) {
        this.f4643q = i;
        this.f4645s = c0271b1;
        this.f4644r = atomicReference;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void a() {
        AtomicReference atomicReference = this.f4644r;
        synchronized (atomicReference) {
            try {
                try {
                    C0323t0 c0323t0 = (C0323t0) this.f4645s.f4346r;
                    atomicReference.set(Double.valueOf(c0323t0.f5075t.x(c0323t0.q().u(), F.f4425e0)));
                } finally {
                    this.f4644r.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4643q) {
            case 0:
                AtomicReference atomicReference = this.f4644r;
                synchronized (atomicReference) {
                    try {
                        try {
                            C0323t0 c0323t0 = (C0323t0) this.f4645s.f4346r;
                            atomicReference.set(Boolean.valueOf(c0323t0.f5075t.y(c0323t0.q().u(), F.f4413a0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference2 = this.f4644r;
                synchronized (atomicReference2) {
                    try {
                        try {
                            C0323t0 c0323t02 = (C0323t0) this.f4645s.f4346r;
                            atomicReference2.set(c0323t02.f5075t.u(c0323t02.q().u(), F.f4416b0));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 2:
                AtomicReference atomicReference3 = this.f4644r;
                synchronized (atomicReference3) {
                    try {
                        try {
                            C0323t0 c0323t03 = (C0323t0) this.f4645s.f4346r;
                            atomicReference3.set(Long.valueOf(c0323t03.f5075t.v(c0323t03.q().u(), F.f4419c0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 3:
                AtomicReference atomicReference4 = this.f4644r;
                synchronized (atomicReference4) {
                    try {
                        try {
                            C0323t0 c0323t04 = (C0323t0) this.f4645s.f4346r;
                            atomicReference4.set(Integer.valueOf(c0323t04.f5075t.w(c0323t04.q().u(), F.f4422d0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 4:
                a();
                return;
            case 5:
                C0271b1 c0271b1 = this.f4645s;
                C0288h0 c0288h0 = ((C0323t0) c0271b1.f4346r).f5076u;
                C0323t0.j(c0288h0);
                Bundle bundleB = c0288h0.f4881E.B();
                C0333w1 c0333w1O = ((C0323t0) c0271b1.f4346r).o();
                AtomicReference atomicReference5 = this.f4644r;
                c0333w1O.o();
                c0333w1O.p();
                c0333w1O.C(new B0(c0333w1O, atomicReference5, c0333w1O.E(false), bundleB, 6));
                return;
            default:
                C0333w1 c0333w1O2 = ((C0323t0) this.f4645s.f4346r).o();
                M1 m1W = M1.W(EnumC0292i1.SGTM_CLIENT);
                AtomicReference atomicReference6 = this.f4644r;
                c0333w1O2.o();
                c0333w1O2.p();
                c0333w1O2.C(new B0(c0333w1O2, atomicReference6, c0333w1O2.E(false), m1W));
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public V0(C0271b1 c0271b1, AtomicReference atomicReference, int i) {
        this.f4643q = i;
        switch (i) {
            case 1:
                this.f4644r = atomicReference;
                Objects.requireNonNull(c0271b1);
                this.f4645s = c0271b1;
                break;
            case 2:
                this.f4644r = atomicReference;
                Objects.requireNonNull(c0271b1);
                this.f4645s = c0271b1;
                break;
            case 3:
                this.f4644r = atomicReference;
                Objects.requireNonNull(c0271b1);
                this.f4645s = c0271b1;
                break;
            case 4:
                this.f4644r = atomicReference;
                Objects.requireNonNull(c0271b1);
                this.f4645s = c0271b1;
                break;
            default:
                this.f4644r = atomicReference;
                Objects.requireNonNull(c0271b1);
                this.f4645s = c0271b1;
                break;
        }
    }
}
