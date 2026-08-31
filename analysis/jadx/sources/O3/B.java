package O3;

import android.graphics.Path;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.EnumC0653p;
import androidx.recyclerview.widget.RecyclerView;
import b2.InterfaceC0692c;
import com.google.android.gms.internal.measurement.C0772a4;
import com.google.android.gms.internal.measurement.C0827l3;
import com.google.android.gms.internal.measurement.C0837n3;
import com.google.android.gms.internal.measurement.C0881w3;
import com.google.android.gms.internal.measurement.C3;
import com.google.android.gms.internal.measurement.O3;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.j4;
import com.google.android.gms.internal.measurement.m4;
import j2.C1156b;
import j2.InterfaceC1157c;
import j2.InterfaceC1158d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;
import k2.C1183g;
import q6.C1538g;
import q6.C1541j;
import w1.AbstractC1835K;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B implements InterfaceC0331w, P1.b, InterfaceC0692c, l4.p, InterfaceC1157c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f4321q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ B f4312r = new B(0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ B f4313s = new B(1);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ B f4314t = new B(2);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ B f4315u = new B(3);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ B f4316v = new B(4);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ B f4317w = new B(5);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ B f4318x = new B(6);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ B f4319y = new B(7);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ B f4320z = new B(8);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ B f4310A = new B(9);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ B f4311B = new B(10);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [O3.B.<clinit>():void, Q2.g.y(s1.h[], int):s1.h, androidx.lifecycle.X.<clinit>():void, androidx.lifecycle.g0.<clinit>():void, androidx.lifecycle.j0.<clinit>():void, androidx.work.impl.WorkDatabase.Companion.create(android.content.Context, java.util.concurrent.Executor, androidx.work.Clock, boolean):androidx.work.impl.WorkDatabase, c6.a.<clinit>():void, e1.n.b(b1.c, int):int, i2.a.<init>(g2.e, I2.d):void, p0.e.<clinit>():void, q2.n.<clinit>():void] */
    public /* synthetic */ B(int i) {
        this.f4321q = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float c(float f, float[] fArr, float[] fArr2) {
        float f7;
        float f8;
        float f9;
        float f10;
        float fAbs = Math.abs(f);
        float fSignum = Math.signum(f);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        int i7 = i - 1;
        if (i7 >= fArr.length - 1) {
            float f11 = fArr[fArr.length - 1];
            float f12 = fArr2[fArr.length - 1];
            if (f11 == 0.0f) {
                return 0.0f;
            }
            return (f12 / f11) * f;
        }
        if (i7 == -1) {
            float f13 = fArr[0];
            f9 = fArr2[0];
            f10 = f13;
            f8 = 0.0f;
            f7 = 0.0f;
        } else {
            float f14 = fArr[i7];
            float f15 = fArr[i];
            f7 = fArr2[i7];
            f8 = f14;
            f9 = fArr2[i];
            f10 = f15;
        }
        return (((f9 - f7) * Math.max(0.0f, Math.min(1.0f, f8 == f10 ? 0.0f : (fAbs - f8) / (f10 - f8)))) + f7) * fSignum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ArrayList d(List protocols) {
        kotlin.jvm.internal.m.e(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((d6.r) obj) != d6.r.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(n5.m.c0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((d6.r) obj2).f12412q);
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] e(List protocols) {
        kotlin.jvm.internal.m.e(protocols, "protocols");
        C1538g c1538g = new C1538g();
        ArrayList arrayListD = d(protocols);
        int size = arrayListD.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListD.get(i);
            i++;
            String str = (String) obj;
            c1538g.e0(str.length());
            c1538g.i0(str);
        }
        return c1538g.z(c1538g.f16063r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static T1.d f(C3.b bVar, T1.p destination, Bundle bundle, EnumC0653p hostLifecycleState, T1.i iVar) {
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        kotlin.jvm.internal.m.e(destination, "destination");
        kotlin.jvm.internal.m.e(hostLifecycleState, "hostLifecycleState");
        return new T1.d(bVar, destination, bundle, hostLifecycleState, iVar, string, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1541j g(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i7 = i * 2;
            bArr[i] = (byte) (r6.b.a(str.charAt(i7 + 1)) + (r6.b.a(str.charAt(i7)) << 4));
        }
        return new C1541j(bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1541j h(String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        byte[] bytes = str.getBytes(J5.a.f2809a);
        kotlin.jvm.internal.m.d(bytes, "getBytes(...)");
        C1541j c1541j = new C1541j(bytes);
        c1541j.f16067s = str;
        return c1541j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Path i(float f, float f7, float f8, float f9) {
        Path path = new Path();
        path.moveTo(f, f7);
        path.lineTo(f8, f9);
        return path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean l() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l4.p
    public w1.o0 a(View view, w1.o0 o0Var, l4.q qVar) {
        qVar.f14585d = o0Var.a() + qVar.f14585d;
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        boolean z5 = view.getLayoutDirection() == 1;
        int iB = o0Var.b();
        int iC = o0Var.c();
        int i = qVar.f14582a + (z5 ? iC : iB);
        qVar.f14582a = i;
        int i7 = qVar.f14584c;
        if (!z5) {
            iB = iC;
        }
        int i8 = i7 + iB;
        qVar.f14584c = i8;
        view.setPaddingRelative(i, qVar.f14583b, i8, qVar.f14585d);
        return o0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j2.InterfaceC1157c
    public InterfaceC1158d b(C1156b c1156b) {
        return new C1183g(c1156b.f13738a, c1156b.f13739b, c1156b.f13740c, c1156b.f13741d, c1156b.f13742e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.InterfaceC0331w
    public Object zza() {
        switch (this.f4321q) {
            case 0:
                List list = F.f4412a;
                Boolean bool = (Boolean) C3.f10613a.b();
                bool.getClass();
                return bool;
            case 1:
                List list2 = F.f4412a;
                Boolean bool2 = (Boolean) j4.f10880a.b();
                bool2.getClass();
                return bool2;
            case 2:
                List list3 = F.f4412a;
                Y3.f10777r.get();
                Boolean bool3 = (Boolean) C0772a4.f.b();
                bool3.getClass();
                return bool3;
            case 3:
                List list4 = F.f4412a;
                Y3.f10777r.get();
                Boolean bool4 = (Boolean) C0772a4.f10791a.b();
                bool4.getClass();
                return bool4;
            case 4:
                List list5 = F.f4412a;
                Y3.f10777r.get();
                Boolean bool5 = (Boolean) C0772a4.f10796g.b();
                bool5.getClass();
                return bool5;
            case 5:
                List list6 = F.f4412a;
                Y3.f10777r.get();
                Boolean bool6 = (Boolean) C0772a4.f10795e.b();
                bool6.getClass();
                return bool6;
            case 6:
                List list7 = F.f4412a;
                Boolean bool7 = (Boolean) C0881w3.f11118a.b();
                bool7.getClass();
                return bool7;
            case 7:
                List list8 = F.f4412a;
                Y3.f10777r.get();
                Boolean bool8 = (Boolean) C0772a4.f10794d.b();
                bool8.getClass();
                return bool8;
            case 8:
                List list9 = F.f4412a;
                C0827l3.f10898r.get();
                return Integer.valueOf((int) ((Long) C0837n3.f10973n0.b()).longValue());
            case 9:
                return new Boolean(((Boolean) O3.f10682a.b()).booleanValue());
            default:
                return new Boolean(((Boolean) m4.f10906a.b()).booleanValue());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public B(RecyclerView recyclerView) {
        this.f4321q = 20;
    }

    @Override // b2.InterfaceC0692c
    public void j() {
    }

    @Override // b2.InterfaceC0692c
    public void k(int i, Object obj) {
    }
}
