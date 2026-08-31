.class public final LN/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LB0/a;

.field public final b:LA0/d;

.field public final c:Lu/k;

.field public final d:LB5/c;

.field public final e:LN/x;

.field public final f:LB0/o;

.field public final g:LP/f0;

.field public final h:LP/C;

.field public final i:LP/C;

.field public final j:LP/b0;

.field public final k:LP/b0;

.field public final l:LP/f0;

.field public final m:LP/f0;

.field public final n:LN/o;


# direct methods
.method public constructor <init>(LM/J0;LB0/a;LA0/d;Lu/k;LB5/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LN/r;->a:LB0/a;

    .line 5
    .line 6
    iput-object p3, p0, LN/r;->b:LA0/d;

    .line 7
    .line 8
    iput-object p4, p0, LN/r;->c:Lu/k;

    .line 9
    .line 10
    iput-object p5, p0, LN/r;->d:LB5/c;

    .line 11
    .line 12
    new-instance p2, LN/x;

    .line 13
    .line 14
    invoke-direct {p2}, LN/x;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, LN/r;->e:LN/x;

    .line 18
    .line 19
    new-instance p2, LB0/o;

    .line 20
    .line 21
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p0, p2, LB0/o;->r:Ljava/lang/Object;

    .line 25
    .line 26
    new-instance p3, LN/q;

    .line 27
    .line 28
    invoke-direct {p3, p0}, LN/q;-><init>(LN/r;)V

    .line 29
    .line 30
    .line 31
    iput-object p3, p2, LB0/o;->q:Ljava/lang/Object;

    .line 32
    .line 33
    iput-object p2, p0, LN/r;->f:LB0/o;

    .line 34
    .line 35
    invoke-static {p1}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, LN/r;->g:LP/f0;

    .line 40
    .line 41
    new-instance p1, LN/i;

    .line 42
    .line 43
    const/4 p2, 0x4

    .line 44
    invoke-direct {p1, p0, p2}, LN/i;-><init>(LN/r;I)V

    .line 45
    .line 46
    .line 47
    invoke-static {p1}, LP/b;->m(LB5/a;)LP/C;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, p0, LN/r;->h:LP/C;

    .line 52
    .line 53
    new-instance p1, LN/i;

    .line 54
    .line 55
    const/4 p2, 0x2

    .line 56
    invoke-direct {p1, p0, p2}, LN/i;-><init>(LN/r;I)V

    .line 57
    .line 58
    .line 59
    invoke-static {p1}, LP/b;->m(LB5/a;)LP/C;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, LN/r;->i:LP/C;

    .line 64
    .line 65
    new-instance p1, LP/b0;

    .line 66
    .line 67
    const/high16 p2, 0x7fc00000    # Float.NaN

    .line 68
    .line 69
    invoke-direct {p1, p2}, LP/b0;-><init>(F)V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, LN/r;->j:LP/b0;

    .line 73
    .line 74
    sget-object p1, LP/S;->v:LP/S;

    .line 75
    .line 76
    new-instance p2, LN/i;

    .line 77
    .line 78
    const/4 p3, 0x3

    .line 79
    invoke-direct {p2, p0, p3}, LN/i;-><init>(LN/r;I)V

    .line 80
    .line 81
    .line 82
    invoke-static {p2, p1}, LP/b;->n(LB5/a;LP/I0;)LP/C;

    .line 83
    .line 84
    .line 85
    new-instance p1, LP/b0;

    .line 86
    .line 87
    const/4 p2, 0x0

    .line 88
    invoke-direct {p1, p2}, LP/b0;-><init>(F)V

    .line 89
    .line 90
    .line 91
    iput-object p1, p0, LN/r;->k:LP/b0;

    .line 92
    .line 93
    const/4 p1, 0x0

    .line 94
    invoke-static {p1}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iput-object p1, p0, LN/r;->l:LP/f0;

    .line 99
    .line 100
    new-instance p1, LN/y;

    .line 101
    .line 102
    sget-object p2, Ln5/t;->q:Ln5/t;

    .line 103
    .line 104
    invoke-direct {p1, p2}, LN/y;-><init>(Ljava/util/Map;)V

    .line 105
    .line 106
    .line 107
    invoke-static {p1}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    iput-object p1, p0, LN/r;->m:LP/f0;

    .line 112
    .line 113
    new-instance p1, LN/o;

    .line 114
    .line 115
    invoke-direct {p1, p0}, LN/o;-><init>(LN/r;)V

    .line 116
    .line 117
    .line 118
    iput-object p1, p0, LN/r;->n:LN/o;

    .line 119
    .line 120
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lv/W;LN/b;Ls5/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p4, LN/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, LN/l;

    .line 7
    .line 8
    iget v1, v0, LN/l;->t:I

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
    iput v1, v0, LN/l;->t:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LN/l;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, LN/l;-><init>(LN/r;Ls5/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, LN/l;->r:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, LN/l;->t:I

    .line 28
    .line 29
    const/high16 v2, 0x3f000000    # 0.5f

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    if-ne v1, v3, :cond_1

    .line 36
    .line 37
    iget-object p1, v0, LN/l;->q:LN/r;

    .line 38
    .line 39
    :try_start_0
    invoke-static {p4}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :catchall_0
    move-exception p2

    .line 44
    goto/16 :goto_4

    .line 45
    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    invoke-static {p4}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, LN/r;->d()LN/y;

    .line 58
    .line 59
    .line 60
    move-result-object p4

    .line 61
    iget-object p4, p4, LN/y;->a:Ljava/util/Map;

    .line 62
    .line 63
    invoke-interface {p4, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result p4

    .line 67
    if-eqz p4, :cond_5

    .line 68
    .line 69
    :try_start_1
    iget-object p4, p0, LN/r;->e:LN/x;

    .line 70
    .line 71
    new-instance v1, LN/n;

    .line 72
    .line 73
    invoke-direct {v1, p0, p1, p3, v4}, LN/n;-><init>(LN/r;Ljava/lang/Object;LB5/g;Lq5/c;)V

    .line 74
    .line 75
    .line 76
    iput-object p0, v0, LN/l;->q:LN/r;

    .line 77
    .line 78
    iput v3, v0, LN/l;->t:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 79
    .line 80
    :try_start_2
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    new-instance p1, LN/w;

    .line 84
    .line 85
    invoke-direct {p1, p2, p4, v1, v4}, LN/w;-><init>(Lv/W;LN/x;LB5/c;Lq5/c;)V

    .line 86
    .line 87
    .line 88
    invoke-static {p1, v0}, LM5/y;->g(LB5/e;Lq5/c;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 92
    sget-object p2, Lr5/a;->q:Lr5/a;

    .line 93
    .line 94
    if-ne p1, p2, :cond_3

    .line 95
    .line 96
    return-object p2

    .line 97
    :cond_3
    move-object p1, p0

    .line 98
    :goto_1
    invoke-virtual {p1, v4}, LN/r;->h(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    iget-object p2, p1, LN/r;->j:LP/b0;

    .line 102
    .line 103
    invoke-virtual {p1}, LN/r;->d()LN/y;

    .line 104
    .line 105
    .line 106
    move-result-object p3

    .line 107
    invoke-virtual {p2}, LP/b0;->e()F

    .line 108
    .line 109
    .line 110
    move-result p4

    .line 111
    invoke-virtual {p3, p4}, LN/y;->a(F)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p3

    .line 115
    if-eqz p3, :cond_6

    .line 116
    .line 117
    invoke-virtual {p2}, LP/b0;->e()F

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    invoke-virtual {p1}, LN/r;->d()LN/y;

    .line 122
    .line 123
    .line 124
    move-result-object p4

    .line 125
    invoke-virtual {p4, p3}, LN/y;->d(Ljava/lang/Object;)F

    .line 126
    .line 127
    .line 128
    move-result p4

    .line 129
    sub-float/2addr p2, p4

    .line 130
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 131
    .line 132
    .line 133
    move-result p2

    .line 134
    cmpg-float p2, p2, v2

    .line 135
    .line 136
    if-gtz p2, :cond_6

    .line 137
    .line 138
    iget-object p2, p1, LN/r;->d:LB5/c;

    .line 139
    .line 140
    invoke-interface {p2, p3}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    check-cast p2, Ljava/lang/Boolean;

    .line 145
    .line 146
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 147
    .line 148
    .line 149
    move-result p2

    .line 150
    if-eqz p2, :cond_6

    .line 151
    .line 152
    invoke-virtual {p1, p3}, LN/r;->g(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    goto :goto_5

    .line 156
    :goto_2
    move-object p2, p1

    .line 157
    goto :goto_3

    .line 158
    :catchall_1
    move-exception p1

    .line 159
    goto :goto_2

    .line 160
    :goto_3
    move-object p1, p0

    .line 161
    goto :goto_4

    .line 162
    :catchall_2
    move-exception p2

    .line 163
    goto :goto_3

    .line 164
    :goto_4
    invoke-virtual {p1, v4}, LN/r;->h(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    iget-object p3, p1, LN/r;->j:LP/b0;

    .line 168
    .line 169
    invoke-virtual {p1}, LN/r;->d()LN/y;

    .line 170
    .line 171
    .line 172
    move-result-object p4

    .line 173
    invoke-virtual {p3}, LP/b0;->e()F

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    invoke-virtual {p4, v0}, LN/y;->a(F)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p4

    .line 181
    if-eqz p4, :cond_4

    .line 182
    .line 183
    invoke-virtual {p3}, LP/b0;->e()F

    .line 184
    .line 185
    .line 186
    move-result p3

    .line 187
    invoke-virtual {p1}, LN/r;->d()LN/y;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-virtual {v0, p4}, LN/y;->d(Ljava/lang/Object;)F

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    sub-float/2addr p3, v0

    .line 196
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 197
    .line 198
    .line 199
    move-result p3

    .line 200
    cmpg-float p3, p3, v2

    .line 201
    .line 202
    if-gtz p3, :cond_4

    .line 203
    .line 204
    iget-object p3, p1, LN/r;->d:LB5/c;

    .line 205
    .line 206
    invoke-interface {p3, p4}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object p3

    .line 210
    check-cast p3, Ljava/lang/Boolean;

    .line 211
    .line 212
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 213
    .line 214
    .line 215
    move-result p3

    .line 216
    if-eqz p3, :cond_4

    .line 217
    .line 218
    invoke-virtual {p1, p4}, LN/r;->g(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    :cond_4
    throw p2

    .line 222
    :cond_5
    invoke-virtual {p0, p1}, LN/r;->g(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    :cond_6
    :goto_5
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 226
    .line 227
    return-object p1
.end method

.method public final b(Lv/W;LN/p;Ls5/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, LN/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, LN/h;

    .line 7
    .line 8
    iget v1, v0, LN/h;->t:I

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
    iput v1, v0, LN/h;->t:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LN/h;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, LN/h;-><init>(LN/r;Ls5/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, LN/h;->r:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, LN/h;->t:I

    .line 28
    .line 29
    const/high16 v2, 0x3f000000    # 0.5f

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
    iget-object p1, v0, LN/h;->q:LN/r;

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
    move-exception p2

    .line 43
    goto :goto_4

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_2
    invoke-static {p3}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :try_start_1
    iget-object p3, p0, LN/r;->e:LN/x;

    .line 56
    .line 57
    new-instance v1, LN/k;

    .line 58
    .line 59
    const/4 v4, 0x0

    .line 60
    invoke-direct {v1, p2, p0, v4}, LN/k;-><init>(LB5/f;LN/r;Lq5/c;)V

    .line 61
    .line 62
    .line 63
    iput-object p0, v0, LN/h;->q:LN/r;

    .line 64
    .line 65
    iput v3, v0, LN/h;->t:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 66
    .line 67
    :try_start_2
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    new-instance p2, LN/w;

    .line 71
    .line 72
    invoke-direct {p2, p1, p3, v1, v4}, LN/w;-><init>(Lv/W;LN/x;LB5/c;Lq5/c;)V

    .line 73
    .line 74
    .line 75
    invoke-static {p2, v0}, LM5/y;->g(LB5/e;Lq5/c;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 79
    sget-object p2, Lr5/a;->q:Lr5/a;

    .line 80
    .line 81
    if-ne p1, p2, :cond_3

    .line 82
    .line 83
    return-object p2

    .line 84
    :cond_3
    move-object p1, p0

    .line 85
    :goto_1
    invoke-virtual {p1}, LN/r;->d()LN/y;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    iget-object p3, p1, LN/r;->j:LP/b0;

    .line 90
    .line 91
    invoke-virtual {p3}, LP/b0;->e()F

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    invoke-virtual {p2, v0}, LN/y;->a(F)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    if-eqz p2, :cond_4

    .line 100
    .line 101
    invoke-virtual {p3}, LP/b0;->e()F

    .line 102
    .line 103
    .line 104
    move-result p3

    .line 105
    invoke-virtual {p1}, LN/r;->d()LN/y;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v0, p2}, LN/y;->d(Ljava/lang/Object;)F

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    sub-float/2addr p3, v0

    .line 114
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 115
    .line 116
    .line 117
    move-result p3

    .line 118
    cmpg-float p3, p3, v2

    .line 119
    .line 120
    if-gtz p3, :cond_4

    .line 121
    .line 122
    iget-object p3, p1, LN/r;->d:LB5/c;

    .line 123
    .line 124
    invoke-interface {p3, p2}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p3

    .line 128
    check-cast p3, Ljava/lang/Boolean;

    .line 129
    .line 130
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 131
    .line 132
    .line 133
    move-result p3

    .line 134
    if-eqz p3, :cond_4

    .line 135
    .line 136
    invoke-virtual {p1, p2}, LN/r;->g(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :cond_4
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 140
    .line 141
    return-object p1

    .line 142
    :goto_2
    move-object p2, p1

    .line 143
    goto :goto_3

    .line 144
    :catchall_1
    move-exception p1

    .line 145
    goto :goto_2

    .line 146
    :goto_3
    move-object p1, p0

    .line 147
    goto :goto_4

    .line 148
    :catchall_2
    move-exception p2

    .line 149
    goto :goto_3

    .line 150
    :goto_4
    invoke-virtual {p1}, LN/r;->d()LN/y;

    .line 151
    .line 152
    .line 153
    move-result-object p3

    .line 154
    iget-object v0, p1, LN/r;->j:LP/b0;

    .line 155
    .line 156
    invoke-virtual {v0}, LP/b0;->e()F

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    invoke-virtual {p3, v1}, LN/y;->a(F)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p3

    .line 164
    if-eqz p3, :cond_5

    .line 165
    .line 166
    invoke-virtual {v0}, LP/b0;->e()F

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    invoke-virtual {p1}, LN/r;->d()LN/y;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-virtual {v1, p3}, LN/y;->d(Ljava/lang/Object;)F

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    sub-float/2addr v0, v1

    .line 179
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    cmpg-float v0, v0, v2

    .line 184
    .line 185
    if-gtz v0, :cond_5

    .line 186
    .line 187
    iget-object v0, p1, LN/r;->d:LB5/c;

    .line 188
    .line 189
    invoke-interface {v0, p3}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    check-cast v0, Ljava/lang/Boolean;

    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-eqz v0, :cond_5

    .line 200
    .line 201
    invoke-virtual {p1, p3}, LN/r;->g(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    :cond_5
    throw p2
.end method

.method public final c(FLjava/lang/Object;F)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-virtual {p0}, LN/r;->d()LN/y;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p2}, LN/y;->d(Ljava/lang/Object;)F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, LN/r;->b:LA0/d;

    .line 10
    .line 11
    invoke-virtual {v2}, LA0/d;->invoke()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Ljava/lang/Number;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    cmpg-float v3, v1, p1

    .line 22
    .line 23
    if-nez v3, :cond_0

    .line 24
    .line 25
    goto/16 :goto_0

    .line 26
    .line 27
    :cond_0
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    goto/16 :goto_0

    .line 34
    .line 35
    :cond_1
    iget-object v4, p0, LN/r;->a:LB0/a;

    .line 36
    .line 37
    if-gez v3, :cond_4

    .line 38
    .line 39
    cmpl-float p3, p3, v2

    .line 40
    .line 41
    const/4 v2, 0x1

    .line 42
    if-ltz p3, :cond_2

    .line 43
    .line 44
    invoke-virtual {v0, p1, v2}, LN/y;->b(FZ)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    return-object p1

    .line 52
    :cond_2
    invoke-virtual {v0, p1, v2}, LN/y;->b(FZ)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p3

    .line 56
    invoke-static {p3}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, p3}, LN/y;->d(Ljava/lang/Object;)F

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    sub-float/2addr v0, v1

    .line 64
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v4, v0}, LB0/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, Ljava/lang/Number;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    add-float/2addr v0, v1

    .line 87
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    cmpg-float p1, p1, v0

    .line 92
    .line 93
    if-gez p1, :cond_3

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_3
    return-object p3

    .line 97
    :cond_4
    neg-float v2, v2

    .line 98
    cmpg-float p3, p3, v2

    .line 99
    .line 100
    const/4 v2, 0x0

    .line 101
    if-gtz p3, :cond_5

    .line 102
    .line 103
    invoke-virtual {v0, p1, v2}, LN/y;->b(FZ)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    return-object p1

    .line 111
    :cond_5
    invoke-virtual {v0, p1, v2}, LN/y;->b(FZ)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p3

    .line 115
    invoke-static {p3}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, p3}, LN/y;->d(Ljava/lang/Object;)F

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    sub-float v0, v1, v0

    .line 123
    .line 124
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {v4, v0}, LB0/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    check-cast v0, Ljava/lang/Number;

    .line 137
    .line 138
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    sub-float/2addr v1, v0

    .line 147
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    const/4 v1, 0x0

    .line 152
    cmpg-float v1, p1, v1

    .line 153
    .line 154
    if-gez v1, :cond_6

    .line 155
    .line 156
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 157
    .line 158
    .line 159
    move-result p1

    .line 160
    cmpg-float p1, p1, v0

    .line 161
    .line 162
    if-gez p1, :cond_7

    .line 163
    .line 164
    goto :goto_0

    .line 165
    :cond_6
    cmpl-float p1, p1, v0

    .line 166
    .line 167
    if-lez p1, :cond_7

    .line 168
    .line 169
    :goto_0
    return-object p2

    .line 170
    :cond_7
    return-object p3
.end method

.method public final d()LN/y;
    .locals 1

    .line 1
    iget-object v0, p0, LN/r;->m:LP/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LN/y;

    .line 8
    .line 9
    return-object v0
.end method

.method public final e(F)F
    .locals 4

    .line 1
    iget-object v0, p0, LN/r;->j:LP/b0;

    .line 2
    .line 3
    invoke-virtual {v0}, LP/b0;->e()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v0}, LP/b0;->e()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    :goto_0
    add-float/2addr v0, p1

    .line 20
    invoke-virtual {p0}, LN/r;->d()LN/y;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, LN/y;->c()F

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-virtual {p0}, LN/r;->d()LN/y;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object v1, v1, LN/y;->a:Ljava/util/Map;

    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Ljava/lang/Iterable;

    .line 39
    .line 40
    const-string v2, "<this>"

    .line 41
    .line 42
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-nez v2, :cond_1

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    goto :goto_2

    .line 57
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, Ljava/lang/Number;

    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_2

    .line 72
    .line 73
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    check-cast v3, Ljava/lang/Number;

    .line 78
    .line 79
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    goto :goto_1

    .line 88
    :cond_2
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    :goto_2
    if-eqz v1, :cond_3

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    goto :goto_3

    .line 99
    :cond_3
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 100
    .line 101
    :goto_3
    invoke-static {v0, p1, v1}, LD5/a;->p(FFF)F

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    return p1
.end method

.method public final f()F
    .locals 2

    .line 1
    iget-object v0, p0, LN/r;->j:LP/b0;

    .line 2
    .line 3
    invoke-virtual {v0}, LP/b0;->e()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, LP/b0;->e()F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    return v0

    .line 18
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v1, "The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?"

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v0
.end method

.method public final g(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LN/r;->g:LP/f0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final h(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LN/r;->l:LP/f0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
