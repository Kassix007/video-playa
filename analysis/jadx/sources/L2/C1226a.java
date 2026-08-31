package l2;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1226a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f14437d = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f14438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lock f14439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FileChannel f14440c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1226a(String str, File file) {
        Lock lock;
        this.f14438a = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap map = f14437d;
        synchronized (map) {
            try {
                Object reentrantLock = map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f14439b = lock;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(boolean z5) {
        this.f14439b.lock();
        if (z5) {
            File file = this.f14438a;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f14440c = channel;
            } catch (IOException e7) {
                this.f14440c = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e7);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        try {
            FileChannel fileChannel = this.f14440c;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f14439b.unlock();
    }
}
