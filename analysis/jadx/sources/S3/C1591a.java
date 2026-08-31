package s3;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: s3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1591a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f16453c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static C1591a f16454d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f16455a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f16456b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1591a(Context context) {
        this.f16456b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String a(String str) {
        ReentrantLock reentrantLock = this.f16455a;
        reentrantLock.lock();
        try {
            return this.f16456b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
