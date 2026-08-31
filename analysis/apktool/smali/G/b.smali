.class public final LG/b;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public final synthetic r:LG/e;

.field public final synthetic s:LB0/n0;

.field public final synthetic t:LB0/K;


# direct methods
.method public constructor <init>(LG/e;LB0/n0;LB0/K;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LG/b;->r:LG/e;

    .line 2
    .line 3
    iput-object p2, p0, LG/b;->s:LB0/n0;

    .line 4
    .line 5
    iput-object p3, p0, LG/b;->t:LB0/K;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Ls5/i;-><init>(ILq5/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 3

    .line 1
    new-instance p1, LG/b;

    .line 2
    .line 3
    iget-object v0, p0, LG/b;->s:LB0/n0;

    .line 4
    .line 5
    iget-object v1, p0, LG/b;->t:LB0/K;

    .line 6
    .line 7
    iget-object v2, p0, LG/b;->r:LG/e;

    .line 8
    .line 9
    invoke-direct {p1, v2, v0, v1, p2}, LG/b;-><init>(LG/e;LB0/n0;LB0/K;Lq5/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LM5/w;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LG/b;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LG/b;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LG/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, LG/b;->q:I

    .line 2
    .line 3
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    if-ne v0, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, LG/b;->r:LG/e;

    .line 26
    .line 27
    iget-object v0, p1, LG/e;->E:Lw/j;

    .line 28
    .line 29
    new-instance v3, LG/a;

    .line 30
    .line 31
    iget-object v4, p0, LG/b;->s:LB0/n0;

    .line 32
    .line 33
    iget-object v5, p0, LG/b;->t:LB0/K;

    .line 34
    .line 35
    invoke-direct {v3, p1, v4, v5}, LG/a;-><init>(LG/e;LB0/n0;LB0/K;)V

    .line 36
    .line 37
    .line 38
    iput v2, p0, LG/b;->q:I

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, LG/a;->invoke()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, Li0/c;

    .line 48
    .line 49
    sget-object v4, Lr5/a;->q:Lr5/a;

    .line 50
    .line 51
    if-eqz p1, :cond_8

    .line 52
    .line 53
    iget-wide v5, v0, Lw/j;->M:J

    .line 54
    .line 55
    invoke-virtual {v0, p1, v5, v6}, Lw/j;->z0(Li0/c;J)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-nez p1, :cond_8

    .line 60
    .line 61
    new-instance p1, LM5/h;

    .line 62
    .line 63
    invoke-static {p0}, Ln5/A;->v(Lq5/c;)Lq5/c;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    invoke-direct {p1, v2, v5}, LM5/h;-><init>(ILq5/c;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, LM5/h;->s()V

    .line 71
    .line 72
    .line 73
    new-instance v5, Lw/g;

    .line 74
    .line 75
    invoke-direct {v5, v3, p1}, Lw/g;-><init>(LG/a;LM5/h;)V

    .line 76
    .line 77
    .line 78
    iget-object v6, v0, Lw/j;->I:LE/k;

    .line 79
    .line 80
    iget-object v7, v6, LE/k;->a:LR/e;

    .line 81
    .line 82
    invoke-virtual {v3}, LG/a;->invoke()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    check-cast v3, Li0/c;

    .line 87
    .line 88
    if-nez v3, :cond_2

    .line 89
    .line 90
    invoke-virtual {p1, v1}, LM5/h;->resumeWith(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    goto :goto_4

    .line 94
    :cond_2
    new-instance v8, Lv/u;

    .line 95
    .line 96
    const/4 v9, 0x3

    .line 97
    invoke-direct {v8, v9, v6, v5}, Lv/u;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, v8}, LM5/h;->u(LB5/c;)V

    .line 101
    .line 102
    .line 103
    iget v6, v7, LR/e;->s:I

    .line 104
    .line 105
    const/4 v8, 0x0

    .line 106
    invoke-static {v8, v6}, LD5/a;->O(II)LG5/d;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    iget v9, v6, LG5/b;->q:I

    .line 111
    .line 112
    iget v6, v6, LG5/b;->r:I

    .line 113
    .line 114
    if-gt v9, v6, :cond_6

    .line 115
    .line 116
    :goto_0
    iget-object v10, v7, LR/e;->q:[Ljava/lang/Object;

    .line 117
    .line 118
    aget-object v10, v10, v6

    .line 119
    .line 120
    check-cast v10, Lw/g;

    .line 121
    .line 122
    iget-object v10, v10, Lw/g;->a:LG/a;

    .line 123
    .line 124
    invoke-virtual {v10}, LG/a;->invoke()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v10

    .line 128
    check-cast v10, Li0/c;

    .line 129
    .line 130
    if-nez v10, :cond_3

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_3
    invoke-virtual {v3, v10}, Li0/c;->c(Li0/c;)Li0/c;

    .line 134
    .line 135
    .line 136
    move-result-object v11

    .line 137
    invoke-virtual {v11, v3}, Li0/c;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v12

    .line 141
    if-eqz v12, :cond_4

    .line 142
    .line 143
    add-int/2addr v6, v2

    .line 144
    invoke-virtual {v7, v6, v5}, LR/e;->b(ILjava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_4
    invoke-virtual {v11, v10}, Li0/c;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    if-nez v10, :cond_5

    .line 153
    .line 154
    new-instance v10, Ljava/util/concurrent/CancellationException;

    .line 155
    .line 156
    const-string v11, "bringIntoView call interrupted by a newer, non-overlapping call"

    .line 157
    .line 158
    invoke-direct {v10, v11}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    iget v11, v7, LR/e;->s:I

    .line 162
    .line 163
    sub-int/2addr v11, v2

    .line 164
    if-gt v11, v6, :cond_5

    .line 165
    .line 166
    :goto_1
    iget-object v12, v7, LR/e;->q:[Ljava/lang/Object;

    .line 167
    .line 168
    aget-object v12, v12, v6

    .line 169
    .line 170
    check-cast v12, Lw/g;

    .line 171
    .line 172
    iget-object v12, v12, Lw/g;->b:LM5/h;

    .line 173
    .line 174
    invoke-virtual {v12, v10}, LM5/h;->g(Ljava/lang/Throwable;)Z

    .line 175
    .line 176
    .line 177
    if-eq v11, v6, :cond_5

    .line 178
    .line 179
    add-int/lit8 v11, v11, 0x1

    .line 180
    .line 181
    goto :goto_1

    .line 182
    :cond_5
    :goto_2
    if-eq v6, v9, :cond_6

    .line 183
    .line 184
    add-int/lit8 v6, v6, -0x1

    .line 185
    .line 186
    goto :goto_0

    .line 187
    :cond_6
    invoke-virtual {v7, v8, v5}, LR/e;->b(ILjava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    :goto_3
    iget-boolean v2, v0, Lw/j;->N:Z

    .line 191
    .line 192
    if-nez v2, :cond_7

    .line 193
    .line 194
    invoke-virtual {v0}, Lw/j;->A0()V

    .line 195
    .line 196
    .line 197
    :cond_7
    :goto_4
    invoke-virtual {p1}, LM5/h;->r()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    if-ne p1, v4, :cond_8

    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_8
    move-object p1, v1

    .line 205
    :goto_5
    if-ne p1, v4, :cond_9

    .line 206
    .line 207
    return-object v4

    .line 208
    :cond_9
    return-object v1
.end method
