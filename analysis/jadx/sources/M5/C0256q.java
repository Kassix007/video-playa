package M5;

import P.C0345b;
import P.C0371o;
import c0.C0722j;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.wnapp.smspariaz.R;
import java.io.IOException;
import m5.C1386y;
import org.xmlpull.v1.XmlPullParserException;
import q5.C1523b;
import q5.C1525d;
import q5.C1530i;
import q5.InterfaceC1526e;
import q5.InterfaceC1527f;
import q5.InterfaceC1529h;
import z0.C1949i;

/* JADX INFO: renamed from: M5.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0256q implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f3880q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [Q2.g.i(int, P.o):void] */
    public /* synthetic */ C0256q(int i) {
        this.f3880q = 12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) throws XmlPullParserException, IOException {
        C1523b c1523b;
        switch (this.f3880q) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 1:
                return ((InterfaceC1529h) obj).plus((InterfaceC1527f) obj2);
            case 2:
                return ((InterfaceC1529h) obj).plus((InterfaceC1527f) obj2);
            case 3:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 4:
                InterfaceC1527f interfaceC1527f = (InterfaceC1527f) obj2;
                if (!(interfaceC1527f instanceof r0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? interfaceC1527f : Integer.valueOf(iIntValue + 1);
            case 5:
                r0 r0Var = (r0) obj;
                InterfaceC1527f interfaceC1527f2 = (InterfaceC1527f) obj2;
                if (r0Var != null) {
                    return r0Var;
                }
                if (interfaceC1527f2 instanceof r0) {
                    return (r0) interfaceC1527f2;
                }
                return null;
            case 6:
                return (R5.w) obj;
            case 7:
                return ((T1.u) obj2).e();
            case 8:
                C0371o c0371o = (C0371o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c0371o.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    D5.a.c(AbstractC0836n2.F(R.drawable.camera_icon, c0371o, 6), "Camera Button", androidx.compose.foundation.layout.c.f9279c, null, C1949i.f18697d, 0.0f, null, c0371o, 25008, 104);
                } else {
                    c0371o.N();
                }
                return C1386y.f15098a;
            case 9:
                C0371o c0371o2 = (C0371o) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c0371o2.K(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    D5.a.c(AbstractC0836n2.F(R.drawable.baseline_videocam_24, c0371o2, 6), "Video Cam Button", androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.c.f9279c, 5), null, C1949i.f18697d, 0.0f, null, c0371o2, 25008, 104);
                } else {
                    c0371o2.N();
                }
                return C1386y.f15098a;
            case 10:
                C0371o c0371o3 = (C0371o) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c0371o3.K(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    D5.a.c(AbstractC0836n2.F(R.drawable.baseline_audiorecorder, c0371o3, 6), "Video Cam Button", androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.c.f9279c, 5), null, C1949i.f18697d, 0.0f, null, c0371o3, 25008, 104);
                } else {
                    c0371o3.N();
                }
                return C1386y.f15098a;
            case 11:
                C0371o c0371o4 = (C0371o) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c0371o4.K(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    D5.a.c(AbstractC0836n2.F(R.drawable.files_icon, c0371o4, 6), "Files Button", androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.c.c(C0722j.f10095q, 60), 5), null, C1949i.f18697d, 0.0f, null, c0371o4, 25008, 104);
                } else {
                    c0371o4.N();
                }
                return C1386y.f15098a;
            case 12:
                ((Integer) obj2).getClass();
                Q2.g.i(C0345b.w(1), (C0371o) obj);
                return C1386y.f15098a;
            case 13:
                String acc = (String) obj;
                InterfaceC1527f element = (InterfaceC1527f) obj2;
                kotlin.jvm.internal.m.e(acc, "acc");
                kotlin.jvm.internal.m.e(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            default:
                InterfaceC1529h acc2 = (InterfaceC1529h) obj;
                InterfaceC1527f element2 = (InterfaceC1527f) obj2;
                kotlin.jvm.internal.m.e(acc2, "acc");
                kotlin.jvm.internal.m.e(element2, "element");
                InterfaceC1529h interfaceC1529hMinusKey = acc2.minusKey(element2.getKey());
                C1530i c1530i = C1530i.f16022q;
                if (interfaceC1529hMinusKey == c1530i) {
                    return element2;
                }
                C1525d c1525d = C1525d.f16021q;
                InterfaceC1526e interfaceC1526e = (InterfaceC1526e) interfaceC1529hMinusKey.get(c1525d);
                if (interfaceC1526e == null) {
                    c1523b = new C1523b(element2, interfaceC1529hMinusKey);
                } else {
                    InterfaceC1529h interfaceC1529hMinusKey2 = interfaceC1529hMinusKey.minusKey(c1525d);
                    if (interfaceC1529hMinusKey2 == c1530i) {
                        return new C1523b(interfaceC1526e, element2);
                    }
                    c1523b = new C1523b(interfaceC1526e, new C1523b(element2, interfaceC1529hMinusKey2));
                }
                return c1523b;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [E3.h.L(q5.f, q5.h):q5.h, M5.y.B(q5.h, B5.e, q5.c):java.lang.Object, M5.y.j(q5.h, q5.h, boolean):q5.h, Q5.i.collect(P5.i, q5.c):java.lang.Object, Q5.y.<init>(P5.i, q5.h):void, R5.b.<clinit>():void, n5.A.e(R4.k1, P.o, int):void] */
    public /* synthetic */ C0256q(int i, byte b7) {
        this.f3880q = i;
    }
}
