package B0;

import java.util.Comparator;
import m5.C1371j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f217a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [B0.L.<clinit>():void, E.C.<clinit>():void, P.p.<clinit>():void, s1.b.<clinit>():void] */
    public /* synthetic */ C(int i) {
        this.f217a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f217a) {
            case 0:
                L l7 = (L) obj;
                L l8 = (L) obj2;
                float f = l7.f269V.f311p.f393T;
                float f7 = l8.f269V.f311p.f393T;
                return f == f7 ? kotlin.jvm.internal.m.f(l7.t(), l8.t()) : Float.compare(f, f7);
            case 1:
                return kotlin.jvm.internal.m.f(((E.B) obj).getIndex(), ((E.B) obj2).getIndex());
            case 2:
                C1371j c1371j = (C1371j) obj;
                C1371j c1371j2 = (C1371j) obj2;
                return (((Number) c1371j.f15081r).intValue() - ((Number) c1371j.f15080q).intValue()) - (((Number) c1371j2.f15081r).intValue() - ((Number) c1371j2.f15080q).intValue());
            case 3:
                return kotlin.jvm.internal.m.f(((P.L) obj).f5330b, ((P.L) obj2).f5330b);
            default:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b7 = bArr[i];
                    byte b8 = bArr2[i];
                    if (b7 != b8) {
                        return b7 - b8;
                    }
                }
                return 0;
        }
    }
}
