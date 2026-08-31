package v;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import w.EnumC1778d0;

/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f17229c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EdgeEffect f17230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EdgeEffect f17231e;
    public EdgeEffect f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public EdgeEffect f17232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public EdgeEffect f17233h;
    public EdgeEffect i;
    public EdgeEffect j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public EdgeEffect f17234k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public E(Context context, int i) {
        this.f17227a = context;
        this.f17228b = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? AbstractC1720o.b(edgeEffect) : 0.0f) == 0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final EdgeEffect a(EnumC1778d0 enumC1778d0) {
        int i = Build.VERSION.SDK_INT;
        Context context = this.f17227a;
        EdgeEffect edgeEffectA = i >= 31 ? AbstractC1720o.a(context) : new K(context);
        edgeEffectA.setColor(this.f17228b);
        if (!W0.k.a(this.f17229c, 0L)) {
            if (enumC1778d0 == EnumC1778d0.f17945q) {
                long j = this.f17229c;
                edgeEffectA.setSize((int) (j >> 32), (int) (j & 4294967295L));
                return edgeEffectA;
            }
            long j7 = this.f17229c;
            edgeEffectA.setSize((int) (j7 & 4294967295L), (int) (j7 >> 32));
        }
        return edgeEffectA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.f17231e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(EnumC1778d0.f17945q);
        this.f17231e = edgeEffectA;
        return edgeEffectA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(EnumC1778d0.f17946r);
        this.f = edgeEffectA;
        return edgeEffectA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.f17232g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(EnumC1778d0.f17946r);
        this.f17232g = edgeEffectA;
        return edgeEffectA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.f17230d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(EnumC1778d0.f17945q);
        this.f17230d = edgeEffectA;
        return edgeEffectA;
    }
}
