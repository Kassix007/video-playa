package v3;

import F.C0151e;
import F.C0162p;
import F.F;
import android.content.Context;
import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.WindowInsetsAnimation;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.wnapp.smspariaz.R;
import i1.C1134a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import w0.C1824c;
import x3.AbstractC1887A;
import z4.C1980n;
import z4.InterfaceC1969c;

/* JADX INFO: loaded from: classes.dex */
public final class l implements InterfaceC1969c, S3.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f17578q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f17579r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f17580s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ l(int i, Object obj, Object obj2) {
        this.f17578q = i;
        this.f17579r = obj;
        this.f17580s = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(Object obj, String str) {
        ((ArrayList) this.f17579r).add(str + "=" + String.valueOf(obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String b(String str) {
        String str2 = (String) this.f17580s;
        Resources resources = (Resources) this.f17579r;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c(boolean z5, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (((Map) this.f17579r)) {
            map = new HashMap((Map) this.f17579r);
        }
        synchronized (((Map) this.f17580s)) {
            map2 = new HashMap((Map) this.f17580s);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z5 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).y0(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z5 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((S3.e) entry2.getKey()).a(new com.google.android.gms.common.g(status));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // S3.a
    public void onComplete(S3.d dVar) {
        C1980n c1980n = (C1980n) this.f17579r;
        S3.e eVar = (S3.e) this.f17580s;
        synchronized (c1980n.f) {
            c1980n.f18764e.remove(eVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f17578q) {
            case 2:
                return "Bounds{lower=" + ((n1.b) this.f17579r) + " upper=" + ((n1.b) this.f17580s) + "}";
            case 3:
            default:
                return super.toString();
            case 4:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f17580s.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.f17579r;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z4.InterfaceC1969c
    public Object zza() {
        return new y4.j(((C3.b) ((C1134a) this.f17579r).f13535r).f1185a, (y4.k) ((InterfaceC1969c) this.f17580s).zza());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public l(int i) {
        this.f17578q = i;
        switch (i) {
            case 1:
                this.f17579r = new C1824c(0);
                this.f17580s = new C1824c(0);
                break;
            case 6:
                com.google.android.gms.common.e eVar = com.google.android.gms.common.e.f10341d;
                this.f17579r = new SparseIntArray();
                this.f17580s = eVar;
                break;
            default:
                this.f17579r = Collections.synchronizedMap(new WeakHashMap());
                this.f17580s = Collections.synchronizedMap(new WeakHashMap());
                break;
        }
    }

    public l(Context context) {
        this.f17578q = 5;
        AbstractC1887A.g(context);
        Resources resources = context.getResources();
        this.f17579r = resources;
        this.f17580s = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public /* synthetic */ l(Object obj) {
        this.f17578q = 4;
        this.f17580s = obj;
        this.f17579r = new ArrayList();
    }

    public l(C0151e c0151e, C0162p c0162p, F f) {
        this.f17578q = 3;
        this.f17579r = c0151e;
        this.f17580s = c0162p;
    }

    public l(WindowInsetsAnimation.Bounds bounds) {
        this.f17578q = 2;
        this.f17579r = n1.b.c(bounds.getLowerBound());
        this.f17580s = n1.b.c(bounds.getUpperBound());
    }
}
