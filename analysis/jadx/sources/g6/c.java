package g6;

import O3.D;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.jvm.internal.m;
import y4.AbstractC1918b;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f13181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f13184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f13185e;
    public boolean f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c(d dVar, String name) {
        m.e(name, "name");
        this.f13181a = dVar;
        this.f13182b = name;
        this.f13185e = new ArrayList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        byte[] bArr = e6.b.f12673a;
        synchronized (this.f13181a) {
            if (b()) {
                this.f13181a.d(this);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b() {
        a aVar = this.f13184d;
        if (aVar != null && aVar.f13177b) {
            this.f = true;
        }
        ArrayList arrayList = this.f13185e;
        boolean z5 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f13177b) {
                a aVar2 = (a) arrayList.get(size);
                D d5 = d.f13186h;
                if (d.j.isLoggable(Level.FINE)) {
                    AbstractC1918b.c(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z5 = true;
            }
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(a task, long j) {
        m.e(task, "task");
        synchronized (this.f13181a) {
            if (!this.f13183c) {
                if (d(task, j, false)) {
                    this.f13181a.d(this);
                }
            } else if (task.f13177b) {
                D d5 = d.f13186h;
                if (d.j.isLoggable(Level.FINE)) {
                    AbstractC1918b.c(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                D d7 = d.f13186h;
                if (d.j.isLoggable(Level.FINE)) {
                    AbstractC1918b.c(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(g6.a r11, long r12, boolean r14) {
        /*
            r10 = this;
            java.lang.String r0 = "task"
            kotlin.jvm.internal.m.e(r11, r0)
            g6.c r0 = r11.f13178c
            if (r0 != r10) goto La
            goto Le
        La:
            if (r0 != 0) goto L8d
            r11.f13178c = r10
        Le:
            long r0 = java.lang.System.nanoTime()
            long r2 = r0 + r12
            java.util.ArrayList r4 = r10.f13185e
            int r5 = r4.indexOf(r11)
            r6 = -1
            r7 = 0
            if (r5 == r6) goto L39
            long r8 = r11.f13179d
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 > 0) goto L36
            O3.D r12 = g6.d.f13186h
            java.util.logging.Logger r12 = g6.d.j
            java.util.logging.Level r13 = java.util.logging.Level.FINE
            boolean r12 = r12.isLoggable(r13)
            if (r12 == 0) goto L8c
            java.lang.String r12 = "already scheduled"
            y4.AbstractC1918b.c(r11, r10, r12)
            return r7
        L36:
            r4.remove(r5)
        L39:
            r11.f13179d = r2
            O3.D r5 = g6.d.f13186h
            java.util.logging.Logger r5 = g6.d.j
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            boolean r5 = r5.isLoggable(r8)
            if (r5 == 0) goto L63
            if (r14 == 0) goto L55
            long r2 = r2 - r0
            java.lang.String r14 = y4.AbstractC1918b.q(r2)
            java.lang.String r2 = "run again after "
            java.lang.String r14 = r2.concat(r14)
            goto L60
        L55:
            long r2 = r2 - r0
            java.lang.String r14 = y4.AbstractC1918b.q(r2)
            java.lang.String r2 = "scheduled after "
            java.lang.String r14 = r2.concat(r14)
        L60:
            y4.AbstractC1918b.c(r11, r10, r14)
        L63:
            int r14 = r4.size()
            r2 = r7
            r3 = r2
        L69:
            if (r3 >= r14) goto L7e
            java.lang.Object r5 = r4.get(r3)
            int r3 = r3 + 1
            g6.a r5 = (g6.a) r5
            long r8 = r5.f13179d
            long r8 = r8 - r0
            int r5 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r5 <= 0) goto L7b
            goto L7f
        L7b:
            int r2 = r2 + 1
            goto L69
        L7e:
            r2 = r6
        L7f:
            if (r2 != r6) goto L85
            int r2 = r4.size()
        L85:
            r4.add(r2, r11)
            if (r2 != 0) goto L8c
            r11 = 1
            return r11
        L8c:
            return r7
        L8d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "task is in multiple queues"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.c.d(g6.a, long, boolean):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e() {
        byte[] bArr = e6.b.f12673a;
        synchronized (this.f13181a) {
            this.f13183c = true;
            if (b()) {
                this.f13181a.d(this);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f13182b;
    }
}
