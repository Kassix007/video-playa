package androidx.compose.foundation.text.modifiers;

import B0.AbstractC0036d0;
import J.g;
import L0.F;
import O0.d;
import c0.AbstractC0724l;
import k1.i;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class TextStringSimpleElement extends AbstractC0036d0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f9304q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final F f9305r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f9306s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f9307t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f9308u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f9309v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f9310w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TextStringSimpleElement(String str, F f, d dVar, int i, boolean z5, int i7, int i8) {
        this.f9304q = str;
        this.f9305r = f;
        this.f9306s = dVar;
        this.f9307t = i;
        this.f9308u = z5;
        this.f9309v = i7;
        this.f9310w = i8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        textStringSimpleElement.getClass();
        return m.a(this.f9304q, textStringSimpleElement.f9304q) && m.a(this.f9305r, textStringSimpleElement.f9305r) && m.a(this.f9306s, textStringSimpleElement.f9306s) && this.f9307t == textStringSimpleElement.f9307t && this.f9308u == textStringSimpleElement.f9308u && this.f9309v == textStringSimpleElement.f9309v && this.f9310w == textStringSimpleElement.f9310w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final AbstractC0724l f() {
        g gVar = new g();
        gVar.f2481E = this.f9304q;
        gVar.f2482F = this.f9305r;
        gVar.f2483G = this.f9306s;
        gVar.f2484H = this.f9307t;
        gVar.f2485I = this.f9308u;
        gVar.f2486J = this.f9309v;
        gVar.f2487K = this.f9310w;
        return gVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    @Override // B0.AbstractC0036d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(c0.AbstractC0724l r12) {
        /*
            r11 = this;
            J.g r12 = (J.g) r12
            r12.getClass()
            L0.F r0 = r12.f2482F
            r1 = 0
            r2 = 1
            L0.F r3 = r11.f9305r
            if (r3 == r0) goto L1a
            L0.y r4 = r3.f3091a
            L0.y r0 = r0.f3091a
            boolean r0 = r4.b(r0)
            if (r0 == 0) goto L18
            goto L1d
        L18:
            r0 = r2
            goto L1e
        L1a:
            r3.getClass()
        L1d:
            r0 = r1
        L1e:
            java.lang.String r4 = r12.f2481E
            java.lang.String r5 = r11.f9304q
            boolean r4 = kotlin.jvm.internal.m.a(r4, r5)
            if (r4 == 0) goto L29
            goto L2f
        L29:
            r12.f2481E = r5
            r1 = 0
            r12.f2491O = r1
            r1 = r2
        L2f:
            L0.F r4 = r12.f2482F
            if (r4 == r3) goto L4a
            L0.q r5 = r4.f3092b
            L0.q r6 = r3.f3092b
            boolean r5 = kotlin.jvm.internal.m.a(r5, r6)
            if (r5 == 0) goto L48
            L0.y r4 = r4.f3091a
            L0.y r5 = r3.f3091a
            boolean r4 = r4.a(r5)
            if (r4 == 0) goto L48
            goto L4d
        L48:
            r4 = 0
            goto L4e
        L4a:
            r4.getClass()
        L4d:
            r4 = 1
        L4e:
            r4 = r4 ^ r2
            r12.f2482F = r3
            int r3 = r12.f2487K
            int r5 = r11.f9310w
            if (r3 == r5) goto L5a
            r12.f2487K = r5
            r4 = r2
        L5a:
            int r3 = r12.f2486J
            int r5 = r11.f9309v
            if (r3 == r5) goto L63
            r12.f2486J = r5
            r4 = r2
        L63:
            boolean r3 = r12.f2485I
            boolean r5 = r11.f9308u
            if (r3 == r5) goto L6c
            r12.f2485I = r5
            r4 = r2
        L6c:
            O0.d r3 = r12.f2483G
            O0.d r5 = r11.f9306s
            boolean r3 = kotlin.jvm.internal.m.a(r3, r5)
            if (r3 != 0) goto L79
            r12.f2483G = r5
            r4 = r2
        L79:
            int r3 = r12.f2484H
            int r5 = r11.f9307t
            if (r3 != r5) goto L81
            r2 = r4
            goto L83
        L81:
            r12.f2484H = r5
        L83:
            if (r1 != 0) goto L87
            if (r2 == 0) goto Laa
        L87:
            J.d r3 = r12.x0()
            java.lang.String r4 = r12.f2481E
            L0.F r5 = r12.f2482F
            O0.d r6 = r12.f2483G
            int r7 = r12.f2484H
            boolean r8 = r12.f2485I
            int r9 = r12.f2486J
            int r10 = r12.f2487K
            r3.f2462a = r4
            r3.f2463b = r5
            r3.f2464c = r6
            r3.f2465d = r7
            r3.f2466e = r8
            r3.f = r9
            r3.f2467g = r10
            r3.a()
        Laa:
            boolean r3 = r12.f10099D
            if (r3 != 0) goto Laf
            goto Lc9
        Laf:
            if (r1 != 0) goto Lb7
            if (r0 == 0) goto Lba
            J.f r3 = r12.f2490N
            if (r3 == 0) goto Lba
        Lb7:
            B0.AbstractC0041g.n(r12)
        Lba:
            if (r1 != 0) goto Lbe
            if (r2 == 0) goto Lc4
        Lbe:
            B0.AbstractC0041g.m(r12)
            B0.AbstractC0041g.l(r12)
        Lc4:
            if (r0 == 0) goto Lc9
            B0.AbstractC0041g.l(r12)
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextStringSimpleElement.g(c0.l):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (((i.e(i.c(this.f9307t, (this.f9306s.hashCode() + ((this.f9305r.hashCode() + (this.f9304q.hashCode() * 31)) * 31)) * 31, 31), 31, this.f9308u) + this.f9309v) * 31) + this.f9310w) * 31;
    }
}
