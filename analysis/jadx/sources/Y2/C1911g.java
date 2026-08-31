package y2;

import D2.n;
import M2.k;
import M5.InterfaceC0261w;
import m5.C1386y;
import q5.InterfaceC1524c;
import t2.C1618c;

/* JADX INFO: renamed from: y2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1911g extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f18589q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1913i f18590r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ D2.j f18591s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f18592t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ n f18593u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C1618c f18594v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ B2.a f18595w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f18596x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1911g(C1913i c1913i, D2.j jVar, Object obj, n nVar, C1618c c1618c, B2.a aVar, k kVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f18590r = c1913i;
        this.f18591s = jVar;
        this.f18592t = obj;
        this.f18593u = nVar;
        this.f18594v = c1618c;
        this.f18595w = aVar;
        this.f18596x = kVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C1911g(this.f18590r, this.f18591s, this.f18592t, this.f18593u, this.f18594v, this.f18595w, this.f18596x, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1911g) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            r16 = this;
            r5 = r16
            r5.a r6 = r5.EnumC1580a.f16356q
            int r0 = r5.f18589q
            r7 = 1
            if (r0 == 0) goto L19
            if (r0 != r7) goto L11
            m5.AbstractC1362a.e(r17)
            r0 = r17
            goto L2f
        L11:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L19:
            m5.AbstractC1362a.e(r17)
            y2.i r0 = r5.f18590r
            D2.j r1 = r5.f18591s
            java.lang.Object r2 = r5.f18592t
            D2.n r3 = r5.f18593u
            t2.c r4 = r5.f18594v
            r5.f18589q = r7
            java.lang.Object r0 = y2.C1913i.b(r0, r1, r2, r3, r4, r5)
            if (r0 != r6) goto L2f
            return r6
        L2f:
            y2.a r0 = (y2.C1905a) r0
            y2.i r1 = r5.f18590r
            H2.m r1 = r1.f18610b
            monitor-enter(r1)
            java.lang.ref.WeakReference r2 = r1.f2157q     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L4c
            t2.l r2 = (t2.l) r2     // Catch: java.lang.Throwable -> L4c
            if (r2 == 0) goto L4f
            android.content.Context r3 = r1.f2158r     // Catch: java.lang.Throwable -> L4c
            if (r3 != 0) goto L52
            android.content.Context r2 = r2.f16714a     // Catch: java.lang.Throwable -> L4c
            r1.f2158r = r2     // Catch: java.lang.Throwable -> L4c
            r2.registerComponentCallbacks(r1)     // Catch: java.lang.Throwable -> L4c
            goto L52
        L4c:
            r0 = move-exception
            goto Ldd
        L4f:
            r1.b()     // Catch: java.lang.Throwable -> L4c
        L52:
            monitor-exit(r1)
            y2.i r1 = r5.f18590r
            k3.d r1 = r1.f18612d
            B2.a r2 = r5.f18595w
            D2.j r3 = r5.f18591s
            D2.b r3 = r3.f1407o
            boolean r3 = r3.f1364r
            r4 = 0
            r6 = 0
            if (r3 != 0) goto L65
        L63:
            r1 = r4
            goto Lb9
        L65:
            java.lang.Object r1 = r1.f14122r
            t2.l r1 = (t2.l) r1
            m5.o r1 = r1.f16716c
            java.lang.Object r1 = r1.getValue()
            B2.c r1 = (B2.c) r1
            if (r1 == 0) goto L63
            if (r2 != 0) goto L76
            goto L63
        L76:
            android.graphics.drawable.Drawable r3 = r0.f18540a
            boolean r8 = r3 instanceof android.graphics.drawable.BitmapDrawable
            if (r8 == 0) goto L7f
            android.graphics.drawable.BitmapDrawable r3 = (android.graphics.drawable.BitmapDrawable) r3
            goto L80
        L7f:
            r3 = r6
        L80:
            if (r3 == 0) goto L63
            android.graphics.Bitmap r3 = r3.getBitmap()
            if (r3 != 0) goto L89
            goto L63
        L89:
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.lang.String r9 = "coil#is_sampled"
            boolean r10 = r0.f18541b
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r8.put(r9, r10)
            java.lang.String r9 = r0.f18543d
            if (r9 == 0) goto La2
            java.lang.String r10 = "coil#disk_cache_key"
            r8.put(r10, r9)
        La2:
            B2.h r1 = r1.f539a
            java.util.Map r9 = r2.f536r
            java.util.Map r9 = com.google.android.gms.internal.measurement.I1.F0(r9)
            java.lang.String r2 = r2.f535q
            B2.a r10 = new B2.a
            r10.<init>(r2, r9)
            java.util.Map r2 = com.google.android.gms.internal.measurement.I1.F0(r8)
            r1.a(r10, r3, r2)
            r1 = r7
        Lb9:
            android.graphics.drawable.Drawable r9 = r0.f18540a
            D2.j r10 = r5.f18591s
            v2.e r11 = r0.f18542c
            B2.a r2 = r5.f18595w
            if (r1 == 0) goto Lc5
            r12 = r2
            goto Lc6
        Lc5:
            r12 = r6
        Lc6:
            java.lang.String r13 = r0.f18543d
            boolean r14 = r0.f18541b
            M2.k r0 = r5.f18596x
            android.graphics.Bitmap$Config[] r1 = H2.f.f2137a
            if (r0 == 0) goto Ld6
            boolean r0 = r0.f3797c
            if (r0 == 0) goto Ld6
            r15 = r7
            goto Ld7
        Ld6:
            r15 = r4
        Ld7:
            D2.r r8 = new D2.r
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return r8
        Ldd:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.C1911g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
