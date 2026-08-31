package C0;

import M5.AbstractC0263y;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.wnapp.smspariaz.R;
import java.util.LinkedHashMap;
import u2.C1692m;

/* JADX INFO: loaded from: classes.dex */
public abstract class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f1108a = new LinkedHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final P5.P a(Context context) {
        P5.P p7;
        LinkedHashMap linkedHashMap = f1108a;
        synchronized (linkedHashMap) {
            try {
                Object objK = linkedHashMap.get(context);
                if (objK == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    O5.e eVarE = l6.d.e(-1, null, 6);
                    C1692m c1692m = new C1692m(new q1(contentResolver, uriFor, new r1(eVarE, AbstractC0836n2.k(Looper.getMainLooper())), eVarE, context, null));
                    M5.q0 q0VarC = AbstractC0263y.c();
                    T5.e eVar = M5.H.f3811a;
                    objK = P5.H.k(c1692m, new R5.d(E3.h.L(q0VarC, R5.n.f7261a)), new P5.O(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, objK);
                }
                p7 = (P5.P) objK;
            } catch (Throwable th) {
                throw th;
            }
        }
        return p7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final P.r b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof P.r) {
            return (P.r) tag;
        }
        return null;
    }
}
