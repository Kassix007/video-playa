package r2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import q3.C1518a;
import y4.AbstractC1918b;

/* JADX INFO: loaded from: classes.dex */
public final class e extends f implements Animatable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f16291s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Z3.a f16292t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f16293u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C1518a f16294v = new C1518a(1, this);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1578c f16290r = new C1578c();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(Context context, int i) {
        this.f16291s = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // r2.f, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f16295q;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f16295q;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f16295q;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C1578c c1578c = this.f16290r;
        c1578c.f16285a.draw(canvas);
        if (c1578c.f16286b.isStarted()) {
            invalidateSelf();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f16295q;
        return drawable != null ? drawable.getAlpha() : this.f16290r.f16285a.getAlpha();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f16295q;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f16290r.getClass();
        return changingConfigurations;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f16295q;
        return drawable != null ? drawable.getColorFilter() : this.f16290r.f16285a.getColorFilter();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f16295q != null) {
            return new d(this.f16295q.getConstantState());
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f16295q;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f16290r.f16285a.getIntrinsicHeight();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f16295q;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f16290r.f16285a.getIntrinsicWidth();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f16295q;
        return drawable != null ? drawable.getOpacity() : this.f16290r.f16285a.getOpacity();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ca, code lost:
    
        if (r3.f16286b != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cc, code lost:
    
        r3.f16286b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d3, code lost:
    
        r3.f16286b.playTogether(r3.f16287c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00da, code lost:
    
        return;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void inflate(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r8 = this;
            android.graphics.drawable.Drawable r0 = r8.f16295q
            if (r0 == 0) goto L8
            r0.inflate(r9, r10, r11, r12)
            return
        L8:
            int r0 = r10.getEventType()
            int r1 = r10.getDepth()
            r2 = 1
            int r1 = r1 + r2
        L12:
            r2.c r3 = r8.f16290r
            if (r0 == r2) goto Lc8
            int r4 = r10.getDepth()
            if (r4 >= r1) goto L1f
            r4 = 3
            if (r0 == r4) goto Lc8
        L1f:
            r4 = 2
            if (r0 != r4) goto Lc2
            java.lang.String r0 = r10.getName()
            java.lang.String r4 = "animated-vector"
            boolean r4 = r4.equals(r0)
            r5 = 0
            if (r4 == 0) goto L68
            int[] r0 = r2.AbstractC1576a.f16283e
            android.content.res.TypedArray r0 = m1.b.g(r9, r12, r11, r0)
            int r4 = r0.getResourceId(r5, r5)
            if (r4 == 0) goto L64
            r2.o r6 = new r2.o
            r6.<init>()
            java.lang.ThreadLocal r7 = m1.l.f15039a
            android.graphics.drawable.Drawable r4 = r9.getDrawable(r4, r12)
            r6.f16295q = r4
            r2.n r4 = new r2.n
            android.graphics.drawable.Drawable r7 = r6.f16295q
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r4.<init>(r7)
            r6.f16343v = r5
            q3.a r4 = r8.f16294v
            r6.setCallback(r4)
            r2.o r4 = r3.f16285a
            if (r4 == 0) goto L62
            r5 = 0
            r4.setCallback(r5)
        L62:
            r3.f16285a = r6
        L64:
            r0.recycle()
            goto Lc2
        L68:
            java.lang.String r4 = "target"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lc2
            int[] r0 = r2.AbstractC1576a.f
            android.content.res.TypedArray r0 = r9.obtainAttributes(r11, r0)
            java.lang.String r4 = r0.getString(r5)
            int r6 = r0.getResourceId(r2, r5)
            if (r6 == 0) goto Lbf
            android.content.Context r7 = r8.f16291s
            if (r7 == 0) goto Lb4
            android.animation.Animator r6 = android.animation.AnimatorInflater.loadAnimator(r7, r6)
            r2.o r7 = r3.f16285a
            r2.m r7 = r7.f16339r
            r2.l r7 = r7.f16329b
            r.e r7 = r7.f16327o
            java.lang.Object r7 = r7.get(r4)
            r6.setTarget(r7)
            java.util.ArrayList r7 = r3.f16287c
            if (r7 != 0) goto La9
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r3.f16287c = r7
            r.e r7 = new r.e
            r7.<init>(r5)
            r3.f16288d = r7
        La9:
            java.util.ArrayList r5 = r3.f16287c
            r5.add(r6)
            r.e r3 = r3.f16288d
            r3.put(r6, r4)
            goto Lbf
        Lb4:
            r0.recycle()
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Context can't be null when inflating animators"
            r9.<init>(r10)
            throw r9
        Lbf:
            r0.recycle()
        Lc2:
            int r0 = r10.next()
            goto L12
        Lc8:
            android.animation.AnimatorSet r9 = r3.f16286b
            if (r9 != 0) goto Ld3
            android.animation.AnimatorSet r9 = new android.animation.AnimatorSet
            r9.<init>()
            r3.f16286b = r9
        Ld3:
            android.animation.AnimatorSet r9 = r3.f16286b
            java.util.ArrayList r10 = r3.f16287c
            r9.playTogether(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.e.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f16295q;
        return drawable != null ? drawable.isAutoMirrored() : this.f16290r.f16285a.isAutoMirrored();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f16295q;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f16290r.f16286b.isRunning();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f16295q;
        return drawable != null ? drawable.isStateful() : this.f16290r.f16285a.isStateful();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f16295q;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f16295q;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f16290r.f16285a.setBounds(rect);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // r2.f, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f16295q;
        return drawable != null ? drawable.setLevel(i) : this.f16290r.f16285a.setLevel(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f16295q;
        return drawable != null ? drawable.setState(iArr) : this.f16290r.f16285a.setState(iArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f16295q;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f16290r.f16285a.setAlpha(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z5) {
        Drawable drawable = this.f16295q;
        if (drawable != null) {
            drawable.setAutoMirrored(z5);
        } else {
            this.f16290r.f16285a.setAutoMirrored(z5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f16295q;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f16290r.f16285a.setColorFilter(colorFilter);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f16295q;
        if (drawable != null) {
            AbstractC1918b.z(drawable, i);
        } else {
            this.f16290r.f16285a.setTint(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f16295q;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f16290r.f16285a.setTintList(colorStateList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f16295q;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f16290r.f16285a.setTintMode(mode);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z5, boolean z6) {
        Drawable drawable = this.f16295q;
        if (drawable != null) {
            return drawable.setVisible(z5, z6);
        }
        this.f16290r.f16285a.setVisible(z5, z6);
        return super.setVisible(z5, z6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f16295q;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C1578c c1578c = this.f16290r;
        if (c1578c.f16286b.isStarted()) {
            return;
        }
        c1578c.f16286b.start();
        invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f16295q;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f16290r.f16286b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
