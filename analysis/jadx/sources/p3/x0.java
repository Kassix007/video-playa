package p3;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.Log;
import i0.C1129a;

/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S f15861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f15864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f15865e;
    public C1129a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C1129a f15866g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15867h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x0() {
        Paint paint = new Paint();
        this.f15864d = paint;
        paint.setFlags(193);
        paint.setHinting(0);
        paint.setStyle(Paint.Style.FILL);
        Typeface typeface = Typeface.DEFAULT;
        paint.setTypeface(typeface);
        Paint paint2 = new Paint();
        this.f15865e = paint2;
        paint2.setFlags(193);
        paint2.setHinting(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setTypeface(typeface);
        this.f15861a = S.a();
    }

    public x0(x0 x0Var) {
        this.f15862b = x0Var.f15862b;
        this.f15863c = x0Var.f15863c;
        this.f15864d = new Paint(x0Var.f15864d);
        this.f15865e = new Paint(x0Var.f15865e);
        C1129a c1129a = x0Var.f;
        if (c1129a != null) {
            this.f = new C1129a(c1129a);
        }
        C1129a c1129a2 = x0Var.f15866g;
        if (c1129a2 != null) {
            this.f15866g = new C1129a(c1129a2);
        }
        this.f15867h = x0Var.f15867h;
        try {
            this.f15861a = (S) x0Var.f15861a.clone();
        } catch (CloneNotSupportedException e7) {
            Log.e("SVGAndroidRenderer", "Unexpected clone error", e7);
            this.f15861a = S.a();
        }
    }
}
