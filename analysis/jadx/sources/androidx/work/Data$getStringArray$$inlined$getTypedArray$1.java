package androidx.work;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class Data$getStringArray$$inlined$getTypedArray$1 extends n implements B5.c {
    final /* synthetic */ Object $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Data$getStringArray$$inlined$getTypedArray$1(Object obj) {
        super(1);
        this.$value = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String invoke(int i) {
        Object obj = ((Object[]) this.$value)[i];
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // B5.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
