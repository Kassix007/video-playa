package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0661y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EnumC0653p f9568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC0658v f9569b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(InterfaceC0660x interfaceC0660x, EnumC0652o enumC0652o) {
        EnumC0653p enumC0653pA = enumC0652o.a();
        EnumC0653p state1 = this.f9568a;
        kotlin.jvm.internal.m.e(state1, "state1");
        if (enumC0653pA.compareTo(state1) < 0) {
            state1 = enumC0653pA;
        }
        this.f9568a = state1;
        this.f9569b.e(interfaceC0660x, enumC0652o);
        this.f9568a = enumC0653pA;
    }
}
