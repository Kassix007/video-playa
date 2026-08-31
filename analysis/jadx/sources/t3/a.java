package t3;

import Z.m;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.internal.clearcut.B0;
import com.google.android.gms.internal.clearcut.U;
import com.google.android.gms.internal.clearcut.p0;
import r6.f;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final m j = new m("ClearcutLogger.API", new Q3.b(2), new f());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16725e;
    public final p0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final U f16726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final B3.a f16727h;
    public final B0 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a(Context context) {
        U u6 = new U(context, j, null, new u3.c(new f(), Looper.getMainLooper()));
        B0 b02 = new B0(context);
        this.f16725e = -1;
        p0 p0Var = p0.DEFAULT;
        this.f = p0Var;
        this.f16721a = context;
        this.f16722b = context.getPackageName();
        int i = 0;
        try {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e7) {
            Log.wtf("ClearcutLogger", "This can't happen.", e7);
        }
        this.f16723c = i;
        this.f16725e = -1;
        this.f16724d = "VISION";
        this.f16726g = u6;
        this.f16727h = B3.a.f551a;
        this.f = p0Var;
        this.i = b02;
    }
}
