package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class F implements Executor {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f9703q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f9704r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayDeque f9705s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Runnable f9706t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Executor f9707u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public F(Executor executor) {
        this.f9703q = 0;
        kotlin.jvm.internal.m.e(executor, "executor");
        this.f9707u = executor;
        this.f9705s = new ArrayDeque();
        this.f9704r = new Object();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        switch (this.f9703q) {
            case 0:
                synchronized (this.f9704r) {
                    Object objPoll = this.f9705s.poll();
                    Runnable runnable = (Runnable) objPoll;
                    this.f9706t = runnable;
                    if (objPoll != null) {
                        this.f9707u.execute(runnable);
                    }
                    break;
                }
                return;
            default:
                synchronized (this.f9704r) {
                    try {
                        Runnable runnable2 = (Runnable) this.f9705s.poll();
                        this.f9706t = runnable2;
                        if (runnable2 != null) {
                            ((S3.j) this.f9707u).execute(runnable2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        switch (this.f9703q) {
            case 0:
                kotlin.jvm.internal.m.e(command, "command");
                synchronized (this.f9704r) {
                    this.f9705s.offer(new N5.c(2, command, this));
                    if (this.f9706t == null) {
                        a();
                    }
                    break;
                }
                return;
            default:
                synchronized (this.f9704r) {
                    try {
                        this.f9705s.add(new N5.c(7, this, command));
                        if (this.f9706t == null) {
                            a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }

    public F(S3.j jVar) {
        this.f9703q = 1;
        this.f9704r = new Object();
        this.f9705s = new ArrayDeque();
        this.f9707u = jVar;
    }
}
