.class public final enum LL4/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum r:LL4/g;

.field public static final enum s:LL4/g;

.field public static final synthetic t:[LL4/g;


# instance fields
.field public final q:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, LL4/g;

    .line 2
    .line 3
    const-string v1, "RESTART"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, v1, v2, v3}, LL4/g;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, LL4/g;->r:LL4/g;

    .line 11
    .line 12
    new-instance v1, LL4/g;

    .line 13
    .line 14
    const-string v2, "REVERSE"

    .line 15
    .line 16
    const/4 v4, 0x2

    .line 17
    invoke-direct {v1, v2, v3, v4}, LL4/g;-><init>(Ljava/lang/String;II)V

    .line 18
    .line 19
    .line 20
    sput-object v1, LL4/g;->s:LL4/g;

    .line 21
    .line 22
    filled-new-array {v0, v1}, [LL4/g;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sput-object v0, LL4/g;->t:[LL4/g;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, LL4/g;->q:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LL4/g;
    .locals 1

    .line 1
    const-class v0, LL4/g;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LL4/g;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LL4/g;
    .locals 1

    .line 1
    sget-object v0, LL4/g;->t:[LL4/g;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LL4/g;

    .line 8
    .line 9
    return-object v0
.end method
