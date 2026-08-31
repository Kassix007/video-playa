package Y3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.wnapp.smspariaz.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import l4.C1240j;
import l4.InterfaceC1239i;
import l4.m;
import p4.C1483d;
import s4.g;
import s4.k;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Drawable implements InterfaceC1239i {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f8217A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public WeakReference f8218B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public WeakReference f8219C;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final WeakReference f8220q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f8221r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C1240j f8222s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Rect f8223t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final c f8224u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f8225v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f8226w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f8227x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f8228y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f8229z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a(Context context, b bVar) {
        C1483d c1483d;
        WeakReference weakReference = new WeakReference(context);
        this.f8220q = weakReference;
        m.c(context, m.f14578b, "Theme.MaterialComponents");
        this.f8223t = new Rect();
        C1240j c1240j = new C1240j(this);
        this.f8222s = c1240j;
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = c1240j.f14571a;
        textPaint.setTextAlign(align);
        c cVar = new c(context, bVar);
        this.f8224u = cVar;
        boolean zE = e();
        b bVar2 = cVar.f8261b;
        g gVar = new g(k.a(context, zE ? bVar2.f8256w.intValue() : bVar2.f8254u.intValue(), e() ? bVar2.f8257x.intValue() : bVar2.f8255v.intValue(), new s4.a(0)).a());
        this.f8221r = gVar;
        g();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && c1240j.f14576g != (c1483d = new C1483d(context2, bVar2.f8253t.intValue()))) {
            c1240j.b(c1483d, context2);
            textPaint.setColor(bVar2.f8252s.intValue());
            invalidateSelf();
            i();
            invalidateSelf();
        }
        int i = bVar2.f8231B;
        if (i != -2) {
            this.f8227x = ((int) Math.pow(10.0d, ((double) i) - 1.0d)) - 1;
        } else {
            this.f8227x = bVar2.f8232C;
        }
        c1240j.f14575e = true;
        i();
        invalidateSelf();
        c1240j.f14575e = true;
        g();
        i();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(bVar2.f8251r.intValue());
        if (gVar.f16505q.f16481c != colorStateListValueOf) {
            gVar.k(colorStateListValueOf);
            invalidateSelf();
        }
        textPaint.setColor(bVar2.f8252s.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.f8218B;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.f8218B.get();
            WeakReference weakReference3 = this.f8219C;
            h(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        i();
        setVisible(bVar2.f8239J.booleanValue(), false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l4.InterfaceC1239i
    public final void a() {
        invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String b() {
        c cVar = this.f8224u;
        b bVar = cVar.f8261b;
        b bVar2 = cVar.f8261b;
        String str = bVar.f8259z;
        WeakReference weakReference = this.f8220q;
        if (str == null) {
            if (!f()) {
                return null;
            }
            if (this.f8227x == -2 || d() <= this.f8227x) {
                return NumberFormat.getInstance(bVar2.f8233D).format(d());
            }
            Context context = (Context) weakReference.get();
            return context == null ? "" : String.format(bVar2.f8233D, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f8227x), "+");
        }
        int i = bVar.f8231B;
        if (i == -2 || str == null || str.length() <= i) {
            return str;
        }
        Context context2 = (Context) weakReference.get();
        if (context2 == null) {
            return "";
        }
        return String.format(context2.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i - 1), "…");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FrameLayout c() {
        WeakReference weakReference = this.f8219C;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int d() {
        int i = this.f8224u.f8261b.f8230A;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String strB;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f8221r.draw(canvas);
        if (!e() || (strB = b()) == null) {
            return;
        }
        Rect rect = new Rect();
        C1240j c1240j = this.f8222s;
        c1240j.f14571a.getTextBounds(strB, 0, strB.length(), rect);
        float fExactCenterY = this.f8226w - rect.exactCenterY();
        canvas.drawText(strB, this.f8225v, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), c1240j.f14571a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean e() {
        return this.f8224u.f8261b.f8259z != null || f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean f() {
        b bVar = this.f8224u.f8261b;
        return bVar.f8259z == null && bVar.f8230A != -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g() {
        Context context = (Context) this.f8220q.get();
        if (context == null) {
            return;
        }
        boolean zE = e();
        c cVar = this.f8224u;
        this.f8221r.setShapeAppearanceModel(k.a(context, zE ? cVar.f8261b.f8256w.intValue() : cVar.f8261b.f8254u.intValue(), e() ? cVar.f8261b.f8257x.intValue() : cVar.f8261b.f8255v.intValue(), new s4.a(0)).a());
        invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f8224u.f8261b.f8258y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f8223t.height();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f8223t.width();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(View view, FrameLayout frameLayout) {
        this.f8218B = new WeakReference(view);
        this.f8219C = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        i();
        invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0285  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            r15 = this;
            java.lang.ref.WeakReference r0 = r15.f8220q
            java.lang.Object r1 = r0.get()
            android.content.Context r1 = (android.content.Context) r1
            java.lang.ref.WeakReference r2 = r15.f8218B
            r3 = 0
            if (r2 == 0) goto L14
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            goto L15
        L14:
            r2 = r3
        L15:
            if (r1 == 0) goto L2df
            if (r2 != 0) goto L1b
            goto L2df
        L1b:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.graphics.Rect r4 = r15.f8223t
            r1.set(r4)
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            r2.getDrawingRect(r5)
            java.lang.ref.WeakReference r6 = r15.f8219C
            if (r6 == 0) goto L37
            java.lang.Object r3 = r6.get()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        L37:
            if (r3 != 0) goto L3a
            goto L3d
        L3a:
            r3.offsetDescendantRectToMyCoords(r2, r5)
        L3d:
            boolean r3 = r15.e()
            Y3.c r6 = r15.f8224u
            if (r3 == 0) goto L48
            float r3 = r6.f8263d
            goto L4a
        L48:
            float r3 = r6.f8262c
        L4a:
            r15.f8228y = r3
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r8 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            r9 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L59
            r15.f8229z = r3
            r15.f8217A = r3
            goto L81
        L59:
            boolean r3 = r15.e()
            if (r3 == 0) goto L63
            float r3 = r6.f8265g
        L61:
            float r3 = r3 / r9
            goto L66
        L63:
            float r3 = r6.f8264e
            goto L61
        L66:
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            r15.f8229z = r3
            boolean r3 = r15.e()
            if (r3 == 0) goto L77
            float r3 = r6.f8266h
        L75:
            float r3 = r3 / r9
            goto L7a
        L77:
            float r3 = r6.f
            goto L75
        L7a:
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            r15.f8217A = r3
        L81:
            boolean r3 = r15.e()
            if (r3 == 0) goto Ld3
            java.lang.String r3 = r15.b()
            float r8 = r15.f8229z
            l4.j r10 = r15.f8222s
            boolean r11 = r10.f14575e
            if (r11 != 0) goto L96
            float r11 = r10.f14573c
            goto L9b
        L96:
            r10.a(r3)
            float r11 = r10.f14573c
        L9b:
            float r11 = r11 / r9
            Y3.b r12 = r6.f8261b
            java.lang.Integer r12 = r12.f8240K
            int r12 = r12.intValue()
            float r12 = (float) r12
            float r11 = r11 + r12
            float r8 = java.lang.Math.max(r8, r11)
            r15.f8229z = r8
            float r8 = r15.f8217A
            boolean r11 = r10.f14575e
            if (r11 != 0) goto Lb5
            float r3 = r10.f14574d
            goto Lba
        Lb5:
            r10.a(r3)
            float r3 = r10.f14574d
        Lba:
            float r3 = r3 / r9
            Y3.b r9 = r6.f8261b
            java.lang.Integer r9 = r9.f8241L
            int r9 = r9.intValue()
            float r9 = (float) r9
            float r3 = r3 + r9
            float r3 = java.lang.Math.max(r8, r3)
            r15.f8217A = r3
            float r8 = r15.f8229z
            float r3 = java.lang.Math.max(r8, r3)
            r15.f8229z = r3
        Ld3:
            Y3.b r3 = r6.f8261b
            Y3.b r8 = r6.f8261b
            int r9 = r6.f8267k
            java.lang.Integer r10 = r3.f8243N
            int r10 = r10.intValue()
            boolean r11 = r15.e()
            r12 = 0
            if (r11 == 0) goto L114
            java.lang.Integer r10 = r3.f8245P
            int r10 = r10.intValue()
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 == 0) goto L114
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            float r0 = r0.fontScale
            r11 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r11
            r13 = 1050253722(0x3e99999a, float:0.3)
            float r0 = W3.a.b(r12, r11, r13, r11, r0)
            java.lang.Integer r11 = r3.f8248S
            int r11 = r11.intValue()
            int r11 = r10 - r11
            int r10 = W3.a.c(r0, r10, r11)
        L114:
            if (r9 != 0) goto L11d
            float r0 = r15.f8217A
            int r0 = java.lang.Math.round(r0)
            int r10 = r10 - r0
        L11d:
            java.lang.Integer r0 = r3.f8247R
            int r0 = r0.intValue()
            int r0 = r0 + r10
            java.lang.Integer r10 = r8.f8238I
            int r10 = r10.intValue()
            r11 = 8388691(0x800053, float:1.175506E-38)
            if (r10 == r11) goto L13b
            r13 = 8388693(0x800055, float:1.1755063E-38)
            if (r10 == r13) goto L13b
            int r10 = r5.top
            int r10 = r10 + r0
            float r0 = (float) r10
            r15.f8226w = r0
            goto L141
        L13b:
            int r10 = r5.bottom
            int r10 = r10 - r0
            float r0 = (float) r10
            r15.f8226w = r0
        L141:
            boolean r0 = r15.e()
            if (r0 == 0) goto L14e
            java.lang.Integer r0 = r3.f8244O
            int r0 = r0.intValue()
            goto L154
        L14e:
            java.lang.Integer r0 = r8.f8242M
            int r0 = r0.intValue()
        L154:
            r10 = 1
            if (r9 != r10) goto L163
            boolean r9 = r15.e()
            if (r9 == 0) goto L160
            int r6 = r6.j
            goto L162
        L160:
            int r6 = r6.i
        L162:
            int r0 = r0 + r6
        L163:
            java.lang.Integer r6 = r3.f8246Q
            int r6 = r6.intValue()
            int r6 = r6 + r0
            java.lang.Integer r0 = r8.f8238I
            int r0 = r0.intValue()
            r8 = 8388659(0x800033, float:1.1755015E-38)
            if (r0 == r8) goto L193
            if (r0 == r11) goto L193
            java.util.WeakHashMap r0 = w1.AbstractC1835K.f18149a
            int r0 = r2.getLayoutDirection()
            if (r0 != 0) goto L188
            int r0 = r5.right
            float r0 = (float) r0
            float r5 = r15.f8229z
            float r0 = r0 + r5
            float r5 = (float) r6
            float r0 = r0 - r5
            goto L190
        L188:
            int r0 = r5.left
            float r0 = (float) r0
            float r5 = r15.f8229z
            float r0 = r0 - r5
            float r5 = (float) r6
            float r0 = r0 + r5
        L190:
            r15.f8225v = r0
            goto L1ae
        L193:
            java.util.WeakHashMap r0 = w1.AbstractC1835K.f18149a
            int r0 = r2.getLayoutDirection()
            if (r0 != 0) goto L1a4
            int r0 = r5.left
            float r0 = (float) r0
            float r5 = r15.f8229z
            float r0 = r0 - r5
            float r5 = (float) r6
            float r0 = r0 + r5
            goto L1ac
        L1a4:
            int r0 = r5.right
            float r0 = (float) r0
            float r5 = r15.f8229z
            float r0 = r0 + r5
            float r5 = (float) r6
            float r0 = r0 - r5
        L1ac:
            r15.f8225v = r0
        L1ae:
            java.lang.Boolean r0 = r3.f8249T
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L28e
            android.widget.FrameLayout r0 = r15.c()
            if (r0 != 0) goto L1d8
            android.view.ViewParent r0 = r2.getParent()
            boolean r0 = r0 instanceof android.view.View
            if (r0 != 0) goto L1c6
            goto L28e
        L1c6:
            float r0 = r2.getY()
            float r3 = r2.getX()
            android.view.ViewParent r2 = r2.getParent()
            android.view.View r2 = (android.view.View) r2
            r14 = r2
            r2 = r0
            r0 = r14
            goto L202
        L1d8:
            android.widget.FrameLayout r2 = r15.c()
            if (r2 == 0) goto L200
            int r2 = r2.getId()
            r3 = 2131296564(0x7f090134, float:1.8211048E38)
            if (r2 != r3) goto L200
            android.view.ViewParent r2 = r0.getParent()
            boolean r2 = r2 instanceof android.view.View
            if (r2 != 0) goto L1f1
            goto L28e
        L1f1:
            float r2 = r0.getY()
            float r3 = r0.getX()
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            goto L202
        L200:
            r2 = r12
            r3 = r2
        L202:
            float r5 = r15.f8226w
            float r6 = r15.f8217A
            float r5 = r5 - r6
            float r6 = r0.getY()
            float r6 = r6 + r5
            float r6 = r6 + r2
            float r5 = r15.f8225v
            float r8 = r15.f8229z
            float r5 = r5 - r8
            float r8 = r0.getX()
            float r8 = r8 + r5
            float r8 = r8 + r3
            android.view.ViewParent r5 = r0.getParent()
            boolean r5 = r5 instanceof android.view.View
            if (r5 == 0) goto L238
            android.view.ViewParent r5 = r0.getParent()
            android.view.View r5 = (android.view.View) r5
            float r9 = r15.f8226w
            float r10 = r15.f8217A
            float r9 = r9 + r10
            int r5 = r5.getHeight()
            float r5 = (float) r5
            float r10 = r0.getY()
            float r5 = r5 - r10
            float r9 = r9 - r5
            float r9 = r9 + r2
            goto L239
        L238:
            r9 = r12
        L239:
            android.view.ViewParent r2 = r0.getParent()
            boolean r2 = r2 instanceof android.view.View
            if (r2 == 0) goto L259
            android.view.ViewParent r2 = r0.getParent()
            android.view.View r2 = (android.view.View) r2
            float r5 = r15.f8225v
            float r10 = r15.f8229z
            float r5 = r5 + r10
            int r2 = r2.getWidth()
            float r2 = (float) r2
            float r0 = r0.getX()
            float r2 = r2 - r0
            float r5 = r5 - r2
            float r5 = r5 + r3
            goto L25a
        L259:
            r5 = r12
        L25a:
            int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r0 >= 0) goto L267
            float r0 = r15.f8226w
            float r2 = java.lang.Math.abs(r6)
            float r2 = r2 + r0
            r15.f8226w = r2
        L267:
            int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r0 >= 0) goto L274
            float r0 = r15.f8225v
            float r2 = java.lang.Math.abs(r8)
            float r2 = r2 + r0
            r15.f8225v = r2
        L274:
            int r0 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r0 <= 0) goto L281
            float r0 = r15.f8226w
            float r2 = java.lang.Math.abs(r9)
            float r0 = r0 - r2
            r15.f8226w = r0
        L281:
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 <= 0) goto L28e
            float r0 = r15.f8225v
            float r2 = java.lang.Math.abs(r5)
            float r0 = r0 - r2
            r15.f8225v = r0
        L28e:
            float r0 = r15.f8225v
            float r2 = r15.f8226w
            float r3 = r15.f8229z
            float r5 = r15.f8217A
            float r6 = r0 - r3
            int r6 = (int) r6
            float r8 = r2 - r5
            int r8 = (int) r8
            float r0 = r0 + r3
            int r0 = (int) r0
            float r2 = r2 + r5
            int r2 = (int) r2
            r4.set(r6, r8, r0, r2)
            float r0 = r15.f8228y
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            s4.g r3 = r15.f8221r
            if (r2 == 0) goto L2d6
            s4.f r2 = r3.f16505q
            s4.k r2 = r2.f16479a
            s4.j r2 = r2.e()
            s4.a r5 = new s4.a
            r5.<init>(r0)
            r2.f16520e = r5
            s4.a r5 = new s4.a
            r5.<init>(r0)
            r2.f = r5
            s4.a r5 = new s4.a
            r5.<init>(r0)
            r2.f16521g = r5
            s4.a r5 = new s4.a
            r5.<init>(r0)
            r2.f16522h = r5
            s4.k r0 = r2.a()
            r3.setShapeAppearanceModel(r0)
        L2d6:
            boolean r0 = r1.equals(r4)
            if (r0 != 0) goto L2df
            r3.setBounds(r4)
        L2df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y3.a.i():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable, l4.InterfaceC1239i
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        c cVar = this.f8224u;
        cVar.f8260a.f8258y = i;
        cVar.f8261b.f8258y = i;
        this.f8222s.f14571a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
