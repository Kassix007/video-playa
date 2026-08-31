package h;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import r.C1550a;
import r.C1555f;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final androidx.room.F f13301q = new androidx.room.F(new S3.j(1));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f13302r = -100;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static r1.e f13303s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static r1.e f13304t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static Boolean f13305u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static boolean f13306v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C1555f f13307w = new C1555f(0);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Object f13308x = new Object();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Object f13309y = new Object();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean b(Context context) {
        if (f13305u == null) {
            try {
                int i = AbstractServiceC1097D.f13205r;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC1097D.class), AbstractC1096C.a() | 128).metaData;
                if (bundle != null) {
                    f13305u = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f13305u = Boolean.FALSE;
            }
        }
        return f13305u.booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void f(y yVar) {
        synchronized (f13308x) {
            try {
                C1555f c1555f = f13307w;
                c1555f.getClass();
                C1550a c1550a = new C1550a(c1555f);
                while (c1550a.hasNext()) {
                    l lVar = (l) ((WeakReference) c1550a.next()).get();
                    if (lVar == yVar || lVar == null) {
                        c1550a.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void c();

    public abstract void d();

    public abstract boolean g(int i);

    public abstract void h(int i);

    public abstract void j(View view);

    public abstract void k(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void l(CharSequence charSequence);
}
