package r4;

import android.graphics.Paint;
import android.graphics.Path;
import n1.AbstractC1393a;

/* JADX INFO: renamed from: r4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1579a {
    public static final int[] i = new int[3];
    public static final float[] j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f16347k = new int[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f16348l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f16349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f16350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f16351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16353e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f16354g = new Path();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f16355h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1579a() {
        Paint paint = new Paint();
        this.f16355h = paint;
        Paint paint2 = new Paint();
        this.f16349a = paint2;
        this.f16352d = AbstractC1393a.e(-16777216, 68);
        this.f16353e = AbstractC1393a.e(-16777216, 20);
        this.f = AbstractC1393a.e(-16777216, 0);
        paint2.setColor(this.f16352d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f16350b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f16351c = new Paint(paint3);
    }
}
