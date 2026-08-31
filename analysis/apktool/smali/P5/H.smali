.class public abstract LP5/H;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LE4/f;

.field public static final b:LE4/f;

.field public static final c:LE4/f;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LE4/f;

    .line 2
    .line 3
    const-string v1, "NO_VALUE"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v0, v1, v2}, LE4/f;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LP5/H;->a:LE4/f;

    .line 10
    .line 11
    new-instance v0, LE4/f;

    .line 12
    .line 13
    const-string v1, "NONE"

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, LE4/f;-><init>(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    sput-object v0, LP5/H;->b:LE4/f;

    .line 19
    .line 20
    new-instance v0, LE4/f;

    .line 21
    .line 22
    const-string v1, "PENDING"

    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, LE4/f;-><init>(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    sput-object v0, LP5/H;->c:LE4/f;

    .line 28
    .line 29
    return-void
.end method

.method public static a(I)LP5/G;
    .locals 2

    .line 1
    and-int/lit8 v0, p0, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    :goto_0
    and-int/lit8 p0, p0, 0x2

    .line 10
    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_1
    const/16 v1, 0x10

    .line 15
    .line 16
    :goto_1
    if-ltz v0, :cond_6

    .line 17
    .line 18
    if-ltz v1, :cond_5

    .line 19
    .line 20
    if-gtz v0, :cond_3

    .line 21
    .line 22
    if-lez v1, :cond_2

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v0, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy "

    .line 28
    .line 29
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    sget-object v0, LO5/a;->r:LO5/a;

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v0

    .line 51
    :cond_3
    :goto_2
    add-int/2addr v1, v0

    .line 52
    if-gez v1, :cond_4

    .line 53
    .line 54
    const v1, 0x7fffffff

    .line 55
    .line 56
    .line 57
    :cond_4
    new-instance p0, LP5/G;

    .line 58
    .line 59
    invoke-direct {p0, v0, v1}, LP5/G;-><init>(II)V

    .line 60
    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_5
    const-string p0, "extraBufferCapacity cannot be negative, but was "

    .line 64
    .line 65
    invoke-static {v1, p0}, Lk1/i;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 70
    .line 71
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw v0

    .line 79
    :cond_6
    const-string p0, "replay cannot be negative, but was "

    .line 80
    .line 81
    invoke-static {v0, p0}, Lk1/i;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 86
    .line 87
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw v0
.end method

.method public static final b(Ljava/lang/Object;)LP5/S;
    .locals 1

    .line 1
    new-instance v0, LP5/S;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    sget-object p0, LQ5/c;->b:LE4/f;

    .line 6
    .line 7
    :cond_0
    invoke-direct {v0, p0}, LP5/S;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static final c(LP5/U;Lc/f;Ljava/lang/Throwable;Ls5/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, LP5/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, LP5/l;

    .line 7
    .line 8
    iget v1, v0, LP5/l;->s:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LP5/l;->s:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LP5/l;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Ls5/c;-><init>(Lq5/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, LP5/l;->r:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, LP5/l;->s:I

    .line 28
    .line 29
    sget-object v2, Lm5/y;->a:Lm5/y;

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    if-ne v1, v3, :cond_1

    .line 35
    .line 36
    iget-object p2, v0, LP5/l;->q:Ljava/lang/Throwable;

    .line 37
    .line 38
    :try_start_0
    invoke-static {p3}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    goto :goto_2

    .line 44
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p0

    .line 52
    :cond_2
    invoke-static {p3}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :try_start_1
    iput-object p2, v0, LP5/l;->q:Ljava/lang/Throwable;

    .line 56
    .line 57
    iput v3, v0, LP5/l;->s:I

    .line 58
    .line 59
    invoke-virtual {p1, p0, p2, v0}, Lc/f;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 60
    .line 61
    .line 62
    sget-object p0, Lr5/a;->q:Lr5/a;

    .line 63
    .line 64
    if-ne v2, p0, :cond_3

    .line 65
    .line 66
    return-object p0

    .line 67
    :cond_3
    :goto_1
    return-object v2

    .line 68
    :goto_2
    if-eqz p2, :cond_4

    .line 69
    .line 70
    if-eq p2, p0, :cond_4

    .line 71
    .line 72
    invoke-static {p0, p2}, Lm5/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    :cond_4
    throw p0
.end method

.method public static final d([Ljava/lang/Object;JLjava/lang/Object;)V
    .locals 0

    .line 1
    long-to-int p1, p1

    .line 2
    array-length p2, p0

    .line 3
    add-int/lit8 p2, p2, -0x1

    .line 4
    .line 5
    and-int/2addr p1, p2

    .line 6
    aput-object p3, p0, p1

    .line 7
    .line 8
    return-void
.end method

.method public static e(LP5/h;I)LP5/h;
    .locals 7

    .line 1
    const/4 v0, -0x1

    .line 2
    if-gez p1, :cond_1

    .line 3
    .line 4
    const/4 v1, -0x2

    .line 5
    if-eq p1, v1, :cond_1

    .line 6
    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string p0, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "

    .line 11
    .line 12
    invoke-static {p1, p0}, Lk1/i;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1

    .line 26
    :cond_1
    :goto_0
    if-ne p1, v0, :cond_2

    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    sget-object v0, LO5/a;->r:LO5/a;

    .line 30
    .line 31
    :goto_1
    move v4, p1

    .line 32
    move-object v5, v0

    .line 33
    goto :goto_2

    .line 34
    :cond_2
    sget-object v0, LO5/a;->q:LO5/a;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :goto_2
    instance-of p1, p0, LQ5/v;

    .line 38
    .line 39
    if-eqz p1, :cond_3

    .line 40
    .line 41
    check-cast p0, LQ5/v;

    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    const/4 v0, 0x1

    .line 45
    invoke-static {p0, p1, v4, v5, v0}, LQ5/c;->a(LQ5/v;LM5/s;ILO5/a;I)LP5/h;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    :cond_3
    new-instance v1, LQ5/j;

    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    const/4 v6, 0x2

    .line 54
    move-object v2, p0

    .line 55
    invoke-direct/range {v1 .. v6}, LQ5/j;-><init>(LP5/h;LM5/s;ILO5/a;I)V

    .line 56
    .line 57
    .line 58
    return-object v1
.end method

.method public static final f(LP5/h;LP5/i;Ls5/c;)Ljava/io/Serializable;
    .locals 4

    .line 1
    instance-of v0, p2, LP5/o;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LP5/o;

    .line 7
    .line 8
    iget v1, v0, LP5/o;->s:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LP5/o;->s:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LP5/o;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Ls5/c;-><init>(Lq5/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LP5/o;->r:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, LP5/o;->s:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object p0, v0, LP5/o;->q:Lkotlin/jvm/internal/y;

    .line 35
    .line 36
    :try_start_0
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    goto :goto_2

    .line 42
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p0

    .line 50
    :cond_2
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    new-instance p2, Lkotlin/jvm/internal/y;

    .line 54
    .line 55
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 56
    .line 57
    .line 58
    :try_start_1
    new-instance v1, LP5/f;

    .line 59
    .line 60
    invoke-direct {v1, p1, p2}, LP5/f;-><init>(LP5/i;Lkotlin/jvm/internal/y;)V

    .line 61
    .line 62
    .line 63
    iput-object p2, v0, LP5/o;->q:Lkotlin/jvm/internal/y;

    .line 64
    .line 65
    iput v2, v0, LP5/o;->s:I

    .line 66
    .line 67
    invoke-interface {p0, v1, v0}, LP5/h;->collect(LP5/i;Lq5/c;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 71
    sget-object p1, Lr5/a;->q:Lr5/a;

    .line 72
    .line 73
    if-ne p0, p1, :cond_3

    .line 74
    .line 75
    return-object p1

    .line 76
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 77
    return-object p0

    .line 78
    :catchall_1
    move-exception p1

    .line 79
    move-object p0, p2

    .line 80
    :goto_2
    iget-object p0, p0, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p0, Ljava/lang/Throwable;

    .line 83
    .line 84
    if-eqz p0, :cond_4

    .line 85
    .line 86
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    if-nez p2, :cond_6

    .line 91
    .line 92
    :cond_4
    invoke-interface {v0}, Lq5/c;->getContext()Lq5/h;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    sget-object v0, LM5/t;->r:LM5/t;

    .line 97
    .line 98
    invoke-interface {p2, v0}, Lq5/h;->get(Lq5/g;)Lq5/f;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    check-cast p2, LM5/b0;

    .line 103
    .line 104
    if-eqz p2, :cond_7

    .line 105
    .line 106
    invoke-interface {p2}, LM5/b0;->isCancelled()Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-nez v0, :cond_5

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_5
    invoke-interface {p2}, LM5/b0;->v()Ljava/util/concurrent/CancellationException;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    if-eqz p2, :cond_7

    .line 118
    .line 119
    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    if-nez p2, :cond_6

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_6
    throw p1

    .line 127
    :cond_7
    :goto_3
    if-nez p0, :cond_8

    .line 128
    .line 129
    return-object p1

    .line 130
    :cond_8
    instance-of p2, p1, Ljava/util/concurrent/CancellationException;

    .line 131
    .line 132
    if-eqz p2, :cond_9

    .line 133
    .line 134
    invoke-static {p0, p1}, Lm5/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 135
    .line 136
    .line 137
    throw p0

    .line 138
    :cond_9
    invoke-static {p1, p0}, Lm5/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 139
    .line 140
    .line 141
    throw p1
.end method

.method public static final g(LP5/h;)LP5/h;
    .locals 1

    .line 1
    instance-of v0, p0, LP5/P;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    instance-of v0, p0, LP5/g;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    move-object v0, p0

    .line 11
    check-cast v0, LP5/g;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_1
    new-instance v0, LP5/g;

    .line 18
    .line 19
    invoke-direct {v0, p0}, LP5/g;-><init>(LP5/h;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public static final h(LP5/i;LO5/v;ZLq5/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p3, LP5/j;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, LP5/j;

    .line 7
    .line 8
    iget v1, v0, LP5/j;->v:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LP5/j;->v:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LP5/j;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Ls5/c;-><init>(Lq5/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, LP5/j;->u:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, LP5/j;->v:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x2

    .line 31
    const/4 v4, 0x1

    .line 32
    sget-object v5, Lr5/a;->q:Lr5/a;

    .line 33
    .line 34
    if-eqz v1, :cond_4

    .line 35
    .line 36
    if-eq v1, v4, :cond_3

    .line 37
    .line 38
    if-ne v1, v3, :cond_2

    .line 39
    .line 40
    iget-boolean p2, v0, LP5/j;->t:Z

    .line 41
    .line 42
    iget-object p0, v0, LP5/j;->s:LO5/b;

    .line 43
    .line 44
    iget-object p1, v0, LP5/j;->r:LO5/v;

    .line 45
    .line 46
    iget-object v1, v0, LP5/j;->q:LP5/i;

    .line 47
    .line 48
    :try_start_0
    invoke-static {p3}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    :cond_1
    move-object p3, p0

    .line 52
    move-object p0, v1

    .line 53
    goto :goto_1

    .line 54
    :catchall_0
    move-exception p0

    .line 55
    goto :goto_4

    .line 56
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p0

    .line 64
    :cond_3
    iget-boolean p2, v0, LP5/j;->t:Z

    .line 65
    .line 66
    iget-object p0, v0, LP5/j;->s:LO5/b;

    .line 67
    .line 68
    iget-object p1, v0, LP5/j;->r:LO5/v;

    .line 69
    .line 70
    iget-object v1, v0, LP5/j;->q:LP5/i;

    .line 71
    .line 72
    :try_start_1
    invoke-static {p3}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_4
    invoke-static {p3}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    instance-of p3, p0, LP5/U;

    .line 80
    .line 81
    if-nez p3, :cond_b

    .line 82
    .line 83
    :try_start_2
    invoke-interface {p1}, LO5/v;->iterator()LO5/b;

    .line 84
    .line 85
    .line 86
    move-result-object p3

    .line 87
    :goto_1
    iput-object p0, v0, LP5/j;->q:LP5/i;

    .line 88
    .line 89
    iput-object p1, v0, LP5/j;->r:LO5/v;

    .line 90
    .line 91
    iput-object p3, v0, LP5/j;->s:LO5/b;

    .line 92
    .line 93
    iput-boolean p2, v0, LP5/j;->t:Z

    .line 94
    .line 95
    iput v4, v0, LP5/j;->v:I

    .line 96
    .line 97
    invoke-virtual {p3, v0}, LO5/b;->b(Ls5/c;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    if-ne v1, v5, :cond_5

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_5
    move-object v6, v1

    .line 105
    move-object v1, p0

    .line 106
    move-object p0, p3

    .line 107
    move-object p3, v6

    .line 108
    :goto_2
    check-cast p3, Ljava/lang/Boolean;

    .line 109
    .line 110
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 111
    .line 112
    .line 113
    move-result p3

    .line 114
    if-eqz p3, :cond_6

    .line 115
    .line 116
    invoke-virtual {p0}, LO5/b;->c()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p3

    .line 120
    iput-object v1, v0, LP5/j;->q:LP5/i;

    .line 121
    .line 122
    iput-object p1, v0, LP5/j;->r:LO5/v;

    .line 123
    .line 124
    iput-object p0, v0, LP5/j;->s:LO5/b;

    .line 125
    .line 126
    iput-boolean p2, v0, LP5/j;->t:Z

    .line 127
    .line 128
    iput v3, v0, LP5/j;->v:I

    .line 129
    .line 130
    invoke-interface {v1, p3, v0}, LP5/i;->emit(Ljava/lang/Object;Lq5/c;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 134
    if-ne p3, v5, :cond_1

    .line 135
    .line 136
    :goto_3
    return-object v5

    .line 137
    :cond_6
    if-eqz p2, :cond_7

    .line 138
    .line 139
    invoke-interface {p1, v2}, LO5/v;->a(Ljava/util/concurrent/CancellationException;)V

    .line 140
    .line 141
    .line 142
    :cond_7
    sget-object p0, Lm5/y;->a:Lm5/y;

    .line 143
    .line 144
    return-object p0

    .line 145
    :goto_4
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 146
    :catchall_1
    move-exception p3

    .line 147
    if-eqz p2, :cond_a

    .line 148
    .line 149
    instance-of p2, p0, Ljava/util/concurrent/CancellationException;

    .line 150
    .line 151
    if-eqz p2, :cond_8

    .line 152
    .line 153
    move-object v2, p0

    .line 154
    check-cast v2, Ljava/util/concurrent/CancellationException;

    .line 155
    .line 156
    :cond_8
    if-nez v2, :cond_9

    .line 157
    .line 158
    new-instance v2, Ljava/util/concurrent/CancellationException;

    .line 159
    .line 160
    const-string p2, "Channel was consumed, consumer had failed"

    .line 161
    .line 162
    invoke-direct {v2, p2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 166
    .line 167
    .line 168
    :cond_9
    invoke-interface {p1, v2}, LO5/v;->a(Ljava/util/concurrent/CancellationException;)V

    .line 169
    .line 170
    .line 171
    :cond_a
    throw p3

    .line 172
    :cond_b
    check-cast p0, LP5/U;

    .line 173
    .line 174
    iget-object p0, p0, LP5/U;->q:Ljava/lang/Throwable;

    .line 175
    .line 176
    throw p0
.end method

.method public static final i(LP5/h;LB5/e;Ls5/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, LQ5/c;->b:LE4/f;

    .line 2
    .line 3
    instance-of v1, p2, LP5/x;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p2

    .line 8
    check-cast v1, LP5/x;

    .line 9
    .line 10
    iget v2, v1, LP5/x;->t:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, LP5/x;->t:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, LP5/x;

    .line 23
    .line 24
    invoke-direct {v1, p2}, Ls5/c;-><init>(Lq5/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p2, v1, LP5/x;->s:Ljava/lang/Object;

    .line 28
    .line 29
    iget v2, v1, LP5/x;->t:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v1, LP5/x;->r:LL/e;

    .line 37
    .line 38
    iget-object p1, v1, LP5/x;->q:Lkotlin/jvm/internal/y;

    .line 39
    .line 40
    :try_start_0
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catch LQ5/a; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    goto :goto_2

    .line 44
    :catch_0
    move-exception p2

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :cond_2
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    new-instance p2, Lkotlin/jvm/internal/y;

    .line 58
    .line 59
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object v0, p2, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 63
    .line 64
    new-instance v2, LL/e;

    .line 65
    .line 66
    const/4 v4, 0x2

    .line 67
    invoke-direct {v2, v4, p1, p2}, LL/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :try_start_1
    iput-object p2, v1, LP5/x;->q:Lkotlin/jvm/internal/y;

    .line 71
    .line 72
    iput-object v2, v1, LP5/x;->r:LL/e;

    .line 73
    .line 74
    iput v3, v1, LP5/x;->t:I

    .line 75
    .line 76
    invoke-interface {p0, v2, v1}, LP5/h;->collect(LP5/i;Lq5/c;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0
    :try_end_1
    .catch LQ5/a; {:try_start_1 .. :try_end_1} :catch_1

    .line 80
    sget-object p1, Lr5/a;->q:Lr5/a;

    .line 81
    .line 82
    if-ne p0, p1, :cond_3

    .line 83
    .line 84
    return-object p1

    .line 85
    :cond_3
    move-object p1, p2

    .line 86
    goto :goto_2

    .line 87
    :catch_1
    move-exception p0

    .line 88
    move-object p1, p2

    .line 89
    move-object p2, p0

    .line 90
    move-object p0, v2

    .line 91
    :goto_1
    iget-object v2, p2, LQ5/a;->q:Ljava/lang/Object;

    .line 92
    .line 93
    if-ne v2, p0, :cond_5

    .line 94
    .line 95
    invoke-interface {v1}, Lq5/c;->getContext()Lq5/h;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-static {p0}, LM5/y;->i(Lq5/h;)V

    .line 100
    .line 101
    .line 102
    :goto_2
    iget-object p0, p1, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 103
    .line 104
    if-eq p0, v0, :cond_4

    .line 105
    .line 106
    return-object p0

    .line 107
    :cond_4
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 108
    .line 109
    const-string p1, "Expected at least one element matching the predicate"

    .line 110
    .line 111
    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw p0

    .line 115
    :cond_5
    throw p2
.end method

.method public static final j(LP5/h;Ls5/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, LQ5/c;->b:LE4/f;

    .line 2
    .line 3
    instance-of v1, p1, LP5/w;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p1

    .line 8
    check-cast v1, LP5/w;

    .line 9
    .line 10
    iget v2, v1, LP5/w;->t:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, LP5/w;->t:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, LP5/w;

    .line 23
    .line 24
    invoke-direct {v1, p1}, Ls5/c;-><init>(Lq5/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p1, v1, LP5/w;->s:Ljava/lang/Object;

    .line 28
    .line 29
    iget v2, v1, LP5/w;->t:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v1, LP5/w;->r:LC0/m1;

    .line 37
    .line 38
    iget-object v2, v1, LP5/w;->q:Lkotlin/jvm/internal/y;

    .line 39
    .line 40
    :try_start_0
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catch LQ5/a; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    goto :goto_2

    .line 44
    :catch_0
    move-exception p1

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :cond_2
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    new-instance v2, Lkotlin/jvm/internal/y;

    .line 58
    .line 59
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object v0, v2, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 63
    .line 64
    new-instance p1, LC0/m1;

    .line 65
    .line 66
    const/4 v4, 0x1

    .line 67
    invoke-direct {p1, v4, v2}, LC0/m1;-><init>(ILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :try_start_1
    iput-object v2, v1, LP5/w;->q:Lkotlin/jvm/internal/y;

    .line 71
    .line 72
    iput-object p1, v1, LP5/w;->r:LC0/m1;

    .line 73
    .line 74
    iput v3, v1, LP5/w;->t:I

    .line 75
    .line 76
    invoke-interface {p0, p1, v1}, LP5/h;->collect(LP5/i;Lq5/c;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0
    :try_end_1
    .catch LQ5/a; {:try_start_1 .. :try_end_1} :catch_1

    .line 80
    sget-object p1, Lr5/a;->q:Lr5/a;

    .line 81
    .line 82
    if-ne p0, p1, :cond_3

    .line 83
    .line 84
    return-object p1

    .line 85
    :catch_1
    move-exception p0

    .line 86
    move-object v5, p1

    .line 87
    move-object p1, p0

    .line 88
    move-object p0, v5

    .line 89
    :goto_1
    iget-object v3, p1, LQ5/a;->q:Ljava/lang/Object;

    .line 90
    .line 91
    if-ne v3, p0, :cond_5

    .line 92
    .line 93
    invoke-interface {v1}, Lq5/c;->getContext()Lq5/h;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-static {p0}, LM5/y;->i(Lq5/h;)V

    .line 98
    .line 99
    .line 100
    :cond_3
    :goto_2
    iget-object p0, v2, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 101
    .line 102
    if-eq p0, v0, :cond_4

    .line 103
    .line 104
    return-object p0

    .line 105
    :cond_4
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 106
    .line 107
    const-string p1, "Expected at least one element"

    .line 108
    .line 109
    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw p0

    .line 113
    :cond_5
    throw p1
.end method

.method public static final k(Lu2/m;LR5/d;LP5/O;Ljava/lang/Float;)LP5/D;
    .locals 8

    .line 1
    sget-object v0, LO5/i;->b:LO5/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, LO5/h;->a:LO5/h;

    .line 7
    .line 8
    new-instance v0, LB0/o;

    .line 9
    .line 10
    sget-object v1, Lq5/i;->q:Lq5/i;

    .line 11
    .line 12
    invoke-direct {v0, p0, v1}, LB0/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p3}, LP5/H;->b(Ljava/lang/Object;)LP5/S;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    iget-object p0, v0, LB0/o;->r:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Lq5/h;

    .line 22
    .line 23
    iget-object v0, v0, LB0/o;->q:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v4, v0

    .line 26
    check-cast v4, LP5/h;

    .line 27
    .line 28
    sget-object v0, LP5/K;->a:LP5/L;

    .line 29
    .line 30
    invoke-virtual {p2, v0}, LP5/O;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    sget-object v0, LM5/x;->q:LM5/x;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    sget-object v0, LM5/x;->t:LM5/x;

    .line 40
    .line 41
    :goto_0
    new-instance v2, LP5/A;

    .line 42
    .line 43
    const/4 v7, 0x0

    .line 44
    move-object v3, p2

    .line 45
    move-object v6, p3

    .line 46
    invoke-direct/range {v2 .. v7}, LP5/A;-><init>(LP5/O;LP5/h;LP5/S;Ljava/lang/Float;Lq5/c;)V

    .line 47
    .line 48
    .line 49
    invoke-static {p1, p0}, LM5/y;->u(LM5/w;Lq5/h;)Lq5/h;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    sget-object p1, LM5/x;->r:LM5/x;

    .line 54
    .line 55
    if-ne v0, p1, :cond_1

    .line 56
    .line 57
    new-instance p1, LM5/j0;

    .line 58
    .line 59
    invoke-direct {p1, p0, v2}, LM5/j0;-><init>(Lq5/h;LB5/e;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    new-instance p1, LM5/B;

    .line 64
    .line 65
    const/4 p2, 0x1

    .line 66
    invoke-direct {p1, p0, p2, p2}, LM5/B;-><init>(Lq5/h;ZI)V

    .line 67
    .line 68
    .line 69
    :goto_1
    invoke-virtual {p1, v0, p1, v2}, LM5/a;->d0(LM5/x;LM5/a;LB5/e;)V

    .line 70
    .line 71
    .line 72
    new-instance p0, LP5/D;

    .line 73
    .line 74
    invoke-direct {p0, v5}, LP5/D;-><init>(LP5/S;)V

    .line 75
    .line 76
    .line 77
    return-object p0
.end method
