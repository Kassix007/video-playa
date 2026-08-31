package b;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.InterfaceC0658v;
import com.google.android.gms.internal.measurement.I1;
import com.google.android.gms.internal.measurement.K1;
import e.C1008a;
import e.C1011d;
import e.C1012e;
import e.C1013f;
import e.C1014g;
import e.C1015h;
import e.InterfaceC1009b;
import h.AbstractActivityC1106h;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import k1.AbstractC1175c;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f9873a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f9874b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f9875c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f9876d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f9877e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f9878g = new Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC1106h f9879h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j(AbstractActivityC1106h abstractActivityC1106h) {
        this.f9879h = abstractActivityC1106h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a(int i, int i7, Intent intent) {
        String str = (String) this.f9873a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C1011d c1011d = (C1011d) this.f9877e.get(str);
        if ((c1011d != null ? c1011d.f12460a : null) != null) {
            ArrayList arrayList = this.f9876d;
            if (arrayList.contains(str)) {
                c1011d.f12460a.d(c1011d.f12461b.A0(intent, i7));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.f9878g.putParcelable(str, new C1008a(intent, i7));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(int i, I1 i12, Object obj) {
        Bundle bundleExtra;
        int i7;
        AbstractActivityC1106h abstractActivityC1106h = this.f9879h;
        k3.d dVarN0 = i12.n0(abstractActivityC1106h, obj);
        if (dVarN0 != null) {
            new Handler(Looper.getMainLooper()).post(new i(i, 0, this, dVarN0));
            return;
        }
        Intent intentP = i12.P(abstractActivityC1106h, obj);
        if (intentP.getExtras() != null) {
            Bundle extras = intentP.getExtras();
            kotlin.jvm.internal.m.b(extras);
            if (extras.getClassLoader() == null) {
                intentP.setExtrasClassLoader(abstractActivityC1106h.getClassLoader());
            }
        }
        if (intentP.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentP.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentP.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentP.getAction())) {
            String[] stringArrayExtra = intentP.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            AbstractC1175c.h(abstractActivityC1106h, stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentP.getAction())) {
            abstractActivityC1106h.startActivityForResult(intentP, i, bundle);
            return;
        }
        C1015h c1015h = (C1015h) intentP.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            kotlin.jvm.internal.m.b(c1015h);
            i7 = i;
        } catch (IntentSender.SendIntentException e7) {
            e = e7;
            i7 = i;
        }
        try {
            abstractActivityC1106h.startIntentSenderForResult(c1015h.f12468q, i7, c1015h.f12469r, c1015h.f12470s, c1015h.f12471t, 0, bundle);
        } catch (IntentSender.SendIntentException e8) {
            e = e8;
            new Handler(Looper.getMainLooper()).post(new i(i7, 1, this, e));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C1014g c(String key, I1 i12, InterfaceC1009b interfaceC1009b) {
        kotlin.jvm.internal.m.e(key, "key");
        d(key);
        this.f9877e.put(key, new C1011d(i12, interfaceC1009b));
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(key)) {
            Object obj = linkedHashMap.get(key);
            linkedHashMap.remove(key);
            interfaceC1009b.d(obj);
        }
        Bundle bundle = this.f9878g;
        C1008a c1008a = (C1008a) K1.r(key, bundle);
        if (c1008a != null) {
            bundle.remove(key);
            interfaceC1009b.d(i12.A0(c1008a.f12455r, c1008a.f12454q));
        }
        return new C1014g(this, key, i12, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(String str) {
        LinkedHashMap linkedHashMap = this.f9874b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        for (Number number : new I5.a(new I5.g(C1013f.f12464q, new I5.m(0), 1))) {
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.f9873a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(String key) {
        Integer num;
        kotlin.jvm.internal.m.e(key, "key");
        if (!this.f9876d.contains(key) && (num = (Integer) this.f9874b.remove(key)) != null) {
            this.f9873a.remove(num);
        }
        this.f9877e.remove(key);
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + linkedHashMap.get(key));
            linkedHashMap.remove(key);
        }
        Bundle bundle = this.f9878g;
        if (bundle.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((C1008a) K1.r(key, bundle)));
            bundle.remove(key);
        }
        LinkedHashMap linkedHashMap2 = this.f9875c;
        C1012e c1012e = (C1012e) linkedHashMap2.get(key);
        if (c1012e != null) {
            ArrayList arrayList = c1012e.f12463b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                c1012e.f12462a.c((InterfaceC0658v) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(key);
        }
    }
}
