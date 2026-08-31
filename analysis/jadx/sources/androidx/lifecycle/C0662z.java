package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import n.C1388a;
import o.C1405a;
import o.C1407c;

/* JADX INFO: renamed from: androidx.lifecycle.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0662z extends AbstractC0654q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9570b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1405a f9571c = new C1405a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EnumC0653p f9572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f9573e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9574g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9575h;
    public final ArrayList i;
    public final P5.S j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0662z(InterfaceC0660x interfaceC0660x) {
        EnumC0653p enumC0653p = EnumC0653p.f9557r;
        this.f9572d = enumC0653p;
        this.i = new ArrayList();
        this.f9573e = new WeakReference(interfaceC0660x);
        this.j = P5.H.b(enumC0653p);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.AbstractC0654q
    public final void a(InterfaceC0659w observer) {
        InterfaceC0658v c0645h;
        Object obj;
        InterfaceC0660x interfaceC0660x;
        kotlin.jvm.internal.m.e(observer, "observer");
        e("addObserver");
        EnumC0653p enumC0653p = this.f9572d;
        EnumC0653p enumC0653p2 = EnumC0653p.f9556q;
        if (enumC0653p != enumC0653p2) {
            enumC0653p2 = EnumC0653p.f9557r;
        }
        C0661y c0661y = new C0661y();
        HashMap map = B.f9475a;
        boolean z5 = observer instanceof InterfaceC0658v;
        boolean z6 = observer instanceof InterfaceC0643f;
        if (z5 && z6) {
            c0645h = new C0645h((InterfaceC0643f) observer, (InterfaceC0658v) observer);
        } else if (z6) {
            c0645h = new C0645h((InterfaceC0643f) observer, (InterfaceC0658v) null);
        } else if (z5) {
            c0645h = (InterfaceC0658v) observer;
        } else {
            Class<?> cls = observer.getClass();
            if (B.b(cls) == 2) {
                Object obj2 = B.f9476b.get(cls);
                kotlin.jvm.internal.m.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    B.a((Constructor) list.get(0), observer);
                    throw null;
                }
                int size = list.size();
                InterfaceC0647j[] interfaceC0647jArr = new InterfaceC0647j[size];
                if (size > 0) {
                    B.a((Constructor) list.get(0), observer);
                    throw null;
                }
                c0645h = new C0642e(i, interfaceC0647jArr);
            } else {
                c0645h = new C0645h(observer);
            }
        }
        c0661y.f9569b = c0645h;
        c0661y.f9568a = enumC0653p2;
        C1405a c1405a = this.f9571c;
        C1407c c1407cD = c1405a.d(observer);
        if (c1407cD != null) {
            obj = c1407cD.f15311r;
        } else {
            HashMap map2 = c1405a.f15306u;
            C1407c c1407c = new C1407c(observer, c0661y);
            c1405a.f15320t++;
            C1407c c1407c2 = c1405a.f15318r;
            if (c1407c2 == null) {
                c1405a.f15317q = c1407c;
                c1405a.f15318r = c1407c;
            } else {
                c1407c2.f15312s = c1407c;
                c1407c.f15313t = c1407c2;
                c1405a.f15318r = c1407c;
            }
            map2.put(observer, c1407c);
            obj = null;
        }
        if (((C0661y) obj) == null && (interfaceC0660x = (InterfaceC0660x) this.f9573e.get()) != null) {
            i = (this.f != 0 || this.f9574g) ? 1 : 0;
            EnumC0653p enumC0653pD = d(observer);
            this.f++;
            while (c0661y.f9568a.compareTo(enumC0653pD) < 0 && this.f9571c.f15306u.containsKey(observer)) {
                EnumC0653p enumC0653p3 = c0661y.f9568a;
                ArrayList arrayList = this.i;
                arrayList.add(enumC0653p3);
                C0650m c0650m = EnumC0652o.Companion;
                EnumC0653p state = c0661y.f9568a;
                c0650m.getClass();
                kotlin.jvm.internal.m.e(state, "state");
                int iOrdinal = state.ordinal();
                EnumC0652o enumC0652o = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : EnumC0652o.ON_RESUME : EnumC0652o.ON_START : EnumC0652o.ON_CREATE;
                if (enumC0652o == null) {
                    throw new IllegalStateException("no event up from " + c0661y.f9568a);
                }
                c0661y.a(interfaceC0660x, enumC0652o);
                arrayList.remove(arrayList.size() - 1);
                enumC0653pD = d(observer);
            }
            if (i == 0) {
                i();
            }
            this.f--;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.AbstractC0654q
    public final EnumC0653p b() {
        return this.f9572d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.AbstractC0654q
    public final void c(InterfaceC0659w observer) {
        kotlin.jvm.internal.m.e(observer, "observer");
        e("removeObserver");
        this.f9571c.g(observer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final EnumC0653p d(InterfaceC0659w interfaceC0659w) {
        HashMap map = this.f9571c.f15306u;
        C1407c c1407c = map.containsKey(interfaceC0659w) ? ((C1407c) map.get(interfaceC0659w)).f15313t : null;
        EnumC0653p enumC0653p = c1407c != null ? ((C0661y) c1407c.f15311r).f9568a : null;
        ArrayList arrayList = this.i;
        EnumC0653p enumC0653p2 = arrayList.isEmpty() ? null : (EnumC0653p) arrayList.get(arrayList.size() - 1);
        EnumC0653p state1 = this.f9572d;
        kotlin.jvm.internal.m.e(state1, "state1");
        if (enumC0653p == null || enumC0653p.compareTo(state1) >= 0) {
            enumC0653p = state1;
        }
        return (enumC0653p2 == null || enumC0653p2.compareTo(enumC0653p) >= 0) ? enumC0653p : enumC0653p2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(String str) {
        if (this.f9570b) {
            C1388a.Q().f15119d.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(C0.S.n("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(EnumC0652o event) {
        kotlin.jvm.internal.m.e(event, "event");
        e("handleLifecycleEvent");
        g(event.a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(EnumC0653p next) {
        if (this.f9572d == next) {
            return;
        }
        InterfaceC0660x interfaceC0660x = (InterfaceC0660x) this.f9573e.get();
        EnumC0653p current = this.f9572d;
        kotlin.jvm.internal.m.e(current, "current");
        kotlin.jvm.internal.m.e(next, "next");
        EnumC0653p enumC0653p = EnumC0653p.f9557r;
        EnumC0653p enumC0653p2 = EnumC0653p.f9556q;
        if (current == enumC0653p && next == enumC0653p2) {
            throw new IllegalStateException(("State must be at least '" + EnumC0653p.f9558s + "' to be moved to '" + next + "' in component " + interfaceC0660x).toString());
        }
        if (current == enumC0653p2 && current != next) {
            throw new IllegalStateException(("State is '" + enumC0653p2 + "' and cannot be moved to `" + next + "` in component " + interfaceC0660x).toString());
        }
        this.f9572d = next;
        if (this.f9574g || this.f != 0) {
            this.f9575h = true;
            return;
        }
        this.f9574g = true;
        i();
        this.f9574g = false;
        if (this.f9572d == enumC0653p2) {
            this.f9571c = new C1405a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(EnumC0653p state) {
        kotlin.jvm.internal.m.e(state, "state");
        e("setCurrentState");
        g(state);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r12.f9575h = false;
        r12.j.g(r12.f9572d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            r12 = this;
            java.lang.ref.WeakReference r0 = r12.f9573e
            java.lang.Object r0 = r0.get()
            androidx.lifecycle.x r0 = (androidx.lifecycle.InterfaceC0660x) r0
            if (r0 == 0) goto L197
        La:
            o.a r1 = r12.f9571c
            int r2 = r1.f15320t
            r3 = 0
            if (r2 != 0) goto L12
            goto L30
        L12:
            o.c r1 = r1.f15317q
            kotlin.jvm.internal.m.b(r1)
            java.lang.Object r1 = r1.f15311r
            androidx.lifecycle.y r1 = (androidx.lifecycle.C0661y) r1
            androidx.lifecycle.p r1 = r1.f9568a
            o.a r2 = r12.f9571c
            o.c r2 = r2.f15318r
            kotlin.jvm.internal.m.b(r2)
            java.lang.Object r2 = r2.f15311r
            androidx.lifecycle.y r2 = (androidx.lifecycle.C0661y) r2
            androidx.lifecycle.p r2 = r2.f9568a
            if (r1 != r2) goto L3a
            androidx.lifecycle.p r1 = r12.f9572d
            if (r1 != r2) goto L3a
        L30:
            r12.f9575h = r3
            P5.S r0 = r12.j
            androidx.lifecycle.p r1 = r12.f9572d
            r0.g(r1)
            return
        L3a:
            r12.f9575h = r3
            androidx.lifecycle.p r1 = r12.f9572d
            o.a r2 = r12.f9571c
            o.c r2 = r2.f15317q
            kotlin.jvm.internal.m.b(r2)
            java.lang.Object r2 = r2.f15311r
            androidx.lifecycle.y r2 = (androidx.lifecycle.C0661y) r2
            androidx.lifecycle.p r2 = r2.f9568a
            int r1 = r1.compareTo(r2)
            r2 = 0
            r3 = 3
            r4 = 2
            java.lang.String r5 = "state"
            r6 = 1
            if (r1 >= 0) goto Lef
            o.a r1 = r12.f9571c
            o.b r7 = new o.b
            o.c r8 = r1.f15318r
            o.c r9 = r1.f15317q
            r10 = 1
            r7.<init>(r8, r9, r10)
            java.util.WeakHashMap r1 = r1.f15319s
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r1.put(r7, r8)
        L6a:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto Lef
            boolean r1 = r12.f9575h
            if (r1 != 0) goto Lef
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            kotlin.jvm.internal.m.b(r1)
            java.lang.Object r8 = r1.getKey()
            androidx.lifecycle.w r8 = (androidx.lifecycle.InterfaceC0659w) r8
            java.lang.Object r1 = r1.getValue()
            androidx.lifecycle.y r1 = (androidx.lifecycle.C0661y) r1
        L89:
            androidx.lifecycle.p r9 = r1.f9568a
            androidx.lifecycle.p r10 = r12.f9572d
            int r9 = r9.compareTo(r10)
            if (r9 <= 0) goto L6a
            boolean r9 = r12.f9575h
            if (r9 != 0) goto L6a
            o.a r9 = r12.f9571c
            java.util.HashMap r9 = r9.f15306u
            boolean r9 = r9.containsKey(r8)
            if (r9 == 0) goto L6a
            androidx.lifecycle.m r9 = androidx.lifecycle.EnumC0652o.Companion
            androidx.lifecycle.p r10 = r1.f9568a
            r9.getClass()
            kotlin.jvm.internal.m.e(r10, r5)
            int r9 = r10.ordinal()
            if (r9 == r4) goto Lbe
            if (r9 == r3) goto Lbb
            r10 = 4
            if (r9 == r10) goto Lb8
            r9 = r2
            goto Lc0
        Lb8:
            androidx.lifecycle.o r9 = androidx.lifecycle.EnumC0652o.ON_PAUSE
            goto Lc0
        Lbb:
            androidx.lifecycle.o r9 = androidx.lifecycle.EnumC0652o.ON_STOP
            goto Lc0
        Lbe:
            androidx.lifecycle.o r9 = androidx.lifecycle.EnumC0652o.ON_DESTROY
        Lc0:
            if (r9 == 0) goto Ld9
            androidx.lifecycle.p r10 = r9.a()
            java.util.ArrayList r11 = r12.i
            r11.add(r10)
            r1.a(r0, r9)
            java.util.ArrayList r9 = r12.i
            int r10 = r9.size()
            int r10 = r10 - r6
            r9.remove(r10)
            goto L89
        Ld9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "no event down from "
            r2.<init>(r3)
            androidx.lifecycle.p r1 = r1.f9568a
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        Lef:
            o.a r1 = r12.f9571c
            o.c r1 = r1.f15318r
            boolean r7 = r12.f9575h
            if (r7 != 0) goto La
            if (r1 == 0) goto La
            androidx.lifecycle.p r7 = r12.f9572d
            java.lang.Object r1 = r1.f15311r
            androidx.lifecycle.y r1 = (androidx.lifecycle.C0661y) r1
            androidx.lifecycle.p r1 = r1.f9568a
            int r1 = r7.compareTo(r1)
            if (r1 <= 0) goto La
            o.a r1 = r12.f9571c
            r1.getClass()
            o.d r7 = new o.d
            r7.<init>(r1)
            java.util.WeakHashMap r1 = r1.f15319s
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r1.put(r7, r8)
        L118:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto La
            boolean r1 = r12.f9575h
            if (r1 != 0) goto La
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r8 = r1.getKey()
            androidx.lifecycle.w r8 = (androidx.lifecycle.InterfaceC0659w) r8
            java.lang.Object r1 = r1.getValue()
            androidx.lifecycle.y r1 = (androidx.lifecycle.C0661y) r1
        L134:
            androidx.lifecycle.p r9 = r1.f9568a
            androidx.lifecycle.p r10 = r12.f9572d
            int r9 = r9.compareTo(r10)
            if (r9 >= 0) goto L118
            boolean r9 = r12.f9575h
            if (r9 != 0) goto L118
            o.a r9 = r12.f9571c
            java.util.HashMap r9 = r9.f15306u
            boolean r9 = r9.containsKey(r8)
            if (r9 == 0) goto L118
            androidx.lifecycle.p r9 = r1.f9568a
            java.util.ArrayList r10 = r12.i
            r10.add(r9)
            androidx.lifecycle.m r9 = androidx.lifecycle.EnumC0652o.Companion
            androidx.lifecycle.p r10 = r1.f9568a
            r9.getClass()
            kotlin.jvm.internal.m.e(r10, r5)
            int r9 = r10.ordinal()
            if (r9 == r6) goto L16f
            if (r9 == r4) goto L16c
            if (r9 == r3) goto L169
            r9 = r2
            goto L171
        L169:
            androidx.lifecycle.o r9 = androidx.lifecycle.EnumC0652o.ON_RESUME
            goto L171
        L16c:
            androidx.lifecycle.o r9 = androidx.lifecycle.EnumC0652o.ON_START
            goto L171
        L16f:
            androidx.lifecycle.o r9 = androidx.lifecycle.EnumC0652o.ON_CREATE
        L171:
            if (r9 == 0) goto L181
            r1.a(r0, r9)
            java.util.ArrayList r9 = r12.i
            int r10 = r9.size()
            int r10 = r10 - r6
            r9.remove(r10)
            goto L134
        L181:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "no event up from "
            r2.<init>(r3)
            androidx.lifecycle.p r1 = r1.f9568a
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L197:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0662z.i():void");
    }
}
