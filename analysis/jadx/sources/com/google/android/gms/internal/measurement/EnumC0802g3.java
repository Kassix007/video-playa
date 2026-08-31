package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0802g3 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final EnumC0802g3 f10849s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final EnumC0802g3 f10850t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ EnumC0802g3[] f10851u;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final EnumC0807h3 f10852q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f10853r;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0802g3 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0802g3 EF2;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0802g3 EF0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0802g3 enumC0802g3 = new EnumC0802g3("DOUBLE", 0, EnumC0807h3.f10863t, 1);
        EnumC0802g3 enumC0802g32 = new EnumC0802g3("FLOAT", 1, EnumC0807h3.f10862s, 5);
        EnumC0807h3 enumC0807h3 = EnumC0807h3.f10861r;
        EnumC0802g3 enumC0802g33 = new EnumC0802g3("INT64", 2, enumC0807h3, 0);
        EnumC0802g3 enumC0802g34 = new EnumC0802g3("UINT64", 3, enumC0807h3, 0);
        EnumC0807h3 enumC0807h32 = EnumC0807h3.f10860q;
        EnumC0802g3 enumC0802g35 = new EnumC0802g3("INT32", 4, enumC0807h32, 0);
        EnumC0802g3 enumC0802g36 = new EnumC0802g3("FIXED64", 5, enumC0807h3, 1);
        EnumC0802g3 enumC0802g37 = new EnumC0802g3("FIXED32", 6, enumC0807h32, 5);
        EnumC0802g3 enumC0802g38 = new EnumC0802g3("BOOL", 7, EnumC0807h3.f10864u, 0);
        EnumC0802g3 enumC0802g39 = new EnumC0802g3("STRING", 8, EnumC0807h3.f10865v, 2);
        f10849s = enumC0802g39;
        EnumC0807h3 enumC0807h33 = EnumC0807h3.f10868y;
        EnumC0802g3 enumC0802g310 = new EnumC0802g3("GROUP", 9, enumC0807h33, 3);
        f10850t = enumC0802g310;
        f10851u = new EnumC0802g3[]{enumC0802g3, enumC0802g32, enumC0802g33, enumC0802g34, enumC0802g35, enumC0802g36, enumC0802g37, enumC0802g38, enumC0802g39, enumC0802g310, new EnumC0802g3("MESSAGE", 10, enumC0807h33, 2), new EnumC0802g3("BYTES", 11, EnumC0807h3.f10866w, 2), new EnumC0802g3("UINT32", 12, enumC0807h32, 0), new EnumC0802g3("ENUM", 13, EnumC0807h3.f10867x, 0), new EnumC0802g3("SFIXED32", 14, enumC0807h32, 5), new EnumC0802g3("SFIXED64", 15, enumC0807h3, 1), new EnumC0802g3("SINT32", 16, enumC0807h32, 0), new EnumC0802g3("SINT64", 17, enumC0807h3, 0)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public EnumC0802g3(String str, int i, EnumC0807h3 enumC0807h3, int i7) {
        this.f10852q = enumC0807h3;
        this.f10853r = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0802g3[] values() {
        return (EnumC0802g3[]) f10851u.clone();
    }
}
