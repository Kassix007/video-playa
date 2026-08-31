package c4;

import android.net.Uri;
import com.google.android.gms.internal.measurement.T1;
import l4.p;
import u1.C1678e;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f10239q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f10240r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c(Uri uri, boolean z5, boolean z6) {
        this.f10240r = uri;
        this.f10239q = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    @Override // l4.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w1.o0 a(android.view.View r11, w1.o0 r12, l4.q r13) {
        /*
            r10 = this;
            w1.l0 r0 = r12.f18232a
            r1 = 519(0x207, float:7.27E-43)
            n1.b r1 = r0.g(r1)
            r2 = 32
            n1.b r0 = r0.g(r2)
            java.lang.Object r2 = r10.f10240r
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r2
            int r3 = r1.f15126b
            int r4 = r1.f15127c
            int r5 = r1.f15125a
            r2.f11411w = r3
            boolean r3 = l4.m.f(r11)
            int r6 = r11.getPaddingBottom()
            int r7 = r11.getPaddingLeft()
            int r8 = r11.getPaddingRight()
            boolean r9 = r2.f11403o
            if (r9 == 0) goto L37
            int r6 = r12.a()
            r2.f11410v = r6
            int r9 = r13.f14585d
            int r6 = r6 + r9
        L37:
            boolean r9 = r2.f11404p
            if (r9 == 0) goto L43
            if (r3 == 0) goto L40
            int r7 = r13.f14584c
            goto L42
        L40:
            int r7 = r13.f14582a
        L42:
            int r7 = r7 + r5
        L43:
            boolean r9 = r2.f11405q
            if (r9 == 0) goto L50
            if (r3 == 0) goto L4c
            int r13 = r13.f14582a
            goto L4e
        L4c:
            int r13 = r13.f14584c
        L4e:
            int r8 = r13 + r4
        L50:
            android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
            boolean r3 = r2.f11407s
            r9 = 1
            if (r3 == 0) goto L63
            int r3 = r13.leftMargin
            if (r3 == r5) goto L63
            r13.leftMargin = r5
            r3 = r9
            goto L64
        L63:
            r3 = 0
        L64:
            boolean r5 = r2.f11408t
            if (r5 == 0) goto L6f
            int r5 = r13.rightMargin
            if (r5 == r4) goto L6f
            r13.rightMargin = r4
            r3 = r9
        L6f:
            boolean r4 = r2.f11409u
            if (r4 == 0) goto L7c
            int r4 = r13.topMargin
            int r1 = r1.f15126b
            if (r4 == r1) goto L7c
            r13.topMargin = r1
            goto L7d
        L7c:
            r9 = r3
        L7d:
            if (r9 == 0) goto L82
            r11.setLayoutParams(r13)
        L82:
            int r13 = r11.getPaddingTop()
            r11.setPadding(r7, r13, r8, r6)
            boolean r11 = r10.f10239q
            if (r11 == 0) goto L91
            int r13 = r0.f15128d
            r2.f11401m = r13
        L91:
            boolean r13 = r2.f11403o
            if (r13 != 0) goto L99
            if (r11 == 0) goto L98
            goto L99
        L98:
            return r12
        L99:
            r2.I()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.c.a(android.view.View, w1.o0, l4.q):w1.o0");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean b() {
        return this.f10239q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(java.lang.CharSequence r7, int r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L48
            if (r8 < 0) goto L48
            int r0 = r7.length()
            int r0 = r0 - r8
            if (r0 < 0) goto L48
            java.lang.Object r0 = r6.f10240r
            u1.e r0 = (u1.C1678e) r0
            if (r0 != 0) goto L16
            boolean r7 = r6.b()
            return r7
        L16:
            r0.getClass()
            r0 = 0
            r1 = 2
            r2 = r0
            r3 = r1
        L1d:
            r4 = 1
            if (r2 >= r8) goto L3d
            if (r3 != r1) goto L3d
            char r3 = r7.charAt(r2)
            byte r3 = java.lang.Character.getDirectionality(r3)
            c4.c r5 = u1.AbstractC1679f.f17129a
            if (r3 == 0) goto L39
            if (r3 == r4) goto L37
            if (r3 == r1) goto L37
            switch(r3) {
                case 14: goto L39;
                case 15: goto L39;
                case 16: goto L37;
                case 17: goto L37;
                default: goto L35;
            }
        L35:
            r3 = r1
            goto L3a
        L37:
            r3 = r0
            goto L3a
        L39:
            r3 = r4
        L3a:
            int r2 = r2 + 1
            goto L1d
        L3d:
            if (r3 == 0) goto L47
            if (r3 == r4) goto L46
            boolean r7 = r6.b()
            return r7
        L46:
            return r0
        L47:
            return r4
        L48:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.c.c(java.lang.CharSequence, int):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public T1 d(String str, long j) {
        Long lValueOf = Long.valueOf(j);
        Object obj = T1.f10705g;
        return new T1(this, str, lValueOf, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public T1 e(String str, boolean z5) {
        Boolean boolValueOf = Boolean.valueOf(z5);
        Object obj = T1.f10705g;
        return new T1(this, str, boolValueOf, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public T1 f(String str, String str2) {
        Object obj = T1.f10705g;
        return new T1(this, str, str2, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ c(Object obj, boolean z5) {
        this.f10240r = obj;
        this.f10239q = z5;
    }

    public c(C1678e c1678e, boolean z5) {
        this.f10240r = c1678e;
        this.f10239q = z5;
    }
}
