.class public abstract LF/S;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:LF/B;

.field public static final c:LF/P;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    const/16 v0, 0x38

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    sput v0, LF/S;->a:F

    .line 5
    .line 6
    new-instance v8, LF/O;

    .line 7
    .line 8
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lq5/i;->q:Lq5/i;

    .line 12
    .line 13
    invoke-static {v0}, LM5/y;->a(Lq5/h;)LR5/d;

    .line 14
    .line 15
    .line 16
    move-result-object v9

    .line 17
    new-instance v1, LF/B;

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    sget-object v7, Lx/m;->a:Lx/m;

    .line 25
    .line 26
    invoke-direct/range {v1 .. v9}, LF/B;-><init>(IIIIILx/m;Lz0/D;LM5/w;)V

    .line 27
    .line 28
    .line 29
    sput-object v1, LF/S;->b:LF/B;

    .line 30
    .line 31
    new-instance v0, LF/P;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    sput-object v0, LF/S;->c:LF/P;

    .line 37
    .line 38
    return-void
.end method

.method public static final a(LF/B;I)J
    .locals 7

    .line 1
    iget v0, p0, LF/B;->c:I

    .line 2
    .line 3
    iget v1, p0, LF/B;->b:I

    .line 4
    .line 5
    add-int/2addr v0, v1

    .line 6
    int-to-long v1, p1

    .line 7
    int-to-long v3, v0

    .line 8
    mul-long/2addr v1, v3

    .line 9
    iget p1, p0, LF/B;->f:I

    .line 10
    .line 11
    neg-int p1, p1

    .line 12
    int-to-long v3, p1

    .line 13
    add-long/2addr v1, v3

    .line 14
    iget p1, p0, LF/B;->d:I

    .line 15
    .line 16
    int-to-long v3, p1

    .line 17
    add-long/2addr v1, v3

    .line 18
    iget p1, p0, LF/B;->c:I

    .line 19
    .line 20
    int-to-long v3, p1

    .line 21
    sub-long/2addr v1, v3

    .line 22
    iget-object p1, p0, LF/B;->e:Lw/d0;

    .line 23
    .line 24
    sget-object v0, Lw/d0;->r:Lw/d0;

    .line 25
    .line 26
    invoke-virtual {p0}, LF/B;->g()J

    .line 27
    .line 28
    .line 29
    move-result-wide v3

    .line 30
    if-ne p1, v0, :cond_0

    .line 31
    .line 32
    const/16 p1, 0x20

    .line 33
    .line 34
    shr-long/2addr v3, p1

    .line 35
    :goto_0
    long-to-int p1, v3

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    const-wide v5, 0xffffffffL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    and-long/2addr v3, v5

    .line 43
    goto :goto_0

    .line 44
    :goto_1
    iget-object p0, p0, LF/B;->m:Lx/m;

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    invoke-static {p0, p0, p1}, LD5/a;->q(III)I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    sub-int/2addr p1, p0

    .line 55
    int-to-long p0, p1

    .line 56
    sub-long/2addr v1, p0

    .line 57
    const-wide/16 p0, 0x0

    .line 58
    .line 59
    cmp-long v0, v1, p0

    .line 60
    .line 61
    if-gez v0, :cond_1

    .line 62
    .line 63
    return-wide p0

    .line 64
    :cond_1
    return-wide v1
.end method
