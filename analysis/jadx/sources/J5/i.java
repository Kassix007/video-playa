package J5;

import R4.i3;
import R4.l3;
import T1.z;
import android.content.Context;
import android.os.Bundle;
import android.widget.VideoView;
import androidx.lifecycle.I;
import androidx.work.impl.utils.PreferenceUtils;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.Map;
import kotlin.jvm.internal.y;
import m5.C1386y;
import n5.AbstractC1398a;
import n5.AbstractC1402e;
import org.json.JSONObject;
import w2.C1867e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2832q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f2833r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ i(int i, Object obj) {
        this.f2832q = i;
        this.f2833r = obj;
    }

    /* JADX DEBUG: Class process forced to load method for inline: androidx.work.impl.utils.PreferenceUtils.a(java.lang.Long):java.lang.Long */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v8, types: [X5.f, java.lang.Object] */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f2832q) {
            case 0:
                break;
            case 1:
                ((K2.f) this.f2833r).f2876B = true;
                break;
            case 2:
                l3 l3Var = (l3) this.f2833r;
                JSONObject jsonObject = (JSONObject) obj;
                kotlin.jvm.internal.m.e(jsonObject, "jsonObject");
                l3Var.a(jsonObject);
                String str = "javascript:console.log(" + jsonObject + ");";
                if (l3Var.f7123m != null) {
                    l3Var.f7122l.runOnUiThread(new i3(l3Var, str, 1));
                }
                break;
            case 3:
                y yVar = (y) this.f2833r;
                String key = (String) obj;
                kotlin.jvm.internal.m.e(key, "key");
                Object obj2 = yVar.f14268q;
                break;
            case 4:
                z zVar = (z) this.f2833r;
                T1.d backStackEntry = (T1.d) obj;
                kotlin.jvm.internal.m.e(backStackEntry, "backStackEntry");
                W1.c cVar = backStackEntry.f7360x;
                T1.p pVar = backStackEntry.f7354r;
                if (pVar == null) {
                    pVar = null;
                }
                if (pVar != null) {
                    cVar.a();
                    T1.p pVarC = zVar.c(pVar);
                    if (pVarC != null) {
                        if (!pVarC.equals(pVar)) {
                            break;
                        }
                    }
                }
                break;
            case 5:
                T1.u uVarL = AbstractC0836n2.l((Context) this.f2833r);
                uVarL.d((Bundle) obj);
                break;
            case 6:
                ((U5.c) this.f2833r).g(null);
                break;
            case 7:
                VideoView videoView = (VideoView) this.f2833r;
                kotlin.jvm.internal.m.e((Context) obj, "it");
                break;
            case 8:
                int iIntValue = ((Integer) obj).intValue();
                StringBuilder sb = new StringBuilder();
                ?? r12 = this.f2833r;
                sb.append(r12.e(iIntValue));
                sb.append(": ");
                sb.append(r12.i(iIntValue).b());
                break;
            case 9:
                ((a5.y) this.f2833r).c(true);
                break;
            case 10:
                ((I) this.f2833r).k(PreferenceUtils.lambda$getLastCancelAllTimeMillisLiveData$0((Long) obj));
                break;
            case 11:
                if (obj != ((AbstractC1398a) this.f2833r)) {
                    break;
                }
                break;
            case 12:
                AbstractC1402e abstractC1402e = (AbstractC1402e) this.f2833r;
                Map.Entry it = (Map.Entry) obj;
                kotlin.jvm.internal.m.e(it, "it");
                StringBuilder sb2 = new StringBuilder();
                Object key2 = it.getKey();
                sb2.append(key2 == abstractC1402e ? "(this Map)" : String.valueOf(key2));
                sb2.append('=');
                Object value = it.getValue();
                sb2.append(value != abstractC1402e ? String.valueOf(value) : "(this Map)");
                break;
            case 13:
                I0.i iVar = (I0.i) obj;
                I0.r.c(iVar, (String) this.f2833r);
                I0.r.d(iVar, 5);
                break;
            default:
                ((C1867e) this.f2833r).f18262A = true;
                break;
        }
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ i(int i, Object obj, Object obj2) {
        this.f2832q = i;
        this.f2833r = obj;
    }
}
