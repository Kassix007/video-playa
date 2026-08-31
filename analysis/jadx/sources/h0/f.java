package H0;

import B0.C0029a;
import C0.A;
import C0.I0;
import I0.m;
import M5.AbstractC0263y;
import M5.B;
import M5.l0;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import j0.AbstractC1145B;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final class f implements ScrollCaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f2055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W0.j f2056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I0 f2057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A f2058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final R5.d f2059e;
    public final j f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f(m mVar, W0.j jVar, R5.d dVar, I0 i02, A a7) {
        this.f2055a = mVar;
        this.f2056b = jVar;
        this.f2057c = i02;
        this.f2058d = a7;
        this.f2059e = new R5.d(dVar.f7234q.plus(h.f2061q));
        this.f = new j(jVar.f8020d - jVar.f8018b, new e(this, null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(H0.f r11, android.view.ScrollCaptureSession r12, W0.j r13, s5.c r14) {
        /*
            boolean r0 = r14 instanceof H0.c
            if (r0 == 0) goto L13
            r0 = r14
            H0.c r0 = (H0.c) r0
            int r1 = r0.f2047x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2047x = r1
            goto L18
        L13:
            H0.c r0 = new H0.c
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f2045v
            int r1 = r0.f2047x
            r2 = 2
            r3 = 1
            r5.a r4 = r5.EnumC1580a.f16356q
            if (r1 == 0) goto L57
            if (r1 == r3) goto L41
            if (r1 != r2) goto L39
            int r11 = r0.f2044u
            int r12 = r0.f2043t
            W0.j r13 = r0.f2042s
            java.lang.Object r1 = r0.f2041r
            android.view.ScrollCaptureSession r1 = B3.e.e(r1)
            H0.f r0 = r0.f2040q
            m5.AbstractC1362a.e(r14)
            goto Lbe
        L39:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L41:
            int r11 = r0.f2044u
            int r12 = r0.f2043t
            W0.j r13 = r0.f2042s
            java.lang.Object r1 = r0.f2041r
            android.view.ScrollCaptureSession r1 = B3.e.e(r1)
            H0.f r3 = r0.f2040q
            m5.AbstractC1362a.e(r14)
            r14 = r12
            r12 = r1
            r1 = r11
            r11 = r3
            goto L9d
        L57:
            m5.AbstractC1362a.e(r14)
            int r14 = r13.f8018b
            int r1 = r13.f8020d
            H0.j r5 = r11.f
            r0.f2040q = r11
            r0.f2041r = r12
            r0.f2042s = r13
            r0.f2043t = r14
            r0.f2044u = r1
            r0.f2047x = r3
            int r3 = r5.f2066a
            if (r14 > r1) goto L140
            int r6 = r1 - r14
            if (r6 > r3) goto L12e
            float r6 = (float) r14
            float r7 = r5.f2068c
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            m5.y r9 = m5.C1386y.f15098a
            if (r8 < 0) goto L85
            float r8 = (float) r1
            float r10 = (float) r3
            float r10 = r10 + r7
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 > 0) goto L85
            goto L9a
        L85:
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L8b
            r3 = r14
            goto L8d
        L8b:
            int r3 = r1 - r3
        L8d:
            float r3 = (float) r3
            float r3 = r3 - r7
            java.lang.Object r3 = r5.a(r3, r0)
            if (r3 != r4) goto L96
            goto L97
        L96:
            r3 = r9
        L97:
            if (r3 != r4) goto L9a
            r9 = r3
        L9a:
            if (r9 != r4) goto L9d
            goto Lb9
        L9d:
            H0.d r3 = H0.d.f2048r
            r0.f2040q = r11
            r0.f2041r = r12
            r0.f2042s = r13
            r0.f2043t = r14
            r0.f2044u = r1
            r0.f2047x = r2
            q5.h r2 = r0.getContext()
            P.T r2 = P.C0345b.o(r2)
            java.lang.Object r0 = r2.e(r3, r0)
            if (r0 != r4) goto Lba
        Lb9:
            return r4
        Lba:
            r0 = r11
            r11 = r1
            r1 = r12
            r12 = r14
        Lbe:
            H0.j r14 = r0.f
            float r2 = r14.f2068c
            int r2 = D5.a.G(r2)
            int r12 = r12 - r2
            int r14 = r14.f2066a
            r2 = 0
            int r12 = D5.a.q(r12, r2, r14)
            H0.j r14 = r0.f
            float r3 = r14.f2068c
            int r3 = D5.a.G(r3)
            int r11 = r11 - r3
            int r14 = r14.f2066a
            int r11 = D5.a.q(r11, r2, r14)
            int r14 = r13.f8017a
            int r13 = r13.f8019c
            if (r12 != r11) goto Le6
            W0.j r11 = W0.j.f8016e
            return r11
        Le6:
            android.view.Surface r2 = B3.e.g(r1)
            android.graphics.Canvas r2 = r2.lockHardwareCanvas()
            r2.save()     // Catch: java.lang.Throwable -> L125
            float r3 = (float) r14     // Catch: java.lang.Throwable -> L125
            float r3 = -r3
            float r4 = (float) r12     // Catch: java.lang.Throwable -> L125
            float r4 = -r4
            r2.translate(r3, r4)     // Catch: java.lang.Throwable -> L125
            W0.j r3 = r0.f2056b     // Catch: java.lang.Throwable -> L125
            int r4 = r3.f8017a     // Catch: java.lang.Throwable -> L125
            float r4 = (float) r4     // Catch: java.lang.Throwable -> L125
            float r4 = -r4
            int r3 = r3.f8018b     // Catch: java.lang.Throwable -> L125
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L125
            float r3 = -r3
            r2.translate(r4, r3)     // Catch: java.lang.Throwable -> L125
            C0.A r3 = r0.f2058d     // Catch: java.lang.Throwable -> L125
            android.view.View r3 = r3.getRootView()     // Catch: java.lang.Throwable -> L125
            r3.draw(r2)     // Catch: java.lang.Throwable -> L125
            android.view.Surface r1 = B3.e.g(r1)
            r1.unlockCanvasAndPost(r2)
            H0.j r0 = r0.f
            float r0 = r0.f2068c
            int r0 = D5.a.G(r0)
            W0.j r1 = new W0.j
            int r12 = r12 + r0
            int r11 = r11 + r0
            r1.<init>(r14, r12, r13, r11)
            return r1
        L125:
            r11 = move-exception
            android.view.Surface r12 = B3.e.g(r1)
            r12.unlockCanvasAndPost(r2)
            throw r11
        L12e:
            java.lang.String r11 = "Expected range ("
            java.lang.String r12 = ") to be ≤ viewportSize="
            java.lang.String r11 = C0.S.j(r6, r3, r11, r12)
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        L140:
            java.lang.String r11 = "Expected min="
            java.lang.String r12 = " ≤ max="
            java.lang.String r11 = C0.S.j(r14, r1, r11, r12)
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.f.a(H0.f, android.view.ScrollCaptureSession, W0.j, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onScrollCaptureEnd(Runnable runnable) {
        AbstractC0263y.t(this.f2059e, l0.f3870q, null, new a(this, runnable, null), 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        final B bT = AbstractC0263y.t(this.f2059e, null, null, new b(this, scrollCaptureSession, rect, consumer, null), 3);
        bT.G(new C0029a(13, cancellationSignal));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: H0.g
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                bT.a(null);
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(AbstractC1145B.t(this.f2056b));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.f2068c = 0.0f;
        this.f2057c.f874a.setValue(Boolean.TRUE);
        runnable.run();
    }
}
