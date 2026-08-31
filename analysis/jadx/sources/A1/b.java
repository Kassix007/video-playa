package A1;

import E1.p;
import O3.C0276d0;
import O3.T1;
import android.database.Cursor;
import androidx.room.q;
import androidx.room.w;
import j2.InterfaceC1161g;
import java.io.IOException;
import n5.AbstractC1397A;
import o5.C1425g;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f180q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f181r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ b(int i, Object obj) {
        this.f180q = i;
        this.f181r = obj;
    }

    /* JADX DEBUG: Class process forced to load method for inline: androidx.room.w.query$default(androidx.room.w, j2.f, android.os.CancellationSignal, int, java.lang.Object):android.database.Cursor */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public C1425g a() throws IOException {
        q qVar = (q) this.f181r;
        C1425g c1425g = new C1425g();
        Cursor cursorQuery$default = w.query$default(qVar.f9756a, new Z.m("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
        while (cursorQuery$default.moveToNext()) {
            try {
                c1425g.add(Integer.valueOf(cursorQuery$default.getInt(0)));
            } finally {
            }
        }
        cursorQuery$default.close();
        C1425g c1425gM = AbstractC1397A.m(c1425g);
        if (c1425gM.f15466q.isEmpty()) {
            return c1425gM;
        }
        if (((q) this.f181r).f9762h == null) {
            throw new IllegalStateException("Required value was null.");
        }
        InterfaceC1161g interfaceC1161g = ((q) this.f181r).f9762h;
        if (interfaceC1161g == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        interfaceC1161g.q();
        return c1425gM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0212  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r25 = this;
            r1 = r25
            int r0 = r1.f180q
            r3 = -1
            r5 = 3
            r8 = 0
            r11 = 0
            switch(r0) {
                case 0: goto L625;
                case 1: goto L5e6;
                case 2: goto L5dd;
                case 3: goto L5cc;
                case 4: goto L5c0;
                case 5: goto L5b7;
                case 6: goto L5ad;
                case 7: goto L596;
                case 8: goto L579;
                case 9: goto L49a;
                case 10: goto L385;
                case 11: goto L368;
                case 12: goto L325;
                case 13: goto L273;
                case 14: goto L24d;
                case 15: goto L216;
                case 16: goto Lf5;
                case 17: goto Led;
                case 18: goto L84;
                case 19: goto L7a;
                case 20: goto L60;
                case 21: goto L50;
                case 22: goto L48;
                case 23: goto L2c;
                case 24: goto L1c;
                case 25: goto L1b;
                default: goto Lc;
            }
        Lc:
            java.lang.Object r0 = r1.f181r
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            v4.m r0 = r0.f11661s
            com.google.android.material.internal.CheckableImageButton r0 = r0.f17660w
            r0.performClick()
            r0.jumpDrawablesToCurrentState()
            return
        L1b:
            throw r8
        L1c:
            java.lang.Object r0 = r1.f181r
            v3.x r0 = (v3.x) r0
            F.D r0 = r0.j
            com.google.android.gms.common.b r2 = new com.google.android.gms.common.b
            r3 = 4
            r2.<init>(r3)
            r0.a(r2)
            return
        L2c:
            java.lang.Object r0 = r1.f181r
            i3.a r0 = (i3.C1136a) r0
            java.lang.Object r0 = r0.f13562r
            v3.o r0 = (v3.o) r0
            u3.b r0 = r0.f17583d
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = " disconnecting because it was signed out."
            java.lang.String r2 = r2.concat(r3)
            r0.d(r2)
            return
        L48:
            java.lang.Object r0 = r1.f181r
            v3.o r0 = (v3.o) r0
            r0.e()
            return
        L50:
            java.lang.Object r0 = r1.f181r
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            androidx.appcompat.widget.ActionMenuView r0 = r0.f9205q
            if (r0 == 0) goto L5f
            m.j r0 = r0.f9150J
            if (r0 == 0) goto L5f
            r0.n()
        L5f:
            return
        L60:
            java.lang.Object r0 = r1.f181r
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = (androidx.appcompat.widget.SearchView$SearchAutoComplete) r0
            boolean r2 = r0.f9170v
            if (r2 == 0) goto L79
            android.content.Context r2 = r0.getContext()
            java.lang.String r3 = "input_method"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.view.inputmethod.InputMethodManager r2 = (android.view.inputmethod.InputMethodManager) r2
            r2.showSoftInput(r0, r11)
            r0.f9170v = r11
        L79:
            return
        L7a:
            java.lang.Object r0 = r1.f181r
            m.p0 r0 = (m.C1325p0) r0
            r0.f14846B = r8
            r0.drawableStateChanged()
            return
        L84:
            java.lang.Object r0 = r1.f181r
            r2 = r0
            g6.d r2 = (g6.d) r2
            monitor-enter(r2)
            g6.a r5 = r2.c()     // Catch: java.lang.Throwable -> Lea
            monitor-exit(r2)
            if (r5 != 0) goto L92
            return
        L92:
            g6.c r2 = r5.f13178c
            kotlin.jvm.internal.m.b(r2)
            java.lang.Object r0 = r1.f181r
            r6 = r0
            g6.d r6 = (g6.d) r6
            java.util.logging.Logger r0 = g6.d.j
            java.util.logging.Level r7 = java.util.logging.Level.FINE
            boolean r7 = r0.isLoggable(r7)
            if (r7 == 0) goto Lb0
            long r8 = java.lang.System.nanoTime()
            java.lang.String r0 = "starting"
            y4.AbstractC1918b.c(r5, r2, r0)
            goto Lb1
        Lb0:
            r8 = r3
        Lb1:
            g6.d.a(r6, r5)     // Catch: java.lang.Throwable -> Lc9
            if (r7 == 0) goto L84
            long r6 = java.lang.System.nanoTime()
            long r6 = r6 - r8
            java.lang.String r0 = y4.AbstractC1918b.q(r6)
            java.lang.String r6 = "finished run in "
            java.lang.String r0 = r6.concat(r0)
            y4.AbstractC1918b.c(r5, r2, r0)
            goto L84
        Lc9:
            r0 = move-exception
            k3.c r3 = r6.f13187a     // Catch: java.lang.Throwable -> Ld4
            java.lang.Object r3 = r3.f14120q     // Catch: java.lang.Throwable -> Ld4
            java.util.concurrent.ThreadPoolExecutor r3 = (java.util.concurrent.ThreadPoolExecutor) r3     // Catch: java.lang.Throwable -> Ld4
            r3.execute(r1)     // Catch: java.lang.Throwable -> Ld4
            throw r0     // Catch: java.lang.Throwable -> Ld4
        Ld4:
            r0 = move-exception
            if (r7 == 0) goto Le9
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r8
            java.lang.String r3 = y4.AbstractC1918b.q(r3)
            java.lang.String r4 = "failed a run in "
            java.lang.String r3 = r4.concat(r3)
            y4.AbstractC1918b.c(r5, r2, r3)
        Le9:
            throw r0
        Lea:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        Led:
            java.lang.Object r0 = r1.f181r
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r0
            r0.A0()
            return
        Lf5:
            java.lang.Object r0 = r1.f181r
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            d2.D r3 = r0.f9632a0
            if (r3 == 0) goto L212
            d2.h r3 = (d2.C0982h) r3
            long r4 = r3.f11971d
            java.util.ArrayList r8 = r3.f12122h
            boolean r12 = r8.isEmpty()
            java.util.ArrayList r13 = r3.j
            boolean r14 = r13.isEmpty()
            java.util.ArrayList r15 = r3.f12123k
            boolean r16 = r15.isEmpty()
            r17 = 0
            java.util.ArrayList r6 = r3.i
            boolean r7 = r6.isEmpty()
            if (r12 == 0) goto L125
            if (r14 == 0) goto L125
            if (r7 == 0) goto L125
            if (r16 == 0) goto L125
            goto L212
        L125:
            int r9 = r8.size()
            r10 = r11
        L12a:
            if (r10 >= r9) goto L164
            java.lang.Object r20 = r8.get(r10)
            int r10 = r10 + 1
            r11 = r20
            d2.V r11 = (d2.AbstractC0974V) r11
            android.view.View r2 = r11.f12032a
            r22 = r7
            android.view.ViewPropertyAnimator r7 = r2.animate()
            r23 = r8
            java.util.ArrayList r8 = r3.f12129q
            r8.add(r11)
            android.view.ViewPropertyAnimator r8 = r7.setDuration(r4)
            r24 = r9
            r9 = 0
            android.view.ViewPropertyAnimator r8 = r8.alpha(r9)
            d2.c r9 = new d2.c
            r9.<init>(r3, r11, r7, r2)
            android.view.ViewPropertyAnimator r2 = r8.setListener(r9)
            r2.start()
            r7 = r22
            r8 = r23
            r9 = r24
            r11 = 0
            goto L12a
        L164:
            r22 = r7
            r23 = r8
            r23.clear()
            if (r14 != 0) goto L198
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.addAll(r13)
            java.util.ArrayList r7 = r3.f12125m
            r7.add(r2)
            r13.clear()
            d2.b r7 = new d2.b
            r8 = 0
            r7.<init>(r3, r2, r8)
            if (r12 != 0) goto L195
            java.lang.Object r2 = r2.get(r8)
            d2.g r2 = (d2.C0981g) r2
            d2.V r2 = r2.f12111a
            android.view.View r2 = r2.f12032a
            java.util.WeakHashMap r8 = w1.AbstractC1835K.f18149a
            r2.postOnAnimationDelayed(r7, r4)
            goto L198
        L195:
            r7.run()
        L198:
            if (r16 != 0) goto L1c6
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.addAll(r15)
            java.util.ArrayList r7 = r3.f12126n
            r7.add(r2)
            r15.clear()
            d2.b r7 = new d2.b
            r8 = 1
            r7.<init>(r3, r2, r8)
            if (r12 != 0) goto L1c3
            r8 = 0
            java.lang.Object r2 = r2.get(r8)
            d2.f r2 = (d2.C0980f) r2
            d2.V r2 = r2.f12106a
            android.view.View r2 = r2.f12032a
            java.util.WeakHashMap r8 = w1.AbstractC1835K.f18149a
            r2.postOnAnimationDelayed(r7, r4)
            goto L1c6
        L1c3:
            r7.run()
        L1c6:
            if (r22 != 0) goto L210
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.addAll(r6)
            java.util.ArrayList r7 = r3.f12124l
            r7.add(r2)
            r6.clear()
            d2.b r6 = new d2.b
            r7 = 2
            r6.<init>(r3, r2, r7)
            if (r12 == 0) goto L1e9
            if (r14 == 0) goto L1e9
            if (r16 != 0) goto L1e5
            goto L1e9
        L1e5:
            r6.run()
            goto L210
        L1e9:
            if (r12 != 0) goto L1ec
            goto L1ee
        L1ec:
            r4 = r17
        L1ee:
            if (r14 != 0) goto L1f3
            long r7 = r3.f11972e
            goto L1f5
        L1f3:
            r7 = r17
        L1f5:
            if (r16 != 0) goto L1fa
            long r9 = r3.f
            goto L1fc
        L1fa:
            r9 = r17
        L1fc:
            long r7 = java.lang.Math.max(r7, r9)
            long r7 = r7 + r4
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            d2.V r2 = (d2.AbstractC0974V) r2
            android.view.View r2 = r2.f12032a
            java.util.WeakHashMap r4 = w1.AbstractC1835K.f18149a
            r2.postOnAnimationDelayed(r6, r7)
            goto L213
        L210:
            r3 = 0
            goto L213
        L212:
            r3 = r11
        L213:
            r0.f9665y0 = r3
            return
        L216:
            java.lang.Object r0 = r1.f181r
            d2.k r0 = (d2.C0985k) r0
            android.animation.ValueAnimator r2 = r0.f12160z
            int r3 = r0.f12136A
            r8 = 1
            if (r3 == r8) goto L225
            r7 = 2
            if (r3 == r7) goto L229
            goto L24c
        L225:
            r7 = 2
            r2.cancel()
        L229:
            r0.f12136A = r5
            java.lang.Object r0 = r2.getAnimatedValue()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            float[] r3 = new float[r7]
            r8 = 0
            r3[r8] = r0
            r19 = 1
            r20 = 0
            r3[r19] = r20
            r2.setFloatValues(r3)
            r0 = 500(0x1f4, float:7.0E-43)
            long r3 = (long) r0
            r2.setDuration(r3)
            r2.start()
        L24c:
            return
        L24d:
            r8 = r11
            java.lang.Object r0 = r1.f181r
            c4.f r0 = (c4.f) r0
            r0.f10250c = r8
            i1.b r2 = r0.f10252e
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r2
            D1.d r3 = r2.f11374M
            if (r3 == 0) goto L268
            boolean r3 = r3.f()
            if (r3 == 0) goto L268
            int r2 = r0.f10249b
            r0.a(r2)
            goto L272
        L268:
            int r3 = r2.f11373L
            r7 = 2
            if (r3 != r7) goto L272
            int r0 = r0.f10249b
            r2.C(r0)
        L272:
            return
        L273:
            java.lang.Object r0 = r1.f181r
            androidx.room.q r0 = (androidx.room.q) r0
            androidx.work.impl.WorkDatabase_Impl r0 = r0.f9756a
            java.util.concurrent.locks.Lock r2 = r0.getCloseLock$room_runtime_release()
            r2.lock()
            java.lang.Object r0 = r1.f181r     // Catch: java.lang.Throwable -> L2cc android.database.sqlite.SQLiteException -> L2ce java.lang.IllegalStateException -> L2d0
            androidx.room.q r0 = (androidx.room.q) r0     // Catch: java.lang.Throwable -> L2cc android.database.sqlite.SQLiteException -> L2ce java.lang.IllegalStateException -> L2d0
            boolean r0 = r0.c()     // Catch: java.lang.Throwable -> L2cc android.database.sqlite.SQLiteException -> L2ce java.lang.IllegalStateException -> L2d0
            if (r0 != 0) goto L28f
        L28a:
            r2.unlock()
            goto L320
        L28f:
            java.lang.Object r0 = r1.f181r     // Catch: java.lang.Throwable -> L2cc android.database.sqlite.SQLiteException -> L2ce java.lang.IllegalStateException -> L2d0
            androidx.room.q r0 = (androidx.room.q) r0     // Catch: java.lang.Throwable -> L2cc android.database.sqlite.SQLiteException -> L2ce java.lang.IllegalStateException -> L2d0
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f     // Catch: java.lang.Throwable -> L2cc android.database.sqlite.SQLiteException -> L2ce java.lang.IllegalStateException -> L2d0
            r3 = 0
            r8 = 1
            boolean r0 = r0.compareAndSet(r8, r3)     // Catch: java.lang.Throwable -> L2cc android.database.sqlite.SQLiteException -> L2ce java.lang.IllegalStateException -> L2d0
            if (r0 != 0) goto L29e
            goto L28a
        L29e:
            java.lang.Object r0 = r1.f181r     // Catch: java.lang.Throwable -> L2cc android.database.sqlite.SQLiteException -> L2ce java.lang.IllegalStateException -> L2d0
            androidx.room.q r0 = (androidx.room.q) r0     // Catch: java.lang.Throwable -> L2cc android.database.sqlite.SQLiteException -> L2ce java.lang.IllegalStateException -> L2d0
            androidx.work.impl.WorkDatabase_Impl r0 = r0.f9756a     // Catch: java.lang.Throwable -> L2cc android.database.sqlite.SQLiteException -> L2ce java.lang.IllegalStateException -> L2d0
            boolean r0 = r0.inTransaction()     // Catch: java.lang.Throwable -> L2cc android.database.sqlite.SQLiteException -> L2ce java.lang.IllegalStateException -> L2d0
            if (r0 == 0) goto L2ab
            goto L28a
        L2ab:
            java.lang.Object r0 = r1.f181r     // Catch: java.lang.Throwable -> L2cc android.database.sqlite.SQLiteException -> L2ce java.lang.IllegalStateException -> L2d0
            androidx.room.q r0 = (androidx.room.q) r0     // Catch: java.lang.Throwable -> L2cc android.database.sqlite.SQLiteException -> L2ce java.lang.IllegalStateException -> L2d0
            androidx.work.impl.WorkDatabase_Impl r0 = r0.f9756a     // Catch: java.lang.Throwable -> L2cc android.database.sqlite.SQLiteException -> L2ce java.lang.IllegalStateException -> L2d0
            j2.d r0 = r0.getOpenHelper()     // Catch: java.lang.Throwable -> L2cc android.database.sqlite.SQLiteException -> L2ce java.lang.IllegalStateException -> L2d0
            k2.g r0 = (k2.C1183g) r0     // Catch: java.lang.Throwable -> L2cc android.database.sqlite.SQLiteException -> L2ce java.lang.IllegalStateException -> L2d0
            j2.a r3 = r0.a()     // Catch: java.lang.Throwable -> L2cc android.database.sqlite.SQLiteException -> L2ce java.lang.IllegalStateException -> L2d0
            r3.L()     // Catch: java.lang.Throwable -> L2cc android.database.sqlite.SQLiteException -> L2ce java.lang.IllegalStateException -> L2d0
            o5.g r0 = r1.a()     // Catch: java.lang.Throwable -> L2d2
            r3.J()     // Catch: java.lang.Throwable -> L2d2
            r3.g()     // Catch: java.lang.Throwable -> L2cc android.database.sqlite.SQLiteException -> L2ce java.lang.IllegalStateException -> L2d0
        L2c8:
            r2.unlock()
            goto L2eb
        L2cc:
            r0 = move-exception
            goto L321
        L2ce:
            r0 = move-exception
            goto L2d7
        L2d0:
            r0 = move-exception
            goto L2e1
        L2d2:
            r0 = move-exception
            r3.g()     // Catch: java.lang.Throwable -> L2cc android.database.sqlite.SQLiteException -> L2ce java.lang.IllegalStateException -> L2d0
            throw r0     // Catch: java.lang.Throwable -> L2cc android.database.sqlite.SQLiteException -> L2ce java.lang.IllegalStateException -> L2d0
        L2d7:
            java.lang.String r3 = "ROOM"
            java.lang.String r4 = "Cannot run invalidation tracker. Is the db closed?"
            android.util.Log.e(r3, r4, r0)     // Catch: java.lang.Throwable -> L2cc
            n5.u r0 = n5.u.f15301q     // Catch: java.lang.Throwable -> L2cc
            goto L2c8
        L2e1:
            java.lang.String r3 = "ROOM"
            java.lang.String r4 = "Cannot run invalidation tracker. Is the db closed?"
            android.util.Log.e(r3, r4, r0)     // Catch: java.lang.Throwable -> L2cc
            n5.u r0 = n5.u.f15301q     // Catch: java.lang.Throwable -> L2cc
            goto L2c8
        L2eb:
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L320
            java.lang.Object r2 = r1.f181r
            androidx.room.q r2 = (androidx.room.q) r2
            o.f r3 = r2.f9763k
            monitor-enter(r3)
            o.f r2 = r2.f9763k     // Catch: java.lang.Throwable -> L31a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L31a
        L301:
            r4 = r2
            o.b r4 = (o.C1406b) r4     // Catch: java.lang.Throwable -> L31a
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L31a
            if (r5 == 0) goto L31c
            java.lang.Object r4 = r4.next()     // Catch: java.lang.Throwable -> L31a
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> L31a
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L31a
            androidx.room.o r4 = (androidx.room.o) r4     // Catch: java.lang.Throwable -> L31a
            r4.a(r0)     // Catch: java.lang.Throwable -> L31a
            goto L301
        L31a:
            r0 = move-exception
            goto L31e
        L31c:
            monitor-exit(r3)
            goto L320
        L31e:
            monitor-exit(r3)
            throw r0
        L320:
            return
        L321:
            r2.unlock()
            throw r0
        L325:
            java.lang.Object r0 = r1.f181r
            O3.t0 r0 = (O3.C0323t0) r0
            O3.Y1 r2 = r0.f5080y
            O3.b1 r3 = r0.f5054C
            O3.C0323t0.j(r2)
            r2.o()
            long r6 = r2.J()
            r8 = 1
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 != 0) goto L35b
            O3.C0323t0.k(r3)
            r3.o()
            O3.P0 r0 = r3.f4749C
            if (r0 == 0) goto L34a
            r0.c()
        L34a:
            java.lang.Thread r0 = new java.lang.Thread
            O3.C0323t0.k(r3)
            O3.O0 r2 = new O3.O0
            r2.<init>(r3, r5)
            r0.<init>(r2)
            r0.start()
            goto L367
        L35b:
            O3.X r0 = r0.f5077v
            O3.C0323t0.l(r0)
            O3.V r0 = r0.f4673z
            java.lang.String r2 = "registerTrigger called but app not eligible"
            r0.b(r2)
        L367:
            return
        L368:
            java.lang.Object r0 = r1.f181r
            O3.b2 r0 = (O3.b2) r0
            O3.t0 r0 = r0.f4768a
            O3.g1 r2 = r0.f5062K
            O3.C0323t0.i(r2)
            O3.g1 r0 = r0.f5062K
            O3.E r2 = O3.F.f4368D
            java.lang.Object r2 = r2.a(r8)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r0.s(r2)
            return
        L385:
            r17 = 0
            java.lang.Object r0 = r1.f181r
            O3.T1 r0 = (O3.T1) r0
            O3.p0 r2 = r0.c()
            r2.o()
            O3.j0 r2 = new O3.j0
            r2.<init>(r0)
            r0.f4581A = r2
            O3.n r2 = new O3.n
            r2.<init>(r0)
            r2.q()
            r0.f4609s = r2
            O3.l0 r2 = r0.f4607q
            O3.g r3 = r0.d0()
            x3.AbstractC1887A.g(r2)
            r3.f4857u = r2
            O3.y1 r2 = new O3.y1
            r2.<init>(r0)
            r2.q()
            r0.f4615y = r2
            O3.c r2 = new O3.c
            r2.<init>(r0)
            r2.q()
            r0.f4612v = r2
            O3.b0 r2 = new O3.b0
            r3 = 1
            r2.<init>(r0, r3)
            r2.q()
            r0.f4614x = r2
            O3.J1 r2 = new O3.J1
            r2.<init>(r0)
            r2.q()
            r0.f4611u = r2
            O3.d0 r2 = new O3.d0
            r2.<init>(r0)
            r0.f4610t = r2
            int r2 = r0.f4588H
            int r3 = r0.f4589I
            if (r2 == r3) goto L3fb
            O3.X r2 = r0.b()
            O3.V r2 = r2.f4670w
            int r3 = r0.f4588H
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r0.f4589I
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Not all upload components initialized"
            r2.d(r3, r4, r5)
        L3fb:
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.f4583C
            r3 = 1
            r2.set(r3)
            O3.X r2 = r0.b()
            O3.V r2 = r2.f4666E
            java.lang.String r3 = "UploadController is now fully initialized"
            r2.b(r3)
            O3.p0 r2 = r0.c()
            r2.o()
            O3.n r2 = r0.f4609s
            O3.T1.S(r2)
            r2.y()
            O3.n r2 = r0.f4609s
            O3.T1.S(r2)
            r2.o()
            r2.p()
            boolean r3 = r2.Z()
            if (r3 == 0) goto L478
            O3.E r3 = O3.F.f4462v0
            java.lang.Object r4 = r3.a(r8)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            int r4 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r4 != 0) goto L43d
            goto L478
        L43d:
            android.database.sqlite.SQLiteDatabase r4 = r2.f0()
            java.lang.Object r2 = r2.f4346r
            O3.t0 r2 = (O3.C0323t0) r2
            B3.a r5 = r2.f5052A
            r5.getClass()
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.Object r3 = r3.a(r8)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String[] r3 = new java.lang.String[]{r5, r3}
            java.lang.String r5 = "trigger_uris"
            java.lang.String r6 = "abs(timestamp_millis - ?) > cast(? as integer)"
            int r3 = r4.delete(r5, r6, r3)
            if (r3 <= 0) goto L478
            O3.X r2 = r2.f5077v
            O3.C0323t0.l(r2)
            O3.V r2 = r2.f4666E
            java.lang.String r4 = "Deleted stale trigger uris. rowsDeleted"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.c(r3, r4)
        L478:
            O3.y1 r2 = r0.f4615y
            O3.f0 r2 = r2.f5166y
            long r2 = r2.a()
            int r2 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r2 != 0) goto L496
            O3.y1 r2 = r0.f4615y
            O3.f0 r2 = r2.f5166y
            B3.a r3 = r0.e()
            r3.getClass()
            long r3 = java.lang.System.currentTimeMillis()
            r2.b(r3)
        L496:
            r0.L()
            return
        L49a:
            java.lang.Object r0 = r1.f181r
            O3.B1 r0 = (O3.B1) r0
            B0.o r2 = r0.f4329s
            java.lang.Object r2 = r2.f500r
            O3.E1 r2 = (O3.E1) r2
            r2.o()
            java.lang.Object r3 = r2.f4346r
            O3.t0 r3 = (O3.C0323t0) r3
            O3.X r4 = r3.f5077v
            android.content.Context r5 = r3.f5072q
            O3.C0323t0.l(r4)
            O3.V r6 = r4.f4665D
            java.lang.String r7 = "Application going to the background"
            r6.b(r7)
            O3.h0 r6 = r3.f5076u
            O3.C0323t0.j(r6)
            O3.e0 r6 = r6.f4886J
            r7 = 1
            r6.e(r7)
            r2.o()
            r2.f4358u = r7
            O3.g r6 = r3.f5075t
            boolean r7 = r6.C()
            if (r7 != 0) goto L4e0
            long r9 = r0.f4328r
            O3.D1 r2 = r2.f4360w
            r7 = 0
            r2.e(r7, r7, r9)
            java.lang.Object r2 = r2.f4349c
            O3.C1 r2 = (O3.C1) r2
            r2.c()
        L4e0:
            long r9 = r0.f4327q
            O3.C0323t0.l(r4)
            O3.V r0 = r4.f4664C
            java.lang.String r2 = "Application backgrounded at: timestamp_millis"
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            r0.c(r7, r2)
            O3.b1 r0 = r3.f5054C
            O3.C0323t0.k(r0)
            r0.o()
            java.lang.Object r2 = r0.f4346r
            O3.t0 r2 = (O3.C0323t0) r2
            r0.p()
            O3.w1 r0 = r2.o()
            r0.o()
            r0.p()
            boolean r7 = r0.v()
            if (r7 != 0) goto L510
            goto L522
        L510:
            java.lang.Object r0 = r0.f4346r
            O3.t0 r0 = (O3.C0323t0) r0
            O3.Y1 r0 = r0.f5080y
            O3.C0323t0.j(r0)
            int r0 = r0.U()
            r7 = 242600(0x3b3a8, float:3.39955E-40)
            if (r0 < r7) goto L53a
        L522:
            O3.w1 r0 = r2.o()
            r0.o()
            r0.p()
            r7 = 1
            O3.a2 r2 = r0.E(r7)
            O3.r1 r7 = new O3.r1
            r9 = 2
            r7.<init>(r0, r2, r9)
            r0.C(r7)
        L53a:
            O3.E r0 = O3.F.f4388N0
            boolean r0 = r6.y(r8, r0)
            if (r0 == 0) goto L578
            O3.Y1 r0 = r3.f5080y
            O3.C0323t0.j(r0)
            java.lang.String r2 = r5.getPackageName()
            java.lang.String r7 = r6.f4856t
            boolean r0 = r0.O(r2, r7)
            if (r0 == 0) goto L556
            r5 = 1000(0x3e8, double:4.94E-321)
            goto L560
        L556:
            java.lang.String r0 = r5.getPackageName()
            O3.E r2 = O3.F.f4369E
            long r5 = r6.v(r0, r2)
        L560:
            O3.C0323t0.l(r4)
            O3.V r0 = r4.f4666E
            java.lang.String r2 = "[sgtm] Scheduling batch upload with minimum latency in millis"
            java.lang.Long r4 = java.lang.Long.valueOf(r5)
            r0.c(r4, r2)
            O3.g1 r0 = r3.f5062K
            O3.C0323t0.i(r0)
            O3.g1 r0 = r3.f5062K
            r0.s(r5)
        L578:
            return
        L579:
            java.lang.Object r0 = r1.f181r
            I4.a r0 = (I4.a) r0
            java.lang.Object r0 = r0.f2418s
            O3.v1 r0 = (O3.ServiceConnectionC0330v1) r0
            O3.w1 r0 = r0.f5100s
            java.lang.Object r2 = r0.f4346r
            O3.t0 r2 = (O3.C0323t0) r2
            O3.p0 r2 = r2.f5078w
            O3.C0323t0.l(r2)
            O3.u1 r3 = new O3.u1
            r8 = 0
            r3.<init>(r0, r8)
            r2.x(r3)
            return
        L596:
            java.lang.Object r0 = r1.f181r
            O3.v1 r0 = (O3.ServiceConnectionC0330v1) r0
            O3.w1 r0 = r0.f5100s
            android.content.ComponentName r2 = new android.content.ComponentName
            java.lang.Object r3 = r0.f4346r
            O3.t0 r3 = (O3.C0323t0) r3
            android.content.Context r3 = r3.f5072q
            java.lang.String r4 = "com.google.android.gms.measurement.AppMeasurementService"
            r2.<init>(r3, r4)
            r0.z(r2)
            return
        L5ad:
            java.lang.Object r0 = r1.f181r
            O3.d0 r0 = (O3.C0276d0) r0
            O3.T1 r0 = r0.f4826a
            r0.L()
            return
        L5b7:
            java.lang.Object r0 = r1.f181r
            J1.H r0 = (J1.H) r0
            r8 = 1
            r0.y(r8)
            return
        L5c0:
            java.lang.Object r0 = r1.f181r
            J1.m r0 = (J1.DialogInterfaceOnCancelListenerC0181m) r0
            J1.j r2 = r0.f2659l0
            android.app.Dialog r0 = r0.f2667t0
            r2.onDismiss(r0)
            return
        L5cc:
            java.lang.Object r0 = r1.f181r
            J1.e r0 = (J1.AnimationAnimationListenerC0173e) r0
            android.view.ViewGroup r2 = r0.f2642b
            android.view.View r3 = r0.f2643c
            r2.endViewTransition(r3)
            J1.f r0 = r0.f2644d
            r0.d()
            return
        L5dd:
            java.lang.Object r0 = r1.f181r
            D1.d r0 = (D1.d) r0
            r8 = 0
            r0.n(r8)
            return
        L5e6:
            r8 = r11
            r9 = 2
            java.lang.Object r0 = r1.f181r
            C0.A r0 = (C0.A) r0
            r0.removeCallbacks(r1)
            android.view.MotionEvent r11 = r0.f715G0
            if (r11 == 0) goto L624
            int r0 = r11.getToolType(r8)
            if (r0 != r5) goto L5fc
            r21 = 1
            goto L5fe
        L5fc:
            r21 = 0
        L5fe:
            int r0 = r11.getActionMasked()
            if (r21 == 0) goto L60c
            r2 = 10
            if (r0 == r2) goto L624
            r8 = 1
            if (r0 == r8) goto L624
            goto L60f
        L60c:
            r8 = 1
            if (r0 == r8) goto L624
        L60f:
            r2 = 7
            if (r0 == r2) goto L618
            r3 = 9
            if (r0 == r3) goto L618
            r12 = r9
            goto L619
        L618:
            r12 = r2
        L619:
            java.lang.Object r0 = r1.f181r
            r10 = r0
            C0.A r10 = (C0.A) r10
            long r13 = r10.f717H0
            r15 = 0
            r10.O(r11, r12, r13, r15)
        L624:
            return
        L625:
            r17 = 0
            java.lang.Object r0 = r1.f181r
            A1.e r0 = (A1.e) r0
            m.p0 r2 = r0.f192s
            A1.a r5 = r0.f190q
            boolean r6 = r0.f187E
            if (r6 != 0) goto L635
            goto L6b1
        L635:
            boolean r6 = r0.f185C
            if (r6 == 0) goto L64a
            r8 = 0
            r0.f185C = r8
            long r6 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            r5.f177e = r6
            r5.f178g = r3
            r5.f = r6
            r3 = 1056964608(0x3f000000, float:0.5)
            r5.f179h = r3
        L64a:
            long r3 = r5.f178g
            int r3 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r3 <= 0) goto L660
            long r3 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r6 = r5.f178g
            int r8 = r5.i
            long r8 = (long) r8
            long r6 = r6 + r8
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 <= 0) goto L660
        L65e:
            r8 = 0
            goto L667
        L660:
            boolean r3 = r0.e()
            if (r3 != 0) goto L66a
            goto L65e
        L667:
            r0.f187E = r8
            goto L6b1
        L66a:
            r8 = 0
            boolean r3 = r0.f186D
            if (r3 == 0) goto L685
            r0.f186D = r8
            long r9 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r11 = r9
            android.view.MotionEvent r3 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            r2.onTouchEvent(r3)
            r3.recycle()
        L685:
            long r3 = r5.f
            int r3 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r3 == 0) goto L6b2
            long r3 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            float r6 = r5.a(r3)
            r7 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r7 = r7 * r6
            float r7 = r7 * r6
            r8 = 1082130432(0x40800000, float:4.0)
            float r6 = r6 * r8
            float r6 = r6 + r7
            long r7 = r5.f
            long r7 = r3 - r7
            r5.f = r3
            float r3 = (float) r7
            float r3 = r3 * r6
            float r4 = r5.f176d
            float r3 = r3 * r4
            int r3 = (int) r3
            m.p0 r0 = r0.f189G
            r0.scrollListBy(r3)
            java.util.WeakHashMap r0 = w1.AbstractC1835K.f18149a
            r2.postOnAnimation(r1)
        L6b1:
            return
        L6b2:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r2 = "Cannot compute scroll delta before calling start()"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: A1.b.run():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public b(v3.m mVar, U.l lVar) {
        this.f180q = 25;
        this.f181r = lVar;
    }

    public b(C0276d0 c0276d0, boolean z5) {
        this.f180q = 6;
        this.f181r = c0276d0;
    }

    public b(T1 t12, p pVar) {
        this.f180q = 10;
        this.f181r = t12;
    }
}
