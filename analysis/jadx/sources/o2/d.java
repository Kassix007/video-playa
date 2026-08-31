package o2;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f15338a = new RectF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f15339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f15340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f15341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f15342e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f15343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f15344h;
    public int[] i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f15345k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f15346l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f15347m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f15348n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Path f15349o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f15350p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f15351q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15352r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15353s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15354t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f15355u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d() {
        Paint paint = new Paint();
        this.f15339b = paint;
        Paint paint2 = new Paint();
        this.f15340c = paint2;
        Paint paint3 = new Paint();
        this.f15341d = paint3;
        this.f15342e = 0.0f;
        this.f = 0.0f;
        this.f15343g = 0.0f;
        this.f15344h = 5.0f;
        this.f15350p = 1.0f;
        this.f15354t = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(int i) {
        this.j = i;
        this.f15355u = this.i[i];
    }
}
