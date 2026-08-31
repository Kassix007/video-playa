package C0;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f1152a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final C0.w1 a(C0.AbstractC0065a r6, P.r r7, X.e r8) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = C0.B0.f784a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L40
            r0 = 6
            O5.e r0 = l6.d.e(r2, r3, r0)
            m5.o r2 = C0.C0076f0.f1026A
            java.lang.Object r2 = r2.getValue()
            q5.h r2 = (q5.InterfaceC1529h) r2
            R5.d r2 = M5.AbstractC0263y.a(r2)
            C0.A0 r4 = new C0.A0
            r4.<init>(r0, r3)
            r5 = 3
            M5.AbstractC0263y.t(r2, r3, r3, r4, r5)
            B0.a r2 = new B0.a
            r4 = 6
            r2.<init>(r4, r0)
            java.lang.Object r0 = a0.n.f8680b
            monitor-enter(r0)
            java.lang.Object r4 = a0.n.f8685h     // Catch: java.lang.Throwable -> L3d
            java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.lang.Throwable -> L3d
            java.util.ArrayList r2 = n5.l.v0(r4, r2)     // Catch: java.lang.Throwable -> L3d
            a0.n.f8685h = r2     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r0)
            a0.n.a()
            goto L40
        L3d:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L40:
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto L53
            android.view.View r0 = r6.getChildAt(r1)
            boolean r1 = r0 instanceof C0.A
            if (r1 == 0) goto L51
            C0.A r0 = (C0.A) r0
            goto L57
        L51:
            r0 = r3
            goto L57
        L53:
            r6.removeAllViews()
            goto L51
        L57:
            if (r0 != 0) goto L6f
            C0.A r0 = new C0.A
            android.content.Context r1 = r6.getContext()
            q5.h r2 = r7.h()
            r0.<init>(r1, r2)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r2 = C0.x1.f1152a
            r6.addView(r1, r2)
        L6f:
            android.view.View r6 = r0.getView()
            r1 = 2131296797(0x7f09021d, float:1.821152E38)
            java.lang.Object r6 = r6.getTag(r1)
            boolean r2 = r6 instanceof C0.w1
            if (r2 == 0) goto L81
            r3 = r6
            C0.w1 r3 = (C0.w1) r3
        L81:
            if (r3 != 0) goto L9d
            C0.w1 r3 = new C0.w1
            B0.G0 r6 = new B0.G0
            B0.L r2 = r0.getRoot()
            r6.<init>(r2)
            P.u r2 = new P.u
            r2.<init>(r7, r6)
            r3.<init>(r0, r2)
            android.view.View r6 = r0.getView()
            r6.setTag(r1, r3)
        L9d:
            r3.g(r8)
            q5.h r6 = r0.getCoroutineContext()
            q5.h r8 = r7.h()
            boolean r6 = kotlin.jvm.internal.m.a(r6, r8)
            if (r6 != 0) goto Lb5
            q5.h r6 = r7.h()
            r0.setCoroutineContext(r6)
        Lb5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.x1.a(C0.a, P.r, X.e):C0.w1");
    }
}
