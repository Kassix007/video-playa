package u4;

import I2.l;
import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import x3.AbstractC1887A;
import x3.I;
import x3.J;
import x3.K;

/* JADX INFO: renamed from: u4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1702e implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17215b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1702e(int i, Object obj) {
        this.f17214a = i;
        this.f17215b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f17214a) {
            case 0:
                if (message.what != 0) {
                    return false;
                }
                l lVar = (l) this.f17215b;
                if (message.obj != null) {
                    throw new ClassCastException();
                }
                synchronized (lVar.f2365a) {
                    throw null;
                }
            default:
                int i = message.what;
                if (i != 0) {
                    if (i != 1) {
                        return false;
                    }
                    synchronized (((K) this.f17215b).f18410a) {
                        try {
                            I i7 = (I) message.obj;
                            J j = (J) ((K) this.f17215b).f18410a.get(i7);
                            if (j != null && j.f18402r == 3) {
                                Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(i7)), new Exception());
                                ComponentName componentName = j.f18406v;
                                if (componentName == null) {
                                    i7.getClass();
                                    componentName = null;
                                }
                                if (componentName == null) {
                                    String str = i7.f18399b;
                                    AbstractC1887A.g(str);
                                    componentName = new ComponentName(str, "unknown");
                                }
                                j.onServiceDisconnected(componentName);
                            }
                        } finally {
                        }
                        break;
                    }
                } else {
                    synchronized (((K) this.f17215b).f18410a) {
                        try {
                            I i8 = (I) message.obj;
                            J j7 = (J) ((K) this.f17215b).f18410a.get(i8);
                            if (j7 != null && j7.f18401q.isEmpty()) {
                                if (j7.f18403s) {
                                    j7.f18407w.f18412c.removeMessages(1, j7.f18405u);
                                    K k7 = j7.f18407w;
                                    k7.f18413d.b(k7.f18411b, j7);
                                    j7.f18403s = false;
                                    j7.f18402r = 2;
                                }
                                ((K) this.f17215b).f18410a.remove(i8);
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return true;
        }
    }
}
