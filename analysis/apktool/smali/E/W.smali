.class public final LE/W;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ/i;
.implements LZ/c;


# instance fields
.field public final a:LZ/j;

.field public final b:LZ/c;

.field public final c:Lr/H;


# direct methods
.method public constructor <init>(LZ/i;Ljava/util/Map;LZ/c;)V
    .locals 2

    .line 1
    new-instance v0, LB0/a;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, LB0/a;-><init>(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    sget-object p1, LZ/k;->a:LP/T0;

    .line 9
    .line 10
    new-instance p1, LZ/j;

    .line 11
    .line 12
    invoke-direct {p1, p2, v0}, LZ/j;-><init>(Ljava/util/Map;LB5/c;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, LE/W;->a:LZ/j;

    .line 19
    .line 20
    iput-object p3, p0, LE/W;->b:LZ/c;

    .line 21
    .line 22
    sget p1, Lr/P;->a:I

    .line 23
    .line 24
    new-instance p1, Lr/H;

    .line 25
    .line 26
    invoke-direct {p1}, Lr/H;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, LE/W;->c:Lr/H;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LE/W;->a:LZ/j;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LZ/j;->a(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final b()Ljava/util/Map;
    .locals 14

    .line 1
    iget-object v0, p0, LE/W;->c:Lr/H;

    .line 2
    .line 3
    iget-object v1, v0, Lr/H;->b:[Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v0, v0, Lr/H;->a:[J

    .line 6
    .line 7
    array-length v2, v0

    .line 8
    add-int/lit8 v2, v2, -0x2

    .line 9
    .line 10
    if-ltz v2, :cond_3

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    move v4, v3

    .line 14
    :goto_0
    aget-wide v5, v0, v4

    .line 15
    .line 16
    not-long v7, v5

    .line 17
    const/4 v9, 0x7

    .line 18
    shl-long/2addr v7, v9

    .line 19
    and-long/2addr v7, v5

    .line 20
    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    and-long/2addr v7, v9

    .line 26
    cmp-long v7, v7, v9

    .line 27
    .line 28
    if-eqz v7, :cond_2

    .line 29
    .line 30
    sub-int v7, v4, v2

    .line 31
    .line 32
    not-int v7, v7

    .line 33
    ushr-int/lit8 v7, v7, 0x1f

    .line 34
    .line 35
    const/16 v8, 0x8

    .line 36
    .line 37
    rsub-int/lit8 v7, v7, 0x8

    .line 38
    .line 39
    move v9, v3

    .line 40
    :goto_1
    if-ge v9, v7, :cond_1

    .line 41
    .line 42
    const-wide/16 v10, 0xff

    .line 43
    .line 44
    and-long/2addr v10, v5

    .line 45
    const-wide/16 v12, 0x80

    .line 46
    .line 47
    cmp-long v10, v10, v12

    .line 48
    .line 49
    if-gez v10, :cond_0

    .line 50
    .line 51
    shl-int/lit8 v10, v4, 0x3

    .line 52
    .line 53
    add-int/2addr v10, v9

    .line 54
    aget-object v10, v1, v10

    .line 55
    .line 56
    iget-object v11, p0, LE/W;->b:LZ/c;

    .line 57
    .line 58
    invoke-interface {v11, v10}, LZ/c;->e(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :cond_0
    shr-long/2addr v5, v8

    .line 62
    add-int/lit8 v9, v9, 0x1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    if-ne v7, v8, :cond_3

    .line 66
    .line 67
    :cond_2
    if-eq v4, v2, :cond_3

    .line 68
    .line 69
    add-int/lit8 v4, v4, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    iget-object v0, p0, LE/W;->a:LZ/j;

    .line 73
    .line 74
    invoke-virtual {v0}, LZ/j;->b()Ljava/util/Map;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    return-object v0
.end method

.method public final c(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LE/W;->a:LZ/j;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LZ/j;->c(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final d(Ljava/lang/String;LB5/a;)LZ/h;
    .locals 1

    .line 1
    iget-object v0, p0, LE/W;->a:LZ/j;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LZ/j;->d(Ljava/lang/String;LB5/a;)LZ/h;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final e(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE/W;->b:LZ/c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LZ/c;->e(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f(Ljava/lang/Object;LX/e;LP/o;I)V
    .locals 1

    .line 1
    const v0, -0x298e20f1

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3, v0}, LP/o;->S(I)V

    .line 5
    .line 6
    .line 7
    and-int/lit8 p4, p4, 0x7e

    .line 8
    .line 9
    iget-object v0, p0, LE/W;->b:LZ/c;

    .line 10
    .line 11
    invoke-interface {v0, p1, p2, p3, p4}, LZ/c;->f(Ljava/lang/Object;LX/e;LP/o;I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p3, p0}, LP/o;->i(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    invoke-virtual {p3, p1}, LP/o;->i(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p4

    .line 22
    or-int/2addr p2, p4

    .line 23
    invoke-virtual {p3}, LP/o;->H()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p4

    .line 27
    if-nez p2, :cond_0

    .line 28
    .line 29
    sget-object p2, LP/k;->a:LP/S;

    .line 30
    .line 31
    if-ne p4, p2, :cond_1

    .line 32
    .line 33
    :cond_0
    new-instance p4, LA/Y;

    .line 34
    .line 35
    const/16 p2, 0x9

    .line 36
    .line 37
    invoke-direct {p4, p2, p0, p1}, LA/Y;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p3, p4}, LP/o;->d0(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    check-cast p4, LB5/c;

    .line 44
    .line 45
    invoke-static {p1, p4, p3}, LP/b;->c(Ljava/lang/Object;LB5/c;LP/o;)V

    .line 46
    .line 47
    .line 48
    const/4 p1, 0x0

    .line 49
    invoke-virtual {p3, p1}, LP/o;->p(Z)V

    .line 50
    .line 51
    .line 52
    return-void
.end method
