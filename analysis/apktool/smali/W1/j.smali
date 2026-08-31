.class public final LW1/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LT1/u;

.field public final b:LT1/f;

.field public c:LT1/r;

.field public d:Landroid/os/Bundle;

.field public e:[Landroid/os/Bundle;

.field public final f:Ln5/j;

.field public final g:LP5/S;

.field public final h:LP5/S;

.field public final i:LP5/D;

.field public final j:Ljava/util/LinkedHashMap;

.field public final k:Ljava/util/LinkedHashMap;

.field public final l:Ljava/util/LinkedHashMap;

.field public final m:Ljava/util/LinkedHashMap;

.field public n:Landroidx/lifecycle/x;

.field public o:LT1/i;

.field public final p:Ljava/util/ArrayList;

.field public q:Landroidx/lifecycle/p;

.field public final r:LW1/f;

.field public final s:LT1/A;

.field public final t:Ljava/util/LinkedHashMap;

.field public u:LB5/c;

.field public v:LW1/g;

.field public final w:Ljava/util/LinkedHashMap;

.field public x:I

.field public final y:Ljava/util/ArrayList;

.field public final z:LP5/G;


# direct methods
.method public constructor <init>(LT1/u;LT1/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LW1/j;->a:LT1/u;

    .line 5
    .line 6
    iput-object p2, p0, LW1/j;->b:LT1/f;

    .line 7
    .line 8
    new-instance p1, Ln5/j;

    .line 9
    .line 10
    invoke-direct {p1}, Ln5/j;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, LW1/j;->f:Ln5/j;

    .line 14
    .line 15
    sget-object p1, Ln5/s;->q:Ln5/s;

    .line 16
    .line 17
    invoke-static {p1}, LP5/H;->b(Ljava/lang/Object;)LP5/S;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    iput-object p2, p0, LW1/j;->g:LP5/S;

    .line 22
    .line 23
    invoke-static {p1}, LP5/H;->b(Ljava/lang/Object;)LP5/S;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, LW1/j;->h:LP5/S;

    .line 28
    .line 29
    new-instance p2, LP5/D;

    .line 30
    .line 31
    invoke-direct {p2, p1}, LP5/D;-><init>(LP5/S;)V

    .line 32
    .line 33
    .line 34
    iput-object p2, p0, LW1/j;->i:LP5/D;

    .line 35
    .line 36
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 37
    .line 38
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, LW1/j;->j:Ljava/util/LinkedHashMap;

    .line 42
    .line 43
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 44
    .line 45
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, LW1/j;->k:Ljava/util/LinkedHashMap;

    .line 49
    .line 50
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 51
    .line 52
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, LW1/j;->l:Ljava/util/LinkedHashMap;

    .line 56
    .line 57
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 58
    .line 59
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object p1, p0, LW1/j;->m:Ljava/util/LinkedHashMap;

    .line 63
    .line 64
    new-instance p1, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    iput-object p1, p0, LW1/j;->p:Ljava/util/ArrayList;

    .line 70
    .line 71
    sget-object p1, Landroidx/lifecycle/p;->r:Landroidx/lifecycle/p;

    .line 72
    .line 73
    iput-object p1, p0, LW1/j;->q:Landroidx/lifecycle/p;

    .line 74
    .line 75
    new-instance p1, LW1/f;

    .line 76
    .line 77
    const/4 p2, 0x0

    .line 78
    invoke-direct {p1, p2, p0}, LW1/f;-><init>(ILjava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    iput-object p1, p0, LW1/j;->r:LW1/f;

    .line 82
    .line 83
    new-instance p1, LT1/A;

    .line 84
    .line 85
    invoke-direct {p1}, LT1/A;-><init>()V

    .line 86
    .line 87
    .line 88
    iput-object p1, p0, LW1/j;->s:LT1/A;

    .line 89
    .line 90
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 91
    .line 92
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 93
    .line 94
    .line 95
    iput-object p1, p0, LW1/j;->t:Ljava/util/LinkedHashMap;

    .line 96
    .line 97
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 98
    .line 99
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 100
    .line 101
    .line 102
    iput-object p1, p0, LW1/j;->w:Ljava/util/LinkedHashMap;

    .line 103
    .line 104
    new-instance p1, Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 107
    .line 108
    .line 109
    iput-object p1, p0, LW1/j;->y:Ljava/util/ArrayList;

    .line 110
    .line 111
    const/4 p1, 0x2

    .line 112
    invoke-static {p1}, LP5/H;->a(I)LP5/G;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    iput-object p1, p0, LW1/j;->z:LP5/G;

    .line 117
    .line 118
    return-void
.end method

.method public static d(ILT1/p;LT1/p;Z)LT1/p;
    .locals 2

    .line 1
    iget-object v0, p1, LT1/p;->r:LW1/l;

    .line 2
    .line 3
    iget v0, v0, LW1/l;->a:I

    .line 4
    .line 5
    if-ne v0, p0, :cond_1

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1, p2}, LT1/p;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p1, LT1/p;->s:LT1/r;

    .line 16
    .line 17
    iget-object v1, p2, LT1/p;->s:LT1/r;

    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    :cond_0
    return-object p1

    .line 26
    :cond_1
    instance-of v0, p1, LT1/r;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    move-object v0, p1

    .line 31
    check-cast v0, LT1/r;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    const/4 v0, 0x0

    .line 35
    :goto_0
    if-nez v0, :cond_3

    .line 36
    .line 37
    iget-object v0, p1, LT1/p;->s:LT1/r;

    .line 38
    .line 39
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :cond_3
    iget-object p1, v0, LT1/r;->v:LD/u;

    .line 43
    .line 44
    invoke-virtual {p1, p0, v0, p2, p3}, LD/u;->p(ILT1/p;LT1/p;Z)LT1/p;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method

.method public static synthetic n(LW1/j;LT1/d;)V
    .locals 2

    .line 1
    new-instance v0, Ln5/j;

    .line 2
    .line 3
    invoke-direct {v0}, Ln5/j;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {p0, p1, v1, v0}, LW1/j;->m(LT1/d;ZLn5/j;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(LT1/p;Landroid/os/Bundle;LT1/d;Ljava/util/List;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    iget-object v5, v0, LW1/j;->a:LT1/u;

    .line 12
    .line 13
    iget-object v5, v5, LT1/u;->c:LC3/b;

    .line 14
    .line 15
    iget-object v6, v3, LT1/d;->r:LT1/p;

    .line 16
    .line 17
    instance-of v7, v6, LT1/c;

    .line 18
    .line 19
    const/4 v8, 0x0

    .line 20
    const/4 v9, 0x1

    .line 21
    iget-object v10, v0, LW1/j;->f:Ln5/j;

    .line 22
    .line 23
    if-nez v7, :cond_1

    .line 24
    .line 25
    :cond_0
    invoke-virtual {v10}, Ln5/j;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    if-nez v7, :cond_1

    .line 30
    .line 31
    invoke-virtual {v10}, Ln5/j;->last()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    check-cast v7, LT1/d;

    .line 36
    .line 37
    iget-object v7, v7, LT1/d;->r:LT1/p;

    .line 38
    .line 39
    instance-of v7, v7, LT1/c;

    .line 40
    .line 41
    if-eqz v7, :cond_1

    .line 42
    .line 43
    invoke-virtual {v10}, Ln5/j;->last()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    check-cast v7, LT1/d;

    .line 48
    .line 49
    iget-object v7, v7, LT1/d;->r:LT1/p;

    .line 50
    .line 51
    iget-object v7, v7, LT1/p;->r:LW1/l;

    .line 52
    .line 53
    iget v7, v7, LW1/l;->a:I

    .line 54
    .line 55
    invoke-virtual {v0, v7, v9, v8}, LW1/j;->l(IZZ)Z

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    if-nez v7, :cond_0

    .line 60
    .line 61
    :cond_1
    new-instance v7, Ln5/j;

    .line 62
    .line 63
    invoke-direct {v7}, Ln5/j;-><init>()V

    .line 64
    .line 65
    .line 66
    instance-of v11, v1, LT1/r;

    .line 67
    .line 68
    const/4 v12, 0x0

    .line 69
    if-eqz v11, :cond_7

    .line 70
    .line 71
    move-object v11, v6

    .line 72
    :cond_2
    invoke-static {v11}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iget-object v11, v11, LT1/p;->s:LT1/r;

    .line 76
    .line 77
    if-eqz v11, :cond_6

    .line 78
    .line 79
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 80
    .line 81
    .line 82
    move-result v13

    .line 83
    invoke-interface {v4, v13}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 84
    .line 85
    .line 86
    move-result-object v13

    .line 87
    :cond_3
    invoke-interface {v13}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 88
    .line 89
    .line 90
    move-result v14

    .line 91
    if-eqz v14, :cond_4

    .line 92
    .line 93
    invoke-interface {v13}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v14

    .line 97
    move-object v15, v14

    .line 98
    check-cast v15, LT1/d;

    .line 99
    .line 100
    iget-object v15, v15, LT1/d;->r:LT1/p;

    .line 101
    .line 102
    invoke-static {v15, v11}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v15

    .line 106
    if-eqz v15, :cond_3

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_4
    move-object v14, v12

    .line 110
    :goto_0
    check-cast v14, LT1/d;

    .line 111
    .line 112
    if-nez v14, :cond_5

    .line 113
    .line 114
    invoke-virtual {v0}, LW1/j;->h()Landroidx/lifecycle/p;

    .line 115
    .line 116
    .line 117
    move-result-object v13

    .line 118
    iget-object v14, v0, LW1/j;->o:LT1/i;

    .line 119
    .line 120
    invoke-static {v5, v11, v2, v13, v14}, LO3/B;->f(LC3/b;LT1/p;Landroid/os/Bundle;Landroidx/lifecycle/p;LT1/i;)LT1/d;

    .line 121
    .line 122
    .line 123
    move-result-object v14

    .line 124
    :cond_5
    invoke-virtual {v7, v14}, Ln5/j;->addFirst(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v10}, Ln5/j;->isEmpty()Z

    .line 128
    .line 129
    .line 130
    move-result v13

    .line 131
    if-nez v13, :cond_6

    .line 132
    .line 133
    invoke-virtual {v10}, Ln5/j;->last()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v13

    .line 137
    check-cast v13, LT1/d;

    .line 138
    .line 139
    iget-object v13, v13, LT1/d;->r:LT1/p;

    .line 140
    .line 141
    if-ne v13, v11, :cond_6

    .line 142
    .line 143
    invoke-virtual {v10}, Ln5/j;->last()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v13

    .line 147
    check-cast v13, LT1/d;

    .line 148
    .line 149
    invoke-static {v0, v13}, LW1/j;->n(LW1/j;LT1/d;)V

    .line 150
    .line 151
    .line 152
    :cond_6
    if-eqz v11, :cond_7

    .line 153
    .line 154
    if-ne v11, v1, :cond_2

    .line 155
    .line 156
    :cond_7
    invoke-virtual {v7}, Ln5/j;->isEmpty()Z

    .line 157
    .line 158
    .line 159
    move-result v11

    .line 160
    if-eqz v11, :cond_8

    .line 161
    .line 162
    move-object v11, v6

    .line 163
    goto :goto_1

    .line 164
    :cond_8
    invoke-virtual {v7}, Ln5/j;->first()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v11

    .line 168
    check-cast v11, LT1/d;

    .line 169
    .line 170
    iget-object v11, v11, LT1/d;->r:LT1/p;

    .line 171
    .line 172
    :goto_1
    if-eqz v11, :cond_e

    .line 173
    .line 174
    iget-object v13, v11, LT1/p;->r:LW1/l;

    .line 175
    .line 176
    iget v13, v13, LW1/l;->a:I

    .line 177
    .line 178
    invoke-virtual {v0, v13, v11}, LW1/j;->c(ILT1/p;)LT1/p;

    .line 179
    .line 180
    .line 181
    move-result-object v13

    .line 182
    if-eq v13, v11, :cond_e

    .line 183
    .line 184
    iget-object v11, v11, LT1/p;->s:LT1/r;

    .line 185
    .line 186
    if-eqz v11, :cond_d

    .line 187
    .line 188
    if-eqz v2, :cond_9

    .line 189
    .line 190
    invoke-virtual {v2}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 191
    .line 192
    .line 193
    move-result v13

    .line 194
    if-ne v13, v9, :cond_9

    .line 195
    .line 196
    move-object v13, v12

    .line 197
    goto :goto_2

    .line 198
    :cond_9
    move-object v13, v2

    .line 199
    :goto_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 200
    .line 201
    .line 202
    move-result v14

    .line 203
    invoke-interface {v4, v14}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 204
    .line 205
    .line 206
    move-result-object v14

    .line 207
    :goto_3
    invoke-interface {v14}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 208
    .line 209
    .line 210
    move-result v15

    .line 211
    if-eqz v15, :cond_b

    .line 212
    .line 213
    invoke-interface {v14}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v15

    .line 217
    move-object v8, v15

    .line 218
    check-cast v8, LT1/d;

    .line 219
    .line 220
    iget-object v8, v8, LT1/d;->r:LT1/p;

    .line 221
    .line 222
    invoke-static {v8, v11}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v8

    .line 226
    if-eqz v8, :cond_a

    .line 227
    .line 228
    goto :goto_4

    .line 229
    :cond_a
    const/4 v8, 0x0

    .line 230
    goto :goto_3

    .line 231
    :cond_b
    move-object v15, v12

    .line 232
    :goto_4
    check-cast v15, LT1/d;

    .line 233
    .line 234
    if-nez v15, :cond_c

    .line 235
    .line 236
    invoke-virtual {v11, v13}, LT1/p;->d(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 237
    .line 238
    .line 239
    move-result-object v8

    .line 240
    invoke-virtual {v0}, LW1/j;->h()Landroidx/lifecycle/p;

    .line 241
    .line 242
    .line 243
    move-result-object v13

    .line 244
    iget-object v14, v0, LW1/j;->o:LT1/i;

    .line 245
    .line 246
    invoke-static {v5, v11, v8, v13, v14}, LO3/B;->f(LC3/b;LT1/p;Landroid/os/Bundle;Landroidx/lifecycle/p;LT1/i;)LT1/d;

    .line 247
    .line 248
    .line 249
    move-result-object v15

    .line 250
    :cond_c
    invoke-virtual {v7, v15}, Ln5/j;->addFirst(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    :cond_d
    const/4 v8, 0x0

    .line 254
    goto :goto_1

    .line 255
    :cond_e
    invoke-virtual {v7}, Ln5/j;->isEmpty()Z

    .line 256
    .line 257
    .line 258
    move-result v8

    .line 259
    if-eqz v8, :cond_f

    .line 260
    .line 261
    goto :goto_5

    .line 262
    :cond_f
    invoke-virtual {v7}, Ln5/j;->first()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v6

    .line 266
    check-cast v6, LT1/d;

    .line 267
    .line 268
    iget-object v6, v6, LT1/d;->r:LT1/p;

    .line 269
    .line 270
    :goto_5
    invoke-virtual {v10}, Ln5/j;->isEmpty()Z

    .line 271
    .line 272
    .line 273
    move-result v8

    .line 274
    if-nez v8, :cond_10

    .line 275
    .line 276
    invoke-virtual {v10}, Ln5/j;->last()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v8

    .line 280
    check-cast v8, LT1/d;

    .line 281
    .line 282
    iget-object v8, v8, LT1/d;->r:LT1/p;

    .line 283
    .line 284
    instance-of v8, v8, LT1/r;

    .line 285
    .line 286
    if-eqz v8, :cond_10

    .line 287
    .line 288
    invoke-virtual {v10}, Ln5/j;->last()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v8

    .line 292
    check-cast v8, LT1/d;

    .line 293
    .line 294
    iget-object v8, v8, LT1/d;->r:LT1/p;

    .line 295
    .line 296
    const-string v9, "null cannot be cast to non-null type androidx.navigation.NavGraph"

    .line 297
    .line 298
    invoke-static {v8, v9}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    check-cast v8, LT1/r;

    .line 302
    .line 303
    iget-object v8, v8, LT1/r;->v:LD/u;

    .line 304
    .line 305
    iget-object v8, v8, LD/u;->d:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v8, Lr/S;

    .line 308
    .line 309
    iget-object v9, v6, LT1/p;->r:LW1/l;

    .line 310
    .line 311
    iget v9, v9, LW1/l;->a:I

    .line 312
    .line 313
    invoke-virtual {v8, v9}, Lr/S;->c(I)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v8

    .line 317
    if-nez v8, :cond_10

    .line 318
    .line 319
    invoke-virtual {v10}, Ln5/j;->last()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v8

    .line 323
    check-cast v8, LT1/d;

    .line 324
    .line 325
    invoke-static {v0, v8}, LW1/j;->n(LW1/j;LT1/d;)V

    .line 326
    .line 327
    .line 328
    goto :goto_5

    .line 329
    :cond_10
    invoke-virtual {v10}, Ln5/j;->j()Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v6

    .line 333
    check-cast v6, LT1/d;

    .line 334
    .line 335
    if-nez v6, :cond_11

    .line 336
    .line 337
    invoke-virtual {v7}, Ln5/j;->j()Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v6

    .line 341
    check-cast v6, LT1/d;

    .line 342
    .line 343
    :cond_11
    if-eqz v6, :cond_12

    .line 344
    .line 345
    iget-object v6, v6, LT1/d;->r:LT1/p;

    .line 346
    .line 347
    goto :goto_6

    .line 348
    :cond_12
    move-object v6, v12

    .line 349
    :goto_6
    iget-object v8, v0, LW1/j;->c:LT1/r;

    .line 350
    .line 351
    invoke-static {v6, v8}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-result v6

    .line 355
    if-nez v6, :cond_16

    .line 356
    .line 357
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 358
    .line 359
    .line 360
    move-result v6

    .line 361
    invoke-interface {v4, v6}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 362
    .line 363
    .line 364
    move-result-object v4

    .line 365
    :cond_13
    invoke-interface {v4}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 366
    .line 367
    .line 368
    move-result v6

    .line 369
    if-eqz v6, :cond_14

    .line 370
    .line 371
    invoke-interface {v4}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v6

    .line 375
    move-object v8, v6

    .line 376
    check-cast v8, LT1/d;

    .line 377
    .line 378
    iget-object v8, v8, LT1/d;->r:LT1/p;

    .line 379
    .line 380
    iget-object v9, v0, LW1/j;->c:LT1/r;

    .line 381
    .line 382
    invoke-static {v9}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 383
    .line 384
    .line 385
    invoke-static {v8, v9}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result v8

    .line 389
    if-eqz v8, :cond_13

    .line 390
    .line 391
    move-object v12, v6

    .line 392
    :cond_14
    check-cast v12, LT1/d;

    .line 393
    .line 394
    if-nez v12, :cond_15

    .line 395
    .line 396
    iget-object v4, v0, LW1/j;->c:LT1/r;

    .line 397
    .line 398
    invoke-static {v4}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 399
    .line 400
    .line 401
    iget-object v6, v0, LW1/j;->c:LT1/r;

    .line 402
    .line 403
    invoke-static {v6}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v6, v2}, LT1/p;->d(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    invoke-virtual {v0}, LW1/j;->h()Landroidx/lifecycle/p;

    .line 411
    .line 412
    .line 413
    move-result-object v6

    .line 414
    iget-object v8, v0, LW1/j;->o:LT1/i;

    .line 415
    .line 416
    invoke-static {v5, v4, v2, v6, v8}, LO3/B;->f(LC3/b;LT1/p;Landroid/os/Bundle;Landroidx/lifecycle/p;LT1/i;)LT1/d;

    .line 417
    .line 418
    .line 419
    move-result-object v12

    .line 420
    :cond_15
    invoke-virtual {v7, v12}, Ln5/j;->addFirst(Ljava/lang/Object;)V

    .line 421
    .line 422
    .line 423
    :cond_16
    invoke-virtual {v7}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 428
    .line 429
    .line 430
    move-result v4

    .line 431
    if-eqz v4, :cond_18

    .line 432
    .line 433
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v4

    .line 437
    check-cast v4, LT1/d;

    .line 438
    .line 439
    iget-object v5, v4, LT1/d;->r:LT1/p;

    .line 440
    .line 441
    iget-object v5, v5, LT1/p;->q:Ljava/lang/String;

    .line 442
    .line 443
    iget-object v6, v0, LW1/j;->s:LT1/A;

    .line 444
    .line 445
    invoke-virtual {v6, v5}, LT1/A;->b(Ljava/lang/String;)LT1/z;

    .line 446
    .line 447
    .line 448
    move-result-object v5

    .line 449
    iget-object v6, v0, LW1/j;->t:Ljava/util/LinkedHashMap;

    .line 450
    .line 451
    invoke-virtual {v6, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v5

    .line 455
    if-eqz v5, :cond_17

    .line 456
    .line 457
    check-cast v5, LT1/h;

    .line 458
    .line 459
    invoke-virtual {v5, v4}, LT1/h;->a(LT1/d;)V

    .line 460
    .line 461
    .line 462
    goto :goto_7

    .line 463
    :cond_17
    new-instance v2, Ljava/lang/StringBuilder;

    .line 464
    .line 465
    const-string v3, "NavigatorBackStack for "

    .line 466
    .line 467
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    iget-object v1, v1, LT1/p;->q:Ljava/lang/String;

    .line 471
    .line 472
    const-string v3, " should already be created"

    .line 473
    .line 474
    invoke-static {v2, v1, v3}, Lk1/i;->k(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v1

    .line 478
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 479
    .line 480
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 485
    .line 486
    .line 487
    throw v2

    .line 488
    :cond_18
    invoke-virtual {v10, v7}, Ln5/j;->addAll(Ljava/util/Collection;)Z

    .line 489
    .line 490
    .line 491
    invoke-virtual {v10, v3}, Ln5/j;->addLast(Ljava/lang/Object;)V

    .line 492
    .line 493
    .line 494
    invoke-static {v7, v3}, Ln5/l;->v0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 495
    .line 496
    .line 497
    move-result-object v1

    .line 498
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 499
    .line 500
    .line 501
    move-result v2

    .line 502
    const/4 v8, 0x0

    .line 503
    :cond_19
    :goto_8
    if-ge v8, v2, :cond_1a

    .line 504
    .line 505
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v3

    .line 509
    add-int/lit8 v8, v8, 0x1

    .line 510
    .line 511
    check-cast v3, LT1/d;

    .line 512
    .line 513
    iget-object v4, v3, LT1/d;->r:LT1/p;

    .line 514
    .line 515
    iget-object v4, v4, LT1/p;->s:LT1/r;

    .line 516
    .line 517
    if-eqz v4, :cond_19

    .line 518
    .line 519
    iget-object v4, v4, LT1/p;->r:LW1/l;

    .line 520
    .line 521
    iget v4, v4, LW1/l;->a:I

    .line 522
    .line 523
    invoke-virtual {v0, v4}, LW1/j;->e(I)LT1/d;

    .line 524
    .line 525
    .line 526
    move-result-object v4

    .line 527
    invoke-virtual {v0, v3, v4}, LW1/j;->j(LT1/d;LT1/d;)V

    .line 528
    .line 529
    .line 530
    goto :goto_8

    .line 531
    :cond_1a
    return-void
.end method

.method public final b()Z
    .locals 11

    .line 1
    :goto_0
    iget-object v0, p0, LW1/j;->f:Ln5/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln5/j;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ln5/j;->last()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, LT1/d;

    .line 14
    .line 15
    iget-object v1, v1, LT1/d;->r:LT1/p;

    .line 16
    .line 17
    instance-of v1, v1, LT1/r;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Ln5/j;->last()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, LT1/d;

    .line 26
    .line 27
    invoke-static {p0, v0}, LW1/j;->n(LW1/j;LT1/d;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {v0}, Ln5/j;->l()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, LT1/d;

    .line 36
    .line 37
    iget-object v2, p0, LW1/j;->y:Ljava/util/ArrayList;

    .line 38
    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    :cond_1
    iget v3, p0, LW1/j;->x:I

    .line 45
    .line 46
    const/4 v4, 0x1

    .line 47
    add-int/2addr v3, v4

    .line 48
    iput v3, p0, LW1/j;->x:I

    .line 49
    .line 50
    invoke-virtual {p0}, LW1/j;->r()V

    .line 51
    .line 52
    .line 53
    iget v3, p0, LW1/j;->x:I

    .line 54
    .line 55
    add-int/lit8 v3, v3, -0x1

    .line 56
    .line 57
    iput v3, p0, LW1/j;->x:I

    .line 58
    .line 59
    const/4 v5, 0x0

    .line 60
    if-nez v3, :cond_5

    .line 61
    .line 62
    invoke-static {v2}, Ln5/l;->C0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    move v6, v5

    .line 74
    :goto_1
    const/4 v7, 0x0

    .line 75
    if-ge v6, v2, :cond_4

    .line 76
    .line 77
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    add-int/lit8 v6, v6, 0x1

    .line 82
    .line 83
    check-cast v8, LT1/d;

    .line 84
    .line 85
    iget-object v9, p0, LW1/j;->p:Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v9

    .line 91
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v10

    .line 95
    if-nez v10, :cond_2

    .line 96
    .line 97
    iget-object v7, p0, LW1/j;->z:LP5/G;

    .line 98
    .line 99
    invoke-virtual {v7, v8}, LP5/G;->n(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_2
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    if-nez v0, :cond_3

    .line 108
    .line 109
    iget-object v0, v8, LT1/d;->r:LT1/p;

    .line 110
    .line 111
    iget-object v0, v8, LT1/d;->x:LW1/c;

    .line 112
    .line 113
    invoke-virtual {v0}, LW1/c;->a()Landroid/os/Bundle;

    .line 114
    .line 115
    .line 116
    throw v7

    .line 117
    :cond_3
    new-instance v0, Ljava/lang/ClassCastException;

    .line 118
    .line 119
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 120
    .line 121
    .line 122
    throw v0

    .line 123
    :cond_4
    invoke-static {v0}, Ln5/l;->C0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    iget-object v2, p0, LW1/j;->g:LP5/S;

    .line 128
    .line 129
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2, v7, v0}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0}, LW1/j;->o()Ljava/util/ArrayList;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    iget-object v2, p0, LW1/j;->h:LP5/S;

    .line 140
    .line 141
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, v7, v0}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    :cond_5
    if-eqz v1, :cond_6

    .line 148
    .line 149
    return v4

    .line 150
    :cond_6
    return v5
.end method

.method public final c(ILT1/p;)LT1/p;
    .locals 2

    .line 1
    iget-object v0, p0, LW1/j;->c:LT1/r;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return-object p1

    .line 7
    :cond_0
    iget-object v1, v0, LT1/p;->r:LW1/l;

    .line 8
    .line 9
    iget v1, v1, LW1/l;->a:I

    .line 10
    .line 11
    if-ne v1, p1, :cond_2

    .line 12
    .line 13
    if-eqz p2, :cond_1

    .line 14
    .line 15
    invoke-static {v0, p2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    iget-object v0, p2, LT1/p;->s:LT1/r;

    .line 22
    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    iget-object p1, p0, LW1/j;->c:LT1/r;

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_1
    return-object v0

    .line 29
    :cond_2
    iget-object v0, p0, LW1/j;->f:Ln5/j;

    .line 30
    .line 31
    invoke-virtual {v0}, Ln5/j;->l()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, LT1/d;

    .line 36
    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    iget-object v0, v0, LT1/d;->r:LT1/p;

    .line 40
    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    :cond_3
    iget-object v0, p0, LW1/j;->c:LT1/r;

    .line 44
    .line 45
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :cond_4
    const/4 v1, 0x0

    .line 49
    invoke-static {p1, v0, p2, v1}, LW1/j;->d(ILT1/p;LT1/p;Z)LT1/p;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    return-object p1
.end method

.method public final e(I)LT1/d;
    .locals 3

    .line 1
    iget-object v0, p0, LW1/j;->f:Ln5/j;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    move-object v2, v1

    .line 22
    check-cast v2, LT1/d;

    .line 23
    .line 24
    iget-object v2, v2, LT1/d;->r:LT1/p;

    .line 25
    .line 26
    iget-object v2, v2, LT1/p;->r:LW1/l;

    .line 27
    .line 28
    iget v2, v2, LW1/l;->a:I

    .line 29
    .line 30
    if-ne v2, p1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v1, 0x0

    .line 34
    :goto_0
    check-cast v1, LT1/d;

    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    return-object v1

    .line 39
    :cond_2
    const-string v0, "No destination with ID "

    .line 40
    .line 41
    const-string v1, " is on the NavController\'s back stack. The current destination is "

    .line 42
    .line 43
    invoke-static {v0, v1, p1}, Lk1/i;->l(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p0}, LW1/j;->f()LT1/p;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v0
.end method

.method public final f()LT1/p;
    .locals 1

    .line 1
    iget-object v0, p0, LW1/j;->f:Ln5/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln5/j;->l()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LT1/d;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, LT1/d;->r:LT1/p;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return-object v0
.end method

.method public final g()LT1/r;
    .locals 2

    .line 1
    iget-object v0, p0, LW1/j;->c:LT1/r;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v1, "null cannot be cast to non-null type androidx.navigation.NavGraph"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 12
    .line 13
    const-string v1, "You must call setGraph() before calling getGraph()"

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw v0
.end method

.method public final h()Landroidx/lifecycle/p;
    .locals 1

    .line 1
    iget-object v0, p0, LW1/j;->n:Landroidx/lifecycle/x;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Landroidx/lifecycle/p;->s:Landroidx/lifecycle/p;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    iget-object v0, p0, LW1/j;->q:Landroidx/lifecycle/p;

    .line 9
    .line 10
    return-object v0
.end method

.method public final i()LT1/r;
    .locals 2

    .line 1
    iget-object v0, p0, LW1/j;->f:Ln5/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln5/j;->l()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LT1/d;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, LT1/d;->r:LT1/p;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, LW1/j;->c:LT1/r;

    .line 16
    .line 17
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    instance-of v1, v0, LT1/r;

    .line 21
    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    move-object v1, v0

    .line 25
    check-cast v1, LT1/r;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    const/4 v1, 0x0

    .line 29
    :goto_0
    if-nez v1, :cond_3

    .line 30
    .line 31
    iget-object v0, v0, LT1/p;->s:LT1/r;

    .line 32
    .line 33
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-object v0

    .line 37
    :cond_3
    return-object v1
.end method

.method public final j(LT1/d;LT1/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, LW1/j;->j:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LW1/j;->k:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    new-instance v0, LW1/a;

    .line 15
    .line 16
    invoke-direct {v0}, LW1/a;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p1, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    check-cast p1, LW1/a;

    .line 30
    .line 31
    iget-object p1, p1, LW1/a;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final k(LT1/p;Landroid/os/Bundle;LT1/w;)V
    .locals 21

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    move-object/from16 v6, p3

    .line 6
    .line 7
    const-string v0, "node"

    .line 8
    .line 9
    invoke-static {v3, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, v2, LW1/j;->t:Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ljava/lang/Iterable;

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v4, 0x1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, LT1/h;

    .line 36
    .line 37
    iput-boolean v4, v1, LT1/h;->d:Z

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    new-instance v1, Lkotlin/jvm/internal/u;

    .line 41
    .line 42
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 43
    .line 44
    .line 45
    const/4 v0, -0x1

    .line 46
    if-eqz v6, :cond_1

    .line 47
    .line 48
    iget v5, v6, LT1/w;->c:I

    .line 49
    .line 50
    if-eq v5, v0, :cond_1

    .line 51
    .line 52
    iget-boolean v8, v6, LT1/w;->d:Z

    .line 53
    .line 54
    iget-boolean v9, v6, LT1/w;->e:Z

    .line 55
    .line 56
    invoke-virtual {v2, v5, v8, v9}, LW1/j;->l(IZZ)Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    move v8, v5

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    const/4 v8, 0x0

    .line 63
    :goto_1
    invoke-virtual/range {p1 .. p2}, LT1/p;->d(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    if-eqz v6, :cond_2

    .line 68
    .line 69
    iget-boolean v9, v6, LT1/w;->b:Z

    .line 70
    .line 71
    if-ne v9, v4, :cond_2

    .line 72
    .line 73
    iget-object v9, v2, LW1/j;->l:Ljava/util/LinkedHashMap;

    .line 74
    .line 75
    iget-object v10, v3, LT1/p;->r:LW1/l;

    .line 76
    .line 77
    iget v10, v10, LW1/l;->a:I

    .line 78
    .line 79
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v10

    .line 83
    invoke-interface {v9, v10}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v9

    .line 87
    if-eqz v9, :cond_2

    .line 88
    .line 89
    iget-object v0, v3, LT1/p;->r:LW1/l;

    .line 90
    .line 91
    iget v0, v0, LW1/l;->a:I

    .line 92
    .line 93
    invoke-virtual {v2, v0, v5, v6}, LW1/j;->p(ILandroid/os/Bundle;LT1/w;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    iput-boolean v0, v1, Lkotlin/jvm/internal/u;->q:Z

    .line 98
    .line 99
    const/4 v11, 0x0

    .line 100
    goto/16 :goto_c

    .line 101
    .line 102
    :cond_2
    if-eqz v6, :cond_12

    .line 103
    .line 104
    iget-boolean v10, v6, LT1/w;->a:Z

    .line 105
    .line 106
    if-ne v10, v4, :cond_12

    .line 107
    .line 108
    iget-object v10, v2, LW1/j;->f:Ln5/j;

    .line 109
    .line 110
    invoke-virtual {v10}, Ln5/j;->l()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v10

    .line 114
    check-cast v10, LT1/d;

    .line 115
    .line 116
    iget-object v11, v2, LW1/j;->f:Ln5/j;

    .line 117
    .line 118
    invoke-virtual {v11}, Ln5/j;->d()I

    .line 119
    .line 120
    .line 121
    move-result v12

    .line 122
    invoke-virtual {v11, v12}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    .line 123
    .line 124
    .line 125
    move-result-object v11

    .line 126
    :cond_3
    invoke-interface {v11}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 127
    .line 128
    .line 129
    move-result v12

    .line 130
    if-eqz v12, :cond_4

    .line 131
    .line 132
    invoke-interface {v11}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v12

    .line 136
    check-cast v12, LT1/d;

    .line 137
    .line 138
    iget-object v12, v12, LT1/d;->r:LT1/p;

    .line 139
    .line 140
    if-ne v12, v3, :cond_3

    .line 141
    .line 142
    invoke-interface {v11}, Ljava/util/ListIterator;->nextIndex()I

    .line 143
    .line 144
    .line 145
    move-result v11

    .line 146
    goto :goto_2

    .line 147
    :cond_4
    move v11, v0

    .line 148
    :goto_2
    if-ne v11, v0, :cond_5

    .line 149
    .line 150
    goto/16 :goto_a

    .line 151
    .line 152
    :cond_5
    instance-of v12, v3, LT1/r;

    .line 153
    .line 154
    if-eqz v12, :cond_8

    .line 155
    .line 156
    sget v10, LT1/r;->w:I

    .line 157
    .line 158
    move-object v10, v3

    .line 159
    check-cast v10, LT1/r;

    .line 160
    .line 161
    new-instance v12, LI5/m;

    .line 162
    .line 163
    const/16 v13, 0xf

    .line 164
    .line 165
    invoke-direct {v12, v13}, LI5/m;-><init>(I)V

    .line 166
    .line 167
    .line 168
    invoke-static {v10, v12}, LI5/k;->R(Ljava/lang/Object;LB5/c;)LI5/i;

    .line 169
    .line 170
    .line 171
    move-result-object v10

    .line 172
    new-instance v12, LI5/m;

    .line 173
    .line 174
    const/16 v13, 0x1a

    .line 175
    .line 176
    invoke-direct {v12, v13}, LI5/m;-><init>(I)V

    .line 177
    .line 178
    .line 179
    new-instance v13, LI5/p;

    .line 180
    .line 181
    invoke-direct {v13, v10, v12, v4}, LI5/p;-><init>(LI5/i;LB5/c;I)V

    .line 182
    .line 183
    .line 184
    invoke-static {v13}, LI5/k;->S(LI5/i;)Ljava/util/List;

    .line 185
    .line 186
    .line 187
    move-result-object v10

    .line 188
    iget-object v12, v2, LW1/j;->f:Ln5/j;

    .line 189
    .line 190
    iget v12, v12, Ln5/j;->s:I

    .line 191
    .line 192
    sub-int/2addr v12, v11

    .line 193
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 194
    .line 195
    .line 196
    move-result v13

    .line 197
    if-eq v12, v13, :cond_6

    .line 198
    .line 199
    goto/16 :goto_a

    .line 200
    .line 201
    :cond_6
    iget-object v12, v2, LW1/j;->f:Ln5/j;

    .line 202
    .line 203
    iget v13, v12, Ln5/j;->s:I

    .line 204
    .line 205
    invoke-virtual {v12, v11, v13}, Ljava/util/AbstractList;->subList(II)Ljava/util/List;

    .line 206
    .line 207
    .line 208
    move-result-object v12

    .line 209
    check-cast v12, Ljava/lang/Iterable;

    .line 210
    .line 211
    new-instance v13, Ljava/util/ArrayList;

    .line 212
    .line 213
    const/16 v14, 0xa

    .line 214
    .line 215
    invoke-static {v12, v14}, Ln5/m;->c0(Ljava/lang/Iterable;I)I

    .line 216
    .line 217
    .line 218
    move-result v14

    .line 219
    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 220
    .line 221
    .line 222
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 223
    .line 224
    .line 225
    move-result-object v12

    .line 226
    :goto_3
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 227
    .line 228
    .line 229
    move-result v14

    .line 230
    if-eqz v14, :cond_7

    .line 231
    .line 232
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v14

    .line 236
    check-cast v14, LT1/d;

    .line 237
    .line 238
    iget-object v14, v14, LT1/d;->r:LT1/p;

    .line 239
    .line 240
    iget-object v14, v14, LT1/p;->r:LW1/l;

    .line 241
    .line 242
    iget v14, v14, LW1/l;->a:I

    .line 243
    .line 244
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 245
    .line 246
    .line 247
    move-result-object v14

    .line 248
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    goto :goto_3

    .line 252
    :cond_7
    invoke-virtual {v13, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v10

    .line 256
    if-nez v10, :cond_9

    .line 257
    .line 258
    goto/16 :goto_a

    .line 259
    .line 260
    :cond_8
    if-eqz v10, :cond_12

    .line 261
    .line 262
    iget-object v10, v10, LT1/d;->r:LT1/p;

    .line 263
    .line 264
    if-eqz v10, :cond_12

    .line 265
    .line 266
    iget-object v12, v3, LT1/p;->r:LW1/l;

    .line 267
    .line 268
    iget v12, v12, LW1/l;->a:I

    .line 269
    .line 270
    iget-object v10, v10, LT1/p;->r:LW1/l;

    .line 271
    .line 272
    iget v10, v10, LW1/l;->a:I

    .line 273
    .line 274
    if-ne v12, v10, :cond_12

    .line 275
    .line 276
    :cond_9
    new-instance v10, Ln5/j;

    .line 277
    .line 278
    invoke-direct {v10}, Ln5/j;-><init>()V

    .line 279
    .line 280
    .line 281
    :goto_4
    iget-object v12, v2, LW1/j;->f:Ln5/j;

    .line 282
    .line 283
    invoke-static {v12}, Lcom/google/android/gms/internal/measurement/n2;->u(Ljava/util/List;)I

    .line 284
    .line 285
    .line 286
    move-result v12

    .line 287
    if-lt v12, v11, :cond_a

    .line 288
    .line 289
    iget-object v12, v2, LW1/j;->f:Ln5/j;

    .line 290
    .line 291
    invoke-static {v12}, Ln5/q;->g0(Ljava/util/List;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v12

    .line 295
    check-cast v12, LT1/d;

    .line 296
    .line 297
    invoke-virtual {v2, v12}, LW1/j;->q(LT1/d;)V

    .line 298
    .line 299
    .line 300
    new-instance v13, LT1/d;

    .line 301
    .line 302
    iget-object v14, v12, LT1/d;->r:LT1/p;

    .line 303
    .line 304
    move-object/from16 v15, p2

    .line 305
    .line 306
    invoke-virtual {v14, v15}, LT1/p;->d(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 307
    .line 308
    .line 309
    move-result-object v16

    .line 310
    iget-object v14, v12, LT1/d;->q:LC3/b;

    .line 311
    .line 312
    iget-object v15, v12, LT1/d;->r:LT1/p;

    .line 313
    .line 314
    iget-object v0, v12, LT1/d;->t:Landroidx/lifecycle/p;

    .line 315
    .line 316
    iget-object v7, v12, LT1/d;->u:LT1/i;

    .line 317
    .line 318
    iget-object v9, v12, LT1/d;->v:Ljava/lang/String;

    .line 319
    .line 320
    iget-object v4, v12, LT1/d;->w:Landroid/os/Bundle;

    .line 321
    .line 322
    move-object/from16 v17, v0

    .line 323
    .line 324
    move-object/from16 v20, v4

    .line 325
    .line 326
    move-object/from16 v18, v7

    .line 327
    .line 328
    move-object/from16 v19, v9

    .line 329
    .line 330
    invoke-direct/range {v13 .. v20}, LT1/d;-><init>(LC3/b;LT1/p;Landroid/os/Bundle;Landroidx/lifecycle/p;LT1/i;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 331
    .line 332
    .line 333
    iget-object v0, v13, LT1/d;->x:LW1/c;

    .line 334
    .line 335
    iget-object v4, v12, LT1/d;->t:Landroidx/lifecycle/p;

    .line 336
    .line 337
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    const-string v7, "<set-?>"

    .line 341
    .line 342
    invoke-static {v4, v7}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    iput-object v4, v0, LW1/c;->d:Landroidx/lifecycle/p;

    .line 346
    .line 347
    iget-object v0, v13, LT1/d;->x:LW1/c;

    .line 348
    .line 349
    iget-object v4, v12, LT1/d;->x:LW1/c;

    .line 350
    .line 351
    iget-object v4, v4, LW1/c;->k:Landroidx/lifecycle/p;

    .line 352
    .line 353
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    const-string v7, "maxState"

    .line 357
    .line 358
    invoke-static {v4, v7}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    iput-object v4, v0, LW1/c;->k:Landroidx/lifecycle/p;

    .line 362
    .line 363
    invoke-virtual {v0}, LW1/c;->b()V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v10, v13}, Ln5/j;->addFirst(Ljava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    const/4 v0, -0x1

    .line 370
    const/4 v4, 0x1

    .line 371
    goto :goto_4

    .line 372
    :cond_a
    invoke-virtual {v10}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 377
    .line 378
    .line 379
    move-result v4

    .line 380
    if-eqz v4, :cond_c

    .line 381
    .line 382
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v4

    .line 386
    check-cast v4, LT1/d;

    .line 387
    .line 388
    iget-object v7, v4, LT1/d;->r:LT1/p;

    .line 389
    .line 390
    iget-object v7, v7, LT1/p;->s:LT1/r;

    .line 391
    .line 392
    if-eqz v7, :cond_b

    .line 393
    .line 394
    iget-object v7, v7, LT1/p;->r:LW1/l;

    .line 395
    .line 396
    iget v7, v7, LW1/l;->a:I

    .line 397
    .line 398
    invoke-virtual {v2, v7}, LW1/j;->e(I)LT1/d;

    .line 399
    .line 400
    .line 401
    move-result-object v7

    .line 402
    invoke-virtual {v2, v4, v7}, LW1/j;->j(LT1/d;LT1/d;)V

    .line 403
    .line 404
    .line 405
    :cond_b
    iget-object v7, v2, LW1/j;->f:Ln5/j;

    .line 406
    .line 407
    invoke-virtual {v7, v4}, Ln5/j;->addLast(Ljava/lang/Object;)V

    .line 408
    .line 409
    .line 410
    goto :goto_5

    .line 411
    :cond_c
    invoke-virtual {v10}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 416
    .line 417
    .line 418
    move-result v4

    .line 419
    if-eqz v4, :cond_11

    .line 420
    .line 421
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v4

    .line 425
    check-cast v4, LT1/d;

    .line 426
    .line 427
    iget-object v7, v2, LW1/j;->s:LT1/A;

    .line 428
    .line 429
    iget-object v9, v4, LT1/d;->r:LT1/p;

    .line 430
    .line 431
    iget-object v9, v9, LT1/p;->q:Ljava/lang/String;

    .line 432
    .line 433
    invoke-virtual {v7, v9}, LT1/A;->b(Ljava/lang/String;)LT1/z;

    .line 434
    .line 435
    .line 436
    move-result-object v7

    .line 437
    iget-object v9, v4, LT1/d;->r:LT1/p;

    .line 438
    .line 439
    if-eqz v9, :cond_d

    .line 440
    .line 441
    goto :goto_7

    .line 442
    :cond_d
    const/4 v9, 0x0

    .line 443
    :goto_7
    if-nez v9, :cond_e

    .line 444
    .line 445
    const/4 v11, 0x1

    .line 446
    goto :goto_6

    .line 447
    :cond_e
    new-instance v10, LT1/x;

    .line 448
    .line 449
    invoke-direct {v10}, LT1/x;-><init>()V

    .line 450
    .line 451
    .line 452
    const/4 v11, 0x1

    .line 453
    iput-boolean v11, v10, LT1/x;->b:Z

    .line 454
    .line 455
    invoke-virtual {v7, v9}, LT1/z;->c(LT1/p;)LT1/p;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v7}, LT1/z;->b()LT1/h;

    .line 459
    .line 460
    .line 461
    move-result-object v7

    .line 462
    iget-object v9, v7, LT1/h;->a:LO3/D;

    .line 463
    .line 464
    monitor-enter v9

    .line 465
    :try_start_0
    iget-object v10, v7, LT1/h;->e:LP5/D;

    .line 466
    .line 467
    iget-object v10, v10, LP5/D;->q:LP5/S;

    .line 468
    .line 469
    invoke-virtual {v10}, LP5/S;->getValue()Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v10

    .line 473
    check-cast v10, Ljava/util/Collection;

    .line 474
    .line 475
    invoke-static {v10}, Ln5/l;->C0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 476
    .line 477
    .line 478
    move-result-object v10

    .line 479
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 480
    .line 481
    .line 482
    move-result v12

    .line 483
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    .line 484
    .line 485
    .line 486
    move-result-object v12

    .line 487
    :cond_f
    invoke-interface {v12}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 488
    .line 489
    .line 490
    move-result v13

    .line 491
    if-eqz v13, :cond_10

    .line 492
    .line 493
    invoke-interface {v12}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v13

    .line 497
    check-cast v13, LT1/d;

    .line 498
    .line 499
    iget-object v13, v13, LT1/d;->v:Ljava/lang/String;

    .line 500
    .line 501
    iget-object v14, v4, LT1/d;->v:Ljava/lang/String;

    .line 502
    .line 503
    invoke-static {v13, v14}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 504
    .line 505
    .line 506
    move-result v13

    .line 507
    if-eqz v13, :cond_f

    .line 508
    .line 509
    invoke-interface {v12}, Ljava/util/ListIterator;->nextIndex()I

    .line 510
    .line 511
    .line 512
    move-result v12

    .line 513
    goto :goto_8

    .line 514
    :catchall_0
    move-exception v0

    .line 515
    goto :goto_9

    .line 516
    :cond_10
    const/4 v12, -0x1

    .line 517
    :goto_8
    invoke-virtual {v10, v12, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    iget-object v4, v7, LT1/h;->b:LP5/S;

    .line 521
    .line 522
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 523
    .line 524
    .line 525
    const/4 v7, 0x0

    .line 526
    invoke-virtual {v4, v7, v10}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 527
    .line 528
    .line 529
    monitor-exit v9

    .line 530
    goto :goto_6

    .line 531
    :goto_9
    monitor-exit v9

    .line 532
    throw v0

    .line 533
    :cond_11
    const/4 v11, 0x1

    .line 534
    goto :goto_b

    .line 535
    :cond_12
    :goto_a
    const/4 v11, 0x0

    .line 536
    :goto_b
    if-nez v11, :cond_13

    .line 537
    .line 538
    iget-object v0, v2, LW1/j;->a:LT1/u;

    .line 539
    .line 540
    iget-object v0, v0, LT1/u;->c:LC3/b;

    .line 541
    .line 542
    invoke-virtual {v2}, LW1/j;->h()Landroidx/lifecycle/p;

    .line 543
    .line 544
    .line 545
    move-result-object v4

    .line 546
    iget-object v7, v2, LW1/j;->o:LT1/i;

    .line 547
    .line 548
    invoke-static {v0, v3, v5, v4, v7}, LO3/B;->f(LC3/b;LT1/p;Landroid/os/Bundle;Landroidx/lifecycle/p;LT1/i;)LT1/d;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    iget-object v4, v2, LW1/j;->s:LT1/A;

    .line 553
    .line 554
    iget-object v7, v3, LT1/p;->q:Ljava/lang/String;

    .line 555
    .line 556
    invoke-virtual {v4, v7}, LT1/A;->b(Ljava/lang/String;)LT1/z;

    .line 557
    .line 558
    .line 559
    move-result-object v7

    .line 560
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/n2;->z(Ljava/lang/Object;)Ljava/util/List;

    .line 561
    .line 562
    .line 563
    move-result-object v9

    .line 564
    new-instance v0, LW1/e;

    .line 565
    .line 566
    move-object v4, v5

    .line 567
    const/4 v5, 0x0

    .line 568
    invoke-direct/range {v0 .. v5}, LW1/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 569
    .line 570
    .line 571
    iput-object v0, v2, LW1/j;->u:LB5/c;

    .line 572
    .line 573
    invoke-virtual {v7, v9, v6}, LT1/z;->d(Ljava/util/List;LT1/w;)V

    .line 574
    .line 575
    .line 576
    const/4 v7, 0x0

    .line 577
    iput-object v7, v2, LW1/j;->u:LB5/c;

    .line 578
    .line 579
    :cond_13
    :goto_c
    iget-object v0, v2, LW1/j;->b:LT1/f;

    .line 580
    .line 581
    invoke-virtual {v0}, LT1/f;->invoke()Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    iget-object v0, v2, LW1/j;->t:Ljava/util/LinkedHashMap;

    .line 585
    .line 586
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    check-cast v0, Ljava/lang/Iterable;

    .line 591
    .line 592
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 593
    .line 594
    .line 595
    move-result-object v0

    .line 596
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 597
    .line 598
    .line 599
    move-result v3

    .line 600
    if-eqz v3, :cond_14

    .line 601
    .line 602
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move-result-object v3

    .line 606
    check-cast v3, LT1/h;

    .line 607
    .line 608
    const/4 v4, 0x0

    .line 609
    iput-boolean v4, v3, LT1/h;->d:Z

    .line 610
    .line 611
    goto :goto_d

    .line 612
    :cond_14
    if-nez v8, :cond_16

    .line 613
    .line 614
    iget-boolean v0, v1, Lkotlin/jvm/internal/u;->q:Z

    .line 615
    .line 616
    if-nez v0, :cond_16

    .line 617
    .line 618
    if-eqz v11, :cond_15

    .line 619
    .line 620
    goto :goto_e

    .line 621
    :cond_15
    invoke-virtual {v2}, LW1/j;->r()V

    .line 622
    .line 623
    .line 624
    return-void

    .line 625
    :cond_16
    :goto_e
    invoke-virtual {v2}, LW1/j;->b()Z

    .line 626
    .line 627
    .line 628
    return-void
.end method

.method public final l(IZZ)Z
    .locals 16

    .line 1
    move-object/from16 v3, p0

    .line 2
    .line 3
    move/from16 v0, p1

    .line 4
    .line 5
    iget-object v6, v3, LW1/j;->f:Ln5/j;

    .line 6
    .line 7
    invoke-virtual {v6}, Ln5/j;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v7, 0x0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    return v7

    .line 15
    :cond_0
    new-instance v8, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-static {v6}, Ln5/l;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const/4 v9, 0x0

    .line 33
    if-eqz v2, :cond_4

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, LT1/d;

    .line 40
    .line 41
    iget-object v2, v2, LT1/d;->r:LT1/p;

    .line 42
    .line 43
    iget-object v4, v2, LT1/p;->q:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v5, v2, LT1/p;->r:LW1/l;

    .line 46
    .line 47
    iget-object v10, v3, LW1/j;->s:LT1/A;

    .line 48
    .line 49
    invoke-virtual {v10, v4}, LT1/A;->b(Ljava/lang/String;)LT1/z;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    if-nez p2, :cond_2

    .line 54
    .line 55
    iget v10, v5, LW1/l;->a:I

    .line 56
    .line 57
    if-eq v10, v0, :cond_3

    .line 58
    .line 59
    :cond_2
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    :cond_3
    iget v4, v5, LW1/l;->a:I

    .line 63
    .line 64
    if-ne v4, v0, :cond_1

    .line 65
    .line 66
    move-object v10, v2

    .line 67
    goto :goto_0

    .line 68
    :cond_4
    move-object v10, v9

    .line 69
    :goto_0
    if-nez v10, :cond_5

    .line 70
    .line 71
    sget v1, LT1/p;->u:I

    .line 72
    .line 73
    iget-object v1, v3, LW1/j;->a:LT1/u;

    .line 74
    .line 75
    iget-object v1, v1, LT1/u;->c:LC3/b;

    .line 76
    .line 77
    invoke-static {v1, v0}, Ln5/A;->s(LC3/b;I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    new-instance v1, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    const-string v2, "Ignoring popBackStack to destination "

    .line 84
    .line 85
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string v0, " as it was not found on the current back stack"

    .line 92
    .line 93
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    const-string v1, "message"

    .line 101
    .line 102
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    const-string v1, "NavController"

    .line 106
    .line 107
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    return v7

    .line 111
    :cond_5
    new-instance v2, Lkotlin/jvm/internal/u;

    .line 112
    .line 113
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 114
    .line 115
    .line 116
    new-instance v5, Ln5/j;

    .line 117
    .line 118
    invoke-direct {v5}, Ln5/j;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 122
    .line 123
    .line 124
    move-result v11

    .line 125
    move v0, v7

    .line 126
    :goto_1
    if-ge v0, v11, :cond_7

    .line 127
    .line 128
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    add-int/lit8 v12, v0, 0x1

    .line 133
    .line 134
    move-object v13, v1

    .line 135
    check-cast v13, LT1/z;

    .line 136
    .line 137
    new-instance v1, Lkotlin/jvm/internal/u;

    .line 138
    .line 139
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v6}, Ln5/j;->last()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    move-object v14, v0

    .line 147
    check-cast v14, LT1/d;

    .line 148
    .line 149
    new-instance v0, LW1/g;

    .line 150
    .line 151
    move/from16 v4, p3

    .line 152
    .line 153
    invoke-direct/range {v0 .. v5}, LW1/g;-><init>(Lkotlin/jvm/internal/u;Lkotlin/jvm/internal/u;LW1/j;ZLn5/j;)V

    .line 154
    .line 155
    .line 156
    const-string v15, "navigator"

    .line 157
    .line 158
    invoke-static {v13, v15}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    const-string v15, "popUpTo"

    .line 162
    .line 163
    invoke-static {v14, v15}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    iput-object v0, v3, LW1/j;->v:LW1/g;

    .line 167
    .line 168
    invoke-virtual {v13, v14, v4}, LT1/z;->e(LT1/d;Z)V

    .line 169
    .line 170
    .line 171
    iput-object v9, v3, LW1/j;->v:LW1/g;

    .line 172
    .line 173
    iget-boolean v0, v1, Lkotlin/jvm/internal/u;->q:Z

    .line 174
    .line 175
    if-nez v0, :cond_6

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_6
    move v0, v12

    .line 179
    goto :goto_1

    .line 180
    :cond_7
    move/from16 v4, p3

    .line 181
    .line 182
    :goto_2
    if-eqz v4, :cond_b

    .line 183
    .line 184
    iget-object v0, v3, LW1/j;->l:Ljava/util/LinkedHashMap;

    .line 185
    .line 186
    if-nez p2, :cond_9

    .line 187
    .line 188
    new-instance v1, LI5/m;

    .line 189
    .line 190
    const/16 v4, 0x18

    .line 191
    .line 192
    invoke-direct {v1, v4}, LI5/m;-><init>(I)V

    .line 193
    .line 194
    .line 195
    invoke-static {v10, v1}, LI5/k;->R(Ljava/lang/Object;LB5/c;)LI5/i;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    new-instance v4, LW1/h;

    .line 200
    .line 201
    invoke-direct {v4, v3, v7}, LW1/h;-><init>(LW1/j;I)V

    .line 202
    .line 203
    .line 204
    new-instance v6, LI5/p;

    .line 205
    .line 206
    invoke-direct {v6, v1, v4, v7}, LI5/p;-><init>(LI5/i;LB5/c;I)V

    .line 207
    .line 208
    .line 209
    new-instance v1, LI5/f;

    .line 210
    .line 211
    invoke-direct {v1, v6}, LI5/f;-><init>(LI5/p;)V

    .line 212
    .line 213
    .line 214
    :goto_3
    invoke-virtual {v1}, LI5/f;->hasNext()Z

    .line 215
    .line 216
    .line 217
    move-result v4

    .line 218
    if-eqz v4, :cond_9

    .line 219
    .line 220
    invoke-virtual {v1}, LI5/f;->next()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    check-cast v4, LT1/p;

    .line 225
    .line 226
    iget-object v4, v4, LT1/p;->r:LW1/l;

    .line 227
    .line 228
    iget v4, v4, LW1/l;->a:I

    .line 229
    .line 230
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    invoke-virtual {v5}, Ln5/j;->j()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v6

    .line 238
    check-cast v6, LT1/e;

    .line 239
    .line 240
    if-eqz v6, :cond_8

    .line 241
    .line 242
    iget-object v6, v6, LT1/e;->a:LW1/d;

    .line 243
    .line 244
    iget-object v6, v6, LW1/d;->b:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v6, Ljava/lang/String;

    .line 247
    .line 248
    goto :goto_4

    .line 249
    :cond_8
    move-object v6, v9

    .line 250
    :goto_4
    invoke-interface {v0, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    goto :goto_3

    .line 254
    :cond_9
    invoke-virtual {v5}, Ln5/j;->isEmpty()Z

    .line 255
    .line 256
    .line 257
    move-result v1

    .line 258
    if-nez v1, :cond_b

    .line 259
    .line 260
    invoke-virtual {v5}, Ln5/j;->first()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    check-cast v1, LT1/e;

    .line 265
    .line 266
    iget-object v1, v1, LT1/e;->a:LW1/d;

    .line 267
    .line 268
    iget v4, v1, LW1/d;->a:I

    .line 269
    .line 270
    invoke-virtual {v3, v4, v9}, LW1/j;->c(ILT1/p;)LT1/p;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    new-instance v6, LI5/m;

    .line 275
    .line 276
    const/16 v8, 0x19

    .line 277
    .line 278
    invoke-direct {v6, v8}, LI5/m;-><init>(I)V

    .line 279
    .line 280
    .line 281
    invoke-static {v4, v6}, LI5/k;->R(Ljava/lang/Object;LB5/c;)LI5/i;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    new-instance v6, LW1/h;

    .line 286
    .line 287
    const/4 v8, 0x1

    .line 288
    invoke-direct {v6, v3, v8}, LW1/h;-><init>(LW1/j;I)V

    .line 289
    .line 290
    .line 291
    new-instance v8, LI5/p;

    .line 292
    .line 293
    invoke-direct {v8, v4, v6, v7}, LI5/p;-><init>(LI5/i;LB5/c;I)V

    .line 294
    .line 295
    .line 296
    new-instance v4, LI5/f;

    .line 297
    .line 298
    invoke-direct {v4, v8}, LI5/f;-><init>(LI5/p;)V

    .line 299
    .line 300
    .line 301
    :goto_5
    invoke-virtual {v4}, LI5/f;->hasNext()Z

    .line 302
    .line 303
    .line 304
    move-result v6

    .line 305
    if-eqz v6, :cond_a

    .line 306
    .line 307
    invoke-virtual {v4}, LI5/f;->next()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v6

    .line 311
    check-cast v6, LT1/p;

    .line 312
    .line 313
    iget-object v6, v6, LT1/p;->r:LW1/l;

    .line 314
    .line 315
    iget v6, v6, LW1/l;->a:I

    .line 316
    .line 317
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 318
    .line 319
    .line 320
    move-result-object v6

    .line 321
    iget-object v7, v1, LW1/d;->b:Ljava/lang/Object;

    .line 322
    .line 323
    check-cast v7, Ljava/lang/String;

    .line 324
    .line 325
    invoke-interface {v0, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    goto :goto_5

    .line 329
    :cond_a
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    iget-object v4, v1, LW1/d;->b:Ljava/lang/Object;

    .line 334
    .line 335
    check-cast v4, Ljava/lang/String;

    .line 336
    .line 337
    invoke-interface {v0, v4}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    if-eqz v0, :cond_b

    .line 342
    .line 343
    iget-object v0, v1, LW1/d;->b:Ljava/lang/Object;

    .line 344
    .line 345
    check-cast v0, Ljava/lang/String;

    .line 346
    .line 347
    iget-object v1, v3, LW1/j;->m:Ljava/util/LinkedHashMap;

    .line 348
    .line 349
    invoke-interface {v1, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    :cond_b
    iget-object v0, v3, LW1/j;->b:LT1/f;

    .line 353
    .line 354
    invoke-virtual {v0}, LT1/f;->invoke()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    iget-boolean v0, v2, Lkotlin/jvm/internal/u;->q:Z

    .line 358
    .line 359
    return v0
.end method

.method public final m(LT1/d;ZLn5/j;)V
    .locals 3

    .line 1
    const-string v0, "popUpTo"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LW1/j;->f:Ln5/j;

    .line 7
    .line 8
    invoke-virtual {v0}, Ln5/j;->last()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, LT1/d;

    .line 13
    .line 14
    invoke-static {v1, p1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_6

    .line 19
    .line 20
    invoke-static {v0}, Ln5/q;->g0(Ljava/util/List;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    iget-object p1, v1, LT1/d;->r:LT1/p;

    .line 24
    .line 25
    iget-object p1, p1, LT1/p;->q:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v0, p0, LW1/j;->s:LT1/A;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, LT1/A;->b(Ljava/lang/String;)LT1/z;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object v0, p0, LW1/j;->t:Ljava/util/LinkedHashMap;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, LT1/h;

    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    if-eqz p1, :cond_0

    .line 43
    .line 44
    iget-object p1, p1, LT1/h;->f:LP5/D;

    .line 45
    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    iget-object p1, p1, LP5/D;->q:LP5/S;

    .line 49
    .line 50
    invoke-virtual {p1}, LP5/S;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    check-cast p1, Ljava/util/Set;

    .line 55
    .line 56
    if-eqz p1, :cond_0

    .line 57
    .line 58
    invoke-interface {p1, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-ne p1, v0, :cond_0

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    iget-object p1, p0, LW1/j;->k:Ljava/util/LinkedHashMap;

    .line 66
    .line 67
    invoke-interface {p1, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    const/4 v0, 0x0

    .line 75
    :goto_0
    iget-object p1, v1, LT1/d;->x:LW1/c;

    .line 76
    .line 77
    iget-object p1, p1, LW1/c;->j:Landroidx/lifecycle/z;

    .line 78
    .line 79
    iget-object p1, p1, Landroidx/lifecycle/z;->d:Landroidx/lifecycle/p;

    .line 80
    .line 81
    sget-object v2, Landroidx/lifecycle/p;->s:Landroidx/lifecycle/p;

    .line 82
    .line 83
    invoke-virtual {p1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-ltz p1, :cond_4

    .line 88
    .line 89
    if-eqz p2, :cond_2

    .line 90
    .line 91
    invoke-virtual {v1, v2}, LT1/d;->c(Landroidx/lifecycle/p;)V

    .line 92
    .line 93
    .line 94
    new-instance p1, LT1/e;

    .line 95
    .line 96
    invoke-direct {p1, v1}, LT1/e;-><init>(LT1/d;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p3, p1}, Ln5/j;->addFirst(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    :cond_2
    if-nez v0, :cond_3

    .line 103
    .line 104
    sget-object p1, Landroidx/lifecycle/p;->q:Landroidx/lifecycle/p;

    .line 105
    .line 106
    invoke-virtual {v1, p1}, LT1/d;->c(Landroidx/lifecycle/p;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, v1}, LW1/j;->q(LT1/d;)V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_3
    invoke-virtual {v1, v2}, LT1/d;->c(Landroidx/lifecycle/p;)V

    .line 114
    .line 115
    .line 116
    :cond_4
    :goto_1
    if-nez p2, :cond_5

    .line 117
    .line 118
    if-nez v0, :cond_5

    .line 119
    .line 120
    iget-object p1, p0, LW1/j;->o:LT1/i;

    .line 121
    .line 122
    if-eqz p1, :cond_5

    .line 123
    .line 124
    iget-object p2, v1, LT1/d;->v:Ljava/lang/String;

    .line 125
    .line 126
    const-string p3, "backStackEntryId"

    .line 127
    .line 128
    invoke-static {p2, p3}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    iget-object p1, p1, LT1/i;->b:Ljava/util/LinkedHashMap;

    .line 132
    .line 133
    invoke-interface {p1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    check-cast p1, Landroidx/lifecycle/k0;

    .line 138
    .line 139
    if-eqz p1, :cond_5

    .line 140
    .line 141
    invoke-virtual {p1}, Landroidx/lifecycle/k0;->a()V

    .line 142
    .line 143
    .line 144
    :cond_5
    return-void

    .line 145
    :cond_6
    new-instance p2, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    const-string p3, "Attempted to pop "

    .line 148
    .line 149
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    iget-object p1, p1, LT1/d;->r:LT1/p;

    .line 153
    .line 154
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    const-string p1, ", which is not the top of the back stack ("

    .line 158
    .line 159
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    iget-object p1, v1, LT1/d;->r:LT1/p;

    .line 163
    .line 164
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    const/16 p1, 0x29

    .line 168
    .line 169
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 177
    .line 178
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    throw p2
.end method

.method public final o()Ljava/util/ArrayList;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LW1/j;->t:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Ljava/lang/Iterable;

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    sget-object v3, Landroidx/lifecycle/p;->t:Landroidx/lifecycle/p;

    .line 23
    .line 24
    if-eqz v2, :cond_3

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, LT1/h;

    .line 31
    .line 32
    iget-object v2, v2, LT1/h;->f:LP5/D;

    .line 33
    .line 34
    iget-object v2, v2, LP5/D;->q:LP5/S;

    .line 35
    .line 36
    invoke-virtual {v2}, LP5/S;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Ljava/lang/Iterable;

    .line 41
    .line 42
    new-instance v4, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    :cond_0
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    if-eqz v5, :cond_2

    .line 56
    .line 57
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    move-object v6, v5

    .line 62
    check-cast v6, LT1/d;

    .line 63
    .line 64
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    if-nez v7, :cond_0

    .line 69
    .line 70
    iget-object v6, v6, LT1/d;->x:LW1/c;

    .line 71
    .line 72
    iget-object v6, v6, LW1/c;->k:Landroidx/lifecycle/p;

    .line 73
    .line 74
    invoke-virtual {v6, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-ltz v6, :cond_1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    invoke-static {v0, v4}, Ln5/q;->e0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 92
    .line 93
    .line 94
    iget-object v2, p0, LW1/j;->f:Ln5/j;

    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    :cond_4
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    if-eqz v4, :cond_5

    .line 105
    .line 106
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    move-object v5, v4

    .line 111
    check-cast v5, LT1/d;

    .line 112
    .line 113
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    if-nez v6, :cond_4

    .line 118
    .line 119
    iget-object v5, v5, LT1/d;->x:LW1/c;

    .line 120
    .line 121
    iget-object v5, v5, LW1/c;->k:Landroidx/lifecycle/p;

    .line 122
    .line 123
    invoke-virtual {v5, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    if-ltz v5, :cond_4

    .line 128
    .line 129
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_5
    invoke-static {v0, v1}, Ln5/q;->e0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 134
    .line 135
    .line 136
    new-instance v1, Ljava/util/ArrayList;

    .line 137
    .line 138
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    const/4 v3, 0x0

    .line 146
    :cond_6
    :goto_3
    if-ge v3, v2, :cond_7

    .line 147
    .line 148
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    add-int/lit8 v3, v3, 0x1

    .line 153
    .line 154
    move-object v5, v4

    .line 155
    check-cast v5, LT1/d;

    .line 156
    .line 157
    iget-object v5, v5, LT1/d;->r:LT1/p;

    .line 158
    .line 159
    instance-of v5, v5, LT1/r;

    .line 160
    .line 161
    if-nez v5, :cond_6

    .line 162
    .line 163
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_7
    return-object v1
.end method

.method public final p(ILandroid/os/Bundle;LT1/w;)Z
    .locals 14

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LW1/j;->l:Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return v2

    .line 15
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Ljava/lang/Iterable;

    .line 30
    .line 31
    const-string v3, "<this>"

    .line 32
    .line 33
    invoke-static {v1, v3}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    const/4 v4, 0x1

    .line 45
    if-eqz v3, :cond_2

    .line 46
    .line 47
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    check-cast v3, Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v3, v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-ne v3, v4, :cond_1

    .line 58
    .line 59
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    iget-object v1, p0, LW1/j;->m:Ljava/util/LinkedHashMap;

    .line 64
    .line 65
    invoke-static {v1}, Lkotlin/jvm/internal/B;->a(Ljava/lang/Object;)Ljava/util/Map;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, Ln5/j;

    .line 74
    .line 75
    iget-object v1, p0, LW1/j;->a:LT1/u;

    .line 76
    .line 77
    iget-object v6, v1, LT1/u;->c:LC3/b;

    .line 78
    .line 79
    new-instance v1, Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 82
    .line 83
    .line 84
    iget-object v3, p0, LW1/j;->f:Ln5/j;

    .line 85
    .line 86
    invoke-virtual {v3}, Ln5/j;->l()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    check-cast v3, LT1/d;

    .line 91
    .line 92
    if-eqz v3, :cond_3

    .line 93
    .line 94
    iget-object v3, v3, LT1/d;->r:LT1/p;

    .line 95
    .line 96
    if-nez v3, :cond_4

    .line 97
    .line 98
    :cond_3
    invoke-virtual {p0}, LW1/j;->g()LT1/r;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    :cond_4
    const/4 v13, 0x0

    .line 103
    if-eqz v0, :cond_8

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-eqz v5, :cond_8

    .line 114
    .line 115
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    check-cast v5, LT1/e;

    .line 120
    .line 121
    iget-object v7, v5, LT1/e;->a:LW1/d;

    .line 122
    .line 123
    iget-object v5, v5, LT1/e;->a:LW1/d;

    .line 124
    .line 125
    iget v7, v7, LW1/d;->a:I

    .line 126
    .line 127
    invoke-static {v7, v3, v13, v4}, LW1/j;->d(ILT1/p;LT1/p;Z)LT1/p;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    if-eqz v7, :cond_7

    .line 132
    .line 133
    invoke-virtual {p0}, LW1/j;->h()Landroidx/lifecycle/p;

    .line 134
    .line 135
    .line 136
    move-result-object v9

    .line 137
    iget-object v10, p0, LW1/j;->o:LT1/i;

    .line 138
    .line 139
    const-string v3, "context"

    .line 140
    .line 141
    invoke-static {v6, v3}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    const-string v3, "hostLifecycleState"

    .line 145
    .line 146
    invoke-static {v9, v3}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    iget-object v3, v5, LW1/d;->c:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v3, Landroid/os/Bundle;

    .line 152
    .line 153
    if-eqz v3, :cond_6

    .line 154
    .line 155
    iget-object v8, v6, LC3/b;->a:Landroid/content/Context;

    .line 156
    .line 157
    if-eqz v8, :cond_5

    .line 158
    .line 159
    invoke-virtual {v8}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 160
    .line 161
    .line 162
    move-result-object v8

    .line 163
    goto :goto_2

    .line 164
    :cond_5
    move-object v8, v13

    .line 165
    :goto_2
    invoke-virtual {v3, v8}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 166
    .line 167
    .line 168
    move-object v8, v3

    .line 169
    goto :goto_3

    .line 170
    :cond_6
    move-object v8, v13

    .line 171
    :goto_3
    iget-object v3, v5, LW1/d;->b:Ljava/lang/Object;

    .line 172
    .line 173
    move-object v11, v3

    .line 174
    check-cast v11, Ljava/lang/String;

    .line 175
    .line 176
    iget-object v3, v5, LW1/d;->d:Ljava/lang/Object;

    .line 177
    .line 178
    move-object v12, v3

    .line 179
    check-cast v12, Landroid/os/Bundle;

    .line 180
    .line 181
    const-string v3, "id"

    .line 182
    .line 183
    invoke-static {v11, v3}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    new-instance v5, LT1/d;

    .line 187
    .line 188
    invoke-direct/range {v5 .. v12}, LT1/d;-><init>(LC3/b;LT1/p;Landroid/os/Bundle;Landroidx/lifecycle/p;LT1/i;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-object v3, v7

    .line 195
    goto :goto_1

    .line 196
    :cond_7
    sget v0, LT1/p;->u:I

    .line 197
    .line 198
    iget v0, v5, LW1/d;->a:I

    .line 199
    .line 200
    invoke-static {v6, v0}, Ln5/A;->s(LC3/b;I)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    new-instance v1, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    const-string v2, "Restore State failed: destination "

    .line 207
    .line 208
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    const-string v0, " cannot be found from the current destination "

    .line 215
    .line 216
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 227
    .line 228
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    throw v1

    .line 236
    :cond_8
    new-instance v0, Ljava/util/ArrayList;

    .line 237
    .line 238
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 239
    .line 240
    .line 241
    new-instance v3, Ljava/util/ArrayList;

    .line 242
    .line 243
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 247
    .line 248
    .line 249
    move-result v4

    .line 250
    move v5, v2

    .line 251
    :cond_9
    :goto_4
    if-ge v5, v4, :cond_a

    .line 252
    .line 253
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v6

    .line 257
    add-int/lit8 v5, v5, 0x1

    .line 258
    .line 259
    move-object v7, v6

    .line 260
    check-cast v7, LT1/d;

    .line 261
    .line 262
    iget-object v7, v7, LT1/d;->r:LT1/p;

    .line 263
    .line 264
    instance-of v7, v7, LT1/r;

    .line 265
    .line 266
    if-nez v7, :cond_9

    .line 267
    .line 268
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    goto :goto_4

    .line 272
    :cond_a
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 273
    .line 274
    .line 275
    move-result v4

    .line 276
    move v5, v2

    .line 277
    :goto_5
    if-ge v5, v4, :cond_d

    .line 278
    .line 279
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v6

    .line 283
    add-int/lit8 v5, v5, 0x1

    .line 284
    .line 285
    check-cast v6, LT1/d;

    .line 286
    .line 287
    invoke-static {v0}, Ln5/l;->s0(Ljava/util/List;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v7

    .line 291
    check-cast v7, Ljava/util/List;

    .line 292
    .line 293
    if-eqz v7, :cond_b

    .line 294
    .line 295
    invoke-static {v7}, Ln5/l;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v8

    .line 299
    check-cast v8, LT1/d;

    .line 300
    .line 301
    if-eqz v8, :cond_b

    .line 302
    .line 303
    iget-object v8, v8, LT1/d;->r:LT1/p;

    .line 304
    .line 305
    if-eqz v8, :cond_b

    .line 306
    .line 307
    iget-object v8, v8, LT1/p;->q:Ljava/lang/String;

    .line 308
    .line 309
    goto :goto_6

    .line 310
    :cond_b
    move-object v8, v13

    .line 311
    :goto_6
    iget-object v9, v6, LT1/d;->r:LT1/p;

    .line 312
    .line 313
    iget-object v9, v9, LT1/p;->q:Ljava/lang/String;

    .line 314
    .line 315
    invoke-static {v8, v9}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result v8

    .line 319
    if-eqz v8, :cond_c

    .line 320
    .line 321
    check-cast v7, Ljava/util/Collection;

    .line 322
    .line 323
    invoke-interface {v7, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    goto :goto_5

    .line 327
    :cond_c
    filled-new-array {v6}, [LT1/d;

    .line 328
    .line 329
    .line 330
    move-result-object v6

    .line 331
    invoke-static {v6}, Lcom/google/android/gms/internal/measurement/n2;->C([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 332
    .line 333
    .line 334
    move-result-object v6

    .line 335
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    goto :goto_5

    .line 339
    :cond_d
    new-instance v8, Lkotlin/jvm/internal/u;

    .line 340
    .line 341
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 345
    .line 346
    .line 347
    move-result v3

    .line 348
    :goto_7
    if-ge v2, v3, :cond_e

    .line 349
    .line 350
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v4

    .line 354
    add-int/lit8 v2, v2, 0x1

    .line 355
    .line 356
    check-cast v4, Ljava/util/List;

    .line 357
    .line 358
    invoke-static {v4}, Ln5/l;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v5

    .line 362
    check-cast v5, LT1/d;

    .line 363
    .line 364
    iget-object v5, v5, LT1/d;->r:LT1/p;

    .line 365
    .line 366
    iget-object v5, v5, LT1/p;->q:Ljava/lang/String;

    .line 367
    .line 368
    iget-object v6, p0, LW1/j;->s:LT1/A;

    .line 369
    .line 370
    invoke-virtual {v6, v5}, LT1/A;->b(Ljava/lang/String;)LT1/z;

    .line 371
    .line 372
    .line 373
    move-result-object v5

    .line 374
    new-instance v10, Lkotlin/jvm/internal/w;

    .line 375
    .line 376
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 377
    .line 378
    .line 379
    new-instance v7, LW1/i;

    .line 380
    .line 381
    move-object v11, p0

    .line 382
    move-object/from16 v12, p2

    .line 383
    .line 384
    move-object v9, v1

    .line 385
    invoke-direct/range {v7 .. v12}, LW1/i;-><init>(Lkotlin/jvm/internal/u;Ljava/util/ArrayList;Lkotlin/jvm/internal/w;LW1/j;Landroid/os/Bundle;)V

    .line 386
    .line 387
    .line 388
    iput-object v7, p0, LW1/j;->u:LB5/c;

    .line 389
    .line 390
    move-object/from16 v1, p3

    .line 391
    .line 392
    invoke-virtual {v5, v4, v1}, LT1/z;->d(Ljava/util/List;LT1/w;)V

    .line 393
    .line 394
    .line 395
    iput-object v13, p0, LW1/j;->u:LB5/c;

    .line 396
    .line 397
    move-object v1, v9

    .line 398
    goto :goto_7

    .line 399
    :cond_e
    iget-boolean v0, v8, Lkotlin/jvm/internal/u;->q:Z

    .line 400
    .line 401
    return v0
.end method

.method public final q(LT1/d;)V
    .locals 3

    .line 1
    const-string v0, "child"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LW1/j;->j:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, LT1/d;

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    iget-object v0, p0, LW1/j;->k:Ljava/util/LinkedHashMap;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, LW1/a;

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    iget-object v1, v1, LW1/a;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v1, 0x0

    .line 39
    :goto_0
    if-nez v1, :cond_2

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_4

    .line 47
    .line 48
    iget-object v1, p1, LT1/d;->r:LT1/p;

    .line 49
    .line 50
    iget-object v1, v1, LT1/p;->q:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v2, p0, LW1/j;->s:LT1/A;

    .line 53
    .line 54
    invoke-virtual {v2, v1}, LT1/A;->b(Ljava/lang/String;)LT1/z;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iget-object v2, p0, LW1/j;->t:Ljava/util/LinkedHashMap;

    .line 59
    .line 60
    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, LT1/h;

    .line 65
    .line 66
    if-eqz v1, :cond_3

    .line 67
    .line 68
    invoke-virtual {v1, p1}, LT1/h;->c(LT1/d;)V

    .line 69
    .line 70
    .line 71
    :cond_3
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    :cond_4
    :goto_1
    return-void
.end method

.method public final r()V
    .locals 12

    .line 1
    iget-object v0, p0, LW1/j;->f:Ln5/j;

    .line 2
    .line 3
    invoke-static {v0}, Ln5/l;->C0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_6

    .line 14
    .line 15
    :cond_0
    invoke-static {v0}, Ln5/l;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, LT1/d;

    .line 20
    .line 21
    iget-object v1, v1, LT1/d;->r:LT1/p;

    .line 22
    .line 23
    filled-new-array {v1}, [LT1/p;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/n2;->C([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    new-instance v2, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-static {v1}, Ln5/l;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    instance-of v3, v3, LT1/c;

    .line 41
    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    invoke-static {v0}, Ln5/l;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_2

    .line 57
    .line 58
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    check-cast v4, LT1/d;

    .line 63
    .line 64
    iget-object v4, v4, LT1/d;->r:LT1/p;

    .line 65
    .line 66
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    instance-of v5, v4, LT1/c;

    .line 70
    .line 71
    if-nez v5, :cond_1

    .line 72
    .line 73
    instance-of v4, v4, LT1/r;

    .line 74
    .line 75
    if-nez v4, :cond_1

    .line 76
    .line 77
    :cond_2
    new-instance v3, Ljava/util/HashMap;

    .line 78
    .line 79
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-static {v0}, Ln5/l;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    :cond_3
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-eqz v5, :cond_d

    .line 95
    .line 96
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    check-cast v5, LT1/d;

    .line 101
    .line 102
    iget-object v6, v5, LT1/d;->x:LW1/c;

    .line 103
    .line 104
    iget-object v6, v6, LW1/c;->k:Landroidx/lifecycle/p;

    .line 105
    .line 106
    iget-object v7, v5, LT1/d;->r:LT1/p;

    .line 107
    .line 108
    invoke-static {v1}, Ln5/l;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    check-cast v8, LT1/p;

    .line 113
    .line 114
    sget-object v9, Landroidx/lifecycle/p;->u:Landroidx/lifecycle/p;

    .line 115
    .line 116
    sget-object v10, Landroidx/lifecycle/p;->t:Landroidx/lifecycle/p;

    .line 117
    .line 118
    if-eqz v8, :cond_9

    .line 119
    .line 120
    iget-object v8, v8, LT1/p;->r:LW1/l;

    .line 121
    .line 122
    iget v8, v8, LW1/l;->a:I

    .line 123
    .line 124
    iget-object v11, v7, LT1/p;->r:LW1/l;

    .line 125
    .line 126
    iget v11, v11, LW1/l;->a:I

    .line 127
    .line 128
    if-ne v8, v11, :cond_9

    .line 129
    .line 130
    if-eq v6, v9, :cond_7

    .line 131
    .line 132
    iget-object v6, v5, LT1/d;->r:LT1/p;

    .line 133
    .line 134
    iget-object v6, v6, LT1/p;->q:Ljava/lang/String;

    .line 135
    .line 136
    iget-object v8, p0, LW1/j;->s:LT1/A;

    .line 137
    .line 138
    invoke-virtual {v8, v6}, LT1/A;->b(Ljava/lang/String;)LT1/z;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    iget-object v8, p0, LW1/j;->t:Ljava/util/LinkedHashMap;

    .line 143
    .line 144
    invoke-virtual {v8, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    check-cast v6, LT1/h;

    .line 149
    .line 150
    if-eqz v6, :cond_4

    .line 151
    .line 152
    iget-object v6, v6, LT1/h;->f:LP5/D;

    .line 153
    .line 154
    if-eqz v6, :cond_4

    .line 155
    .line 156
    iget-object v6, v6, LP5/D;->q:LP5/S;

    .line 157
    .line 158
    invoke-virtual {v6}, LP5/S;->getValue()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    check-cast v6, Ljava/util/Set;

    .line 163
    .line 164
    if-eqz v6, :cond_4

    .line 165
    .line 166
    invoke-interface {v6, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v6

    .line 170
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    goto :goto_1

    .line 175
    :cond_4
    const/4 v6, 0x0

    .line 176
    :goto_1
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 177
    .line 178
    invoke-static {v6, v8}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v6

    .line 182
    if-nez v6, :cond_6

    .line 183
    .line 184
    iget-object v6, p0, LW1/j;->k:Ljava/util/LinkedHashMap;

    .line 185
    .line 186
    invoke-virtual {v6, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v6

    .line 190
    check-cast v6, LW1/a;

    .line 191
    .line 192
    if-eqz v6, :cond_5

    .line 193
    .line 194
    iget-object v6, v6, LW1/a;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 195
    .line 196
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 197
    .line 198
    .line 199
    move-result v6

    .line 200
    if-nez v6, :cond_5

    .line 201
    .line 202
    goto :goto_2

    .line 203
    :cond_5
    invoke-virtual {v3, v5, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    goto :goto_3

    .line 207
    :cond_6
    :goto_2
    invoke-virtual {v3, v5, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    :cond_7
    :goto_3
    invoke-static {v2}, Ln5/l;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    check-cast v5, LT1/p;

    .line 215
    .line 216
    if-eqz v5, :cond_8

    .line 217
    .line 218
    iget-object v5, v5, LT1/p;->r:LW1/l;

    .line 219
    .line 220
    iget v5, v5, LW1/l;->a:I

    .line 221
    .line 222
    iget-object v6, v7, LT1/p;->r:LW1/l;

    .line 223
    .line 224
    iget v6, v6, LW1/l;->a:I

    .line 225
    .line 226
    if-ne v5, v6, :cond_8

    .line 227
    .line 228
    invoke-static {v2}, Ln5/q;->f0(Ljava/util/ArrayList;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    :cond_8
    invoke-static {v1}, Ln5/q;->f0(Ljava/util/ArrayList;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    iget-object v5, v7, LT1/p;->s:LT1/r;

    .line 235
    .line 236
    if-eqz v5, :cond_3

    .line 237
    .line 238
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    goto/16 :goto_0

    .line 242
    .line 243
    :cond_9
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 244
    .line 245
    .line 246
    move-result v8

    .line 247
    if-nez v8, :cond_c

    .line 248
    .line 249
    iget-object v7, v7, LT1/p;->r:LW1/l;

    .line 250
    .line 251
    iget v7, v7, LW1/l;->a:I

    .line 252
    .line 253
    invoke-static {v2}, Ln5/l;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v8

    .line 257
    check-cast v8, LT1/p;

    .line 258
    .line 259
    iget-object v8, v8, LT1/p;->r:LW1/l;

    .line 260
    .line 261
    iget v8, v8, LW1/l;->a:I

    .line 262
    .line 263
    if-ne v7, v8, :cond_c

    .line 264
    .line 265
    invoke-static {v2}, Ln5/q;->f0(Ljava/util/ArrayList;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v7

    .line 269
    check-cast v7, LT1/p;

    .line 270
    .line 271
    if-ne v6, v9, :cond_a

    .line 272
    .line 273
    invoke-virtual {v5, v10}, LT1/d;->c(Landroidx/lifecycle/p;)V

    .line 274
    .line 275
    .line 276
    goto :goto_4

    .line 277
    :cond_a
    if-eq v6, v10, :cond_b

    .line 278
    .line 279
    invoke-virtual {v3, v5, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    :cond_b
    :goto_4
    iget-object v5, v7, LT1/p;->s:LT1/r;

    .line 283
    .line 284
    if-eqz v5, :cond_3

    .line 285
    .line 286
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v6

    .line 290
    if-nez v6, :cond_3

    .line 291
    .line 292
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    goto/16 :goto_0

    .line 296
    .line 297
    :cond_c
    sget-object v6, Landroidx/lifecycle/p;->s:Landroidx/lifecycle/p;

    .line 298
    .line 299
    invoke-virtual {v5, v6}, LT1/d;->c(Landroidx/lifecycle/p;)V

    .line 300
    .line 301
    .line 302
    goto/16 :goto_0

    .line 303
    .line 304
    :cond_d
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 305
    .line 306
    .line 307
    move-result v1

    .line 308
    const/4 v2, 0x0

    .line 309
    :goto_5
    if-ge v2, v1, :cond_f

    .line 310
    .line 311
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v4

    .line 315
    add-int/lit8 v2, v2, 0x1

    .line 316
    .line 317
    check-cast v4, LT1/d;

    .line 318
    .line 319
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v5

    .line 323
    check-cast v5, Landroidx/lifecycle/p;

    .line 324
    .line 325
    if-eqz v5, :cond_e

    .line 326
    .line 327
    invoke-virtual {v4, v5}, LT1/d;->c(Landroidx/lifecycle/p;)V

    .line 328
    .line 329
    .line 330
    goto :goto_5

    .line 331
    :cond_e
    iget-object v4, v4, LT1/d;->x:LW1/c;

    .line 332
    .line 333
    invoke-virtual {v4}, LW1/c;->b()V

    .line 334
    .line 335
    .line 336
    goto :goto_5

    .line 337
    :cond_f
    :goto_6
    return-void
.end method
