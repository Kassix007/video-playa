package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import d1.C0953d;
import d1.g;
import e1.C1022b;
import g1.r;
import g1.t;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends t {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final g f9380z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12833q = new int[32];
        this.f12839w = new HashMap();
        this.f12835s = context;
        super.g(attributeSet);
        g gVar = new g();
        gVar.f11951s0 = 0;
        gVar.f11952t0 = 0;
        gVar.f11953u0 = 0;
        gVar.f11954v0 = 0;
        gVar.f11955w0 = 0;
        gVar.f11956x0 = 0;
        gVar.f11957y0 = false;
        gVar.f11958z0 = 0;
        gVar.f11925A0 = 0;
        gVar.f11926B0 = new C1022b();
        gVar.f11927C0 = null;
        gVar.D0 = -1;
        gVar.f11928E0 = -1;
        gVar.f11929F0 = -1;
        gVar.f11930G0 = -1;
        gVar.f11931H0 = -1;
        gVar.f11932I0 = -1;
        gVar.f11933J0 = 0.5f;
        gVar.f11934K0 = 0.5f;
        gVar.f11935L0 = 0.5f;
        gVar.f11936M0 = 0.5f;
        gVar.f11937N0 = 0.5f;
        gVar.f11938O0 = 0.5f;
        gVar.f11939P0 = 0;
        gVar.f11940Q0 = 0;
        gVar.f11941R0 = 2;
        gVar.f11942S0 = 2;
        gVar.T0 = 0;
        gVar.f11943U0 = -1;
        gVar.f11944V0 = 0;
        gVar.f11945W0 = new ArrayList();
        gVar.f11946X0 = null;
        gVar.f11947Y0 = null;
        gVar.f11948Z0 = null;
        gVar.f11950b1 = 0;
        this.f9380z = gVar;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f13026b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f9380z.f11944V0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar2 = this.f9380z;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.f11951s0 = dimensionPixelSize;
                    gVar2.f11952t0 = dimensionPixelSize;
                    gVar2.f11953u0 = dimensionPixelSize;
                    gVar2.f11954v0 = dimensionPixelSize;
                } else if (index == 18) {
                    g gVar3 = this.f9380z;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar3.f11953u0 = dimensionPixelSize2;
                    gVar3.f11955w0 = dimensionPixelSize2;
                    gVar3.f11956x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f9380z.f11954v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f9380z.f11955w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f9380z.f11951s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f9380z.f11956x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f9380z.f11952t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f9380z.T0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f9380z.D0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f9380z.f11928E0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f9380z.f11929F0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f9380z.f11931H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f9380z.f11930G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f9380z.f11932I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f9380z.f11933J0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f9380z.f11935L0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f9380z.f11937N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f9380z.f11936M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f9380z.f11938O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f9380z.f11934K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f9380z.f11941R0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f9380z.f11942S0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f9380z.f11939P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f9380z.f11940Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f9380z.f11943U0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f12836t = this.f9380z;
        i();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g1.AbstractC1073c
    public final void h(C0953d c0953d, boolean z5) {
        g gVar = this.f9380z;
        int i = gVar.f11953u0;
        if (i > 0 || gVar.f11954v0 > 0) {
            if (z5) {
                gVar.f11955w0 = gVar.f11954v0;
                gVar.f11956x0 = i;
            } else {
                gVar.f11955w0 = i;
                gVar.f11956x0 = gVar.f11954v0;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r13v4, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r13v5, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r13v6, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:391:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x010f A[EDGE_INSN: B:430:0x010f->B:63:0x010f BREAK  A[LOOP:1: B:57:0x00f8->B:62:0x010a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0140  */
    @Override // g1.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(d1.g r39, int r40, int r41) {
        /*
            r38 = this;
            r2 = r39
            int r9 = android.view.View.MeasureSpec.getMode(r40)
            int r10 = android.view.View.MeasureSpec.getSize(r40)
            int r11 = android.view.View.MeasureSpec.getMode(r41)
            int r12 = android.view.View.MeasureSpec.getSize(r41)
            r13 = 0
            if (r2 == 0) goto L766
            int[] r14 = r2.f11878p0
            d1.c r15 = r2.f11833J
            d1.c r1 = r2.f11832I
            d1.c r3 = r2.f11834K
            d1.c r4 = r2.f11835L
            java.util.ArrayList r5 = r2.f11945W0
            int r6 = r2.f11966r0
            if (r6 <= 0) goto Lae
            e1.b r6 = r2.f11926B0
            d1.d r7 = r2.f11843T
            if (r7 == 0) goto L30
            d1.e r7 = (d1.e) r7
            g1.f r7 = r7.f11904u0
            goto L31
        L30:
            r7 = 0
        L31:
            if (r7 != 0) goto L3b
            r2.f11958z0 = r13
            r2.f11925A0 = r13
            r2.f11957y0 = r13
            goto L75c
        L3b:
            r8 = r13
        L3c:
            int r13 = r2.f11966r0
            if (r8 >= r13) goto Lae
            d1.d[] r13 = r2.f11965q0
            r13 = r13[r8]
            if (r13 != 0) goto L51
            r19 = r1
        L48:
            r20 = r3
            r21 = r4
            r22 = r5
            r23 = r8
            goto La3
        L51:
            r19 = r1
            boolean r1 = r13 instanceof d1.h
            if (r1 == 0) goto L58
            goto L48
        L58:
            r20 = r3
            r1 = 0
            int r3 = r13.j(r1)
            r21 = r4
            r1 = 1
            int r4 = r13.j(r1)
            r1 = 3
            r22 = r5
            if (r3 != r1) goto L79
            int r5 = r13.f11880r
            r23 = r8
            r8 = 1
            if (r5 == r8) goto L7b
            if (r4 != r1) goto L7b
            int r5 = r13.f11881s
            if (r5 == r8) goto L7b
            goto La3
        L79:
            r23 = r8
        L7b:
            if (r3 != r1) goto L7e
            r3 = 2
        L7e:
            if (r4 != r1) goto L81
            r4 = 2
        L81:
            r6.f12502a = r3
            r6.f12503b = r4
            int r1 = r13.q()
            r6.f12504c = r1
            int r1 = r13.k()
            r6.f12505d = r1
            r7.b(r13, r6)
            int r1 = r6.f12506e
            r13.O(r1)
            int r1 = r6.f
            r13.L(r1)
            int r1 = r6.f12507g
            r13.I(r1)
        La3:
            int r8 = r23 + 1
            r1 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            goto L3c
        Lae:
            r19 = r1
            r20 = r3
            r21 = r4
            r22 = r5
            int r13 = r2.f11955w0
            int r1 = r2.f11956x0
            int r3 = r2.f11951s0
            int r4 = r2.f11952t0
            r5 = 2
            int[] r6 = new int[r5]
            int r5 = r10 - r13
            int r5 = r5 - r1
            int r7 = r2.f11944V0
            r8 = 1
            if (r7 != r8) goto Lcc
            int r5 = r12 - r3
            int r5 = r5 - r4
        Lcc:
            r8 = r5
            r5 = -1
            if (r7 != 0) goto Le3
            int r7 = r2.D0
            if (r7 != r5) goto Lda
            r7 = 0
            r2.D0 = r7
        Ld7:
            r23 = r1
            goto Ldc
        Lda:
            r7 = 0
            goto Ld7
        Ldc:
            int r1 = r2.f11928E0
            if (r1 != r5) goto Lf2
            r2.f11928E0 = r7
            goto Lf2
        Le3:
            r23 = r1
            r7 = 0
            int r1 = r2.D0
            if (r1 != r5) goto Lec
            r2.D0 = r7
        Lec:
            int r1 = r2.f11928E0
            if (r1 != r5) goto Lf2
            r2.f11928E0 = r7
        Lf2:
            d1.d[] r1 = r2.f11965q0
            r24 = r1
            r5 = 0
            r7 = 0
        Lf8:
            int r1 = r2.f11966r0
            r25 = r3
            r3 = 8
            if (r5 >= r1) goto L10f
            d1.d[] r1 = r2.f11965q0
            r1 = r1[r5]
            int r1 = r1.f11862g0
            if (r1 != r3) goto L10a
            int r7 = r7 + 1
        L10a:
            int r5 = r5 + 1
            r3 = r25
            goto Lf8
        L10f:
            if (r7 <= 0) goto L135
            int r1 = r1 - r7
            d1.d[] r1 = new d1.C0953d[r1]
            r5 = 0
            r7 = 0
        L116:
            int r3 = r2.f11966r0
            if (r5 >= r3) goto L131
            d1.d[] r3 = r2.f11965q0
            r3 = r3[r5]
            r24 = r1
            int r1 = r3.f11862g0
            r27 = r3
            r3 = 8
            if (r1 == r3) goto L12c
            r24[r7] = r27
            int r7 = r7 + 1
        L12c:
            int r5 = r5 + 1
            r1 = r24
            goto L116
        L131:
            r24 = r1
            r3 = r7
            goto L138
        L135:
            r3 = r1
            r1 = r24
        L138:
            r2.f11949a1 = r1
            r2.f11950b1 = r3
            int r5 = r2.T0
            if (r5 == 0) goto L68f
            r7 = 1
            if (r5 == r7) goto L4ba
            r7 = 2
            if (r5 == r7) goto L372
            r7 = 3
            if (r5 == r7) goto L15a
            r35 = r4
            r36 = r6
            r37 = r12
            r17 = r13
            r22 = r23
            r34 = r25
        L155:
            r12 = 1
        L156:
            r18 = 0
            goto L717
        L15a:
            r5 = r3
            int r3 = r2.f11944V0
            if (r5 != 0) goto L16f
            r35 = r4
            r36 = r6
            r37 = r12
            r17 = r13
            r22 = r23
            r34 = r25
            r40 = 1
            goto L36e
        L16f:
            r22.clear()
            r24 = r1
            d1.f r1 = new d1.f
            r16 = r4
            d1.c r4 = r2.f11832I
            r26 = r5
            d1.c r5 = r2.f11833J
            r27 = r6
            d1.c r6 = r2.f11834K
            r28 = r7
            d1.c r7 = r2.f11835L
            r17 = r13
            r35 = r16
            r13 = r22
            r22 = r23
            r34 = r25
            r36 = r27
            r0 = r28
            r40 = 1
            r23 = r14
            r14 = r24
            r24 = r15
            r15 = r26
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r13.add(r1)
            if (r3 != 0) goto L21e
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
        L1aa:
            if (r4 >= r15) goto L21a
            int r5 = r5 + 1
            r0 = r14[r4]
            int r16 = r2.U(r0, r8)
            r26 = r3
            int[] r3 = r0.f11878p0
            r18 = 0
            r3 = r3[r18]
            r27 = r4
            r4 = 3
            if (r3 != r4) goto L1c3
            int r6 = r6 + 1
        L1c3:
            r28 = r6
            if (r7 == r8) goto L1ce
            int r3 = r2.f11939P0
            int r3 = r3 + r7
            int r3 = r3 + r16
            if (r3 <= r8) goto L1d5
        L1ce:
            d1.d r3 = r1.f11911b
            if (r3 == 0) goto L1d5
            r3 = r40
            goto L1d6
        L1d5:
            r3 = 0
        L1d6:
            if (r3 != 0) goto L1e2
            if (r27 <= 0) goto L1e2
            int r4 = r2.f11943U0
            if (r4 <= 0) goto L1e2
            if (r5 <= r4) goto L1e2
            r3 = r40
        L1e2:
            if (r3 == 0) goto L201
            d1.f r1 = new d1.f
            d1.c r4 = r2.f11832I
            d1.c r5 = r2.f11833J
            d1.c r6 = r2.f11834K
            d1.c r7 = r2.f11835L
            r37 = r12
            r3 = r26
            r12 = r27
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r1.f11920n = r12
            r13.add(r1)
            r5 = r40
        L1fe:
            r7 = r16
            goto L20f
        L201:
            r37 = r12
            r3 = r26
            r12 = r27
            if (r12 <= 0) goto L1fe
            int r4 = r2.f11939P0
            int r4 = r4 + r16
            int r4 = r4 + r7
            r7 = r4
        L20f:
            r1.a(r0)
            int r4 = r12 + 1
            r6 = r28
            r12 = r37
            r0 = 3
            goto L1aa
        L21a:
            r37 = r12
            goto L286
        L21e:
            r37 = r12
            r0 = 0
            r4 = 0
            r5 = 0
            r6 = 0
        L224:
            if (r0 >= r15) goto L285
            int r4 = r4 + 1
            r12 = r14[r0]
            int r16 = r2.T(r12, r8)
            int[] r7 = r12.f11878p0
            r7 = r7[r40]
            r26 = r3
            r3 = 3
            if (r7 != r3) goto L239
            int r5 = r5 + 1
        L239:
            r27 = r5
            if (r6 == r8) goto L244
            int r3 = r2.f11940Q0
            int r3 = r3 + r6
            int r3 = r3 + r16
            if (r3 <= r8) goto L24b
        L244:
            d1.d r3 = r1.f11911b
            if (r3 == 0) goto L24b
            r3 = r40
            goto L24c
        L24b:
            r3 = 0
        L24c:
            if (r3 != 0) goto L258
            if (r0 <= 0) goto L258
            int r5 = r2.f11943U0
            if (r5 <= 0) goto L258
            if (r4 <= r5) goto L258
            r3 = r40
        L258:
            if (r3 == 0) goto L273
            d1.f r1 = new d1.f
            d1.c r4 = r2.f11832I
            d1.c r5 = r2.f11833J
            d1.c r6 = r2.f11834K
            d1.c r7 = r2.f11835L
            r3 = r26
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r1.f11920n = r0
            r13.add(r1)
            r4 = r40
        L270:
            r6 = r16
            goto L27d
        L273:
            r3 = r26
            if (r0 <= 0) goto L270
            int r5 = r2.f11940Q0
            int r5 = r5 + r16
            int r5 = r5 + r6
            r6 = r5
        L27d:
            r1.a(r12)
            int r0 = r0 + 1
            r5 = r27
            goto L224
        L285:
            r6 = r5
        L286:
            int r0 = r13.size()
            int r1 = r2.f11955w0
            int r4 = r2.f11951s0
            int r5 = r2.f11956x0
            int r7 = r2.f11952t0
            r18 = 0
            r12 = r23[r18]
            r14 = 2
            if (r12 == r14) goto L2a0
            r12 = r23[r40]
            if (r12 != r14) goto L29e
            goto L2a0
        L29e:
            r12 = 0
            goto L2a2
        L2a0:
            r12 = r40
        L2a2:
            if (r6 <= 0) goto L2c7
            if (r12 == 0) goto L2c7
            r6 = 0
        L2a7:
            if (r6 >= r0) goto L2c7
            java.lang.Object r12 = r13.get(r6)
            d1.f r12 = (d1.f) r12
            if (r3 != 0) goto L2bb
            int r14 = r12.d()
            int r14 = r8 - r14
            r12.e(r14)
            goto L2c4
        L2bb:
            int r14 = r12.c()
            int r14 = r8 - r14
            r12.e(r14)
        L2c4:
            int r6 = r6 + 1
            goto L2a7
        L2c7:
            r29 = r1
            r30 = r4
            r31 = r5
            r32 = r7
            r25 = r19
            r27 = r20
            r28 = r21
            r26 = r24
            r1 = 0
            r4 = 0
            r5 = 0
        L2da:
            if (r1 >= r0) goto L368
            java.lang.Object r6 = r13.get(r1)
            d1.f r6 = (d1.f) r6
            if (r3 != 0) goto L324
            int r7 = r0 + (-1)
            if (r1 >= r7) goto L2f9
            int r7 = r1 + 1
            java.lang.Object r7 = r13.get(r7)
            d1.f r7 = (d1.f) r7
            d1.d r7 = r7.f11911b
            d1.c r7 = r7.f11833J
            r28 = r7
            r32 = 0
            goto L2ff
        L2f9:
            int r7 = r2.f11952t0
            r32 = r7
            r28 = r21
        L2ff:
            d1.d r7 = r6.f11911b
            d1.c r7 = r7.f11835L
            r24 = r3
            r23 = r6
            r33 = r8
            r23.f(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            int r12 = r6.d()
            int r4 = java.lang.Math.max(r4, r12)
            int r6 = r6.c()
            int r6 = r6 + r5
            if (r1 <= 0) goto L31e
            int r5 = r2.f11940Q0
            int r6 = r6 + r5
        L31e:
            r5 = r6
            r26 = r7
            r30 = 0
            goto L364
        L324:
            int r7 = r0 + (-1)
            if (r1 >= r7) goto L339
            int r7 = r1 + 1
            java.lang.Object r7 = r13.get(r7)
            d1.f r7 = (d1.f) r7
            d1.d r7 = r7.f11911b
            d1.c r7 = r7.f11832I
            r27 = r7
            r31 = 0
            goto L33f
        L339:
            int r7 = r2.f11956x0
            r31 = r7
            r27 = r20
        L33f:
            d1.d r7 = r6.f11911b
            d1.c r7 = r7.f11834K
            r24 = r3
            r23 = r6
            r33 = r8
            r23.f(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            int r6 = r23.d()
            int r6 = r6 + r4
            int r4 = r23.c()
            int r4 = java.lang.Math.max(r5, r4)
            if (r1 <= 0) goto L35e
            int r5 = r2.f11939P0
            int r6 = r6 + r5
        L35e:
            r5 = r4
            r4 = r6
            r25 = r7
            r29 = 0
        L364:
            int r1 = r1 + 1
            goto L2da
        L368:
            r18 = 0
            r36[r18] = r4
            r36[r40] = r5
        L36e:
            r12 = r40
            goto L156
        L372:
            r14 = r1
            r15 = r3
            r35 = r4
            r36 = r6
            r37 = r12
            r17 = r13
            r22 = r23
            r34 = r25
            r40 = 1
            int r0 = r2.f11944V0
            if (r0 != 0) goto L3ab
            int r1 = r2.f11943U0
            if (r1 > 0) goto L3a9
            r1 = 0
            r3 = 0
            r4 = 0
        L38d:
            if (r1 >= r15) goto L3a7
            if (r1 <= 0) goto L394
            int r5 = r2.f11939P0
            int r3 = r3 + r5
        L394:
            r5 = r14[r1]
            if (r5 != 0) goto L399
            goto L3a4
        L399:
            int r5 = r2.U(r5, r8)
            int r5 = r5 + r3
            if (r5 <= r8) goto L3a1
            goto L3a7
        L3a1:
            int r4 = r4 + 1
            r3 = r5
        L3a4:
            int r1 = r1 + 1
            goto L38d
        L3a7:
            r1 = 0
            goto L3ce
        L3a9:
            r4 = r1
            goto L3a7
        L3ab:
            int r1 = r2.f11943U0
            if (r1 > 0) goto L3cd
            r1 = 0
            r3 = 0
            r4 = 0
        L3b2:
            if (r1 >= r15) goto L3cc
            if (r1 <= 0) goto L3b9
            int r5 = r2.f11940Q0
            int r3 = r3 + r5
        L3b9:
            r5 = r14[r1]
            if (r5 != 0) goto L3be
            goto L3c9
        L3be:
            int r5 = r2.T(r5, r8)
            int r5 = r5 + r3
            if (r5 <= r8) goto L3c6
            goto L3cc
        L3c6:
            int r4 = r4 + 1
            r3 = r5
        L3c9:
            int r1 = r1 + 1
            goto L3b2
        L3cc:
            r1 = r4
        L3cd:
            r4 = 0
        L3ce:
            int[] r3 = r2.f11948Z0
            if (r3 != 0) goto L3d7
            r5 = 2
            int[] r3 = new int[r5]
            r2.f11948Z0 = r3
        L3d7:
            if (r1 != 0) goto L3dd
            r7 = r40
            if (r0 == r7) goto L3e1
        L3dd:
            if (r4 != 0) goto L3e3
            if (r0 != 0) goto L3e3
        L3e1:
            r3 = 1
            goto L3e4
        L3e3:
            r3 = 0
        L3e4:
            if (r3 != 0) goto L4af
            if (r0 != 0) goto L3f2
            float r1 = (float) r15
            float r5 = (float) r4
            float r1 = r1 / r5
            double r5 = (double) r1
            double r5 = java.lang.Math.ceil(r5)
            int r1 = (int) r5
            goto L3fb
        L3f2:
            float r4 = (float) r15
            float r5 = (float) r1
            float r4 = r4 / r5
            double r4 = (double) r4
            double r4 = java.lang.Math.ceil(r4)
            int r4 = (int) r4
        L3fb:
            d1.d[] r5 = r2.f11947Y0
            if (r5 == 0) goto L402
            int r6 = r5.length
            if (r6 >= r4) goto L404
        L402:
            r6 = 0
            goto L409
        L404:
            r6 = 0
            java.util.Arrays.fill(r5, r6)
            goto L40d
        L409:
            d1.d[] r5 = new d1.C0953d[r4]
            r2.f11947Y0 = r5
        L40d:
            d1.d[] r5 = r2.f11946X0
            if (r5 == 0) goto L419
            int r7 = r5.length
            if (r7 >= r1) goto L415
            goto L419
        L415:
            java.util.Arrays.fill(r5, r6)
            goto L41d
        L419:
            d1.d[] r5 = new d1.C0953d[r1]
            r2.f11946X0 = r5
        L41d:
            r5 = 0
        L41e:
            if (r5 >= r4) goto L463
            r6 = 0
        L421:
            if (r6 >= r1) goto L460
            int r7 = r6 * r4
            int r7 = r7 + r5
            r12 = 1
            if (r0 != r12) goto L42c
            int r7 = r5 * r1
            int r7 = r7 + r6
        L42c:
            int r12 = r14.length
            if (r7 < r12) goto L430
            goto L45d
        L430:
            r7 = r14[r7]
            if (r7 != 0) goto L435
            goto L45d
        L435:
            int r12 = r2.U(r7, r8)
            d1.d[] r13 = r2.f11947Y0
            r13 = r13[r5]
            if (r13 == 0) goto L445
            int r13 = r13.q()
            if (r13 >= r12) goto L449
        L445:
            d1.d[] r12 = r2.f11947Y0
            r12[r5] = r7
        L449:
            int r12 = r2.T(r7, r8)
            d1.d[] r13 = r2.f11946X0
            r13 = r13[r6]
            if (r13 == 0) goto L459
            int r13 = r13.k()
            if (r13 >= r12) goto L45d
        L459:
            d1.d[] r12 = r2.f11946X0
            r12[r6] = r7
        L45d:
            int r6 = r6 + 1
            goto L421
        L460:
            int r5 = r5 + 1
            goto L41e
        L463:
            r5 = 0
            r6 = 0
        L465:
            if (r5 >= r4) goto L47b
            d1.d[] r7 = r2.f11947Y0
            r7 = r7[r5]
            if (r7 == 0) goto L478
            if (r5 <= 0) goto L472
            int r12 = r2.f11939P0
            int r6 = r6 + r12
        L472:
            int r7 = r2.U(r7, r8)
            int r7 = r7 + r6
            r6 = r7
        L478:
            int r5 = r5 + 1
            goto L465
        L47b:
            r5 = 0
            r7 = 0
        L47d:
            if (r5 >= r1) goto L493
            d1.d[] r12 = r2.f11946X0
            r12 = r12[r5]
            if (r12 == 0) goto L490
            if (r5 <= 0) goto L48a
            int r13 = r2.f11940Q0
            int r7 = r7 + r13
        L48a:
            int r12 = r2.T(r12, r8)
            int r12 = r12 + r7
            r7 = r12
        L490:
            int r5 = r5 + 1
            goto L47d
        L493:
            r18 = 0
            r36[r18] = r6
            r12 = 1
            r36[r12] = r7
            if (r0 != 0) goto L4a7
            if (r6 <= r8) goto L4a4
            if (r4 <= r12) goto L4a4
            int r4 = r4 + (-1)
            goto L3e4
        L4a4:
            r3 = r12
            goto L3e4
        L4a7:
            if (r7 <= r8) goto L4a4
            if (r1 <= r12) goto L4a4
            int r1 = r1 + (-1)
            goto L3e4
        L4af:
            r12 = 1
            int[] r0 = r2.f11948Z0
            r18 = 0
            r0[r18] = r4
            r0[r12] = r1
            goto L156
        L4ba:
            r35 = r4
            r36 = r6
            r37 = r12
            r17 = r13
            r24 = r15
            r13 = r22
            r22 = r23
            r34 = r25
            r15 = r3
            r23 = r14
            r14 = r1
            int r3 = r2.f11944V0
            if (r15 != 0) goto L4d4
            goto L155
        L4d4:
            r13.clear()
            d1.f r1 = new d1.f
            d1.c r4 = r2.f11832I
            d1.c r5 = r2.f11833J
            d1.c r6 = r2.f11834K
            d1.c r7 = r2.f11835L
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r13.add(r1)
            if (r3 != 0) goto L545
            r0 = 0
            r4 = 0
            r5 = 0
        L4ec:
            if (r0 >= r15) goto L5a4
            r12 = r14[r0]
            int r16 = r2.U(r12, r8)
            int[] r6 = r12.f11878p0
            r18 = 0
            r6 = r6[r18]
            r7 = 3
            if (r6 != r7) goto L4ff
            int r4 = r4 + 1
        L4ff:
            r26 = r4
            if (r5 == r8) goto L50a
            int r4 = r2.f11939P0
            int r4 = r4 + r5
            int r4 = r4 + r16
            if (r4 <= r8) goto L510
        L50a:
            d1.d r4 = r1.f11911b
            if (r4 == 0) goto L510
            r4 = 1
            goto L511
        L510:
            r4 = 0
        L511:
            if (r4 != 0) goto L51e
            if (r0 <= 0) goto L51e
            int r6 = r2.f11943U0
            if (r6 <= 0) goto L51e
            int r6 = r0 % r6
            if (r6 != 0) goto L51e
            r4 = 1
        L51e:
            if (r4 == 0) goto L535
            d1.f r1 = new d1.f
            d1.c r4 = r2.f11832I
            d1.c r5 = r2.f11833J
            d1.c r6 = r2.f11834K
            d1.c r7 = r2.f11835L
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r1.f11920n = r0
            r13.add(r1)
        L532:
            r5 = r16
            goto L53d
        L535:
            if (r0 <= 0) goto L532
            int r4 = r2.f11939P0
            int r4 = r4 + r16
            int r4 = r4 + r5
            r5 = r4
        L53d:
            r1.a(r12)
            int r0 = r0 + 1
            r4 = r26
            goto L4ec
        L545:
            r0 = 0
            r4 = 0
            r5 = 0
        L548:
            if (r0 >= r15) goto L5a4
            r12 = r14[r0]
            int r16 = r2.T(r12, r8)
            int[] r6 = r12.f11878p0
            r7 = 1
            r6 = r6[r7]
            r7 = 3
            if (r6 != r7) goto L55a
            int r4 = r4 + 1
        L55a:
            r26 = r4
            if (r5 == r8) goto L565
            int r4 = r2.f11940Q0
            int r4 = r4 + r5
            int r4 = r4 + r16
            if (r4 <= r8) goto L56b
        L565:
            d1.d r4 = r1.f11911b
            if (r4 == 0) goto L56b
            r4 = 1
            goto L56c
        L56b:
            r4 = 0
        L56c:
            if (r4 != 0) goto L579
            if (r0 <= 0) goto L579
            int r6 = r2.f11943U0
            if (r6 <= 0) goto L579
            int r6 = r0 % r6
            if (r6 != 0) goto L579
            r4 = 1
        L579:
            if (r4 == 0) goto L592
            d1.f r1 = new d1.f
            d1.c r4 = r2.f11832I
            d1.c r5 = r2.f11833J
            d1.c r6 = r2.f11834K
            r28 = r7
            d1.c r7 = r2.f11835L
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r1.f11920n = r0
            r13.add(r1)
        L58f:
            r5 = r16
            goto L59c
        L592:
            r28 = r7
            if (r0 <= 0) goto L58f
            int r4 = r2.f11940Q0
            int r4 = r4 + r16
            int r4 = r4 + r5
            r5 = r4
        L59c:
            r1.a(r12)
            int r0 = r0 + 1
            r4 = r26
            goto L548
        L5a4:
            int r0 = r13.size()
            int r1 = r2.f11955w0
            int r5 = r2.f11951s0
            int r6 = r2.f11956x0
            int r7 = r2.f11952t0
            r18 = 0
            r12 = r23[r18]
            r14 = 2
            if (r12 == r14) goto L5bf
            r12 = 1
            r15 = r23[r12]
            if (r15 != r14) goto L5bd
            goto L5bf
        L5bd:
            r12 = 0
            goto L5c0
        L5bf:
            r12 = 1
        L5c0:
            if (r4 <= 0) goto L5e5
            if (r12 == 0) goto L5e5
            r4 = 0
        L5c5:
            if (r4 >= r0) goto L5e5
            java.lang.Object r12 = r13.get(r4)
            d1.f r12 = (d1.f) r12
            if (r3 != 0) goto L5d9
            int r14 = r12.d()
            int r14 = r8 - r14
            r12.e(r14)
            goto L5e2
        L5d9:
            int r14 = r12.c()
            int r14 = r8 - r14
            r12.e(r14)
        L5e2:
            int r4 = r4 + 1
            goto L5c5
        L5e5:
            r29 = r1
            r30 = r5
            r31 = r6
            r32 = r7
            r25 = r19
            r27 = r20
            r28 = r21
            r26 = r24
            r1 = 0
            r4 = 0
            r5 = 0
        L5f8:
            if (r1 >= r0) goto L686
            java.lang.Object r6 = r13.get(r1)
            d1.f r6 = (d1.f) r6
            if (r3 != 0) goto L642
            int r7 = r0 + (-1)
            if (r1 >= r7) goto L617
            int r7 = r1 + 1
            java.lang.Object r7 = r13.get(r7)
            d1.f r7 = (d1.f) r7
            d1.d r7 = r7.f11911b
            d1.c r7 = r7.f11833J
            r28 = r7
            r32 = 0
            goto L61d
        L617:
            int r7 = r2.f11952t0
            r32 = r7
            r28 = r21
        L61d:
            d1.d r7 = r6.f11911b
            d1.c r7 = r7.f11835L
            r24 = r3
            r23 = r6
            r33 = r8
            r23.f(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            int r12 = r6.d()
            int r4 = java.lang.Math.max(r4, r12)
            int r6 = r6.c()
            int r6 = r6 + r5
            if (r1 <= 0) goto L63c
            int r5 = r2.f11940Q0
            int r6 = r6 + r5
        L63c:
            r5 = r6
            r26 = r7
            r30 = 0
            goto L682
        L642:
            int r7 = r0 + (-1)
            if (r1 >= r7) goto L657
            int r7 = r1 + 1
            java.lang.Object r7 = r13.get(r7)
            d1.f r7 = (d1.f) r7
            d1.d r7 = r7.f11911b
            d1.c r7 = r7.f11832I
            r27 = r7
            r31 = 0
            goto L65d
        L657:
            int r7 = r2.f11956x0
            r31 = r7
            r27 = r20
        L65d:
            d1.d r7 = r6.f11911b
            d1.c r7 = r7.f11834K
            r24 = r3
            r23 = r6
            r33 = r8
            r23.f(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            int r6 = r23.d()
            int r6 = r6 + r4
            int r4 = r23.c()
            int r4 = java.lang.Math.max(r5, r4)
            if (r1 <= 0) goto L67c
            int r5 = r2.f11939P0
            int r6 = r6 + r5
        L67c:
            r5 = r4
            r4 = r6
            r25 = r7
            r29 = 0
        L682:
            int r1 = r1 + 1
            goto L5f8
        L686:
            r18 = 0
            r36[r18] = r4
            r12 = 1
            r36[r12] = r5
            goto L155
        L68f:
            r14 = r1
            r15 = r3
            r35 = r4
            r36 = r6
            r37 = r12
            r17 = r13
            r13 = r22
            r22 = r23
            r34 = r25
            int r3 = r2.f11944V0
            if (r15 != 0) goto L6a5
            goto L155
        L6a5:
            int r0 = r13.size()
            if (r0 != 0) goto L6bc
            d1.f r1 = new d1.f
            d1.c r4 = r2.f11832I
            d1.c r5 = r2.f11833J
            d1.c r6 = r2.f11834K
            d1.c r7 = r2.f11835L
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r13.add(r1)
            goto L6fd
        L6bc:
            r1 = 0
            java.lang.Object r0 = r13.get(r1)
            d1.f r0 = (d1.f) r0
            r0.f11912c = r1
            r6 = 0
            r0.f11911b = r6
            r0.f11918l = r1
            r0.f11919m = r1
            r0.f11920n = r1
            r0.f11921o = r1
            r0.f11922p = r1
            d1.c r1 = r2.f11832I
            d1.c r4 = r2.f11833J
            d1.c r5 = r2.f11834K
            d1.c r6 = r2.f11835L
            int r7 = r2.f11955w0
            int r12 = r2.f11951s0
            int r13 = r2.f11956x0
            r23 = r0
            int r0 = r2.f11952t0
            r32 = r0
            r25 = r1
            r24 = r3
            r26 = r4
            r27 = r5
            r28 = r6
            r29 = r7
            r33 = r8
            r30 = r12
            r31 = r13
            r23.f(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r1 = r23
        L6fd:
            r0 = 0
        L6fe:
            if (r0 >= r15) goto L708
            r3 = r14[r0]
            r1.a(r3)
            int r0 = r0 + 1
            goto L6fe
        L708:
            int r0 = r1.d()
            r18 = 0
            r36[r18] = r0
            int r0 = r1.c()
            r12 = 1
            r36[r12] = r0
        L717:
            r0 = r36[r18]
            int r0 = r0 + r17
            int r0 = r0 + r22
            r1 = r36[r12]
            int r1 = r1 + r34
            int r1 = r1 + r35
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r9 != r4) goto L72a
            goto L736
        L72a:
            if (r9 != r3) goto L731
            int r10 = java.lang.Math.min(r0, r10)
            goto L736
        L731:
            if (r9 != 0) goto L735
            r10 = r0
            goto L736
        L735:
            r10 = 0
        L736:
            if (r11 != r4) goto L73b
            r0 = r37
            goto L749
        L73b:
            if (r11 != r3) goto L744
            r0 = r37
            int r0 = java.lang.Math.min(r1, r0)
            goto L749
        L744:
            if (r11 != 0) goto L748
            r0 = r1
            goto L749
        L748:
            r0 = 0
        L749:
            r2.f11958z0 = r10
            r2.f11925A0 = r0
            r2.O(r10)
            r2.L(r0)
            int r0 = r2.f11966r0
            if (r0 <= 0) goto L759
            r13 = r12
            goto L75a
        L759:
            r13 = 0
        L75a:
            r2.f11957y0 = r13
        L75c:
            int r0 = r2.f11958z0
            int r1 = r2.f11925A0
            r2 = r38
            r2.setMeasuredDimension(r0, r1)
            return
        L766:
            r2 = r38
            r1 = r13
            r2.setMeasuredDimension(r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.j(d1.g, int, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g1.AbstractC1073c, android.view.View
    public final void onMeasure(int i, int i7) {
        j(this.f9380z, i, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setFirstHorizontalBias(float f) {
        this.f9380z.f11935L0 = f;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setFirstHorizontalStyle(int i) {
        this.f9380z.f11929F0 = i;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setFirstVerticalBias(float f) {
        this.f9380z.f11936M0 = f;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setFirstVerticalStyle(int i) {
        this.f9380z.f11930G0 = i;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setHorizontalAlign(int i) {
        this.f9380z.f11941R0 = i;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setHorizontalBias(float f) {
        this.f9380z.f11933J0 = f;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setHorizontalGap(int i) {
        this.f9380z.f11939P0 = i;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setHorizontalStyle(int i) {
        this.f9380z.D0 = i;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setLastHorizontalBias(float f) {
        this.f9380z.f11937N0 = f;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setLastHorizontalStyle(int i) {
        this.f9380z.f11931H0 = i;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setLastVerticalBias(float f) {
        this.f9380z.f11938O0 = f;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setLastVerticalStyle(int i) {
        this.f9380z.f11932I0 = i;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setMaxElementsWrap(int i) {
        this.f9380z.f11943U0 = i;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setOrientation(int i) {
        this.f9380z.f11944V0 = i;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setPadding(int i) {
        g gVar = this.f9380z;
        gVar.f11951s0 = i;
        gVar.f11952t0 = i;
        gVar.f11953u0 = i;
        gVar.f11954v0 = i;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setPaddingBottom(int i) {
        this.f9380z.f11952t0 = i;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setPaddingLeft(int i) {
        this.f9380z.f11955w0 = i;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setPaddingRight(int i) {
        this.f9380z.f11956x0 = i;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setPaddingTop(int i) {
        this.f9380z.f11951s0 = i;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setVerticalAlign(int i) {
        this.f9380z.f11942S0 = i;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setVerticalBias(float f) {
        this.f9380z.f11934K0 = f;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setVerticalGap(int i) {
        this.f9380z.f11940Q0 = i;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setVerticalStyle(int i) {
        this.f9380z.f11928E0 = i;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setWrapMode(int i) {
        this.f9380z.T0 = i;
        requestLayout();
    }
}
