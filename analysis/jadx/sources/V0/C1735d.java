package v0;

import B0.AbstractC0041g;
import B0.AbstractC0049n;
import B0.n0;
import B0.y0;
import c0.AbstractC0724l;
import com.google.android.gms.internal.measurement.O1;
import java.util.Collection;
import r.C1544C;
import r.C1566q;

/* JADX INFO: renamed from: v0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1735d extends C1736e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC0724l f17444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final U.l f17445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1566q f17446e;
    public n0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C1737f f17447g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17448h;
    public boolean i;
    public boolean j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1735d(AbstractC0724l abstractC0724l) {
        this.f17444c = abstractC0724l;
        U.l lVar = new U.l();
        lVar.f7511r = new long[2];
        this.f17445d = lVar;
        this.f17446e = new C1566q(2);
        this.i = true;
        this.j = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:162:0x005a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:165:0x0015 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:167:0x0015 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:170:0x0054 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:23:0x004b */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:71:0x01a9 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02df  */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r5v1, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r5v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [R.e] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [R.e] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // v0.C1736e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(r.C1566q r52, z0.InterfaceC1953m r53, com.google.android.gms.internal.measurement.O1 r54, boolean r55) {
        /*
            r51 = this;
            r0 = r51
            r1 = r52
            r2 = r53
            r3 = r54
            boolean r4 = super.a(r52, r53, r54, r55)
            c0.l r5 = r0.f17444c
            boolean r6 = r5.f10099D
            r7 = 1
            if (r6 != 0) goto L14
            goto L63
        L14:
            r8 = 0
        L15:
            if (r5 == 0) goto L5f
            boolean r10 = r5 instanceof B0.y0
            r11 = 16
            if (r10 == 0) goto L26
            B0.y0 r5 = (B0.y0) r5
            B0.n0 r5 = B0.AbstractC0041g.s(r5, r11)
            r0.f = r5
            goto L5a
        L26:
            int r10 = r5.f10102s
            r10 = r10 & r11
            if (r10 == 0) goto L5a
            boolean r10 = r5 instanceof B0.AbstractC0049n
            if (r10 == 0) goto L5a
            r10 = r5
            B0.n r10 = (B0.AbstractC0049n) r10
            c0.l r10 = r10.f473F
            r9 = 0
        L35:
            if (r10 == 0) goto L57
            int r12 = r10.f10102s
            r12 = r12 & r11
            if (r12 == 0) goto L54
            int r9 = r9 + 1
            if (r9 != r7) goto L42
            r5 = r10
            goto L54
        L42:
            if (r8 != 0) goto L4b
            R.e r8 = new R.e
            c0.l[] r12 = new c0.AbstractC0724l[r11]
            r8.<init>(r12)
        L4b:
            if (r5 == 0) goto L51
            r8.c(r5)
            r5 = 0
        L51:
            r8.c(r10)
        L54:
            c0.l r10 = r10.f10105v
            goto L35
        L57:
            if (r9 != r7) goto L5a
            goto L15
        L5a:
            c0.l r5 = B0.AbstractC0041g.f(r8)
            goto L15
        L5f:
            B0.n0 r5 = r0.f
            if (r5 != 0) goto L64
        L63:
            return r7
        L64:
            int r5 = r1.g()
            r8 = 0
        L69:
            r.q r10 = r0.f17446e
            U.l r11 = r0.f17445d
            if (r8 >= r5) goto L191
            long r12 = r1.d(r8)
            java.lang.Object r14 = r1.h(r8)
            v0.l r14 = (v0.C1743l) r14
            boolean r11 = r11.e(r12)
            if (r11 == 0) goto L17f
            r15 = r7
            long r6 = r14.f17465g
            r16 = r10
            long r9 = r14.f17462c
            r17 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r19 = r6 & r17
            r21 = 36028792732385279(0x7fffff007fffff, double:2.848093183464406E-306)
            long r19 = r19 + r21
            r23 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            long r19 = r19 & r23
            r25 = 0
            int r11 = (r19 > r25 ? 1 : (r19 == r25 ? 0 : -1))
            if (r11 != 0) goto L178
            long r19 = r9 & r17
            long r19 = r19 + r21
            long r19 = r19 & r23
            int r11 = (r19 > r25 ? 1 : (r19 == r25 ? 0 : -1))
            if (r11 != 0) goto L178
            java.util.ArrayList r11 = new java.util.ArrayList
            r19 = r15
            java.util.ArrayList r15 = r14.f17467k
            n5.s r20 = n5.s.f15299q
            if (r15 != 0) goto Lb7
            r15 = r20
        Lb7:
            int r15 = r15.size()
            r11.<init>(r15)
            java.util.ArrayList r15 = r14.f17467k
            if (r15 != 0) goto Lc4
            r15 = r20
        Lc4:
            r20 = r15
            java.util.Collection r20 = (java.util.Collection) r20
            r47 = r4
            int r4 = r20.size()
            r20 = r5
            r5 = 0
        Ld1:
            if (r5 >= r4) goto L11e
            java.lang.Object r27 = r15.get(r5)
            r28 = r4
            r4 = r27
            v0.b r4 = (v0.C1733b) r4
            r48 = r12
            long r12 = r4.f17437b
            long r29 = r12 & r17
            long r29 = r29 + r21
            long r29 = r29 & r23
            int r27 = (r29 > r25 ? 1 : (r29 == r25 ? 0 : -1))
            if (r27 != 0) goto L10d
            v0.b r29 = new v0.b
            r50 = r14
            r27 = r15
            long r14 = r4.f17436a
            r36 = r5
            B0.n0 r5 = r0.f
            kotlin.jvm.internal.m.b(r5)
            long r32 = r5.K0(r2, r12)
            long r4 = r4.f17438c
            r34 = r4
            r30 = r14
            r29.<init>(r30, r32, r34)
            r4 = r29
            r11.add(r4)
            goto L113
        L10d:
            r36 = r5
            r50 = r14
            r27 = r15
        L113:
            int r5 = r36 + 1
            r15 = r27
            r4 = r28
            r12 = r48
            r14 = r50
            goto Ld1
        L11e:
            r48 = r12
            r50 = r14
            B0.n0 r4 = r0.f
            kotlin.jvm.internal.m.b(r4)
            long r38 = r4.K0(r2, r6)
            B0.n0 r4 = r0.f
            kotlin.jvm.internal.m.b(r4)
            long r32 = r4.K0(r2, r9)
            long r4 = r14.f17460a
            long r6 = r14.f17461b
            boolean r9 = r14.f17463d
            long r12 = r14.f
            boolean r10 = r14.f17466h
            int r15 = r14.i
            r28 = r4
            long r4 = r14.j
            float r2 = r14.f17464e
            v0.l r27 = new v0.l
            r43 = r4
            long r4 = r14.f17468l
            r35 = r2
            r45 = r4
            r30 = r6
            r34 = r9
            r40 = r10
            r42 = r11
            r36 = r12
            r41 = r15
            r27.<init>(r28, r30, r32, r34, r35, r36, r38, r40, r41, r42, r43, r45)
            r2 = r27
            v0.l r4 = r14.f17471o
            if (r4 != 0) goto L166
            r4 = r14
        L166:
            r2.f17471o = r4
            v0.l r4 = r14.f17471o
            if (r4 != 0) goto L16d
            goto L16e
        L16d:
            r14 = r4
        L16e:
            r2.f17471o = r14
            r6 = r16
            r4 = r48
            r6.e(r4, r2)
            goto L185
        L178:
            r47 = r4
            r20 = r5
            r19 = r15
            goto L185
        L17f:
            r47 = r4
            r20 = r5
            r19 = r7
        L185:
            int r8 = r8 + 1
            r2 = r53
            r7 = r19
            r5 = r20
            r4 = r47
            goto L69
        L191:
            r47 = r4
            r19 = r7
            r6 = r10
            int r2 = r6.g()
            if (r2 != 0) goto L1a5
            r2 = 0
            r11.f7510q = r2
            R.e r1 = r0.f17449a
            r1.i()
            return r19
        L1a5:
            int r2 = r11.f7510q
            int r2 = r2 + (-1)
        L1a9:
            r4 = -1
            if (r4 >= r2) goto L1d6
            java.lang.Object r5 = r11.f7511r
            long[] r5 = (long[]) r5
            r7 = r5[r2]
            int r5 = r1.c(r7)
            if (r5 < 0) goto L1b9
            goto L1d3
        L1b9:
            int r5 = r11.f7510q
            if (r2 >= r5) goto L1d3
            int r5 = r5 + (-1)
            r7 = r2
        L1c0:
            if (r7 >= r5) goto L1ce
            java.lang.Object r8 = r11.f7511r
            long[] r8 = (long[]) r8
            int r9 = r7 + 1
            r12 = r8[r9]
            r8[r7] = r12
            r7 = r9
            goto L1c0
        L1ce:
            int r5 = r11.f7510q
            int r5 = r5 + r4
            r11.f7510q = r5
        L1d3:
            int r2 = r2 + (-1)
            goto L1a9
        L1d6:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r6.g()
            r1.<init>(r2)
            int r2 = r6.g()
            r4 = 0
        L1e4:
            if (r4 >= r2) goto L1f0
            java.lang.Object r5 = r6.h(r4)
            r1.add(r5)
            int r4 = r4 + 1
            goto L1e4
        L1f0:
            v0.f r2 = new v0.f
            r2.<init>(r1, r3)
            int r4 = r1.size()
            r5 = 0
        L1fa:
            if (r5 >= r4) goto L20f
            java.lang.Object r6 = r1.get(r5)
            r7 = r6
            v0.l r7 = (v0.C1743l) r7
            long r7 = r7.f17460a
            boolean r7 = r3.a(r7)
            if (r7 == 0) goto L20c
            goto L210
        L20c:
            int r5 = r5 + 1
            goto L1fa
        L20f:
            r6 = 0
        L210:
            v0.l r6 = (v0.C1743l) r6
            r1 = 3
            if (r6 == 0) goto L2a2
            boolean r3 = r6.f17463d
            if (r55 != 0) goto L21d
            r4 = 0
            r0.i = r4
            goto L274
        L21d:
            r4 = 0
            boolean r5 = r0.i
            if (r5 != 0) goto L274
            if (r3 != 0) goto L228
            boolean r5 = r6.f17466h
            if (r5 == 0) goto L274
        L228:
            B0.n0 r5 = r0.f
            kotlin.jvm.internal.m.b(r5)
            long r7 = r5.f18666s
            long r5 = r6.f17462c
            r9 = 32
            long r10 = r5 >> r9
            int r10 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r10)
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r11
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            long r13 = r7 >> r9
            int r6 = (int) r13
            long r7 = r7 & r11
            int r7 = (int) r7
            r8 = 0
            int r9 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r9 >= 0) goto L252
            r9 = r19
            goto L253
        L252:
            r9 = r4
        L253:
            float r6 = (float) r6
            int r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r6 <= 0) goto L25b
            r6 = r19
            goto L25c
        L25b:
            r6 = r4
        L25c:
            r6 = r6 | r9
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 >= 0) goto L264
            r8 = r19
            goto L265
        L264:
            r8 = r4
        L265:
            r6 = r6 | r8
            float r7 = (float) r7
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L26e
            r5 = r19
            goto L26f
        L26e:
            r5 = r4
        L26f:
            r5 = r5 | r6
            r5 = r5 ^ 1
            r0.i = r5
        L274:
            boolean r5 = r0.i
            boolean r6 = r0.f17448h
            r7 = 5
            r8 = 4
            if (r5 == r6) goto L28c
            int r9 = r2.f17453c
            if (r9 != r1) goto L281
            goto L286
        L281:
            if (r9 != r8) goto L284
            goto L286
        L284:
            if (r9 != r7) goto L28c
        L286:
            if (r5 == 0) goto L289
            r7 = r8
        L289:
            r2.f17453c = r7
            goto L2a3
        L28c:
            int r9 = r2.f17453c
            if (r9 != r8) goto L299
            if (r6 == 0) goto L299
            boolean r6 = r0.j
            if (r6 != 0) goto L299
            r2.f17453c = r1
            goto L2a3
        L299:
            if (r9 != r7) goto L2a3
            if (r5 == 0) goto L2a3
            if (r3 == 0) goto L2a3
            r2.f17453c = r1
            goto L2a3
        L2a2:
            r4 = 0
        L2a3:
            if (r47 != 0) goto L2df
            int r3 = r2.f17453c
            if (r3 != r1) goto L2df
            v0.f r1 = r0.f17447g
            if (r1 == 0) goto L2df
            java.lang.Object r1 = r1.f17451a
            int r3 = r1.size()
            java.lang.Object r5 = r2.f17451a
            int r6 = r5.size()
            if (r3 == r6) goto L2bc
            goto L2df
        L2bc:
            int r3 = r5.size()
            r6 = r4
        L2c1:
            if (r6 >= r3) goto L2dd
            java.lang.Object r7 = r1.get(r6)
            v0.l r7 = (v0.C1743l) r7
            java.lang.Object r8 = r5.get(r6)
            v0.l r8 = (v0.C1743l) r8
            long r9 = r7.f17462c
            long r7 = r8.f17462c
            boolean r7 = i0.C1130b.b(r9, r7)
            if (r7 != 0) goto L2da
            goto L2df
        L2da:
            int r6 = r6 + 1
            goto L2c1
        L2dd:
            r7 = r4
            goto L2e1
        L2df:
            r7 = r19
        L2e1:
            r0.f17447g = r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.C1735d.a(r.q, z0.m, com.google.android.gms.internal.measurement.O1, boolean):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // v0.C1736e
    public final void b(O1 o12) {
        super.b(o12);
        C1737f c1737f = this.f17447g;
        if (c1737f == null) {
            return;
        }
        this.f17448h = this.i;
        ?? r12 = c1737f.f17451a;
        int size = ((Collection) r12).size();
        for (int i = 0; i < size; i++) {
            C1743l c1743l = (C1743l) r12.get(i);
            boolean z5 = c1743l.f17463d;
            long j = c1743l.f17460a;
            boolean zA = o12.a(j);
            boolean z6 = this.i;
            if ((!z5 && !zA) || (!z5 && !z6)) {
                this.f17445d.m(j);
            }
        }
        this.i = false;
        this.j = c1737f.f17453c == 5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:24:0x004c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:35:0x005b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:38:0x0018 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:40:0x0018 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:43:0x0055 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [R.e] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [R.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void c() {
        R.e eVar = this.f17449a;
        Object[] objArr = eVar.f6676q;
        int i = eVar.f6678s;
        for (int i7 = 0; i7 < i; i7++) {
            ((C1735d) objArr[i7]).c();
        }
        ?? F6 = this.f17444c;
        ?? eVar2 = 0;
        while (F6 != 0) {
            if (F6 instanceof y0) {
                ((y0) F6).U();
            } else if ((F6.f10102s & 16) != 0 && (F6 instanceof AbstractC0049n)) {
                AbstractC0724l abstractC0724l = ((AbstractC0049n) F6).f473F;
                int i8 = 0;
                F6 = F6;
                eVar2 = eVar2;
                while (abstractC0724l != null) {
                    if ((abstractC0724l.f10102s & 16) != 0) {
                        i8++;
                        eVar2 = eVar2;
                        if (i8 == 1) {
                            F6 = abstractC0724l;
                        } else {
                            if (eVar2 == 0) {
                                eVar2 = new R.e(new AbstractC0724l[16]);
                            }
                            if (F6 != 0) {
                                eVar2.c(F6);
                                F6 = 0;
                            }
                            eVar2.c(abstractC0724l);
                        }
                    }
                    abstractC0724l = abstractC0724l.f10105v;
                    F6 = F6;
                    eVar2 = eVar2;
                }
                if (i8 == 1) {
                }
            }
            F6 = AbstractC0041g.f(eVar2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:27:0x0058 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:44:0x0067 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:47:0x0022 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:49:0x0022 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:52:0x0061 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [R.e] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [R.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(O1 o12) {
        C1566q c1566q = this.f17446e;
        boolean z5 = false;
        z5 = false;
        if (c1566q.g() != 0) {
            AbstractC0724l abstractC0724l = this.f17444c;
            if (abstractC0724l.f10099D) {
                C1737f c1737f = this.f17447g;
                kotlin.jvm.internal.m.b(c1737f);
                n0 n0Var = this.f;
                kotlin.jvm.internal.m.b(n0Var);
                long j = n0Var.f18666s;
                ?? F6 = abstractC0724l;
                ?? eVar = 0;
                while (F6 != 0) {
                    if (F6 instanceof y0) {
                        ((y0) F6).t(c1737f, EnumC1738g.f17456s, j);
                    } else if ((F6.f10102s & 16) != 0 && (F6 instanceof AbstractC0049n)) {
                        AbstractC0724l abstractC0724l2 = ((AbstractC0049n) F6).f473F;
                        int i = 0;
                        F6 = F6;
                        eVar = eVar;
                        while (abstractC0724l2 != null) {
                            if ((abstractC0724l2.f10102s & 16) != 0) {
                                i++;
                                eVar = eVar;
                                if (i == 1) {
                                    F6 = abstractC0724l2;
                                } else {
                                    if (eVar == 0) {
                                        eVar = new R.e(new AbstractC0724l[16]);
                                    }
                                    if (F6 != 0) {
                                        eVar.c(F6);
                                        F6 = 0;
                                    }
                                    eVar.c(abstractC0724l2);
                                }
                            }
                            abstractC0724l2 = abstractC0724l2.f10105v;
                            F6 = F6;
                            eVar = eVar;
                        }
                        if (i == 1) {
                        }
                    }
                    F6 = AbstractC0041g.f(eVar);
                }
                if (abstractC0724l.f10099D) {
                    R.e eVar2 = this.f17449a;
                    Object[] objArr = eVar2.f6676q;
                    int i7 = eVar2.f6678s;
                    for (int i8 = 0; i8 < i7; i8++) {
                        ((C1735d) objArr[i8]).d(o12);
                    }
                }
                z5 = true;
            }
        }
        b(o12);
        c1566q.a();
        this.f = null;
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:27:0x0056 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:59:0x00be */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:69:0x0065 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:72:0x0020 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:74:0x0020 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:77:0x005f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:82:0x00cd */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:85:0x008b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:87:0x008b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:90:0x00c7 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r0v3, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [R.e] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [R.e] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [R.e] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [R.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(O1 o12, boolean z5) {
        if (this.f17446e.g() == 0) {
            return false;
        }
        ?? F6 = this.f17444c;
        if (!F6.f10099D) {
            return false;
        }
        C1737f c1737f = this.f17447g;
        kotlin.jvm.internal.m.b(c1737f);
        n0 n0Var = this.f;
        kotlin.jvm.internal.m.b(n0Var);
        long j = n0Var.f18666s;
        ?? F7 = F6;
        ?? eVar = 0;
        while (F7 != 0) {
            if (F7 instanceof y0) {
                ((y0) F7).t(c1737f, EnumC1738g.f17454q, j);
            } else if ((F7.f10102s & 16) != 0 && (F7 instanceof AbstractC0049n)) {
                AbstractC0724l abstractC0724l = ((AbstractC0049n) F7).f473F;
                int i = 0;
                F7 = F7;
                eVar = eVar;
                while (abstractC0724l != null) {
                    if ((abstractC0724l.f10102s & 16) != 0) {
                        i++;
                        eVar = eVar;
                        if (i == 1) {
                            F7 = abstractC0724l;
                        } else {
                            if (eVar == 0) {
                                eVar = new R.e(new AbstractC0724l[16]);
                            }
                            if (F7 != 0) {
                                eVar.c(F7);
                                F7 = 0;
                            }
                            eVar.c(abstractC0724l);
                        }
                    }
                    abstractC0724l = abstractC0724l.f10105v;
                    F7 = F7;
                    eVar = eVar;
                }
                if (i == 1) {
                }
            }
            F7 = AbstractC0041g.f(eVar);
        }
        if (F6.f10099D) {
            R.e eVar2 = this.f17449a;
            Object[] objArr = eVar2.f6676q;
            int i7 = eVar2.f6678s;
            for (int i8 = 0; i8 < i7; i8++) {
                C1735d c1735d = (C1735d) objArr[i8];
                kotlin.jvm.internal.m.b(this.f);
                c1735d.e(o12, z5);
            }
        }
        if (F6.f10099D) {
            ?? eVar3 = 0;
            while (F6 != 0) {
                if (F6 instanceof y0) {
                    ((y0) F6).t(c1737f, EnumC1738g.f17455r, j);
                } else if ((F6.f10102s & 16) != 0 && (F6 instanceof AbstractC0049n)) {
                    AbstractC0724l abstractC0724l2 = ((AbstractC0049n) F6).f473F;
                    int i9 = 0;
                    F6 = F6;
                    eVar3 = eVar3;
                    while (abstractC0724l2 != null) {
                        if ((abstractC0724l2.f10102s & 16) != 0) {
                            i9++;
                            eVar3 = eVar3;
                            if (i9 == 1) {
                                F6 = abstractC0724l2;
                            } else {
                                if (eVar3 == 0) {
                                    eVar3 = new R.e(new AbstractC0724l[16]);
                                }
                                if (F6 != 0) {
                                    eVar3.c(F6);
                                    F6 = 0;
                                }
                                eVar3.c(abstractC0724l2);
                            }
                        }
                        abstractC0724l2 = abstractC0724l2.f10105v;
                        F6 = F6;
                        eVar3 = eVar3;
                    }
                    if (i9 == 1) {
                    }
                }
                F6 = AbstractC0041g.f(eVar3);
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(long j, C1544C c1544c) {
        U.l lVar = this.f17445d;
        if (lVar.e(j) && c1544c.f(this) < 0) {
            lVar.m(j);
            this.f17446e.f(j);
        }
        R.e eVar = this.f17449a;
        Object[] objArr = eVar.f6676q;
        int i = eVar.f6678s;
        for (int i7 = 0; i7 < i; i7++) {
            ((C1735d) objArr[i7]).f(j, c1544c);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Node(modifierNode=" + this.f17444c + ", children=" + this.f17449a + ", pointerIds=" + this.f17445d + ')';
    }
}
