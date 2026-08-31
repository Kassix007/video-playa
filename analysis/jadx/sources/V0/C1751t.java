package v0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import m5.InterfaceC1366e;
import q5.InterfaceC1524c;

/* JADX INFO: renamed from: v0.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1751t implements PointerInputEventHandler, kotlin.jvm.internal.h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ B5.e f17494q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1751t(B5.e eVar) {
        this.f17494q = eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // kotlin.jvm.internal.h
    public final InterfaceC1366e a() {
        return this.f17494q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof PointerInputEventHandler) || !(obj instanceof kotlin.jvm.internal.h)) {
            return false;
        }
        return kotlin.jvm.internal.m.a(this.f17494q, ((kotlin.jvm.internal.h) obj).a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f17494q.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(InterfaceC1746o interfaceC1746o, InterfaceC1524c interfaceC1524c) {
        return this.f17494q.invoke(interfaceC1746o, interfaceC1524c);
    }
}
