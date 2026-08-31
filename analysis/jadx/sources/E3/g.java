package E3;

import O3.D;
import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;
import q6.C1535d;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Thread {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1711q = 1;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0003: CONSTRUCTOR (r2v0 java.lang.String) A[MD:(java.lang.String):void (c)] call: java.lang.Thread.<init>(java.lang.String):void type: SUPER */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ g(String str) {
        super(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        C1535d c1535dM;
        switch (this.f1711q) {
            case 0:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
                break;
        }
        while (true) {
            try {
                ReentrantLock reentrantLock2 = C1535d.f16055h;
                reentrantLock = C1535d.f16055h;
                reentrantLock.lock();
                try {
                    c1535dM = D.m();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused2) {
            }
            if (c1535dM == C1535d.f16057l) {
                C1535d.f16057l = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (c1535dM != null) {
                    c1535dM.j();
                }
            }
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0003: CONSTRUCTOR (r2v0 java.lang.ThreadGroup), (r3v0 java.lang.String) A[MD:(java.lang.ThreadGroup, java.lang.String):void (c)] call: java.lang.Thread.<init>(java.lang.ThreadGroup, java.lang.String):void type: SUPER */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ g(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
