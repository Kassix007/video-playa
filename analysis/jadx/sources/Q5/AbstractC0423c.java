package Q5;

import M5.AbstractC0257s;
import P5.InterfaceC0397h;
import n5.AbstractC1397A;
import q5.C1530i;
import q5.InterfaceC1524c;
import q5.InterfaceC1529h;
import r5.EnumC1580a;

/* JADX INFO: renamed from: Q5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0423c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC1524c[] f6603a = new InterfaceC1524c[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E4.f f6604b = new E4.f("NULL", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final E4.f f6605c = new E4.f("UNINITIALIZED", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ InterfaceC0397h a(v vVar, AbstractC0257s abstractC0257s, int i, O5.a aVar, int i7) {
        InterfaceC1529h interfaceC1529h = abstractC0257s;
        if ((i7 & 1) != 0) {
            interfaceC1529h = C1530i.f16022q;
        }
        if ((i7 & 2) != 0) {
            i = -3;
        }
        if ((i7 & 4) != 0) {
            aVar = O5.a.f5206q;
        }
        return vVar.a(interfaceC1529h, i, aVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object b(InterfaceC1529h interfaceC1529h, Object obj, Object obj2, B5.e eVar, InterfaceC1524c frame) {
        Object objInvoke;
        Object objN = R5.b.n(interfaceC1529h, obj2);
        try {
            C c7 = new C(frame, interfaceC1529h);
            if (eVar == null) {
                objInvoke = AbstractC1397A.G(eVar, obj, c7);
            } else {
                kotlin.jvm.internal.B.b(2, eVar);
                objInvoke = eVar.invoke(obj, c7);
            }
            R5.b.g(interfaceC1529h, objN);
            if (objInvoke == EnumC1580a.f16356q) {
                kotlin.jvm.internal.m.e(frame, "frame");
            }
            return objInvoke;
        } catch (Throwable th) {
            R5.b.g(interfaceC1529h, objN);
            throw th;
        }
    }
}
