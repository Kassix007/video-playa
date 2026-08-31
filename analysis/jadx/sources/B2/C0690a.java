package b2;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.work.impl.WorkManagerImpl;
import com.google.android.gms.internal.measurement.K1;
import i1.C1134a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import v.F;
import v3.l;
import w.C1772a0;
import w.E0;
import w.H0;
import w.Q;
import w0.C1824c;

/* JADX INFO: renamed from: b2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0690a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f9970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Serializable f9973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f9974e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f9975g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f9976h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0690a(H0 h02, C1134a c1134a, X.c cVar, W0.c cVar2) {
        this.f9971b = h02;
        this.f9972c = c1134a;
        this.f9973d = cVar;
        this.f9974e = cVar2;
        this.f = l6.d.e(Integer.MAX_VALUE, null, 6);
        this.f9976h = new l(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float a(C0690a c0690a, E0 e02, float f) {
        H0 h02 = (H0) c0690a.f9971b;
        long jH = h02.h(h02.d(f));
        H0 h03 = e02.f17768a;
        return h02.g(h02.e(H0.a(h03, h03.j, jH, 1)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(b2.C0690a r16, w.H0 r17, w.Q r18, float r19, float r20, s5.c r21) {
        /*
            r5 = r16
            r7 = r17
            r0 = r18
            r1 = r21
            r5.getClass()
            boolean r2 = r1 instanceof w.U
            if (r2 == 0) goto L1f
            r2 = r1
            w.U r2 = (w.U) r2
            int r3 = r2.f17862w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r3 & r4
            if (r6 == 0) goto L1f
            int r3 = r3 - r4
            r2.f17862w = r3
        L1d:
            r9 = r2
            goto L25
        L1f:
            w.U r2 = new w.U
            r2.<init>(r5, r1)
            goto L1d
        L25:
            java.lang.Object r1 = r9.f17860u
            int r2 = r9.f17862w
            r10 = 0
            m5.y r11 = m5.C1386y.f15098a
            r12 = 2
            r13 = 1
            r5.a r14 = r5.EnumC1580a.f16356q
            if (r2 == 0) goto L4f
            if (r2 == r13) goto L42
            if (r2 != r12) goto L3a
            m5.AbstractC1362a.e(r1)
            return r11
        L3a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L42:
            float r0 = r9.f17859t
            kotlin.jvm.internal.v r2 = r9.f17858s
            w.H0 r3 = r9.f17857r
            b2.a r4 = r9.f17856q
            m5.AbstractC1362a.e(r1)
            goto Lbe
        L4f:
            m5.AbstractC1362a.e(r1)
            kotlin.jvm.internal.y r3 = new kotlin.jvm.internal.y
            r3.<init>()
            r3.f14268q = r0
            r5.g(r0)
            java.lang.Object r0 = r5.f
            O5.e r0 = (O5.e) r0
            w.Q r0 = f(r0)
            if (r0 == 0) goto L73
            r5.g(r0)
            java.lang.Object r1 = r3.f14268q
            w.Q r1 = (w.Q) r1
            w.Q r0 = r1.a(r0)
            r3.f14268q = r0
        L73:
            kotlin.jvm.internal.v r1 = new kotlin.jvm.internal.v
            r1.<init>()
            java.lang.Object r0 = r3.f14268q
            w.Q r0 = (w.Q) r0
            long r12 = r0.f17841a
            long r12 = r7.e(r12)
            float r0 = r7.g(r12)
            r1.f14265q = r0
            boolean r0 = w.P.a(r0)
            if (r0 == 0) goto L90
            goto L137
        L90:
            kotlin.jvm.internal.y r2 = new kotlin.jvm.internal.y
            r2.<init>()
            r0 = 30
            u.l r0 = u.AbstractC1644d.a(r10, r10, r0)
            r2.f14268q = r0
            w.W r0 = new w.W
            r8 = 0
            r4 = r19
            r6 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f17856q = r5
            r9.f17857r = r7
            r9.f17858s = r1
            r9.f17859t = r6
            r15 = 1
            r9.f17862w = r15
            java.lang.Object r0 = r5.h(r7, r0, r9)
            if (r0 != r14) goto Lba
            goto L136
        Lba:
            r2 = r1
            r4 = r5
            r0 = r6
            r3 = r7
        Lbe:
            java.lang.Object r1 = r4.f9976h
            v3.l r1 = (v3.l) r1
            java.lang.Object r5 = r1.f17579r
            w0.c r5 = (w0.C1824c) r5
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
            float r5 = r5.b(r6)
            java.lang.Object r1 = r1.f17580s
            w0.c r1 = (w0.C1824c) r1
            float r1 = r1.b(r6)
            long r5 = l6.d.i(r5, r1)
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 != 0) goto L113
            float r1 = r2.f14265q
            float r1 = java.lang.Math.abs(r1)
            r5 = 100
            float r5 = (float) r5
            float r1 = r1 / r5
            float r0 = java.lang.Math.min(r1, r0)
            float r1 = r2.f14265q
            float r1 = java.lang.Math.signum(r1)
            float r1 = r3.d(r1)
            float r1 = r1 * r0
            r0 = 1000(0x3e8, float:1.401E-42)
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 != 0) goto L102
            r5 = r7
            goto L113
        L102:
            w.d0 r0 = r3.f17793d
            w.d0 r2 = w.EnumC1778d0.f17946r
            if (r0 != r2) goto L10e
            long r0 = l6.d.i(r1, r10)
        L10c:
            r5 = r0
            goto L113
        L10e:
            long r0 = l6.d.i(r10, r1)
            goto L10c
        L113:
            java.io.Serializable r0 = r4.f9973d
            X.c r0 = (X.c) r0
            r1 = 0
            r9.f17856q = r1
            r9.f17857r = r1
            r9.f17858s = r1
            r2 = 2
            r9.f17862w = r2
            java.lang.Object r0 = r0.f14249q
            w.z0 r0 = (w.C1821z0) r0
            u0.d r2 = r0.f18121Q
            M5.w r2 = r2.c()
            w.w0 r3 = new w.w0
            r3.<init>(r0, r5, r1)
            r0 = 3
            M5.AbstractC0263y.t(r2, r1, r1, r3, r0)
            if (r11 != r14) goto L137
        L136:
            return r14
        L137:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.C0690a.b(b2.a, w.H0, w.Q, float, float, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(b2.C0690a r11, kotlin.jvm.internal.y r12, kotlin.jvm.internal.v r13, w.H0 r14, kotlin.jvm.internal.y r15, long r16, s5.c r18) throws java.lang.Throwable {
        /*
            r0 = r16
            r2 = r18
            boolean r3 = r2 instanceof w.X
            if (r3 == 0) goto L17
            r3 = r2
            w.X r3 = (w.X) r3
            int r4 = r3.f17894w
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L17
            int r4 = r4 - r5
            r3.f17894w = r4
            goto L1c
        L17:
            w.X r3 = new w.X
            r3.<init>(r2)
        L1c:
            java.lang.Object r2 = r3.f17893v
            int r4 = r3.f17894w
            r5 = 1
            if (r4 == 0) goto L3f
            if (r4 != r5) goto L37
            kotlin.jvm.internal.y r11 = r3.f17892u
            w.H0 r12 = r3.f17891t
            kotlin.jvm.internal.v r0 = r3.f17890s
            kotlin.jvm.internal.y r1 = r3.f17889r
            b2.a r3 = r3.f17888q
            m5.AbstractC1362a.e(r2)
            r7 = r11
            r6 = r12
            r12 = r1
            r11 = r3
            goto L69
        L37:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3f:
            m5.AbstractC1362a.e(r2)
            r6 = 0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 >= 0) goto L4b
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        L4b:
            w.Y r2 = new w.Y
            r4 = 0
            r2.<init>(r11, r4)
            r3.f17888q = r11
            r3.f17889r = r12
            r3.f17890s = r13
            r3.f17891t = r14
            r3.f17892u = r15
            r3.f17894w = r5
            java.lang.Object r2 = M5.AbstractC0263y.C(r0, r2, r3)
            r5.a r0 = r5.EnumC1580a.f16356q
            if (r2 != r0) goto L66
            return r0
        L66:
            r0 = r13
            r6 = r14
            r7 = r15
        L69:
            w.Q r2 = (w.Q) r2
            if (r2 == 0) goto La3
            java.lang.Object r1 = r12.f14268q
            w.Q r1 = (w.Q) r1
            boolean r1 = r1.f17843c
            long r3 = r2.f17841a
            long r8 = r2.f17842b
            w.Q r10 = new w.Q
            r18 = r1
            r14 = r3
            r16 = r8
            r13 = r10
            r13.<init>(r14, r16, r18)
            r1 = r13
            r12.f14268q = r1
            long r3 = r6.e(r3)
            float r12 = r6.g(r3)
            r0.f14265q = r12
            r12 = 30
            r1 = 0
            u.l r12 = u.AbstractC1644d.a(r1, r1, r12)
            r7.f14268q = r12
            r11.g(r2)
            float r11 = r0.f14265q
            boolean r11 = w.P.a(r11)
            r11 = r11 ^ r5
            goto La4
        La3:
            r11 = 0
        La4:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.C0690a.c(b2.a, kotlin.jvm.internal.y, kotlin.jvm.internal.v, w.H0, kotlin.jvm.internal.y, long, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Q f(O5.e eVar) {
        Q q7 = null;
        I5.j jVarW = K1.w(new C1772a0(new F(1, eVar), null));
        while (jVarW.hasNext()) {
            Q qA = (Q) jVarW.next();
            if (q7 != null) {
                qA = q7.a(qA);
            }
            q7 = qA;
        }
        return q7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FileInputStream d(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e7) {
            String message = e7.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((InterfaceC0692c) this.f9972c).j();
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void e(int i, Serializable serializable) {
        ((Executor) this.f9971b).execute(new b.i(i, 2, this, serializable));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void g(Q q7) {
        l lVar = (l) this.f9976h;
        long j = q7.f17842b;
        long j7 = q7.f17841a;
        ((C1824c) lVar.f17579r).a(j, Float.intBitsToFloat((int) (j7 >> 32)));
        ((C1824c) lVar.f17580s).a(j, Float.intBitsToFloat((int) (j7 & 4294967295L)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(w.H0 r5, w.W r6, s5.c r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof w.C1774b0
            if (r0 == 0) goto L13
            r0 = r7
            w.b0 r0 = (w.C1774b0) r0
            int r1 = r0.f17924t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17924t = r1
            goto L18
        L13:
            w.b0 r0 = new w.b0
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f17922r
            int r1 = r0.f17924t
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            b2.a r5 = r0.f17921q
            m5.AbstractC1362a.e(r7)
            goto L52
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            m5.AbstractC1362a.e(r7)
            r4.f9970a = r2
            w.c0 r7 = new w.c0
            r1 = 0
            r7.<init>(r5, r6, r1)
            r0.f17921q = r4
            r0.f17924t = r2
            M5.p0 r5 = new M5.p0
            q5.h r6 = r0.getContext()
            r1 = 0
            r5.<init>(r6, r0, r1)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.I1.D0(r5, r2, r5, r7)
            r5.a r6 = r5.EnumC1580a.f16356q
            if (r5 != r6) goto L51
            return r6
        L51:
            r5 = r4
        L52:
            r6 = 0
            r5.f9970a = r6
            m5.y r5 = m5.C1386y.f15098a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.C0690a.h(w.H0, w.W, s5.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Serializable] */
    public C0690a(AssetManager assetManager, Executor executor, InterfaceC0692c interfaceC0692c, String str, File file) {
        ?? r12;
        this.f9970a = false;
        this.f9971b = executor;
        this.f9972c = interfaceC0692c;
        this.f9975g = str;
        this.f = file;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            r12 = AbstractC0693d.f9987d;
        } else {
            switch (i) {
                case WorkManagerImpl.CONTENT_URI_TRIGGER_API_LEVEL /* 24 */:
                case 25:
                    r12 = AbstractC0693d.f9990h;
                    break;
                case 26:
                    r12 = AbstractC0693d.f9989g;
                    break;
                case 27:
                    r12 = AbstractC0693d.f;
                    break;
                case 28:
                case 29:
                case 30:
                    r12 = AbstractC0693d.f9988e;
                    break;
                default:
                    r12 = 0;
                    break;
            }
        }
        this.f9973d = r12;
    }
}
