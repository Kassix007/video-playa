.class public abstract Lw/p0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lw/l0;

.field public static final b:Lw/k0;

.field public static final c:Lw/m0;

.field public static final d:[Ljava/lang/StackTraceElement;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lw/l0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lw/p0;->a:Lw/l0;

    .line 7
    .line 8
    new-instance v0, Lw/k0;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lw/p0;->b:Lw/k0;

    .line 14
    .line 15
    new-instance v0, Lw/m0;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lw/p0;->c:Lw/m0;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    new-array v0, v0, [Ljava/lang/StackTraceElement;

    .line 24
    .line 25
    sput-object v0, Lw/p0;->d:[Ljava/lang/StackTraceElement;

    .line 26
    .line 27
    return-void
.end method

.method public static final a(Lw/H0;JLs5/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p3, Lw/n0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lw/n0;

    .line 7
    .line 8
    iget v1, v0, Lw/n0;->t:I

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
    iput v1, v0, Lw/n0;->t:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lw/n0;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Ls5/c;-><init>(Lq5/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lw/n0;->s:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lw/n0;->t:I

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
    iget-object p0, v0, Lw/n0;->r:Lkotlin/jvm/internal/v;

    .line 35
    .line 36
    iget-object p1, v0, Lw/n0;->q:Lw/H0;

    .line 37
    .line 38
    invoke-static {p3}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    move-object v7, p0

    .line 42
    move-object p0, p1

    .line 43
    goto :goto_1

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
    new-instance v7, Lkotlin/jvm/internal/v;

    .line 56
    .line 57
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 58
    .line 59
    .line 60
    new-instance v3, Lw/o0;

    .line 61
    .line 62
    const/4 v8, 0x0

    .line 63
    move-object v4, p0

    .line 64
    move-wide v5, p1

    .line 65
    invoke-direct/range {v3 .. v8}, Lw/o0;-><init>(Lw/H0;JLkotlin/jvm/internal/v;Lq5/c;)V

    .line 66
    .line 67
    .line 68
    iput-object v4, v0, Lw/n0;->q:Lw/H0;

    .line 69
    .line 70
    iput-object v7, v0, Lw/n0;->r:Lkotlin/jvm/internal/v;

    .line 71
    .line 72
    iput v2, v0, Lw/n0;->t:I

    .line 73
    .line 74
    sget-object p0, Lv/W;->q:Lv/W;

    .line 75
    .line 76
    invoke-virtual {v4, p0, v3, v0}, Lw/H0;->f(Lv/W;LB5/e;Ls5/c;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

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
    move-object p0, v4

    .line 86
    :goto_1
    iget p1, v7, Lkotlin/jvm/internal/v;->q:F

    .line 87
    .line 88
    invoke-virtual {p0, p1}, Lw/H0;->h(F)J

    .line 89
    .line 90
    .line 91
    move-result-wide p0

    .line 92
    new-instance p2, Li0/b;

    .line 93
    .line 94
    invoke-direct {p2, p0, p1}, Li0/b;-><init>(J)V

    .line 95
    .line 96
    .line 97
    return-object p2
.end method

.method public static final b(Lv0/y;Lv0/g;Ls5/a;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Lw/J;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lw/J;

    .line 7
    .line 8
    iget v1, v0, Lw/J;->t:I

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
    iput v1, v0, Lw/J;->t:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lw/J;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Ls5/c;-><init>(Lq5/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lw/J;->s:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lw/J;->t:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    iget-object p0, v0, Lw/J;->r:Lv0/g;

    .line 36
    .line 37
    iget-object p1, v0, Lw/J;->q:Lv0/y;

    .line 38
    .line 39
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object v6, p1

    .line 43
    move-object p1, p0

    .line 44
    move-object p0, v6

    .line 45
    goto :goto_3

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
    iget-object p2, p0, Lv0/y;->v:Lv0/A;

    .line 58
    .line 59
    iget-object p2, p2, Lv0/A;->I:Lv0/f;

    .line 60
    .line 61
    iget-object p2, p2, Lv0/f;->a:Ljava/lang/Object;

    .line 62
    .line 63
    move-object v1, p2

    .line 64
    check-cast v1, Ljava/util/Collection;

    .line 65
    .line 66
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    move v4, v2

    .line 71
    :goto_1
    if-ge v4, v1, :cond_6

    .line 72
    .line 73
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    check-cast v5, Lv0/l;

    .line 78
    .line 79
    iget-boolean v5, v5, Lv0/l;->d:Z

    .line 80
    .line 81
    if-eqz v5, :cond_5

    .line 82
    .line 83
    :goto_2
    iput-object p0, v0, Lw/J;->q:Lv0/y;

    .line 84
    .line 85
    iput-object p1, v0, Lw/J;->r:Lv0/g;

    .line 86
    .line 87
    iput v3, v0, Lw/J;->t:I

    .line 88
    .line 89
    invoke-virtual {p0, p1, v0}, Lv0/y;->a(Lv0/g;Ls5/a;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    sget-object v1, Lr5/a;->q:Lr5/a;

    .line 94
    .line 95
    if-ne p2, v1, :cond_3

    .line 96
    .line 97
    return-object v1

    .line 98
    :cond_3
    :goto_3
    check-cast p2, Lv0/f;

    .line 99
    .line 100
    iget-object p2, p2, Lv0/f;->a:Ljava/lang/Object;

    .line 101
    .line 102
    move-object v1, p2

    .line 103
    check-cast v1, Ljava/util/Collection;

    .line 104
    .line 105
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    move v4, v2

    .line 110
    :goto_4
    if-ge v4, v1, :cond_6

    .line 111
    .line 112
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    check-cast v5, Lv0/l;

    .line 117
    .line 118
    iget-boolean v5, v5, Lv0/l;->d:Z

    .line 119
    .line 120
    if-eqz v5, :cond_4

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_5
    add-int/lit8 v4, v4, 0x1

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_6
    sget-object p0, Lm5/y;->a:Lm5/y;

    .line 130
    .line 131
    return-object p0
.end method

.method public static final c(Lv0/o;LB5/e;Lq5/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-interface {p2}, Lq5/c;->getContext()Lq5/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lw/K;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, v0, p1, v2}, Lw/K;-><init>(Lq5/h;LB5/e;Lq5/c;)V

    .line 9
    .line 10
    .line 11
    check-cast p0, Lv0/A;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance p1, LM5/h;

    .line 17
    .line 18
    invoke-static {p2}, Ln5/A;->v(Lq5/c;)Lq5/c;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    const/4 v0, 0x1

    .line 23
    invoke-direct {p1, v0, p2}, LM5/h;-><init>(ILq5/c;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, LM5/h;->s()V

    .line 27
    .line 28
    .line 29
    new-instance p2, Lv0/y;

    .line 30
    .line 31
    invoke-direct {p2, p0, p1}, Lv0/y;-><init>(Lv0/A;LM5/h;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lv0/A;->K:LR/e;

    .line 35
    .line 36
    monitor-enter v0

    .line 37
    :try_start_0
    iget-object p0, p0, Lv0/A;->J:LR/e;

    .line 38
    .line 39
    invoke-virtual {p0, p2}, LR/e;->c(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    new-instance p0, Lq5/j;

    .line 43
    .line 44
    invoke-static {v1, p2, p2}, Ln5/A;->p(LB5/e;Lq5/c;Lq5/c;)Lq5/c;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {v1}, Ln5/A;->v(Lq5/c;)Lq5/c;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    sget-object v2, Lr5/a;->q:Lr5/a;

    .line 53
    .line 54
    invoke-direct {p0, v1}, Lq5/j;-><init>(Lq5/c;)V

    .line 55
    .line 56
    .line 57
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 58
    .line 59
    invoke-virtual {p0, v1}, Lq5/j;->resumeWith(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    monitor-exit v0

    .line 63
    new-instance p0, Lm0/a;

    .line 64
    .line 65
    const/16 v0, 0x8

    .line 66
    .line 67
    invoke-direct {p0, v0, p2}, Lm0/a;-><init>(ILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, p0}, LM5/h;->u(LB5/c;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, LM5/h;->r()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    if-ne p0, v2, :cond_0

    .line 78
    .line 79
    return-object p0

    .line 80
    :cond_0
    return-object v1

    .line 81
    :catchall_0
    move-exception p0

    .line 82
    monitor-exit v0

    .line 83
    throw p0
.end method
