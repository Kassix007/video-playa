package O3;

import a.AbstractC0597a;
import android.content.SharedPreferences;
import android.widget.ImageView;
import c0.C0722j;
import j0.AbstractC1145B;
import x3.AbstractC1887A;

/* JADX INFO: renamed from: O3.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0285g0 implements D2.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f4859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f4860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f4861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f4862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4863e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0285g0(C0288h0 c0288h0, long j) {
        this.f4863e = c0288h0;
        AbstractC1887A.d("health_monitor");
        AbstractC1887A.a(j > 0);
        this.f4860b = "health_monitor:start";
        this.f4861c = "health_monitor:count";
        this.f4862d = "health_monitor:value";
        this.f4859a = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // D2.i
    public void a(D2.r rVar) {
        long j = this.f4859a;
        W0.c cVar = (W0.c) this.f4861c;
        ImageView imageView = (ImageView) this.f4863e;
        float fF0 = cVar.f0(imageView.getDrawable().getIntrinsicWidth());
        float fF02 = cVar.f0(imageView.getDrawable().getIntrinsicHeight());
        String str = (String) this.f4860b;
        boolean zA = kotlin.jvm.internal.m.a(str, "FULL_SCREEN");
        D d5 = AbstractC1145B.f13658a;
        ((B5.c) this.f4862d).invoke(zA ? androidx.compose.foundation.a.a(androidx.compose.foundation.layout.c.f9277a, j, d5) : kotlin.jvm.internal.m.a(str, "FULL_WIDTH") ? Float.compare(fF0, fF02) < 0 ? androidx.compose.foundation.a.a(AbstractC0597a.n(androidx.compose.foundation.layout.c.g(androidx.compose.foundation.layout.c.i(C0722j.f10095q)), H.e.a(5)), j, d5) : androidx.compose.foundation.a.a(AbstractC0597a.n(androidx.compose.foundation.layout.c.g(androidx.compose.foundation.layout.c.f9277a), H.e.a(5)), j, d5) : androidx.compose.foundation.a.a(AbstractC0597a.n(androidx.compose.foundation.layout.c.h(), H.e.a(10)), j, d5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // D2.i
    public void b(D2.e eVar) {
        eVar.f1378c.printStackTrace();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(long r11, com.google.android.gms.internal.measurement.C0820k1 r13) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f4862d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto Ld
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f4862d = r0
        Ld:
            java.lang.Object r0 = r10.f4861c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L1a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f4861c = r0
        L1a:
            java.lang.Object r0 = r10.f4862d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L45
            java.lang.Object r0 = r10.f4862d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.measurement.k1 r0 = (com.google.android.gms.internal.measurement.C0820k1) r0
            long r2 = r0.u()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            r6 = 60
            long r2 = r2 / r6
            long r2 = r2 / r6
            long r8 = r13.u()
            long r8 = r8 / r4
            long r8 = r8 / r6
            long r8 = r8 / r6
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 != 0) goto Lcc
        L45:
            long r2 = r10.f4859a
            int r0 = r13.k()
            long r4 = (long) r0
            long r2 = r2 + r4
            java.lang.Object r0 = r10.f4863e
            O3.T1 r0 = (O3.T1) r0
            O3.g r4 = r0.d0()
            O3.E r5 = O3.F.f4426e1
            r6 = 0
            boolean r4 = r4.y(r6, r5)
            if (r4 == 0) goto L81
            java.lang.Object r4 = r10.f4862d
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L9a
            r0.d0()
            O3.E r4 = O3.F.j
            java.lang.Object r4 = r4.a(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r4 = java.lang.Math.max(r1, r4)
            long r4 = (long) r4
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 >= 0) goto Lcc
            goto L9a
        L81:
            r0.d0()
            O3.E r4 = O3.F.j
            java.lang.Object r4 = r4.a(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r4 = java.lang.Math.max(r1, r4)
            long r4 = (long) r4
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L9a
            goto Lcc
        L9a:
            r10.f4859a = r2
            java.lang.Object r2 = r10.f4862d
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.add(r13)
            java.lang.Object r13 = r10.f4861c
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r13.add(r11)
            java.lang.Object r11 = r10.f4862d
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            int r11 = r11.size()
            r0.d0()
            O3.E r12 = O3.F.f4439k
            java.lang.Object r12 = r12.a(r6)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r13 = 1
            int r12 = java.lang.Math.max(r13, r12)
            if (r11 < r12) goto Lcd
        Lcc:
            return r1
        Lcd:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.C0285g0.c(long, com.google.android.gms.internal.measurement.k1):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d() {
        C0288h0 c0288h0 = (C0288h0) this.f4863e;
        c0288h0.o();
        ((C0323t0) c0288h0.f4346r).f5052A.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = c0288h0.s().edit();
        editorEdit.remove((String) this.f4861c);
        editorEdit.remove((String) this.f4862d);
        editorEdit.putLong((String) this.f4860b, jCurrentTimeMillis);
        editorEdit.apply();
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [O3.T1.G(java.lang.String, long):boolean] */
    public /* synthetic */ C0285g0(T1 t12) {
        this.f4863e = t12;
    }

    public C0285g0(W0.c cVar, String str, long j, B5.c cVar2, ImageView imageView) {
        this.f4861c = cVar;
        this.f4860b = str;
        this.f4859a = j;
        this.f4862d = cVar2;
        this.f4863e = imageView;
    }
}
