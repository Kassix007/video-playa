package z4;

import E1.t;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.play.core.install.zza;
import java.util.HashSet;
import java.util.Iterator;
import y4.C1919c;

/* JADX INFO: renamed from: z4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1976j extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1919c f18753a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C1919c c1919c = this.f18753a;
        if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
            c1919c.f18626a.b("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
            return;
        }
        c1919c.f18626a.b("List of extras in received intent:", new Object[0]);
        for (String str : intent.getExtras().keySet()) {
            c1919c.f18626a.b("Key: %s; value: %s", str, intent.getExtras().get(str));
        }
        t tVar = c1919c.f18626a;
        tVar.b("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        tVar.b("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
        tVar.b("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
        zza zzaVar = new zza(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name"));
        c1919c.f18626a.b("ListenerRegistryBroadcastReceiver.onReceive: %s", zzaVar);
        synchronized (c1919c) {
            Iterator it = new HashSet(c1919c.f18629d).iterator();
            while (it.hasNext()) {
                Y4.d dVar = ((Y4.c) it.next()).f8272a;
                if (zzaVar.f11719a == 11) {
                    dVar.a();
                }
            }
        }
    }
}
