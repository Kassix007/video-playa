package I4;

import B0.C0050o;
import B0.G0;
import M5.AbstractC0263y;
import M5.C0247h;
import O3.C0271b1;
import O3.C0295j1;
import O3.C0333w1;
import O3.ServiceConnectionC0291i0;
import R5.h;
import S3.c;
import S3.d;
import S3.k;
import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import androidx.concurrent.futures.j;
import com.google.android.gms.internal.measurement.B;
import com.google.android.gms.internal.measurement.L;
import com.google.android.material.behavior.SwipeDismissBehavior;
import i3.C1136a;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import k1.AbstractC1174b;
import k1.C1173a;
import kotlin.jvm.internal.m;
import m5.AbstractC1362a;
import m5.C1367f;
import q5.C1530i;
import w1.AbstractC1835K;
import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2416q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f2417r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f2418s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.f2416q = i;
        this.f2417r = obj;
        this.f2418s = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 0, expect 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private final void a() {
        int i = 0;
        while (true) {
            try {
                ((Runnable) this.f2417r).run();
            } catch (Throwable th) {
                AbstractC0263y.p(th, C1530i.f16022q);
            }
            Runnable runnableA0 = ((h) this.f2418s).a0();
            if (runnableA0 == null) {
                return;
            }
            try {
                this.f2417r = runnableA0;
                i++;
                if (i >= 16) {
                    h hVar = (h) this.f2418s;
                    if (R5.b.j(hVar.f7244r, hVar)) {
                        h hVar2 = (h) this.f2418s;
                        R5.b.i(hVar2.f7244r, hVar2, this);
                        return;
                    }
                }
            } catch (Throwable th2) {
                h hVar3 = (h) this.f2418s;
                synchronized (hVar3.f7248v) {
                    h.f7242w.decrementAndGet(hVar3);
                    throw th2;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void b() {
        synchronized (((S3.h) this.f2418s).f7313c) {
            S3.b bVar = (S3.b) ((S3.h) this.f2418s).f7314d;
            Exception excB = ((d) this.f2417r).b();
            AbstractC1887A.g(excB);
            bVar.q(excB);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void c() {
        synchronized (((S3.h) this.f2418s).f7313c) {
            ((c) ((S3.h) this.f2418s).f7314d).g(((d) this.f2417r).c());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void d() {
        k kVar = (k) this.f2417r;
        try {
            kVar.g(((Callable) this.f2418s).call());
        } catch (Exception e7) {
            kVar.f(e7);
        } catch (Throwable th) {
            kVar.f(new RuntimeException(th));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void e() {
        D1.d dVar = ((SwipeDismissBehavior) this.f2418s).f11356a;
        if (dVar == null || !dVar.f()) {
            return;
        }
        View view = (View) this.f2417r;
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        view.postOnAnimation(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void f() {
        C0247h c0247h = (C0247h) this.f2418s;
        b bVar = (b) this.f2417r;
        if (bVar.isCancelled()) {
            c0247h.g(null);
            return;
        }
        try {
            c0247h.resumeWith(j.getUninterruptibly(bVar));
        } catch (ExecutionException e7) {
            Throwable cause = e7.getCause();
            if (cause != null) {
                c0247h.resumeWith(AbstractC1362a.b(cause));
            } else {
                C1367f c1367f = new C1367f();
                m.i(c1367f, m.class.getName());
                throw c1367f;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void g() {
        ((C1173a) this.f2417r).f14048q = this.f2418s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void h() {
        ((Application) this.f2417r).unregisterActivityLifecycleCallbacks((C1173a) this.f2418s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void i() {
        Object obj = this.f2417r;
        try {
            Method method = AbstractC1174b.f14057d;
            Object obj2 = this.f2418s;
            if (method != null) {
                method.invoke(obj, obj2, Boolean.FALSE, "AppCompat recreation");
            } else {
                AbstractC1174b.f14058e.invoke(obj, obj2, Boolean.FALSE);
            }
        } catch (RuntimeException e7) {
            if (e7.getClass() == RuntimeException.class && e7.getMessage() != null && e7.getMessage().startsWith("Unable to stop")) {
                throw e7;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void j() {
        C1136a c1136a = (C1136a) this.f2417r;
        Typeface typeface = (Typeface) this.f2418s;
        m1.b bVar = (m1.b) c1136a.f13562r;
        if (bVar != null) {
            bVar.i(typeface);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v192, resolved type: android.app.Service */
    /* JADX WARN: Can't wrap try/catch for region: R(20:150|(1:152)(9:155|469|156|157|(1:160)(5:162|(1:164)|473|165|(23:167|(1:169)(1:171)|467|172|477|173|174|178|(2:180|(2:182|(2:184|(2:186|(2:188|(2:190|(1:192)(1:193))(1:194))(1:195))(1:196))(1:197))(1:198))(1:199)|200|483|201|(1:203)(1:204)|205|(1:207)|211|(1:213)(7:215|(0)(1:218)|(3:481|220|(1:222)(1:223))|(2:229|(1:231)(4:232|(3:235|(1:501)(1:502)|233)|500|238))(1:238)|(1:240)(1:241)|242|(31:244|(1:246)(1:247)|248|(1:250)|251|(1:253)(1:254)|255|(2:257|(4:262|(1:264)(2:265|(1:267)(1:268))|269|(1:271)(1:273))(1:(5:261|262|(0)(0)|269|(0)(0))(1:274)))(0)|272|275|(21:278|280|(1:282)|283|(1:299)(1:300)|301|(1:303)|304|(2:309|(2:315|(2:322|(2:323|(1:497)(2:325|(2:498|327)(1:499)))))(1:314))(1:308)|328|(3:332|(1:334)|335)|336|(1:338)(1:339)|340|(1:344)|345|(3:347|(7:349|(1:351)(1:352)|353|(1:355)|356|(4:360|(1:362)|363|(1:365))|366)(1:368)|367)(10:369|(2:371|(2:384|385)(3:374|(5:376|(1:378)(1:379)|380|(1:382)|383)(0)|385))(1:386)|387|(1:389)|390|479|391|392|396|(5:398|(1:400)(1:401)|(1:405)|(1:407)|408))|409|(3:411|(1:413)|(5:415|(1:417)|418|(1:420)|421))|422|423)(1:279)|284|(1:(1:295)(19:294|283|(0)(0)|301|(0)|304|(3:306|309|(3:312|315|(4:318|320|322|(3:323|(0)(0)|499)))(0))(0)|328|(4:330|332|(0)|335)(0)|336|(0)(0)|340|(2:342|344)|345|(0)(0)|409|(0)|422|423))(1:297)|296|(0)(0)|301|(0)|304|(0)(0)|328|(0)(0)|336|(0)(0)|340|(0)|345|(0)(0)|409|(0)|422|423)(2:424|425))|214|(0)|(0)(0)|(0)(0)|242|(0)(0)))|161|473|165|(0))|153|154|178|(0)(0)|200|483|201|(0)(0)|205|(0)|211|(0)(0)|214|(0)|(0)(0)|(0)(0)|242|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:155|469|156|157|(1:160)(5:162|(1:164)|473|165|(23:167|(1:169)(1:171)|467|172|477|173|174|178|(2:180|(2:182|(2:184|(2:186|(2:188|(2:190|(1:192)(1:193))(1:194))(1:195))(1:196))(1:197))(1:198))(1:199)|200|483|201|(1:203)(1:204)|205|(1:207)|211|(1:213)(7:215|(0)(1:218)|(3:481|220|(1:222)(1:223))|(2:229|(1:231)(4:232|(3:235|(1:501)(1:502)|233)|500|238))(1:238)|(1:240)(1:241)|242|(31:244|(1:246)(1:247)|248|(1:250)|251|(1:253)(1:254)|255|(2:257|(4:262|(1:264)(2:265|(1:267)(1:268))|269|(1:271)(1:273))(1:(5:261|262|(0)(0)|269|(0)(0))(1:274)))(0)|272|275|(21:278|280|(1:282)|283|(1:299)(1:300)|301|(1:303)|304|(2:309|(2:315|(2:322|(2:323|(1:497)(2:325|(2:498|327)(1:499)))))(1:314))(1:308)|328|(3:332|(1:334)|335)|336|(1:338)(1:339)|340|(1:344)|345|(3:347|(7:349|(1:351)(1:352)|353|(1:355)|356|(4:360|(1:362)|363|(1:365))|366)(1:368)|367)(10:369|(2:371|(2:384|385)(3:374|(5:376|(1:378)(1:379)|380|(1:382)|383)(0)|385))(1:386)|387|(1:389)|390|479|391|392|396|(5:398|(1:400)(1:401)|(1:405)|(1:407)|408))|409|(3:411|(1:413)|(5:415|(1:417)|418|(1:420)|421))|422|423)(1:279)|284|(1:(1:295)(19:294|283|(0)(0)|301|(0)|304|(3:306|309|(3:312|315|(4:318|320|322|(3:323|(0)(0)|499)))(0))(0)|328|(4:330|332|(0)|335)(0)|336|(0)(0)|340|(2:342|344)|345|(0)(0)|409|(0)|422|423))(1:297)|296|(0)(0)|301|(0)|304|(0)(0)|328|(0)(0)|336|(0)(0)|340|(0)|345|(0)(0)|409|(0)|422|423)(2:424|425))|214|(0)|(0)(0)|(0)(0)|242|(0)(0)))|161|473|165|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x04e5, code lost:
    
        r9 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x05a8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x05a9, code lost:
    
        O3.C0323t0.l(r10);
        r10.f4670w.d(O3.X.w(r2), r0, "Fetching Google App Id failed with exception. appId");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04c0 A[Catch: NameNotFoundException -> 0x04e5, TryCatch #4 {NameNotFoundException -> 0x04e5, blocks: (B:165:0x04b5, B:167:0x04c0, B:169:0x04cc), top: B:473:0x04b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0599 A[Catch: IllegalStateException -> 0x05a8, TRY_LEAVE, TryCatch #10 {IllegalStateException -> 0x05a8, blocks: (B:201:0x0587, B:205:0x0595, B:207:0x0599), top: B:483:0x0587 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x082c  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x08f7  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x08fd  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x091b  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0948  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x095a  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0967  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0980  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x09ee  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0a96  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0b08  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0b5c  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0bc5  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x05ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:485:0x02f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:497:0x08ef A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v82, types: [O3.a1] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r36 = this;
            r1 = r36
            int r0 = r1.f2416q
            switch(r0) {
                case 0: goto Lc9f;
                case 1: goto Lc84;
                case 2: goto Lc78;
                case 3: goto Lc4c;
                case 4: goto Lbe3;
                case 5: goto L33c;
                case 6: goto L303;
                case 7: goto L282;
                case 8: goto L275;
                case 9: goto L1da;
                case 10: goto L1b4;
                case 11: goto L161;
                case 12: goto L139;
                case 13: goto Lde;
                case 14: goto Ld0;
                case 15: goto L93;
                case 16: goto L6d;
                case 17: goto L54;
                case 18: goto L50;
                case 19: goto L35;
                case 20: goto L31;
                case 21: goto L2d;
                case 22: goto L29;
                case 23: goto L25;
                case 24: goto L21;
                case 25: goto L1d;
                case 26: goto L19;
                case 27: goto L15;
                case 28: goto L11;
                default: goto L7;
            }
        L7:
            java.lang.Object r0 = r1.f2417r
            s1.e r0 = (s1.e) r0
            java.lang.Object r2 = r1.f2418s
            r0.accept(r2)
            return
        L11:
            r1.j()
            return
        L15:
            r1.i()
            return
        L19:
            r1.h()
            return
        L1d:
            r1.g()
            return
        L21:
            r1.f()
            return
        L25:
            r1.e()
            return
        L29:
            r1.d()
            return
        L2d:
            r1.c()
            return
        L31:
            r1.b()
            return
        L35:
            java.lang.Object r0 = r1.f2418s
            S3.h r0 = (S3.h) r0
            java.lang.Object r2 = r0.f7313c
            monitor-enter(r2)
            java.lang.Object r0 = r1.f2418s     // Catch: java.lang.Throwable -> L4d
            S3.h r0 = (S3.h) r0     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r0 = r0.f7314d     // Catch: java.lang.Throwable -> L4d
            S3.a r0 = (S3.a) r0     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r3 = r1.f2417r     // Catch: java.lang.Throwable -> L4d
            S3.d r3 = (S3.d) r3     // Catch: java.lang.Throwable -> L4d
            r0.onComplete(r3)     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4d
            return
        L4d:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4d
            throw r0
        L50:
            r1.a()
            return
        L54:
            java.lang.Object r0 = r1.f2417r
            k3.d r0 = (k3.d) r0
            java.lang.Object r2 = r1.f2418s
            android.app.job.JobParameters r2 = (android.app.job.JobParameters) r2
            java.lang.String r3 = "FA"
            java.lang.String r4 = "[sgtm] AppMeasurementJobService processed last Scion upload request."
            android.util.Log.v(r3, r4)
            java.lang.Object r0 = r0.f14122r
            android.app.Service r0 = (android.app.Service) r0
            O3.z1 r0 = (O3.InterfaceC0342z1) r0
            r0.c(r2)
            return
        L6d:
            java.lang.Object r0 = r1.f2417r
            O3.T1 r0 = (O3.T1) r0
            r0.A()
            java.lang.Object r2 = r1.f2418s
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            O3.p0 r3 = r0.c()
            r3.o()
            java.util.ArrayList r3 = r0.f4586F
            if (r3 != 0) goto L8a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.f4586F = r3
        L8a:
            java.util.ArrayList r3 = r0.f4586F
            r3.add(r2)
            r0.q()
            return
        L93:
            java.lang.Object r0 = r1.f2418s
            O3.v1 r0 = (O3.ServiceConnectionC0330v1) r0
            O3.w1 r0 = r0.f5100s
            r2 = 0
            r0.f5109u = r2
            java.lang.Object r3 = r1.f2417r
            com.google.android.gms.common.b r3 = (com.google.android.gms.common.b) r3
            int r3 = r3.f10323r
            r4 = 7777(0x1e61, float:1.0898E-41)
            if (r3 != r4) goto Lcc
            java.util.concurrent.ScheduledExecutorService r3 = r0.f5112x
            if (r3 != 0) goto Lb1
            r3 = 1
            java.util.concurrent.ScheduledExecutorService r3 = java.util.concurrent.Executors.newScheduledThreadPool(r3)
            r0.f5112x = r3
        Lb1:
            java.util.concurrent.ScheduledExecutorService r0 = r0.f5112x
            A1.b r3 = new A1.b
            r4 = 8
            r3.<init>(r4, r1)
            O3.E r4 = O3.F.f4410Z
            java.lang.Object r2 = r4.a(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r3, r4, r2)
            goto Lcf
        Lcc:
            r0.D()
        Lcf:
            return
        Ld0:
            java.lang.Object r0 = r1.f2418s
            O3.v1 r0 = (O3.ServiceConnectionC0330v1) r0
            O3.w1 r0 = r0.f5100s
            java.lang.Object r2 = r1.f2417r
            android.content.ComponentName r2 = (android.content.ComponentName) r2
            r0.z(r2)
            return
        Lde:
            java.lang.Object r0 = r1.f2418s
            r2 = r0
            O3.w1 r2 = (O3.C0333w1) r2
            O3.I r3 = r2.f5109u
            java.lang.Object r0 = r2.f4346r
            O3.t0 r0 = (O3.C0323t0) r0
            if (r3 != 0) goto Lf8
            O3.X r0 = r0.f5077v
            O3.C0323t0.l(r0)
            O3.V r0 = r0.f4670w
            java.lang.String r2 = "Failed to send current screen to service"
            r0.b(r2)
            goto L138
        Lf8:
            java.lang.Object r4 = r1.f2417r     // Catch: android.os.RemoteException -> L10c
            O3.j1 r4 = (O3.C0295j1) r4     // Catch: android.os.RemoteException -> L10c
            if (r4 != 0) goto L10e
            android.content.Context r0 = r0.f5072q     // Catch: android.os.RemoteException -> L10c
            java.lang.String r8 = r0.getPackageName()     // Catch: android.os.RemoteException -> L10c
            r4 = 0
            r6 = 0
            r7 = 0
            r3.r(r4, r6, r7, r8)     // Catch: android.os.RemoteException -> L10c
            goto L124
        L10c:
            r0 = move-exception
            goto L128
        L10e:
            long r5 = r4.f4927c     // Catch: android.os.RemoteException -> L10c
            r7 = r5
            java.lang.String r6 = r4.f4925a     // Catch: android.os.RemoteException -> L10c
            java.lang.String r4 = r4.f4926b     // Catch: android.os.RemoteException -> L10c
            android.content.Context r0 = r0.f5072q     // Catch: android.os.RemoteException -> L10c
            java.lang.String r0 = r0.getPackageName()     // Catch: android.os.RemoteException -> L10c
            r34 = r7
            r7 = r4
            r4 = r34
            r8 = r0
            r3.r(r4, r6, r7, r8)     // Catch: android.os.RemoteException -> L10c
        L124:
            r2.B()     // Catch: android.os.RemoteException -> L10c
            goto L138
        L128:
            java.lang.Object r2 = r2.f4346r
            O3.t0 r2 = (O3.C0323t0) r2
            O3.X r2 = r2.f5077v
            O3.C0323t0.l(r2)
            O3.V r2 = r2.f4670w
            java.lang.String r3 = "Failed to send current screen to the service"
            r2.c(r0, r3)
        L138:
            return
        L139:
            java.lang.Object r0 = r1.f2417r
            O3.b1 r0 = (O3.C0271b1) r0
            java.lang.Object r0 = r0.f4346r
            O3.t0 r0 = (O3.C0323t0) r0
            O3.N r2 = r0.q()
            java.lang.Object r3 = r1.f2418s
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = r2.f4526H
            r5 = 0
            if (r4 == 0) goto L155
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L155
            r5 = 1
        L155:
            r2.f4526H = r3
            if (r5 == 0) goto L160
            O3.N r0 = r0.q()
            r0.t()
        L160:
            return
        L161:
            java.lang.Object r0 = r1.f2417r
            O3.b1 r0 = (O3.C0271b1) r0
            r0.o()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r2 >= r3) goto L16f
            goto L1b3
        L16f:
            java.lang.Object r2 = r1.f2418s
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r3 = r0.f4346r
            O3.t0 r3 = (O3.C0323t0) r3
            O3.h0 r3 = r3.f5076u
            O3.C0323t0.j(r3)
            android.util.SparseArray r3 = r3.u()
            java.util.Iterator r2 = r2.iterator()
        L184:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L1b0
            java.lang.Object r4 = r2.next()
            O3.I1 r4 = (O3.I1) r4
            int r5 = r4.f4495s
            boolean r6 = C0.D0.x(r3, r5)
            if (r6 == 0) goto L1a8
            java.lang.Object r5 = r3.get(r5)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r7 = r4.f4494r
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L184
        L1a8:
            java.util.PriorityQueue r5 = r0.L()
            r5.add(r4)
            goto L184
        L1b0:
            r0.M()
        L1b3:
            return
        L1b4:
            java.lang.Object r0 = r1.f2418s
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r0 = (com.google.android.gms.measurement.internal.AppMeasurementDynamiteService) r0
            O3.t0 r0 = r0.f11336c
            O3.b1 r0 = r0.f5054C
            O3.C0323t0.k(r0)
            java.lang.Object r2 = r1.f2417r
            B0.o r2 = (B0.C0050o) r2
            r0.o()
            r0.p()
            O3.L0 r3 = r0.f4762u
            if (r2 == r3) goto L1d7
            if (r3 != 0) goto L1d1
            r3 = 1
            goto L1d2
        L1d1:
            r3 = 0
        L1d2:
            java.lang.String r4 = "EventInterceptor already set."
            x3.AbstractC1887A.i(r3, r4)
        L1d7:
            r0.f4762u = r2
            return
        L1da:
            java.lang.Object r0 = r1.f2418s
            O3.b1 r0 = (O3.C0271b1) r0
            java.lang.Object r2 = r0.f4346r
            O3.t0 r2 = (O3.C0323t0) r2
            O3.h0 r3 = r2.f5076u
            O3.X r2 = r2.f5077v
            O3.C0323t0.j(r3)
            r3.o()
            r3.o()
            android.content.SharedPreferences r4 = r3.s()
            java.lang.String r5 = "dma_consent_settings"
            r6 = 0
            java.lang.String r4 = r4.getString(r5, r6)
            O3.p r4 = O3.C0311p.b(r4)
            java.lang.Object r6 = r1.f2417r
            O3.p r6 = (O3.C0311p) r6
            int r7 = r6.f5005a
            int r4 = r4.f5005a
            boolean r4 = O3.J0.l(r7, r4)
            if (r4 == 0) goto L266
            android.content.SharedPreferences r3 = r3.s()
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.lang.String r4 = r6.f5006b
            r3.putString(r5, r4)
            r3.apply()
            O3.C0323t0.l(r2)
            O3.V r2 = r2.f4666E
            java.lang.String r3 = "Setting DMA consent(FE)"
            r2.c(r6, r3)
            java.lang.Object r0 = r0.f4346r
            O3.t0 r0 = (O3.C0323t0) r0
            O3.w1 r2 = r0.o()
            boolean r2 = r2.y()
            if (r2 == 0) goto L248
            O3.w1 r0 = r0.o()
            r0.o()
            r0.p()
            O3.u1 r2 = new O3.u1
            r3 = 1
            r2.<init>(r0, r3)
            r0.C(r2)
            goto L274
        L248:
            O3.w1 r0 = r0.o()
            r0.o()
            r0.p()
            boolean r2 = r0.x()
            if (r2 == 0) goto L274
            r2 = 0
            O3.a2 r2 = r0.E(r2)
            O3.r1 r3 = new O3.r1
            r3.<init>(r0, r2)
            r0.C(r3)
            goto L274
        L266:
            O3.C0323t0.l(r2)
            O3.V r0 = r2.f4664C
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            java.lang.String r3 = "Lower precedence consent source ignored, proposed source"
            r0.c(r2, r3)
        L274:
            return
        L275:
            java.lang.Object r0 = r1.f2418s
            O3.b1 r0 = (O3.C0271b1) r0
            java.lang.Object r2 = r1.f2417r
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r3 = 1
            r0.E(r2, r3)
            return
        L282:
            java.lang.Object r0 = r1.f2417r
            com.google.android.gms.internal.measurement.L r0 = (com.google.android.gms.internal.measurement.L) r0
            java.lang.Object r2 = r1.f2418s
            O3.b1 r2 = (O3.C0271b1) r2
            java.lang.Object r3 = r2.f4346r
            O3.t0 r3 = (O3.C0323t0) r3
            java.lang.Object r2 = r2.f4346r
            O3.t0 r2 = (O3.C0323t0) r2
            O3.E1 r3 = r3.f5079x
            O3.C0323t0.k(r3)
            java.lang.Object r3 = r3.f4346r
            O3.t0 r3 = (O3.C0323t0) r3
            O3.h0 r4 = r3.f5076u
            O3.C0323t0.j(r4)
            O3.J0 r5 = r4.v()
            O3.I0 r6 = O3.I0.ANALYTICS_STORAGE
            boolean r5 = r5.i(r6)
            r6 = 0
            if (r5 != 0) goto L2bb
            O3.X r3 = r3.f5077v
            O3.C0323t0.l(r3)
            O3.V r3 = r3.f4663B
            java.lang.String r4 = "Analytics storage consent denied; will not get session id"
            r3.b(r4)
        L2b9:
            r3 = r6
            goto L2e2
        L2bb:
            O3.C0323t0.j(r4)
            O3.f0 r5 = r4.f4884H
            B3.a r3 = r3.f5052A
            r3.getClass()
            long r7 = java.lang.System.currentTimeMillis()
            boolean r3 = r4.y(r7)
            if (r3 != 0) goto L2b9
            long r3 = r5.a()
            r7 = 0
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 != 0) goto L2da
            goto L2b9
        L2da:
            long r3 = r5.a()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L2e2:
            if (r3 == 0) goto L2f1
            O3.Y1 r2 = r2.f5080y
            O3.C0323t0.j(r2)
            long r3 = r3.longValue()
            r2.X(r0, r3)
            goto L302
        L2f1:
            r0.a(r6)     // Catch: android.os.RemoteException -> L2f5
            goto L302
        L2f5:
            r0 = move-exception
            O3.X r2 = r2.f5077v
            O3.C0323t0.l(r2)
            O3.V r2 = r2.f4670w
            java.lang.String r3 = "getSessionId failed with exception"
            r2.c(r0, r3)
        L302:
            return
        L303:
            java.lang.Object r0 = r1.f2418s
            O3.C0 r0 = (O3.C0) r0
            O3.T1 r0 = r0.f4330c
            r0.A()
            java.lang.Object r2 = r1.f2417r
            O3.e r2 = (O3.C0278e) r2
            O3.V1 r3 = r2.f4832s
            java.lang.Object r3 = r3.W()
            if (r3 != 0) goto L32a
            r0.getClass()
            java.lang.String r3 = r2.f4830q
            x3.AbstractC1887A.g(r3)
            O3.a2 r3 = r0.O(r3)
            if (r3 == 0) goto L33b
            r0.Y(r2, r3)
            goto L33b
        L32a:
            r0.getClass()
            java.lang.String r3 = r2.f4830q
            x3.AbstractC1887A.g(r3)
            O3.a2 r3 = r0.O(r3)
            if (r3 == 0) goto L33b
            r0.X(r2, r3)
        L33b:
            return
        L33c:
            java.lang.String r2 = "measurement_enabled"
            O3.G0 r3 = O3.G0.UNINITIALIZED
            java.lang.String r4 = "Can't initialize twice"
            java.lang.Object r0 = r1.f2418s
            r6 = r0
            O3.t0 r6 = (O3.C0323t0) r6
            java.lang.Object r0 = r1.f2417r
            r11 = r0
            O3.N0 r11 = (O3.N0) r11
            O3.p0 r0 = r6.f5078w
            O3.X r12 = r6.f5077v
            O3.h0 r13 = r6.f5076u
            O3.Y1 r14 = r6.f5080y
            O3.C0323t0.l(r0)
            r0.o()
            O3.g r15 = r6.f5075t
            java.lang.Object r0 = r15.f4346r
            O3.t0 r0 = (O3.C0323t0) r0
            r0.getClass()
            O3.q r0 = new O3.q
            r0.<init>(r6)
            r0.r()
            r6.f5060I = r0
            com.google.android.gms.internal.measurement.V r0 = r11.f4537d
            r16 = 0
            if (r0 != 0) goto L376
            r9 = r16
            goto L379
        L376:
            long r7 = r0.f10721q
            r9 = r7
        L379:
            O3.N r5 = new O3.N
            long r7 = r11.f4536c
            r5.<init>(r6, r7, r9)
            r5.q()
            r6.f5061J = r5
            O3.P r0 = new O3.P
            r0.<init>(r6)
            r0.q()
            r6.f5058G = r0
            O3.w1 r0 = new O3.w1
            r0.<init>(r6)
            r0.q()
            r6.f5059H = r0
            boolean r0 = r14.f4356s
            java.lang.Object r7 = r14.f4346r
            O3.t0 r7 = (O3.C0323t0) r7
            if (r0 != 0) goto Lbdc
            r14.o()
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            long r8 = r0.nextLong()
            r18 = 0
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 != 0) goto L3cb
            long r8 = r0.nextLong()
            int r0 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r0 != 0) goto L3cb
            java.lang.Object r0 = r14.f4346r
            O3.t0 r0 = (O3.C0323t0) r0
            O3.X r0 = r0.f5077v
            O3.C0323t0.l(r0)
            O3.V r0 = r0.f4673z
            java.lang.String r10 = "Utils falling back to Random for random id"
            r0.b(r10)
        L3cb:
            java.util.concurrent.atomic.AtomicLong r0 = r14.f4688u
            r0.set(r8)
            java.util.concurrent.atomic.AtomicInteger r0 = r7.f5070S
            r0.incrementAndGet()
            r8 = 1
            r14.f4356s = r8
            boolean r0 = r13.f4356s
            if (r0 != 0) goto Lbd5
            java.lang.Object r0 = r13.f4346r
            O3.t0 r0 = (O3.C0323t0) r0
            android.content.Context r0 = r0.f5072q
            java.lang.String r9 = "com.google.android.gms.measurement.prefs"
            r10 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r9, r10)
            r13.f4893t = r0
            java.lang.String r9 = "has_been_opened"
            boolean r0 = r0.getBoolean(r9, r10)
            r13.f4885I = r0
            if (r0 != 0) goto L402
            android.content.SharedPreferences r0 = r13.f4893t
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r10 = 1
            r0.putBoolean(r9, r10)
            r0.apply()
        L402:
            O3.g0 r0 = new O3.g0
            O3.E r9 = O3.F.f4421d
            r10 = 0
            java.lang.Object r9 = r9.a(r10)
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            r18 = r4
            r19 = r5
            r4 = 0
            long r4 = java.lang.Math.max(r4, r9)
            r0.<init>(r13, r4)
            r13.f4895v = r0
            java.lang.Object r0 = r13.f4346r
            O3.t0 r0 = (O3.C0323t0) r0
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f5070S
            r0.incrementAndGet()
            r13.f4356s = r8
            O3.N r4 = r6.f5061J
            boolean r0 = r4.f4481s
            if (r0 != 0) goto Lbcd
            java.lang.String r0 = ""
            java.lang.Object r5 = r4.f4346r
            O3.t0 r5 = (O3.C0323t0) r5
            O3.X r9 = r5.f5077v
            O3.X r10 = r5.f5077v
            O3.C0323t0.l(r9)
            O3.V r9 = r9.f4666E
            r20 = r9
            long r8 = r4.f4519A
            r21 = r8
            java.lang.String r8 = "sdkVersion bundled with app, dynamiteVersion"
            java.lang.Long r9 = java.lang.Long.valueOf(r21)
            r21 = r2
            long r1 = r4.f4533z
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = r20
            r2.d(r9, r1, r8)
            android.content.Context r1 = r5.f5072q
            java.lang.String r2 = r1.getPackageName()
            android.content.pm.PackageManager r8 = r1.getPackageManager()
            java.lang.String r9 = "Unknown"
            java.lang.String r20 = "unknown"
            r22 = r9
            r23 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 != 0) goto L48a
            O3.C0323t0.l(r10)
            O3.V r9 = r10.f4670w
            r25 = r3
            O3.W r3 = O3.X.w(r2)
            r26 = r13
            java.lang.String r13 = "PackageManager is null, app identity information might be inaccurate. appId"
            r9.c(r3, r13)
        L47f:
            r27 = r8
            r8 = r20
            r3 = r22
            r9 = r3
        L486:
            r13 = r23
            goto L4fd
        L48a:
            r25 = r3
            r26 = r13
            java.lang.String r20 = r8.getInstallerPackageName(r2)     // Catch: java.lang.IllegalArgumentException -> L495
        L492:
            r3 = r20
            goto L4a4
        L495:
            O3.C0323t0.l(r10)
            O3.V r3 = r10.f4670w
            O3.W r9 = O3.X.w(r2)
            java.lang.String r13 = "Error retrieving app installer package name. appId"
            r3.c(r9, r13)
            goto L492
        L4a4:
            if (r3 != 0) goto L4ab
            java.lang.String r3 = "manual_install"
        L4a8:
            r20 = r3
            goto L4b5
        L4ab:
            java.lang.String r9 = "com.android.vending"
            boolean r9 = r9.equals(r3)
            if (r9 == 0) goto L4a8
            r20 = r0
        L4b5:
            java.lang.String r3 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e5
            r9 = 0
            android.content.pm.PackageInfo r3 = r8.getPackageInfo(r3, r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e5
            if (r3 == 0) goto L47f
            android.content.pm.ApplicationInfo r9 = r3.applicationInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e5
            java.lang.CharSequence r9 = r8.getApplicationLabel(r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e5
            boolean r13 = android.text.TextUtils.isEmpty(r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e5
            if (r13 != 0) goto L4d1
            java.lang.String r9 = r9.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e5
            goto L4d3
        L4d1:
            r9 = r22
        L4d3:
            java.lang.String r13 = r3.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e7
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e2
            r27 = r13
            r13 = r3
            r3 = r9
            r9 = r27
            r27 = r8
            r8 = r20
            goto L4fd
        L4e2:
            r22 = r13
            goto L4e7
        L4e5:
            r9 = r22
        L4e7:
            O3.C0323t0.l(r10)
            O3.V r3 = r10.f4670w
            O3.W r13 = O3.X.w(r2)
            r27 = r8
            java.lang.String r8 = "Error retrieving package info. appId, appName"
            r3.d(r13, r9, r8)
            r3 = r9
            r8 = r20
            r9 = r22
            goto L486
        L4fd:
            r4.f4527t = r2
            r4.f4530w = r8
            r4.f4528u = r9
            r4.f4529v = r13
            r4.f4531x = r3
            r8 = 0
            r4.f4532y = r8
            int r3 = r5.f()
            if (r3 == 0) goto L57b
            r8 = 1
            if (r3 == r8) goto L570
            r8 = 3
            if (r3 == r8) goto L565
            r8 = 4
            if (r3 == r8) goto L55a
            r8 = 6
            if (r3 == r8) goto L54f
            r8 = 7
            if (r3 == r8) goto L544
            r8 = 8
            if (r3 == r8) goto L539
            O3.C0323t0.l(r10)
            O3.V r8 = r10.f4664C
            java.lang.String r9 = "App measurement disabled"
            r8.b(r9)
            O3.C0323t0.l(r10)
            O3.V r8 = r10.f4671x
            java.lang.String r9 = "Invalid scion state in identity"
            r8.b(r9)
            goto L585
        L539:
            O3.C0323t0.l(r10)
            O3.V r8 = r10.f4664C
            java.lang.String r9 = "App measurement disabled due to denied storage consent"
            r8.b(r9)
            goto L585
        L544:
            O3.C0323t0.l(r10)
            O3.V r8 = r10.f4664C
            java.lang.String r9 = "App measurement disabled via the global data collection setting"
            r8.b(r9)
            goto L585
        L54f:
            O3.C0323t0.l(r10)
            O3.V r8 = r10.f4663B
            java.lang.String r9 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            r8.b(r9)
            goto L585
        L55a:
            O3.C0323t0.l(r10)
            O3.V r8 = r10.f4664C
            java.lang.String r9 = "App measurement disabled via the manifest"
            r8.b(r9)
            goto L585
        L565:
            O3.C0323t0.l(r10)
            O3.V r8 = r10.f4664C
            java.lang.String r9 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            r8.b(r9)
            goto L585
        L570:
            O3.C0323t0.l(r10)
            O3.V r8 = r10.f4664C
            java.lang.String r9 = "App measurement deactivated via the manifest"
            r8.b(r9)
            goto L585
        L57b:
            O3.C0323t0.l(r10)
            O3.V r8 = r10.f4666E
            java.lang.String r9 = "App measurement collection enabled"
            r8.b(r9)
        L585:
            r4.f4523E = r0
            java.lang.String r8 = r5.f5057F     // Catch: java.lang.IllegalStateException -> L5a8
            java.lang.String r8 = O3.K0.b(r1, r8)     // Catch: java.lang.IllegalStateException -> L5a8
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.IllegalStateException -> L5a8
            if (r9 == 0) goto L594
            goto L595
        L594:
            r0 = r8
        L595:
            r4.f4523E = r0     // Catch: java.lang.IllegalStateException -> L5a8
            if (r3 != 0) goto L5b7
            O3.C0323t0.l(r10)     // Catch: java.lang.IllegalStateException -> L5a8
            O3.V r0 = r10.f4666E     // Catch: java.lang.IllegalStateException -> L5a8
            java.lang.String r3 = "App measurement enabled for app package, google app id"
            java.lang.String r8 = r4.f4527t     // Catch: java.lang.IllegalStateException -> L5a8
            java.lang.String r9 = r4.f4523E     // Catch: java.lang.IllegalStateException -> L5a8
            r0.d(r8, r9, r3)     // Catch: java.lang.IllegalStateException -> L5a8
            goto L5b7
        L5a8:
            r0 = move-exception
            O3.C0323t0.l(r10)
            O3.V r3 = r10.f4670w
            O3.W r2 = O3.X.w(r2)
            java.lang.String r8 = "Fetching Google App Id failed with exception. appId"
            r3.d(r2, r0, r8)
        L5b7:
            r2 = 0
            r4.f4520B = r2
            O3.g r0 = r5.f5075t
            java.lang.Object r3 = r0.f4346r
            O3.t0 r3 = (O3.C0323t0) r3
            java.lang.String r8 = "analytics.safelisted_events"
            x3.AbstractC1887A.d(r8)
            android.os.Bundle r0 = r0.z()
            if (r0 != 0) goto L5d9
            O3.X r0 = r3.f5077v
            O3.C0323t0.l(r0)
            O3.V r0 = r0.f4670w
            java.lang.String r8 = "Failed to load metadata: Metadata bundle is null"
            r0.b(r8)
        L5d7:
            r0 = r2
            goto L5e8
        L5d9:
            boolean r9 = r0.containsKey(r8)
            if (r9 != 0) goto L5e0
            goto L5d7
        L5e0:
            int r0 = r0.getInt(r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L5e8:
            if (r0 == 0) goto L60d
            android.content.Context r8 = r3.f5072q     // Catch: android.content.res.Resources.NotFoundException -> L600
            android.content.res.Resources r8 = r8.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L600
            int r0 = r0.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L600
            java.lang.String[] r0 = r8.getStringArray(r0)     // Catch: android.content.res.Resources.NotFoundException -> L600
            if (r0 != 0) goto L5fb
            goto L60d
        L5fb:
            java.util.List r2 = java.util.Arrays.asList(r0)     // Catch: android.content.res.Resources.NotFoundException -> L600
            goto L60d
        L600:
            r0 = move-exception
            O3.X r3 = r3.f5077v
            O3.C0323t0.l(r3)
            O3.V r3 = r3.f4670w
            java.lang.String r8 = "Failed to load string array from metadata: resource not found"
            r3.c(r0, r8)
        L60d:
            if (r2 != 0) goto L610
            goto L63f
        L610:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L621
            O3.C0323t0.l(r10)
            O3.V r0 = r10.f4663B
            java.lang.String r2 = "Safelisted event list is empty. Ignoring"
            r0.b(r2)
            goto L641
        L621:
            java.util.Iterator r0 = r2.iterator()
        L625:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L63f
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            O3.Y1 r8 = r5.f5080y
            O3.C0323t0.j(r8)
            java.lang.String r9 = "safelisted event"
            boolean r3 = r8.p0(r9, r3)
            if (r3 != 0) goto L625
            goto L641
        L63f:
            r4.f4520B = r2
        L641:
            if (r27 == 0) goto L64a
            boolean r0 = C3.a.F(r1)
            r4.f4522D = r0
            goto L64d
        L64a:
            r9 = 0
            r4.f4522D = r9
        L64d:
            java.lang.Object r0 = r4.f4346r
            O3.t0 r0 = (O3.C0323t0) r0
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f5070S
            r0.incrementAndGet()
            r1 = 1
            r4.f4481s = r1
            O3.g1 r0 = new O3.g1
            r0.<init>(r6)
            r0.q()
            r6.f5062K = r0
            boolean r1 = r0.f4481s
            if (r1 != 0) goto Lbc5
            java.lang.Object r1 = r0.f4346r
            O3.t0 r1 = (O3.C0323t0) r1
            android.content.Context r1 = r1.f5072q
            java.lang.String r2 = "jobscheduler"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.app.job.JobScheduler r1 = (android.app.job.JobScheduler) r1
            r0.f4864t = r1
            java.lang.Object r1 = r0.f4346r
            O3.t0 r1 = (O3.C0323t0) r1
            java.util.concurrent.atomic.AtomicInteger r1 = r1.f5070S
            r1.incrementAndGet()
            r1 = 1
            r0.f4481s = r1
            O3.C0323t0.l(r12)
            O3.V r0 = r12.f4665D
            O3.V r1 = r12.f4664C
            O3.V r2 = r12.f4666E
            O3.V r3 = r12.f4670w
            r15.t()
            java.lang.String r4 = "App measurement initialized, version"
            r8 = 130000(0x1fbd0, double:6.42285E-319)
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            r1.c(r5, r4)
            O3.C0323t0.l(r12)
            java.lang.String r4 = "To enable debug logging run: adb shell setprop log.tag.FA VERBOSE"
            r1.b(r4)
            java.lang.String r4 = r19.u()
            java.lang.String r5 = r15.f4856t
            boolean r5 = r14.O(r4, r5)
            if (r5 == 0) goto L6ba
            O3.C0323t0.l(r12)
            java.lang.String r4 = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none."
            r1.b(r4)
            goto L6ca
        L6ba:
            O3.C0323t0.l(r12)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "
            java.lang.String r4 = r5.concat(r4)
            r1.b(r4)
        L6ca:
            O3.C0323t0.l(r12)
            java.lang.String r4 = "Debug-level message logging enabled"
            r0.b(r4)
            int r4 = r6.f5068Q
            java.util.concurrent.atomic.AtomicInteger r5 = r6.f5070S
            int r8 = r5.get()
            if (r4 == r8) goto L6f2
            O3.C0323t0.l(r12)
            int r4 = r6.f5068Q
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r5 = r5.get()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r8 = "Not all components initialized"
            r3.d(r4, r5, r8)
        L6f2:
            r4 = 1
            r6.f5063L = r4
            com.google.android.gms.internal.measurement.V r4 = r11.f4537d
            java.lang.String r5 = "gmp_app_id"
            long r8 = r6.f5071T
            O3.I0 r10 = O3.I0.ANALYTICS_STORAGE
            java.lang.Class<O3.I0> r11 = O3.I0.class
            O3.b1 r13 = r6.f5054C
            r19 = r12
            O3.p0 r12 = r6.f5078w
            O3.C0323t0.l(r12)
            r12.o()
            O3.g1 r12 = r6.f5062K
            O3.C0323t0.i(r12)
            O3.g1 r12 = r6.f5062K
            int r12 = r12.t()
            com.google.android.gms.internal.measurement.Y3.a()
            r18 = r1
            O3.E r1 = O3.F.f4394Q0
            r20 = r5
            r5 = 0
            boolean r1 = r15.y(r5, r1)
            r5 = 2
            if (r12 != r5) goto L729
            r5 = 1
            goto L72a
        L729:
            r5 = 0
        L72a:
            r27 = 1
            if (r1 == 0) goto L73a
            r14.o()
            long r29 = r14.J()
            int r1 = (r29 > r27 ? 1 : (r29 == r27 ? 0 : -1))
            if (r1 != 0) goto L73a
            goto L73d
        L73a:
            if (r5 == 0) goto L79d
            r5 = 1
        L73d:
            r14.o()
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>()
            java.lang.String r12 = "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"
            r1.addAction(r12)
            java.lang.String r12 = "com.google.android.gms.measurement.BATCHES_AVAILABLE"
            r1.addAction(r12)
            O3.b2 r12 = new O3.b2
            r12.<init>(r7)
            r24 = r5
            android.content.Context r5 = r7.f5072q
            r29 = r3
            int r3 = android.os.Build.VERSION.SDK_INT
            r30 = r14
            r14 = 33
            if (r3 < r14) goto L766
            E0.d.f(r5, r12, r1)
            goto L772
        L766:
            r14 = 26
            if (r3 < r14) goto L76e
            E0.d.e(r5, r12, r1)
            goto L772
        L76e:
            r3 = 0
            r5.registerReceiver(r12, r1, r3, r3)
        L772:
            O3.X r1 = r7.f5077v
            O3.C0323t0.l(r1)
            O3.V r1 = r1.f4665D
            java.lang.String r3 = "Registered app receiver"
            r1.b(r3)
            if (r24 == 0) goto L79b
            O3.g1 r1 = r6.f5062K
            O3.C0323t0.i(r1)
            O3.g1 r1 = r6.f5062K
            O3.E r3 = O3.F.f4366C
            r5 = 0
            java.lang.Object r3 = r3.a(r5)
            java.lang.Long r3 = (java.lang.Long) r3
            r12 = r6
            long r5 = r3.longValue()
            r1.s(r5)
        L798:
            r1 = r26
            goto L7a3
        L79b:
            r12 = r6
            goto L798
        L79d:
            r29 = r3
            r12 = r6
            r30 = r14
            goto L798
        L7a3:
            K2.a r3 = r1.f4897x
            O3.J0 r5 = r1.v()
            int r6 = r5.f4498b
            java.lang.String r14 = "google_analytics_default_allow_ad_storage"
            r24 = r5
            r5 = 0
            O3.G0 r14 = r15.D(r14, r5)
            r26 = r12
            java.lang.String r12 = "google_analytics_default_allow_analytics_storage"
            O3.G0 r12 = r15.D(r12, r5)
            r5 = r25
            if (r14 != r5) goto L7c2
            if (r12 == r5) goto L7c5
        L7c2:
            r25 = r7
            goto L7cc
        L7c5:
            r31 = r3
            r25 = r7
            r32 = r8
            goto L7f9
        L7cc:
            android.content.SharedPreferences r7 = r1.s()
            r31 = r3
            java.lang.String r3 = "consent_source"
            r32 = r8
            r8 = 100
            int r3 = r7.getInt(r3, r8)
            r7 = -10
            boolean r3 = O3.J0.l(r7, r3)
            if (r3 == 0) goto L7f9
            java.util.EnumMap r3 = new java.util.EnumMap
            r3.<init>(r11)
            O3.I0 r6 = O3.I0.AD_STORAGE
            r3.put(r6, r14)
            r3.put(r10, r12)
            O3.J0 r6 = new O3.J0
            r6.<init>(r3, r7)
            r3 = r6
        L7f7:
            r6 = 0
            goto L82a
        L7f9:
            O3.N r3 = r26.q()
            java.lang.String r3 = r3.v()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L828
            if (r6 == 0) goto L818
            r3 = 30
            if (r6 == r3) goto L818
            r3 = 10
            if (r6 == r3) goto L818
            r3 = 40
            if (r6 != r3) goto L816
            goto L818
        L816:
            r3 = 0
            goto L7f7
        L818:
            O3.C0323t0.k(r13)
            O3.J0 r3 = new O3.J0
            r7 = -10
            r3.<init>(r7)
            r6 = 0
            r13.J(r3, r6)
        L826:
            r3 = 0
            goto L82a
        L828:
            r6 = 0
            goto L826
        L82a:
            if (r3 == 0) goto L834
            O3.C0323t0.k(r13)
            r7 = 1
            r13.J(r3, r7)
            goto L836
        L834:
            r3 = r24
        L836:
            O3.C0323t0.k(r13)
            java.lang.Object r7 = r13.f4346r
            O3.t0 r7 = (O3.C0323t0) r7
            r13.s(r3)
            r1.o()
            android.content.SharedPreferences r3 = r1.s()
            java.lang.String r8 = "dma_consent_settings"
            r9 = 0
            java.lang.String r3 = r3.getString(r8, r9)
            O3.p r3 = O3.C0311p.b(r3)
            int r3 = r3.f5005a
            java.lang.String r8 = "google_analytics_default_allow_ad_personalization_signals"
            r9 = 1
            O3.G0 r8 = r15.D(r8, r9)
            if (r8 == r5) goto L865
            O3.C0323t0.l(r19)
            java.lang.String r12 = "Default ad personalization consent from Manifest"
            r2.c(r8, r12)
        L865:
            java.lang.String r8 = "google_analytics_default_allow_ad_user_data"
            O3.G0 r8 = r15.D(r8, r9)
            if (r8 == r5) goto L88c
            r12 = -10
            boolean r14 = O3.J0.l(r12, r3)
            if (r14 == 0) goto L88c
            O3.C0323t0.k(r13)
            java.util.EnumMap r3 = new java.util.EnumMap
            r3.<init>(r11)
            O3.I0 r4 = O3.I0.AD_USER_DATA
            r3.put(r4, r8)
            O3.p r4 = new O3.p
            r5 = 0
            r4.<init>(r3, r12, r5, r5)
            r13.I(r4, r9)
            goto L8ef
        L88c:
            O3.N r8 = r26.q()
            java.lang.String r8 = r8.v()
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L8b0
            if (r3 == 0) goto L8a0
            r8 = 30
            if (r3 != r8) goto L8b0
        L8a0:
            O3.C0323t0.k(r13)
            O3.p r3 = new O3.p
            r5 = 0
            r12 = -10
            r3.<init>(r5, r12, r5, r5)
            r4 = 1
            r13.I(r3, r4)
            goto L8ef
        L8b0:
            O3.N r8 = r26.q()
            java.lang.String r8 = r8.v()
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 == 0) goto L8ef
            if (r4 == 0) goto L8ef
            android.os.Bundle r4 = r4.f10724t
            if (r4 == 0) goto L8ef
            r8 = 30
            boolean r3 = O3.J0.l(r8, r3)
            if (r3 == 0) goto L8ef
            O3.p r3 = O3.C0311p.c(r8, r4)
            java.util.EnumMap r4 = r3.f5009e
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
        L8da:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L8ef
            java.lang.Object r8 = r4.next()
            O3.G0 r8 = (O3.G0) r8
            if (r8 == r5) goto L8da
            O3.C0323t0.k(r13)
            r4 = 1
            r13.I(r3, r4)
        L8ef:
            java.lang.String r3 = "google_analytics_tcf_data_enabled"
            java.lang.Boolean r3 = r15.A(r3)
            if (r3 == 0) goto L8fd
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L93e
        L8fd:
            O3.C0323t0.l(r19)
            java.lang.String r3 = "TCF client enabled."
            r0.b(r3)
            O3.C0323t0.k(r13)
            r13.o()
            O3.X r0 = r7.f5077v
            O3.C0323t0.l(r0)
            O3.V r0 = r0.f4665D
            java.lang.String r3 = "Register tcfPrefChangeListener."
            r0.b(r3)
            O3.a1 r0 = r13.f4758L
            if (r0 != 0) goto L92a
            O3.P0 r0 = new O3.P0
            r3 = 2
            r0.<init>(r13, r7, r3)
            r13.f4759M = r0
            O3.a1 r0 = new O3.a1
            r0.<init>()
            r13.f4758L = r0
        L92a:
            O3.h0 r0 = r7.f5076u
            O3.C0323t0.j(r0)
            android.content.SharedPreferences r0 = r0.t()
            O3.a1 r3 = r13.f4758L
            r0.registerOnSharedPreferenceChangeListener(r3)
            O3.C0323t0.k(r13)
            r13.u()
        L93e:
            O3.f0 r0 = r1.f4896w
            long r3 = r0.a()
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r3 != 0) goto L95a
            O3.C0323t0.l(r19)
            java.lang.String r3 = "Persisting first open"
            java.lang.Long r4 = java.lang.Long.valueOf(r32)
            r2.c(r4, r3)
            r3 = r32
            r0.b(r3)
            goto L95c
        L95a:
            r3 = r32
        L95c:
            O3.C0323t0.k(r13)
            O3.r0 r5 = r13.f4755I
            boolean r8 = r5.d()
            if (r8 == 0) goto L97a
            boolean r8 = r5.c()
            if (r8 == 0) goto L97a
            O3.t0 r5 = r5.f5036q
            O3.h0 r5 = r5.f5076u
            O3.C0323t0.j(r5)
            K2.a r5 = r5.f4890N
            r9 = 0
            r5.f(r9)
        L97a:
            boolean r5 = r26.h()
            if (r5 != 0) goto L9ee
            boolean r0 = r26.a()
            if (r0 == 0) goto L9e9
            java.lang.String r0 = "android.permission.INTERNET"
            r5 = r30
            boolean r0 = r5.L(r0)
            if (r0 != 0) goto L99b
            O3.C0323t0.l(r19)
            java.lang.String r0 = "App is missing INTERNET permission"
            r3 = r29
            r3.b(r0)
            goto L99d
        L99b:
            r3 = r29
        L99d:
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r0 = r5.L(r0)
            if (r0 != 0) goto L9ad
            O3.C0323t0.l(r19)
            java.lang.String r0 = "App is missing ACCESS_NETWORK_STATE permission"
            r3.b(r0)
        L9ad:
            r12 = r26
            android.content.Context r0 = r12.f5072q
            C3.b r4 = C3.c.a(r0)
            boolean r4 = r4.b()
            if (r4 != 0) goto L9dd
            boolean r4 = r15.r()
            if (r4 != 0) goto L9dd
            boolean r4 = O3.Y1.e0(r0)
            if (r4 != 0) goto L9cf
            O3.C0323t0.l(r19)
            java.lang.String r4 = "AppMeasurementReceiver not registered/enabled"
            r3.b(r4)
        L9cf:
            boolean r0 = O3.Y1.H(r0)
            if (r0 != 0) goto L9dd
            O3.C0323t0.l(r19)
            java.lang.String r0 = "AppMeasurementService not registered/enabled"
            r3.b(r0)
        L9dd:
            O3.C0323t0.l(r19)
            java.lang.String r0 = "Uploading is not possible. App measurement disabled"
            r3.b(r0)
        L9e5:
            r3 = r19
            goto Lb50
        L9e9:
            r12 = r26
            r5 = r30
            goto L9e5
        L9ee:
            r12 = r26
            r5 = r30
            O3.N r8 = r12.q()
            java.lang.String r8 = r8.v()
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto Lab2
            O3.N r8 = r12.q()
            java.lang.String r8 = r8.v()
            r1.o()
            android.content.SharedPreferences r9 = r1.s()
            r11 = r20
            r14 = 0
            java.lang.String r9 = r9.getString(r11, r14)
            boolean r14 = android.text.TextUtils.isEmpty(r8)
            boolean r16 = android.text.TextUtils.isEmpty(r9)
            if (r14 != 0) goto La96
            if (r16 != 0) goto La96
            x3.AbstractC1887A.g(r8)
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto La96
            O3.C0323t0.l(r19)
            java.lang.String r8 = "Rechecking which service to use due to a GMP App Id change"
            r9 = r18
            r9.b(r8)
            r1.o()
            r1.o()
            android.content.SharedPreferences r8 = r1.s()
            r9 = r21
            boolean r8 = r8.contains(r9)
            if (r8 == 0) goto La55
            android.content.SharedPreferences r8 = r1.s()
            r14 = 1
            boolean r8 = r8.getBoolean(r9, r14)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            goto La56
        La55:
            r8 = 0
        La56:
            android.content.SharedPreferences r14 = r1.s()
            android.content.SharedPreferences$Editor r14 = r14.edit()
            r14.clear()
            r14.apply()
            if (r8 == 0) goto La7b
            r1.o()
            android.content.SharedPreferences r14 = r1.s()
            android.content.SharedPreferences$Editor r14 = r14.edit()
            boolean r8 = r8.booleanValue()
            r14.putBoolean(r9, r8)
            r14.apply()
        La7b:
            O3.P r8 = r12.n()
            r8.s()
            O3.w1 r8 = r12.f5059H
            r8.w()
            O3.w1 r8 = r12.f5059H
            r8.u()
            r0.b(r3)
            r0 = r31
            r9 = 0
            r0.f(r9)
            goto La98
        La96:
            r0 = r31
        La98:
            O3.N r3 = r12.q()
            java.lang.String r3 = r3.v()
            r1.o()
            android.content.SharedPreferences r4 = r1.s()
            android.content.SharedPreferences$Editor r4 = r4.edit()
            r4.putString(r11, r3)
            r4.apply()
            goto Lab4
        Lab2:
            r0 = r31
        Lab4:
            O3.J0 r3 = r1.v()
            boolean r3 = r3.i(r10)
            if (r3 != 0) goto Lac2
            r9 = 0
            r0.f(r9)
        Lac2:
            O3.C0323t0.k(r13)
            java.lang.String r0 = r0.e()
            java.util.concurrent.atomic.AtomicReference r3 = r13.f4765x
            r3.set(r0)
            r3 = r25
            android.content.Context r0 = r3.f5072q     // Catch: java.lang.ClassNotFoundException -> Lade
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> Lade
            java.lang.String r3 = "com.google.firebase.remoteconfig.FirebaseRemoteConfig"
            r0.loadClass(r3)     // Catch: java.lang.ClassNotFoundException -> Lade
        Ladb:
            r3 = r19
            goto Lafa
        Lade:
            K2.a r0 = r1.f4889M
            java.lang.String r3 = r0.e()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto Ladb
            O3.C0323t0.l(r19)
            r3 = r19
            O3.V r4 = r3.f4673z
            java.lang.String r8 = "Remote config removed with active feature rollouts"
            r4.b(r8)
            r9 = 0
            r0.f(r9)
        Lafa:
            O3.N r0 = r12.q()
            java.lang.String r0 = r0.v()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb50
            boolean r0 = r12.a()
            android.content.SharedPreferences r4 = r1.f4893t
            if (r4 != 0) goto Lb12
            r4 = r6
            goto Lb18
        Lb12:
            java.lang.String r8 = "deferred_analytics_collection"
            boolean r4 = r4.contains(r8)
        Lb18:
            if (r4 != 0) goto Lb25
            boolean r4 = r15.B()
            if (r4 != 0) goto Lb25
            r4 = r0 ^ 1
            r1.x(r4)
        Lb25:
            if (r0 == 0) goto Lb2d
            O3.C0323t0.k(r13)
            r13.A()
        Lb2d:
            O3.E1 r0 = r12.f5079x
            O3.C0323t0.k(r0)
            k3.c r0 = r0.f4359v
            r0.t()
            O3.w1 r0 = r12.o()
            java.util.concurrent.atomic.AtomicReference r4 = new java.util.concurrent.atomic.AtomicReference
            r4.<init>()
            r0.s(r4)
            O3.w1 r0 = r12.o()
            E.c0 r4 = r1.f4892P
            android.os.Bundle r4 = r4.B()
            r0.t(r4)
        Lb50:
            com.google.android.gms.internal.measurement.Y3.a()
            O3.E r0 = O3.F.f4394Q0
            r9 = 0
            boolean r0 = r15.y(r9, r0)
            if (r0 == 0) goto Lbbe
            r5.o()
            long r4 = r5.J()
            int r0 = (r4 > r27 ? 1 : (r4 == r27 ? 0 : -1))
            if (r0 != 0) goto Lb68
            r6 = 1
        Lb68:
            if (r6 == 0) goto Lbbe
            O3.E r0 = O3.F.f4466x0
            java.lang.Object r0 = r0.a(r9)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            long r4 = (long) r0
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r6 = 5000(0x1388, float:7.006E-42)
            int r0 = r0.nextInt(r6)
            r8 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r8
            long r8 = (long) r0
            B3.a r0 = r12.f5052A
            long r4 = r4 + r8
            r0.getClass()
            long r8 = android.os.SystemClock.elapsedRealtime()
            long r4 = r4 - r8
            r8 = 500(0x1f4, double:2.47E-321)
            long r4 = java.lang.Math.max(r8, r4)
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 <= 0) goto Lba7
            O3.C0323t0.l(r3)
            java.lang.String r0 = "Waiting to fetch trigger URIs until some time after boot. Delay in millis"
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            r2.c(r3, r0)
        Lba7:
            O3.C0323t0.k(r13)
            r13.o()
            O3.P0 r0 = r13.f4749C
            if (r0 != 0) goto Lbb9
            O3.P0 r0 = new O3.P0
            r2 = 0
            r0.<init>(r13, r7, r2)
            r13.f4749C = r0
        Lbb9:
            O3.P0 r0 = r13.f4749C
            r0.b(r4)
        Lbbe:
            O3.e0 r0 = r1.f4882F
            r4 = 1
            r0.e(r4)
            return
        Lbc5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r18
            r0.<init>(r1)
            throw r0
        Lbcd:
            r1 = r18
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        Lbd5:
            r1 = r4
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        Lbdc:
            r1 = r4
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        Lbe3:
            java.lang.Object r0 = r1.f2418s
            O3.i0 r0 = (O3.ServiceConnectionC0291i0) r0
            O3.j0 r2 = r0.f4908r
            O3.t0 r2 = r2.f4924b
            O3.p0 r3 = r2.f5078w
            O3.C0323t0.l(r3)
            r3.o()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = "package_name"
            java.lang.String r0 = r0.f4907q
            r3.putString(r4, r0)
            java.lang.Object r0 = r1.f2417r
            com.google.android.gms.internal.measurement.B r0 = (com.google.android.gms.internal.measurement.B) r0
            com.google.android.gms.internal.measurement.z r0 = (com.google.android.gms.internal.measurement.C0892z) r0     // Catch: java.lang.Exception -> Lc2b
            android.os.Parcel r4 = r0.K()     // Catch: java.lang.Exception -> Lc2b
            com.google.android.gms.internal.measurement.AbstractC0887y.b(r4, r3)     // Catch: java.lang.Exception -> Lc2b
            r3 = 1
            android.os.Parcel r0 = r0.J(r4, r3)     // Catch: java.lang.Exception -> Lc2b
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR     // Catch: java.lang.Exception -> Lc2b
            android.os.Parcelable r3 = com.google.android.gms.internal.measurement.AbstractC0887y.a(r0, r3)     // Catch: java.lang.Exception -> Lc2b
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch: java.lang.Exception -> Lc2b
            r0.recycle()     // Catch: java.lang.Exception -> Lc2b
            if (r3 != 0) goto Lc3c
            O3.X r0 = r2.f5077v     // Catch: java.lang.Exception -> Lc2b
            O3.C0323t0.l(r0)     // Catch: java.lang.Exception -> Lc2b
            O3.V r0 = r0.f4670w     // Catch: java.lang.Exception -> Lc2b
            java.lang.String r3 = "Install Referrer Service returned a null response"
            r0.b(r3)     // Catch: java.lang.Exception -> Lc2b
            goto Lc3c
        Lc2b:
            r0 = move-exception
            O3.X r3 = r2.f5077v
            O3.C0323t0.l(r3)
            O3.V r3 = r3.f4670w
            java.lang.String r4 = "Exception occurred while retrieving the Install Referrer"
            java.lang.String r0 = r0.getMessage()
            r3.c(r0, r4)
        Lc3c:
            O3.p0 r0 = r2.f5078w
            O3.C0323t0.l(r0)
            r0.o()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unexpected call on client side"
            r0.<init>(r2)
            throw r0
        Lc4c:
            java.lang.Object r0 = r1.f2417r
            O3.F0 r0 = (O3.F0) r0
            r0.g()
            boolean r2 = s4.e.i()
            if (r2 == 0) goto Lc61
            O3.p0 r0 = r0.c()
            r0.x(r1)
            goto Lc77
        Lc61:
            java.lang.Object r0 = r1.f2418s
            O3.o r0 = (O3.AbstractC0308o) r0
            long r2 = r0.f4999c
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto Lc6f
            r2 = 1
            goto Lc70
        Lc6f:
            r2 = 0
        Lc70:
            r0.f4999c = r4
            if (r2 == 0) goto Lc77
            r0.a()
        Lc77:
            return
        Lc78:
            java.lang.Object r0 = r1.f2418s
            M5.h r0 = (M5.C0247h) r0
            java.lang.Object r2 = r1.f2417r
            M5.U r2 = (M5.U) r2
            r0.C(r2)
            return
        Lc84:
            java.lang.Object r0 = r1.f2417r
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r2 = r1.f2418s
            J1.T r2 = (J1.T) r2
            boolean r3 = r0.contains(r2)
            if (r3 == 0) goto Lc9e
            r0.remove(r2)
            J1.q r0 = r2.f2600c
            android.view.View r0 = r0.f2703U
            int r2 = r2.f2598a
            C0.S.a(r0, r2)
        Lc9e:
            return
        Lc9f:
            java.lang.Object r0 = r1.f2418s
            r2 = r0
            B0.o r2 = (B0.C0050o) r2
            java.lang.Object r0 = r1.f2417r
            I4.b r0 = (I4.b) r0
            com.google.android.gms.internal.measurement.I1.a0(r0)     // Catch: java.lang.Throwable -> Lcd5 java.util.concurrent.ExecutionException -> Lcda
            java.lang.Object r0 = r2.f500r
            O3.b1 r0 = (O3.C0271b1) r0
            r0.o()
            r2.J()
            r3 = 0
            r0.f4767z = r3
            r3 = 1
            r0.f4747A = r3
            java.lang.Object r3 = r0.f4346r
            O3.t0 r3 = (O3.C0323t0) r3
            O3.X r3 = r3.f5077v
            O3.C0323t0.l(r3)
            O3.V r3 = r3.f4665D
            java.lang.Object r2 = r2.f499q
            O3.I1 r2 = (O3.I1) r2
            java.lang.String r4 = "Successfully registered trigger URI"
            java.lang.String r2 = r2.f4493q
            r3.c(r2, r4)
            r0.M()
            goto Lce2
        Lcd5:
            r0 = move-exception
            r2.F(r0)
            goto Lce2
        Lcda:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()
            r2.F(r0)
        Lce2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I4.a.run():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f2416q) {
            case 0:
                G0 g02 = new G0(a.class.getSimpleName());
                C0050o c0050o = (C0050o) this.f2418s;
                C0050o c0050o2 = new C0050o();
                ((C0050o) g02.f236t).f500r = c0050o2;
                g02.f236t = c0050o2;
                c0050o2.f499q = c0050o;
                return g02.toString();
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ a(int i, Object obj, Object obj2, boolean z5) {
        this.f2416q = i;
        this.f2417r = obj2;
        this.f2418s = obj;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i) {
        this.f2416q = i;
        this.f2417r = obj2;
        this.f2418s = obj3;
    }

    public a(ServiceConnectionC0291i0 serviceConnectionC0291i0, B b7, ServiceConnectionC0291i0 serviceConnectionC0291i02) {
        this.f2416q = 4;
        this.f2417r = b7;
        this.f2418s = serviceConnectionC0291i0;
    }

    public a(C0271b1 c0271b1, L l7) {
        this.f2416q = 7;
        this.f2417r = l7;
        Objects.requireNonNull(c0271b1);
        this.f2418s = c0271b1;
    }

    public a(C0333w1 c0333w1, C0295j1 c0295j1) {
        this.f2416q = 13;
        this.f2417r = c0295j1;
        Objects.requireNonNull(c0333w1);
        this.f2418s = c0333w1;
    }

    public a(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z5) {
        this.f2416q = 23;
        this.f2418s = swipeDismissBehavior;
        this.f2417r = view;
    }
}
