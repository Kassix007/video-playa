package a2;

import M5.AbstractC0263y;
import M5.C0247h;
import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import kotlin.jvm.internal.m;
import m5.C1386y;
import n5.AbstractC1397A;
import q5.InterfaceC1524c;
import r1.C1575c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MeasurementManager f8753a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(MeasurementManager mMeasurementManager) {
        m.e(mMeasurementManager, "mMeasurementManager");
        this.f8753a = mMeasurementManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object b(e eVar, AbstractC0619a abstractC0619a, InterfaceC1524c<? super C1386y> interfaceC1524c) {
        new C0247h(1, AbstractC1397A.v(interfaceC1524c)).s();
        MeasurementManager measurementManager = eVar.f8753a;
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object d(e eVar, InterfaceC1524c<? super Integer> interfaceC1524c) {
        C0247h c0247h = new C0247h(1, AbstractC1397A.v(interfaceC1524c));
        c0247h.s();
        eVar.f8753a.getMeasurementApiStatus(new c(0), new C1575c(c0247h));
        return c0247h.r();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object g(e eVar, f fVar, InterfaceC1524c<? super C1386y> interfaceC1524c) {
        Object objG = AbstractC0263y.g(new d(eVar, null), interfaceC1524c);
        return objG == EnumC1580a.f16356q ? objG : C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object h(e eVar, Uri uri, InputEvent inputEvent, InterfaceC1524c<? super C1386y> interfaceC1524c) {
        C0247h c0247h = new C0247h(1, AbstractC1397A.v(interfaceC1524c));
        c0247h.s();
        eVar.f8753a.registerSource(uri, inputEvent, new c(0), new C1575c(c0247h));
        Object objR = c0247h.r();
        return objR == EnumC1580a.f16356q ? objR : C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object j(e eVar, Uri uri, InterfaceC1524c<? super C1386y> interfaceC1524c) {
        C0247h c0247h = new C0247h(1, AbstractC1397A.v(interfaceC1524c));
        c0247h.s();
        eVar.f8753a.registerTrigger(uri, new c(0), new C1575c(c0247h));
        Object objR = c0247h.r();
        return objR == EnumC1580a.f16356q ? objR : C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object l(e eVar, g gVar, InterfaceC1524c<? super C1386y> interfaceC1524c) {
        new C0247h(1, AbstractC1397A.v(interfaceC1524c)).s();
        MeasurementManager measurementManager = eVar.f8753a;
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object n(e eVar, h hVar, InterfaceC1524c<? super C1386y> interfaceC1524c) {
        new C0247h(1, AbstractC1397A.v(interfaceC1524c)).s();
        MeasurementManager measurementManager = eVar.f8753a;
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object a(AbstractC0619a abstractC0619a, InterfaceC1524c<? super C1386y> interfaceC1524c) {
        return b(this, abstractC0619a, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object c(InterfaceC1524c<? super Integer> interfaceC1524c) {
        return d(this, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object e(f fVar, InterfaceC1524c<? super C1386y> interfaceC1524c) {
        return g(this, fVar, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object f(Uri uri, InputEvent inputEvent, InterfaceC1524c<? super C1386y> interfaceC1524c) {
        return h(this, uri, inputEvent, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object i(Uri uri, InterfaceC1524c<? super C1386y> interfaceC1524c) {
        return j(this, uri, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object k(g gVar, InterfaceC1524c<? super C1386y> interfaceC1524c) {
        return l(this, gVar, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object m(h hVar, InterfaceC1524c<? super C1386y> interfaceC1524c) {
        return n(this, hVar, interfaceC1524c);
    }
}
