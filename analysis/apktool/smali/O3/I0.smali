.class public final enum LO3/I0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum r:LO3/I0;

.field public static final enum s:LO3/I0;

.field public static final enum t:LO3/I0;

.field public static final enum u:LO3/I0;

.field public static final synthetic v:[LO3/I0;


# instance fields
.field public final q:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, LO3/I0;

    .line 2
    .line 3
    const-string v1, "AD_STORAGE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "ad_storage"

    .line 7
    .line 8
    invoke-direct {v0, v1, v3, v2}, LO3/I0;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    sput-object v0, LO3/I0;->r:LO3/I0;

    .line 12
    .line 13
    new-instance v1, LO3/I0;

    .line 14
    .line 15
    const-string v2, "ANALYTICS_STORAGE"

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    const-string v4, "analytics_storage"

    .line 19
    .line 20
    invoke-direct {v1, v2, v4, v3}, LO3/I0;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 21
    .line 22
    .line 23
    sput-object v1, LO3/I0;->s:LO3/I0;

    .line 24
    .line 25
    new-instance v2, LO3/I0;

    .line 26
    .line 27
    const-string v3, "AD_USER_DATA"

    .line 28
    .line 29
    const/4 v4, 0x2

    .line 30
    const-string v5, "ad_user_data"

    .line 31
    .line 32
    invoke-direct {v2, v3, v5, v4}, LO3/I0;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 33
    .line 34
    .line 35
    sput-object v2, LO3/I0;->t:LO3/I0;

    .line 36
    .line 37
    new-instance v3, LO3/I0;

    .line 38
    .line 39
    const-string v4, "AD_PERSONALIZATION"

    .line 40
    .line 41
    const/4 v5, 0x3

    .line 42
    const-string v6, "ad_personalization"

    .line 43
    .line 44
    invoke-direct {v3, v4, v6, v5}, LO3/I0;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 45
    .line 46
    .line 47
    sput-object v3, LO3/I0;->u:LO3/I0;

    .line 48
    .line 49
    filled-new-array {v0, v1, v2, v3}, [LO3/I0;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, LO3/I0;->v:[LO3/I0;

    .line 54
    .line 55
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LO3/I0;->q:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static values()[LO3/I0;
    .locals 1

    .line 1
    sget-object v0, LO3/I0;->v:[LO3/I0;

    .line 2
    .line 3
    invoke-virtual {v0}, [LO3/I0;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LO3/I0;

    .line 8
    .line 9
    return-object v0
.end method
