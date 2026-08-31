package R4;

import B0.C0050o;
import M5.AbstractC0263y;
import a.AbstractC0597a;
import android.content.ClipData;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import e.C1008a;
import e.InterfaceC1009b;
import i1.C1134a;
import java.util.ArrayList;
import m.C1332t;
import org.json.JSONException;
import org.json.JSONObject;
import w1.AbstractC1835K;
import w1.C1841d;
import w1.InterfaceC1840c;
import w1.InterfaceC1850m;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class L0 implements InterfaceC1850m, InterfaceC1009b, o2.k, androidx.concurrent.futures.l, S3.c, S3.b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f6789q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f6790r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ L0(int i, Object obj) {
        this.f6789q = i;
        this.f6790r = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // o2.k
    public void a() {
        ((X1) this.f6790r).setRefreshing(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.concurrent.futures.l
    public Object b(androidx.concurrent.futures.k kVar) {
        M5.B b7 = (M5.B) this.f6790r;
        b7.G(new A.Y(20, kVar, b7));
        return "Deferred.asListenableFuture";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1850m
    public w1.o0 c(View view, w1.o0 o0Var) {
        C0498s0 c0498s0 = (C0498s0) this.f6790r;
        kotlin.jvm.internal.m.e(view, "view");
        AbstractC0263y.t(androidx.lifecycle.X.f(c0498s0.f7181b.f7069b), null, null, new M0(c0498s0, o0Var, null), 3);
        return o0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // e.InterfaceC1009b
    public void d(Object obj) throws JSONException {
        C0468k1 c0468k1 = (C0468k1) this.f6790r;
        C1008a result = (C1008a) obj;
        kotlin.jvm.internal.m.e(result, "result");
        C0050o c0050o = c0468k1.f7049I;
        if (c0050o != null) {
            Y4.d dVar = (Y4.d) c0050o.f500r;
            dVar.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "updateApplication");
            if (result.f12454q != -1) {
                jSONObject.put("updateStatus", "UPDATE_CANCELLED");
                k3.c cVar = dVar.f8279h;
                String value = AbstractC0597a.B();
                cVar.getClass();
                kotlin.jvm.internal.m.e(value, "value");
                ((SharedPreferences) cVar.f14120q).edit().putString("STORED_DATE", value).apply();
            } else {
                jSONObject.put("updateStatus", "UPDATE_STARTED");
            }
            if (dVar.f) {
                dVar.f8275c.invoke(jSONObject);
                dVar.f = false;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void e() {
        B5.e eVar = (B5.e) this.f6790r;
        synchronized (a0.n.f8680b) {
            Iterable iterable = (Iterable) a0.n.f8684g;
            kotlin.jvm.internal.m.e(iterable, "<this>");
            ArrayList arrayList = new ArrayList(n5.m.c0(iterable, 10));
            boolean z5 = false;
            for (Object obj : iterable) {
                boolean z6 = true;
                if (!z5 && kotlin.jvm.internal.m.a(obj, eVar)) {
                    z5 = true;
                    z6 = false;
                }
                if (z6) {
                    arrayList.add(obj);
                }
            }
            a0.n.f8684g = arrayList;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean f(C1134a c1134a, int i, Bundle bundle) {
        InterfaceC1840c c1134a2;
        C1332t c1332t = (C1332t) this.f6790r;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 25 && (i & 1) != 0) {
            try {
                ((y1.f) c1134a.f13535r).d();
                Parcelable parcelable = (Parcelable) ((y1.f) c1134a.f13535r).b();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e7) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e7);
                return false;
            }
        }
        y1.f fVar = (y1.f) c1134a.f13535r;
        ClipData clipData = new ClipData(fVar.a(), new ClipData.Item(fVar.c()));
        if (i7 >= 31) {
            c1134a2 = new C1134a(clipData, 2);
        } else {
            C1841d c1841d = new C1841d();
            c1841d.f18191r = clipData;
            c1841d.f18192s = 2;
            c1134a2 = c1841d;
        }
        c1134a2.k(fVar.e());
        c1134a2.setExtras(bundle);
        return AbstractC1835K.i(c1332t, c1134a2.build()) == null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // S3.c
    public void g(Object obj) {
        switch (this.f6789q) {
            case 4:
                ((Y4.b) this.f6790r).invoke(obj);
                break;
            case 5:
                ((Y4.b) this.f6790r).invoke(obj);
                break;
            case 6:
                ((Y4.b) this.f6790r).invoke(obj);
                break;
            default:
                ((Y4.b) this.f6790r).invoke(obj);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // S3.b
    public void q(Exception exc) throws JSONException {
        Y4.d dVar = (Y4.d) this.f6790r;
        dVar.f8277e.put("isUpdateAvailable", false);
        dVar.f8275c.invoke(dVar.f8277e);
    }
}
