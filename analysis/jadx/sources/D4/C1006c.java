package d4;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.wnapp.smspariaz.R;
import java.util.WeakHashMap;
import q4.AbstractC1521a;
import s4.f;
import s4.g;
import s4.k;
import s4.u;
import w1.AbstractC1835K;

/* JADX INFO: renamed from: d4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1006c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialButton f12273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f12274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12277e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12279h;
    public PorterDuff.Mode i;
    public ColorStateList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f12280k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f12281l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public g f12282m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f12286q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RippleDrawable f12288s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f12289t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f12283n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f12284o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f12285p = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f12287r = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1006c(MaterialButton materialButton, k kVar) {
        this.f12273a = materialButton;
        this.f12274b = kVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final u a() {
        RippleDrawable rippleDrawable = this.f12288s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f12288s.getNumberOfLayers() > 2 ? (u) this.f12288s.getDrawable(2) : (u) this.f12288s.getDrawable(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final g b(boolean z5) {
        RippleDrawable rippleDrawable = this.f12288s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.f12288s.getDrawable(0)).getDrawable()).getDrawable(!z5 ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(k kVar) {
        this.f12274b = kVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(kVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(kVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(kVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(int i, int i7) {
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        MaterialButton materialButton = this.f12273a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i8 = this.f12277e;
        int i9 = this.f;
        this.f = i7;
        this.f12277e = i;
        if (!this.f12284o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i8, paddingEnd, (paddingBottom + i7) - i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e() {
        g gVar = new g(this.f12274b);
        MaterialButton materialButton = this.f12273a;
        gVar.i(materialButton.getContext());
        gVar.setTintList(this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            gVar.setTintMode(mode);
        }
        float f = this.f12279h;
        ColorStateList colorStateList = this.f12280k;
        gVar.f16505q.j = f;
        gVar.invalidateSelf();
        f fVar = gVar.f16505q;
        if (fVar.f16482d != colorStateList) {
            fVar.f16482d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        g gVar2 = new g(this.f12274b);
        gVar2.setTint(0);
        float f7 = this.f12279h;
        int iD = this.f12283n ? Q2.g.D(materialButton, R.attr.colorSurface) : 0;
        gVar2.f16505q.j = f7;
        gVar2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iD);
        f fVar2 = gVar2.f16505q;
        if (fVar2.f16482d != colorStateListValueOf) {
            fVar2.f16482d = colorStateListValueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        g gVar3 = new g(this.f12274b);
        this.f12282m = gVar3;
        gVar3.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(AbstractC1521a.b(this.f12281l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f12275c, this.f12277e, this.f12276d, this.f), this.f12282m);
        this.f12288s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        g gVarB = b(false);
        if (gVarB != null) {
            gVarB.j(this.f12289t);
            gVarB.setState(materialButton.getDrawableState());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f() {
        g gVarB = b(false);
        g gVarB2 = b(true);
        if (gVarB != null) {
            float f = this.f12279h;
            ColorStateList colorStateList = this.f12280k;
            gVarB.f16505q.j = f;
            gVarB.invalidateSelf();
            f fVar = gVarB.f16505q;
            if (fVar.f16482d != colorStateList) {
                fVar.f16482d = colorStateList;
                gVarB.onStateChange(gVarB.getState());
            }
            if (gVarB2 != null) {
                float f7 = this.f12279h;
                int iD = this.f12283n ? Q2.g.D(this.f12273a, R.attr.colorSurface) : 0;
                gVarB2.f16505q.j = f7;
                gVarB2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iD);
                f fVar2 = gVarB2.f16505q;
                if (fVar2.f16482d != colorStateListValueOf) {
                    fVar2.f16482d = colorStateListValueOf;
                    gVarB2.onStateChange(gVarB2.getState());
                }
            }
        }
    }
}
