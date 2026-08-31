package a0;

import java.util.Collection;
import m5.C1386y;

/* JADX INFO: renamed from: a0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0599a extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0599a f8644r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0599a f8645s;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f8646q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 1;
        f8644r = new C0599a(i, 0);
        f8645s = new C0599a(i, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0599a(int i, int i7) {
        super(i);
        this.f8646q = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f8646q) {
            case 0:
                synchronized (n.f8680b) {
                    ?? r12 = n.f8685h;
                    int size = ((Collection) r12).size();
                    for (int i = 0; i < size; i++) {
                        ((B5.c) r12.get(i)).invoke(obj);
                    }
                }
                return C1386y.f15098a;
            default:
                return C1386y.f15098a;
        }
    }
}
