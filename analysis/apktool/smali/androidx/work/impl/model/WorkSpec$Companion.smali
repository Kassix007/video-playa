.class public final Landroidx/work/impl/model/WorkSpec$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/work/impl/model/WorkSpec;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/work/impl/model/WorkSpec$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final calculateNextRunTime(ZILandroidx/work/BackoffPolicy;JJIZJJJJ)J
    .locals 3

    .line 1
    const-string v0, "backoffPolicy"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-wide v0, 0x7fffffffffffffffL

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    cmp-long v2, p16, v0

    .line 12
    .line 13
    if-eqz v2, :cond_2

    .line 14
    .line 15
    if-eqz p9, :cond_2

    .line 16
    .line 17
    if-nez p8, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-wide/32 p1, 0xdbba0

    .line 21
    .line 22
    .line 23
    add-long/2addr p6, p1

    .line 24
    cmp-long p1, p16, p6

    .line 25
    .line 26
    if-gez p1, :cond_1

    .line 27
    .line 28
    return-wide p6

    .line 29
    :cond_1
    :goto_0
    return-wide p16

    .line 30
    :cond_2
    if-eqz p1, :cond_5

    .line 31
    .line 32
    sget-object p1, Landroidx/work/BackoffPolicy;->LINEAR:Landroidx/work/BackoffPolicy;

    .line 33
    .line 34
    if-ne p3, p1, :cond_3

    .line 35
    .line 36
    int-to-long p1, p2

    .line 37
    mul-long/2addr p4, p1

    .line 38
    goto :goto_1

    .line 39
    :cond_3
    long-to-float p1, p4

    .line 40
    add-int/lit8 p2, p2, -0x1

    .line 41
    .line 42
    invoke-static {p1, p2}, Ljava/lang/Math;->scalb(FI)F

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    float-to-long p4, p1

    .line 47
    :goto_1
    const-wide/32 p1, 0x112a880

    .line 48
    .line 49
    .line 50
    cmp-long p3, p4, p1

    .line 51
    .line 52
    if-lez p3, :cond_4

    .line 53
    .line 54
    move-wide p4, p1

    .line 55
    :cond_4
    add-long/2addr p6, p4

    .line 56
    return-wide p6

    .line 57
    :cond_5
    if-eqz p9, :cond_8

    .line 58
    .line 59
    if-nez p8, :cond_6

    .line 60
    .line 61
    add-long/2addr p6, p10

    .line 62
    goto :goto_2

    .line 63
    :cond_6
    add-long p6, p6, p14

    .line 64
    .line 65
    :goto_2
    cmp-long p1, p12, p14

    .line 66
    .line 67
    if-eqz p1, :cond_7

    .line 68
    .line 69
    if-nez p8, :cond_7

    .line 70
    .line 71
    sub-long p1, p14, p12

    .line 72
    .line 73
    add-long/2addr p1, p6

    .line 74
    return-wide p1

    .line 75
    :cond_7
    return-wide p6

    .line 76
    :cond_8
    const-wide/16 p1, -0x1

    .line 77
    .line 78
    cmp-long p1, p6, p1

    .line 79
    .line 80
    if-nez p1, :cond_9

    .line 81
    .line 82
    return-wide v0

    .line 83
    :cond_9
    add-long/2addr p6, p10

    .line 84
    return-wide p6
.end method
