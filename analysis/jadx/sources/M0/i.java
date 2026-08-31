package M0;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class i extends Canvas {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f3707a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            return canvas.clipOutPath(path);
        }
        m.k("nativeCanvas");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            return canvas.clipOutRect(rectF);
        }
        m.k("nativeCanvas");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            return canvas.clipPath(path, op);
        }
        m.k("nativeCanvas");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            return canvas.clipRect(rectF, op);
        }
        m.k("nativeCanvas");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.concat(matrix);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void disableZ() {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.disableZ();
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawARGB(int i, int i7, int i8, int i9) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawARGB(i, i7, i8, i9);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f, float f7, boolean z5, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawArc(rectF, f, f7, z5, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f, float f7, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, f, f7, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i, int i7, float[] fArr, int i8, int[] iArr, int i9, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawBitmapMesh(bitmap, i, i7, fArr, i8, iArr, i9, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawCircle(float f, float f7, float f8, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawCircle(f, f7, f8, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawColor(int i) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawColor(i);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f, float f7, RectF rectF2, float f8, float f9, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawDoubleRoundRect(rectF, f, f7, rectF2, f8, f9, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i, float[] fArr, int i7, int i8, Font font, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawGlyphs(iArr, i, fArr, i7, i8, font, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawLine(float f, float f7, float f8, float f9, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawLine(f, f7, f8, f9, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i, int i7, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawLines(fArr, i, i7, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawOval(rectF, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawPaint(paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawPatch(ninePatch, rect, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawPath(path, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawPicture(picture);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawPoint(float f, float f7, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawPoint(f, f7, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i, int i7, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawPoints(fArr, i, i7, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i, int i7, float[] fArr, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawPosText(cArr, i, i7, fArr, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawRGB(int i, int i7, int i8) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawRGB(i, i7, i8);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawRect(rectF, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawRenderNode(renderNode);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f, float f7, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawRoundRect(rectF, f, f7, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i, int i7, float f, float f7, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawText(cArr, i, i7, f, f7, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i, int i7, Path path, float f, float f7, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawTextOnPath(cArr, i, i7, path, f, f7, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i, int i7, int i8, int i9, float f, float f7, boolean z5, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawTextRun(cArr, i, i7, i8, i9, f, f7, z5, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i, float[] fArr, int i7, float[] fArr2, int i8, int[] iArr, int i9, short[] sArr, int i10, int i11, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawVertices(vertexMode, i, fArr, i7, fArr2, i8, iArr, i9, sArr, i10, i11, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void enableZ() {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.enableZ();
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        Canvas canvas = this.f3707a;
        if (canvas == null) {
            m.k("nativeCanvas");
            throw null;
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final int getDensity() {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            return canvas.getDensity();
        }
        m.k("nativeCanvas");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            return canvas.getDrawFilter();
        }
        m.k("nativeCanvas");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final int getHeight() {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            return canvas.getHeight();
        }
        m.k("nativeCanvas");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.getMatrix(matrix);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            return canvas.getMaximumBitmapHeight();
        }
        m.k("nativeCanvas");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            return canvas.getMaximumBitmapWidth();
        }
        m.k("nativeCanvas");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            return canvas.getSaveCount();
        }
        m.k("nativeCanvas");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final int getWidth() {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            return canvas.getWidth();
        }
        m.k("nativeCanvas");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            return canvas.isOpaque();
        }
        m.k("nativeCanvas");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            return canvas.quickReject(rectF, edgeType);
        }
        m.k("nativeCanvas");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void restore() {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.restore();
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void restoreToCount(int i) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.restoreToCount(i);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void rotate(float f) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.rotate(f);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final int save() {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            return canvas.save();
        }
        m.k("nativeCanvas");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint, i);
        }
        m.k("nativeCanvas");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i, int i7) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i, i7);
        }
        m.k("nativeCanvas");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void scale(float f, float f7) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.scale(f, f7);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.setBitmap(bitmap);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void setDensity(int i) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.setDensity(i);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.setDrawFilter(drawFilter);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.setMatrix(matrix);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void skew(float f, float f7) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.skew(f, f7);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void translate(float f, float f7) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.translate(f, f7);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            return canvas.clipPath(path);
        }
        m.k("nativeCanvas");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            return canvas.clipRect(rect, op);
        }
        m.k("nativeCanvas");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.graphics.Canvas
    public final void drawArc(float f, float f7, float f8, float f9, float f10, float f11, boolean z5, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawArc(f, f7, f8, f9, f10, f11, z5, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rectF, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.graphics.Canvas
    public final void drawColor(long j) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawColor(j);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawLines(fArr, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.graphics.Canvas
    public final void drawOval(float f, float f7, float f8, float f9, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawOval(f, f7, f8, f9, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawPicture(picture, rectF);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawPoints(fArr, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawPosText(str, fArr, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawRect(rect, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f, float f7, float f8, float f9, float f10, float f11, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawRoundRect(f, f7, f8, f9, f10, f11, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.graphics.Canvas
    public final void drawText(String str, float f, float f7, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawText(str, f, f7, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f, float f7, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawTextOnPath(str, path, f, f7, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            return canvas.quickReject(rectF);
        }
        m.k("nativeCanvas");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint);
        }
        m.k("nativeCanvas");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i);
        }
        m.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            return canvas.clipRect(rectF);
        }
        m.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rect2, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawPicture(picture, rect);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f, float f7, float f8, float f9, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawRect(f, f7, f8, f9, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i, int i7, float f, float f7, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawText(str, i, i7, f, f7, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f, float f7, float f8, float f9, Paint paint, int i) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            return canvas.saveLayer(f, f7, f8, f9, paint, i);
        }
        m.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f, float f7, float f8, float f9, int i, int i7) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f, f7, f8, f9, i, i7);
        }
        m.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            return canvas.clipOutRect(rect);
        }
        m.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            return canvas.clipRect(rect);
        }
        m.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i, int i7, float f, float f7, int i8, int i9, boolean z5, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i, i7, f, f7, i8, i9, z5, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawPatch(ninePatch, rectF, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i, int i7, float f, float f7, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawText(charSequence, i, i7, f, f7, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i, int i7, int i8, int i9, float f, float f7, boolean z5, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawTextRun(charSequence, i, i7, i8, i9, f, f7, z5, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f, float f7, float f8, float f9, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            return canvas.saveLayer(f, f7, f8, f9, paint);
        }
        m.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f, float f7, float f8, float f9, int i) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f, f7, f8, f9, i);
        }
        m.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f, float f7, float f8, float f9, Region.Op op) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            return canvas.clipRect(f, f7, f8, f9, op);
        }
        m.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i, int i7, int i8, int i9, int i10, int i11, boolean z5, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i, i7, i8, i9, i10, i11, z5, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, PorterDuff.Mode mode) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawColor(i, mode);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            return canvas.quickReject(path, edgeType);
        }
        m.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f, float f7, float f8, float f9) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            return canvas.clipRect(f, f7, f8, f9);
        }
        m.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, matrix, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, BlendMode blendMode) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawColor(i, blendMode);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            return canvas.quickReject(path);
        }
        m.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f, float f7, float f8, float f9) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            return canvas.clipOutRect(f, f7, f8, f9);
        }
        m.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i, int i7, int i8, int i9) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            return canvas.clipRect(i, i7, i8, i9);
        }
        m.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i, int i7, int i8, int i9, float f, float f7, boolean z5, Paint paint) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawTextRun(measuredText, i, i7, i8, i9, f, f7, z5, paint);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j, BlendMode blendMode) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            canvas.drawColor(j, blendMode);
        } else {
            m.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f, float f7, float f8, float f9, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            return canvas.quickReject(f, f7, f8, f9, edgeType);
        }
        m.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i, int i7, int i8, int i9) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            return canvas.clipOutRect(i, i7, i8, i9);
        }
        m.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f, float f7, float f8, float f9) {
        Canvas canvas = this.f3707a;
        if (canvas != null) {
            return canvas.quickReject(f, f7, f8, f9);
        }
        m.k("nativeCanvas");
        throw null;
    }
}
