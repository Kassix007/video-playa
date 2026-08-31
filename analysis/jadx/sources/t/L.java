package t;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1597F f16590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f16592c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public L(C1597F c1597f, D5.a aVar, boolean z5, Map map) {
        this.f16590a = c1597f;
        this.f16591b = z5;
        this.f16592c = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l7 = (L) obj;
        return kotlin.jvm.internal.m.a(this.f16590a, l7.f16590a) && kotlin.jvm.internal.m.a(null, null) && this.f16591b == l7.f16591b && kotlin.jvm.internal.m.a(this.f16592c, l7.f16592c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        C1597F c1597f = this.f16590a;
        return this.f16592c.hashCode() + k1.i.e((((c1597f == null ? 0 : c1597f.hashCode()) * 29791) + 0) * 31, 31, this.f16591b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TransitionData(fade=" + this.f16590a + ", slide=null, changeSize=null, scale=" + ((Object) null) + ", hold=" + this.f16591b + ", effectsMap=" + this.f16592c + ')';
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:t.F:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null t.F) : (r3v0 t.F))
  (wrap:D5.a:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null D5.a) : (r4v0 D5.a))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? true : false)
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0012: ARITH (r6v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:SGET  A[WRAPPED] (LINE:5) n5.t.q n5.t) : (r5v0 java.util.LinkedHashMap))
 A[MD:(t.F, D5.a, boolean, java.util.Map):void (m)] (LINE:6) call: t.L.<init>(t.F, D5.a, boolean, java.util.Map):void type: THIS */
    public /* synthetic */ L(C1597F c1597f, D5.a aVar, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : c1597f, (i & 8) != 0 ? null : aVar, (i & 16) == 0, (i & 32) != 0 ? n5.t.f15300q : linkedHashMap);
    }
}
