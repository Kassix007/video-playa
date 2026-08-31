.class public final enum La3/i;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum q:La3/i;

.field public static final enum r:La3/i;

.field public static final enum s:La3/i;

.field public static final enum t:La3/i;

.field public static final enum u:La3/i;

.field public static final enum v:La3/i;

.field public static final synthetic w:[La3/i;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, La3/i;

    .line 2
    .line 3
    const-string v1, "SET_ANIMATION"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, La3/i;->q:La3/i;

    .line 10
    .line 11
    new-instance v1, La3/i;

    .line 12
    .line 13
    const-string v2, "SET_PROGRESS"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, La3/i;->r:La3/i;

    .line 20
    .line 21
    new-instance v2, La3/i;

    .line 22
    .line 23
    const-string v3, "SET_REPEAT_MODE"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v2, La3/i;->s:La3/i;

    .line 30
    .line 31
    new-instance v3, La3/i;

    .line 32
    .line 33
    const-string v4, "SET_REPEAT_COUNT"

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v3, La3/i;->t:La3/i;

    .line 40
    .line 41
    new-instance v4, La3/i;

    .line 42
    .line 43
    const-string v5, "SET_IMAGE_ASSETS"

    .line 44
    .line 45
    const/4 v6, 0x4

    .line 46
    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v4, La3/i;->u:La3/i;

    .line 50
    .line 51
    new-instance v5, La3/i;

    .line 52
    .line 53
    const-string v6, "PLAY_OPTION"

    .line 54
    .line 55
    const/4 v7, 0x5

    .line 56
    invoke-direct {v5, v6, v7}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v5, La3/i;->v:La3/i;

    .line 60
    .line 61
    filled-new-array/range {v0 .. v5}, [La3/i;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sput-object v0, La3/i;->w:[La3/i;

    .line 66
    .line 67
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La3/i;
    .locals 1

    .line 1
    const-class v0, La3/i;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La3/i;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La3/i;
    .locals 1

    .line 1
    sget-object v0, La3/i;->w:[La3/i;

    .line 2
    .line 3
    invoke-virtual {v0}, [La3/i;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La3/i;

    .line 8
    .line 9
    return-object v0
.end method
