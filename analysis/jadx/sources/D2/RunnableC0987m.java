package d2;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: d2.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0987m implements Runnable {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final ThreadLocal f12166u = new ThreadLocal();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final I2.A f12167v = new I2.A(6);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f12168q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f12169r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f12170s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f12171t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static AbstractC0974V c(RecyclerView recyclerView, int i, long j) {
        int iG = recyclerView.f9656u.G();
        for (int i7 = 0; i7 < iG; i7++) {
            AbstractC0974V abstractC0974VI = RecyclerView.I(recyclerView.f9656u.F(i7));
            if (abstractC0974VI.f12034c == i && !abstractC0974VI.f()) {
                return null;
            }
        }
        C0966M c0966m = recyclerView.f9650r;
        try {
            recyclerView.P();
            AbstractC0974V abstractC0974VI2 = c0966m.i(i, j);
            if (abstractC0974VI2 != null) {
                if (!abstractC0974VI2.e() || abstractC0974VI2.f()) {
                    c0966m.a(abstractC0974VI2, false);
                } else {
                    c0966m.f(abstractC0974VI2.f12032a);
                }
            }
            recyclerView.Q(false);
            return abstractC0974VI2;
        } catch (Throwable th) {
            recyclerView.Q(false);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(RecyclerView recyclerView, int i, int i7) {
        if (recyclerView.f9611F && this.f12169r == 0) {
            this.f12169r = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        Q.J j = recyclerView.f9651r0;
        j.f6476a = i;
        j.f6477b = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(long r17) {
        /*
            r16 = this;
            r1 = r16
            java.util.ArrayList r0 = r1.f12171t
            java.util.ArrayList r2 = r1.f12168q
            int r3 = r2.size()
            r4 = 0
            r5 = r4
            r6 = r5
        Ld:
            if (r5 >= r3) goto L26
            java.lang.Object r7 = r2.get(r5)
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            int r8 = r7.getWindowVisibility()
            Q.J r9 = r7.f9651r0
            if (r8 != 0) goto L23
            r9.b(r7, r4)
            int r7 = r9.f6478c
            int r6 = r6 + r7
        L23:
            int r5 = r5 + 1
            goto Ld
        L26:
            r0.ensureCapacity(r6)
            r5 = r4
            r6 = r5
        L2b:
            r7 = 1
            if (r5 >= r3) goto L87
            java.lang.Object r8 = r2.get(r5)
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            int r9 = r8.getWindowVisibility()
            if (r9 == 0) goto L3b
            goto L84
        L3b:
            Q.J r9 = r8.f9651r0
            int r10 = r9.f6476a
            int r10 = java.lang.Math.abs(r10)
            int r11 = r9.f6477b
            int r11 = java.lang.Math.abs(r11)
            int r11 = r11 + r10
            r10 = r4
        L4b:
            int r12 = r9.f6478c
            int r12 = r12 * 2
            if (r10 >= r12) goto L84
            int r12 = r0.size()
            if (r6 < r12) goto L60
            d2.l r12 = new d2.l
            r12.<init>()
            r0.add(r12)
            goto L66
        L60:
            java.lang.Object r12 = r0.get(r6)
            d2.l r12 = (d2.C0986l) r12
        L66:
            java.lang.Object r13 = r9.f6479d
            int[] r13 = (int[]) r13
            int r14 = r10 + 1
            r14 = r13[r14]
            if (r14 > r11) goto L72
            r15 = r7
            goto L73
        L72:
            r15 = r4
        L73:
            r12.f12161a = r15
            r12.f12162b = r11
            r12.f12163c = r14
            r12.f12164d = r8
            r13 = r13[r10]
            r12.f12165e = r13
            int r6 = r6 + 1
            int r10 = r10 + 2
            goto L4b
        L84:
            int r5 = r5 + 1
            goto L2b
        L87:
            I2.A r2 = d2.RunnableC0987m.f12167v
            java.util.Collections.sort(r0, r2)
            r2 = r4
        L8d:
            int r3 = r0.size()
            if (r2 >= r3) goto L14e
            java.lang.Object r3 = r0.get(r2)
            d2.l r3 = (d2.C0986l) r3
            androidx.recyclerview.widget.RecyclerView r5 = r3.f12164d
            if (r5 != 0) goto L9f
            goto L14e
        L9f:
            boolean r6 = r3.f12161a
            if (r6 == 0) goto La9
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto Lab
        La9:
            r8 = r17
        Lab:
            int r6 = r3.f12165e
            d2.V r5 = c(r5, r6, r8)
            if (r5 == 0) goto Lcd
            java.lang.ref.WeakReference r6 = r5.f12033b
            if (r6 == 0) goto Lcd
            boolean r6 = r5.e()
            if (r6 == 0) goto Lcd
            boolean r6 = r5.f()
            if (r6 != 0) goto Lcd
            java.lang.ref.WeakReference r5 = r5.f12033b
            java.lang.Object r5 = r5.get()
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            if (r5 != 0) goto Ld1
        Lcd:
            r10 = r17
            goto L13f
        Ld1:
            boolean r6 = r5.f9623O
            if (r6 == 0) goto Lfa
            B0.G0 r6 = r5.f9656u
            int r6 = r6.G()
            if (r6 == 0) goto Lfa
            d2.M r6 = r5.f9650r
            d2.D r8 = r5.f9632a0
            if (r8 == 0) goto Le6
            r8.e()
        Le6:
            d2.G r8 = r5.f9604B
            if (r8 == 0) goto Lf2
            r8.g0(r6)
            d2.G r8 = r5.f9604B
            r8.h0(r6)
        Lf2:
            java.util.ArrayList r8 = r6.f11999a
            r8.clear()
            r6.d()
        Lfa:
            Q.J r6 = r5.f9651r0
            r6.b(r5, r7)
            int r8 = r6.f6478c
            if (r8 == 0) goto Lcd
            java.lang.String r8 = "RV Nested Prefetch"
            int r9 = r1.g.f16278a     // Catch: java.lang.Throwable -> L131
            android.os.Trace.beginSection(r8)     // Catch: java.lang.Throwable -> L131
            d2.S r8 = r5.f9653s0     // Catch: java.lang.Throwable -> L131
            d2.z r9 = r5.f9602A     // Catch: java.lang.Throwable -> L131
            r8.f12016d = r7     // Catch: java.lang.Throwable -> L131
            int r9 = r9.a()     // Catch: java.lang.Throwable -> L131
            r8.f12017e = r9     // Catch: java.lang.Throwable -> L131
            r8.f12018g = r4     // Catch: java.lang.Throwable -> L131
            r8.f12019h = r4     // Catch: java.lang.Throwable -> L131
            r8.i = r4     // Catch: java.lang.Throwable -> L131
            r8 = r4
        L11d:
            int r9 = r6.f6478c     // Catch: java.lang.Throwable -> L131
            int r9 = r9 * 2
            if (r8 >= r9) goto L133
            java.lang.Object r9 = r6.f6479d     // Catch: java.lang.Throwable -> L131
            int[] r9 = (int[]) r9     // Catch: java.lang.Throwable -> L131
            r9 = r9[r8]     // Catch: java.lang.Throwable -> L131
            r10 = r17
            c(r5, r9, r10)     // Catch: java.lang.Throwable -> L131
            int r8 = r8 + 2
            goto L11d
        L131:
            r0 = move-exception
            goto L139
        L133:
            r10 = r17
            android.os.Trace.endSection()
            goto L13f
        L139:
            int r2 = r1.g.f16278a
            android.os.Trace.endSection()
            throw r0
        L13f:
            r3.f12161a = r4
            r3.f12162b = r4
            r3.f12163c = r4
            r5 = 0
            r3.f12164d = r5
            r3.f12165e = r4
            int r2 = r2 + 1
            goto L8d
        L14e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.RunnableC0987m.b(long):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f12168q;
        try {
            int i = r1.g.f16278a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i7 = 0; i7 < size; i7++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i7);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f12170s);
                }
            }
            this.f12169r = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.f12169r = 0L;
            int i8 = r1.g.f16278a;
            Trace.endSection();
            throw th;
        }
    }
}
