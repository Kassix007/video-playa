package j3;

import U.l;
import Z.m;
import a3.C;
import a3.C0620A;
import a3.C0632k;
import a3.y;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import b3.C0698a;
import d3.r;
import java.util.HashMap;
import n3.C1395a;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final C0698a f13780D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Rect f13781E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Rect f13782F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final RectF f13783G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final C0620A f13784H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public r f13785I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public r f13786J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final d3.h f13787K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public n3.h f13788L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public l f13789M;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d(y yVar, e eVar) {
        super(yVar, eVar);
        this.f13780D = new C0698a(3, 0);
        this.f13781E = new Rect();
        this.f13782F = new Rect();
        this.f13783G = new RectF();
        String str = eVar.f13795g;
        C0632k c0632k = yVar.f8920q;
        this.f13784H = c0632k == null ? null : (C0620A) ((HashMap) c0632k.c()).get(str);
        L0.l lVar = this.f13759p.f13810x;
        if (lVar != null) {
            this.f13787K = new d3.h(this, this, lVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j3.b, c3.f
    public final void a(RectF rectF, Matrix matrix, boolean z5) {
        Bitmap bitmapS;
        super.a(rectF, matrix, z5);
        C0620A c0620a = this.f13784H;
        if (c0620a != null) {
            int i = c0620a.f8755b;
            int i7 = c0620a.f8754a;
            float fC = n3.i.c();
            if (this.f13758o.f8888C || (bitmapS = s()) == null) {
                rectF.set(0.0f, 0.0f, i7 * fC, i * fC);
            } else {
                rectF.set(0.0f, 0.0f, bitmapS.getWidth() * fC, bitmapS.getHeight() * fC);
            }
            this.f13757n.mapRect(rectF);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j3.b, g3.f
    public final void f(m mVar, Object obj) {
        super.f(mVar, obj);
        if (obj == C.f8764F) {
            this.f13785I = new r(mVar, null);
            return;
        }
        if (obj == C.f8767I) {
            this.f13786J = new r(mVar, null);
            return;
        }
        d3.h hVar = this.f13787K;
        if (obj == 5 && hVar != null) {
            hVar.f12240c.j(mVar);
            return;
        }
        if (obj == C.f8760B && hVar != null) {
            hVar.c(mVar);
            return;
        }
        if (obj == C.f8761C && hVar != null) {
            hVar.f12242e.j(mVar);
            return;
        }
        if (obj == C.f8762D && hVar != null) {
            hVar.f.j(mVar);
        } else {
            if (obj != C.f8763E || hVar == null) {
                return;
            }
            hVar.f12243g.j(mVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j3.b
    public final void k(Canvas canvas, Matrix matrix, int i, C1395a c1395a) {
        C0620A c0620a;
        Bitmap bitmapS = s();
        if (bitmapS == null || bitmapS.isRecycled() || (c0620a = this.f13784H) == null) {
            return;
        }
        float fC = n3.i.c();
        C0698a c0698a = this.f13780D;
        c0698a.setAlpha(i);
        r rVar = this.f13785I;
        if (rVar != null) {
            c0698a.setColorFilter((ColorFilter) rVar.e());
        }
        d3.h hVar = this.f13787K;
        if (hVar != null) {
            c1395a = hVar.a(matrix, i);
        }
        int width = bitmapS.getWidth();
        int height = bitmapS.getHeight();
        Rect rect = this.f13781E;
        rect.set(0, 0, width, height);
        boolean z5 = this.f13758o.f8888C;
        Rect rect2 = this.f13782F;
        if (z5) {
            rect2.set(0, 0, (int) (c0620a.f8754a * fC), (int) (c0620a.f8755b * fC));
        } else {
            rect2.set(0, 0, (int) (bitmapS.getWidth() * fC), (int) (bitmapS.getHeight() * fC));
        }
        boolean z6 = c1395a != null;
        if (z6) {
            if (this.f13788L == null) {
                this.f13788L = new n3.h();
            }
            if (this.f13789M == null) {
                this.f13789M = new l(6);
            }
            l lVar = this.f13789M;
            lVar.f7510q = 255;
            lVar.f7511r = null;
            c1395a.getClass();
            C1395a c1395a2 = new C1395a(c1395a);
            lVar.f7511r = c1395a2;
            c1395a2.b(i);
            float f = rect2.left;
            float f7 = rect2.top;
            float f8 = rect2.right;
            float f9 = rect2.bottom;
            RectF rectF = this.f13783G;
            rectF.set(f, f7, f8, f9);
            matrix.mapRect(rectF);
            canvas = this.f13788L.e(canvas, rectF, this.f13789M);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(bitmapS, rect, rect2, c0698a);
        if (z6) {
            this.f13788L.c();
            if (this.f13788L.f15178c == 4) {
                return;
            }
        }
        canvas.restore();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap s() {
        /*
            r15 = this;
            d3.r r0 = r15.f13786J
            if (r0 == 0) goto Ld
            java.lang.Object r0 = r0.e()
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto Ld
            return r0
        Ld:
            j3.e r0 = r15.f13759p
            java.lang.String r0 = r0.f13795g
            a3.y r1 = r15.f13758o
            f3.a r2 = r1.f8926w
            r3 = 0
            if (r2 == 0) goto L30
            android.content.Context r4 = r1.h()
            android.content.Context r2 = r2.f12715a
            if (r4 != 0) goto L23
            if (r2 != 0) goto L2e
            goto L30
        L23:
            boolean r5 = r2 instanceof android.app.Application
            if (r5 == 0) goto L2b
            android.content.Context r4 = r4.getApplicationContext()
        L2b:
            if (r4 != r2) goto L2e
            goto L30
        L2e:
            r1.f8926w = r3
        L30:
            f3.a r2 = r1.f8926w
            if (r2 != 0) goto L47
            f3.a r2 = new f3.a
            android.graphics.drawable.Drawable$Callback r4 = r1.getCallback()
            java.lang.String r5 = r1.f8927x
            a3.k r6 = r1.f8920q
            java.util.Map r6 = r6.c()
            r2.<init>(r4, r5, r6)
            r1.f8926w = r2
        L47:
            f3.a r1 = r1.f8926w
            if (r1 == 0) goto Lb6
            java.lang.String r2 = r1.f12716b
            java.lang.String r4 = "`."
            java.lang.String r5 = "Unable to decode image `"
            java.lang.String r6 = "` is null."
            java.lang.String r7 = "Decoded image `"
            java.util.Map r8 = r1.f12717c
            java.lang.Object r8 = r8.get(r0)
            a3.A r8 = (a3.C0620A) r8
            if (r8 != 0) goto L60
            goto Lb6
        L60:
            int r9 = r8.f8755b
            int r10 = r8.f8754a
            android.graphics.Bitmap r11 = r8.f
            if (r11 == 0) goto L6a
            goto L15d
        L6a:
            android.content.Context r11 = r1.f12715a
            if (r11 != 0) goto L6f
            goto Lb6
        L6f:
            java.lang.String r8 = r8.f8757d
            android.graphics.BitmapFactory$Options r12 = new android.graphics.BitmapFactory$Options
            r12.<init>()
            r13 = 1
            r12.inScaled = r13
            r14 = 160(0xa0, float:2.24E-43)
            r12.inDensity = r14
            java.lang.String r14 = "data:"
            boolean r14 = r8.startsWith(r14)
            if (r14 == 0) goto Leb
            java.lang.String r14 = "base64,"
            int r14 = r8.indexOf(r14)
            if (r14 <= 0) goto Leb
            r2 = 44
            int r2 = r8.indexOf(r2)     // Catch: java.lang.IllegalArgumentException -> Le4
            int r2 = r2 + r13
            java.lang.String r2 = r8.substring(r2)     // Catch: java.lang.IllegalArgumentException -> Le4
            r8 = 0
            byte[] r2 = android.util.Base64.decode(r2, r8)     // Catch: java.lang.IllegalArgumentException -> Le4
            int r11 = r2.length     // Catch: java.lang.IllegalArgumentException -> Ld0
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeByteArray(r2, r8, r11, r12)     // Catch: java.lang.IllegalArgumentException -> Ld0
            if (r2 != 0) goto Lb9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r7)
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            n3.c.b(r0)
        Lb6:
            r11 = r3
            goto L15d
        Lb9:
            android.graphics.Bitmap r11 = n3.i.d(r2, r10, r9)
            java.lang.Object r2 = f3.C1063a.f12714d
            monitor-enter(r2)
            java.util.Map r1 = r1.f12717c     // Catch: java.lang.Throwable -> Lcd
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> Lcd
            a3.A r0 = (a3.C0620A) r0     // Catch: java.lang.Throwable -> Lcd
            r0.f = r11     // Catch: java.lang.Throwable -> Lcd
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lcd
            goto L15d
        Lcd:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lcd
            throw r0
        Ld0:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r5)
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = r2.toString()
            n3.c.c(r0, r1)
            goto Lb6
        Le4:
            r0 = move-exception
            java.lang.String r1 = "data URL did not have correct base64 format."
            n3.c.c(r1, r0)
            goto Lb6
        Leb:
            boolean r13 = android.text.TextUtils.isEmpty(r2)     // Catch: java.io.IOException -> L14c
            if (r13 != 0) goto L14e
            android.content.res.AssetManager r11 = r11.getAssets()     // Catch: java.io.IOException -> L14c
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L14c
            r13.<init>()     // Catch: java.io.IOException -> L14c
            r13.append(r2)     // Catch: java.io.IOException -> L14c
            r13.append(r8)     // Catch: java.io.IOException -> L14c
            java.lang.String r2 = r13.toString()     // Catch: java.io.IOException -> L14c
            java.io.InputStream r2 = r11.open(r2)     // Catch: java.io.IOException -> L14c
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r2, r3, r12)     // Catch: java.lang.IllegalArgumentException -> L137
            if (r2 != 0) goto L121
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r7)
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            n3.c.b(r0)
            goto Lb6
        L121:
            android.graphics.Bitmap r11 = n3.i.d(r2, r10, r9)
            java.lang.Object r2 = f3.C1063a.f12714d
            monitor-enter(r2)
            java.util.Map r1 = r1.f12717c     // Catch: java.lang.Throwable -> L134
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L134
            a3.A r0 = (a3.C0620A) r0     // Catch: java.lang.Throwable -> L134
            r0.f = r11     // Catch: java.lang.Throwable -> L134
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L134
            goto L15d
        L134:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L134
            throw r0
        L137:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r5)
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = r2.toString()
            n3.c.c(r0, r1)
            goto Lb6
        L14c:
            r0 = move-exception
            goto L156
        L14e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.io.IOException -> L14c
            java.lang.String r1 = "You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder"
            r0.<init>(r1)     // Catch: java.io.IOException -> L14c
            throw r0     // Catch: java.io.IOException -> L14c
        L156:
            java.lang.String r1 = "Unable to open asset."
            n3.c.c(r1, r0)
            goto Lb6
        L15d:
            if (r11 == 0) goto L160
            return r11
        L160:
            a3.A r0 = r15.f13784H
            if (r0 == 0) goto L167
            android.graphics.Bitmap r0 = r0.f
            return r0
        L167:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.d.s():android.graphics.Bitmap");
    }
}
