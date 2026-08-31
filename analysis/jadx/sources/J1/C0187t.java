package J1;

import android.os.Bundle;
import d.InterfaceC0949a;
import h.AbstractActivityC1106h;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: J1.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0187t implements InterfaceC0949a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC1106h f2733b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0187t(AbstractActivityC1106h abstractActivityC1106h, int i) {
        this.f2732a = i;
        this.f2733b = abstractActivityC1106h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d.InterfaceC0949a
    public final void a(b.l it) {
        switch (this.f2732a) {
            case 0:
                C0188u c0188u = (C0188u) this.f2733b.f13295K.f14122r;
                c0188u.f2737w.b(c0188u, c0188u, null);
                break;
            default:
                kotlin.jvm.internal.m.e(it, "it");
                AbstractActivityC1106h abstractActivityC1106h = this.f2733b;
                Bundle bundleH = ((Z.m) abstractActivityC1106h.f9894t.f8313s).h("android:support:activity-result");
                if (bundleH != null) {
                    b.j jVar = abstractActivityC1106h.f9899y;
                    LinkedHashMap linkedHashMap = jVar.f9874b;
                    LinkedHashMap linkedHashMap2 = jVar.f9873a;
                    Bundle bundle = jVar.f9878g;
                    ArrayList<Integer> integerArrayList = bundleH.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleH.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = bundleH.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            jVar.f9876d.addAll(stringArrayList2);
                        }
                        Bundle bundle2 = bundleH.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        if (bundle2 != null) {
                            bundle.putAll(bundle2);
                        }
                        int size = stringArrayList.size();
                        for (int i = 0; i < size; i++) {
                            String str = stringArrayList.get(i);
                            if (linkedHashMap.containsKey(str)) {
                                Integer num = (Integer) linkedHashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    kotlin.jvm.internal.B.a(linkedHashMap2).remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i);
                            kotlin.jvm.internal.m.d(num2, "rcs[i]");
                            int iIntValue = num2.intValue();
                            String str2 = stringArrayList.get(i);
                            kotlin.jvm.internal.m.d(str2, "keys[i]");
                            String str3 = str2;
                            linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                            jVar.f9874b.put(str3, Integer.valueOf(iIntValue));
                        }
                        break;
                    }
                }
                break;
        }
    }
}
