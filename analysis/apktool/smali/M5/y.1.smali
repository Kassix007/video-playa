.class public abstract LM5/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LE4/f;

.field public static final b:LE4/f;

.field public static final c:LE4/f;

.field public static final d:LE4/f;

.field public static final e:LE4/f;

.field public static final f:LE4/f;

.field public static final g:LE4/f;

.field public static final h:LE4/f;

.field public static final i:LM5/L;

.field public static final j:LM5/L;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LE4/f;

    .line 2
    .line 3
    const-string v1, "RESUME_TOKEN"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v0, v1, v2}, LE4/f;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LM5/y;->a:LE4/f;

    .line 10
    .line 11
    new-instance v0, LE4/f;

    .line 12
    .line 13
    const-string v1, "REMOVED_TASK"

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, LE4/f;-><init>(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    sput-object v0, LM5/y;->b:LE4/f;

    .line 19
    .line 20
    new-instance v0, LE4/f;

    .line 21
    .line 22
    const-string v1, "CLOSED_EMPTY"

    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, LE4/f;-><init>(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    sput-object v0, LM5/y;->c:LE4/f;

    .line 28
    .line 29
    new-instance v0, LE4/f;

    .line 30
    .line 31
    const-string v1, "COMPLETING_ALREADY"

    .line 32
    .line 33
    invoke-direct {v0, v1, v2}, LE4/f;-><init>(Ljava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    sput-object v0, LM5/y;->d:LE4/f;

    .line 37
    .line 38
    new-instance v0, LE4/f;

    .line 39
    .line 40
    const-string v1, "COMPLETING_WAITING_CHILDREN"

    .line 41
    .line 42
    invoke-direct {v0, v1, v2}, LE4/f;-><init>(Ljava/lang/String;I)V

    .line 43
    .line 44
    .line 45
    sput-object v0, LM5/y;->e:LE4/f;

    .line 46
    .line 47
    new-instance v0, LE4/f;

    .line 48
    .line 49
    const-string v1, "COMPLETING_RETRY"

    .line 50
    .line 51
    invoke-direct {v0, v1, v2}, LE4/f;-><init>(Ljava/lang/String;I)V

    .line 52
    .line 53
    .line 54
    sput-object v0, LM5/y;->f:LE4/f;

    .line 55
    .line 56
    new-instance v0, LE4/f;

    .line 57
    .line 58
    const-string v1, "TOO_LATE_TO_CANCEL"

    .line 59
    .line 60
    invoke-direct {v0, v1, v2}, LE4/f;-><init>(Ljava/lang/String;I)V

    .line 61
    .line 62
    .line 63
    sput-object v0, LM5/y;->g:LE4/f;

    .line 64
    .line 65
    new-instance v0, LE4/f;

    .line 66
    .line 67
    const-string v1, "SEALED"

    .line 68
    .line 69
    invoke-direct {v0, v1, v2}, LE4/f;-><init>(Ljava/lang/String;I)V

    .line 70
    .line 71
    .line 72
    sput-object v0, LM5/y;->h:LE4/f;

    .line 73
    .line 74
    new-instance v0, LM5/L;

    .line 75
    .line 76
    const/4 v1, 0x0

    .line 77
    invoke-direct {v0, v1}, LM5/L;-><init>(Z)V

    .line 78
    .line 79
    .line 80
    sput-object v0, LM5/y;->i:LM5/L;

    .line 81
    .line 82
    new-instance v0, LM5/L;

    .line 83
    .line 84
    const/4 v1, 0x1

    .line 85
    invoke-direct {v0, v1}, LM5/L;-><init>(Z)V

    .line 86
    .line 87
    .line 88
    sput-object v0, LM5/y;->j:LM5/L;

    .line 89
    .line 90
    return-void
.end method

.method public static final A(Lq5/c;Lq5/h;Ljava/lang/Object;)LM5/y0;
    .locals 2

    .line 1
    instance-of v0, p0, Ls5/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    sget-object v0, LM5/z0;->q:LM5/z0;

    .line 8
    .line 9
    invoke-interface {p1, v0}, Lq5/h;->get(Lq5/g;)Lq5/f;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_4

    .line 14
    .line 15
    check-cast p0, Ls5/d;

    .line 16
    .line 17
    :cond_1
    instance-of v0, p0, LM5/E;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    invoke-interface {p0}, Ls5/d;->getCallerFrame()Ls5/d;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-nez p0, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    instance-of v0, p0, LM5/y0;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    move-object v1, p0

    .line 34
    check-cast v1, LM5/y0;

    .line 35
    .line 36
    :goto_0
    if-eqz v1, :cond_4

    .line 37
    .line 38
    invoke-virtual {v1, p1, p2}, LM5/y0;->h0(Lq5/h;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_4
    :goto_1
    return-object v1
.end method

.method public static final B(Lq5/h;LB5/e;Lq5/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-interface {p2}, Lq5/c;->getContext()Lq5/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 6
    .line 7
    new-instance v2, LM5/q;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    invoke-direct {v2, v3, v4}, LM5/q;-><init>(IB)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p0, v1, v2}, Lq5/h;->fold(Ljava/lang/Object;LB5/e;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v2, 0x0

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    invoke-interface {v0, p0}, Lq5/h;->plus(Lq5/h;)Lq5/h;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {v0, p0, v2}, LM5/y;->j(Lq5/h;Lq5/h;Z)Lq5/h;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    :goto_0
    invoke-static {p0}, LM5/y;->i(Lq5/h;)V

    .line 37
    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    if-ne p0, v0, :cond_1

    .line 41
    .line 42
    new-instance v0, LR5/r;

    .line 43
    .line 44
    invoke-direct {v0, p2, p0}, LR5/r;-><init>(Lq5/c;Lq5/h;)V

    .line 45
    .line 46
    .line 47
    invoke-static {v0, v1, v0, p1}, Lcom/google/android/gms/internal/measurement/I1;->D0(LR5/r;ZLR5/r;LB5/e;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    sget-object v3, Lq5/d;->q:Lq5/d;

    .line 53
    .line 54
    invoke-interface {p0, v3}, Lq5/h;->get(Lq5/g;)Lq5/f;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-interface {v0, v3}, Lq5/h;->get(Lq5/g;)Lq5/f;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-static {v4, v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    new-instance v0, LM5/y0;

    .line 69
    .line 70
    invoke-direct {v0, p2, p0}, LM5/y0;-><init>(Lq5/c;Lq5/h;)V

    .line 71
    .line 72
    .line 73
    const/4 p0, 0x0

    .line 74
    iget-object p2, v0, LM5/a;->s:Lq5/h;

    .line 75
    .line 76
    invoke-static {p2, p0}, LR5/b;->n(Lq5/h;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    :try_start_0
    invoke-static {v0, v1, v0, p1}, Lcom/google/android/gms/internal/measurement/I1;->D0(LR5/r;ZLR5/r;LB5/e;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    invoke-static {p2, p0}, LR5/b;->g(Lq5/h;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    move-object p0, p1

    .line 88
    goto :goto_1

    .line 89
    :catchall_0
    move-exception p1

    .line 90
    invoke-static {p2, p0}, LR5/b;->g(Lq5/h;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    throw p1

    .line 94
    :cond_2
    new-instance v0, LM5/E;

    .line 95
    .line 96
    invoke-direct {v0, p2, p0}, LR5/r;-><init>(Lq5/c;Lq5/h;)V

    .line 97
    .line 98
    .line 99
    :try_start_1
    invoke-static {p1, v0, v0}, Ln5/A;->p(LB5/e;Lq5/c;Lq5/c;)Lq5/c;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-static {p0}, Ln5/A;->v(Lq5/c;)Lq5/c;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 108
    .line 109
    invoke-static {p1, p0}, LR5/b;->h(Ljava/lang/Object;Lq5/c;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 110
    .line 111
    .line 112
    sget-object p0, LM5/E;->u:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 113
    .line 114
    :cond_3
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-eqz p1, :cond_6

    .line 119
    .line 120
    const/4 p0, 0x2

    .line 121
    if-ne p1, p0, :cond_5

    .line 122
    .line 123
    sget-object p0, LM5/i0;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 124
    .line 125
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-static {p0}, LM5/y;->z(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    instance-of p1, p0, LM5/p;

    .line 134
    .line 135
    if-nez p1, :cond_4

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_4
    check-cast p0, LM5/p;

    .line 139
    .line 140
    iget-object p0, p0, LM5/p;->a:Ljava/lang/Throwable;

    .line 141
    .line 142
    throw p0

    .line 143
    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 144
    .line 145
    const-string p1, "Already suspended"

    .line 146
    .line 147
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    throw p0

    .line 151
    :cond_6
    invoke-virtual {p0, v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    if-eqz p1, :cond_3

    .line 156
    .line 157
    sget-object p0, Lr5/a;->q:Lr5/a;

    .line 158
    .line 159
    :goto_1
    return-object p0

    .line 160
    :catchall_1
    move-exception p0

    .line 161
    instance-of p1, p0, LM5/D;

    .line 162
    .line 163
    if-eqz p1, :cond_7

    .line 164
    .line 165
    check-cast p0, LM5/D;

    .line 166
    .line 167
    iget-object p0, p0, LM5/D;->q:Ljava/lang/Throwable;

    .line 168
    .line 169
    :cond_7
    invoke-static {p0}, Lm5/a;->b(Ljava/lang/Throwable;)Lm5/l;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-virtual {v0, p1}, LM5/a;->resumeWith(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    throw p0
.end method

.method public static final C(JLB5/e;Ls5/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, LM5/w0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, LM5/w0;

    .line 7
    .line 8
    iget v1, v0, LM5/w0;->s:I

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
    iput v1, v0, LM5/w0;->s:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LM5/w0;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Ls5/c;-><init>(Lq5/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, LM5/w0;->r:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, LM5/w0;->s:I

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
    iget-object p0, v0, LM5/w0;->q:Lkotlin/jvm/internal/y;

    .line 35
    .line 36
    :try_start_0
    invoke-static {p3}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catch LM5/u0; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    return-object p3

    .line 40
    :catch_0
    move-exception p1

    .line 41
    goto :goto_3

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
    invoke-static {p3}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    const-wide/16 v3, 0x0

    .line 54
    .line 55
    cmp-long p3, p0, v3

    .line 56
    .line 57
    if-gtz p3, :cond_3

    .line 58
    .line 59
    goto :goto_4

    .line 60
    :cond_3
    new-instance p3, Lkotlin/jvm/internal/y;

    .line 61
    .line 62
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 63
    .line 64
    .line 65
    :try_start_1
    iput-object p3, v0, LM5/w0;->q:Lkotlin/jvm/internal/y;

    .line 66
    .line 67
    iput v2, v0, LM5/w0;->s:I

    .line 68
    .line 69
    new-instance v1, LM5/v0;

    .line 70
    .line 71
    invoke-direct {v1, p0, p1, v0}, LM5/v0;-><init>(JLM5/w0;)V

    .line 72
    .line 73
    .line 74
    iput-object v1, p3, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;
    :try_end_1
    .catch LM5/u0; {:try_start_1 .. :try_end_1} :catch_2

    .line 75
    .line 76
    :try_start_2
    iget-object p0, v1, LR5/r;->t:Lq5/c;

    .line 77
    .line 78
    invoke-interface {p0}, Lq5/c;->getContext()Lq5/h;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-static {p0}, LM5/y;->l(Lq5/h;)LM5/C;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    iget-wide v3, v1, LM5/v0;->u:J

    .line 87
    .line 88
    iget-object p1, v1, LM5/a;->s:Lq5/h;

    .line 89
    .line 90
    invoke-interface {p0, v3, v4, v1, p1}, LM5/C;->n(JLM5/v0;Lq5/h;)LM5/J;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    new-instance p1, LM5/K;

    .line 95
    .line 96
    const/4 v0, 0x0

    .line 97
    invoke-direct {p1, v0, p0}, LM5/K;-><init>(ILjava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-static {v1, v2, p1}, LM5/y;->q(LM5/b0;ZLM5/e0;)LM5/J;

    .line 101
    .line 102
    .line 103
    const/4 p0, 0x0

    .line 104
    invoke-static {v1, p0, v1, p2}, Lcom/google/android/gms/internal/measurement/I1;->D0(LR5/r;ZLR5/r;LB5/e;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p0
    :try_end_2
    .catch LM5/u0; {:try_start_2 .. :try_end_2} :catch_1

    .line 108
    sget-object p1, Lr5/a;->q:Lr5/a;

    .line 109
    .line 110
    if-ne p0, p1, :cond_4

    .line 111
    .line 112
    return-object p1

    .line 113
    :cond_4
    return-object p0

    .line 114
    :goto_1
    move-object p1, p0

    .line 115
    goto :goto_2

    .line 116
    :catch_1
    move-exception p0

    .line 117
    goto :goto_1

    .line 118
    :goto_2
    move-object p0, p3

    .line 119
    goto :goto_3

    .line 120
    :catch_2
    move-exception p1

    .line 121
    goto :goto_2

    .line 122
    :goto_3
    iget-object p2, p1, LM5/u0;->q:LM5/b0;

    .line 123
    .line 124
    iget-object p0, p0, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 125
    .line 126
    if-ne p2, p0, :cond_5

    .line 127
    .line 128
    :goto_4
    const/4 p0, 0x0

    .line 129
    return-object p0

    .line 130
    :cond_5
    throw p1
.end method

.method public static final a(Lq5/h;)LR5/d;
    .locals 2

    .line 1
    new-instance v0, LR5/d;

    .line 2
    .line 3
    sget-object v1, LM5/t;->r:LM5/t;

    .line 4
    .line 5
    invoke-interface {p0, v1}, Lq5/h;->get(Lq5/g;)Lq5/f;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {}, LM5/y;->b()LM5/d0;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {p0, v1}, Lq5/h;->plus(Lq5/h;)Lq5/h;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :goto_0
    invoke-direct {v0, p0}, LR5/d;-><init>(Lq5/h;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public static b()LM5/d0;
    .locals 2

    .line 1
    new-instance v0, LM5/d0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LM5/d0;-><init>(LM5/b0;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public static c()LM5/q0;
    .locals 2

    .line 1
    new-instance v0, LM5/q0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LM5/d0;-><init>(LM5/b0;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public static d(LM5/w;LN5/f;LB5/e;I)LM5/B;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    and-int/2addr p3, v0

    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    sget-object p1, Lq5/i;->q:Lq5/i;

    .line 6
    .line 7
    :cond_0
    invoke-static {p0, p1}, LM5/y;->u(LM5/w;Lq5/h;)Lq5/h;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    new-instance p1, LM5/B;

    .line 12
    .line 13
    const/4 p3, 0x0

    .line 14
    invoke-direct {p1, p0, v0, p3}, LM5/B;-><init>(Lq5/h;ZI)V

    .line 15
    .line 16
    .line 17
    sget-object p0, LM5/x;->q:LM5/x;

    .line 18
    .line 19
    invoke-virtual {p1, p0, p1, p2}, LM5/a;->d0(LM5/x;LM5/a;LB5/e;)V

    .line 20
    .line 21
    .line 22
    return-object p1
.end method

.method public static final e(LM5/w;Ljava/util/concurrent/CancellationException;)V
    .locals 2

    .line 1
    invoke-interface {p0}, LM5/w;->d()Lq5/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LM5/t;->r:LM5/t;

    .line 6
    .line 7
    invoke-interface {v0, v1}, Lq5/h;->get(Lq5/g;)Lq5/f;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, LM5/b0;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {v0, p1}, LM5/b0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v1, "Scope cannot be cancelled because it does not have a job: "

    .line 24
    .line 25
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p1
.end method

.method public static final f(Lq5/h;Ljava/util/concurrent/CancellationException;)V
    .locals 1

    .line 1
    sget-object v0, LM5/t;->r:LM5/t;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lq5/h;->get(Lq5/g;)Lq5/f;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LM5/b0;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0, p1}, LM5/b0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public static final g(LB5/e;Lq5/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, LR5/r;

    .line 2
    .line 3
    invoke-interface {p1}, Lq5/c;->getContext()Lq5/h;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, p1, v1}, LR5/r;-><init>(Lq5/c;Lq5/h;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    invoke-static {v0, p1, v0, p0}, Lcom/google/android/gms/internal/measurement/I1;->D0(LR5/r;ZLR5/r;LB5/e;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static final h(JLs5/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-gtz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, LM5/h;

    .line 9
    .line 10
    invoke-static {p2}, Ln5/A;->v(Lq5/c;)Lq5/c;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {v0, v1, p2}, LM5/h;-><init>(ILq5/c;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, LM5/h;->s()V

    .line 19
    .line 20
    .line 21
    const-wide v1, 0x7fffffffffffffffL

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    cmp-long p2, p0, v1

    .line 27
    .line 28
    if-gez p2, :cond_1

    .line 29
    .line 30
    iget-object p2, v0, LM5/h;->u:Lq5/h;

    .line 31
    .line 32
    invoke-static {p2}, LM5/y;->l(Lq5/h;)LM5/C;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-interface {p2, p0, p1, v0}, LM5/C;->z(JLM5/h;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-virtual {v0}, LM5/h;->r()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    sget-object p1, Lr5/a;->q:Lr5/a;

    .line 44
    .line 45
    if-ne p0, p1, :cond_2

    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_2
    :goto_0
    sget-object p0, Lm5/y;->a:Lm5/y;

    .line 49
    .line 50
    return-object p0
.end method

.method public static final i(Lq5/h;)V
    .locals 1

    .line 1
    sget-object v0, LM5/t;->r:LM5/t;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lq5/h;->get(Lq5/g;)Lq5/f;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LM5/b0;

    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    invoke-interface {p0}, LM5/b0;->b()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-interface {p0}, LM5/b0;->v()Ljava/util/concurrent/CancellationException;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    throw p0

    .line 23
    :cond_1
    :goto_0
    return-void
.end method

.method public static final j(Lq5/h;Lq5/h;Z)Lq5/h;
    .locals 4

    .line 1
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    .line 3
    new-instance v0, LM5/q;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-direct {v0, v1, v2}, LM5/q;-><init>(IB)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p0, p2, v0}, Lq5/h;->fold(Ljava/lang/Object;LB5/e;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    new-instance v1, LM5/q;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-direct {v1, v2, v3}, LM5/q;-><init>(IB)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p1, p2, v1}, Lq5/h;->fold(Ljava/lang/Object;LB5/e;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    check-cast p2, Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    if-nez p2, :cond_0

    .line 39
    .line 40
    invoke-interface {p0, p1}, Lq5/h;->plus(Lq5/h;)Lq5/h;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :cond_0
    new-instance v0, LM5/q;

    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    const/4 v2, 0x0

    .line 49
    invoke-direct {v0, v1, v2}, LM5/q;-><init>(IB)V

    .line 50
    .line 51
    .line 52
    sget-object v1, Lq5/i;->q:Lq5/i;

    .line 53
    .line 54
    invoke-interface {p0, v1, v0}, Lq5/h;->fold(Ljava/lang/Object;LB5/e;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, Lq5/h;

    .line 59
    .line 60
    if-eqz p2, :cond_1

    .line 61
    .line 62
    check-cast p1, Lq5/h;

    .line 63
    .line 64
    new-instance p2, LM5/q;

    .line 65
    .line 66
    const/4 v0, 0x2

    .line 67
    const/4 v2, 0x0

    .line 68
    invoke-direct {p2, v0, v2}, LM5/q;-><init>(IB)V

    .line 69
    .line 70
    .line 71
    invoke-interface {p1, v1, p2}, Lq5/h;->fold(Ljava/lang/Object;LB5/e;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    :cond_1
    check-cast p1, Lq5/h;

    .line 76
    .line 77
    invoke-interface {p0, p1}, Lq5/h;->plus(Lq5/h;)Lq5/h;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0
.end method

.method public static final k(Ljava/util/concurrent/Executor;)LM5/s;
    .locals 1

    .line 1
    instance-of v0, p0, LM5/G;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, LM5/G;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object p0, v0, LM5/G;->q:LM5/s;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    new-instance v0, LM5/U;

    .line 16
    .line 17
    invoke-direct {v0, p0}, LM5/U;-><init>(Ljava/util/concurrent/Executor;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public static final l(Lq5/h;)LM5/C;
    .locals 1

    .line 1
    sget-object v0, Lq5/d;->q:Lq5/d;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lq5/h;->get(Lq5/g;)Lq5/f;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    instance-of v0, p0, LM5/C;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p0, LM5/C;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    :goto_0
    if-nez p0, :cond_1

    .line 16
    .line 17
    sget-object p0, LM5/A;->a:LM5/C;

    .line 18
    .line 19
    :cond_1
    return-object p0
.end method

.method public static final m(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static final n(Lq5/h;)LM5/b0;
    .locals 3

    .line 1
    sget-object v0, LM5/t;->r:LM5/t;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lq5/h;->get(Lq5/g;)Lq5/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LM5/b0;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v2, "Current context doesn\'t contain Job in it: "

    .line 17
    .line 18
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v0
.end method

.method public static final o(Lq5/c;)LM5/h;
    .locals 6

    .line 1
    instance-of v0, p0, LR5/g;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LM5/h;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p0}, LM5/h;-><init>(ILq5/c;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    move-object v0, p0

    .line 13
    check-cast v0, LR5/g;

    .line 14
    .line 15
    sget-object v1, LR5/b;->c:LE4/f;

    .line 16
    .line 17
    sget-object v2, LR5/g;->x:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 18
    .line 19
    :cond_1
    :goto_0
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const/4 v4, 0x0

    .line 24
    if-nez v3, :cond_2

    .line 25
    .line 26
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    move-object v3, v4

    .line 30
    goto :goto_1

    .line 31
    :cond_2
    instance-of v5, v3, LM5/h;

    .line 32
    .line 33
    if-eqz v5, :cond_8

    .line 34
    .line 35
    :cond_3
    invoke-virtual {v2, v0, v3, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_7

    .line 40
    .line 41
    check-cast v3, LM5/h;

    .line 42
    .line 43
    :goto_1
    if-eqz v3, :cond_6

    .line 44
    .line 45
    sget-object v0, LM5/h;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 46
    .line 47
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    instance-of v2, v1, LM5/o;

    .line 52
    .line 53
    if-eqz v2, :cond_4

    .line 54
    .line 55
    check-cast v1, LM5/o;

    .line 56
    .line 57
    iget-object v1, v1, LM5/o;->d:Ljava/lang/Object;

    .line 58
    .line 59
    if-eqz v1, :cond_4

    .line 60
    .line 61
    invoke-virtual {v3}, LM5/h;->l()V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_4
    sget-object v1, LM5/h;->v:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 66
    .line 67
    const v2, 0x1fffffff

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v3, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->set(Ljava/lang/Object;I)V

    .line 71
    .line 72
    .line 73
    sget-object v1, LM5/b;->a:LM5/b;

    .line 74
    .line 75
    invoke-virtual {v0, v3, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    move-object v4, v3

    .line 79
    :goto_2
    if-nez v4, :cond_5

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_5
    return-object v4

    .line 83
    :cond_6
    :goto_3
    new-instance v0, LM5/h;

    .line 84
    .line 85
    const/4 v1, 0x2

    .line 86
    invoke-direct {v0, v1, p0}, LM5/h;-><init>(ILq5/c;)V

    .line 87
    .line 88
    .line 89
    return-object v0

    .line 90
    :cond_7
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    if-eq v5, v3, :cond_3

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_8
    if-eq v3, v1, :cond_1

    .line 98
    .line 99
    instance-of v4, v3, Ljava/lang/Throwable;

    .line 100
    .line 101
    if-eqz v4, :cond_9

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 105
    .line 106
    new-instance v0, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    const-string v1, "Inconsistent state "

    .line 109
    .line 110
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw p0
.end method

.method public static final p(Ljava/lang/Throwable;Lq5/h;)V
    .locals 3

    .line 1
    instance-of v0, p0, LM5/D;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, LM5/D;

    .line 6
    .line 7
    iget-object p0, p0, LM5/D;->q:Ljava/lang/Throwable;

    .line 8
    .line 9
    :cond_0
    :try_start_0
    sget-object v0, LM5/t;->q:LM5/t;

    .line 10
    .line 11
    invoke-interface {p1, v0}, Lq5/h;->get(Lq5/g;)Lq5/f;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, LM5/u;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-interface {v0, p0}, LM5/u;->W(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-static {p0, p1}, LR5/b;->d(Ljava/lang/Throwable;Lq5/h;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :goto_0
    if-ne p0, v0, :cond_2

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    new-instance v1, Ljava/lang/RuntimeException;

    .line 33
    .line 34
    const-string v2, "Exception while trying to handle coroutine exception"

    .line 35
    .line 36
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v1, p0}, Lm5/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    move-object p0, v1

    .line 43
    :goto_1
    invoke-static {p0, p1}, LR5/b;->d(Ljava/lang/Throwable;Lq5/h;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public static final q(LM5/b0;ZLM5/e0;)LM5/J;
    .locals 9

    .line 1
    instance-of v0, p0, LM5/i0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, LM5/i0;

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, LM5/i0;->J(ZLM5/e0;)LM5/J;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-virtual {p2}, LM5/e0;->k()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    new-instance v1, LC0/s;

    .line 17
    .line 18
    const/4 v7, 0x0

    .line 19
    const/4 v8, 0x2

    .line 20
    const/4 v2, 0x1

    .line 21
    const-class v4, LM5/e0;

    .line 22
    .line 23
    const-string v5, "invoke"

    .line 24
    .line 25
    const-string v6, "invoke(Ljava/lang/Throwable;)V"

    .line 26
    .line 27
    move-object v3, p2

    .line 28
    invoke-direct/range {v1 .. v8}, LC0/s;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p0, v0, p1, v1}, LM5/b0;->c(ZZLC0/s;)LM5/J;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public static final r(LM5/w;)Z
    .locals 1

    .line 1
    invoke-interface {p0}, LM5/w;->d()Lq5/h;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, LM5/t;->r:LM5/t;

    .line 6
    .line 7
    invoke-interface {p0, v0}, Lq5/h;->get(Lq5/g;)Lq5/f;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, LM5/b0;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-interface {p0}, LM5/b0;->b()Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_0
    const/4 p0, 0x1

    .line 21
    return p0
.end method

.method public static final s(Lq5/h;)Z
    .locals 1

    .line 1
    sget-object v0, LM5/t;->r:LM5/t;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lq5/h;->get(Lq5/g;)Lq5/f;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LM5/b0;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, LM5/b0;->b()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public static t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;
    .locals 1

    .line 1
    and-int/lit8 v0, p4, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p1, Lq5/i;->q:Lq5/i;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x2

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    sget-object p2, LM5/x;->q:LM5/x;

    .line 12
    .line 13
    :cond_1
    invoke-static {p0, p1}, LM5/y;->u(LM5/w;Lq5/h;)Lq5/h;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    sget-object p1, LM5/x;->r:LM5/x;

    .line 21
    .line 22
    if-ne p2, p1, :cond_2

    .line 23
    .line 24
    new-instance p1, LM5/j0;

    .line 25
    .line 26
    invoke-direct {p1, p0, p3}, LM5/j0;-><init>(Lq5/h;LB5/e;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    new-instance p1, LM5/B;

    .line 31
    .line 32
    const/4 p4, 0x1

    .line 33
    const/4 v0, 0x1

    .line 34
    invoke-direct {p1, p0, v0, p4}, LM5/B;-><init>(Lq5/h;ZI)V

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-virtual {p1, p2, p1, p3}, LM5/a;->d0(LM5/x;LM5/a;LB5/e;)V

    .line 38
    .line 39
    .line 40
    return-object p1
.end method

.method public static final u(LM5/w;Lq5/h;)Lq5/h;
    .locals 1

    .line 1
    invoke-interface {p0}, LM5/w;->d()Lq5/h;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-static {p0, p1, v0}, LM5/y;->j(Lq5/h;Lq5/h;Z)Lq5/h;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    sget-object p1, LM5/H;->a:LT5/e;

    .line 11
    .line 12
    if-eq p0, p1, :cond_0

    .line 13
    .line 14
    sget-object v0, Lq5/d;->q:Lq5/d;

    .line 15
    .line 16
    invoke-interface {p0, v0}, Lq5/h;->get(Lq5/g;)Lq5/f;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    invoke-interface {p0, p1}, Lq5/h;->plus(Lq5/h;)Lq5/h;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :cond_0
    return-object p0
.end method

.method public static final v(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p0, LM5/p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, LM5/p;

    .line 6
    .line 7
    iget-object p0, p0, LM5/p;->a:Ljava/lang/Throwable;

    .line 8
    .line 9
    invoke-static {p0}, Lm5/a;->b(Ljava/lang/Throwable;)Lm5/l;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :cond_0
    return-object p0
.end method

.method public static final w(LM5/h;Lq5/c;Z)V
    .locals 2

    .line 1
    sget-object v0, LM5/h;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, v0}, LM5/h;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-static {v1}, Lm5/a;->b(Ljava/lang/Throwable;)Lm5/l;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0, v0}, LM5/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :goto_0
    if-eqz p2, :cond_6

    .line 23
    .line 24
    const-string p2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>"

    .line 25
    .line 26
    invoke-static {p1, p2}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    check-cast p1, LR5/g;

    .line 30
    .line 31
    iget-object p2, p1, LR5/g;->u:Lq5/c;

    .line 32
    .line 33
    iget-object p1, p1, LR5/g;->w:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-interface {p2}, Lq5/c;->getContext()Lq5/h;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0, p1}, LR5/b;->n(Lq5/h;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    sget-object v1, LR5/b;->d:LE4/f;

    .line 44
    .line 45
    if-eq p1, v1, :cond_1

    .line 46
    .line 47
    invoke-static {p2, v0, p1}, LM5/y;->A(Lq5/c;Lq5/h;Ljava/lang/Object;)LM5/y0;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    const/4 v1, 0x0

    .line 53
    :goto_1
    :try_start_0
    invoke-interface {p2, p0}, Lq5/c;->resumeWith(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    invoke-virtual {v1}, LM5/y0;->f0()Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_2

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    return-void

    .line 66
    :cond_3
    :goto_2
    invoke-static {v0, p1}, LR5/b;->g(Lq5/h;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :catchall_0
    move-exception p0

    .line 71
    if-eqz v1, :cond_4

    .line 72
    .line 73
    invoke-virtual {v1}, LM5/y0;->f0()Z

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    if-eqz p2, :cond_5

    .line 78
    .line 79
    :cond_4
    invoke-static {v0, p1}, LR5/b;->g(Lq5/h;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    :cond_5
    throw p0

    .line 83
    :cond_6
    invoke-interface {p1, p0}, Lq5/c;->resumeWith(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public static final x(Lq5/h;LB5/e;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lq5/d;->q:Lq5/d;

    .line 6
    .line 7
    invoke-interface {p0, v1}, Lq5/h;->get(Lq5/g;)Lq5/f;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Lq5/e;

    .line 12
    .line 13
    sget-object v3, Lq5/i;->q:Lq5/i;

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    invoke-static {}, LM5/s0;->a()LM5/S;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-interface {p0, v2}, Lq5/h;->plus(Lq5/h;)Lq5/h;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {v3, p0, v4}, LM5/y;->j(Lq5/h;Lq5/h;Z)Lq5/h;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    sget-object v3, LM5/H;->a:LT5/e;

    .line 31
    .line 32
    if-eq p0, v3, :cond_2

    .line 33
    .line 34
    invoke-interface {p0, v1}, Lq5/h;->get(Lq5/g;)Lq5/f;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    invoke-interface {p0, v3}, Lq5/h;->plus(Lq5/h;)Lq5/h;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    instance-of v5, v2, LM5/S;

    .line 46
    .line 47
    if-eqz v5, :cond_1

    .line 48
    .line 49
    check-cast v2, LM5/S;

    .line 50
    .line 51
    :cond_1
    sget-object v2, LM5/s0;->a:Ljava/lang/ThreadLocal;

    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, LM5/S;

    .line 58
    .line 59
    invoke-static {v3, p0, v4}, LM5/y;->j(Lq5/h;Lq5/h;Z)Lq5/h;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    sget-object v3, LM5/H;->a:LT5/e;

    .line 64
    .line 65
    if-eq p0, v3, :cond_2

    .line 66
    .line 67
    invoke-interface {p0, v1}, Lq5/h;->get(Lq5/g;)Lq5/f;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    if-nez v1, :cond_2

    .line 72
    .line 73
    invoke-interface {p0, v3}, Lq5/h;->plus(Lq5/h;)Lq5/h;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    :cond_2
    :goto_0
    new-instance v1, LM5/c;

    .line 78
    .line 79
    invoke-direct {v1, p0, v0, v2}, LM5/c;-><init>(Lq5/h;Ljava/lang/Thread;LM5/S;)V

    .line 80
    .line 81
    .line 82
    sget-object p0, LM5/x;->q:LM5/x;

    .line 83
    .line 84
    invoke-virtual {v1, p0, v1, p1}, LM5/a;->d0(LM5/x;LM5/a;LB5/e;)V

    .line 85
    .line 86
    .line 87
    const/4 p0, 0x0

    .line 88
    iget-object p1, v1, LM5/c;->u:LM5/S;

    .line 89
    .line 90
    if-eqz p1, :cond_3

    .line 91
    .line 92
    sget v0, LM5/S;->t:I

    .line 93
    .line 94
    invoke-virtual {p1, p0}, LM5/S;->d0(Z)V

    .line 95
    .line 96
    .line 97
    :cond_3
    :goto_1
    if-eqz p1, :cond_4

    .line 98
    .line 99
    :try_start_0
    invoke-virtual {p1}, LM5/S;->e0()J

    .line 100
    .line 101
    .line 102
    move-result-wide v2

    .line 103
    goto :goto_2

    .line 104
    :catchall_0
    move-exception v0

    .line 105
    goto :goto_4

    .line 106
    :cond_4
    const-wide v2, 0x7fffffffffffffffL

    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    :goto_2
    sget-object v0, LM5/i0;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 112
    .line 113
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    instance-of v4, v4, LM5/X;

    .line 118
    .line 119
    if-eqz v4, :cond_5

    .line 120
    .line 121
    invoke-static {v1, v2, v3}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(Ljava/lang/Object;J)V

    .line 122
    .line 123
    .line 124
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-eqz v0, :cond_3

    .line 129
    .line 130
    new-instance v0, Ljava/lang/InterruptedException;

    .line 131
    .line 132
    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1, v0}, LM5/i0;->s(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_5
    if-eqz p1, :cond_6

    .line 140
    .line 141
    sget v2, LM5/S;->t:I

    .line 142
    .line 143
    invoke-virtual {p1, p0}, LM5/S;->a0(Z)V

    .line 144
    .line 145
    .line 146
    :cond_6
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-static {p0}, LM5/y;->z(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    instance-of p1, p0, LM5/p;

    .line 155
    .line 156
    if-eqz p1, :cond_7

    .line 157
    .line 158
    move-object p1, p0

    .line 159
    check-cast p1, LM5/p;

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_7
    const/4 p1, 0x0

    .line 163
    :goto_3
    if-nez p1, :cond_8

    .line 164
    .line 165
    return-object p0

    .line 166
    :cond_8
    iget-object p0, p1, LM5/p;->a:Ljava/lang/Throwable;

    .line 167
    .line 168
    throw p0

    .line 169
    :goto_4
    if-eqz p1, :cond_9

    .line 170
    .line 171
    sget v1, LM5/S;->t:I

    .line 172
    .line 173
    invoke-virtual {p1, p0}, LM5/S;->a0(Z)V

    .line 174
    .line 175
    .line 176
    :cond_9
    throw v0
.end method

.method public static final y(Lq5/c;)Ljava/lang/String;
    .locals 3

    .line 1
    instance-of v0, p0, LR5/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, LR5/g;

    .line 6
    .line 7
    invoke-virtual {p0}, LR5/g;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const/16 v0, 0x40

    .line 13
    .line 14
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-static {p0}, LM5/y;->m(Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception v1

    .line 38
    invoke-static {v1}, Lm5/a;->b(Ljava/lang/Throwable;)Lm5/l;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    :goto_0
    invoke-static {v1}, Lm5/m;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    if-nez v2, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-static {p0}, LM5/y;->m(Ljava/lang/Object;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    :goto_1
    check-cast v1, Ljava/lang/String;

    .line 80
    .line 81
    return-object v1
.end method

.method public static final z(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p0, LM5/Y;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, LM5/Y;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-eqz v0, :cond_2

    .line 11
    .line 12
    iget-object v0, v0, LM5/Y;->a:LM5/X;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    return-object v0

    .line 18
    :cond_2
    :goto_1
    return-object p0
.end method
