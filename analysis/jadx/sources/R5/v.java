package R5;

import M5.O;
import M5.P;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7271b = AtomicIntegerFieldUpdater.newUpdater(v.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public O[] f7272a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(O o6) {
        o6.d((P) this);
        O[] oArr = this.f7272a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7271b;
        if (oArr == null) {
            oArr = new O[4];
            this.f7272a = oArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= oArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(oArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            oArr = (O[]) objArrCopyOf;
            this.f7272a = oArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        oArr[i] = o6;
        o6.f3820r = i;
        c(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final M5.O b(int r9) {
        /*
            r8 = this;
            M5.O[] r0 = r8.f7272a
            kotlin.jvm.internal.m.b(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = R5.v.f7271b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.d(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            kotlin.jvm.internal.m.b(r4)
            r5 = r0[r2]
            kotlin.jvm.internal.m.b(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.d(r9, r2)
            r8.c(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            M5.O[] r5 = r8.f7272a
            kotlin.jvm.internal.m.b(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            kotlin.jvm.internal.m.b(r6)
            r7 = r5[r4]
            kotlin.jvm.internal.m.b(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            kotlin.jvm.internal.m.b(r4)
            r5 = r5[r2]
            kotlin.jvm.internal.m.b(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.d(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            kotlin.jvm.internal.m.b(r9)
            r2 = 0
            r9.d(r2)
            r9.f3820r = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: R5.v.b(int):M5.O");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(int i) {
        while (i > 0) {
            O[] oArr = this.f7272a;
            kotlin.jvm.internal.m.b(oArr);
            int i7 = (i - 1) / 2;
            O o6 = oArr[i7];
            kotlin.jvm.internal.m.b(o6);
            O o7 = oArr[i];
            kotlin.jvm.internal.m.b(o7);
            if (o6.compareTo(o7) <= 0) {
                return;
            }
            d(i, i7);
            i = i7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(int i, int i7) {
        O[] oArr = this.f7272a;
        kotlin.jvm.internal.m.b(oArr);
        O o6 = oArr[i7];
        kotlin.jvm.internal.m.b(o6);
        O o7 = oArr[i];
        kotlin.jvm.internal.m.b(o7);
        oArr[i] = o6;
        oArr[i7] = o7;
        o6.f3820r = i;
        o7.f3820r = i7;
    }
}
