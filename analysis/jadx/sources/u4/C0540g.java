package U4;

import M5.InterfaceC0261w;
import R4.C0468k1;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: renamed from: U4.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0540g extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0468k1 f7820q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ P.W f7821r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ P.W f7822s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0540g(C0468k1 c0468k1, P.W w3, P.W w6, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f7820q = c0468k1;
        this.f7821r = w3;
        this.f7822s = w6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C0540g(this.f7820q, this.f7821r, this.f7822s, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        C0540g c0540g = (C0540g) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        c0540g.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e8  */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            c0.e r0 = c0.C0714b.f10084y
            m5.AbstractC1362a.e(r9)
            R4.k1 r9 = r8.f7820q
            R4.i r1 = r9.f7073d
            if (r1 == 0) goto L18
            R4.G r1 = r1.f7007m
            if (r1 == 0) goto L18
            java.lang.Boolean r1 = r1.f6758a
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.m.a(r1, r2)
            goto L19
        L18:
            r1 = 0
        L19:
            if (r1 == 0) goto Lf2
            R4.i r1 = r9.f7073d
            r2 = 0
            if (r1 == 0) goto L23
            R4.G r3 = r1.f7007m
            goto L24
        L23:
            r3 = r2
        L24:
            if (r3 == 0) goto Lf2
            if (r1 == 0) goto L2f
            R4.G r3 = r1.f7007m
            if (r3 == 0) goto L2f
            R4.D r3 = r3.f6759b
            goto L30
        L2f:
            r3 = r2
        L30:
            if (r3 == 0) goto Lf2
            if (r1 == 0) goto L3f
            R4.G r1 = r1.f7007m
            if (r1 == 0) goto L3f
            R4.D r1 = r1.f6759b
            if (r1 == 0) goto L3f
            java.lang.String r1 = r1.f6741a
            goto L40
        L3f:
            r1 = r2
        L40:
            java.lang.String r3 = "None"
            boolean r1 = kotlin.jvm.internal.m.a(r1, r3)
            if (r1 != 0) goto Lf2
            R4.i r1 = r9.f7073d
            if (r1 == 0) goto L57
            R4.G r3 = r1.f7007m
            if (r3 == 0) goto L57
            R4.D r3 = r3.f6759b
            if (r3 == 0) goto L57
            java.lang.String r3 = r3.f6742b
            goto L58
        L57:
            r3 = r2
        L58:
            if (r3 == 0) goto Lf2
            if (r1 == 0) goto L67
            R4.G r1 = r1.f7007m
            if (r1 == 0) goto L67
            R4.D r1 = r1.f6759b
            if (r1 == 0) goto L67
            java.lang.String r1 = r1.f6742b
            goto L68
        L67:
            r1 = r2
        L68:
            java.lang.String r3 = ""
            boolean r1 = kotlin.jvm.internal.m.a(r1, r3)
            if (r1 != 0) goto Lf2
            k5.b r1 = r9.f7086l
            P.W r3 = r8.f7821r
            if (r1 == 0) goto L8b
            androidx.lifecycle.J r1 = r1.f14129c
            if (r1 == 0) goto L8b
            com.web2native.MainActivity r4 = r9.f7069b
            U4.f r5 = new U4.f
            r6 = 0
            r5.<init>(r9, r3, r6)
            R4.J0 r6 = new R4.J0
            r7 = 1
            r6.<init>(r5, r7)
            r1.e(r4, r6)
        L8b:
            R4.i r9 = r9.f7073d
            if (r9 == 0) goto L99
            R4.G r9 = r9.f7007m
            if (r9 == 0) goto L99
            R4.D r9 = r9.f6759b
            if (r9 == 0) goto L99
            java.lang.String r2 = r9.f6741a
        L99:
            if (r2 == 0) goto Le8
            int r9 = r2.hashCode()
            switch(r9) {
                case -960744398: goto Ldc;
                case -821402994: goto Ld0;
                case 287355729: goto Lc4;
                case 888494873: goto Lb8;
                case 926500839: goto Laf;
                case 999535836: goto La3;
                default: goto La2;
            }
        La2:
            goto Le8
        La3:
            java.lang.String r9 = "Bottom Left"
            boolean r9 = r2.equals(r9)
            if (r9 != 0) goto Lac
            goto Le8
        Lac:
            c0.e r0 = c0.C0714b.f10082w
            goto Led
        Laf:
            java.lang.String r9 = "Bottom Right"
            boolean r9 = r2.equals(r9)
            if (r9 != 0) goto Led
            goto Le8
        Lb8:
            java.lang.String r9 = "Right Center"
            boolean r9 = r2.equals(r9)
            if (r9 != 0) goto Lc1
            goto Le8
        Lc1:
            c0.e r0 = c0.C0714b.f10081v
            goto Led
        Lc4:
            java.lang.String r9 = "Top Right"
            boolean r9 = r2.equals(r9)
            if (r9 != 0) goto Lcd
            goto Le8
        Lcd:
            c0.e r0 = c0.C0714b.f10078s
            goto Led
        Ld0:
            java.lang.String r9 = "Left Center"
            boolean r9 = r2.equals(r9)
            if (r9 != 0) goto Ld9
            goto Le8
        Ld9:
            c0.e r0 = c0.C0714b.f10079t
            goto Led
        Ldc:
            java.lang.String r9 = "Top Left"
            boolean r9 = r2.equals(r9)
            if (r9 != 0) goto Le5
            goto Le8
        Le5:
            c0.e r0 = c0.C0714b.f10076q
            goto Led
        Le8:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r3.setValue(r9)
        Led:
            P.W r9 = r8.f7822s
            r9.setValue(r0)
        Lf2:
            m5.y r9 = m5.C1386y.f15098a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.C0540g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
