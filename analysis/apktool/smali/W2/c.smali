.class public final LW2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ2/j;


# virtual methods
.method public final a(LL2/i;LU2/n;)LJ2/k;
    .locals 12

    .line 1
    iget-object v0, p1, LL2/i;->b:Ljava/lang/String;

    .line 2
    .line 3
    iget-object p1, p1, LL2/i;->a:LJ2/q;

    .line 4
    .line 5
    const-string v1, "image/svg+xml"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_5

    .line 12
    .line 13
    invoke-interface {p1}, LJ2/q;->O()Lq6/i;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    sget-object v0, LW2/a;->b:Lq6/j;

    .line 18
    .line 19
    const-wide/16 v2, 0x0

    .line 20
    .line 21
    invoke-interface {v1, v2, v3, v0}, Lq6/i;->t(JLq6/j;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_4

    .line 26
    .line 27
    sget-object v0, LW2/a;->a:Lq6/j;

    .line 28
    .line 29
    iget-object v4, v0, Lq6/j;->q:[B

    .line 30
    .line 31
    array-length v5, v4

    .line 32
    if-lez v5, :cond_3

    .line 33
    .line 34
    const/4 v5, 0x0

    .line 35
    aget-byte v5, v4, v5

    .line 36
    .line 37
    array-length v4, v4

    .line 38
    int-to-long v6, v4

    .line 39
    const-wide/16 v8, 0x400

    .line 40
    .line 41
    sub-long/2addr v8, v6

    .line 42
    move-wide v3, v2

    .line 43
    :goto_0
    cmp-long v2, v3, v8

    .line 44
    .line 45
    const-wide/16 v10, -0x1

    .line 46
    .line 47
    if-gez v2, :cond_1

    .line 48
    .line 49
    move v2, v5

    .line 50
    move-wide v5, v8

    .line 51
    invoke-interface/range {v1 .. v6}, Lq6/i;->B(BJJ)J

    .line 52
    .line 53
    .line 54
    move-result-wide v3

    .line 55
    cmp-long v7, v3, v10

    .line 56
    .line 57
    if-eqz v7, :cond_2

    .line 58
    .line 59
    invoke-interface {v1, v3, v4, v0}, Lq6/i;->t(JLq6/j;)Z

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    if-eqz v7, :cond_0

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_0
    const-wide/16 v7, 0x1

    .line 67
    .line 68
    add-long/2addr v3, v7

    .line 69
    move-wide v8, v5

    .line 70
    move v5, v2

    .line 71
    goto :goto_0

    .line 72
    :cond_1
    move-wide v3, v10

    .line 73
    :cond_2
    :goto_1
    cmp-long v0, v3, v10

    .line 74
    .line 75
    if-eqz v0, :cond_4

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 79
    .line 80
    const-string p2, "bytes is empty"

    .line 81
    .line 82
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw p1

    .line 86
    :cond_4
    const/4 p1, 0x0

    .line 87
    return-object p1

    .line 88
    :cond_5
    :goto_2
    new-instance v0, LW2/d;

    .line 89
    .line 90
    invoke-direct {v0, p1, p2}, LW2/d;-><init>(LJ2/q;LU2/n;)V

    .line 91
    .line 92
    .line 93
    return-object v0
.end method
