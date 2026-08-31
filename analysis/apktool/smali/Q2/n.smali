.class public final LQ2/n;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:Lkotlin/jvm/internal/y;

.field public r:I

.field public synthetic s:Ljava/lang/Object;

.field public final synthetic t:Lkotlin/jvm/internal/y;

.field public final synthetic u:LQ2/q;

.field public final synthetic v:Lkotlin/jvm/internal/y;

.field public final synthetic w:LQ2/t;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/y;LQ2/q;Lkotlin/jvm/internal/y;LQ2/t;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ2/n;->t:Lkotlin/jvm/internal/y;

    .line 2
    .line 3
    iput-object p2, p0, LQ2/n;->u:LQ2/q;

    .line 4
    .line 5
    iput-object p3, p0, LQ2/n;->v:Lkotlin/jvm/internal/y;

    .line 6
    .line 7
    iput-object p4, p0, LQ2/n;->w:LQ2/t;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Ls5/i;-><init>(ILq5/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 6

    .line 1
    new-instance v0, LQ2/n;

    .line 2
    .line 3
    iget-object v3, p0, LQ2/n;->v:Lkotlin/jvm/internal/y;

    .line 4
    .line 5
    iget-object v4, p0, LQ2/n;->w:LQ2/t;

    .line 6
    .line 7
    iget-object v1, p0, LQ2/n;->t:Lkotlin/jvm/internal/y;

    .line 8
    .line 9
    iget-object v2, p0, LQ2/n;->u:LQ2/q;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, LQ2/n;-><init>(Lkotlin/jvm/internal/y;LQ2/q;Lkotlin/jvm/internal/y;LQ2/t;Lq5/c;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, LQ2/n;->s:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LQ2/u;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LQ2/n;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LQ2/n;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LQ2/n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, LQ2/n;->u:LQ2/q;

    .line 2
    .line 3
    iget-object v1, v0, LQ2/q;->a:Ljava/lang/String;

    .line 4
    .line 5
    iget v2, p0, LQ2/n;->r:I

    .line 6
    .line 7
    sget-object v3, LJ2/h;->t:LJ2/h;

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x1

    .line 11
    const/4 v6, 0x0

    .line 12
    iget-object v7, p0, LQ2/n;->v:Lkotlin/jvm/internal/y;

    .line 13
    .line 14
    iget-object v8, p0, LQ2/n;->t:Lkotlin/jvm/internal/y;

    .line 15
    .line 16
    sget-object v9, Lr5/a;->q:Lr5/a;

    .line 17
    .line 18
    if-eqz v2, :cond_2

    .line 19
    .line 20
    if-eq v2, v5, :cond_1

    .line 21
    .line 22
    if-ne v2, v4, :cond_0

    .line 23
    .line 24
    iget-object v2, p0, LQ2/n;->s:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, LQ2/u;

    .line 27
    .line 28
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto/16 :goto_2

    .line 32
    .line 33
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 36
    .line 37
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1

    .line 41
    :cond_1
    iget-object v2, p0, LQ2/n;->q:Lkotlin/jvm/internal/y;

    .line 42
    .line 43
    iget-object v5, p0, LQ2/n;->s:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v5, LQ2/u;

    .line 46
    .line 47
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, LQ2/n;->s:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, LQ2/u;

    .line 57
    .line 58
    iget-object v2, v8, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, LK2/h;

    .line 61
    .line 62
    iget-object v10, v7, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v10, LQ2/u;

    .line 65
    .line 66
    iput-object p1, p0, LQ2/n;->s:Ljava/lang/Object;

    .line 67
    .line 68
    iput-object v8, p0, LQ2/n;->q:Lkotlin/jvm/internal/y;

    .line 69
    .line 70
    iput v5, p0, LQ2/n;->r:I

    .line 71
    .line 72
    invoke-static {v0, v2, v10, p1, p0}, LQ2/q;->c(LQ2/q;LK2/h;LQ2/u;LQ2/u;Ls5/c;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    if-ne v2, v9, :cond_3

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    move-object v5, p1

    .line 80
    move-object p1, v2

    .line 81
    move-object v2, v8

    .line 82
    :goto_0
    iput-object p1, v2, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 83
    .line 84
    iget-object p1, v8, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 85
    .line 86
    if-eqz p1, :cond_5

    .line 87
    .line 88
    check-cast p1, LK2/h;

    .line 89
    .line 90
    invoke-virtual {v0, p1}, LQ2/q;->i(LK2/h;)LQ2/u;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    iput-object p1, v7, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 95
    .line 96
    new-instance p1, LL2/i;

    .line 97
    .line 98
    iget-object v2, v8, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 99
    .line 100
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    check-cast v2, LK2/h;

    .line 104
    .line 105
    invoke-virtual {v0, v2}, LQ2/q;->h(LK2/h;)LJ2/p;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    iget-object v2, v7, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v2, LQ2/u;

    .line 112
    .line 113
    if-eqz v2, :cond_4

    .line 114
    .line 115
    iget-object v2, v2, LQ2/u;->d:LQ2/s;

    .line 116
    .line 117
    if-eqz v2, :cond_4

    .line 118
    .line 119
    invoke-virtual {v2}, LQ2/s;->a()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    :cond_4
    invoke-static {v1, v6}, LQ2/q;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-direct {p1, v0, v1, v3}, LL2/i;-><init>(LJ2/q;Ljava/lang/String;LJ2/h;)V

    .line 128
    .line 129
    .line 130
    return-object p1

    .line 131
    :cond_5
    iget-object p1, v5, LQ2/u;->e:LQ2/v;

    .line 132
    .line 133
    if-eqz p1, :cond_8

    .line 134
    .line 135
    iput-object v5, p0, LQ2/n;->s:Ljava/lang/Object;

    .line 136
    .line 137
    iput-object v6, p0, LQ2/n;->q:Lkotlin/jvm/internal/y;

    .line 138
    .line 139
    iput v4, p0, LQ2/n;->r:I

    .line 140
    .line 141
    invoke-static {p1, p0}, Lcom/google/android/gms/internal/measurement/K1;->I(LQ2/v;Ls5/c;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    if-ne p1, v9, :cond_6

    .line 146
    .line 147
    :goto_1
    return-object v9

    .line 148
    :cond_6
    move-object v2, v5

    .line 149
    :goto_2
    check-cast p1, Lq6/g;

    .line 150
    .line 151
    iget-wide v4, p1, Lq6/g;->r:J

    .line 152
    .line 153
    const-wide/16 v7, 0x0

    .line 154
    .line 155
    cmp-long v4, v4, v7

    .line 156
    .line 157
    if-lez v4, :cond_7

    .line 158
    .line 159
    new-instance v4, LL2/i;

    .line 160
    .line 161
    invoke-virtual {v0}, LQ2/q;->e()Lq6/l;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    new-instance v5, LJ2/s;

    .line 166
    .line 167
    invoke-direct {v5, p1, v0, v6}, LJ2/s;-><init>(Lq6/i;Lq6/l;LE3/h;)V

    .line 168
    .line 169
    .line 170
    iget-object p1, v2, LQ2/u;->d:LQ2/s;

    .line 171
    .line 172
    invoke-virtual {p1}, LQ2/s;->a()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-static {v1, p1}, LQ2/q;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-direct {v4, v5, p1, v3}, LL2/i;-><init>(LJ2/q;Ljava/lang/String;LJ2/h;)V

    .line 181
    .line 182
    .line 183
    return-object v4

    .line 184
    :cond_7
    return-object v6

    .line 185
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 186
    .line 187
    const-string v0, "body == null"

    .line 188
    .line 189
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    throw p1
.end method
