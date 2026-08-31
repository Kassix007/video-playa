package r2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.work.impl.WorkDatabaseVersions;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import r.C1554e;
import y4.AbstractC1918b;

/* JADX INFO: loaded from: classes.dex */
public final class o extends f {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final PorterDuff.Mode f16338z = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public m f16339r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public PorterDuffColorFilter f16340s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ColorFilter f16341t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f16342u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f16343v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float[] f16344w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Matrix f16345x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Rect f16346y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o() {
        this.f16343v = true;
        this.f16344w = new float[9];
        this.f16345x = new Matrix();
        this.f16346y = new Rect();
        m mVar = new m();
        mVar.f16330c = null;
        mVar.f16331d = f16338z;
        mVar.f16329b = new l();
        this.f16339r = mVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f16295q;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f16295q;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f16346y;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f16341t;
        if (colorFilter == null) {
            colorFilter = this.f16340s;
        }
        Matrix matrix = this.f16345x;
        canvas.getMatrix(matrix);
        float[] fArr = this.f16344w;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, (int) (rect.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        m mVar = this.f16339r;
        Bitmap bitmap = mVar.f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != mVar.f.getHeight()) {
            mVar.f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            mVar.f16335k = true;
        }
        if (this.f16343v) {
            m mVar2 = this.f16339r;
            if (mVar2.f16335k || mVar2.f16333g != mVar2.f16330c || mVar2.f16334h != mVar2.f16331d || mVar2.j != mVar2.f16332e || mVar2.i != mVar2.f16329b.getRootAlpha()) {
                m mVar3 = this.f16339r;
                mVar3.f.eraseColor(0);
                Canvas canvas2 = new Canvas(mVar3.f);
                l lVar = mVar3.f16329b;
                lVar.a(lVar.f16321g, l.f16315p, canvas2, iMin, iMin2);
                m mVar4 = this.f16339r;
                mVar4.f16333g = mVar4.f16330c;
                mVar4.f16334h = mVar4.f16331d;
                mVar4.i = mVar4.f16329b.getRootAlpha();
                mVar4.j = mVar4.f16332e;
                mVar4.f16335k = false;
            }
        } else {
            m mVar5 = this.f16339r;
            mVar5.f.eraseColor(0);
            Canvas canvas3 = new Canvas(mVar5.f);
            l lVar2 = mVar5.f16329b;
            lVar2.a(lVar2.f16321g, l.f16315p, canvas3, iMin, iMin2);
        }
        m mVar6 = this.f16339r;
        if (mVar6.f16329b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (mVar6.f16336l == null) {
                Paint paint2 = new Paint();
                mVar6.f16336l = paint2;
                paint2.setFilterBitmap(true);
            }
            mVar6.f16336l.setAlpha(mVar6.f16329b.getRootAlpha());
            mVar6.f16336l.setColorFilter(colorFilter);
            paint = mVar6.f16336l;
        }
        canvas.drawBitmap(mVar6.f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f16295q;
        return drawable != null ? drawable.getAlpha() : this.f16339r.f16329b.getRootAlpha();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f16295q;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f16339r.getChangingConfigurations();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f16295q;
        return drawable != null ? drawable.getColorFilter() : this.f16341t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f16295q != null) {
            return new n(this.f16295q.getConstantState());
        }
        this.f16339r.f16328a = getChangingConfigurations();
        return this.f16339r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f16295q;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f16339r.f16329b.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f16295q;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f16339r.f16329b.f16322h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f16295q;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f16295q;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f16295q;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f16295q;
        return drawable != null ? drawable.isAutoMirrored() : this.f16339r.f16332e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f16295q;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        m mVar = this.f16339r;
        if (mVar == null) {
            return false;
        }
        l lVar = mVar.f16329b;
        if (lVar.f16326n == null) {
            lVar.f16326n = Boolean.valueOf(lVar.f16321g.a());
        }
        if (lVar.f16326n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f16339r.f16330c;
        return colorStateList != null && colorStateList.isStateful();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f16295q;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f16342u && super.mutate() == this) {
            m mVar = this.f16339r;
            m mVar2 = new m();
            mVar2.f16330c = null;
            mVar2.f16331d = f16338z;
            if (mVar != null) {
                mVar2.f16328a = mVar.f16328a;
                l lVar = new l(mVar.f16329b);
                mVar2.f16329b = lVar;
                if (mVar.f16329b.f16320e != null) {
                    lVar.f16320e = new Paint(mVar.f16329b.f16320e);
                }
                if (mVar.f16329b.f16319d != null) {
                    mVar2.f16329b.f16319d = new Paint(mVar.f16329b.f16319d);
                }
                mVar2.f16330c = mVar.f16330c;
                mVar2.f16331d = mVar.f16331d;
                mVar2.f16332e = mVar.f16332e;
            }
            this.f16339r = mVar2;
            this.f16342u = true;
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f16295q;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z5;
        PorterDuff.Mode mode;
        Drawable drawable = this.f16295q;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        m mVar = this.f16339r;
        ColorStateList colorStateList = mVar.f16330c;
        if (colorStateList == null || (mode = mVar.f16331d) == null) {
            z5 = false;
        } else {
            this.f16340s = a(colorStateList, mode);
            invalidateSelf();
            z5 = true;
        }
        l lVar = mVar.f16329b;
        if (lVar.f16326n == null) {
            lVar.f16326n = Boolean.valueOf(lVar.f16321g.a());
        }
        if (lVar.f16326n.booleanValue()) {
            boolean zB = mVar.f16329b.f16321g.b(iArr);
            mVar.f16335k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f16295q;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f16295q;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f16339r.f16329b.getRootAlpha() != i) {
            this.f16339r.f16329b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z5) {
        Drawable drawable = this.f16295q;
        if (drawable != null) {
            drawable.setAutoMirrored(z5);
        } else {
            this.f16339r.f16332e = z5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f16295q;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f16341t = colorFilter;
            invalidateSelf();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f16295q;
        if (drawable != null) {
            AbstractC1918b.z(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f16295q;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        m mVar = this.f16339r;
        if (mVar.f16330c != colorStateList) {
            mVar.f16330c = colorStateList;
            this.f16340s = a(colorStateList, mVar.f16331d);
            invalidateSelf();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f16295q;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        m mVar = this.f16339r;
        if (mVar.f16331d != mode) {
            mVar.f16331d = mode;
            this.f16340s = a(mVar.f16330c, mode);
            invalidateSelf();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z5, boolean z6) {
        Drawable drawable = this.f16295q;
        return drawable != null ? drawable.setVisible(z5, z6) : super.setVisible(z5, z6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f16295q;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i;
        int i7;
        int i8;
        int i9;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f16295q;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        m mVar = this.f16339r;
        mVar.f16329b = new l();
        TypedArray typedArrayG = m1.b.g(resources, theme, attributeSet, AbstractC1576a.f16279a);
        m mVar2 = this.f16339r;
        l lVar = mVar2.f16329b;
        int i10 = !m1.b.d(xmlPullParser, "tintMode") ? -1 : typedArrayG.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i11 = 3;
        if (i10 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i10 != 5) {
            if (i10 != 9) {
                switch (i10) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case WorkDatabaseVersions.VERSION_16 /* 16 */:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        mVar2.f16331d = mode;
        ColorStateList colorStateListB = m1.b.b(typedArrayG, xmlPullParser, theme);
        if (colorStateListB != null) {
            mVar2.f16330c = colorStateListB;
        }
        boolean z5 = mVar2.f16332e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z5 = typedArrayG.getBoolean(5, z5);
        }
        mVar2.f16332e = z5;
        float f = lVar.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = typedArrayG.getFloat(7, f);
        }
        lVar.j = f;
        float f7 = lVar.f16323k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f7 = typedArrayG.getFloat(8, f7);
        }
        lVar.f16323k = f7;
        if (lVar.j <= 0.0f) {
            throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f7 > 0.0f) {
            lVar.f16322h = typedArrayG.getDimension(3, lVar.f16322h);
            int i12 = 2;
            float dimension = typedArrayG.getDimension(2, lVar.i);
            lVar.i = dimension;
            if (lVar.f16322h <= 0.0f) {
                throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = lVar.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = typedArrayG.getFloat(4, alpha);
                }
                lVar.setAlpha(alpha);
                String string = typedArrayG.getString(0);
                if (string != null) {
                    lVar.f16325m = string;
                    lVar.f16327o.put(string, lVar);
                }
                typedArrayG.recycle();
                mVar.f16328a = getChangingConfigurations();
                int i13 = 1;
                mVar.f16335k = true;
                m mVar3 = this.f16339r;
                l lVar2 = mVar3.f16329b;
                ArrayDeque arrayDeque = new ArrayDeque();
                i iVar = lVar2.f16321g;
                C1554e c1554e = lVar2.f16327o;
                arrayDeque.push(iVar);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z6 = true;
                while (eventType != i13 && (xmlPullParser.getDepth() >= depth || eventType != i11)) {
                    if (eventType == i12) {
                        String name = xmlPullParser.getName();
                        i iVar2 = (i) arrayDeque.peek();
                        i = depth;
                        if ("path".equals(name)) {
                            h hVar = new h();
                            hVar.f16297e = 0.0f;
                            hVar.f16298g = 1.0f;
                            hVar.f16299h = 1.0f;
                            hVar.i = 0.0f;
                            hVar.j = 1.0f;
                            hVar.f16300k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            hVar.f16301l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            hVar.f16302m = join2;
                            hVar.f16303n = 4.0f;
                            TypedArray typedArrayG2 = m1.b.g(resources, theme, attributeSet, AbstractC1576a.f16281c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = typedArrayG2.getString(0);
                                if (string2 != null) {
                                    hVar.f16313b = string2;
                                }
                                String string3 = typedArrayG2.getString(2);
                                if (string3 != null) {
                                    hVar.f16312a = E3.h.w(string3);
                                }
                                hVar.f = m1.b.c(typedArrayG2, xmlPullParser, theme, "fillColor", 1);
                                float f8 = hVar.f16299h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f8 = typedArrayG2.getFloat(12, f8);
                                }
                                hVar.f16299h = f8;
                                int i14 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayG2.getInt(8, -1) : -1;
                                Paint.Cap cap3 = hVar.f16301l;
                                if (i14 == 0) {
                                    cap = cap2;
                                } else if (i14 != 1) {
                                    cap = i14 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                hVar.f16301l = cap;
                                int i15 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayG2.getInt(9, -1) : -1;
                                Paint.Join join3 = hVar.f16302m;
                                if (i15 == 0) {
                                    join = join2;
                                } else if (i15 != 1) {
                                    join = i15 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                hVar.f16302m = join;
                                float f9 = hVar.f16303n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f9 = typedArrayG2.getFloat(10, f9);
                                }
                                hVar.f16303n = f9;
                                hVar.f16296d = m1.b.c(typedArrayG2, xmlPullParser, theme, "strokeColor", 3);
                                float f10 = hVar.f16298g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f10 = typedArrayG2.getFloat(11, f10);
                                }
                                hVar.f16298g = f10;
                                float f11 = hVar.f16297e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f11 = typedArrayG2.getFloat(4, f11);
                                }
                                hVar.f16297e = f11;
                                float f12 = hVar.j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f12 = typedArrayG2.getFloat(6, f12);
                                }
                                hVar.j = f12;
                                float f13 = hVar.f16300k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f13 = typedArrayG2.getFloat(7, f13);
                                }
                                hVar.f16300k = f13;
                                float f14 = hVar.i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f14 = typedArrayG2.getFloat(5, f14);
                                }
                                hVar.i = f14;
                                int i16 = hVar.f16314c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i16 = typedArrayG2.getInt(13, i16);
                                }
                                hVar.f16314c = i16;
                            }
                            typedArrayG2.recycle();
                            iVar2.f16305b.add(hVar);
                            if (hVar.getPathName() != null) {
                                c1554e.put(hVar.getPathName(), hVar);
                            }
                            mVar3.f16328a = mVar3.f16328a;
                            i9 = 1;
                            z6 = false;
                        } else {
                            if ("clip-path".equals(name)) {
                                g gVar = new g();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray typedArrayG3 = m1.b.g(resources, theme, attributeSet, AbstractC1576a.f16282d);
                                    String string4 = typedArrayG3.getString(0);
                                    if (string4 != null) {
                                        gVar.f16313b = string4;
                                    }
                                    String string5 = typedArrayG3.getString(1);
                                    if (string5 != null) {
                                        gVar.f16312a = E3.h.w(string5);
                                    }
                                    gVar.f16314c = !m1.b.d(xmlPullParser, "fillType") ? 0 : typedArrayG3.getInt(2, 0);
                                    typedArrayG3.recycle();
                                }
                                iVar2.f16305b.add(gVar);
                                if (gVar.getPathName() != null) {
                                    c1554e.put(gVar.getPathName(), gVar);
                                }
                                mVar3.f16328a = mVar3.f16328a;
                            } else if ("group".equals(name)) {
                                i iVar3 = new i();
                                TypedArray typedArrayG4 = m1.b.g(resources, theme, attributeSet, AbstractC1576a.f16280b);
                                float f15 = iVar3.f16306c;
                                if (m1.b.d(xmlPullParser, "rotation")) {
                                    f15 = typedArrayG4.getFloat(5, f15);
                                }
                                iVar3.f16306c = f15;
                                i9 = 1;
                                iVar3.f16307d = typedArrayG4.getFloat(1, iVar3.f16307d);
                                iVar3.f16308e = typedArrayG4.getFloat(2, iVar3.f16308e);
                                float f16 = iVar3.f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f16 = typedArrayG4.getFloat(3, f16);
                                }
                                iVar3.f = f16;
                                float f17 = iVar3.f16309g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f17 = typedArrayG4.getFloat(4, f17);
                                }
                                iVar3.f16309g = f17;
                                float f18 = iVar3.f16310h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f18 = typedArrayG4.getFloat(6, f18);
                                }
                                iVar3.f16310h = f18;
                                float f19 = iVar3.i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f19 = typedArrayG4.getFloat(7, f19);
                                }
                                iVar3.i = f19;
                                String string6 = typedArrayG4.getString(0);
                                if (string6 != null) {
                                    iVar3.f16311k = string6;
                                }
                                iVar3.c();
                                typedArrayG4.recycle();
                                iVar2.f16305b.add(iVar3);
                                arrayDeque.push(iVar3);
                                if (iVar3.getGroupName() != null) {
                                    c1554e.put(iVar3.getGroupName(), iVar3);
                                }
                                mVar3.f16328a = mVar3.f16328a;
                            }
                            i9 = 1;
                        }
                        i8 = i9;
                        i7 = 3;
                    } else {
                        i = depth;
                        i7 = i11;
                        i8 = 1;
                        if (eventType == i7 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i11 = i7;
                    i13 = i8;
                    depth = i;
                    i12 = 2;
                }
                if (!z6) {
                    this.f16340s = a(mVar.f16330c, mVar.f16331d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public o(m mVar) {
        this.f16343v = true;
        this.f16344w = new float[9];
        this.f16345x = new Matrix();
        this.f16346y = new Rect();
        this.f16339r = mVar;
        this.f16340s = a(mVar.f16330c, mVar.f16331d);
    }
}
