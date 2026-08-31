package Q5;

import M5.InterfaceC0261w;
import P5.InterfaceC0397h;
import P5.InterfaceC0398i;
import androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class t extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public O5.i f6649q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte[] f6650r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6651s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6652t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f6653u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f6654v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0397h[] f6655w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ WorkConstraintsTracker$track$$inlined$combine$1.AnonymousClass2 f6656x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ WorkConstraintsTracker$track$$inlined$combine$1.AnonymousClass3 f6657y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0398i f6658z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(InterfaceC0397h[] interfaceC0397hArr, WorkConstraintsTracker$track$$inlined$combine$1.AnonymousClass2 anonymousClass2, WorkConstraintsTracker$track$$inlined$combine$1.AnonymousClass3 anonymousClass3, InterfaceC0398i interfaceC0398i, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f6655w = interfaceC0397hArr;
        this.f6656x = anonymousClass2;
        this.f6657y = anonymousClass3;
        this.f6658z = interfaceC0398i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        t tVar = new t(this.f6655w, this.f6656x, this.f6657y, this.f6658z, interfaceC1524c);
        tVar.f6654v = obj;
        return tVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:33:0x00c2) to fix multi-entry loop: BACK_EDGE: B:33:0x00c2 -> B:19:0x0083 */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0083, code lost:
    
        if (r8 != 0) goto L19;
     */
    /* JADX WARN: Path cross not found for [B:33:0x00c2, B:31:0x00b3], limit reached: 42 */
    /* JADX WARN: Path cross not found for [B:34:0x00c4, B:19:0x0083], limit reached: 42 */
    /* JADX WARN: Path cross not found for [B:36:0x00d2, B:39:0x00e5], limit reached: 42 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3 A[LOOP:0: B:26:0x00a3->B:44:?, LOOP_START, PHI: r8 r12
  0x00a3: PHI (r8v3 int) = (r8v2 int), (r8v4 int) binds: [B:23:0x009e, B:44:?] A[DONT_GENERATE, DONT_INLINE]
  0x00a3: PHI (r12v4 n5.v) = (r12v3 n5.v), (r12v10 n5.v) binds: [B:23:0x009e, B:44:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e2 -> B:19:0x0083). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00fa -> B:19:0x0083). Please report as a decompilation issue!!! */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            E4.f r1 = Q5.AbstractC0423c.f6605c
            int r2 = r0.f6653u
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            r5.a r7 = r5.EnumC1580a.f16356q
            if (r2 == 0) goto L4f
            if (r2 == r6) goto L33
            if (r2 == r5) goto L1d
            if (r2 != r4) goto L15
            goto L1d
        L15:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1d:
            int r2 = r0.f6652t
            int r8 = r0.f6651s
            byte[] r9 = r0.f6650r
            O5.i r10 = r0.f6649q
            java.lang.Object r11 = r0.f6654v
            java.lang.Object[] r11 = (java.lang.Object[]) r11
            m5.AbstractC1362a.e(r20)
            r18 = r11
            r11 = r2
            r2 = r9
            r9 = r18
            goto L83
        L33:
            int r2 = r0.f6652t
            int r8 = r0.f6651s
            byte[] r9 = r0.f6650r
            O5.i r10 = r0.f6649q
            java.lang.Object r11 = r0.f6654v
            java.lang.Object[] r11 = (java.lang.Object[]) r11
            m5.AbstractC1362a.e(r20)
            r12 = r20
            O5.l r12 = (O5.l) r12
            java.lang.Object r12 = r12.f5251a
            r18 = r11
            r11 = r2
            r2 = r9
            r9 = r18
            goto L98
        L4f:
            m5.AbstractC1362a.e(r20)
            java.lang.Object r2 = r0.f6654v
            M5.w r2 = (M5.InterfaceC0261w) r2
            P5.h[] r8 = r0.f6655w
            int r8 = r8.length
            if (r8 != 0) goto L5c
            goto La0
        L5c:
            java.lang.Object[] r9 = new java.lang.Object[r8]
            n5.k.J0(r3, r8, r1, r9)
            r10 = 6
            r11 = 0
            O5.e r16 = l6.d.e(r8, r11, r10)
            java.util.concurrent.atomic.AtomicInteger r15 = new java.util.concurrent.atomic.AtomicInteger
            r15.<init>(r8)
            r14 = r3
        L6d:
            if (r14 >= r8) goto L7e
            Q5.s r12 = new Q5.s
            P5.h[] r13 = r0.f6655w
            r17 = 0
            r12.<init>(r13, r14, r15, r16, r17)
            M5.AbstractC0263y.t(r2, r11, r11, r12, r4)
            int r14 = r14 + 1
            goto L6d
        L7e:
            byte[] r2 = new byte[r8]
            r11 = r3
            r10 = r16
        L83:
            int r11 = r11 + r6
            byte r11 = (byte) r11
            r0.f6654v = r9
            r0.f6649q = r10
            r0.f6650r = r2
            r0.f6651s = r8
            r0.f6652t = r11
            r0.f6653u = r6
            java.lang.Object r12 = r10.l(r0)
            if (r12 != r7) goto L98
            goto Lfc
        L98:
            java.lang.Object r12 = O5.l.a(r12)
            n5.v r12 = (n5.v) r12
            if (r12 != 0) goto La3
        La0:
            m5.y r1 = m5.C1386y.f15098a
            return r1
        La3:
            int r13 = r12.f15302a
            r14 = r9[r13]
            java.lang.Object r12 = r12.f15303b
            r9[r13] = r12
            if (r14 != r1) goto Laf
            int r8 = r8 + (-1)
        Laf:
            r12 = r2[r13]
            if (r12 == r11) goto Lc2
            byte r12 = (byte) r11
            r2[r13] = r12
            java.lang.Object r12 = r10.i()
            java.lang.Object r12 = O5.l.a(r12)
            n5.v r12 = (n5.v) r12
            if (r12 != 0) goto La3
        Lc2:
            if (r8 != 0) goto L83
            androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$2 r12 = r0.f6656x
            java.lang.Object r12 = r12.invoke()
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            P5.i r13 = r0.f6658z
            androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3 r14 = r0.f6657y
            if (r12 != 0) goto Le5
            r0.f6654v = r9
            r0.f6649q = r10
            r0.f6650r = r2
            r0.f6651s = r8
            r0.f6652t = r11
            r0.f6653u = r5
            java.lang.Object r12 = r14.invoke(r13, r9, r0)
            if (r12 != r7) goto L83
            goto Lfc
        Le5:
            r15 = 14
            n5.k.G0(r3, r3, r15, r9, r12)
            r0.f6654v = r9
            r0.f6649q = r10
            r0.f6650r = r2
            r0.f6651s = r8
            r0.f6652t = r11
            r0.f6653u = r4
            java.lang.Object r12 = r14.invoke(r13, r12, r0)
            if (r12 != r7) goto L83
        Lfc:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Q5.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
