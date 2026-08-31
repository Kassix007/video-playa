package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f9708q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final LinkedHashMap f9709r = new LinkedHashMap();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s f9710s = new s(this);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r f9711t = new r(this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        kotlin.jvm.internal.m.e(intent, "intent");
        return this.f9711t;
    }
}
