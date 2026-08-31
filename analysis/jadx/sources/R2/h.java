package r2;

import E.Y;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class h extends k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Y f16296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f16297e;
    public Y f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f16298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f16299h;
    public float i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f16300k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Paint.Cap f16301l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Paint.Join f16302m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f16303n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // r2.j
    public final boolean a() {
        return this.f.k() || this.f16296d.k();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    @Override // r2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(int[] r7) {
        /*
            r6 = this;
            E.Y r0 = r6.f
            boolean r1 = r0.k()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.f1521d
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r7, r4)
            int r4 = r0.f1519b
            if (r1 == r4) goto L1e
            r0.f1519b = r1
            r0 = r2
            goto L1f
        L1e:
            r0 = r3
        L1f:
            E.Y r1 = r6.f16296d
            boolean r4 = r1.k()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r1.f1521d
            android.content.res.ColorStateList r4 = (android.content.res.ColorStateList) r4
            int r5 = r4.getDefaultColor()
            int r7 = r4.getColorForState(r7, r5)
            int r4 = r1.f1519b
            if (r7 == r4) goto L3a
            r1.f1519b = r7
            goto L3b
        L3a:
            r2 = r3
        L3b:
            r7 = r0 | r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.h.b(int[]):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getFillAlpha() {
        return this.f16299h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getFillColor() {
        return this.f.f1519b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getStrokeAlpha() {
        return this.f16298g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getStrokeColor() {
        return this.f16296d.f1519b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getStrokeWidth() {
        return this.f16297e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getTrimPathEnd() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getTrimPathOffset() {
        return this.f16300k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getTrimPathStart() {
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setFillAlpha(float f) {
        this.f16299h = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setFillColor(int i) {
        this.f.f1519b = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setStrokeAlpha(float f) {
        this.f16298g = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setStrokeColor(int i) {
        this.f16296d.f1519b = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setStrokeWidth(float f) {
        this.f16297e = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTrimPathEnd(float f) {
        this.j = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTrimPathOffset(float f) {
        this.f16300k = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTrimPathStart(float f) {
        this.i = f;
    }
}
