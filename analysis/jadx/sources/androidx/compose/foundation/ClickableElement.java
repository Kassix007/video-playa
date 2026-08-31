package androidx.compose.foundation;

import B0.AbstractC0036d0;
import I0.f;
import c0.AbstractC0724l;
import kotlin.jvm.internal.m;
import v.C1728x;
import v.V;
import y.i;

/* JADX INFO: loaded from: classes.dex */
final class ClickableElement extends AbstractC0036d0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f9237q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final V f9238r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f9239s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f9240t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final B5.a f9241u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ClickableElement(i iVar, V v6, boolean z5, f fVar, B5.a aVar) {
        this.f9237q = iVar;
        this.f9238r = v6;
        this.f9239s = z5;
        this.f9240t = fVar;
        this.f9241u = aVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return m.a(this.f9237q, clickableElement.f9237q) && m.a(this.f9238r, clickableElement.f9238r) && this.f9239s == clickableElement.f9239s && m.a(this.f9240t, clickableElement.f9240t) && this.f9241u == clickableElement.f9241u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final AbstractC0724l f() {
        return new C1728x(this.f9237q, this.f9238r, this.f9239s, this.f9240t, this.f9241u);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    @Override // B0.AbstractC0036d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(c0.AbstractC0724l r8) {
        /*
            r7 = this;
            v.x r8 = (v.C1728x) r8
            v.I r0 = r8.f17412L
            y.i r1 = r8.f17419S
            y.i r2 = r7.f9237q
            boolean r1 = kotlin.jvm.internal.m.a(r1, r2)
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L19
            r8.A0()
            r8.f17419S = r2
            r8.f17407G = r2
            r1 = r3
            goto L1a
        L19:
            r1 = r4
        L1a:
            v.V r2 = r8.f17408H
            v.V r5 = r7.f9238r
            boolean r2 = kotlin.jvm.internal.m.a(r2, r5)
            if (r2 != 0) goto L27
            r8.f17408H = r5
            r1 = r3
        L27:
            boolean r2 = r8.f17410J
            boolean r5 = r7.f9239s
            if (r2 == r5) goto L3e
            if (r5 == 0) goto L33
            r8.x0(r0)
            goto L39
        L33:
            r8.y0(r0)
            r8.A0()
        L39:
            B0.AbstractC0041g.n(r8)
            r8.f17410J = r5
        L3e:
            I0.f r2 = r8.f17409I
            I0.f r5 = r7.f9240t
            boolean r2 = kotlin.jvm.internal.m.a(r2, r5)
            if (r2 != 0) goto L4d
            r8.f17409I = r5
            B0.AbstractC0041g.n(r8)
        L4d:
            B5.a r2 = r7.f9241u
            r8.f17411K = r2
            boolean r2 = r8.f17420T
            y.i r5 = r8.f17419S
            if (r5 != 0) goto L5d
            v.V r6 = r8.f17408H
            if (r6 == 0) goto L5d
            r6 = r3
            goto L5e
        L5d:
            r6 = r4
        L5e:
            if (r2 == r6) goto L70
            if (r5 != 0) goto L67
            v.V r2 = r8.f17408H
            if (r2 == 0) goto L67
            r4 = r3
        L67:
            r8.f17420T = r4
            if (r4 != 0) goto L70
            B0.m r2 = r8.f17414N
            if (r2 != 0) goto L70
            goto L71
        L70:
            r3 = r1
        L71:
            if (r3 == 0) goto L86
            B0.m r1 = r8.f17414N
            if (r1 != 0) goto L7b
            boolean r2 = r8.f17420T
            if (r2 != 0) goto L86
        L7b:
            if (r1 == 0) goto L80
            r8.y0(r1)
        L80:
            r1 = 0
            r8.f17414N = r1
            r8.B0()
        L86:
            y.i r8 = r8.f17407G
            r0.C0(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableElement.g(c0.l):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        i iVar = this.f9237q;
        int iHashCode = (iVar != null ? iVar.hashCode() : 0) * 31;
        V v6 = this.f9238r;
        int iE = k1.i.e((iHashCode + (v6 != null ? v6.hashCode() : 0)) * 31, 961, this.f9239s);
        f fVar = this.f9240t;
        return this.f9241u.hashCode() + ((iE + (fVar != null ? Integer.hashCode(fVar.f2230a) : 0)) * 31);
    }
}
