package K4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.Log;
import com.web2native.MainActivity;
import java.util.HashMap;
import kotlin.jvm.internal.m;
import m5.AbstractC1362a;
import m5.C1373l;

/* JADX INFO: loaded from: classes.dex */
public class d extends Drawable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f2935A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f2936B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f2937C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ColorStateList f2938D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public PorterDuff.Mode f2939E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public PorterDuffColorFilter f2940F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ColorFilter f2941G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Resources f2942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources.Theme f2943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f2944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f2945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f2946e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f2947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RectF f2948h;
    public final Path i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public O4.a f2949k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2950l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2951m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2952n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2953o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2954p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f2955q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2956r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f2957s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f2958t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2959u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2960v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2961w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f2962x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f2963y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f2964z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d(Resources resources, Resources.Theme theme) {
        TextPaint textPaint = new TextPaint(1);
        b bVar = new b(textPaint);
        this.f2944c = bVar;
        Paint paint = new Paint(1);
        this.f2945d = new b(paint);
        this.f2946e = new b(new Paint(1));
        Paint paint2 = new Paint(1);
        this.f = new b(paint2);
        this.f2947g = new Rect();
        this.f2948h = new RectF();
        this.i = new Path();
        this.j = 255;
        this.f2951m = true;
        this.f2952n = true;
        this.f2953o = -1;
        this.f2954p = -1;
        HashMap map = a.f2902a;
        this.f2957s = -1.0f;
        this.f2958t = -1.0f;
        this.f2939E = PorterDuff.Mode.SRC_IN;
        bVar.f2907c = ColorStateList.valueOf(-16777216);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setUnderlineText(false);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f2942a = resources;
        this.f2943b = theme;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        if (this.f2951m) {
            invalidateSelf();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        float fWidth = this.f2947g.width();
        RectF rectF = this.f2948h;
        float f = 2;
        this.i.offset(((fWidth - rectF.width()) / f) + this.f2962x, ((r0.height() - rectF.height()) / f) + this.f2963y);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(ColorStateList colorStateList) {
        b bVar = this.f2946e;
        bVar.f2907c = colorStateList;
        boolean z5 = this.f2951m;
        this.f2951m = false;
        invalidateSelf();
        if (this.f2957s == -1.0f) {
            this.f2957s = 0.0f;
            a();
        }
        if (this.f2958t == -1.0f) {
            this.f2958t = 0.0f;
            a();
        }
        this.f2951m = z5;
        invalidateSelf();
        if (bVar.a(getState())) {
            a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        this.f2941G = null;
        a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(boolean z5) {
        if (z5 != this.f2956r) {
            this.f2956r = z5;
            f(((z5 ? 1 : -1) * this.f2961w * 2) + this.f2959u);
            a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Path path = this.i;
        m.e(canvas, "canvas");
        if (this.f2949k == null) {
            return;
        }
        Rect bounds = getBounds();
        m.d(bounds, "bounds");
        h(bounds);
        i(bounds);
        b();
        if (this.f2950l && getLayoutDirection() == 1) {
            canvas.translate(getBounds().right - getBounds().left, 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        if (this.f2958t > -1.0f && this.f2957s > -1.0f) {
            boolean z5 = this.f2956r;
            b bVar = this.f2946e;
            if (z5) {
                float f = this.f2961w / 2;
                RectF rectF = new RectF(f, f, bounds.width() - f, bounds.height() - f);
                canvas.drawRoundRect(rectF, this.f2957s, this.f2958t, bVar.f2905a);
                canvas.drawRoundRect(rectF, this.f2957s, this.f2958t, this.f2945d.f2905a);
            } else {
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, bounds.width(), bounds.height()), this.f2957s, this.f2958t, bVar.f2905a);
            }
        }
        try {
            path.close();
        } catch (Throwable th) {
            AbstractC1362a.b(th);
        }
        if (this.f2955q) {
            canvas.drawPath(path, this.f.f2905a);
        }
        b bVar2 = this.f2944c;
        TextPaint textPaint = (TextPaint) bVar2.f2905a;
        ColorFilter colorFilter = this.f2941G;
        if (colorFilter == null) {
            colorFilter = this.f2940F;
        }
        textPaint.setColorFilter(colorFilter);
        canvas.drawPath(path, bVar2.f2905a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(O4.a aVar) {
        O4.b bVarB;
        this.f2949k = aVar;
        ((TextPaint) this.f2944c.f2905a).setTypeface((aVar == null || (bVarB = aVar.b()) == null) ? null : bVarB.getRawTypeface());
        a();
        if (this.f2949k != null) {
            a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(int i) {
        if (this.f2959u != i) {
            if (this.f2955q) {
                i += this.f2960v;
            }
            if (this.f2956r) {
                i += this.f2961w;
            }
            this.f2959u = i;
            a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g(int[] iArr) {
        if (iArr != null) {
            return super.setState(iArr);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f2954p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f2953o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.f2940F != null || this.f2941G != null) {
            return -3;
        }
        int i = this.j;
        if (i != 0) {
            return i != 255 ? -3 : -1;
        }
        return -2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(Rect rect) {
        int i = this.f2959u;
        if (i < 0 || i * 2 > rect.width() || this.f2959u * 2 > rect.height()) {
            return;
        }
        int i7 = rect.left;
        int i8 = this.f2959u;
        this.f2947g.set(i7 + i8, rect.top + i8, rect.right - i8, rect.bottom - i8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(Rect rect) {
        String string;
        O4.a aVar = this.f2949k;
        if (aVar == null || (string = Character.valueOf(aVar.a()).toString()) == null) {
            string = "null";
        }
        String str = string;
        float fHeight = this.f2947g.height();
        b bVar = this.f2944c;
        Paint paint = bVar.f2905a;
        Paint paint2 = bVar.f2905a;
        ((TextPaint) paint).setTextSize(fHeight);
        int length = str.length();
        Path path = this.i;
        ((TextPaint) paint2).getTextPath(str, 0, length, 0.0f, 0.0f, path);
        RectF rectF = this.f2948h;
        path.computeBounds(rectF, true);
        float fWidth = r12.width() / rectF.width();
        float fHeight2 = r12.height() / rectF.height();
        if (fWidth >= fHeight2) {
            fWidth = fHeight2;
        }
        ((TextPaint) paint2).setTextSize(fHeight * fWidth);
        ((TextPaint) paint2).getTextPath(str, 0, str.length(), 0.0f, 0.0f, path);
        path.computeBounds(rectF, true);
        path.offset(r12.left - rectF.left, r12.top - rectF.top);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0174 A[EDGE_INSN: B:82:0x0174->B:58:0x0174 BREAK  A[LOOP:1: B:29:0x00ee->B:84:0x00ee], SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void inflate(android.content.res.Resources r36, org.xmlpull.v1.XmlPullParser r37, android.util.AttributeSet r38, android.content.res.Resources.Theme r39) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r35 = this;
            r1 = r35
            r0 = r36
            r2 = r38
            r3 = r39
            java.lang.String r4 = "r"
            kotlin.jvm.internal.m.e(r0, r4)
            java.lang.String r4 = "parser"
            r5 = r37
            kotlin.jvm.internal.m.e(r5, r4)
            java.lang.String r4 = "attrs"
            kotlin.jvm.internal.m.e(r2, r4)
            super.inflate(r36, r37, r38, r39)
            r1.f2942a = r0
            r1.f2943b = r3
            int[] r4 = N4.a.f4032a
            r5 = 0
            if (r3 != 0) goto L2f
            android.content.res.TypedArray r2 = r0.obtainAttributes(r2, r4)
            java.lang.String r4 = "{\n            res.obtain…tes(set, attrs)\n        }"
            kotlin.jvm.internal.m.d(r2, r4)
            goto L38
        L2f:
            android.content.res.TypedArray r2 = r3.obtainStyledAttributes(r2, r4, r5, r5)
            java.lang.String r4 = "theme.obtainStyledAttributes(set, attrs, 0, 0)"
            kotlin.jvm.internal.m.d(r2, r4)
        L38:
            k3.d r4 = new k3.d
            r4.<init>(r0, r3, r2)
            B0.a r0 = new B0.a
            r3 = 18
            r0.<init>(r3, r4)
            r1.f2951m = r5
            r1.invalidateSelf()
            r0.invoke(r1)
            r3 = 1
            r1.f2951m = r3
            r1.invalidateSelf()
            r1.invalidateSelf()
            java.lang.String r0 = r2.getString(r5)
            if (r0 == 0) goto L61
            boolean r4 = J5.m.U0(r0)
            if (r4 == 0) goto L65
        L61:
            r38 = r2
            goto L25b
        L65:
            java.lang.String r4 = "\\|"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)
            java.lang.String r6 = "compile(...)"
            kotlin.jvm.internal.m.d(r4, r6)
            java.util.regex.Matcher r4 = r4.matcher(r0)
            boolean r6 = r4.find()
            if (r6 != 0) goto L83
            java.lang.String r0 = r0.toString()
            java.util.List r0 = com.google.android.gms.internal.measurement.AbstractC0836n2.z(r0)
            goto Lb4
        L83:
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            r6.<init>(r7)
            r7 = r5
        L8b:
            int r8 = r4.start()
            java.lang.CharSequence r7 = r0.subSequence(r7, r8)
            java.lang.String r7 = r7.toString()
            r6.add(r7)
            int r7 = r4.end()
            boolean r8 = r4.find()
            if (r8 != 0) goto L255
            int r4 = r0.length()
            java.lang.CharSequence r0 = r0.subSequence(r7, r4)
            java.lang.String r0 = r0.toString()
            r6.add(r0)
            r0 = r6
        Lb4:
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto Le1
            int r4 = r0.size()
            java.util.ListIterator r4 = r0.listIterator(r4)
        Lc2:
            boolean r6 = r4.hasPrevious()
            if (r6 == 0) goto Le1
            java.lang.Object r6 = r4.previous()
            java.lang.String r6 = (java.lang.String) r6
            int r6 = r6.length()
            if (r6 != 0) goto Ld5
            goto Lc2
        Ld5:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            int r4 = r4.nextIndex()
            int r4 = r4 + r3
            java.util.List r0 = n5.l.y0(r0, r4)
            goto Le3
        Le1:
            n5.s r0 = n5.s.f15299q
        Le3:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r6 = r0.iterator()
        Lee:
            boolean r0 = r6.hasNext()
            r7 = 0
            if (r0 == 0) goto L174
            java.lang.Object r0 = r6.next()
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = "Can't create processor for animation tag "
            java.lang.String r10 = "TAG"
            java.lang.String r11 = K4.a.f2903b
            Q4.a r12 = K4.a.f2904c
            java.lang.String r0 = "animationTag"
            kotlin.jvm.internal.m.e(r8, r0)
            java.util.HashMap r0 = K4.a.f2902a
            java.lang.Object r0 = r0.get(r8)
            r13 = r0
            java.lang.Class r13 = (java.lang.Class) r13
            if (r13 == 0) goto L16d
            java.lang.String r0 = "INSTANCE"
            java.lang.reflect.Field r0 = r13.getField(r0)     // Catch: java.lang.Throwable -> L11b
            goto L120
        L11b:
            r0 = move-exception
            m5.l r0 = m5.AbstractC1362a.b(r0)     // Catch: java.lang.InstantiationException -> L147 java.lang.IllegalAccessException -> L149
        L120:
            boolean r14 = r0 instanceof m5.C1373l     // Catch: java.lang.InstantiationException -> L147 java.lang.IllegalAccessException -> L149
            if (r14 == 0) goto L125
            r0 = r7
        L125:
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0     // Catch: java.lang.InstantiationException -> L147 java.lang.IllegalAccessException -> L149
            if (r0 == 0) goto L14b
            int r14 = r0.getModifiers()     // Catch: java.lang.InstantiationException -> L147 java.lang.IllegalAccessException -> L149
            boolean r14 = java.lang.reflect.Modifier.isFinal(r14)     // Catch: java.lang.InstantiationException -> L147 java.lang.IllegalAccessException -> L149
            if (r14 == 0) goto L14b
            int r14 = r0.getModifiers()     // Catch: java.lang.InstantiationException -> L147 java.lang.IllegalAccessException -> L149
            boolean r14 = java.lang.reflect.Modifier.isStatic(r14)     // Catch: java.lang.InstantiationException -> L147 java.lang.IllegalAccessException -> L149
            if (r14 == 0) goto L14b
            java.lang.Object r0 = r0.get(r7)     // Catch: java.lang.InstantiationException -> L147 java.lang.IllegalAccessException -> L149
            java.lang.String r13 = "null cannot be cast to non-null type T of com.mikepenz.iconics.context.ReflectionUtils.getInstanceOf"
            kotlin.jvm.internal.m.c(r0, r13)     // Catch: java.lang.InstantiationException -> L147 java.lang.IllegalAccessException -> L149
            goto L154
        L147:
            r0 = move-exception
            goto L158
        L149:
            r0 = move-exception
            goto L163
        L14b:
            java.lang.Object r0 = r13.newInstance()     // Catch: java.lang.InstantiationException -> L147 java.lang.IllegalAccessException -> L149
            java.lang.String r13 = "{\n            // This is…s.newInstance()\n        }"
            kotlin.jvm.internal.m.d(r0, r13)     // Catch: java.lang.InstantiationException -> L147 java.lang.IllegalAccessException -> L149
        L154:
            com.mikepenz.iconics.animation.IconicsAnimationProcessor r0 = (com.mikepenz.iconics.animation.IconicsAnimationProcessor) r0     // Catch: java.lang.InstantiationException -> L147 java.lang.IllegalAccessException -> L149
            r7 = r0
            goto L16d
        L158:
            kotlin.jvm.internal.m.d(r11, r10)
            java.lang.String r8 = r9.concat(r8)
            r12.a(r11, r8, r0)
            goto L16d
        L163:
            kotlin.jvm.internal.m.d(r11, r10)
            java.lang.String r8 = r9.concat(r8)
            r12.a(r11, r8, r0)
        L16d:
            if (r7 == 0) goto Lee
            r4.add(r7)
            goto Lee
        L174:
            L4.c r0 = new L4.c
            android.content.res.Resources r6 = r1.f2942a
            java.lang.String r8 = "res"
            if (r6 == 0) goto L251
            android.content.res.Resources$Theme r9 = r1.f2943b
            r0.<init>(r6, r9)
            android.content.res.Resources r6 = r1.f2942a
            if (r6 == 0) goto L24d
            K4.b r6 = r1.f2944c
            android.content.res.ColorStateList r8 = r6.f2907c
            android.graphics.Paint r6 = r6.f2905a
            android.text.TextPaint r6 = (android.text.TextPaint) r6
            android.graphics.Paint$Style r9 = r6.getStyle()
            java.lang.String r6 = "iconBrush.paint.style"
            kotlin.jvm.internal.m.d(r9, r6)
            K4.b r6 = r1.f2944c
            android.graphics.Paint r6 = r6.f2905a
            android.text.TextPaint r6 = (android.text.TextPaint) r6
            android.graphics.Typeface r10 = r6.getTypeface()
            K4.b r6 = r1.f2945d
            android.content.res.ColorStateList r11 = r6.f2907c
            K4.b r6 = r1.f2946e
            android.content.res.ColorStateList r12 = r6.f2907c
            K4.b r6 = r1.f
            android.content.res.ColorStateList r13 = r6.f2907c
            int r14 = r1.j
            O4.a r15 = r1.f2949k
            boolean r6 = r1.f2950l
            int r7 = r1.f2953o
            int r3 = r1.f2954p
            boolean r5 = r1.f2955q
            r38 = r2
            boolean r2 = r1.f2956r
            r20 = r2
            float r2 = r1.f2957s
            r21 = r2
            float r2 = r1.f2958t
            r22 = r2
            int r2 = r1.f2959u
            r23 = r2
            int r2 = r1.f2960v
            r24 = r2
            int r2 = r1.f2961w
            r25 = r2
            int r2 = r1.f2962x
            r26 = r2
            int r2 = r1.f2963y
            r27 = r2
            float r2 = r1.f2964z
            r28 = r2
            float r2 = r1.f2935A
            r29 = r2
            float r2 = r1.f2936B
            r30 = r2
            int r2 = r1.f2937C
            r31 = r2
            android.content.res.ColorStateList r2 = r1.f2938D
            r32 = r2
            android.graphics.PorterDuff$Mode r2 = r1.f2939E
            r18 = r3
            android.graphics.ColorFilter r3 = r1.f2941G
            java.lang.String r1 = "tintPorterMode"
            kotlin.jvm.internal.m.e(r2, r1)
            r17 = r7
            K4.c r7 = new K4.c
            r33 = r2
            r34 = r3
            r19 = r5
            r16 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r1 = 0
            r0.f2951m = r1
            r0.invalidateSelf()
            r7.invoke(r0)
            r2 = 1
            r0.f2951m = r2
            r0.invalidateSelf()
            r0.invalidateSelf()
            com.mikepenz.iconics.animation.IconicsAnimationProcessor[] r2 = new com.mikepenz.iconics.animation.IconicsAnimationProcessor[r1]
            java.lang.Object[] r2 = r4.toArray(r2)
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            kotlin.jvm.internal.m.c(r2, r3)
            com.mikepenz.iconics.animation.IconicsAnimationProcessor[] r2 = (com.mikepenz.iconics.animation.IconicsAnimationProcessor[]) r2
            int r3 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            com.mikepenz.iconics.animation.IconicsAnimationProcessor[] r2 = (com.mikepenz.iconics.animation.IconicsAnimationProcessor[]) r2
            java.lang.String r3 = "processors"
            kotlin.jvm.internal.m.e(r2, r3)
            int r3 = r2.length
            if (r3 != 0) goto L237
            goto L25b
        L237:
            int r3 = r2.length
            r5 = r1
        L239:
            if (r5 >= r3) goto L25b
            r1 = r2[r5]
            java.lang.String r4 = "processor"
            kotlin.jvm.internal.m.e(r1, r4)
            r1.setDrawable$iconics_core(r0)
            java.util.ArrayList r4 = r0.f3263H
            r4.add(r1)
            int r5 = r5 + 1
            goto L239
        L24d:
            kotlin.jvm.internal.m.k(r8)
            throw r7
        L251:
            kotlin.jvm.internal.m.k(r8)
            throw r7
        L255:
            r38 = r2
            r1 = r35
            goto L8b
        L25b:
            r38.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K4.d.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        return this.f2944c.b() || this.f.b() || this.f2946e.b() || this.f2945d.b() || ((colorStateList = this.f2938D) != null && colorStateList.isStateful());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j() {
        if (this.f2952n) {
            ((TextPaint) this.f2944c.f2905a).setShadowLayer(this.f2964z, this.f2935A, this.f2936B, this.f2937C);
            a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k() {
        ColorStateList colorStateList = this.f2938D;
        PorterDuff.Mode mode = this.f2939E;
        if (colorStateList == null) {
            this.f2940F = null;
        } else {
            this.f2940F = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        m.e(bounds, "bounds");
        h(bounds);
        i(bounds);
        b();
        try {
            this.i.close();
        } catch (Throwable th) {
            AbstractC1362a.b(th);
        }
        super.onBoundsChange(bounds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] stateSet) {
        m.e(stateSet, "stateSet");
        boolean z5 = this.f2945d.a(stateSet) || (this.f2946e.a(stateSet) || (this.f.a(stateSet) || this.f2944c.a(stateSet)));
        if (this.f2938D == null) {
            return z5;
        }
        k();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f2944c.c(i);
        this.f.c(i);
        this.f2946e.c(i);
        this.f2945d.c(i);
        this.j = i;
        a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f2941G = colorFilter;
        a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        ColorStateList colorStateList;
        return g(iArr) || this.f2944c.b() || this.f.b() || this.f2946e.b() || this.f2945d.b() || ((colorStateList = this.f2938D) != null && colorStateList.isStateful());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f2938D = colorStateList;
        k();
        a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode value) {
        if (value == null) {
            value = PorterDuff.Mode.SRC_IN;
        }
        m.e(value, "value");
        this.f2939E = value;
        k();
        a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(MainActivity mainActivity, O4.a icon) {
        Object objB;
        m.e(icon, "icon");
        Resources resources = mainActivity.getResources();
        m.d(resources, "context.resources");
        this(resources, mainActivity.getTheme());
        HashMap map = a.f2902a;
        if (O4.c.f5204b == null) {
            O4.c.f5204b = mainActivity.getApplicationContext();
        }
        if (O4.c.f5205c.isEmpty()) {
            Log.w(a.f2903b, "At least one font needs to be registered first\n    via " + a.class.getCanonicalName() + ".registerFont(Iconics.kt:117)");
        }
        try {
            objB = O4.c.f5204b;
            if (objB == null) {
                throw new RuntimeException("A 'Iconics.init(context)' has to happen first. Call from your application. Usually this happens via an 'IconicsDrawable' usage.");
            }
        } catch (Throwable th) {
            objB = AbstractC1362a.b(th);
        }
        if (objB instanceof C1373l) {
            Log.e("IconicsDrawable", "Iconics.init() not yet executed, icon will be missing");
        }
        e(icon);
    }
}
