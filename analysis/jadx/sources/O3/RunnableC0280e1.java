package O3;

import android.app.Service;
import android.content.Intent;
import java.util.Map;

/* JADX INFO: renamed from: O3.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0280e1 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f4845q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4846r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f4847s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f4848t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Cloneable f4849u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: byte[] */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC0280e1(RunnableC0267a0 runnableC0267a0, int i, Exception exc, byte[] bArr, Map map) {
        this.f4847s = runnableC0267a0;
        this.f4846r = i;
        this.f4848t = exc;
        this.f4849u = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: android.app.Service */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4845q) {
            case 0:
                RunnableC0267a0 runnableC0267a0 = (RunnableC0267a0) this.f4847s;
                ((InterfaceC0277d1) runnableC0267a0.f4705v).b(this.f4846r, (Exception) this.f4848t, (byte[]) this.f4849u);
                break;
            default:
                k3.d dVar = (k3.d) this.f4847s;
                X x6 = (X) this.f4848t;
                Intent intent = (Intent) this.f4849u;
                Service service = (Service) dVar.f14122r;
                InterfaceC0342z1 interfaceC0342z1 = (InterfaceC0342z1) service;
                int i = this.f4846r;
                if (interfaceC0342z1.a(i)) {
                    x6.f4666E.c(Integer.valueOf(i), "Local AppMeasurementService processed last upload request. StartId");
                    X x7 = C0323t0.r(service, null, null).f5077v;
                    C0323t0.l(x7);
                    x7.f4666E.b("Completed wakeful intent.");
                    interfaceC0342z1.b(intent);
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ RunnableC0280e1(k3.d dVar, int i, X x6, Intent intent) {
        this.f4847s = dVar;
        this.f4846r = i;
        this.f4848t = x6;
        this.f4849u = intent;
    }
}
