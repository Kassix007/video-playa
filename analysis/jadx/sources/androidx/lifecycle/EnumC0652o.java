package androidx.lifecycle;

import t5.C1621b;
import t5.InterfaceC1620a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0652o {
    private static final /* synthetic */ InterfaceC1620a $ENTRIES;
    private static final /* synthetic */ EnumC0652o[] $VALUES;
    public static final C0650m Companion;
    public static final EnumC0652o ON_ANY;
    public static final EnumC0652o ON_CREATE;
    public static final EnumC0652o ON_DESTROY;
    public static final EnumC0652o ON_PAUSE;
    public static final EnumC0652o ON_RESUME;
    public static final EnumC0652o ON_START;
    public static final EnumC0652o ON_STOP;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0652o enumC0652o = new EnumC0652o("ON_CREATE", 0);
        ON_CREATE = enumC0652o;
        EnumC0652o enumC0652o2 = new EnumC0652o("ON_START", 1);
        ON_START = enumC0652o2;
        EnumC0652o enumC0652o3 = new EnumC0652o("ON_RESUME", 2);
        ON_RESUME = enumC0652o3;
        EnumC0652o enumC0652o4 = new EnumC0652o("ON_PAUSE", 3);
        ON_PAUSE = enumC0652o4;
        EnumC0652o enumC0652o5 = new EnumC0652o("ON_STOP", 4);
        ON_STOP = enumC0652o5;
        EnumC0652o enumC0652o6 = new EnumC0652o("ON_DESTROY", 5);
        ON_DESTROY = enumC0652o6;
        EnumC0652o enumC0652o7 = new EnumC0652o("ON_ANY", 6);
        ON_ANY = enumC0652o7;
        EnumC0652o[] enumC0652oArr = {enumC0652o, enumC0652o2, enumC0652o3, enumC0652o4, enumC0652o5, enumC0652o6, enumC0652o7};
        $VALUES = enumC0652oArr;
        $ENTRIES = new C1621b(enumC0652oArr);
        Companion = new C0650m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0652o valueOf(String str) {
        return (EnumC0652o) Enum.valueOf(EnumC0652o.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0652o[] values() {
        return (EnumC0652o[]) $VALUES.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final EnumC0653p a() {
        switch (AbstractC0651n.f9555a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0653p.f9558s;
            case 3:
            case 4:
                return EnumC0653p.f9559t;
            case 5:
                return EnumC0653p.f9560u;
            case 6:
                return EnumC0653p.f9556q;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                throw new C2.e();
        }
    }
}
