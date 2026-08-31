package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.wnapp.smspariaz.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import r.C1566q;

/* JADX INFO: renamed from: m.J0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1262J0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static C1262J0 f14667g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f14669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f14670b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f14671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p3.z0 f14673e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C1260I0 f14668h = new C1260I0(6);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static synchronized C1262J0 b() {
        try {
            if (f14667g == null) {
                f14667g = new C1262J0();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f14667g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        C1260I0 c1260i0 = f14668h;
        c1260i0.getClass();
        int i7 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) c1260i0.h(Integer.valueOf(mode.hashCode() + i7));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Drawable a(Context context, int i) {
        Drawable drawableNewDrawable;
        WeakReference weakReference;
        if (this.f14671c == null) {
            this.f14671c = new TypedValue();
        }
        TypedValue typedValue = this.f14671c;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            C1566q c1566q = (C1566q) this.f14670b.get(context);
            drawableNewDrawable = null;
            if (c1566q != null && (weakReference = (WeakReference) c1566q.b(j)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    c1566q.f(j);
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        LayerDrawable layerDrawableE = null;
        if (this.f14673e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawableE = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawableE = p3.z0.E(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableE = p3.z0.E(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawableE = p3.z0.E(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableE == null) {
            return layerDrawableE;
        }
        layerDrawableE.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableE.getConstantState();
                if (constantState2 != null) {
                    C1566q c1566q2 = (C1566q) this.f14670b.get(context);
                    if (c1566q2 == null) {
                        c1566q2 = new C1566q((Object) null);
                        this.f14670b.put(context, c1566q2);
                    }
                    c1566q2.e(j, new WeakReference(constantState2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawableE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized Drawable c(Context context, int i) {
        return d(context, i, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized Drawable d(Context context, int i, boolean z5) {
        Drawable drawableA;
        try {
            if (!this.f14672d) {
                this.f14672d = true;
                Drawable drawableC = c(context, R.drawable.abc_vector_test);
                if (drawableC == null || (!(drawableC instanceof r2.o) && !"android.graphics.drawable.VectorDrawable".equals(drawableC.getClass().getName()))) {
                    this.f14672d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableA = a(context, i);
            if (drawableA == null) {
                drawableA = context.getDrawable(i);
            }
            if (drawableA != null) {
                drawableA = g(context, i, z5, drawableA);
            }
            if (drawableA != null) {
                AbstractC1313j0.a(drawableA);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized ColorStateList f(Context context, int i) {
        ColorStateList colorStateList;
        r.S s6;
        WeakHashMap weakHashMap = this.f14669a;
        ColorStateList colorStateListF = null;
        colorStateList = (weakHashMap == null || (s6 = (r.S) weakHashMap.get(context)) == null) ? null : (ColorStateList) s6.c(i);
        if (colorStateList == null) {
            p3.z0 z0Var = this.f14673e;
            if (z0Var != null) {
                colorStateListF = z0Var.F(context, i);
            }
            if (colorStateListF != null) {
                if (this.f14669a == null) {
                    this.f14669a = new WeakHashMap();
                }
                r.S s7 = (r.S) this.f14669a.get(context);
                if (s7 == null) {
                    s7 = new r.S(0);
                    this.f14669a.put(context, s7);
                }
                s7.a(i, colorStateListF);
            }
            colorStateList = colorStateListF;
        }
        return colorStateList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable g(android.content.Context r8, int r9, boolean r10, android.graphics.drawable.Drawable r11) {
        /*
            r7 = this;
            android.content.res.ColorStateList r0 = r7.f(r8, r9)
            r1 = 0
            if (r0 == 0) goto L20
            android.graphics.drawable.Drawable r8 = r11.mutate()
            r8.setTintList(r0)
            p3.z0 r10 = r7.f14673e
            if (r10 != 0) goto L13
            goto L1a
        L13:
            r10 = 2131165290(0x7f07006a, float:1.7944793E38)
            if (r9 != r10) goto L1a
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
        L1a:
            if (r1 == 0) goto L1f
            r8.setTintMode(r1)
        L1f:
            return r8
        L20:
            p3.z0 r0 = r7.f14673e
            if (r0 == 0) goto L94
            r0 = 2131165285(0x7f070065, float:1.7944783E38)
            r2 = 16908301(0x102000d, float:2.3877265E-38)
            r3 = 16908303(0x102000f, float:2.387727E-38)
            r4 = 16908288(0x1020000, float:2.387723E-38)
            r5 = 2130903291(0x7f0300fb, float:1.7413396E38)
            r6 = 2130903293(0x7f0300fd, float:1.74134E38)
            if (r9 != r0) goto L5e
            r9 = r11
            android.graphics.drawable.LayerDrawable r9 = (android.graphics.drawable.LayerDrawable) r9
            android.graphics.drawable.Drawable r10 = r9.findDrawableByLayerId(r4)
            int r0 = m.AbstractC1272O0.c(r8, r6)
            android.graphics.PorterDuff$Mode r1 = m.C1328r.f14861b
            p3.z0.X(r10, r0, r1)
            android.graphics.drawable.Drawable r10 = r9.findDrawableByLayerId(r3)
            int r0 = m.AbstractC1272O0.c(r8, r6)
            p3.z0.X(r10, r0, r1)
            android.graphics.drawable.Drawable r9 = r9.findDrawableByLayerId(r2)
            int r8 = m.AbstractC1272O0.c(r8, r5)
            p3.z0.X(r9, r8, r1)
            return r11
        L5e:
            r0 = 2131165276(0x7f07005c, float:1.7944765E38)
            if (r9 == r0) goto L6d
            r0 = 2131165275(0x7f07005b, float:1.7944763E38)
            if (r9 == r0) goto L6d
            r0 = 2131165277(0x7f07005d, float:1.7944767E38)
            if (r9 != r0) goto L94
        L6d:
            r9 = r11
            android.graphics.drawable.LayerDrawable r9 = (android.graphics.drawable.LayerDrawable) r9
            android.graphics.drawable.Drawable r10 = r9.findDrawableByLayerId(r4)
            int r0 = m.AbstractC1272O0.b(r8, r6)
            android.graphics.PorterDuff$Mode r1 = m.C1328r.f14861b
            p3.z0.X(r10, r0, r1)
            android.graphics.drawable.Drawable r10 = r9.findDrawableByLayerId(r3)
            int r0 = m.AbstractC1272O0.c(r8, r5)
            p3.z0.X(r10, r0, r1)
            android.graphics.drawable.Drawable r9 = r9.findDrawableByLayerId(r2)
            int r8 = m.AbstractC1272O0.c(r8, r5)
            p3.z0.X(r9, r8, r1)
            return r11
        L94:
            p3.z0 r0 = r7.f14673e
            r2 = 0
            if (r0 == 0) goto L100
            android.graphics.PorterDuff$Mode r3 = m.C1328r.f14861b
            java.lang.Object r4 = r0.f15875a
            int[] r4 = (int[]) r4
            boolean r4 = p3.z0.g(r4, r9)
            r5 = 1
            r6 = -1
            if (r4 == 0) goto Lad
            r9 = 2130903293(0x7f0300fd, float:1.74134E38)
        Laa:
            r4 = r5
        Lab:
            r0 = r6
            goto Le9
        Lad:
            java.lang.Object r4 = r0.f15877c
            int[] r4 = (int[]) r4
            boolean r4 = p3.z0.g(r4, r9)
            if (r4 == 0) goto Lbb
            r9 = 2130903291(0x7f0300fb, float:1.7413396E38)
            goto Laa
        Lbb:
            java.lang.Object r0 = r0.f15878d
            int[] r0 = (int[]) r0
            boolean r0 = p3.z0.g(r0, r9)
            r4 = 16842801(0x1010031, float:2.3693695E-38)
            if (r0 == 0) goto Lcc
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
        Lca:
            r9 = r4
            goto Laa
        Lcc:
            r0 = 2131165262(0x7f07004e, float:1.7944736E38)
            if (r9 != r0) goto Le0
            r9 = 1109603123(0x42233333, float:40.8)
            int r9 = java.lang.Math.round(r9)
            r0 = 16842800(0x1010030, float:2.3693693E-38)
            r4 = r0
            r0 = r9
            r9 = r4
            r4 = r5
            goto Le9
        Le0:
            r0 = 2131165244(0x7f07003c, float:1.79447E38)
            if (r9 != r0) goto Le6
            goto Lca
        Le6:
            r9 = r2
            r4 = r9
            goto Lab
        Le9:
            if (r4 == 0) goto L100
            android.graphics.drawable.Drawable r2 = r11.mutate()
            int r8 = m.AbstractC1272O0.c(r8, r9)
            android.graphics.PorterDuffColorFilter r8 = m.C1328r.c(r8, r3)
            r2.setColorFilter(r8)
            if (r0 == r6) goto Lff
            r2.setAlpha(r0)
        Lff:
            r2 = r5
        L100:
            if (r2 != 0) goto L105
            if (r10 == 0) goto L105
            return r1
        L105:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C1262J0.g(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
