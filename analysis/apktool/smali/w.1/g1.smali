.class public abstract Lw/g1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Le3/u;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Le3/u;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x3

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-direct {v0, v1, v3, v2}, Le3/u;-><init>(ILq5/c;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lw/g1;->a:Le3/u;

    .line 10
    .line 11
    return-void
.end method

.method public static final a(Lv0/y;Ls5/a;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, Lw/J0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lw/J0;

    .line 7
    .line 8
    iget v1, v0, Lw/J0;->s:I

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
    iput v1, v0, Lw/J0;->s:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lw/J0;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Ls5/c;-><init>(Lq5/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lw/J0;->r:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lw/J0;->s:I

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
    iget-object p0, v0, Lw/J0;->q:Lv0/y;

    .line 35
    .line 36
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p0

    .line 48
    :cond_2
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :goto_1
    iput-object p0, v0, Lw/J0;->q:Lv0/y;

    .line 52
    .line 53
    iput v2, v0, Lw/J0;->s:I

    .line 54
    .line 55
    sget-object p1, Lv0/g;->r:Lv0/g;

    .line 56
    .line 57
    invoke-virtual {p0, p1, v0}, Lv0/y;->a(Lv0/g;Ls5/a;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    sget-object v1, Lr5/a;->q:Lr5/a;

    .line 62
    .line 63
    if-ne p1, v1, :cond_3

    .line 64
    .line 65
    return-object v1

    .line 66
    :cond_3
    :goto_2
    check-cast p1, Lv0/f;

    .line 67
    .line 68
    iget-object v1, p1, Lv0/f;->a:Ljava/lang/Object;

    .line 69
    .line 70
    move-object v3, v1

    .line 71
    check-cast v3, Ljava/util/Collection;

    .line 72
    .line 73
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    const/4 v4, 0x0

    .line 78
    move v5, v4

    .line 79
    :goto_3
    if-ge v5, v3, :cond_4

    .line 80
    .line 81
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    check-cast v6, Lv0/l;

    .line 86
    .line 87
    invoke-virtual {v6}, Lv0/l;->a()V

    .line 88
    .line 89
    .line 90
    add-int/lit8 v5, v5, 0x1

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_4
    iget-object p1, p1, Lv0/f;->a:Ljava/lang/Object;

    .line 94
    .line 95
    move-object v1, p1

    .line 96
    check-cast v1, Ljava/util/Collection;

    .line 97
    .line 98
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    :goto_4
    if-ge v4, v1, :cond_6

    .line 103
    .line 104
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    check-cast v3, Lv0/l;

    .line 109
    .line 110
    iget-boolean v3, v3, Lv0/l;->d:Z

    .line 111
    .line 112
    if-eqz v3, :cond_5

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_5
    add-int/lit8 v4, v4, 0x1

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_6
    sget-object p0, Lm5/y;->a:Lm5/y;

    .line 119
    .line 120
    return-object p0
.end method

.method public static final b(Lv0/y;ZLv0/g;Ls5/a;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p3, Lw/I0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lw/I0;

    .line 7
    .line 8
    iget v1, v0, Lw/I0;->u:I

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
    iput v1, v0, Lw/I0;->u:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lw/I0;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Ls5/c;-><init>(Lq5/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lw/I0;->t:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lw/I0;->u:I

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
    iget-boolean p0, v0, Lw/I0;->s:Z

    .line 35
    .line 36
    iget-object p1, v0, Lw/I0;->r:Lv0/g;

    .line 37
    .line 38
    iget-object p2, v0, Lw/I0;->q:Lv0/y;

    .line 39
    .line 40
    invoke-static {p3}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    move-object v8, p1

    .line 44
    move p1, p0

    .line 45
    move-object p0, p2

    .line 46
    move-object p2, v8

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p0

    .line 56
    :cond_2
    invoke-static {p3}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    iput-object p0, v0, Lw/I0;->q:Lv0/y;

    .line 60
    .line 61
    iput-object p2, v0, Lw/I0;->r:Lv0/g;

    .line 62
    .line 63
    iput-boolean p1, v0, Lw/I0;->s:Z

    .line 64
    .line 65
    iput v2, v0, Lw/I0;->u:I

    .line 66
    .line 67
    invoke-virtual {p0, p2, v0}, Lv0/y;->a(Lv0/g;Ls5/a;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    sget-object v1, Lr5/a;->q:Lr5/a;

    .line 72
    .line 73
    if-ne p3, v1, :cond_4

    .line 74
    .line 75
    return-object v1

    .line 76
    :cond_4
    :goto_1
    check-cast p3, Lv0/f;

    .line 77
    .line 78
    iget-object v1, p3, Lv0/f;->a:Ljava/lang/Object;

    .line 79
    .line 80
    move-object v3, v1

    .line 81
    check-cast v3, Ljava/util/Collection;

    .line 82
    .line 83
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    const/4 v4, 0x0

    .line 88
    move v5, v4

    .line 89
    :goto_2
    if-ge v5, v3, :cond_8

    .line 90
    .line 91
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    check-cast v6, Lv0/l;

    .line 96
    .line 97
    if-eqz p1, :cond_6

    .line 98
    .line 99
    invoke-virtual {v6}, Lv0/l;->b()Z

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    if-nez v7, :cond_5

    .line 104
    .line 105
    iget-boolean v7, v6, Lv0/l;->h:Z

    .line 106
    .line 107
    if-nez v7, :cond_5

    .line 108
    .line 109
    iget-boolean v6, v6, Lv0/l;->d:Z

    .line 110
    .line 111
    if-eqz v6, :cond_5

    .line 112
    .line 113
    move v6, v2

    .line 114
    goto :goto_3

    .line 115
    :cond_5
    move v6, v4

    .line 116
    goto :goto_3

    .line 117
    :cond_6
    invoke-static {v6}, Lv0/v;->a(Lv0/l;)Z

    .line 118
    .line 119
    .line 120
    move-result v6

    .line 121
    :goto_3
    if-nez v6, :cond_7

    .line 122
    .line 123
    move v1, v4

    .line 124
    goto :goto_4

    .line 125
    :cond_7
    add-int/lit8 v5, v5, 0x1

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_8
    move v1, v2

    .line 129
    :goto_4
    if-eqz v1, :cond_3

    .line 130
    .line 131
    iget-object p0, p3, Lv0/f;->a:Ljava/lang/Object;

    .line 132
    .line 133
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    return-object p0
.end method

.method public static synthetic c(Lv0/y;Ls5/h;I)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    and-int/2addr p2, v0

    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    :goto_0
    sget-object p2, Lv0/g;->r:Lv0/g;

    .line 8
    .line 9
    invoke-static {p0, v0, p2, p1}, Lw/g1;->b(Lv0/y;ZLv0/g;Ls5/a;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static d(Lv0/o;LB5/c;LB5/c;Lq5/c;I)Ljava/lang/Object;
    .locals 6

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    move-object v3, p1

    .line 7
    new-instance v0, Lw/b1;

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    sget-object v2, Lw/g1;->a:Le3/u;

    .line 11
    .line 12
    move-object v1, p0

    .line 13
    move-object v4, p2

    .line 14
    invoke-direct/range {v0 .. v5}, Lw/b1;-><init>(Lv0/o;LB5/f;LB5/c;LB5/c;Lq5/c;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, p3}, LM5/y;->g(LB5/e;Lq5/c;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    sget-object p1, Lr5/a;->q:Lr5/a;

    .line 22
    .line 23
    if-ne p0, p1, :cond_1

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_1
    sget-object p0, Lm5/y;->a:Lm5/y;

    .line 27
    .line 28
    return-object p0
.end method

.method public static e(LM5/w;LM5/b0;LB5/e;)LM5/B;
    .locals 2

    .line 1
    new-instance v0, Lw/c1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, p2, v1}, Lw/c1;-><init>(LM5/b0;LB5/e;Lq5/c;)V

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    sget-object p2, LM5/x;->t:LM5/x;

    .line 9
    .line 10
    invoke-static {p0, v1, p2, v0, p1}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static final f(Lv0/y;Lv0/g;Ls5/a;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, Lw/d1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lw/d1;

    .line 7
    .line 8
    iget v1, v0, Lw/d1;->s:I

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
    iput v1, v0, Lw/d1;->s:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lw/d1;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Ls5/c;-><init>(Lq5/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lw/d1;->r:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lw/d1;->s:I

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
    iget-object p0, v0, Lw/d1;->q:Lkotlin/jvm/internal/y;

    .line 35
    .line 36
    :try_start_0
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catch Lv0/h; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p0

    .line 48
    :cond_2
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    new-instance p2, Lkotlin/jvm/internal/y;

    .line 52
    .line 53
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 54
    .line 55
    .line 56
    sget-object v1, Lw/L;->a:Lw/L;

    .line 57
    .line 58
    iput-object v1, p2, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 59
    .line 60
    :try_start_1
    invoke-virtual {p0}, Lv0/y;->e()LC0/b1;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-interface {v1}, LC0/b1;->b()J

    .line 65
    .line 66
    .line 67
    move-result-wide v3

    .line 68
    new-instance v1, Lw/e1;

    .line 69
    .line 70
    const/4 v5, 0x0

    .line 71
    invoke-direct {v1, p1, p2, v5}, Lw/e1;-><init>(Lv0/g;Lkotlin/jvm/internal/y;Lq5/c;)V

    .line 72
    .line 73
    .line 74
    iput-object p2, v0, Lw/d1;->q:Lkotlin/jvm/internal/y;

    .line 75
    .line 76
    iput v2, v0, Lw/d1;->s:I

    .line 77
    .line 78
    invoke-virtual {p0, v3, v4, v1, v0}, Lv0/y;->h(JLB5/e;Ls5/c;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0
    :try_end_1
    .catch Lv0/h; {:try_start_1 .. :try_end_1} :catch_0

    .line 82
    sget-object p1, Lr5/a;->q:Lr5/a;

    .line 83
    .line 84
    if-ne p0, p1, :cond_3

    .line 85
    .line 86
    return-object p1

    .line 87
    :cond_3
    move-object p0, p2

    .line 88
    :goto_1
    iget-object p0, p0, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 89
    .line 90
    return-object p0

    .line 91
    :catch_0
    sget-object p0, Lw/N;->a:Lw/N;

    .line 92
    .line 93
    return-object p0
.end method

.method public static final g(Lv0/y;Lv0/g;Ls5/a;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v0, p2, Lw/f1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lw/f1;

    .line 7
    .line 8
    iget v1, v0, Lw/f1;->t:I

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
    iput v1, v0, Lw/f1;->t:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lw/f1;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Ls5/c;-><init>(Lq5/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lw/f1;->s:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lw/f1;->t:I

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x0

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
    if-ne v1, v2, :cond_2

    .line 39
    .line 40
    iget-object p0, v0, Lw/f1;->r:Lv0/g;

    .line 41
    .line 42
    iget-object p1, v0, Lw/f1;->q:Lv0/y;

    .line 43
    .line 44
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    move-object v12, p1

    .line 48
    move-object p1, p0

    .line 49
    move-object p0, v12

    .line 50
    goto/16 :goto_5

    .line 51
    .line 52
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p0

    .line 60
    :cond_3
    iget-object p0, v0, Lw/f1;->r:Lv0/g;

    .line 61
    .line 62
    iget-object p1, v0, Lw/f1;->q:Lv0/y;

    .line 63
    .line 64
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_4
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :cond_5
    iput-object p0, v0, Lw/f1;->q:Lv0/y;

    .line 72
    .line 73
    iput-object p1, v0, Lw/f1;->r:Lv0/g;

    .line 74
    .line 75
    iput v4, v0, Lw/f1;->t:I

    .line 76
    .line 77
    invoke-virtual {p0, p1, v0}, Lv0/y;->a(Lv0/g;Ls5/a;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    if-ne p2, v5, :cond_6

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_6
    move-object v12, p1

    .line 85
    move-object p1, p0

    .line 86
    move-object p0, v12

    .line 87
    :goto_1
    check-cast p2, Lv0/f;

    .line 88
    .line 89
    iget-object p2, p2, Lv0/f;->a:Ljava/lang/Object;

    .line 90
    .line 91
    move-object v1, p2

    .line 92
    check-cast v1, Ljava/util/Collection;

    .line 93
    .line 94
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    move v6, v3

    .line 99
    :goto_2
    if-ge v6, v1, :cond_c

    .line 100
    .line 101
    invoke-interface {p2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    check-cast v7, Lv0/l;

    .line 106
    .line 107
    invoke-static {v7}, Lv0/v;->b(Lv0/l;)Z

    .line 108
    .line 109
    .line 110
    move-result v7

    .line 111
    if-nez v7, :cond_b

    .line 112
    .line 113
    move-object v1, p2

    .line 114
    check-cast v1, Ljava/util/Collection;

    .line 115
    .line 116
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    move v6, v3

    .line 121
    :goto_3
    if-ge v6, v1, :cond_8

    .line 122
    .line 123
    invoke-interface {p2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    check-cast v7, Lv0/l;

    .line 128
    .line 129
    invoke-virtual {v7}, Lv0/l;->b()Z

    .line 130
    .line 131
    .line 132
    move-result v8

    .line 133
    if-nez v8, :cond_9

    .line 134
    .line 135
    iget-object v8, p1, Lv0/y;->v:Lv0/A;

    .line 136
    .line 137
    iget-wide v8, v8, Lv0/A;->N:J

    .line 138
    .line 139
    invoke-virtual {p1}, Lv0/y;->c()J

    .line 140
    .line 141
    .line 142
    move-result-wide v10

    .line 143
    invoke-static {v7, v8, v9, v10, v11}, Lv0/v;->e(Lv0/l;JJ)Z

    .line 144
    .line 145
    .line 146
    move-result v7

    .line 147
    if-eqz v7, :cond_7

    .line 148
    .line 149
    goto :goto_7

    .line 150
    :cond_7
    add-int/lit8 v6, v6, 0x1

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_8
    iput-object p1, v0, Lw/f1;->q:Lv0/y;

    .line 154
    .line 155
    iput-object p0, v0, Lw/f1;->r:Lv0/g;

    .line 156
    .line 157
    iput v2, v0, Lw/f1;->t:I

    .line 158
    .line 159
    sget-object p2, Lv0/g;->s:Lv0/g;

    .line 160
    .line 161
    invoke-virtual {p1, p2, v0}, Lv0/y;->a(Lv0/g;Ls5/a;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p2

    .line 165
    if-ne p2, v5, :cond_1

    .line 166
    .line 167
    :goto_4
    return-object v5

    .line 168
    :goto_5
    check-cast p2, Lv0/f;

    .line 169
    .line 170
    iget-object p2, p2, Lv0/f;->a:Ljava/lang/Object;

    .line 171
    .line 172
    move-object v1, p2

    .line 173
    check-cast v1, Ljava/util/Collection;

    .line 174
    .line 175
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    move v6, v3

    .line 180
    :goto_6
    if-ge v6, v1, :cond_5

    .line 181
    .line 182
    invoke-interface {p2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v7

    .line 186
    check-cast v7, Lv0/l;

    .line 187
    .line 188
    invoke-virtual {v7}, Lv0/l;->b()Z

    .line 189
    .line 190
    .line 191
    move-result v7

    .line 192
    if-eqz v7, :cond_a

    .line 193
    .line 194
    :cond_9
    :goto_7
    const/4 p0, 0x0

    .line 195
    return-object p0

    .line 196
    :cond_a
    add-int/lit8 v6, v6, 0x1

    .line 197
    .line 198
    goto :goto_6

    .line 199
    :cond_b
    add-int/lit8 v6, v6, 0x1

    .line 200
    .line 201
    goto :goto_2

    .line 202
    :cond_c
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    return-object p0
.end method
