package n3;

import U.l;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import b3.C0698a;
import m0.AbstractC1352g;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Matrix f15174B = new Matrix();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public C1395a f15175A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f15176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f15177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RectF f15179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RectF f15180e;
    public Rect f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RectF f15181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RectF f15182h;
    public Rect i;
    public RectF j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C0698a f15183k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Bitmap f15184l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Canvas f15185m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Rect f15186n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0698a f15187o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Matrix f15188p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float[] f15189q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Bitmap f15190r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Bitmap f15191s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Canvas f15192t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Canvas f15193u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C0698a f15194v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public BlurMaskFilter f15195w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f15196x = 0.0f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public RenderNode f15197y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public RenderNode f15198z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Bitmap a(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap(Math.max((int) Math.ceil(((double) rectF.width()) * 1.05d), 1), Math.max((int) Math.ceil(((double) rectF.height()) * 1.05d), 1), config);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean d(Bitmap bitmap, RectF rectF) {
        return bitmap == null || rectF.width() >= ((float) bitmap.getWidth()) || rectF.height() >= ((float) bitmap.getHeight()) || rectF.width() < ((float) bitmap.getWidth()) * 0.75f || rectF.height() < ((float) bitmap.getHeight()) * 0.75f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final RectF b(RectF rectF, C1395a c1395a) {
        if (this.f15180e == null) {
            this.f15180e = new RectF();
        }
        if (this.f15181g == null) {
            this.f15181g = new RectF();
        }
        this.f15180e.set(rectF);
        this.f15180e.offsetTo(rectF.left + c1395a.f15148b, rectF.top + c1395a.f15149c);
        RectF rectF2 = this.f15180e;
        float f = c1395a.f15147a;
        rectF2.inset(-f, -f);
        this.f15181g.set(rectF);
        this.f15180e.union(this.f15181g);
        return this.f15180e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        float f;
        C0698a c0698a;
        if (this.f15176a == null || this.f15177b == null || this.f15189q == null || this.f15179d == null) {
            throw new IllegalStateException("OffscreenBitmap: finish() call without matching start()");
        }
        int iA = O.c.a(this.f15178c);
        if (iA == 0 || iA == 1) {
            this.f15176a.restore();
        } else {
            if (iA != 2) {
                if (iA == 3) {
                    if (this.f15197y == null) {
                        throw new IllegalStateException("RenderNode is not ready; should've been initialized at start() time");
                    }
                    int i = Build.VERSION.SDK_INT;
                    if (i < 29) {
                        throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                    }
                    this.f15176a.save();
                    Canvas canvas = this.f15176a;
                    float[] fArr = this.f15189q;
                    canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                    this.f15197y.endRecording();
                    if (this.f15177b.h()) {
                        Canvas canvas2 = this.f15176a;
                        C1395a c1395a = (C1395a) this.f15177b.f7511r;
                        if (this.f15197y == null || this.f15198z == null) {
                            throw new IllegalStateException("Cannot render to render node outside a start()/finish() block");
                        }
                        if (i < 31) {
                            throw new RuntimeException("RenderEffect is not supported on API level <31");
                        }
                        float[] fArr2 = this.f15189q;
                        float f7 = fArr2 != null ? fArr2[0] : 1.0f;
                        f = fArr2 != null ? fArr2[4] : 1.0f;
                        C1395a c1395a2 = this.f15175A;
                        if (c1395a2 == null || c1395a.f15147a != c1395a2.f15147a || c1395a.f15148b != c1395a2.f15148b || c1395a.f15149c != c1395a2.f15149c || c1395a.f15150d != c1395a2.f15150d) {
                            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(c1395a.f15150d, PorterDuff.Mode.SRC_IN));
                            float f8 = c1395a.f15147a;
                            if (f8 > 0.0f) {
                                float f9 = ((f7 + f) * f8) / 2.0f;
                                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                renderEffectCreateColorFilterEffect = RenderEffect.createBlurEffect(f9, f9, renderEffectCreateColorFilterEffect, Shader.TileMode.CLAMP);
                            }
                            this.f15198z.setRenderEffect(renderEffectCreateColorFilterEffect);
                            this.f15175A = c1395a;
                        }
                        RectF rectFB = b(this.f15179d, c1395a);
                        RectF rectF = new RectF(rectFB.left * f7, rectFB.top * f, rectFB.right * f7, rectFB.bottom * f);
                        this.f15198z.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
                        RecordingCanvas recordingCanvasBeginRecording = this.f15198z.beginRecording((int) rectF.width(), (int) rectF.height());
                        recordingCanvasBeginRecording.translate((c1395a.f15148b * f7) + (-rectF.left), (c1395a.f15149c * f) + (-rectF.top));
                        recordingCanvasBeginRecording.drawRenderNode(this.f15197y);
                        this.f15198z.endRecording();
                        canvas2.save();
                        canvas2.translate(rectF.left, rectF.top);
                        canvas2.drawRenderNode(this.f15198z);
                        canvas2.restore();
                    }
                    this.f15176a.drawRenderNode(this.f15197y);
                    this.f15176a.restore();
                }
            } else {
                if (this.f15184l == null) {
                    throw new IllegalStateException("Bitmap is not ready; should've been initialized at start() time");
                }
                if (this.f15177b.h()) {
                    Canvas canvas3 = this.f15176a;
                    C1395a c1395a3 = (C1395a) this.f15177b.f7511r;
                    RectF rectF2 = this.f15179d;
                    if (rectF2 == null || this.f15184l == null) {
                        throw new IllegalStateException("Cannot render to bitmap outside a start()/finish() block");
                    }
                    RectF rectFB2 = b(rectF2, c1395a3);
                    if (this.f == null) {
                        this.f = new Rect();
                    }
                    this.f.set((int) Math.floor(rectFB2.left), (int) Math.floor(rectFB2.top), (int) Math.ceil(rectFB2.right), (int) Math.ceil(rectFB2.bottom));
                    float[] fArr3 = this.f15189q;
                    float f10 = fArr3 != null ? fArr3[0] : 1.0f;
                    f = fArr3 != null ? fArr3[4] : 1.0f;
                    if (this.f15182h == null) {
                        this.f15182h = new RectF();
                    }
                    this.f15182h.set(rectFB2.left * f10, rectFB2.top * f, rectFB2.right * f10, rectFB2.bottom * f);
                    if (this.i == null) {
                        this.i = new Rect();
                    }
                    this.i.set(0, 0, Math.round(this.f15182h.width()), Math.round(this.f15182h.height()));
                    if (d(this.f15190r, this.f15182h)) {
                        Bitmap bitmap = this.f15190r;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        Bitmap bitmap2 = this.f15191s;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        this.f15190r = a(this.f15182h, Bitmap.Config.ARGB_8888);
                        this.f15191s = a(this.f15182h, Bitmap.Config.ALPHA_8);
                        this.f15192t = new Canvas(this.f15190r);
                        this.f15193u = new Canvas(this.f15191s);
                    } else {
                        Canvas canvas4 = this.f15192t;
                        if (canvas4 == null || this.f15193u == null || (c0698a = this.f15187o) == null) {
                            throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
                        }
                        canvas4.drawRect(this.i, c0698a);
                        this.f15193u.drawRect(this.i, this.f15187o);
                    }
                    if (this.f15191s == null) {
                        throw new IllegalStateException("Expected to have allocated a shadow mask bitmap");
                    }
                    if (this.f15194v == null) {
                        this.f15194v = new C0698a(1, 0);
                    }
                    RectF rectF3 = this.f15179d;
                    this.f15193u.drawBitmap(this.f15184l, Math.round((rectF3.left - rectFB2.left) * f10), Math.round((rectF3.top - rectFB2.top) * f), (Paint) null);
                    if (this.f15195w == null || this.f15196x != c1395a3.f15147a) {
                        float f11 = ((f10 + f) * c1395a3.f15147a) / 2.0f;
                        if (f11 > 0.0f) {
                            this.f15195w = new BlurMaskFilter(f11, BlurMaskFilter.Blur.NORMAL);
                        } else {
                            this.f15195w = null;
                        }
                        this.f15196x = c1395a3.f15147a;
                    }
                    this.f15194v.setColor(c1395a3.f15150d);
                    if (c1395a3.f15147a > 0.0f) {
                        this.f15194v.setMaskFilter(this.f15195w);
                    } else {
                        this.f15194v.setMaskFilter(null);
                    }
                    this.f15194v.setFilterBitmap(true);
                    this.f15192t.drawBitmap(this.f15191s, Math.round(c1395a3.f15148b * f10), Math.round(c1395a3.f15149c * f), this.f15194v);
                    canvas3.drawBitmap(this.f15190r, this.i, this.f, this.f15183k);
                }
                if (this.f15186n == null) {
                    this.f15186n = new Rect();
                }
                this.f15186n.set(0, 0, (int) (this.f15179d.width() * this.f15189q[0]), (int) (this.f15179d.height() * this.f15189q[4]));
                this.f15176a.drawBitmap(this.f15184l, this.f15186n, this.f15179d, this.f15183k);
            }
        }
        this.f15176a = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Canvas e(Canvas canvas, RectF rectF, l lVar) {
        if (this.f15176a != null) {
            throw new IllegalStateException("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
        }
        if (this.f15189q == null) {
            this.f15189q = new float[9];
        }
        if (this.f15188p == null) {
            this.f15188p = new Matrix();
        }
        canvas.getMatrix(this.f15188p);
        this.f15188p.getValues(this.f15189q);
        float[] fArr = this.f15189q;
        float f = fArr[0];
        int i = 4;
        float f7 = fArr[4];
        if (this.j == null) {
            this.j = new RectF();
        }
        this.j.set(rectF.left * f, rectF.top * f7, rectF.right * f, rectF.bottom * f7);
        this.f15176a = canvas;
        this.f15177b = lVar;
        if (lVar.f7510q >= 255 && !lVar.h()) {
            i = 1;
        } else if (lVar.h()) {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 < 29 || !canvas.isHardwareAccelerated() || i7 <= 31) {
                i = 3;
            }
        } else {
            i = 2;
        }
        this.f15178c = i;
        if (this.f15179d == null) {
            this.f15179d = new RectF();
        }
        this.f15179d.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        if (this.f15183k == null) {
            this.f15183k = new C0698a();
        }
        this.f15183k.reset();
        int iA = O.c.a(this.f15178c);
        if (iA == 0) {
            canvas.save();
            return canvas;
        }
        if (iA == 1) {
            this.f15183k.setAlpha(lVar.f7510q);
            this.f15183k.setColorFilter(null);
            C0698a c0698a = this.f15183k;
            Matrix matrix = i.f15199a;
            canvas.saveLayer(rectF, c0698a);
            return canvas;
        }
        Matrix matrix2 = f15174B;
        if (iA == 2) {
            if (this.f15187o == null) {
                C0698a c0698a2 = new C0698a();
                this.f15187o = c0698a2;
                c0698a2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            if (d(this.f15184l, this.j)) {
                Bitmap bitmap = this.f15184l;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.f15184l = a(this.j, Bitmap.Config.ARGB_8888);
                this.f15185m = new Canvas(this.f15184l);
            } else {
                Canvas canvas2 = this.f15185m;
                if (canvas2 == null) {
                    throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas ready");
                }
                canvas2.setMatrix(matrix2);
                this.f15185m.drawRect(-1.0f, -1.0f, this.j.width() + 1.0f, this.j.height() + 1.0f, this.f15187o);
            }
            n1.c.a(0, this.f15183k);
            this.f15183k.setColorFilter(null);
            this.f15183k.setAlpha(lVar.f7510q);
            Canvas canvas3 = this.f15185m;
            canvas3.scale(f, f7);
            canvas3.translate(-rectF.left, -rectF.top);
            return canvas3;
        }
        if (iA != 3) {
            throw new RuntimeException("Invalid render strategy for OffscreenLayer");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
        }
        if (this.f15197y == null) {
            this.f15197y = AbstractC1352g.q();
        }
        if (lVar.h() && this.f15198z == null) {
            this.f15198z = AbstractC1352g.w();
            this.f15175A = null;
        }
        this.f15197y.setAlpha(lVar.f7510q / 255.0f);
        if (lVar.h()) {
            RenderNode renderNode = this.f15198z;
            if (renderNode == null) {
                throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
            }
            renderNode.setAlpha(lVar.f7510q / 255.0f);
        }
        this.f15197y.setHasOverlappingRendering(true);
        RenderNode renderNode2 = this.f15197y;
        RectF rectF2 = this.j;
        renderNode2.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        RecordingCanvas recordingCanvasBeginRecording = this.f15197y.beginRecording((int) this.j.width(), (int) this.j.height());
        recordingCanvasBeginRecording.setMatrix(matrix2);
        recordingCanvasBeginRecording.scale(f, f7);
        recordingCanvasBeginRecording.translate(-rectF.left, -rectF.top);
        return recordingCanvasBeginRecording;
    }
}
