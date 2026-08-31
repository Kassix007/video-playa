package b;

import android.content.Intent;
import android.content.IntentSender;
import b2.C0690a;
import b2.InterfaceC0692c;
import e.C1011d;
import e.InterfaceC1009b;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f9869q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f9870r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f9871s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f9872t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ i(int i, int i7, Object obj, Object obj2) {
        this.f9869q = i7;
        this.f9870r = obj;
        this.f9871s = i;
        this.f9872t = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9869q) {
            case 0:
                j jVar = (j) this.f9870r;
                Serializable serializable = (Serializable) ((k3.d) this.f9872t).f14122r;
                String str = (String) jVar.f9873a.get(Integer.valueOf(this.f9871s));
                if (str != null) {
                    C1011d c1011d = (C1011d) jVar.f9877e.get(str);
                    if ((c1011d != null ? c1011d.f12460a : null) != null) {
                        InterfaceC1009b interfaceC1009b = c1011d.f12460a;
                        if (jVar.f9876d.remove(str)) {
                            interfaceC1009b.d(serializable);
                        }
                    } else {
                        jVar.f9878g.remove(str);
                        jVar.f.put(str, serializable);
                    }
                    break;
                }
                break;
            case 1:
                ((j) this.f9870r).a(this.f9871s, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f9872t));
                break;
            default:
                ((InterfaceC0692c) ((C0690a) this.f9870r).f9972c).k(this.f9871s, this.f9872t);
                break;
        }
    }
}
