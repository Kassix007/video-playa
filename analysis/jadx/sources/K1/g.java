package k1;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.wnapp.smspariaz.R;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f14063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f14064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14067e;
    public final CharSequence f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PendingIntent f14068g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g(String str, PendingIntent pendingIntent) {
        IconCompat iconCompatA = IconCompat.a(R.drawable.common_full_open_on_phone);
        Bundle bundle = new Bundle();
        this.f14066d = true;
        this.f14064b = iconCompatA;
        int iIntValue = iconCompatA.f9433a;
        if (iIntValue == -1) {
            int i = Build.VERSION.SDK_INT;
            Object obj = iconCompatA.f9434b;
            if (i >= 28) {
                iIntValue = A1.k.l(obj);
            } else {
                try {
                    iIntValue = ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
                } catch (IllegalAccessException e7) {
                    Log.e("IconCompat", "Unable to get icon type " + obj, e7);
                    iIntValue = -1;
                } catch (NoSuchMethodException e8) {
                    Log.e("IconCompat", "Unable to get icon type " + obj, e8);
                    iIntValue = -1;
                } catch (InvocationTargetException e9) {
                    Log.e("IconCompat", "Unable to get icon type " + obj, e9);
                    iIntValue = -1;
                }
            }
        }
        if (iIntValue == 2) {
            this.f14067e = iconCompatA.b();
        }
        this.f = h.b(str);
        this.f14068g = pendingIntent;
        this.f14063a = bundle;
        this.f14065c = true;
        this.f14066d = true;
    }
}
