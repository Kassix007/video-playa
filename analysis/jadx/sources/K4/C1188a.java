package k4;

import Q2.g;
import a.AbstractC0597a;
import android.content.Context;
import com.wnapp.smspariaz.R;

/* JADX INFO: renamed from: k4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1188a {
    public static final int f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f14127e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1188a(Context context) {
        boolean zN = AbstractC0597a.N(context, R.attr.elevationOverlayEnabled, false);
        int iC = g.C(context, R.attr.elevationOverlayColor, 0);
        int iC2 = g.C(context, R.attr.elevationOverlayAccentColor, 0);
        int iC3 = g.C(context, R.attr.colorSurface, 0);
        float f7 = context.getResources().getDisplayMetrics().density;
        this.f14123a = zN;
        this.f14124b = iC;
        this.f14125c = iC2;
        this.f14126d = iC3;
        this.f14127e = f7;
    }
}
