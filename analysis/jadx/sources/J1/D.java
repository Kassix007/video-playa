package J1;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.measurement.I1;
import e.C1008a;
import e.C1015h;
import h.AbstractActivityC1106h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import k1.AbstractC1175c;
import m5.C1371j;

/* JADX INFO: loaded from: classes.dex */
public final class D extends I1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2507c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(int i) {
        super(17);
        this.f2507c = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1
    public final Object A0(Intent intent, int i) {
        switch (this.f2507c) {
            case 2:
                break;
            case 3:
                if (i != -1) {
                    intent = null;
                }
                if (intent != null) {
                }
                break;
            case 4:
                if (i != -1) {
                    intent = null;
                }
                if (intent != null) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Uri data = intent.getData();
                    if (data != null) {
                        linkedHashSet.add(data);
                    }
                    ClipData clipData = intent.getClipData();
                    if (clipData != null || !linkedHashSet.isEmpty()) {
                        if (clipData != null) {
                            int itemCount = clipData.getItemCount();
                            for (int i7 = 0; i7 < itemCount; i7++) {
                                Uri uri = clipData.getItemAt(i7).getUri();
                                if (uri != null) {
                                    linkedHashSet.add(uri);
                                }
                            }
                        }
                    }
                }
                break;
            case 5:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i8 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i8 == 0));
                        }
                        ArrayList arrayListM0 = n5.k.M0(stringArrayExtra);
                        Iterator it = arrayListM0.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(n5.m.c0(arrayListM0, 10), n5.m.c0(arrayList, 10)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new C1371j(it.next(), it2.next()));
                        }
                    }
                }
                break;
            case 6:
                if (intent != null && i == -1) {
                    int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    boolean z5 = false;
                    if (intArrayExtra2 != null) {
                        int length = intArrayExtra2.length;
                        int i9 = 0;
                        while (true) {
                            if (i9 < length) {
                                if (intArrayExtra2[i9] == 0) {
                                    z5 = true;
                                } else {
                                    i9++;
                                }
                            }
                        }
                    }
                }
                break;
        }
        return new C1008a(intent, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1
    public final Intent P(AbstractActivityC1106h abstractActivityC1106h, Object obj) {
        Bundle bundleExtra;
        switch (this.f2507c) {
            case 0:
                C1015h c1015h = (C1015h) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = c1015h.f12469r;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        c1015h = new C1015h(c1015h.f12468q, null, c1015h.f12470s, c1015h.f12471t);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c1015h);
                if (H.F(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
            case 1:
                return new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
            case 2:
                String input = (String) obj;
                kotlin.jvm.internal.m.e(input, "input");
                return new Intent("android.intent.action.VIEW", Uri.parse(input));
            case 3:
                String input2 = (String) obj;
                kotlin.jvm.internal.m.e(input2, "input");
                Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input2);
                kotlin.jvm.internal.m.d(type, "Intent(Intent.ACTION_GET…          .setType(input)");
                return type;
            case 4:
                String input3 = (String) obj;
                kotlin.jvm.internal.m.e(input3, "input");
                Intent intentPutExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input3).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                kotlin.jvm.internal.m.d(intentPutExtra, "Intent(Intent.ACTION_GET…TRA_ALLOW_MULTIPLE, true)");
                return intentPutExtra;
            case 5:
                String[] input4 = (String[]) obj;
                kotlin.jvm.internal.m.e(input4, "input");
                Intent intentPutExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input4);
                kotlin.jvm.internal.m.d(intentPutExtra2, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra2;
            case 6:
                String input5 = (String) obj;
                kotlin.jvm.internal.m.e(input5, "input");
                Intent intentPutExtra3 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{input5});
                kotlin.jvm.internal.m.d(intentPutExtra3, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra3;
            case 7:
                Intent input6 = (Intent) obj;
                kotlin.jvm.internal.m.e(input6, "input");
                return input6;
            default:
                C1015h input7 = (C1015h) obj;
                kotlin.jvm.internal.m.e(input7, "input");
                Intent intentPutExtra4 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", input7);
                kotlin.jvm.internal.m.d(intentPutExtra4, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
                return intentPutExtra4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1
    public k3.d n0(AbstractActivityC1106h abstractActivityC1106h, Object obj) {
        switch (this.f2507c) {
            case 3:
                String input = (String) obj;
                kotlin.jvm.internal.m.e(input, "input");
                return null;
            case 4:
                String input2 = (String) obj;
                kotlin.jvm.internal.m.e(input2, "input");
                return null;
            case 5:
                String[] input3 = (String[]) obj;
                kotlin.jvm.internal.m.e(input3, "input");
                if (input3.length == 0) {
                    return new k3.d(26, n5.t.f15300q);
                }
                for (String str : input3) {
                    if (AbstractC1175c.a(abstractActivityC1106h, str) != 0) {
                        return null;
                    }
                }
                int I6 = n5.y.I(input3.length);
                if (I6 < 16) {
                    I6 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(I6);
                for (String str2 : input3) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new k3.d(26, linkedHashMap);
            case 6:
                String input4 = (String) obj;
                kotlin.jvm.internal.m.e(input4, "input");
                if (AbstractC1175c.a(abstractActivityC1106h, input4) != 0) {
                    return null;
                }
                return new k3.d(26, Boolean.TRUE);
            default:
                return super.n0(abstractActivityC1106h, obj);
        }
    }
}
