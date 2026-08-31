package s4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import i1.C1134a;
import j4.AbstractC1163a;
import java.util.BitSet;
import java.util.Objects;
import k4.C1188a;
import n1.AbstractC1393a;
import r4.C1579a;

/* JADX INFO: loaded from: classes.dex */
public class g extends Drawable implements u {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final Paint f16492M;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Region f16493A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Region f16494B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public k f16495C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Paint f16496D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Paint f16497E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final C1579a f16498F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final C1134a f16499G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final m f16500H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public PorterDuffColorFilter f16501I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public PorterDuffColorFilter f16502J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final RectF f16503K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final boolean f16504L;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public f f16505q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t[] f16506r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final t[] f16507s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final BitSet f16508t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f16509u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Matrix f16510v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Path f16511w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Path f16512x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final RectF f16513y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final RectF f16514z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Paint paint = new Paint(1);
        f16492M = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g() {
        this(new k());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(RectF rectF, Path path) {
        f fVar = this.f16505q;
        this.f16500H.a(fVar.f16479a, fVar.i, rectF, this.f16499G, path);
        if (this.f16505q.f16485h != 1.0f) {
            Matrix matrix = this.f16510v;
            matrix.reset();
            float f = this.f16505q.f16485h;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f16503K, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int c(int i) {
        int i7;
        f fVar = this.f16505q;
        float f = fVar.f16488m + 0.0f + fVar.f16487l;
        C1188a c1188a = fVar.f16480b;
        if (c1188a == null || !c1188a.f14123a || AbstractC1393a.e(i, 255) != c1188a.f14126d) {
            return i;
        }
        float fMin = (c1188a.f14127e <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int I6 = Q2.g.I(fMin, AbstractC1393a.e(i, 255), c1188a.f14124b);
        if (fMin > 0.0f && (i7 = c1188a.f14125c) != 0) {
            I6 = AbstractC1393a.c(AbstractC1393a.e(i7, C1188a.f), I6);
        }
        return AbstractC1393a.e(I6, iAlpha);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(Canvas canvas) {
        if (this.f16508t.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f16505q.f16490o;
        Path path = this.f16511w;
        C1579a c1579a = this.f16498F;
        if (i != 0) {
            canvas.drawPath(path, c1579a.f16349a);
        }
        for (int i7 = 0; i7 < 4; i7++) {
            t tVar = this.f16506r[i7];
            int i8 = this.f16505q.f16489n;
            Matrix matrix = t.f16559b;
            tVar.a(matrix, c1579a, i8, canvas);
            this.f16507s[i7].a(matrix, c1579a, this.f16505q.f16489n, canvas);
        }
        if (this.f16504L) {
            double d5 = 0;
            int iSin = (int) (Math.sin(Math.toRadians(d5)) * ((double) this.f16505q.f16490o));
            int iCos = (int) (Math.cos(Math.toRadians(d5)) * ((double) this.f16505q.f16490o));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f16492M);
            canvas.translate(iSin, iCos);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        PorterDuffColorFilter porterDuffColorFilter = this.f16501I;
        Paint paint = this.f16496D;
        paint.setColorFilter(porterDuffColorFilter);
        int alpha = paint.getAlpha();
        int i = this.f16505q.f16486k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.f16502J;
        Paint paint2 = this.f16497E;
        paint2.setColorFilter(porterDuffColorFilter2);
        paint2.setStrokeWidth(this.f16505q.j);
        int alpha2 = paint2.getAlpha();
        int i7 = this.f16505q.f16486k;
        paint2.setAlpha(((i7 + (i7 >>> 7)) * alpha2) >>> 8);
        boolean z5 = this.f16509u;
        Path path = this.f16511w;
        if (z5) {
            float f = -(h() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            k kVar = this.f16505q.f16479a;
            j jVarE = kVar.e();
            c bVar = kVar.f16529e;
            if (!(bVar instanceof h)) {
                bVar = new b(f, bVar);
            }
            jVarE.f16520e = bVar;
            c bVar2 = kVar.f;
            if (!(bVar2 instanceof h)) {
                bVar2 = new b(f, bVar2);
            }
            jVarE.f = bVar2;
            c bVar3 = kVar.f16531h;
            if (!(bVar3 instanceof h)) {
                bVar3 = new b(f, bVar3);
            }
            jVarE.f16522h = bVar3;
            c bVar4 = kVar.f16530g;
            if (!(bVar4 instanceof h)) {
                bVar4 = new b(f, bVar4);
            }
            jVarE.f16521g = bVar4;
            k kVarA = jVarE.a();
            this.f16495C = kVarA;
            float f7 = this.f16505q.i;
            RectF rectFG = g();
            RectF rectF = this.f16514z;
            rectF.set(rectFG);
            float strokeWidth = h() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f16500H.a(kVarA, f7, rectF, null, this.f16512x);
            b(g(), path);
            this.f16509u = false;
        }
        f fVar = this.f16505q;
        fVar.getClass();
        if (fVar.f16489n > 0) {
            int i8 = Build.VERSION.SDK_INT;
            if (!this.f16505q.f16479a.d(g()) && !path.isConvex() && i8 < 29) {
                canvas.save();
                double d5 = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d5)) * ((double) this.f16505q.f16490o)), (int) (Math.cos(Math.toRadians(d5)) * ((double) this.f16505q.f16490o)));
                if (this.f16504L) {
                    RectF rectF2 = this.f16503K;
                    int iWidth = (int) (rectF2.width() - getBounds().width());
                    int iHeight = (int) (rectF2.height() - getBounds().height());
                    if (iWidth < 0 || iHeight < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f16505q.f16489n * 2) + ((int) rectF2.width()) + iWidth, (this.f16505q.f16489n * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f8 = (getBounds().left - this.f16505q.f16489n) - iWidth;
                    float f9 = (getBounds().top - this.f16505q.f16489n) - iHeight;
                    canvas2.translate(-f8, -f9);
                    d(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f8, f9, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    d(canvas);
                    canvas.restore();
                }
            }
        }
        f fVar2 = this.f16505q;
        Paint.Style style = fVar2.f16491p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            e(canvas, paint, path, fVar2.f16479a, g());
        }
        if (h()) {
            f(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = kVar.f.a(rectF) * this.f16505q.i;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void f(Canvas canvas) {
        k kVar = this.f16495C;
        RectF rectFG = g();
        RectF rectF = this.f16514z;
        rectF.set(rectFG);
        boolean zH = h();
        Paint paint = this.f16497E;
        float strokeWidth = zH ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        e(canvas, paint, this.f16512x, kVar, rectF);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final RectF g() {
        Rect bounds = getBounds();
        RectF rectF = this.f16513y;
        rectF.set(bounds);
        return rectF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f16505q.f16486k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f16505q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f16505q.getClass();
        if (this.f16505q.f16479a.d(g())) {
            outline.setRoundRect(getBounds(), this.f16505q.f16479a.f16529e.a(g()) * this.f16505q.i);
            return;
        }
        RectF rectFG = g();
        Path path = this.f16511w;
        b(rectFG, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            j4.b.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                AbstractC1163a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            AbstractC1163a.a(outline, path);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f16505q.f16484g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f16493A;
        region.set(bounds);
        RectF rectFG = g();
        Path path = this.f16511w;
        b(rectFG, path);
        Region region2 = this.f16494B;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean h() {
        Paint.Style style = this.f16505q.f16491p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f16497E.getStrokeWidth() > 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(Context context) {
        this.f16505q.f16480b = new C1188a(context);
        n();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f16509u = true;
        super.invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f16505q.f16483e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f16505q.getClass();
        ColorStateList colorStateList2 = this.f16505q.f16482d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f16505q.f16481c;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(float f) {
        f fVar = this.f16505q;
        if (fVar.f16488m != f) {
            fVar.f16488m = f;
            n();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(ColorStateList colorStateList) {
        f fVar = this.f16505q;
        if (fVar.f16481c != colorStateList) {
            fVar.f16481c = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean l(int[] iArr) {
        boolean z5;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f16505q.f16481c == null || color2 == (colorForState2 = this.f16505q.f16481c.getColorForState(iArr, (color2 = (paint2 = this.f16496D).getColor())))) {
            z5 = false;
        } else {
            paint2.setColor(colorForState2);
            z5 = true;
        }
        if (this.f16505q.f16482d == null || color == (colorForState = this.f16505q.f16482d.getColorForState(iArr, (color = (paint = this.f16497E).getColor())))) {
            return z5;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean m() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f16501I;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f16502J;
        f fVar = this.f16505q;
        ColorStateList colorStateList = fVar.f16483e;
        PorterDuff.Mode mode = fVar.f;
        if (colorStateList == null || mode == null) {
            int color = this.f16496D.getColor();
            int iC = c(color);
            porterDuffColorFilter = iC != color ? new PorterDuffColorFilter(iC, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(c(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f16501I = porterDuffColorFilter;
        this.f16505q.getClass();
        this.f16502J = null;
        this.f16505q.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f16501I) && Objects.equals(porterDuffColorFilter3, this.f16502J)) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f16505q = new f(this.f16505q);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n() {
        f fVar = this.f16505q;
        float f = fVar.f16488m + 0.0f;
        fVar.f16489n = (int) Math.ceil(0.75f * f);
        this.f16505q.f16490o = (int) Math.ceil(f * 0.25f);
        m();
        super.invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f16509u = true;
        super.onBoundsChange(rect);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable, l4.InterfaceC1239i
    public boolean onStateChange(int[] iArr) {
        boolean z5 = l(iArr) || m();
        if (z5) {
            invalidateSelf();
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        f fVar = this.f16505q;
        if (fVar.f16486k != i) {
            fVar.f16486k = i;
            super.invalidateSelf();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f16505q.getClass();
        super.invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s4.u
    public final void setShapeAppearanceModel(k kVar) {
        this.f16505q.f16479a = kVar;
        invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f16505q.f16483e = colorStateList;
        m();
        super.invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f16505q;
        if (fVar.f != mode) {
            fVar.f = mode;
            m();
            super.invalidateSelf();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public g(Context context, AttributeSet attributeSet, int i, int i7) {
        this(k.b(context, attributeSet, i, i7).a());
    }

    public g(k kVar) {
        this(new f(kVar));
    }

    public g(f fVar) {
        m mVar;
        this.f16506r = new t[4];
        this.f16507s = new t[4];
        this.f16508t = new BitSet(8);
        this.f16510v = new Matrix();
        this.f16511w = new Path();
        this.f16512x = new Path();
        this.f16513y = new RectF();
        this.f16514z = new RectF();
        this.f16493A = new Region();
        this.f16494B = new Region();
        Paint paint = new Paint(1);
        this.f16496D = paint;
        Paint paint2 = new Paint(1);
        this.f16497E = paint2;
        this.f16498F = new C1579a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = l.f16534a;
        } else {
            mVar = new m();
        }
        this.f16500H = mVar;
        this.f16503K = new RectF();
        this.f16504L = true;
        this.f16505q = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m();
        l(getState());
        this.f16499G = new C1134a(7, this);
    }
}
