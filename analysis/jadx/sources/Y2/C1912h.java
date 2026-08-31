package y2;

import D2.n;
import M5.InterfaceC0261w;
import java.util.List;
import m5.C1386y;
import q5.InterfaceC1524c;
import t2.C1618c;

/* JADX INFO: renamed from: y2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1912h extends s5.i implements B5.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ C1618c f18597A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ D2.j f18598B;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List f18599q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public n f18600r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f18601s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f18602t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f18603u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f18604v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C1913i f18605w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C1905a f18606x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n f18607y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ List f18608z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1912h(C1913i c1913i, C1905a c1905a, n nVar, List list, C1618c c1618c, D2.j jVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f18605w = c1913i;
        this.f18606x = c1905a;
        this.f18607y = nVar;
        this.f18608z = list;
        this.f18597A = c1618c;
        this.f18598B = jVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        C1912h c1912h = new C1912h(this.f18605w, this.f18606x, this.f18607y, this.f18608z, this.f18597A, this.f18598B, interfaceC1524c);
        c1912h.f18604v = obj;
        return c1912h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1912h) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.f18603u
            t2.c r1 = r9.f18597A
            y2.a r2 = r9.f18606x
            r3 = 1
            if (r0 == 0) goto L2f
            if (r0 != r3) goto L27
            int r0 = r9.f18602t
            int r4 = r9.f18601s
            D2.n r5 = r9.f18600r
            java.util.List r6 = r9.f18599q
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r9.f18604v
            M5.w r7 = (M5.InterfaceC0261w) r7
            m5.AbstractC1362a.e(r10)
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            q5.h r8 = r7.d()
            M5.AbstractC0263y.i(r8)
            int r4 = r4 + r3
            goto L71
        L27:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L2f:
            m5.AbstractC1362a.e(r10)
            java.lang.Object r10 = r9.f18604v
            r7 = r10
            M5.w r7 = (M5.InterfaceC0261w) r7
            android.graphics.drawable.Drawable r10 = r2.f18540a
            boolean r0 = r10 instanceof android.graphics.drawable.BitmapDrawable
            D2.n r5 = r9.f18607y
            if (r0 == 0) goto L58
            r0 = r10
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            android.graphics.Bitmap$Config r4 = r0.getConfig()
            if (r4 != 0) goto L4e
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
        L4e:
            android.graphics.Bitmap$Config[] r6 = H2.f.f2137a
            boolean r4 = n5.k.z0(r6, r4)
            if (r4 == 0) goto L58
            r10 = r0
            goto L64
        L58:
            android.graphics.Bitmap$Config r0 = r5.f1422b
            E2.h r4 = r5.f1424d
            E2.g r6 = r5.f1425e
            boolean r8 = r5.f
            android.graphics.Bitmap r10 = com.google.android.gms.internal.measurement.AbstractC0836n2.i(r10, r0, r4, r6, r8)
        L64:
            r1.getClass()
            java.util.List r6 = r9.f18608z
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            r4 = 0
        L71:
            if (r4 < r0) goto L8f
            r1.getClass()
            D2.j r0 = r9.f18598B
            android.content.Context r0 = r0.f1396a
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            r1.<init>(r0, r10)
            boolean r10 = r2.f18541b
            v2.e r0 = r2.f18542c
            java.lang.String r2 = r2.f18543d
            y2.a r3 = new y2.a
            r3.<init>(r1, r10, r0, r2)
            return r3
        L8f:
            java.lang.Object r10 = r6.get(r4)
            if (r10 != 0) goto La7
            E2.h r10 = r5.f1424d
            r9.f18604v = r7
            java.util.List r6 = (java.util.List) r6
            r9.f18599q = r6
            r9.f18600r = r5
            r9.f18601s = r4
            r9.f18602t = r0
            r9.f18603u = r3
            r10 = 0
            throw r10
        La7:
            java.lang.ClassCastException r10 = new java.lang.ClassCastException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.C1912h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
