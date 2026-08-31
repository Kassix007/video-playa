package t2;

import B0.G0;
import H2.m;
import I2.z;
import M5.AbstractC0263y;
import M5.H;
import M5.q0;
import R5.n;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.internal.measurement.I1;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import m5.C1371j;
import m5.C1376o;
import v2.C1754b;
import x2.C1886a;
import y2.C1913i;
import z2.C1962a;
import z2.C1964c;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D2.c f16715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1376o f16716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H2.j f16717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final R5.d f16718e;
    public final G0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1617b f16719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f16720h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l(Context context, D2.c cVar, C1376o c1376o, C1376o c1376o2, C1376o c1376o3, C1617b c1617b, H2.j jVar) {
        this.f16714a = context;
        this.f16715b = cVar;
        this.f16716c = c1376o;
        this.f16717d = jVar;
        q0 q0VarC = AbstractC0263y.c();
        T5.e eVar = H.f3811a;
        this.f16718e = AbstractC0263y.a(E3.h.L(q0VarC, n.f7261a.f4044t).plus(new z(this)));
        m mVar = new m(this);
        G0 g02 = new G0(this, mVar);
        this.f = g02;
        I2.f fVar = new I2.f(c1617b);
        fVar.a(new A2.a(2), d6.n.class);
        int i = 5;
        fVar.a(new A2.a(i), String.class);
        fVar.a(new A2.a(1), Uri.class);
        int i7 = 4;
        fVar.a(new A2.a(i7), Uri.class);
        int i8 = 3;
        fVar.a(new A2.a(i8), Integer.class);
        int i9 = 0;
        fVar.a(new A2.a(i9), byte[].class);
        C1371j c1371j = new C1371j(new C1964c(), Uri.class);
        ArrayList arrayList = fVar.f2351c;
        arrayList.add(c1371j);
        arrayList.add(new C1371j(new C1962a(jVar.f2148a), File.class));
        fVar.d(new x2.i(c1376o3, c1376o2, jVar.f2150c), Uri.class);
        fVar.d(new C1886a(i), File.class);
        fVar.d(new C1886a(i9), Uri.class);
        fVar.d(new C1886a(i8), Uri.class);
        fVar.d(new C1886a(6), Uri.class);
        fVar.d(new C1886a(i7), Drawable.class);
        fVar.d(new C1886a(1), Bitmap.class);
        fVar.d(new C1886a(2), ByteBuffer.class);
        C1754b c1754b = new C1754b(jVar.f2151d, jVar.f2152e);
        ArrayList arrayList2 = fVar.f2353e;
        arrayList2.add(c1754b);
        List listE0 = I1.E0(fVar.f2349a);
        this.f16719g = new C1617b(listE0, I1.E0(fVar.f2350b), I1.E0(arrayList), I1.E0(fVar.f2352d), I1.E0(arrayList2));
        this.f16720h = n5.l.v0(listE0, new C1913i(this, mVar, g02));
        new AtomicBoolean(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:81:0x018a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd A[Catch: all -> 0x00da, PHI: r1 r2 r3 r4
  0x00dd: PHI (r1v16 t2.l) = (r1v3 t2.l), (r1v17 t2.l), (r1v18 t2.l) binds: [B:28:0x0075, B:38:0x00c5, B:40:0x00d7] A[DONT_GENERATE, DONT_INLINE]
  0x00dd: PHI (r2v17 t2.c) = (r2v5 t2.c), (r2v29 t2.c), (r2v30 t2.c) binds: [B:28:0x0075, B:38:0x00c5, B:40:0x00d7] A[DONT_GENERATE, DONT_INLINE]
  0x00dd: PHI (r3v10 D2.j) = (r3v19 D2.j), (r3v20 D2.j), (r3v21 D2.j) binds: [B:28:0x0075, B:38:0x00c5, B:40:0x00d7] A[DONT_GENERATE, DONT_INLINE]
  0x00dd: PHI (r4v10 D2.q) = (r4v12 D2.q), (r4v13 D2.q), (r4v14 D2.q) binds: [B:28:0x0075, B:38:0x00c5, B:40:0x00d7] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {all -> 0x00da, blocks: (B:44:0x00dd, B:46:0x00e7, B:47:0x00ea, B:49:0x00f5, B:50:0x00f8, B:35:0x00bc, B:37:0x00c2, B:39:0x00c7, B:85:0x0191, B:86:0x0198), top: B:101:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e7 A[Catch: all -> 0x00da, TryCatch #2 {all -> 0x00da, blocks: (B:44:0x00dd, B:46:0x00e7, B:47:0x00ea, B:49:0x00f5, B:50:0x00f8, B:35:0x00bc, B:37:0x00c2, B:39:0x00c7, B:85:0x0191, B:86:0x0198), top: B:101:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f5 A[Catch: all -> 0x00da, TryCatch #2 {all -> 0x00da, blocks: (B:44:0x00dd, B:46:0x00e7, B:47:0x00ea, B:49:0x00f5, B:50:0x00f8, B:35:0x00bc, B:37:0x00c2, B:39:0x00c7, B:85:0x0191, B:86:0x0198), top: B:101:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0145 A[Catch: all -> 0x016f, TryCatch #6 {all -> 0x016f, blocks: (B:60:0x013f, B:62:0x0145, B:65:0x0157, B:67:0x0161, B:69:0x0168, B:66:0x015b, B:74:0x0171, B:76:0x0175, B:79:0x0184, B:80:0x0189), top: B:107:0x013f }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0168 A[Catch: all -> 0x016f, TryCatch #6 {all -> 0x016f, blocks: (B:60:0x013f, B:62:0x0145, B:65:0x0157, B:67:0x0161, B:69:0x0168, B:66:0x015b, B:74:0x0171, B:76:0x0175, B:79:0x0184, B:80:0x0189), top: B:107:0x013f }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0171 A[Catch: all -> 0x016f, TryCatch #6 {all -> 0x016f, blocks: (B:60:0x013f, B:62:0x0145, B:65:0x0157, B:67:0x0161, B:69:0x0168, B:66:0x015b, B:74:0x0171, B:76:0x0175, B:79:0x0184, B:80:0x0189), top: B:107:0x013f }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019d A[Catch: all -> 0x01af, TRY_LEAVE, TryCatch #5 {all -> 0x01af, blocks: (B:87:0x0199, B:89:0x019d, B:94:0x01b1, B:95:0x01b9), top: B:106:0x0199 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b1 A[Catch: all -> 0x01af, TRY_ENTER, TryCatch #5 {all -> 0x01af, blocks: (B:87:0x0199, B:89:0x019d, B:94:0x01b1, B:95:0x01b9), top: B:106:0x0199 }] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, t2.l] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, t2.c] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [D2.j] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v6, types: [D2.q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(t2.l r21, D2.j r22, int r23, s5.c r24) {
        /*
            r1 = r21
            r4 = r22
            r0 = r24
            boolean r2 = r0 instanceof t2.j
            if (r2 == 0) goto L1a
            r2 = r0
            t2.j r2 = (t2.j) r2
            int r3 = r2.f16707x
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r3 & r5
            if (r6 == 0) goto L1a
            int r3 = r3 - r5
            r2.f16707x = r3
        L18:
            r0 = r2
            goto L20
        L1a:
            t2.j r2 = new t2.j
            r2.<init>(r1, r0)
            goto L18
        L20:
            java.lang.Object r2 = r0.f16705v
            int r3 = r0.f16707x
            r8 = 3
            r9 = 2
            r10 = 1
            r11 = 0
            r5.a r12 = r5.EnumC1580a.f16356q
            if (r3 == 0) goto L78
            if (r3 == r10) goto L6a
            if (r3 == r9) goto L4d
            if (r3 != r8) goto L45
            t2.c r1 = r0.f16703t
            D2.j r3 = r0.f16702s
            D2.q r4 = r0.f16701r
            t2.l r5 = r0.f16700q
            m5.AbstractC1362a.e(r2)     // Catch: java.lang.Throwable -> L40
            r15 = r5
            goto L13f
        L40:
            r0 = move-exception
            r2 = r1
            r1 = r5
            goto L199
        L45:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L4d:
            android.graphics.Bitmap r1 = r0.f16704u
            t2.c r3 = r0.f16703t
            D2.j r4 = r0.f16702s
            D2.q r5 = r0.f16701r
            t2.l r6 = r0.f16700q
            m5.AbstractC1362a.e(r2)     // Catch: java.lang.Throwable -> L63
            r18 = r1
            r17 = r3
            r14 = r4
            r4 = r5
            r15 = r6
            goto L117
        L63:
            r0 = move-exception
            r2 = r3
            r3 = r4
            r4 = r5
            r1 = r6
            goto L199
        L6a:
            t2.c r1 = r0.f16703t
            D2.j r3 = r0.f16702s
            D2.q r4 = r0.f16701r
            t2.l r5 = r0.f16700q
            m5.AbstractC1362a.e(r2)     // Catch: java.lang.Throwable -> L40
            r2 = r1
            r1 = r5
            goto Ldd
        L78:
            m5.AbstractC1362a.e(r2)
            B0.G0 r2 = r1.f
            q5.h r3 = r0.getContext()
            M5.b0 r7 = M5.AbstractC0263y.n(r3)
            r2.getClass()
            androidx.lifecycle.q r6 = r4.f1414v
            F2.b r3 = r4.f1398c
            boolean r5 = r3 instanceof F2.a
            if (r5 == 0) goto La3
            D2.t r5 = new D2.t
            java.lang.Object r2 = r2.f234r
            t2.l r2 = (t2.l) r2
            F2.a r3 = (F2.a) r3
            r20 = r3
            r3 = r2
            r2 = r5
            r5 = r20
            r2.<init>(r3, r4, r5, r6, r7)
        La1:
            r4 = r2
            goto La9
        La3:
            D2.a r2 = new D2.a
            r2.<init>(r6, r7)
            goto La1
        La9:
            r4.f()
            D2.h r2 = D2.j.a(r22)
            D2.c r3 = r1.f16715b
            r2.f1382b = r3
            r2.f1394q = r11
            D2.j r3 = r2.a()
            t2.c r2 = t2.C1618c.f16681a
            java.lang.Object r5 = r3.f1397b     // Catch: java.lang.Throwable -> Lda
            D2.l r6 = D2.l.f1419b     // Catch: java.lang.Throwable -> Lda
            if (r5 == r6) goto L191
            r4.start()     // Catch: java.lang.Throwable -> Lda
            if (r23 != 0) goto Ldd
            androidx.lifecycle.q r5 = r3.f1414v     // Catch: java.lang.Throwable -> Lda
            r0.f16700q = r1     // Catch: java.lang.Throwable -> Lda
            r0.f16701r = r4     // Catch: java.lang.Throwable -> Lda
            r0.f16702s = r3     // Catch: java.lang.Throwable -> Lda
            r0.f16703t = r2     // Catch: java.lang.Throwable -> Lda
            r0.f16707x = r10     // Catch: java.lang.Throwable -> Lda
            java.lang.Object r5 = com.google.android.gms.internal.measurement.P1.f(r5, r0)     // Catch: java.lang.Throwable -> Lda
            if (r5 != r12) goto Ldd
            goto L13b
        Lda:
            r0 = move-exception
            goto L199
        Ldd:
            m5.o r5 = r1.f16716c     // Catch: java.lang.Throwable -> Lda
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> Lda
            B2.c r5 = (B2.c) r5     // Catch: java.lang.Throwable -> Lda
            if (r5 == 0) goto Lea
            r3.getClass()     // Catch: java.lang.Throwable -> Lda
        Lea:
            D2.c r5 = r3.f1395A     // Catch: java.lang.Throwable -> Lda
            r5.getClass()     // Catch: java.lang.Throwable -> Lda
            D2.c r5 = H2.d.f2135a     // Catch: java.lang.Throwable -> Lda
            F2.b r5 = r3.f1398c     // Catch: java.lang.Throwable -> Lda
            if (r5 == 0) goto Lf8
            r5.d(r11)     // Catch: java.lang.Throwable -> Lda
        Lf8:
            r2.getClass()     // Catch: java.lang.Throwable -> Lda
            E2.i r5 = r3.f1415w     // Catch: java.lang.Throwable -> Lda
            r0.f16700q = r1     // Catch: java.lang.Throwable -> Lda
            r0.f16701r = r4     // Catch: java.lang.Throwable -> Lda
            r0.f16702s = r3     // Catch: java.lang.Throwable -> Lda
            r0.f16703t = r2     // Catch: java.lang.Throwable -> Lda
            r0.f16704u = r11     // Catch: java.lang.Throwable -> Lda
            r0.f16707x = r9     // Catch: java.lang.Throwable -> Lda
            java.lang.Object r5 = r5.f(r0)     // Catch: java.lang.Throwable -> Lda
            if (r5 != r12) goto L110
            goto L13b
        L110:
            r15 = r1
            r17 = r2
            r14 = r3
            r2 = r5
            r18 = r11
        L117:
            r16 = r2
            E2.h r16 = (E2.h) r16     // Catch: java.lang.Throwable -> L18d
            r17.getClass()     // Catch: java.lang.Throwable -> L18d
            M5.s r1 = r14.f1410r     // Catch: java.lang.Throwable -> L18d
            t2.k r13 = new t2.k     // Catch: java.lang.Throwable -> L18d
            r19 = 0
            r13.<init>(r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> L18d
            r2 = r17
            r0.f16700q = r15     // Catch: java.lang.Throwable -> L18a
            r0.f16701r = r4     // Catch: java.lang.Throwable -> L18a
            r0.f16702s = r14     // Catch: java.lang.Throwable -> L18a
            r0.f16703t = r2     // Catch: java.lang.Throwable -> L18a
            r0.f16704u = r11     // Catch: java.lang.Throwable -> L18a
            r0.f16707x = r8     // Catch: java.lang.Throwable -> L18a
            java.lang.Object r0 = M5.AbstractC0263y.B(r1, r13, r0)     // Catch: java.lang.Throwable -> L18a
            if (r0 != r12) goto L13c
        L13b:
            return r12
        L13c:
            r1 = r2
            r3 = r14
            r2 = r0
        L13f:
            D2.k r2 = (D2.k) r2     // Catch: java.lang.Throwable -> L16f
            boolean r0 = r2 instanceof D2.r     // Catch: java.lang.Throwable -> L16f
            if (r0 == 0) goto L171
            r0 = r2
            D2.r r0 = (D2.r) r0     // Catch: java.lang.Throwable -> L16f
            F2.b r5 = r3.f1398c     // Catch: java.lang.Throwable -> L16f
            r15.getClass()     // Catch: java.lang.Throwable -> L16f
            D2.j r6 = r0.f1437b     // Catch: java.lang.Throwable -> L16f
            android.graphics.drawable.Drawable r7 = r0.f1436a     // Catch: java.lang.Throwable -> L16f
            boolean r8 = r5 instanceof F2.a     // Catch: java.lang.Throwable -> L16f
            if (r8 != 0) goto L15b
            if (r5 == 0) goto L161
        L157:
            r5.j(r7)     // Catch: java.lang.Throwable -> L16f
            goto L161
        L15b:
            G2.a r8 = r6.f1402h     // Catch: java.lang.Throwable -> L16f
            r8.getClass()     // Catch: java.lang.Throwable -> L16f
            goto L157
        L161:
            r1.getClass()     // Catch: java.lang.Throwable -> L16f
            D2.i r5 = r6.f1399d     // Catch: java.lang.Throwable -> L16f
            if (r5 == 0) goto L180
            r5.a(r0)     // Catch: java.lang.Throwable -> L16f
            goto L180
        L16c:
            r2 = r1
        L16d:
            r1 = r15
            goto L199
        L16f:
            r0 = move-exception
            goto L16c
        L171:
            boolean r0 = r2 instanceof D2.e     // Catch: java.lang.Throwable -> L16f
            if (r0 == 0) goto L184
            r0 = r2
            D2.e r0 = (D2.e) r0     // Catch: java.lang.Throwable -> L16f
            F2.b r5 = r3.f1398c     // Catch: java.lang.Throwable -> L16f
            r15.getClass()     // Catch: java.lang.Throwable -> L16f
            c(r0, r5, r1)     // Catch: java.lang.Throwable -> L16f
        L180:
            r4.a()
            return r2
        L184:
            C2.e r0 = new C2.e     // Catch: java.lang.Throwable -> L16f
            r0.<init>()     // Catch: java.lang.Throwable -> L16f
            throw r0     // Catch: java.lang.Throwable -> L16f
        L18a:
            r0 = move-exception
        L18b:
            r3 = r14
            goto L16d
        L18d:
            r0 = move-exception
            r2 = r17
            goto L18b
        L191:
            D2.m r0 = new D2.m     // Catch: java.lang.Throwable -> Lda
            java.lang.String r5 = "The request's data is null."
            r0.<init>(r5)     // Catch: java.lang.Throwable -> Lda
            throw r0     // Catch: java.lang.Throwable -> Lda
        L199:
            boolean r5 = r0 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L1af
            if (r5 != 0) goto L1b1
            B0.G0 r1 = r1.f     // Catch: java.lang.Throwable -> L1af
            r1.getClass()     // Catch: java.lang.Throwable -> L1af
            D2.e r0 = B0.G0.r(r3, r0)     // Catch: java.lang.Throwable -> L1af
            F2.b r1 = r3.f1398c     // Catch: java.lang.Throwable -> L1af
            c(r0, r1, r2)     // Catch: java.lang.Throwable -> L1af
            r4.a()
            return r0
        L1af:
            r0 = move-exception
            goto L1ba
        L1b1:
            r1.getClass()     // Catch: java.lang.Throwable -> L1af
            r2.getClass()     // Catch: java.lang.Throwable -> L1af
            D2.i r1 = r3.f1399d     // Catch: java.lang.Throwable -> L1af
            throw r0     // Catch: java.lang.Throwable -> L1af
        L1ba:
            r4.a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.l.a(t2.l, D2.j, int, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(D2.e r3, F2.b r4, t2.C1618c r5) {
        /*
            D2.j r0 = r3.f1377b
            android.graphics.drawable.Drawable r1 = r3.f1376a
            boolean r2 = r4 instanceof F2.a
            if (r2 != 0) goto Lb
            if (r4 == 0) goto L13
            goto L10
        Lb:
            G2.a r2 = r0.f1402h
            r2.getClass()
        L10:
            r4.o(r1)
        L13:
            r5.getClass()
            D2.i r4 = r0.f1399d
            if (r4 == 0) goto L1d
            r4.b(r3)
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.l.c(D2.e, F2.b, t2.c):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final D2.l b(D2.j jVar) {
        AbstractC0263y.d(this.f16718e, null, new f(jVar, null, this), 3);
        F2.b bVar = jVar.f1398c;
        return bVar instanceof F2.a ? H2.f.c(((F2.a) bVar).f1946r).a() : new D2.l(1);
    }
}
