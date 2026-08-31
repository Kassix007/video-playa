package v3;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseIntArray;
import androidx.work.WorkRequest;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import r.C1555f;
import x3.C1899k;
import x3.C1901m;
import x3.K;
import z3.C1966b;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Handler.Callback {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Status f17561o = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Status f17562p = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Object f17563q = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static e f17564r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f17565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1901m f17567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1966b f17568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f17569e;
    public final com.google.android.gms.common.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f17570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicInteger f17571h;
    public final AtomicInteger i;
    public final ConcurrentHashMap j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C1555f f17572k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C1555f f17573l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final I3.e f17574m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f17575n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(Context context, Looper looper) {
        com.google.android.gms.common.e eVar = com.google.android.gms.common.e.f10341d;
        this.f17565a = WorkRequest.MIN_BACKOFF_MILLIS;
        this.f17566b = false;
        this.f17571h = new AtomicInteger(1);
        this.i = new AtomicInteger(0);
        this.j = new ConcurrentHashMap(5, 0.75f, 1);
        this.f17572k = new C1555f(0);
        this.f17573l = new C1555f(0);
        this.f17575n = true;
        this.f17569e = context;
        I3.e eVar2 = new I3.e(looper, this);
        Looper.getMainLooper();
        this.f17574m = eVar2;
        this.f = eVar;
        this.f17570g = new l(6);
        PackageManager packageManager = context.getPackageManager();
        if (B3.b.f == null) {
            B3.b.f = Boolean.valueOf(B3.b.b() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (B3.b.f.booleanValue()) {
            this.f17575n = false;
        }
        eVar2.sendMessage(eVar2.obtainMessage(6));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Status c(C1763a c1763a, com.google.android.gms.common.b bVar) {
        return new Status(17, "API: " + ((String) c1763a.f17553b.f8313s) + " is not available on this device. Connection failed with: " + String.valueOf(bVar), bVar.f10324s, bVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static e e(Context context) {
        e eVar;
        HandlerThread handlerThread;
        synchronized (f17563q) {
            if (f17564r == null) {
                synchronized (K.f18408g) {
                    try {
                        handlerThread = K.i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            K.i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = K.i;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = com.google.android.gms.common.e.f10340c;
                f17564r = new e(applicationContext, looper);
            }
            eVar = f17564r;
        }
        return eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a() {
        if (this.f17566b) {
            return false;
        }
        C1899k.f().getClass();
        int i = ((SparseIntArray) this.f17570g.f17579r).get(203400000, -1);
        return i == -1 || i == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b(com.google.android.gms.common.b bVar, int i) {
        com.google.android.gms.common.e eVar = this.f;
        eVar.getClass();
        Context context = this.f17569e;
        if (!C3.a.F(context)) {
            int i7 = bVar.f10323r;
            PendingIntent pendingIntentB = bVar.f10324s;
            if (!((i7 == 0 || pendingIntentB == null) ? false : true)) {
                pendingIntentB = eVar.b(context, i7, 0, null);
            }
            if (pendingIntentB != null) {
                int i8 = GoogleApiActivity.f10305r;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntentB);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                eVar.g(context, i7, PendingIntent.getActivity(context, 0, intent, I3.d.f2415a | 134217728));
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final o d(u3.d dVar) {
        C1763a c1763a = dVar.f17200e;
        ConcurrentHashMap concurrentHashMap = this.j;
        o oVar = (o) concurrentHashMap.get(c1763a);
        if (oVar == null) {
            oVar = new o(this, dVar);
            concurrentHashMap.put(c1763a, oVar);
        }
        if (oVar.f17583d.k()) {
            this.f17573l.add(c1763a);
        }
        oVar.j();
        return oVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(com.google.android.gms.common.b bVar, int i) {
        if (b(bVar, i)) {
            return;
        }
        I3.e eVar = this.f17574m;
        eVar.sendMessage(eVar.obtainMessage(5, i, 0, bVar));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0326  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r13) {
        /*
            r12 = this;
            android.content.Context r0 = r12.f17569e
            r.f r1 = r12.f17573l
            java.lang.String r2 = "GoogleApiManager"
            I3.e r3 = r12.f17574m
            java.util.concurrent.ConcurrentHashMap r4 = r12.j
            int r5 = r13.what
            r6 = 300000(0x493e0, double:1.482197E-318)
            r8 = 17
            r9 = 0
            r10 = 0
            r11 = 1
            switch(r5) {
                case 1: goto L3fb;
                case 2: goto L3f4;
                case 3: goto L3d3;
                case 4: goto L39c;
                case 5: goto L32d;
                case 6: goto L2a0;
                case 7: goto L298;
                case 8: goto L39c;
                case 9: goto L279;
                case 10: goto L255;
                case 11: goto L1fa;
                case 12: goto L1b2;
                case 13: goto L39c;
                case 14: goto L1ab;
                case 15: goto L179;
                case 16: goto Lf4;
                case 17: goto Lcb;
                case 18: goto L2c;
                case 19: goto L29;
                default: goto L17;
            }
        L17:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "Unknown message id: "
            r13.<init>(r0)
            r13.append(r5)
            java.lang.String r13 = r13.toString()
            android.util.Log.w(r2, r13)
            return r9
        L29:
            r12.f17566b = r9
            return r11
        L2c:
            java.lang.Object r13 = r13.obj
            v3.v r13 = (v3.v) r13
            r13.getClass()
            r0 = 0
            int r13 = (r0 > r0 ? 1 : (r0 == r0 ? 0 : -1))
            if (r13 != 0) goto L5f
            x3.m r13 = new x3.m
            x3.j[] r0 = new x3.C1898j[]{r10}
            java.util.List r0 = java.util.Arrays.asList(r0)
            r13.<init>(r9, r0)
            z3.b r0 = r12.f17568d
            if (r0 != 0) goto L59
            android.content.Context r0 = r12.f17569e
            x3.n r1 = x3.n.f18500b
            z3.b r2 = new z3.b
            Z.m r3 = z3.C1966b.f18743k
            u3.c r4 = u3.c.f17193c
            r2.<init>(r0, r3, r1, r4)
            r12.f17568d = r2
        L59:
            z3.b r0 = r12.f17568d
            r0.b(r13)
            return r11
        L5f:
            x3.m r13 = r12.f17567c
            if (r13 == 0) goto Lb0
            java.util.List r2 = r13.f18499r
            int r13 = r13.f18498q
            if (r13 != 0) goto L85
            if (r2 == 0) goto L72
            int r13 = r2.size()
            if (r13 < 0) goto L72
            goto L85
        L72:
            x3.m r13 = r12.f17567c
            java.util.List r2 = r13.f18499r
            if (r2 != 0) goto L7f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r13.f18499r = r2
        L7f:
            java.util.List r13 = r13.f18499r
            r13.add(r10)
            goto Lb0
        L85:
            r3.removeMessages(r8)
            x3.m r13 = r12.f17567c
            if (r13 == 0) goto Lb0
            int r2 = r13.f18498q
            if (r2 > 0) goto L96
            boolean r2 = r12.a()
            if (r2 == 0) goto Lae
        L96:
            z3.b r2 = r12.f17568d
            if (r2 != 0) goto La9
            android.content.Context r2 = r12.f17569e
            x3.n r4 = x3.n.f18500b
            z3.b r5 = new z3.b
            Z.m r6 = z3.C1966b.f18743k
            u3.c r7 = u3.c.f17193c
            r5.<init>(r2, r6, r4, r7)
            r12.f17568d = r5
        La9:
            z3.b r2 = r12.f17568d
            r2.b(r13)
        Lae:
            r12.f17567c = r10
        Lb0:
            x3.m r13 = r12.f17567c
            if (r13 != 0) goto L42d
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r13.add(r10)
            x3.m r2 = new x3.m
            r2.<init>(r9, r13)
            r12.f17567c = r2
            android.os.Message r13 = r3.obtainMessage(r8)
            r3.sendMessageDelayed(r13, r0)
            return r11
        Lcb:
            x3.m r13 = r12.f17567c
            if (r13 == 0) goto L42d
            int r0 = r13.f18498q
            if (r0 > 0) goto Ld9
            boolean r0 = r12.a()
            if (r0 == 0) goto Lf1
        Ld9:
            z3.b r0 = r12.f17568d
            if (r0 != 0) goto Lec
            android.content.Context r0 = r12.f17569e
            x3.n r1 = x3.n.f18500b
            z3.b r2 = new z3.b
            Z.m r3 = z3.C1966b.f18743k
            u3.c r4 = u3.c.f17193c
            r2.<init>(r0, r3, r1, r4)
            r12.f17568d = r2
        Lec:
            z3.b r0 = r12.f17568d
            r0.b(r13)
        Lf1:
            r12.f17567c = r10
            return r11
        Lf4:
            java.lang.Object r13 = r13.obj
            v3.p r13 = (v3.p) r13
            v3.a r0 = r13.f17591a
            boolean r0 = r4.containsKey(r0)
            if (r0 == 0) goto L42d
            v3.a r0 = r13.f17591a
            java.lang.Object r0 = r4.get(r0)
            v3.o r0 = (v3.o) r0
            java.util.ArrayList r1 = r0.f17588l
            v3.e r2 = r0.f17590n
            java.util.LinkedList r3 = r0.f17582c
            boolean r1 = r1.remove(r13)
            if (r1 == 0) goto L42d
            I3.e r1 = r2.f17574m
            r4 = 15
            r1.removeMessages(r4, r13)
            I3.e r1 = r2.f17574m
            r2 = 16
            r1.removeMessages(r2, r13)
            com.google.android.gms.common.d r13 = r13.f17592b
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r3.size()
            r1.<init>(r2)
            java.util.Iterator r2 = r3.iterator()
        L131:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L15f
            java.lang.Object r4 = r2.next()
            v3.B r4 = (v3.B) r4
            boolean r5 = r4 instanceof v3.u
            if (r5 == 0) goto L131
            r5 = r4
            v3.u r5 = (v3.u) r5
            com.google.android.gms.common.d[] r5 = r5.g(r0)
            if (r5 == 0) goto L131
            int r6 = r5.length
            r7 = r9
        L14c:
            if (r7 >= r6) goto L131
            r8 = r5[r7]
            boolean r8 = x3.AbstractC1887A.j(r8, r13)
            if (r8 == 0) goto L15c
            if (r7 < 0) goto L131
            r1.add(r4)
            goto L131
        L15c:
            int r7 = r7 + 1
            goto L14c
        L15f:
            int r0 = r1.size()
        L163:
            if (r9 >= r0) goto L42d
            java.lang.Object r2 = r1.get(r9)
            v3.B r2 = (v3.B) r2
            r3.remove(r2)
            u3.i r4 = new u3.i
            r4.<init>(r13)
            r2.b(r4)
            int r9 = r9 + 1
            goto L163
        L179:
            java.lang.Object r13 = r13.obj
            v3.p r13 = (v3.p) r13
            v3.a r0 = r13.f17591a
            boolean r0 = r4.containsKey(r0)
            if (r0 == 0) goto L42d
            v3.a r0 = r13.f17591a
            java.lang.Object r0 = r4.get(r0)
            v3.o r0 = (v3.o) r0
            java.util.ArrayList r1 = r0.f17588l
            boolean r13 = r1.contains(r13)
            if (r13 != 0) goto L197
            goto L42d
        L197:
            boolean r13 = r0.f17587k
            if (r13 != 0) goto L42d
            u3.b r13 = r0.f17583d
            boolean r13 = r13.a()
            if (r13 != 0) goto L1a7
            r0.j()
            return r11
        L1a7:
            r0.d()
            return r11
        L1ab:
            java.lang.Object r13 = r13.obj
            java.lang.ClassCastException r13 = k1.i.g(r13)
            throw r13
        L1b2:
            java.lang.Object r0 = r13.obj
            boolean r0 = r4.containsKey(r0)
            if (r0 == 0) goto L42d
            java.lang.Object r13 = r13.obj
            java.lang.Object r13 = r4.get(r13)
            v3.o r13 = (v3.o) r13
            v3.e r0 = r13.f17590n
            I3.e r0 = r0.f17574m
            x3.AbstractC1887A.c(r0)
            u3.b r0 = r13.f17583d
            boolean r1 = r0.a()
            if (r1 == 0) goto L1f9
            java.util.HashMap r1 = r13.f17586h
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L1f9
            v3.l r1 = r13.f
            java.lang.Object r2 = r1.f17579r
            java.util.Map r2 = (java.util.Map) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L1f6
            java.lang.Object r1 = r1.f17580s
            java.util.Map r1 = (java.util.Map) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L1f0
            goto L1f6
        L1f0:
            java.lang.String r13 = "Timing out service connection."
            r0.d(r13)
            return r11
        L1f6:
            r13.g()
        L1f9:
            return r11
        L1fa:
            java.lang.Object r0 = r13.obj
            boolean r0 = r4.containsKey(r0)
            if (r0 == 0) goto L42d
            java.lang.Object r13 = r13.obj
            java.lang.Object r13 = r4.get(r13)
            v3.o r13 = (v3.o) r13
            v3.e r0 = r13.f17590n
            I3.e r1 = r0.f17574m
            x3.AbstractC1887A.c(r1)
            boolean r1 = r13.f17587k
            if (r1 == 0) goto L42d
            v3.a r2 = r13.f17584e
            v3.e r3 = r13.f17590n
            I3.e r3 = r3.f17574m
            if (r1 == 0) goto L229
            r1 = 11
            r3.removeMessages(r1, r2)
            r1 = 9
            r3.removeMessages(r1, r2)
            r13.f17587k = r9
        L229:
            com.google.android.gms.common.e r1 = r0.f
            android.content.Context r0 = r0.f17569e
            int r2 = com.google.android.gms.common.f.f10342a
            int r0 = r1.c(r0, r2)
            r1 = 18
            if (r0 != r1) goto L241
            java.lang.String r0 = "Connection timed out waiting for Google Play services update to complete."
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status
            r2 = 21
            r1.<init>(r2, r0, r10, r10)
            goto L24a
        L241:
            java.lang.String r0 = "API failed to connect while resuming due to an unknown error."
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status
            r2 = 22
            r1.<init>(r2, r0, r10, r10)
        L24a:
            r13.b(r1)
            u3.b r13 = r13.f17583d
            java.lang.String r0 = "Timing out connection while resuming."
            r13.d(r0)
            return r11
        L255:
            r1.getClass()
            r.a r13 = new r.a
            r13.<init>(r1)
        L25d:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L275
            java.lang.Object r0 = r13.next()
            v3.a r0 = (v3.C1763a) r0
            java.lang.Object r0 = r4.remove(r0)
            v3.o r0 = (v3.o) r0
            if (r0 == 0) goto L25d
            r0.n()
            goto L25d
        L275:
            r1.clear()
            return r11
        L279:
            java.lang.Object r0 = r13.obj
            boolean r0 = r4.containsKey(r0)
            if (r0 == 0) goto L42d
            java.lang.Object r13 = r13.obj
            java.lang.Object r13 = r4.get(r13)
            v3.o r13 = (v3.o) r13
            v3.e r0 = r13.f17590n
            I3.e r0 = r0.f17574m
            x3.AbstractC1887A.c(r0)
            boolean r0 = r13.f17587k
            if (r0 == 0) goto L42d
            r13.j()
            return r11
        L298:
            java.lang.Object r13 = r13.obj
            u3.d r13 = (u3.d) r13
            r12.d(r13)
            return r11
        L2a0:
            android.content.Context r13 = r0.getApplicationContext()
            boolean r13 = r13 instanceof android.app.Application
            if (r13 == 0) goto L42d
            android.content.Context r13 = r0.getApplicationContext()
            android.app.Application r13 = (android.app.Application) r13
            v3.ComponentCallbacks2C1765c.a(r13)
            v3.c r13 = v3.ComponentCallbacks2C1765c.f17556u
            v3.n r0 = new v3.n
            r0.<init>(r12)
            r13.getClass()
            monitor-enter(r13)
            java.util.ArrayList r1 = r13.f17559s     // Catch: java.lang.Throwable -> L32a
            r1.add(r0)     // Catch: java.lang.Throwable -> L32a
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L32a
            java.util.concurrent.atomic.AtomicBoolean r0 = r13.f17557q
            java.util.concurrent.atomic.AtomicBoolean r13 = r13.f17558r
            boolean r1 = r13.get()
            if (r1 != 0) goto L320
            java.lang.Boolean r1 = B3.b.i
            if (r1 != 0) goto L300
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L2df
            boolean r1 = B3.c.w()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L2fe
        L2df:
            java.lang.Class<android.os.Process> r1 = android.os.Process.class
            java.lang.String r2 = "isIsolated"
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r10)     // Catch: java.lang.ReflectiveOperationException -> L2fc
            java.lang.Object r1 = r1.invoke(r10, r10)     // Catch: java.lang.ReflectiveOperationException -> L2fc
            java.lang.Object[] r2 = new java.lang.Object[r9]     // Catch: java.lang.ReflectiveOperationException -> L2fc
            if (r1 == 0) goto L2f2
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.ReflectiveOperationException -> L2fc
            goto L2fe
        L2f2:
            C2.e r1 = new C2.e     // Catch: java.lang.ReflectiveOperationException -> L2fc
            java.lang.String r2 = a.AbstractC0597a.Y(r2)     // Catch: java.lang.ReflectiveOperationException -> L2fc
            r1.<init>(r2)     // Catch: java.lang.ReflectiveOperationException -> L2fc
            throw r1     // Catch: java.lang.ReflectiveOperationException -> L2fc
        L2fc:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
        L2fe:
            B3.b.i = r1
        L300:
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L31e
            android.app.ActivityManager$RunningAppProcessInfo r1 = new android.app.ActivityManager$RunningAppProcessInfo
            r1.<init>()
            android.app.ActivityManager.getMyMemoryState(r1)
            boolean r13 = r13.getAndSet(r11)
            if (r13 != 0) goto L320
            int r13 = r1.importance
            r1 = 100
            if (r13 <= r1) goto L320
            r0.set(r11)
            goto L320
        L31e:
            r13 = r11
            goto L324
        L320:
            boolean r13 = r0.get()
        L324:
            if (r13 != 0) goto L42d
            r12.f17565a = r6
            goto L42d
        L32a:
            r0 = move-exception
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L32a
            throw r0
        L32d:
            int r0 = r13.arg1
            java.lang.Object r13 = r13.obj
            com.google.android.gms.common.b r13 = (com.google.android.gms.common.b) r13
            java.util.Collection r1 = r4.values()
            java.util.Iterator r1 = r1.iterator()
        L33b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L34c
            java.lang.Object r3 = r1.next()
            v3.o r3 = (v3.o) r3
            int r4 = r3.i
            if (r4 != r0) goto L33b
            goto L34d
        L34c:
            r3 = r10
        L34d:
            if (r3 == 0) goto L38b
            int r0 = r13.f10323r
            r1 = 13
            if (r0 != r1) goto L381
            com.google.android.gms.common.e r1 = r12.f
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status
            r1.getClass()
            int r1 = com.google.android.gms.common.h.GOOGLE_PLAY_SERVICES_VERSION_CODE
            java.lang.String r0 = com.google.android.gms.common.b.W(r0)
            java.lang.String r13 = r13.f10325t
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Error resolution was canceled by the user, original error message: "
            r1.<init>(r4)
            r1.append(r0)
            java.lang.String r0 = ": "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r2.<init>(r8, r13, r10, r10)
            r3.b(r2)
            return r11
        L381:
            v3.a r0 = r3.f17584e
            com.google.android.gms.common.api.Status r13 = c(r0, r13)
            r3.b(r13)
            return r11
        L38b:
            java.lang.String r13 = "Could not find API instance "
            java.lang.String r1 = " while trying to fail enqueued calls."
            java.lang.String r13 = C0.S.m(r13, r1, r0)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            android.util.Log.wtf(r2, r13, r0)
            return r11
        L39c:
            java.lang.Object r13 = r13.obj
            v3.w r13 = (v3.w) r13
            u3.d r0 = r13.f17601c
            v3.B r1 = r13.f17599a
            v3.a r0 = r0.f17200e
            java.lang.Object r0 = r4.get(r0)
            v3.o r0 = (v3.o) r0
            if (r0 != 0) goto L3b4
            u3.d r0 = r13.f17601c
            v3.o r0 = r12.d(r0)
        L3b4:
            u3.b r2 = r0.f17583d
            boolean r2 = r2.k()
            if (r2 == 0) goto L3cf
            java.util.concurrent.atomic.AtomicInteger r2 = r12.i
            int r2 = r2.get()
            int r13 = r13.f17600b
            if (r2 == r13) goto L3cf
            com.google.android.gms.common.api.Status r13 = v3.e.f17561o
            r1.a(r13)
            r0.n()
            return r11
        L3cf:
            r0.k(r1)
            return r11
        L3d3:
            java.util.Collection r13 = r4.values()
            java.util.Iterator r13 = r13.iterator()
        L3db:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L42d
            java.lang.Object r0 = r13.next()
            v3.o r0 = (v3.o) r0
            v3.e r1 = r0.f17590n
            I3.e r1 = r1.f17574m
            x3.AbstractC1887A.c(r1)
            r0.f17589m = r10
            r0.j()
            goto L3db
        L3f4:
            java.lang.Object r13 = r13.obj
            java.lang.ClassCastException r13 = k1.i.g(r13)
            throw r13
        L3fb:
            java.lang.Object r13 = r13.obj
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r11 == r13) goto L406
            goto L408
        L406:
            r6 = 10000(0x2710, double:4.9407E-320)
        L408:
            r12.f17565a = r6
            r13 = 12
            r3.removeMessages(r13)
            java.util.Set r0 = r4.keySet()
            java.util.Iterator r0 = r0.iterator()
        L417:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L42d
            java.lang.Object r1 = r0.next()
            v3.a r1 = (v3.C1763a) r1
            android.os.Message r1 = r3.obtainMessage(r13, r1)
            long r4 = r12.f17565a
            r3.sendMessageDelayed(r1, r4)
            goto L417
        L42d:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.e.handleMessage(android.os.Message):boolean");
    }
}
