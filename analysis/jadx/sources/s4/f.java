package s4;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import k4.C1188a;

/* JADX INFO: loaded from: classes.dex */
public class f extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f16479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1188a f16480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f16481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorStateList f16482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorStateList f16483e;
    public PorterDuff.Mode f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Rect f16484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f16485h;
    public float i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16486k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f16487l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f16488m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f16489n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f16490o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Paint.Style f16491p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f(k kVar) {
        this.f16481c = null;
        this.f16482d = null;
        this.f16483e = null;
        this.f = PorterDuff.Mode.SRC_IN;
        this.f16484g = null;
        this.f16485h = 1.0f;
        this.i = 1.0f;
        this.f16486k = 255;
        this.f16487l = 0.0f;
        this.f16488m = 0.0f;
        this.f16489n = 0;
        this.f16490o = 0;
        this.f16491p = Paint.Style.FILL_AND_STROKE;
        this.f16479a = kVar;
        this.f16480b = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f16509u = true;
        return gVar;
    }

    public f(f fVar) {
        this.f16481c = null;
        this.f16482d = null;
        this.f16483e = null;
        this.f = PorterDuff.Mode.SRC_IN;
        this.f16484g = null;
        this.f16485h = 1.0f;
        this.i = 1.0f;
        this.f16486k = 255;
        this.f16487l = 0.0f;
        this.f16488m = 0.0f;
        this.f16489n = 0;
        this.f16490o = 0;
        this.f16491p = Paint.Style.FILL_AND_STROKE;
        this.f16479a = fVar.f16479a;
        this.f16480b = fVar.f16480b;
        this.j = fVar.j;
        this.f16481c = fVar.f16481c;
        this.f16482d = fVar.f16482d;
        this.f = fVar.f;
        this.f16483e = fVar.f16483e;
        this.f16486k = fVar.f16486k;
        this.f16485h = fVar.f16485h;
        this.f16490o = fVar.f16490o;
        this.i = fVar.i;
        this.f16487l = fVar.f16487l;
        this.f16488m = fVar.f16488m;
        this.f16489n = fVar.f16489n;
        this.f16491p = fVar.f16491p;
        if (fVar.f16484g != null) {
            this.f16484g = new Rect(fVar.f16484g);
        }
    }
}
