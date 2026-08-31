package g5;

import U4.C0542i;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: g5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1091b extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1092c f13134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0542i f13135b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1091b(C1092c c1092c, C0542i c0542i) {
        this.f13134a = c1092c;
        this.f13135b = c0542i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context ctxt, Intent intent) {
        m.e(ctxt, "ctxt");
        m.e(intent, "intent");
        C1092c c1092c = this.f13134a;
        c1092c.f = intent;
        String str = c1092c.f13139d;
        if (str != null) {
            this.f13135b.invoke(str);
        }
    }
}
