package K4;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.text.TextPaint;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class c extends n implements B5.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f2908A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ boolean f2909B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ boolean f2910C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ float f2911D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ float f2912E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final /* synthetic */ int f2913F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final /* synthetic */ int f2914G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final /* synthetic */ int f2915H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final /* synthetic */ int f2916I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final /* synthetic */ int f2917J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final /* synthetic */ float f2918K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final /* synthetic */ float f2919L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final /* synthetic */ float f2920M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final /* synthetic */ int f2921N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final /* synthetic */ ColorStateList f2922O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final /* synthetic */ PorterDuff.Mode f2923P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final /* synthetic */ ColorFilter f2924Q;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ ColorStateList f2925q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Paint.Style f2926r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Typeface f2927s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ColorStateList f2928t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ColorStateList f2929u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ColorStateList f2930v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f2931w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ O4.a f2932x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f2933y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f2934z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ColorStateList colorStateList, Paint.Style style, Typeface typeface, ColorStateList colorStateList2, ColorStateList colorStateList3, ColorStateList colorStateList4, int i, O4.a aVar, boolean z5, int i7, int i8, boolean z6, boolean z7, float f, float f7, int i9, int i10, int i11, int i12, int i13, float f8, float f9, float f10, int i14, ColorStateList colorStateList5, PorterDuff.Mode mode, ColorFilter colorFilter) {
        super(1);
        this.f2925q = colorStateList;
        this.f2926r = style;
        this.f2927s = typeface;
        this.f2928t = colorStateList2;
        this.f2929u = colorStateList3;
        this.f2930v = colorStateList4;
        this.f2931w = i;
        this.f2932x = aVar;
        this.f2933y = z5;
        this.f2934z = i7;
        this.f2908A = i8;
        this.f2909B = z6;
        this.f2910C = z7;
        this.f2911D = f;
        this.f2912E = f7;
        this.f2913F = i9;
        this.f2914G = i10;
        this.f2915H = i11;
        this.f2916I = i12;
        this.f2917J = i13;
        this.f2918K = f8;
        this.f2919L = f9;
        this.f2920M = f10;
        this.f2921N = i14;
        this.f2922O = colorStateList5;
        this.f2923P = mode;
        this.f2924Q = colorFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        d apply = (d) obj;
        m.e(apply, "$this$apply");
        b bVar = apply.f2944c;
        bVar.f2907c = this.f2925q;
        if (bVar.a(apply.getState())) {
            apply.a();
        }
        ((TextPaint) apply.f2944c.f2905a).setStyle(this.f2926r);
        apply.a();
        ((TextPaint) apply.f2944c.f2905a).setTypeface(this.f2927s);
        apply.a();
        b bVar2 = apply.f2945d;
        bVar2.f2907c = this.f2928t;
        if (bVar2.a(apply.getState())) {
            apply.a();
        }
        apply.c(this.f2929u);
        b bVar3 = apply.f;
        bVar3.f2907c = this.f2930v;
        if (bVar3.a(apply.getState())) {
            apply.a();
        }
        apply.j = this.f2931w;
        apply.a();
        apply.e(this.f2932x);
        boolean z5 = this.f2933y;
        apply.f2950l = z5;
        apply.setAutoMirrored(z5);
        apply.a();
        int i = this.f2934z;
        apply.f2953o = i;
        apply.setBounds(0, 0, i, apply.f2954p);
        int i7 = this.f2908A;
        apply.f2954p = i7;
        apply.setBounds(0, 0, apply.f2953o, i7);
        apply.a();
        boolean z6 = apply.f2955q;
        boolean z7 = this.f2909B;
        if (z7 != z6) {
            apply.f2955q = z7;
            apply.f(((z7 ? 1 : -1) * apply.f2960v) + apply.f2959u);
            apply.a();
        }
        apply.d(this.f2910C);
        apply.f2957s = this.f2911D;
        apply.a();
        apply.f2958t = this.f2912E;
        apply.a();
        apply.f(this.f2913F);
        int i8 = this.f2914G;
        apply.f2960v = i8;
        apply.f.f2905a.setStrokeWidth(i8);
        if (true != apply.f2955q) {
            apply.f2955q = true;
            apply.f(apply.f2960v + apply.f2959u);
            apply.a();
        }
        apply.a();
        int i9 = this.f2915H;
        apply.f2961w = i9;
        apply.f2945d.f2905a.setStrokeWidth(i9);
        apply.d(true);
        apply.a();
        apply.f2962x = this.f2916I;
        apply.a();
        apply.f2963y = this.f2917J;
        apply.a();
        apply.f2964z = this.f2918K;
        apply.j();
        apply.f2935A = this.f2919L;
        apply.j();
        apply.f2936B = this.f2920M;
        apply.j();
        apply.f2937C = this.f2921N;
        apply.j();
        apply.a();
        apply.f2938D = this.f2922O;
        apply.k();
        apply.a();
        apply.f2939E = this.f2923P;
        apply.k();
        apply.a();
        apply.f2941G = this.f2924Q;
        apply.a();
        return C1386y.f15098a;
    }
}
