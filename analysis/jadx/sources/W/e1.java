package w;

import m5.C1386y;
import q5.InterfaceC1524c;
import v0.EnumC1738g;

/* JADX INFO: loaded from: classes.dex */
public final class e1 extends s5.h implements B5.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f17955r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f17956s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ EnumC1738g f17957t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f17958u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(EnumC1738g enumC1738g, kotlin.jvm.internal.y yVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17957t = enumC1738g;
        this.f17958u = yVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        e1 e1Var = new e1(this.f17957t, this.f17958u, interfaceC1524c);
        e1Var.f17956s = obj;
        return e1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e1) create((v0.y) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 29) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        r8 = r8.f17452b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (r8 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        r8 = (android.view.MotionEvent) ((Z.m) r8.f10681c).f8313s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        if (r8 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        r8 = r8.getClassification();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
    
        if (r8 != 2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        if (r8 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
    
        r4.f14268q = w.N.f17823a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
    
        r8 = ((java.util.Collection) r9).size();
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
    
        if (r10 >= r8) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0092, code lost:
    
        r11 = (v0.C1743l) r9.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009c, code lost:
    
        if (r11.b() != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00aa, code lost:
    
        if (v0.v.e(r11, r1.f17509v.f17434N, r1.c()) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ad, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b0, code lost:
    
        r4.f14268q = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b3, code lost:
    
        r16.f17956s = r1;
        r16.f17955r = 2;
        r8 = r1.a(v0.EnumC1738g.f17456s, r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bd, code lost:
    
        if (r8 != r7) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00da, code lost:
    
        r4.f14268q = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045 A[PHI: r1 r8
  0x0045: PHI (r1v3 v0.y) = (r1v6 v0.y), (r1v10 v0.y) binds: [B:12:0x0041, B:9:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x0045: PHI (r8v0 java.lang.Object) = (r8v21 java.lang.Object), (r8v25 java.lang.Object) binds: [B:12:0x0041, B:9:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00bd -> B:44:0x00c0). Please report as a decompilation issue!!! */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            int r1 = r0.f17955r
            w.L r2 = w.L.f17819a
            r3 = 2
            kotlin.jvm.internal.y r4 = r0.f17958u
            r5 = 0
            r6 = 1
            r5.a r7 = r5.EnumC1580a.f16356q
            if (r1 == 0) goto L30
            if (r1 == r6) goto L26
            if (r1 != r3) goto L1e
            java.lang.Object r1 = r0.f17956s
            v0.y r1 = (v0.y) r1
            m5.AbstractC1362a.e(r17)
            r8 = r17
            goto Lc0
        L1e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L26:
            java.lang.Object r1 = r0.f17956s
            v0.y r1 = (v0.y) r1
            m5.AbstractC1362a.e(r17)
            r8 = r17
            goto L45
        L30:
            m5.AbstractC1362a.e(r17)
            java.lang.Object r1 = r0.f17956s
            v0.y r1 = (v0.y) r1
        L37:
            r0.f17956s = r1
            r0.f17955r = r6
            v0.g r8 = r0.f17957t
            java.lang.Object r8 = r1.a(r8, r0)
            if (r8 != r7) goto L45
            goto Lbf
        L45:
            v0.f r8 = (v0.C1737f) r8
            java.lang.Object r9 = r8.f17451a
            r10 = r9
            java.util.Collection r10 = (java.util.Collection) r10
            int r10 = r10.size()
            r11 = r5
        L51:
            if (r11 >= r10) goto Le4
            java.lang.Object r12 = r9.get(r11)
            v0.l r12 = (v0.C1743l) r12
            boolean r12 = v0.v.b(r12)
            if (r12 != 0) goto Le0
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 29
            if (r10 < r11) goto L7a
            com.google.android.gms.internal.measurement.O1 r8 = r8.f17452b
            if (r8 == 0) goto L72
            java.lang.Object r8 = r8.f10681c
            Z.m r8 = (Z.m) r8
            java.lang.Object r8 = r8.f8313s
            android.view.MotionEvent r8 = (android.view.MotionEvent) r8
            goto L73
        L72:
            r8 = 0
        L73:
            if (r8 == 0) goto L7a
            int r8 = t1.AbstractC1614a.b(r8)
            goto L7b
        L7a:
            r8 = r5
        L7b:
            if (r8 != r3) goto L7f
            r8 = r6
            goto L80
        L7f:
            r8 = r5
        L80:
            if (r8 == 0) goto L88
            w.N r1 = w.N.f17823a
            r4.f14268q = r1
            goto Lf1
        L88:
            r8 = r9
            java.util.Collection r8 = (java.util.Collection) r8
            int r8 = r8.size()
            r10 = r5
        L90:
            if (r10 >= r8) goto Lb3
            java.lang.Object r11 = r9.get(r10)
            v0.l r11 = (v0.C1743l) r11
            boolean r12 = r11.b()
            if (r12 != 0) goto Lb0
            v0.A r12 = r1.f17509v
            long r12 = r12.f17434N
            long r14 = r1.c()
            boolean r11 = v0.v.e(r11, r12, r14)
            if (r11 == 0) goto Lad
            goto Lb0
        Lad:
            int r10 = r10 + 1
            goto L90
        Lb0:
            r4.f14268q = r2
            goto Lf1
        Lb3:
            r0.f17956s = r1
            r0.f17955r = r3
            v0.g r8 = v0.EnumC1738g.f17456s
            java.lang.Object r8 = r1.a(r8, r0)
            if (r8 != r7) goto Lc0
        Lbf:
            return r7
        Lc0:
            v0.f r8 = (v0.C1737f) r8
            java.lang.Object r8 = r8.f17451a
            r9 = r8
            java.util.Collection r9 = (java.util.Collection) r9
            int r9 = r9.size()
            r10 = r5
        Lcc:
            if (r10 >= r9) goto L37
            java.lang.Object r11 = r8.get(r10)
            v0.l r11 = (v0.C1743l) r11
            boolean r11 = r11.b()
            if (r11 == 0) goto Ldd
            r4.f14268q = r2
            goto Lf1
        Ldd:
            int r10 = r10 + 1
            goto Lcc
        Le0:
            int r11 = r11 + 1
            goto L51
        Le4:
            w.M r1 = new w.M
            java.lang.Object r2 = r9.get(r5)
            v0.l r2 = (v0.C1743l) r2
            r1.<init>(r2)
            r4.f14268q = r1
        Lf1:
            m5.y r1 = m5.C1386y.f15098a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w.e1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
