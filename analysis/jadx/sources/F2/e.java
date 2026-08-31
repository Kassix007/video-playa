package f2;

import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f12712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f12713d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(String str, Map map, AbstractSet foreignKeys, AbstractSet abstractSet) {
        m.e(foreignKeys, "foreignKeys");
        this.f12710a = str;
        this.f12711b = map;
        this.f12712c = foreignKeys;
        this.f12713d = abstractSet;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[GOTO]}, finally: {[GOTO, THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[GOTO] complete}, expected: {[GOTO, THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e6, code lost:
    
        r9 = n5.AbstractC1397A.m(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ea, code lost:
    
        r3.close();
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final f2.e a(j2.InterfaceC1155a r26, java.lang.String r27) {
        /*
            r0 = r26
            r1 = r27
            java.lang.String r2 = "database"
            kotlin.jvm.internal.m.e(r0, r2)
            java.lang.String r2 = "type"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "PRAGMA table_info(`"
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r4 = "`)"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.database.Cursor r3 = r0.V(r3)
            int r5 = r3.getColumnCount()     // Catch: java.lang.Throwable -> L30
            java.lang.String r8 = "name"
            if (r5 > 0) goto L34
            n5.t r2 = n5.t.f15300q     // Catch: java.lang.Throwable -> L30
            r3.close()
            goto L92
        L30:
            r0 = move-exception
            r1 = r0
            goto L203
        L34:
            int r5 = r3.getColumnIndex(r8)     // Catch: java.lang.Throwable -> L30
            int r9 = r3.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L30
            java.lang.String r10 = "notnull"
            int r10 = r3.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L30
            java.lang.String r11 = "pk"
            int r11 = r3.getColumnIndex(r11)     // Catch: java.lang.Throwable -> L30
            java.lang.String r12 = "dflt_value"
            int r12 = r3.getColumnIndex(r12)     // Catch: java.lang.Throwable -> L30
            o5.e r13 = new o5.e     // Catch: java.lang.Throwable -> L30
            r13.<init>()     // Catch: java.lang.Throwable -> L30
        L53:
            boolean r14 = r3.moveToNext()     // Catch: java.lang.Throwable -> L30
            if (r14 == 0) goto L8b
            java.lang.String r14 = r3.getString(r5)     // Catch: java.lang.Throwable -> L30
            java.lang.String r15 = r3.getString(r9)     // Catch: java.lang.Throwable -> L30
            int r16 = r3.getInt(r10)     // Catch: java.lang.Throwable -> L30
            if (r16 == 0) goto L6a
            r18 = 1
            goto L6c
        L6a:
            r18 = 0
        L6c:
            int r19 = r3.getInt(r11)     // Catch: java.lang.Throwable -> L30
            java.lang.String r20 = r3.getString(r12)     // Catch: java.lang.Throwable -> L30
            kotlin.jvm.internal.m.d(r14, r8)     // Catch: java.lang.Throwable -> L30
            f2.a r16 = new f2.a     // Catch: java.lang.Throwable -> L30
            kotlin.jvm.internal.m.d(r15, r2)     // Catch: java.lang.Throwable -> L30
            r21 = 2
            r17 = r15
            r15 = r16
            r16 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> L30
            r13.put(r14, r15)     // Catch: java.lang.Throwable -> L30
            goto L53
        L8b:
            o5.e r2 = r13.b()     // Catch: java.lang.Throwable -> L30
            r3.close()
        L92:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "PRAGMA foreign_key_list(`"
            r3.<init>(r5)
            r3.append(r1)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.database.Cursor r3 = r0.V(r3)
            java.lang.String r5 = "id"
            int r5 = r3.getColumnIndex(r5)     // Catch: java.lang.Throwable -> L119
            java.lang.String r9 = "seq"
            int r9 = r3.getColumnIndex(r9)     // Catch: java.lang.Throwable -> L119
            java.lang.String r10 = "table"
            int r10 = r3.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L119
            java.lang.String r11 = "on_delete"
            int r11 = r3.getColumnIndex(r11)     // Catch: java.lang.Throwable -> L119
            java.lang.String r12 = "on_update"
            int r12 = r3.getColumnIndex(r12)     // Catch: java.lang.Throwable -> L119
            java.util.List r13 = D5.a.C(r3)     // Catch: java.lang.Throwable -> L119
            r14 = -1
            r3.moveToPosition(r14)     // Catch: java.lang.Throwable -> L119
            o5.g r15 = new o5.g     // Catch: java.lang.Throwable -> L119
            r15.<init>()     // Catch: java.lang.Throwable -> L119
        Ld2:
            boolean r16 = r3.moveToNext()     // Catch: java.lang.Throwable -> L119
            if (r16 == 0) goto L177
            int r16 = r3.getInt(r9)     // Catch: java.lang.Throwable -> L119
            if (r16 == 0) goto Ldf
            goto Ld2
        Ldf:
            int r6 = r3.getInt(r5)     // Catch: java.lang.Throwable -> L119
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L119
            r7.<init>()     // Catch: java.lang.Throwable -> L119
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L119
            r14.<init>()     // Catch: java.lang.Throwable -> L119
            r17 = r13
            java.lang.Iterable r17 = (java.lang.Iterable) r17     // Catch: java.lang.Throwable -> L119
            r23 = r5
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L119
            r5.<init>()     // Catch: java.lang.Throwable -> L119
            java.util.Iterator r17 = r17.iterator()     // Catch: java.lang.Throwable -> L119
        Lfc:
            boolean r18 = r17.hasNext()     // Catch: java.lang.Throwable -> L119
            if (r18 == 0) goto L11d
            r24 = r9
            java.lang.Object r9 = r17.next()     // Catch: java.lang.Throwable -> L119
            r25 = r13
            r13 = r9
            f2.c r13 = (f2.c) r13     // Catch: java.lang.Throwable -> L119
            int r13 = r13.f12702q     // Catch: java.lang.Throwable -> L119
            if (r13 != r6) goto L114
            r5.add(r9)     // Catch: java.lang.Throwable -> L119
        L114:
            r9 = r24
            r13 = r25
            goto Lfc
        L119:
            r0 = move-exception
            r1 = r0
            goto L1fd
        L11d:
            r24 = r9
            r25 = r13
            int r6 = r5.size()     // Catch: java.lang.Throwable -> L119
            r9 = 0
        L126:
            if (r9 >= r6) goto L13f
            java.lang.Object r13 = r5.get(r9)     // Catch: java.lang.Throwable -> L119
            int r9 = r9 + 1
            f2.c r13 = (f2.c) r13     // Catch: java.lang.Throwable -> L119
            r17 = r5
            java.lang.String r5 = r13.f12704s     // Catch: java.lang.Throwable -> L119
            r7.add(r5)     // Catch: java.lang.Throwable -> L119
            java.lang.String r5 = r13.f12705t     // Catch: java.lang.Throwable -> L119
            r14.add(r5)     // Catch: java.lang.Throwable -> L119
            r5 = r17
            goto L126
        L13f:
            f2.b r17 = new f2.b     // Catch: java.lang.Throwable -> L119
            java.lang.String r5 = r3.getString(r10)     // Catch: java.lang.Throwable -> L119
            java.lang.String r6 = "cursor.getString(tableColumnIndex)"
            kotlin.jvm.internal.m.d(r5, r6)     // Catch: java.lang.Throwable -> L119
            java.lang.String r6 = r3.getString(r11)     // Catch: java.lang.Throwable -> L119
            java.lang.String r9 = "cursor.getString(onDeleteColumnIndex)"
            kotlin.jvm.internal.m.d(r6, r9)     // Catch: java.lang.Throwable -> L119
            java.lang.String r9 = r3.getString(r12)     // Catch: java.lang.Throwable -> L119
            java.lang.String r13 = "cursor.getString(onUpdateColumnIndex)"
            kotlin.jvm.internal.m.d(r9, r13)     // Catch: java.lang.Throwable -> L119
            r18 = r5
            r19 = r6
            r21 = r7
            r20 = r9
            r22 = r14
            r17.<init>(r18, r19, r20, r21, r22)     // Catch: java.lang.Throwable -> L119
            r5 = r17
            r15.add(r5)     // Catch: java.lang.Throwable -> L119
            r5 = r23
            r9 = r24
            r13 = r25
            r14 = -1
            goto Ld2
        L177:
            o5.g r5 = n5.AbstractC1397A.m(r15)     // Catch: java.lang.Throwable -> L119
            r3.close()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "PRAGMA index_list(`"
            r3.<init>(r6)
            r3.append(r1)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.database.Cursor r3 = r0.V(r3)
            int r4 = r3.getColumnIndex(r8)     // Catch: java.lang.Throwable -> L1e3
            java.lang.String r6 = "origin"
            int r6 = r3.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L1e3
            java.lang.String r7 = "unique"
            int r7 = r3.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L1e3
            r9 = 0
            r10 = -1
            if (r4 == r10) goto L1ee
            if (r6 == r10) goto L1ee
            if (r7 != r10) goto L1ac
            goto L1ee
        L1ac:
            o5.g r10 = new o5.g     // Catch: java.lang.Throwable -> L1e3
            r10.<init>()     // Catch: java.lang.Throwable -> L1e3
        L1b1:
            boolean r11 = r3.moveToNext()     // Catch: java.lang.Throwable -> L1e3
            if (r11 == 0) goto L1e6
            java.lang.String r11 = r3.getString(r6)     // Catch: java.lang.Throwable -> L1e3
            java.lang.String r12 = "c"
            boolean r11 = r12.equals(r11)     // Catch: java.lang.Throwable -> L1e3
            if (r11 != 0) goto L1c4
            goto L1b1
        L1c4:
            java.lang.String r11 = r3.getString(r4)     // Catch: java.lang.Throwable -> L1e3
            int r12 = r3.getInt(r7)     // Catch: java.lang.Throwable -> L1e3
            r13 = 1
            if (r12 != r13) goto L1d1
            r12 = r13
            goto L1d2
        L1d1:
            r12 = 0
        L1d2:
            kotlin.jvm.internal.m.d(r11, r8)     // Catch: java.lang.Throwable -> L1e3
            f2.d r11 = D5.a.D(r0, r11, r12)     // Catch: java.lang.Throwable -> L1e3
            if (r11 != 0) goto L1df
            r3.close()
            goto L1f1
        L1df:
            r10.add(r11)     // Catch: java.lang.Throwable -> L1e3
            goto L1b1
        L1e3:
            r0 = move-exception
            r1 = r0
            goto L1f7
        L1e6:
            o5.g r9 = n5.AbstractC1397A.m(r10)     // Catch: java.lang.Throwable -> L1e3
            r3.close()
            goto L1f1
        L1ee:
            r3.close()
        L1f1:
            f2.e r0 = new f2.e
            r0.<init>(r1, r2, r5, r9)
            return r0
        L1f7:
            throw r1     // Catch: java.lang.Throwable -> L1f8
        L1f8:
            r0 = move-exception
            com.google.android.gms.internal.measurement.I1.N(r3, r1)
            throw r0
        L1fd:
            throw r1     // Catch: java.lang.Throwable -> L1fe
        L1fe:
            r0 = move-exception
            com.google.android.gms.internal.measurement.I1.N(r3, r1)
            throw r0
        L203:
            throw r1     // Catch: java.lang.Throwable -> L204
        L204:
            r0 = move-exception
            com.google.android.gms.internal.measurement.I1.N(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.e.a(j2.a, java.lang.String):f2.e");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f12710a.equals(eVar.f12710a) || !this.f12711b.equals(eVar.f12711b) || !m.a(this.f12712c, eVar.f12712c)) {
            return false;
        }
        Set set2 = this.f12713d;
        if (set2 == null || (set = eVar.f12713d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f12712c.hashCode() + ((this.f12711b.hashCode() + (this.f12710a.hashCode() * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TableInfo{name='" + this.f12710a + "', columns=" + this.f12711b + ", foreignKeys=" + this.f12712c + ", indices=" + this.f12713d + '}';
    }
}
