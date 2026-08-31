.class public abstract LA/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lr/G;

.field public static final b:Lr/G;

.field public static final c:LA/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, LA/n;->c(Z)Lr/G;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sput-object v0, LA/n;->a:Lr/G;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {v0}, LA/n;->c(Z)Lr/G;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, LA/n;->b:Lr/G;

    .line 14
    .line 15
    sget-object v0, LA/m;->b:LA/m;

    .line 16
    .line 17
    sput-object v0, LA/n;->c:LA/m;

    .line 18
    .line 19
    return-void
.end method

.method public static final a(Lc0/m;LP/o;I)V
    .locals 6

    .line 1
    const v0, -0xc96ce69

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, LP/o;->U(I)LP/o;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p2, 0x6

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1, p0}, LP/o;->g(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x4

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v0, v1

    .line 21
    :goto_0
    or-int/2addr v0, p2

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v0, p2

    .line 24
    :goto_1
    and-int/lit8 v2, v0, 0x3

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    if-eq v2, v1, :cond_2

    .line 28
    .line 29
    move v1, v3

    .line 30
    goto :goto_2

    .line 31
    :cond_2
    const/4 v1, 0x0

    .line 32
    :goto_2
    and-int/2addr v0, v3

    .line 33
    invoke-virtual {p1, v0, v1}, LP/o;->K(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_6

    .line 38
    .line 39
    iget v0, p1, LP/o;->P:I

    .line 40
    .line 41
    invoke-static {p1, p0}, Lc0/o;->c(LP/o;Lc0/m;)Lc0/m;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {p1}, LP/o;->m()LP/i0;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    sget-object v4, LB0/k;->a:LB0/j;

    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    sget-object v4, LB0/j;->b:LB0/D;

    .line 55
    .line 56
    invoke-virtual {p1}, LP/o;->W()V

    .line 57
    .line 58
    .line 59
    iget-boolean v5, p1, LP/o;->O:Z

    .line 60
    .line 61
    if-eqz v5, :cond_3

    .line 62
    .line 63
    invoke-virtual {p1, v4}, LP/o;->l(LB5/a;)V

    .line 64
    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_3
    invoke-virtual {p1}, LP/o;->g0()V

    .line 68
    .line 69
    .line 70
    :goto_3
    sget-object v4, LB0/j;->e:LB0/i;

    .line 71
    .line 72
    sget-object v5, LA/n;->c:LA/m;

    .line 73
    .line 74
    invoke-static {v4, p1, v5}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    sget-object v4, LB0/j;->d:LB0/i;

    .line 78
    .line 79
    invoke-static {v4, p1, v2}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    sget-object v2, LB0/j;->c:LB0/i;

    .line 83
    .line 84
    invoke-static {v2, p1, v1}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    sget-object v1, LB0/j;->f:LB0/i;

    .line 88
    .line 89
    iget-boolean v2, p1, LP/o;->O:Z

    .line 90
    .line 91
    if-nez v2, :cond_4

    .line 92
    .line 93
    invoke-virtual {p1}, LP/o;->H()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-static {v2, v4}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-nez v2, :cond_5

    .line 106
    .line 107
    :cond_4
    invoke-static {v0, p1, v0, v1}, Lk1/i;->o(ILP/o;ILB0/i;)V

    .line 108
    .line 109
    .line 110
    :cond_5
    invoke-virtual {p1, v3}, LP/o;->p(Z)V

    .line 111
    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_6
    invoke-virtual {p1}, LP/o;->N()V

    .line 115
    .line 116
    .line 117
    :goto_4
    invoke-virtual {p1}, LP/o;->r()LP/o0;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    if-eqz p1, :cond_7

    .line 122
    .line 123
    new-instance v0, LA/k;

    .line 124
    .line 125
    const/4 v1, 0x0

    .line 126
    invoke-direct {v0, p2, v1, p0}, LA/k;-><init>(IILjava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    iput-object v0, p1, LP/o0;->d:LB5/e;

    .line 130
    .line 131
    :cond_7
    return-void
.end method

.method public static final b(Lz0/I;Lz0/J;Lz0/B;LW0/l;IILc0/e;)V
    .locals 7

    .line 1
    invoke-interface {p2}, Lz0/B;->g()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    instance-of v0, p2, LA/j;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p2, LA/j;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p2, 0x0

    .line 13
    :goto_0
    if-eqz p2, :cond_2

    .line 14
    .line 15
    iget-object p2, p2, LA/j;->E:Lc0/e;

    .line 16
    .line 17
    if-nez p2, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move-object v0, p2

    .line 21
    goto :goto_2

    .line 22
    :cond_2
    :goto_1
    move-object v0, p6

    .line 23
    :goto_2
    iget p2, p1, Lz0/J;->q:I

    .line 24
    .line 25
    iget p6, p1, Lz0/J;->r:I

    .line 26
    .line 27
    int-to-long v1, p2

    .line 28
    const/16 p2, 0x20

    .line 29
    .line 30
    shl-long/2addr v1, p2

    .line 31
    int-to-long v3, p6

    .line 32
    const-wide v5, 0xffffffffL

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    and-long/2addr v3, v5

    .line 38
    or-long/2addr v1, v3

    .line 39
    int-to-long v3, p4

    .line 40
    shl-long/2addr v3, p2

    .line 41
    int-to-long p4, p5

    .line 42
    and-long/2addr p4, v5

    .line 43
    or-long/2addr v3, p4

    .line 44
    move-object v5, p3

    .line 45
    invoke-virtual/range {v0 .. v5}, Lc0/e;->a(JJLW0/l;)J

    .line 46
    .line 47
    .line 48
    move-result-wide p2

    .line 49
    invoke-static {p0, p1, p2, p3}, Lz0/I;->e(Lz0/I;Lz0/J;J)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public static final c(Z)Lr/G;
    .locals 3

    .line 1
    new-instance v0, Lr/G;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lr/G;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lc0/b;->q:Lc0/e;

    .line 9
    .line 10
    new-instance v2, LA/q;

    .line 11
    .line 12
    invoke-direct {v2, v1, p0}, LA/q;-><init>(Lc0/e;Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1, v2}, Lr/G;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    sget-object v1, Lc0/b;->r:Lc0/e;

    .line 19
    .line 20
    new-instance v2, LA/q;

    .line 21
    .line 22
    invoke-direct {v2, v1, p0}, LA/q;-><init>(Lc0/e;Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Lr/G;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    sget-object v1, Lc0/b;->s:Lc0/e;

    .line 29
    .line 30
    new-instance v2, LA/q;

    .line 31
    .line 32
    invoke-direct {v2, v1, p0}, LA/q;-><init>(Lc0/e;Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1, v2}, Lr/G;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    sget-object v1, Lc0/b;->t:Lc0/e;

    .line 39
    .line 40
    new-instance v2, LA/q;

    .line 41
    .line 42
    invoke-direct {v2, v1, p0}, LA/q;-><init>(Lc0/e;Z)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Lr/G;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget-object v1, Lc0/b;->u:Lc0/e;

    .line 49
    .line 50
    new-instance v2, LA/q;

    .line 51
    .line 52
    invoke-direct {v2, v1, p0}, LA/q;-><init>(Lc0/e;Z)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1, v2}, Lr/G;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    sget-object v1, Lc0/b;->v:Lc0/e;

    .line 59
    .line 60
    new-instance v2, LA/q;

    .line 61
    .line 62
    invoke-direct {v2, v1, p0}, LA/q;-><init>(Lc0/e;Z)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1, v2}, Lr/G;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    sget-object v1, Lc0/b;->w:Lc0/e;

    .line 69
    .line 70
    new-instance v2, LA/q;

    .line 71
    .line 72
    invoke-direct {v2, v1, p0}, LA/q;-><init>(Lc0/e;Z)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1, v2}, Lr/G;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    sget-object v1, Lc0/b;->x:Lc0/e;

    .line 79
    .line 80
    new-instance v2, LA/q;

    .line 81
    .line 82
    invoke-direct {v2, v1, p0}, LA/q;-><init>(Lc0/e;Z)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v1, v2}, Lr/G;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    sget-object v1, Lc0/b;->y:Lc0/e;

    .line 89
    .line 90
    new-instance v2, LA/q;

    .line 91
    .line 92
    invoke-direct {v2, v1, p0}, LA/q;-><init>(Lc0/e;Z)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v1, v2}, Lr/G;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    return-object v0
.end method

.method public static final d(Lc0/e;Z)Lz0/C;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object v0, LA/n;->a:Lr/G;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object v0, LA/n;->b:Lr/G;

    .line 7
    .line 8
    :goto_0
    invoke-virtual {v0, p0}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lz0/C;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    new-instance v0, LA/q;

    .line 17
    .line 18
    invoke-direct {v0, p0, p1}, LA/q;-><init>(Lc0/e;Z)V

    .line 19
    .line 20
    .line 21
    :cond_1
    return-object v0
.end method
