package d1;

import C0.S;
import e1.AbstractC1028h;
import e1.C1034n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: d1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0952c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0953d f11820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11821e;
    public C0952c f;
    public b1.f i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet f11817a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11822g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11823h = Integer.MIN_VALUE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0952c(C0953d c0953d, int i) {
        this.f11820d = c0953d;
        this.f11821e = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(C0952c c0952c, int i) {
        b(c0952c, i, Integer.MIN_VALUE, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b(C0952c c0952c, int i, int i7, boolean z5) {
        if (c0952c == null) {
            j();
            return true;
        }
        if (!z5 && !i(c0952c)) {
            return false;
        }
        this.f = c0952c;
        if (c0952c.f11817a == null) {
            c0952c.f11817a = new HashSet();
        }
        HashSet hashSet = this.f.f11817a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f11822g = i;
        this.f11823h = i7;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(int i, C1034n c1034n, ArrayList arrayList) {
        HashSet hashSet = this.f11817a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC1028h.b(((C0952c) it.next()).f11820d, i, arrayList, c1034n);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int d() {
        if (this.f11819c) {
            return this.f11818b;
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int e() {
        C0952c c0952c;
        if (this.f11820d.f11862g0 == 8) {
            return 0;
        }
        int i = this.f11823h;
        return (i == Integer.MIN_VALUE || (c0952c = this.f) == null || c0952c.f11820d.f11862g0 != 8) ? this.f11822g : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0952c f() {
        int i = this.f11821e;
        int iA = O.c.a(i);
        C0953d c0953d = this.f11820d;
        switch (iA) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c0953d.f11834K;
            case 2:
                return c0953d.f11835L;
            case 3:
                return c0953d.f11832I;
            case 4:
                return c0953d.f11833J;
            default:
                throw new AssertionError(S.z(i));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g() {
        HashSet hashSet = this.f11817a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C0952c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean h() {
        return this.f != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(d1.C0952c r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L5
            goto L65
        L5:
            d1.d r1 = r11.f11820d
            int r11 = r11.f11821e
            r2 = 6
            int r3 = r10.f11821e
            r4 = 1
            if (r11 != r3) goto L1c
            if (r3 != r2) goto L63
            boolean r11 = r1.f11828E
            if (r11 == 0) goto L65
            d1.d r11 = r10.f11820d
            boolean r11 = r11.f11828E
            if (r11 != 0) goto L63
            goto L65
        L1c:
            int r5 = O.c.a(r3)
            r6 = 4
            r7 = 2
            r8 = 9
            r9 = 8
            switch(r5) {
                case 0: goto L65;
                case 1: goto L53;
                case 2: goto L3f;
                case 3: goto L53;
                case 4: goto L3f;
                case 5: goto L3a;
                case 6: goto L33;
                case 7: goto L65;
                case 8: goto L65;
                default: goto L29;
            }
        L29:
            java.lang.AssertionError r11 = new java.lang.AssertionError
            java.lang.String r0 = C0.S.z(r3)
            r11.<init>(r0)
            throw r11
        L33:
            if (r11 == r2) goto L65
            if (r11 == r9) goto L65
            if (r11 == r8) goto L65
            goto L63
        L3a:
            if (r11 == r7) goto L65
            if (r11 != r6) goto L63
            goto L65
        L3f:
            r2 = 3
            if (r11 == r2) goto L48
            r2 = 5
            if (r11 != r2) goto L46
            goto L48
        L46:
            r2 = r0
            goto L49
        L48:
            r2 = r4
        L49:
            boolean r1 = r1 instanceof d1.h
            if (r1 == 0) goto L52
            if (r2 != 0) goto L63
            if (r11 != r8) goto L65
            goto L63
        L52:
            return r2
        L53:
            if (r11 == r7) goto L5a
            if (r11 != r6) goto L58
            goto L5a
        L58:
            r2 = r0
            goto L5b
        L5a:
            r2 = r4
        L5b:
            boolean r1 = r1 instanceof d1.h
            if (r1 == 0) goto L64
            if (r2 != 0) goto L63
            if (r11 != r9) goto L65
        L63:
            return r4
        L64:
            return r2
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.C0952c.i(d1.c):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j() {
        HashSet hashSet;
        C0952c c0952c = this.f;
        if (c0952c != null && (hashSet = c0952c.f11817a) != null) {
            hashSet.remove(this);
            if (this.f.f11817a.size() == 0) {
                this.f.f11817a = null;
            }
        }
        this.f11817a = null;
        this.f = null;
        this.f11822g = 0;
        this.f11823h = Integer.MIN_VALUE;
        this.f11819c = false;
        this.f11818b = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k() {
        b1.f fVar = this.i;
        if (fVar == null) {
            this.i = new b1.f(1);
        } else {
            fVar.c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l(int i) {
        this.f11818b = i;
        this.f11819c = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f11820d.f11864h0 + ":" + S.z(this.f11821e);
    }
}
