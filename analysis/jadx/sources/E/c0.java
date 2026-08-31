package E;

import J1.AbstractComponentCallbacksC0185q;
import J1.C0174f;
import O3.C0288h0;
import O3.C0323t0;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0654q;
import androidx.lifecycle.h0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.google.android.gms.internal.measurement.A4;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.android.gms.internal.measurement.C0783d;
import com.google.android.gms.internal.measurement.C0793f;
import com.google.android.gms.internal.measurement.C0798g;
import com.google.android.gms.internal.measurement.C0828m;
import com.google.android.gms.internal.measurement.C0838o;
import com.google.android.gms.internal.measurement.C0862t;
import com.google.android.gms.internal.measurement.CallableC0809i0;
import com.google.android.gms.internal.measurement.F1;
import com.google.android.gms.internal.measurement.F2;
import com.google.android.gms.internal.measurement.I1;
import com.google.android.gms.internal.measurement.InterfaceC0833n;
import com.google.android.gms.internal.measurement.K1;
import com.google.android.gms.internal.measurement.Y3;
import e4.C1055e;
import i1.C1134a;
import i3.C1136a;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k.AbstractC1168a;
import l.MenuC1194A;
import l.MenuC1209l;
import l.MenuItemC1216s;
import m5.AbstractC1362a;
import m5.C1376o;
import n5.AbstractC1397A;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p1.InterfaceMenuItemC1442a;
import r.C1548G;
import r.C1554e;
import r.C1566q;
import r1.InterfaceC1573a;
import t.AbstractC1599H;
import t.AbstractC1603b;
import t.C1598G;
import u.AbstractC1663q;
import u.E0;
import u.InterfaceC1622A;
import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements InterfaceC1573a, d0.e, E0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f1552q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f1553r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f1554s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f1555t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [E.c0.<init>(u.A):void, i3.a.<init>(float, u.q):void, u.u.<init>(u.v, Z.m, java.lang.Object, u.q):void, x.e.invokeSuspend(java.lang.Object):java.lang.Object, x.h.b(x.h, w.i0, float, float, x.d, s5.c):java.lang.Object] */
    public /* synthetic */ c0(Object obj) {
        this.f1552q = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A() {
        /*
            r14 = this;
            byte[] r0 = e6.b.f12673a
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            monitor-enter(r14)
            java.lang.Object r0 = r14.f1553r     // Catch: java.lang.Throwable -> L49
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch: java.lang.Throwable -> L49
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = "readyAsyncCalls.iterator()"
            kotlin.jvm.internal.m.d(r0, r2)     // Catch: java.lang.Throwable -> L49
        L15:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L49
            if (r2 == 0) goto L4c
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L49
            h6.e r2 = (h6.e) r2     // Catch: java.lang.Throwable -> L49
            java.lang.Object r3 = r14.f1554s     // Catch: java.lang.Throwable -> L49
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch: java.lang.Throwable -> L49
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L49
            r4 = 64
            if (r3 >= r4) goto L4c
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f13480r     // Catch: java.lang.Throwable -> L49
            int r3 = r3.get()     // Catch: java.lang.Throwable -> L49
            r4 = 5
            if (r3 >= r4) goto L15
            r0.remove()     // Catch: java.lang.Throwable -> L49
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f13480r     // Catch: java.lang.Throwable -> L49
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L49
            r1.add(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.Object r3 = r14.f1554s     // Catch: java.lang.Throwable -> L49
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch: java.lang.Throwable -> L49
            r3.add(r2)     // Catch: java.lang.Throwable -> L49
            goto L15
        L49:
            r0 = move-exception
            goto Le9
        L4c:
            monitor-enter(r14)     // Catch: java.lang.Throwable -> L49
            java.lang.Object r0 = r14.f1554s     // Catch: java.lang.Throwable -> Le6
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch: java.lang.Throwable -> Le6
            r0.size()     // Catch: java.lang.Throwable -> Le6
            java.lang.Object r0 = r14.f1555t     // Catch: java.lang.Throwable -> Le6
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch: java.lang.Throwable -> Le6
            r0.size()     // Catch: java.lang.Throwable -> Le6
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L49
            monitor-exit(r14)
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        L63:
            if (r4 >= r2) goto Le5
            java.lang.Object r0 = r1.get(r4)
            r5 = r0
            h6.e r5 = (h6.e) r5
            monitor-enter(r14)
            java.lang.Object r0 = r14.f1552q     // Catch: java.lang.Throwable -> La5
            java.util.concurrent.ThreadPoolExecutor r0 = (java.util.concurrent.ThreadPoolExecutor) r0     // Catch: java.lang.Throwable -> La5
            if (r0 != 0) goto La7
            java.util.concurrent.ThreadPoolExecutor r6 = new java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> La5
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> La5
            java.util.concurrent.SynchronousQueue r12 = new java.util.concurrent.SynchronousQueue     // Catch: java.lang.Throwable -> La5
            r12.<init>()     // Catch: java.lang.Throwable -> La5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La5
            r0.<init>()     // Catch: java.lang.Throwable -> La5
            java.lang.String r7 = e6.b.f     // Catch: java.lang.Throwable -> La5
            r0.append(r7)     // Catch: java.lang.Throwable -> La5
            java.lang.String r7 = " Dispatcher"
            r0.append(r7)     // Catch: java.lang.Throwable -> La5
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> La5
            java.lang.String r7 = "name"
            kotlin.jvm.internal.m.e(r0, r7)     // Catch: java.lang.Throwable -> La5
            e6.a r13 = new e6.a     // Catch: java.lang.Throwable -> La5
            r13.<init>(r0, r3)     // Catch: java.lang.Throwable -> La5
            r7 = 0
            r8 = 2147483647(0x7fffffff, float:NaN)
            r9 = 60
            r6.<init>(r7, r8, r9, r11, r12, r13)     // Catch: java.lang.Throwable -> La5
            r14.f1552q = r6     // Catch: java.lang.Throwable -> La5
            goto La7
        La5:
            r0 = move-exception
            goto Le3
        La7:
            java.lang.Object r0 = r14.f1552q     // Catch: java.lang.Throwable -> La5
            java.util.concurrent.ThreadPoolExecutor r0 = (java.util.concurrent.ThreadPoolExecutor) r0     // Catch: java.lang.Throwable -> La5
            kotlin.jvm.internal.m.b(r0)     // Catch: java.lang.Throwable -> La5
            monitor-exit(r14)
            r5.getClass()
            h6.h r6 = r5.f13481s
            byte[] r7 = e6.b.f12673a
            r0.execute(r5)     // Catch: java.lang.Throwable -> Lba java.util.concurrent.RejectedExecutionException -> Lbc
            goto Ld8
        Lba:
            r0 = move-exception
            goto Ldb
        Lbc:
            r0 = move-exception
            java.io.InterruptedIOException r7 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> Lba
            java.lang.String r8 = "executor rejected"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> Lba
            r7.initCause(r0)     // Catch: java.lang.Throwable -> Lba
            r6.i(r7)     // Catch: java.lang.Throwable -> Lba
            java.lang.Object r0 = r5.f13479q     // Catch: java.lang.Throwable -> Lba
            H2.g r0 = (H2.g) r0     // Catch: java.lang.Throwable -> Lba
            r0.a(r6, r7)     // Catch: java.lang.Throwable -> Lba
            d6.q r0 = r6.f13489q
            E.c0 r0 = r0.f12395q
            r0.j(r5)
        Ld8:
            int r4 = r4 + 1
            goto L63
        Ldb:
            d6.q r1 = r6.f13489q
            E.c0 r1 = r1.f12395q
            r1.j(r5)
            throw r0
        Le3:
            monitor-exit(r14)     // Catch: java.lang.Throwable -> La5
            throw r0
        Le5:
            return
        Le6:
            r0 = move-exception
            monitor-exit(r14)     // Catch: java.lang.Throwable -> Le6
            throw r0     // Catch: java.lang.Throwable -> L49
        Le9:
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E.c0.A():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011b A[Catch: NumberFormatException | JSONException -> 0x0123, NumberFormatException | JSONException -> 0x0123, TRY_LEAVE, TryCatch #0 {NumberFormatException | JSONException -> 0x0123, blocks: (B:10:0x0031, B:44:0x009d, B:44:0x009d, B:45:0x00ab, B:45:0x00ab, B:47:0x00b8, B:47:0x00b8, B:49:0x00ca, B:49:0x00ca, B:50:0x00d3, B:50:0x00d3, B:51:0x00d7, B:51:0x00d7, B:53:0x00e4, B:53:0x00e4, B:55:0x00f6, B:55:0x00f6, B:56:0x00ff, B:56:0x00ff, B:57:0x0103, B:57:0x0103, B:58:0x010f, B:58:0x010f, B:59:0x011b, B:59:0x011b), top: B:71:0x0031, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.os.Bundle B() {
        /*
            r15 = this;
            java.lang.Object r0 = r15.f1555t
            O3.h0 r0 = (O3.C0288h0) r0
            java.lang.Object r1 = r15.f1554s
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r1 == 0) goto Lc
            goto L14e
        Lc:
            java.lang.Object r1 = r15.f1552q
            java.lang.String r1 = (java.lang.String) r1
            android.content.SharedPreferences r2 = r0.s()
            java.lang.Object r0 = r0.f4346r
            O3.t0 r0 = (O3.C0323t0) r0
            r3 = 0
            java.lang.String r1 = r2.getString(r1, r3)
            if (r1 == 0) goto L142
            android.os.Bundle r2 = new android.os.Bundle     // Catch: org.json.JSONException -> L136
            r2.<init>()     // Catch: org.json.JSONException -> L136
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: org.json.JSONException -> L136
            r4.<init>(r1)     // Catch: org.json.JSONException -> L136
            r1 = 0
            r5 = r1
        L2b:
            int r6 = r4.length()     // Catch: org.json.JSONException -> L136
            if (r5 >= r6) goto L133
            org.json.JSONObject r6 = r4.getJSONObject(r5)     // Catch: java.lang.Throwable -> L123
            java.lang.String r7 = "n"
            java.lang.String r7 = r6.getString(r7)     // Catch: java.lang.Throwable -> L123
            java.lang.String r8 = "t"
            java.lang.String r8 = r6.getString(r8)     // Catch: java.lang.Throwable -> L123
            int r9 = r8.hashCode()     // Catch: java.lang.Throwable -> L123
            r10 = 100
            r11 = 2
            r12 = 3
            r13 = 4
            r14 = 1
            if (r9 == r10) goto L86
            r10 = 108(0x6c, float:1.51E-43)
            if (r9 == r10) goto L7c
            r10 = 115(0x73, float:1.61E-43)
            if (r9 == r10) goto L72
            r10 = 3352(0xd18, float:4.697E-42)
            if (r9 == r10) goto L68
            r10 = 3445(0xd75, float:4.827E-42)
            if (r9 == r10) goto L5e
            goto L90
        L5e:
            java.lang.String r9 = "la"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L90
            r9 = r13
            goto L91
        L68:
            java.lang.String r9 = "ia"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L90
            r9 = r12
            goto L91
        L72:
            java.lang.String r9 = "s"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L90
            r9 = r1
            goto L91
        L7c:
            java.lang.String r9 = "l"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L90
            r9 = r11
            goto L91
        L86:
            java.lang.String r9 = "d"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L90
            r9 = r14
            goto L91
        L90:
            r9 = -1
        L91:
            java.lang.String r10 = "v"
            if (r9 == 0) goto L11b
            if (r9 == r14) goto L10f
            if (r9 == r11) goto L103
            if (r9 == r12) goto Ld7
            if (r9 == r13) goto Lab
            O3.X r6 = r0.f5077v     // Catch: java.lang.Throwable -> L123 java.lang.Throwable -> L123
            O3.C0323t0.l(r6)     // Catch: java.lang.Throwable -> L123 java.lang.Throwable -> L123
            O3.V r6 = r6.f4670w     // Catch: java.lang.Throwable -> L123 java.lang.Throwable -> L123
            java.lang.String r7 = "Unrecognized persisted bundle type. Type"
            r6.c(r8, r7)     // Catch: java.lang.Throwable -> L123 java.lang.Throwable -> L123
            goto L12f
        Lab:
            com.google.android.gms.internal.measurement.Y3.a()     // Catch: java.lang.Throwable -> L123 java.lang.Throwable -> L123
            O3.g r8 = r0.f5075t     // Catch: java.lang.Throwable -> L123 java.lang.Throwable -> L123
            O3.E r9 = O3.F.f4394Q0     // Catch: java.lang.Throwable -> L123 java.lang.Throwable -> L123
            boolean r8 = r8.y(r3, r9)     // Catch: java.lang.Throwable -> L123 java.lang.Throwable -> L123
            if (r8 == 0) goto L12f
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L123 java.lang.Throwable -> L123
            java.lang.String r6 = r6.getString(r10)     // Catch: java.lang.Throwable -> L123 java.lang.Throwable -> L123
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L123 java.lang.Throwable -> L123
            int r6 = r8.length()     // Catch: java.lang.Throwable -> L123 java.lang.Throwable -> L123
            long[] r9 = new long[r6]     // Catch: java.lang.Throwable -> L123 java.lang.Throwable -> L123
            r10 = r1
        Lc8:
            if (r10 >= r6) goto Ld3
            long r11 = r8.optLong(r10)     // Catch: java.lang.Throwable -> L123 java.lang.Throwable -> L123
            r9[r10] = r11     // Catch: java.lang.Throwable -> L123 java.lang.Throwable -> L123
            int r10 = r10 + 1
            goto Lc8
        Ld3:
            r2.putLongArray(r7, r9)     // Catch: java.lang.Throwable -> L123 java.lang.Throwable -> L123
            goto L12f
        Ld7:
            com.google.android.gms.internal.measurement.Y3.a()     // Catch: java.lang.Throwable -> L123 java.lang.Throwable -> L123
            O3.g r8 = r0.f5075t     // Catch: java.lang.Throwable -> L123 java.lang.Throwable -> L123
            O3.E r9 = O3.F.f4394Q0     // Catch: java.lang.Throwable -> L123 java.lang.Throwable -> L123
            boolean r8 = r8.y(r3, r9)     // Catch: java.lang.Throwable -> L123 java.lang.Throwable -> L123
            if (r8 == 0) goto L12f
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L123 java.lang.Throwable -> L123
            java.lang.String r6 = r6.getString(r10)     // Catch: java.lang.Throwable -> L123 java.lang.Throwable -> L123
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L123 java.lang.Throwable -> L123
            int r6 = r8.length()     // Catch: java.lang.Throwable -> L123 java.lang.Throwable -> L123
            int[] r9 = new int[r6]     // Catch: java.lang.Throwable -> L123 java.lang.Throwable -> L123
            r10 = r1
        Lf4:
            if (r10 >= r6) goto Lff
            int r11 = r8.optInt(r10)     // Catch: java.lang.Throwable -> L123 java.lang.Throwable -> L123
            r9[r10] = r11     // Catch: java.lang.Throwable -> L123 java.lang.Throwable -> L123
            int r10 = r10 + 1
            goto Lf4
        Lff:
            r2.putIntArray(r7, r9)     // Catch: java.lang.Throwable -> L123 java.lang.Throwable -> L123
            goto L12f
        L103:
            java.lang.String r6 = r6.getString(r10)     // Catch: java.lang.Throwable -> L123 java.lang.Throwable -> L123
            long r8 = java.lang.Long.parseLong(r6)     // Catch: java.lang.Throwable -> L123 java.lang.Throwable -> L123
            r2.putLong(r7, r8)     // Catch: java.lang.Throwable -> L123 java.lang.Throwable -> L123
            goto L12f
        L10f:
            java.lang.String r6 = r6.getString(r10)     // Catch: java.lang.Throwable -> L123 java.lang.Throwable -> L123
            double r8 = java.lang.Double.parseDouble(r6)     // Catch: java.lang.Throwable -> L123 java.lang.Throwable -> L123
            r2.putDouble(r7, r8)     // Catch: java.lang.Throwable -> L123 java.lang.Throwable -> L123
            goto L12f
        L11b:
            java.lang.String r6 = r6.getString(r10)     // Catch: java.lang.Throwable -> L123 java.lang.Throwable -> L123
            r2.putString(r7, r6)     // Catch: java.lang.Throwable -> L123 java.lang.Throwable -> L123
            goto L12f
        L123:
            O3.X r6 = r0.f5077v     // Catch: org.json.JSONException -> L136
            O3.C0323t0.l(r6)     // Catch: org.json.JSONException -> L136
            O3.V r6 = r6.f4670w     // Catch: org.json.JSONException -> L136
            java.lang.String r7 = "Error reading value from SharedPreferences. Value dropped"
            r6.b(r7)     // Catch: org.json.JSONException -> L136
        L12f:
            int r5 = r5 + 1
            goto L2b
        L133:
            r15.f1554s = r2     // Catch: org.json.JSONException -> L136
            goto L142
        L136:
            O3.X r0 = r0.f5077v
            O3.C0323t0.l(r0)
            O3.V r0 = r0.f4670w
            java.lang.String r1 = "Error loading bundle from SharedPreferences. Values will be lost"
            r0.b(r1)
        L142:
            java.lang.Object r0 = r15.f1554s
            android.os.Bundle r0 = (android.os.Bundle) r0
            if (r0 != 0) goto L14e
            java.lang.Object r0 = r15.f1553r
            android.os.Bundle r0 = (android.os.Bundle) r0
            r15.f1554s = r0
        L14e:
            android.os.Bundle r0 = new android.os.Bundle
            java.lang.Object r1 = r15.f1554s
            android.os.Bundle r1 = (android.os.Bundle) r1
            x3.AbstractC1887A.g(r1)
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E.c0.B():android.os.Bundle");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC0833n C(c0 c0Var, F1... f1Arr) {
        InterfaceC0833n interfaceC0833nP = InterfaceC0833n.f10907d;
        for (F1 f12 : f1Arr) {
            interfaceC0833nP = K1.P(f12);
            I1.S0((c0) this.f1554s);
            if ((interfaceC0833nP instanceof C0838o) || (interfaceC0833nP instanceof C0828m)) {
                interfaceC0833nP = ((C0862t) this.f1552q).c(c0Var, interfaceC0833nP);
            }
        }
        return interfaceC0833nP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC0833n D(InterfaceC0833n interfaceC0833n) {
        return ((C0862t) this.f1553r).c(this, interfaceC0833n);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC0833n E(C0783d c0783d) {
        InterfaceC0833n interfaceC0833nC = InterfaceC0833n.f10907d;
        Iterator itO = c0783d.o();
        while (itO.hasNext()) {
            interfaceC0833nC = ((C0862t) this.f1553r).c(this, c0783d.q(((Integer) itO.next()).intValue()));
            if (interfaceC0833nC instanceof C0793f) {
                break;
            }
        }
        return interfaceC0833nC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void F(Bundle bundle) {
        String str = (String) this.f1552q;
        C0288h0 c0288h0 = (C0288h0) this.f1555t;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        SharedPreferences sharedPreferencesS = c0288h0.s();
        C0323t0 c0323t0 = (C0323t0) c0288h0.f4346r;
        SharedPreferences.Editor editorEdit = sharedPreferencesS.edit();
        if (bundle2.size() == 0) {
            editorEdit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        Y3.a();
                        if (c0323t0.f5075t.y(null, O3.F.f4394Q0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "d");
                            } else {
                                O3.X x6 = c0323t0.f5077v;
                                C0323t0.l(x6);
                                x6.f4670w.c(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                O3.X x7 = c0323t0.f5077v;
                                C0323t0.l(x7);
                                x7.f4670w.c(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e7) {
                        O3.X x8 = c0323t0.f5077v;
                        C0323t0.l(x8);
                        x8.f4670w.c(e7, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.f1554s = bundle2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c0 G() {
        return new c0(this, (C0862t) this.f1553r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean H(String str) {
        if (((HashMap) this.f1554s).containsKey(str)) {
            return true;
        }
        c0 c0Var = (c0) this.f1552q;
        if (c0Var != null) {
            return c0Var.H(str);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void I(String str, InterfaceC0833n interfaceC0833n) {
        c0 c0Var;
        HashMap map = (HashMap) this.f1554s;
        if (!map.containsKey(str) && (c0Var = (c0) this.f1552q) != null && c0Var.H(str)) {
            c0Var.I(str, interfaceC0833n);
        } else {
            if (((HashMap) this.f1555t).containsKey(str)) {
                return;
            }
            if (interfaceC0833n == null) {
                map.remove(str);
            } else {
                map.put(str, interfaceC0833n);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void J(String str, InterfaceC0833n interfaceC0833n) {
        HashMap map = (HashMap) this.f1554s;
        if (((HashMap) this.f1555t).containsKey(str)) {
            return;
        }
        if (interfaceC0833n == null) {
            map.remove(str);
        } else {
            map.put(str, interfaceC0833n);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC0833n K(String str) {
        HashMap map = (HashMap) this.f1554s;
        if (map.containsKey(str)) {
            return (InterfaceC0833n) map.get(str);
        }
        c0 c0Var = (c0) this.f1552q;
        if (c0Var != null) {
            return c0Var.K(str);
        }
        throw new IllegalArgumentException(C0.S.l(str, " is not defined"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.B0
    public long b(AbstractC1663q abstractC1663q, AbstractC1663q abstractC1663q2, AbstractC1663q abstractC1663q3) {
        int iB = abstractC1663q.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            jMax = Math.max(jMax, ((u.r) this.f1552q).get(i).d(abstractC1663q.a(i), abstractC1663q2.a(i), abstractC1663q3.a(i)));
        }
        return jMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c(AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q) {
        if (((ArrayList) this.f1552q).contains(abstractComponentCallbacksC0185q)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0185q);
        }
        synchronized (((ArrayList) this.f1552q)) {
            ((ArrayList) this.f1552q).add(abstractComponentCallbacksC0185q);
        }
        abstractComponentCallbacksC0185q.f2683A = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public I2.y d() {
        I2.g gVar;
        Context context = (Context) this.f1552q;
        U2.e eVar = (U2.e) this.f1553r;
        I2.k kVar = (I2.k) this.f1555t;
        kVar.getClass();
        U2.e eVar2 = new U2.e(eVar.f7642a, eVar.f7643b, eVar.f7644c, eVar.f7645d, eVar.f7646e, eVar.f, eVar.f7647g, eVar.f7648h, eVar.i, eVar.j, eVar.f7649k, eVar.f7650l, eVar.f7651m, new I2.m(AbstractC1397A.F(kVar.f2363a)));
        C1376o c1376oD = AbstractC1362a.d(new I2.d(1, this));
        C1376o c1376oD2 = AbstractC1362a.d(new I2.p(0));
        I2.g gVar2 = (I2.g) this.f1554s;
        if (gVar2 == null) {
            n5.s sVar = n5.s.f15299q;
            gVar = new I2.g(sVar, sVar, sVar, sVar, sVar);
        } else {
            gVar = gVar2;
        }
        return new I2.y(new I2.t(context, eVar2, c1376oD, c1376oD2, gVar));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((r.Q) this.f1553r).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                e(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractComponentCallbacksC0185q f(String str) {
        J1.N n7 = (J1.N) ((HashMap) this.f1553r).get(str);
        if (n7 != null) {
            return n7.f2578c;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.B0
    public AbstractC1663q g(long j, AbstractC1663q abstractC1663q, AbstractC1663q abstractC1663q2, AbstractC1663q abstractC1663q3) {
        if (((AbstractC1663q) this.f1553r) == null) {
            this.f1553r = abstractC1663q.c();
        }
        AbstractC1663q abstractC1663q4 = (AbstractC1663q) this.f1553r;
        if (abstractC1663q4 == null) {
            kotlin.jvm.internal.m.k("valueVector");
            throw null;
        }
        int iB = abstractC1663q4.b();
        for (int i = 0; i < iB; i++) {
            AbstractC1663q abstractC1663q5 = (AbstractC1663q) this.f1553r;
            if (abstractC1663q5 == null) {
                kotlin.jvm.internal.m.k("valueVector");
                throw null;
            }
            abstractC1663q5.e(i, ((u.r) this.f1552q).get(i).b(j, abstractC1663q.a(i), abstractC1663q2.a(i), abstractC1663q3.a(i)));
        }
        AbstractC1663q abstractC1663q6 = (AbstractC1663q) this.f1553r;
        if (abstractC1663q6 != null) {
            return abstractC1663q6;
        }
        kotlin.jvm.internal.m.k("valueVector");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractComponentCallbacksC0185q h(String str) {
        for (J1.N n7 : ((HashMap) this.f1553r).values()) {
            if (n7 != null) {
                AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185qH = n7.f2578c;
                if (!str.equals(abstractComponentCallbacksC0185qH.f2722u)) {
                    abstractComponentCallbacksC0185qH = abstractComponentCallbacksC0185qH.f2692J.f2527c.h(str);
                }
                if (abstractComponentCallbacksC0185qH != null) {
                    return abstractComponentCallbacksC0185qH;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void i(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        A();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void j(h6.e eVar) {
        eVar.f13480r.decrementAndGet();
        i((ArrayDeque) this.f1554s, eVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k.e k(AbstractC1168a abstractC1168a) {
        ArrayList arrayList = (ArrayList) this.f1554s;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            k.e eVar = (k.e) arrayList.get(i);
            if (eVar != null && eVar.f13926b == abstractC1168a) {
                return eVar;
            }
        }
        k.e eVar2 = new k.e((Context) this.f1553r, abstractC1168a);
        arrayList.add(eVar2);
        return eVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.B0
    public AbstractC1663q n(long j, AbstractC1663q abstractC1663q, AbstractC1663q abstractC1663q2, AbstractC1663q abstractC1663q3) {
        if (((AbstractC1663q) this.f1554s) == null) {
            this.f1554s = abstractC1663q3.c();
        }
        AbstractC1663q abstractC1663q4 = (AbstractC1663q) this.f1554s;
        if (abstractC1663q4 == null) {
            kotlin.jvm.internal.m.k("velocityVector");
            throw null;
        }
        int iB = abstractC1663q4.b();
        for (int i = 0; i < iB; i++) {
            AbstractC1663q abstractC1663q5 = (AbstractC1663q) this.f1554s;
            if (abstractC1663q5 == null) {
                kotlin.jvm.internal.m.k("velocityVector");
                throw null;
            }
            abstractC1663q5.e(i, ((u.r) this.f1552q).get(i).c(j, abstractC1663q.a(i), abstractC1663q2.a(i), abstractC1663q3.a(i)));
        }
        AbstractC1663q abstractC1663q6 = (AbstractC1663q) this.f1554s;
        if (abstractC1663q6 != null) {
            return abstractC1663q6;
        }
        kotlin.jvm.internal.m.k("velocityVector");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ArrayList o() {
        ArrayList arrayList = new ArrayList();
        for (J1.N n7 : ((HashMap) this.f1553r).values()) {
            if (n7 != null) {
                arrayList.add(n7);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // r1.InterfaceC1573a
    public void onCancel() {
        View view = (View) this.f1552q;
        view.clearAnimation();
        ((ViewGroup) this.f1553r).endViewTransition(view);
        ((C0174f) this.f1554s).d();
        if (J1.H.F(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((J1.T) this.f1555t) + " has been cancelled.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.B0
    public AbstractC1663q p(AbstractC1663q abstractC1663q, AbstractC1663q abstractC1663q2, AbstractC1663q abstractC1663q3) {
        if (((AbstractC1663q) this.f1555t) == null) {
            this.f1555t = abstractC1663q3.c();
        }
        AbstractC1663q abstractC1663q4 = (AbstractC1663q) this.f1555t;
        if (abstractC1663q4 == null) {
            kotlin.jvm.internal.m.k("endVelocityVector");
            throw null;
        }
        int iB = abstractC1663q4.b();
        for (int i = 0; i < iB; i++) {
            AbstractC1663q abstractC1663q5 = (AbstractC1663q) this.f1555t;
            if (abstractC1663q5 == null) {
                kotlin.jvm.internal.m.k("endVelocityVector");
                throw null;
            }
            abstractC1663q5.e(i, ((u.r) this.f1552q).get(i).e(abstractC1663q.a(i), abstractC1663q2.a(i), abstractC1663q3.a(i)));
        }
        AbstractC1663q abstractC1663q6 = (AbstractC1663q) this.f1555t;
        if (abstractC1663q6 != null) {
            return abstractC1663q6;
        }
        kotlin.jvm.internal.m.k("endVelocityVector");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ArrayList q() {
        ArrayList arrayList = new ArrayList();
        for (J1.N n7 : ((HashMap) this.f1553r).values()) {
            if (n7 != null) {
                arrayList.add(n7.f2578c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0120c r(Object obj) {
        C0120c c0120c = (C0120c) this.f1553r;
        if (this.f1555t == obj && c0120c != null) {
            return c0120c;
        }
        C1548G c1548g = (C1548G) this.f1554s;
        Object objG = c1548g.g(obj);
        if (objG == null) {
            C0120c c0120c2 = (C0120c) this.f1552q;
            C0120c c0120c3 = new C0120c();
            c0120c3.f1550a = c0120c2.f1550a;
            c0120c3.f1551b = c0120c2.f1551b;
            c1548g.l(obj, c0120c3);
            objG = c0120c3;
        }
        C0120c c0120c4 = (C0120c) objG;
        this.f1555t = obj;
        this.f1553r = c0120c4;
        return c0120c4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public List s() {
        ArrayList arrayList;
        if (((ArrayList) this.f1552q).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f1552q)) {
            arrayList = new ArrayList((ArrayList) this.f1552q);
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC1663q t(AbstractC1663q abstractC1663q, AbstractC1663q abstractC1663q2) {
        if (((AbstractC1663q) this.f1555t) == null) {
            this.f1555t = abstractC1663q.c();
        }
        AbstractC1663q abstractC1663q3 = (AbstractC1663q) this.f1555t;
        if (abstractC1663q3 == null) {
            kotlin.jvm.internal.m.k("targetVector");
            throw null;
        }
        int i = 0;
        for (int iB = abstractC1663q3.b(); i < iB; iB = iB) {
            AbstractC1663q abstractC1663q4 = (AbstractC1663q) this.f1555t;
            if (abstractC1663q4 == null) {
                kotlin.jvm.internal.m.k("targetVector");
                throw null;
            }
            C1136a c1136a = (C1136a) this.f1552q;
            float fA = abstractC1663q.a(i);
            float fA2 = abstractC1663q2.a(i);
            C1055e c1055e = (C1055e) c1136a.f13562r;
            double dB = c1055e.b(fA2);
            double d5 = AbstractC1599H.f16587a;
            float f = c1055e.f12640a * c1055e.f12641b;
            abstractC1663q4.e(i, (Math.signum(fA2) * ((float) (Math.exp((d5 / (d5 - 1.0d)) * dB) * ((double) f)))) + fA);
            i++;
        }
        AbstractC1663q abstractC1663q5 = (AbstractC1663q) this.f1555t;
        if (abstractC1663q5 != null) {
            return abstractC1663q5;
        }
        kotlin.jvm.internal.m.k("targetVector");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC1663q u(long j, AbstractC1663q abstractC1663q, AbstractC1663q abstractC1663q2) {
        if (((AbstractC1663q) this.f1554s) == null) {
            this.f1554s = abstractC1663q.c();
        }
        AbstractC1663q abstractC1663q3 = (AbstractC1663q) this.f1554s;
        if (abstractC1663q3 == null) {
            kotlin.jvm.internal.m.k("velocityVector");
            throw null;
        }
        int iB = abstractC1663q3.b();
        for (int i = 0; i < iB; i++) {
            AbstractC1663q abstractC1663q4 = (AbstractC1663q) this.f1554s;
            if (abstractC1663q4 == null) {
                kotlin.jvm.internal.m.k("velocityVector");
                throw null;
            }
            C1136a c1136a = (C1136a) this.f1552q;
            abstractC1663q.getClass();
            long j7 = j / 1000000;
            C1598G c1598gA = ((C1055e) c1136a.f13562r).a(abstractC1663q2.a(i));
            long j8 = c1598gA.f16586c;
            abstractC1663q4.e(i, (((Math.signum(c1598gA.f16584a) * AbstractC1603b.a(j8 > 0 ? j7 / j8 : 1.0f).f16594b) * c1598gA.f16585b) / j8) * 1000.0f);
        }
        AbstractC1663q abstractC1663q5 = (AbstractC1663q) this.f1554s;
        if (abstractC1663q5 != null) {
            return abstractC1663q5;
        }
        kotlin.jvm.internal.m.k("velocityVector");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public androidx.lifecycle.f0 v(String key, kotlin.jvm.internal.f fVar) {
        androidx.lifecycle.f0 viewModel;
        androidx.lifecycle.f0 f0VarA;
        kotlin.jvm.internal.m.e(key, "key");
        synchronized (((R1.b) this.f1555t)) {
            try {
                k0 k0Var = (k0) this.f1552q;
                k0Var.getClass();
                viewModel = (androidx.lifecycle.f0) k0Var.f9554a.get(key);
                if (fVar.d(viewModel)) {
                    h0 h0Var = (h0) this.f1553r;
                    if (h0Var instanceof androidx.lifecycle.a0) {
                        androidx.lifecycle.a0 a0Var = (androidx.lifecycle.a0) h0Var;
                        kotlin.jvm.internal.m.b(viewModel);
                        a0Var.getClass();
                        AbstractC0654q abstractC0654q = a0Var.f9523d;
                        if (abstractC0654q != null) {
                            Z.m mVar = a0Var.f9524e;
                            kotlin.jvm.internal.m.b(mVar);
                            androidx.lifecycle.X.a(viewModel, mVar, abstractC0654q);
                        }
                    }
                    kotlin.jvm.internal.m.c(viewModel, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
                } else {
                    P1.e eVar = new P1.e((P1.c) this.f1554s);
                    eVar.f5610a.put(j0.f9552b, key);
                    h0 factory = (h0) this.f1553r;
                    kotlin.jvm.internal.m.e(factory, "factory");
                    try {
                        try {
                            f0VarA = factory.b(fVar, eVar);
                        } catch (AbstractMethodError unused) {
                            f0VarA = factory.a(AbstractC0836n2.s(fVar));
                        }
                    } catch (AbstractMethodError unused2) {
                        f0VarA = factory.c(AbstractC0836n2.s(fVar), eVar);
                    }
                    viewModel = f0VarA;
                    k0 k0Var2 = (k0) this.f1552q;
                    k0Var2.getClass();
                    kotlin.jvm.internal.m.e(viewModel, "viewModel");
                    androidx.lifecycle.f0 f0Var = (androidx.lifecycle.f0) k0Var2.f9554a.put(key, viewModel);
                    if (f0Var != null) {
                        f0Var.a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return viewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void w(J1.N n7) {
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = n7.f2578c;
        String str = abstractComponentCallbacksC0185q.f2722u;
        HashMap map = (HashMap) this.f1553r;
        if (map.get(str) != null) {
            return;
        }
        map.put(abstractComponentCallbacksC0185q.f2722u, n7);
        if (J1.H.F(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0185q);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void x(J1.N n7) {
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = n7.f2578c;
        if (abstractComponentCallbacksC0185q.f2699Q) {
            ((J1.K) this.f1555t).e(abstractComponentCallbacksC0185q);
        }
        if (((J1.N) ((HashMap) this.f1553r).put(abstractComponentCallbacksC0185q.f2722u, null)) != null && J1.H.F(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0185q);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean y(AbstractC1168a abstractC1168a, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f1552q).onActionItemClicked(k(abstractC1168a), new MenuItemC1216s((Context) this.f1553r, (InterfaceMenuItemC1442a) menuItem));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean z(AbstractC1168a abstractC1168a, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f1552q;
        k.e eVarK = k(abstractC1168a);
        r.Q q7 = (r.Q) this.f1555t;
        Menu menuC1194A = (Menu) q7.get(menu);
        if (menuC1194A == null) {
            menuC1194A = new MenuC1194A((Context) this.f1553r, (MenuC1209l) menu);
            q7.put(menu, menuC1194A);
        }
        return callback.onCreateActionMode(eVarK, menuC1194A);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public c0(c0 c0Var, C0862t c0862t) {
        this.f1554s = new HashMap();
        this.f1555t = new HashMap();
        this.f1552q = c0Var;
        this.f1553r = c0862t;
    }

    public c0(C0288h0 c0288h0, String str) {
        this.f1555t = c0288h0;
        AbstractC1887A.d(str);
        this.f1552q = str;
        this.f1553r = new Bundle();
    }

    public c0(k0 store, h0 factory, P1.c defaultExtras) {
        kotlin.jvm.internal.m.e(store, "store");
        kotlin.jvm.internal.m.e(factory, "factory");
        kotlin.jvm.internal.m.e(defaultExtras, "defaultExtras");
        this.f1552q = store;
        this.f1553r = factory;
        this.f1554s = defaultExtras;
        this.f1555t = new R1.b();
    }

    public c0(Typeface typeface, F1.b bVar) {
        int i;
        int i7;
        int i8;
        int i9;
        this.f1555t = typeface;
        this.f1552q = bVar;
        this.f1554s = new E1.x(1024);
        int iA = bVar.a(6);
        if (iA != 0) {
            int i10 = iA + bVar.f1941q;
            i = ((ByteBuffer) bVar.f1944t).getInt(((ByteBuffer) bVar.f1944t).getInt(i10) + i10);
        } else {
            i = 0;
        }
        this.f1553r = new char[i * 2];
        int iA2 = bVar.a(6);
        if (iA2 != 0) {
            int i11 = iA2 + bVar.f1941q;
            i7 = ((ByteBuffer) bVar.f1944t).getInt(((ByteBuffer) bVar.f1944t).getInt(i11) + i11);
        } else {
            i7 = 0;
        }
        for (int i12 = 0; i12 < i7; i12++) {
            E1.A a7 = new E1.A(this, i12);
            F1.a aVarB = a7.b();
            int iA3 = aVarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) aVarB.f1944t).getInt(iA3 + aVarB.f1941q) : 0, (char[]) this.f1553r, i12 * 2);
            F1.a aVarB2 = a7.b();
            int iA4 = aVarB2.a(16);
            if (iA4 != 0) {
                int i13 = iA4 + aVarB2.f1941q;
                i8 = ((ByteBuffer) aVarB2.f1944t).getInt(((ByteBuffer) aVarB2.f1944t).getInt(i13) + i13);
            } else {
                i8 = 0;
            }
            E3.h.m(i8 > 0, "invalid metadata codepoint length");
            E1.x xVar = (E1.x) this.f1554s;
            F1.a aVarB3 = a7.b();
            int iA5 = aVarB3.a(16);
            if (iA5 != 0) {
                int i14 = iA5 + aVarB3.f1941q;
                i9 = ((ByteBuffer) aVarB3.f1944t).getInt(((ByteBuffer) aVarB3.f1944t).getInt(i14) + i14);
            } else {
                i9 = 0;
            }
            xVar.a(a7, 0, i9 - 1);
        }
    }

    public c0(int i) {
        Object obj = null;
        switch (i) {
            case 4:
                this.f1552q = new ArrayList();
                this.f1553r = new HashMap();
                this.f1554s = new HashMap();
                break;
            case 7:
                C0862t c0862t = new C0862t(0);
                this.f1552q = c0862t;
                c0 c0Var = new c0((c0) null, c0862t);
                this.f1554s = c0Var;
                this.f1553r = c0Var.G();
                F2 f22 = new F2(1);
                this.f1555t = f22;
                c0Var.I("require", new A4(f22));
                ((HashMap) f22.f10630q).put("internal.platform", CallableC0809i0.f10873a);
                c0Var.I("runtime.counter", new C0798g(Double.valueOf(0.0d)));
                break;
            case 10:
                this.f1553r = new ArrayDeque();
                this.f1554s = new ArrayDeque();
                this.f1555t = new ArrayDeque();
                break;
            case 11:
                this.f1552q = new b1.d(10);
                this.f1553r = new r.Q(0);
                this.f1554s = new ArrayList();
                this.f1555t = new HashSet();
                break;
            case 14:
                this.f1552q = new C1554e(0);
                this.f1553r = new SparseArray();
                this.f1554s = new C1566q(obj);
                this.f1555t = new C1554e(0);
                break;
            default:
                this.f1552q = new C0120c();
                long[] jArr = r.O.f16162a;
                this.f1554s = new C1548G();
                break;
        }
    }

    public c0(InterfaceC1622A interfaceC1622A) {
        this(new C1134a(9, interfaceC1622A));
    }
}
