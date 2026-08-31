package androidx.compose.foundation.layout;

import A.EnumC0026x;
import A.e0;
import c0.C0714b;
import c0.C0715c;
import c0.C0716d;
import c0.C0717e;
import c0.InterfaceC0725m;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FillElement f9277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FillElement f9278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FillElement f9279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final WrapContentElement f9280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final WrapContentElement f9281e;
    public static final WrapContentElement f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final WrapContentElement f9282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final WrapContentElement f9283h;
    public static final WrapContentElement i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0026x enumC0026x = EnumC0026x.f154r;
        f9277a = new FillElement(enumC0026x);
        EnumC0026x enumC0026x2 = EnumC0026x.f153q;
        f9278b = new FillElement(enumC0026x2);
        EnumC0026x enumC0026x3 = EnumC0026x.f155s;
        f9279c = new FillElement(enumC0026x3);
        C0715c c0715c = C0714b.f10074C;
        int i7 = 2;
        f9280d = new WrapContentElement(enumC0026x, new e0(i7, c0715c), c0715c);
        C0715c c0715c2 = C0714b.f10073B;
        f9281e = new WrapContentElement(enumC0026x, new e0(i7, c0715c2), c0715c2);
        C0716d c0716d = C0714b.f10072A;
        int i8 = 0;
        f = new WrapContentElement(enumC0026x2, new e0(i8, c0716d), c0716d);
        C0716d c0716d2 = C0714b.f10085z;
        f9282g = new WrapContentElement(enumC0026x2, new e0(i8, c0716d2), c0716d2);
        C0717e c0717e = C0714b.f10080u;
        int i9 = 1;
        f9283h = new WrapContentElement(enumC0026x3, new e0(i9, c0717e), c0717e);
        C0717e c0717e2 = C0714b.f10076q;
        i = new WrapContentElement(enumC0026x3, new e0(i9, c0717e2), c0717e2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC0725m a(InterfaceC0725m interfaceC0725m, float f7) {
        return interfaceC0725m.d(new SizeElement(0.0f, f7, 0.0f, f7, 5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC0725m b(InterfaceC0725m interfaceC0725m, float f7, float f8) {
        return interfaceC0725m.d(new SizeElement(0.0f, f7, 0.0f, f8, 5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC0725m c(InterfaceC0725m interfaceC0725m, float f7) {
        return interfaceC0725m.d(new SizeElement(f7, f7, f7, f7));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC0725m d(InterfaceC0725m interfaceC0725m, float f7, float f8) {
        return interfaceC0725m.d(new SizeElement(f7, f8, f7, f8));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC0725m e(InterfaceC0725m interfaceC0725m, float f7) {
        return interfaceC0725m.d(new SizeElement(f7, 0.0f, f7, 0.0f, 10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static InterfaceC0725m f(InterfaceC0725m interfaceC0725m, float f7) {
        return interfaceC0725m.d(new SizeElement(Float.NaN, 0.0f, f7, 0.0f, 10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static InterfaceC0725m g(InterfaceC0725m interfaceC0725m) {
        WrapContentElement wrapContentElement;
        C0716d c0716d = C0714b.f10072A;
        if (m.a(c0716d, c0716d)) {
            wrapContentElement = f;
        } else if (m.a(c0716d, C0714b.f10085z)) {
            wrapContentElement = f9282g;
        } else {
            wrapContentElement = new WrapContentElement(EnumC0026x.f153q, new e0(0, c0716d), c0716d);
        }
        return interfaceC0725m.d(wrapContentElement);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static InterfaceC0725m h() {
        C0717e c0717e = C0714b.f10080u;
        if (m.a(c0717e, c0717e)) {
            return f9283h;
        }
        if (m.a(c0717e, C0714b.f10076q)) {
            return i;
        }
        return new WrapContentElement(EnumC0026x.f155s, new e0(1, c0717e), c0717e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static InterfaceC0725m i(InterfaceC0725m interfaceC0725m) {
        WrapContentElement wrapContentElement;
        C0715c c0715c = C0714b.f10074C;
        if (m.a(c0715c, c0715c)) {
            wrapContentElement = f9280d;
        } else if (m.a(c0715c, C0714b.f10073B)) {
            wrapContentElement = f9281e;
        } else {
            wrapContentElement = new WrapContentElement(EnumC0026x.f154r, new e0(2, c0715c), c0715c);
        }
        return interfaceC0725m.d(wrapContentElement);
    }
}
