.class public abstract Lt/z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LZ/m;

.field public static final b:Lu/f0;

.field public static final c:Lu/f0;

.field public static final d:Lu/f0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    sget-object v0, Lt/v;->r:Lt/v;

    .line 2
    .line 3
    sget-object v1, Lt/v;->s:Lt/v;

    .line 4
    .line 5
    sget-object v2, Lu/A0;->a:LZ/m;

    .line 6
    .line 7
    new-instance v2, LZ/m;

    .line 8
    .line 9
    const/16 v3, 0x1a

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    invoke-direct {v2, v3, v0, v1, v4}, LZ/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 13
    .line 14
    .line 15
    sput-object v2, Lt/z;->a:LZ/m;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    const/4 v1, 0x5

    .line 19
    invoke-static {v1, v0}, Lu/d;->o(ILjava/lang/Object;)Lu/f0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lt/z;->b:Lu/f0;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    int-to-long v1, v0

    .line 27
    const/16 v3, 0x20

    .line 28
    .line 29
    shl-long v3, v1, v3

    .line 30
    .line 31
    const-wide v5, 0xffffffffL

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    and-long/2addr v1, v5

    .line 37
    or-long/2addr v1, v3

    .line 38
    new-instance v3, LW0/i;

    .line 39
    .line 40
    invoke-direct {v3, v1, v2}, LW0/i;-><init>(J)V

    .line 41
    .line 42
    .line 43
    invoke-static {v0, v3}, Lu/d;->o(ILjava/lang/Object;)Lu/f0;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    sput-object v3, Lt/z;->c:Lu/f0;

    .line 48
    .line 49
    new-instance v3, LW0/k;

    .line 50
    .line 51
    invoke-direct {v3, v1, v2}, LW0/k;-><init>(J)V

    .line 52
    .line 53
    .line 54
    invoke-static {v0, v3}, Lu/d;->o(ILjava/lang/Object;)Lu/f0;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    sput-object v0, Lt/z;->d:Lu/f0;

    .line 59
    .line 60
    return-void
.end method

.method public static a(Lu/z0;)Lt/D;
    .locals 4

    .line 1
    new-instance v0, Lt/D;

    .line 2
    .line 3
    new-instance v1, Lt/L;

    .line 4
    .line 5
    new-instance v2, Lt/F;

    .line 6
    .line 7
    invoke-direct {v2, p0}, Lt/F;-><init>(Lu/z0;)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    const/16 v3, 0x3e

    .line 12
    .line 13
    invoke-direct {v1, v2, p0, p0, v3}, Lt/L;-><init>(Lt/F;LD5/a;Ljava/util/LinkedHashMap;I)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, Lt/D;-><init>(Lt/L;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public static b(Lu/z0;)Lt/E;
    .locals 4

    .line 1
    new-instance v0, Lt/E;

    .line 2
    .line 3
    new-instance v1, Lt/L;

    .line 4
    .line 5
    new-instance v2, Lt/F;

    .line 6
    .line 7
    invoke-direct {v2, p0}, Lt/F;-><init>(Lu/z0;)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    const/16 v3, 0x3e

    .line 12
    .line 13
    invoke-direct {v1, v2, p0, p0, v3}, Lt/L;-><init>(Lt/F;LD5/a;Ljava/util/LinkedHashMap;I)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, Lt/E;-><init>(Lt/L;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method
