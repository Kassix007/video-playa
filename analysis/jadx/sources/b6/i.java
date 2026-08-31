package b6;

import C0.C0102t;
import D.u;
import E.Y;
import O3.B;
import Z5.C0589s;
import a6.AbstractC0637c;
import com.google.android.gms.internal.measurement.I1;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.m;
import n5.q;

/* JADX INFO: loaded from: classes.dex */
public final class i extends I1 implements Y5.b, Y5.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC0637c f10037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f10038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f10039e;
    public final B f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f10041h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(AbstractC0637c abstractC0637c, l lVar, u uVar, X5.f descriptor) {
        super(13);
        m.e(descriptor, "descriptor");
        this.f10037c = abstractC0637c;
        this.f10038d = lVar;
        this.f10039e = uVar;
        this.f = abstractC0637c.f9020b;
        this.f10040g = -1;
        this.f10041h = abstractC0637c.f9019a.f9036c ? null : new d(descriptor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final a6.l T0() {
        a6.j jVar = this.f10037c.f9019a;
        U.l lVar = new U.l();
        lVar.f7511r = this.f10039e;
        return lVar.j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1, Y5.b
    public final Y5.a a(X5.f descriptor) {
        l lVar;
        m.e(descriptor, "descriptor");
        I1 i1C = descriptor.c();
        boolean z5 = i1C instanceof X5.c;
        AbstractC0637c abstractC0637c = this.f10037c;
        if (z5) {
            lVar = l.POLY_OBJ;
        } else if (m.a(i1C, X5.i.f8195d)) {
            lVar = l.LIST;
        } else if (m.a(i1C, X5.i.f8196e)) {
            X5.f fVarB = e.b(descriptor.i(0), abstractC0637c.f9020b);
            I1 i1C2 = fVarB.c();
            if (!(i1C2 instanceof X5.e) && !m.a(i1C2, X5.h.f8193d)) {
                String message = "Value of type '" + fVarB.b() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + fVarB.c() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.";
                m.e(message, "message");
                throw new c(message);
            }
            lVar = l.MAP;
        } else {
            lVar = l.OBJ;
        }
        u uVar = this.f10039e;
        Y y6 = (Y) uVar.f1290c;
        int i = y6.f1519b + 1;
        y6.f1519b = i;
        if (i == ((Object[]) y6.f1520c).length) {
            y6.r();
        }
        ((Object[]) y6.f1520c)[i] = descriptor;
        uVar.g(lVar.f10049q);
        if (uVar.w() != 4) {
            int iOrdinal = lVar.ordinal();
            return (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) ? new i(abstractC0637c, lVar, uVar, descriptor) : (this.f10038d == lVar && abstractC0637c.f9019a.f9036c) ? this : new i(abstractC0637c, lVar, uVar, descriptor);
        }
        u.m(uVar, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1, Y5.a
    public final Object b(X5.f descriptor, int i, V5.a deserializer, Object obj) {
        Y y6 = (Y) this.f10039e.f1290c;
        m.e(descriptor, "descriptor");
        m.e(deserializer, "deserializer");
        boolean z5 = this.f10038d == l.MAP && (i & 1) == 0;
        if (z5) {
            int[] iArr = (int[]) y6.f1521d;
            int i7 = y6.f1519b;
            if (iArr[i7] == -2) {
                ((Object[]) y6.f1520c)[i7] = f.f10025a;
            }
        }
        Object objB = super.b(descriptor, i, deserializer, obj);
        if (z5) {
            int[] iArr2 = (int[]) y6.f1521d;
            int i8 = y6.f1519b;
            if (iArr2[i8] != -2) {
                int i9 = i8 + 1;
                y6.f1519b = i9;
                if (i9 == ((Object[]) y6.f1520c).length) {
                    y6.r();
                }
            }
            Object[] objArr = (Object[]) y6.f1520c;
            int i10 = y6.f1519b;
            objArr[i10] = objB;
            ((int[]) y6.f1521d)[i10] = -2;
        }
        return objB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1, Y5.b
    public final long d() {
        return this.f10039e.h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1, Y5.b
    public final boolean e() {
        boolean z5;
        boolean z6;
        u uVar = this.f10039e;
        int iZ = uVar.z();
        String str = (String) uVar.f;
        if (iZ == str.length()) {
            u.m(uVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iZ) == '\"') {
            iZ++;
            z5 = true;
        } else {
            z5 = false;
        }
        int iY = uVar.y(iZ);
        if (iY >= str.length() || iY == -1) {
            u.m(uVar, "EOF", 0, null, 6);
            throw null;
        }
        int i = iY + 1;
        int iCharAt = str.charAt(iY) | ' ';
        if (iCharAt == 102) {
            uVar.c(i, "alse");
            z6 = false;
        } else {
            if (iCharAt != 116) {
                u.m(uVar, "Expected valid boolean literal prefix, but had '" + uVar.j() + '\'', 0, null, 6);
                throw null;
            }
            uVar.c(i, "rue");
            z6 = true;
        }
        if (!z5) {
            return z6;
        }
        if (uVar.f1289b == str.length()) {
            u.m(uVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(uVar.f1289b) == '\"') {
            uVar.f1289b++;
            return z6;
        }
        u.m(uVar, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1, Y5.b
    public final boolean f() {
        d dVar = this.f10041h;
        if (!(dVar != null ? dVar.f10023b : false)) {
            u uVar = this.f10039e;
            int iY = uVar.y(uVar.z());
            String str = (String) uVar.f;
            int length = str.length() - iY;
            boolean z5 = false;
            if (length >= 4 && iY != -1) {
                int i = 0;
                while (true) {
                    if (i < 4) {
                        if ("null".charAt(i) != str.charAt(iY + i)) {
                            break;
                        }
                        i++;
                    } else if (length <= 4 || e.c(str.charAt(iY + 4)) != 0) {
                        z5 = true;
                        uVar.f1289b = iY + 4;
                    }
                }
            }
            if (!z5) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1, Y5.b
    public final char h() {
        u uVar = this.f10039e;
        String strJ = uVar.j();
        if (strJ.length() == 1) {
            return strJ.charAt(0);
        }
        u.m(uVar, "Expected single char, but got '" + strJ + '\'', 0, null, 6);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r11v5 */
    @Override // Y5.a
    public final int j(X5.f descriptor) {
        byte b7;
        byte b8;
        boolean z5;
        u uVar = this.f10039e;
        Y y6 = (Y) uVar.f1290c;
        String str = (String) uVar.f;
        m.e(descriptor, "descriptor");
        l lVar = this.f10038d;
        int iOrdinal = lVar.ordinal();
        char c7 = ':';
        boolean zB = false;
        byte b9 = 1;
        int i = -1;
        if (iOrdinal == 0) {
            boolean zB2 = uVar.B();
            while (true) {
                boolean zB3 = uVar.b();
                d dVar = this.f10041h;
                if (zB3) {
                    String name = uVar.d();
                    uVar.g(c7);
                    m.e(descriptor, "<this>");
                    AbstractC0637c json = this.f10037c;
                    m.e(json, "json");
                    m.e(name, "name");
                    e.h(descriptor, json);
                    int iA = descriptor.a(name);
                    byte b10 = b9;
                    if (iA == -3 && json.f9019a.f9037d) {
                        m.e(json, "<this>");
                        m.e(descriptor, "descriptor");
                        k3.c cVar = json.f9021c;
                        I2.e eVar = new I2.e(4, descriptor, json);
                        cVar.getClass();
                        cVar.getClass();
                        m.e(descriptor, "descriptor");
                        Map map = (Map) ((ConcurrentHashMap) cVar.f14120q).get(descriptor);
                        Object obj = map != null ? map.get(e.f10024a) : null;
                        Object obj2 = obj != null ? obj : null;
                        if (obj2 == null) {
                            Object objInvoke = eVar.invoke();
                            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) cVar.f14120q;
                            Object concurrentHashMap2 = concurrentHashMap.get(descriptor);
                            if (concurrentHashMap2 == null) {
                                concurrentHashMap2 = new ConcurrentHashMap(2);
                                concurrentHashMap.put(descriptor, concurrentHashMap2);
                            }
                            ((Map) concurrentHashMap2).put(e.f10024a, objInvoke);
                            obj2 = objInvoke;
                        }
                        Integer num = (Integer) ((Map) obj2).get(name);
                        iA = num != null ? num.intValue() : -3;
                    }
                    if (iA != -3) {
                        if (dVar != null) {
                            C0589s c0589s = dVar.f10022a;
                            if (iA < 64) {
                                c0589s.f8630c |= 1 << iA;
                            } else {
                                int i7 = (iA >>> 6) - 1;
                                long[] jArr = c0589s.f8631d;
                                jArr[i7] = jArr[i7] | (1 << (iA & 63));
                            }
                        }
                        i = iA;
                    } else {
                        if (!e.e(descriptor, json)) {
                            int i8 = y6.f1519b;
                            int[] iArr = (int[]) y6.f1521d;
                            if (iArr[i8] == -2) {
                                iArr[i8] = -1;
                                y6.f1519b = i8 - 1;
                            }
                            int i9 = y6.f1519b;
                            if (i9 != -1) {
                                y6.f1519b = i9 - 1;
                            }
                            int iW0 = J5.m.W0(6, str.subSequence(0, uVar.f1289b).toString(), name);
                            throw new c("Encountered an unknown key '" + name + "' at offset " + iW0 + " at path: " + y6.i() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((Object) e.g(str, iW0)));
                        }
                        ArrayList arrayList = new ArrayList();
                        byte bW = uVar.w();
                        byte b11 = 6;
                        if (bW == 8 || bW == 6) {
                            while (true) {
                                byte bW2 = uVar.w();
                                b7 = b10;
                                if (bW2 == b7) {
                                    uVar.d();
                                    b10 = b7;
                                } else {
                                    if (bW2 == 8 || bW2 == b11) {
                                        b8 = b11;
                                        z5 = false;
                                        arrayList.add(Byte.valueOf(bW2));
                                    } else {
                                        if (bW2 == 9) {
                                            if (((Number) n5.l.r0(arrayList)).byteValue() != 8) {
                                                throw e.a(uVar.f1289b, str, "found ] instead of } at path: " + y6);
                                            }
                                            q.g0(arrayList);
                                        } else if (bW2 == 7) {
                                            if (((Number) n5.l.r0(arrayList)).byteValue() != 6) {
                                                throw e.a(uVar.f1289b, str, "found } instead of ] at path: " + y6);
                                            }
                                            q.g0(arrayList);
                                        } else if (bW2 == 10) {
                                            u.m(uVar, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                            throw null;
                                        }
                                        b8 = 6;
                                        z5 = false;
                                    }
                                    uVar.e();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                    b10 = b7;
                                    b11 = b8;
                                }
                            }
                        } else {
                            uVar.j();
                            b8 = 6;
                            b7 = b10;
                            z5 = false;
                        }
                        zB2 = uVar.B();
                        c7 = ':';
                        b9 = b7;
                        zB = z5;
                    }
                } else {
                    boolean z6 = zB;
                    if (zB2) {
                        e.f(uVar, "object");
                        throw null;
                    }
                    if (dVar != null) {
                        C0589s c0589s2 = dVar.f10022a;
                        C0102t c0102t = c0589s2.f8629b;
                        X5.f fVar = c0589s2.f8628a;
                        int iD = fVar.d();
                        while (true) {
                            long j = c0589s2.f8630c;
                            long j7 = -1;
                            if (j != -1) {
                                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                                c0589s2.f8630c |= 1 << iNumberOfTrailingZeros;
                                if (((Boolean) c0102t.invoke(fVar, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue()) {
                                    i = iNumberOfTrailingZeros;
                                    break;
                                }
                            } else if (iD > 64) {
                                long[] jArr2 = c0589s2.f8631d;
                                int length = jArr2.length;
                                ?? r11 = z6;
                                loop3: while (true) {
                                    if (r11 >= length) {
                                        break;
                                    }
                                    int i10 = r11 + 1;
                                    int i11 = i10 * 64;
                                    long j8 = jArr2[r11];
                                    while (j8 != j7) {
                                        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j8);
                                        j8 |= 1 << iNumberOfTrailingZeros2;
                                        int i12 = iNumberOfTrailingZeros2 + i11;
                                        if (((Boolean) c0102t.invoke(fVar, Integer.valueOf(i12))).booleanValue()) {
                                            jArr2[r11] = j8;
                                            i = i12;
                                            break loop3;
                                        }
                                        j7 = -1;
                                    }
                                    jArr2[r11] = j8;
                                    r11 = i10;
                                    j7 = -1;
                                }
                            }
                        }
                    }
                }
            }
        } else if (iOrdinal != 2) {
            boolean zB4 = uVar.B();
            if (uVar.b()) {
                int i13 = this.f10040g;
                if (i13 != -1 && !zB4) {
                    u.m(uVar, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i = i13 + 1;
                this.f10040g = i;
            } else if (zB4) {
                e.f(uVar, "array");
                throw null;
            }
        } else {
            int i14 = this.f10040g;
            boolean z7 = i14 % 2 != 0;
            if (!z7) {
                uVar.g(':');
            } else if (i14 != -1) {
                zB = uVar.B();
            }
            if (uVar.b()) {
                if (z7) {
                    if (this.f10040g == -1) {
                        int i15 = uVar.f1289b;
                        if (zB) {
                            u.m(uVar, "Unexpected leading comma", i15, null, 4);
                            throw null;
                        }
                    } else {
                        int i16 = uVar.f1289b;
                        if (!zB) {
                            u.m(uVar, "Expected comma after the key-value pair", i16, null, 4);
                            throw null;
                        }
                    }
                }
                i = this.f10040g + 1;
                this.f10040g = i;
            } else if (zB) {
                e.f(uVar, "object");
                throw null;
            }
        }
        if (lVar != l.MAP) {
            ((int[]) y6.f1521d)[y6.f1519b] = i;
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1, Y5.a
    public final void l(X5.f descriptor) {
        m.e(descriptor, "descriptor");
        if (descriptor.d() == 0 && e.e(descriptor, this.f10037c)) {
            while (j(descriptor) != -1) {
            }
        }
        u uVar = this.f10039e;
        if (uVar.B()) {
            e.f(uVar, "");
            throw null;
        }
        uVar.g(this.f10038d.f10050r);
        Y y6 = (Y) uVar.f1290c;
        int i = y6.f1519b;
        int[] iArr = (int[]) y6.f1521d;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            y6.f1519b = i - 1;
        }
        int i7 = y6.f1519b;
        if (i7 != -1) {
            y6.f1519b = i7 - 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1, Y5.b
    public final Y5.b m(X5.f descriptor) {
        m.e(descriptor, "descriptor");
        Set set = j.f10042a;
        return (descriptor.isInline() && j.f10042a.contains(descriptor)) ? new b(this.f10039e, this.f10037c) : this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1, Y5.b
    public final int n() {
        u uVar = this.f10039e;
        long jH = uVar.h();
        int i = (int) jH;
        if (jH == i) {
            return i;
        }
        u.m(uVar, "Failed to parse int for input '" + jH + '\'', 0, null, 6);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0109  */
    @Override // com.google.android.gms.internal.measurement.I1, Y5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(V5.a r9) {
        /*
            r8 = this;
            a6.c r0 = r8.f10037c
            D.u r1 = r8.f10039e
            java.lang.Object r2 = r1.f1290c
            E.Y r2 = (E.Y) r2
            java.lang.String r3 = "Expected "
            java.lang.String r4 = "deserializer"
            kotlin.jvm.internal.m.e(r9, r4)
            boolean r4 = r9 instanceof V5.c     // Catch: V5.b -> L60
            if (r4 == 0) goto Lf4
            r4 = r9
            V5.c r4 = (V5.c) r4     // Catch: V5.b -> L60
            X5.f r4 = r4.b()     // Catch: V5.b -> L60
            java.lang.String r4 = b6.e.d(r4, r0)     // Catch: V5.b -> L60
            java.lang.String r4 = r1.v(r4)     // Catch: V5.b -> L60
            r5 = 0
            if (r4 != 0) goto Lc7
            boolean r1 = r9 instanceof V5.c     // Catch: V5.b -> L60
            if (r1 == 0) goto Lc2
            r1 = r9
            V5.c r1 = (V5.c) r1     // Catch: V5.b -> L60
            X5.f r1 = r1.b()     // Catch: V5.b -> L60
            java.lang.String r0 = b6.e.d(r1, r0)     // Catch: V5.b -> L60
            a6.l r1 = r8.T0()     // Catch: V5.b -> L60
            r4 = r9
            V5.c r4 = (V5.c) r4     // Catch: V5.b -> L60
            X5.f r4 = r4.b()     // Catch: V5.b -> L60
            java.lang.String r4 = r4.b()     // Catch: V5.b -> L60
            boolean r6 = r1 instanceof a6.x     // Catch: V5.b -> L60
            r7 = -1
            if (r6 == 0) goto L7b
            a6.x r1 = (a6.x) r1     // Catch: V5.b -> L60
            java.lang.Object r0 = r1.get(r0)     // Catch: V5.b -> L60
            a6.l r0 = (a6.l) r0     // Catch: V5.b -> L60
            if (r0 == 0) goto L63
            a6.B r0 = a6.m.a(r0)     // Catch: V5.b -> L60
            boolean r3 = r0 instanceof a6.u     // Catch: V5.b -> L60
            if (r3 == 0) goto L5b
            goto L63
        L5b:
            java.lang.String r0 = r0.d()     // Catch: V5.b -> L60
            goto L64
        L60:
            r9 = move-exception
            goto Lf9
        L63:
            r0 = r5
        L64:
            V5.c r9 = (V5.c) r9     // Catch: V5.d -> L6a
            D5.a.v(r9, r8, r0)     // Catch: V5.d -> L6a
            throw r5     // Catch: V5.d -> L6a
        L6a:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()     // Catch: V5.b -> L60
            kotlin.jvm.internal.m.b(r9)     // Catch: V5.b -> L60
            java.lang.String r0 = r1.toString()     // Catch: V5.b -> L60
            b6.c r9 = b6.e.a(r7, r0, r9)     // Catch: V5.b -> L60
            throw r9     // Catch: V5.b -> L60
        L7b:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: V5.b -> L60
            r9.<init>(r3)     // Catch: V5.b -> L60
            java.lang.Class<a6.x> r0 = a6.x.class
            kotlin.jvm.internal.f r0 = kotlin.jvm.internal.z.a(r0)     // Catch: V5.b -> L60
            java.lang.String r0 = r0.c()     // Catch: V5.b -> L60
            r9.append(r0)     // Catch: V5.b -> L60
            java.lang.String r0 = ", but had "
            r9.append(r0)     // Catch: V5.b -> L60
            java.lang.Class r0 = r1.getClass()     // Catch: V5.b -> L60
            kotlin.jvm.internal.f r0 = kotlin.jvm.internal.z.a(r0)     // Catch: V5.b -> L60
            java.lang.String r0 = r0.c()     // Catch: V5.b -> L60
            r9.append(r0)     // Catch: V5.b -> L60
            java.lang.String r0 = " as the serialized body of "
            r9.append(r0)     // Catch: V5.b -> L60
            r9.append(r4)     // Catch: V5.b -> L60
            java.lang.String r0 = " at element: "
            r9.append(r0)     // Catch: V5.b -> L60
            java.lang.String r0 = r2.i()     // Catch: V5.b -> L60
            r9.append(r0)     // Catch: V5.b -> L60
            java.lang.String r9 = r9.toString()     // Catch: V5.b -> L60
            java.lang.String r0 = r1.toString()     // Catch: V5.b -> L60
            b6.c r9 = b6.e.a(r7, r0, r9)     // Catch: V5.b -> L60
            throw r9     // Catch: V5.b -> L60
        Lc2:
            java.lang.Object r9 = r9.c(r8)     // Catch: V5.b -> L60
            return r9
        Lc7:
            V5.c r9 = (V5.c) r9     // Catch: V5.d -> Lcd
            D5.a.v(r9, r8, r4)     // Catch: V5.d -> Lcd
            throw r5     // Catch: V5.d -> Lcd
        Lcd:
            r9 = move-exception
            java.lang.String r0 = r9.getMessage()     // Catch: V5.b -> L60
            kotlin.jvm.internal.m.b(r0)     // Catch: V5.b -> L60
            r3 = 10
            java.lang.String r0 = J5.m.j1(r0, r3)     // Catch: V5.b -> L60
            java.lang.String r4 = "."
            java.lang.String r0 = J5.m.b1(r0, r4)     // Catch: V5.b -> L60
            java.lang.String r9 = r9.getMessage()     // Catch: V5.b -> L60
            kotlin.jvm.internal.m.b(r9)     // Catch: V5.b -> L60
            java.lang.String r4 = ""
            java.lang.String r9 = J5.m.g1(r3, r9, r4)     // Catch: V5.b -> L60
            r3 = 0
            r4 = 2
            D.u.m(r1, r0, r3, r9, r4)     // Catch: V5.b -> L60
            throw r5     // Catch: V5.b -> L60
        Lf4:
            java.lang.Object r9 = r9.c(r8)     // Catch: V5.b -> L60
            return r9
        Lf9:
            java.lang.String r0 = r9.getMessage()
            kotlin.jvm.internal.m.b(r0)
            java.lang.String r1 = "at path"
            boolean r0 = J5.m.K0(r0, r1)
            if (r0 == 0) goto L109
            throw r9
        L109:
            V5.b r0 = new V5.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r9.getMessage()
            r1.append(r3)
            java.lang.String r3 = " at path: "
            r1.append(r3)
            java.lang.String r2 = r2.i()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.util.List r2 = r9.f8004q
            r0.<init>(r2, r1, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.i.p(V5.a):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Y5.a
    public final B q() {
        return this.f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1, Y5.b
    public final byte s() {
        u uVar = this.f10039e;
        long jH = uVar.h();
        byte b7 = (byte) jH;
        if (jH == b7) {
            return b7;
        }
        u.m(uVar, "Failed to parse byte for input '" + jH + '\'', 0, null, 6);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1, Y5.b
    public final short v() {
        u uVar = this.f10039e;
        long jH = uVar.h();
        short s6 = (short) jH;
        if (jH == s6) {
            return s6;
        }
        u.m(uVar, "Failed to parse short for input '" + jH + '\'', 0, null, 6);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1, Y5.b
    public final String w() {
        return this.f10039e.i();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1, Y5.b
    public final float x() {
        u uVar = this.f10039e;
        String strJ = uVar.j();
        try {
            float f = Float.parseFloat(strJ);
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            e.i(uVar, Float.valueOf(f));
            throw null;
        } catch (IllegalArgumentException unused) {
            u.m(uVar, "Failed to parse type 'float' for input '" + strJ + '\'', 0, null, 6);
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1, Y5.b
    public final double z() {
        u uVar = this.f10039e;
        String strJ = uVar.j();
        try {
            double d5 = Double.parseDouble(strJ);
            if (Math.abs(d5) <= Double.MAX_VALUE) {
                return d5;
            }
            e.i(uVar, Double.valueOf(d5));
            throw null;
        } catch (IllegalArgumentException unused) {
            u.m(uVar, "Failed to parse type 'double' for input '" + strJ + '\'', 0, null, 6);
            throw null;
        }
    }
}
