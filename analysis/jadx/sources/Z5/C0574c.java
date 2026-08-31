package Z5;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: Z5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0574c extends AbstractC0585n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0573b f8581b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0574c(V5.a element) {
        super(element);
        kotlin.jvm.internal.m.e(element, "element");
        X5.f elementDesc = element.b();
        kotlin.jvm.internal.m.e(elementDesc, "elementDesc");
        this.f8581b = new C0573b(elementDesc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // V5.a
    public final X5.f b() {
        return this.f8581b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0572a
    public final Object d() {
        return new ArrayList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0572a
    public final int e(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        kotlin.jvm.internal.m.e(arrayList, "<this>");
        return arrayList.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0572a
    public final Object h(Object obj) {
        kotlin.jvm.internal.m.e(null, "<this>");
        return new ArrayList((Collection) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0572a
    public final Object i(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        kotlin.jvm.internal.m.e(arrayList, "<this>");
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.AbstractC0585n
    public final void j(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        kotlin.jvm.internal.m.e(arrayList, "<this>");
        arrayList.add(i, obj2);
    }
}
