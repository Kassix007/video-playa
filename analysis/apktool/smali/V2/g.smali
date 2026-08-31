.class public final enum LV2/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum q:LV2/g;

.field public static final synthetic r:[LV2/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LV2/g;

    .line 2
    .line 3
    const-string v1, "FILL"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    new-instance v1, LV2/g;

    .line 10
    .line 11
    const-string v2, "FIT"

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 15
    .line 16
    .line 17
    sput-object v1, LV2/g;->q:LV2/g;

    .line 18
    .line 19
    filled-new-array {v0, v1}, [LV2/g;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, LV2/g;->r:[LV2/g;

    .line 24
    .line 25
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LV2/g;
    .locals 1

    .line 1
    const-class v0, LV2/g;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LV2/g;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LV2/g;
    .locals 1

    .line 1
    sget-object v0, LV2/g;->r:[LV2/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LV2/g;

    .line 8
    .line 9
    return-object v0
.end method
