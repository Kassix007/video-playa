.class public final Lv/c;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:Ly/k;

.field public r:I

.field public final synthetic s:Lv/x;

.field public final synthetic t:J

.field public final synthetic u:Ly/i;


# direct methods
.method public constructor <init>(Lv/x;JLy/i;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv/c;->s:Lv/x;

    .line 2
    .line 3
    iput-wide p2, p0, Lv/c;->t:J

    .line 4
    .line 5
    iput-object p4, p0, Lv/c;->u:Ly/i;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p5}, Ls5/i;-><init>(ILq5/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 6

    .line 1
    new-instance v0, Lv/c;

    .line 2
    .line 3
    iget-wide v2, p0, Lv/c;->t:J

    .line 4
    .line 5
    iget-object v4, p0, Lv/c;->u:Ly/i;

    .line 6
    .line 7
    iget-object v1, p0, Lv/c;->s:Lv/x;

    .line 8
    .line 9
    move-object v5, p2

    .line 10
    invoke-direct/range {v0 .. v5}, Lv/c;-><init>(Lv/x;JLy/i;Lq5/c;)V

    .line 11
    .line 12
    .line 13
    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lv/c;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lv/c;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lv/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lv/c;->r:I

    .line 4
    .line 5
    iget-object v2, v0, Lv/c;->s:Lv/x;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x1

    .line 9
    sget-object v5, Lr5/a;->q:Lr5/a;

    .line 10
    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    if-eq v1, v4, :cond_1

    .line 14
    .line 15
    if-ne v1, v3, :cond_0

    .line 16
    .line 17
    iget-object v1, v0, Lv/c;->q:Ly/k;

    .line 18
    .line 19
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto/16 :goto_f

    .line 23
    .line 24
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v1

    .line 32
    :cond_1
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto/16 :goto_d

    .line 36
    .line 37
    :cond_2
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    new-instance v1, Lkotlin/jvm/internal/u;

    .line 41
    .line 42
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 43
    .line 44
    .line 45
    new-instance v6, Lf0/e;

    .line 46
    .line 47
    invoke-direct {v6, v1}, Lf0/e;-><init>(Lkotlin/jvm/internal/u;)V

    .line 48
    .line 49
    .line 50
    iget-object v7, v2, Lc0/l;->q:Lc0/l;

    .line 51
    .line 52
    iget-boolean v7, v7, Lc0/l;->D:Z

    .line 53
    .line 54
    if-nez v7, :cond_3

    .line 55
    .line 56
    const-string v7, "visitAncestors called on an unattached node"

    .line 57
    .line 58
    invoke-static {v7}, Ly0/a;->b(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :cond_3
    iget-object v7, v2, Lc0/l;->q:Lc0/l;

    .line 62
    .line 63
    iget-object v7, v7, Lc0/l;->u:Lc0/l;

    .line 64
    .line 65
    invoke-static {v2}, LB0/g;->u(LB0/m;)LB0/L;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    :goto_0
    if-eqz v8, :cond_11

    .line 70
    .line 71
    iget-object v10, v8, LB0/L;->U:LB0/g0;

    .line 72
    .line 73
    iget-object v10, v10, LB0/g0;->e:Lc0/l;

    .line 74
    .line 75
    iget v10, v10, Lc0/l;->t:I

    .line 76
    .line 77
    const/high16 v11, 0x40000

    .line 78
    .line 79
    and-int/2addr v10, v11

    .line 80
    const/4 v12, 0x0

    .line 81
    if-eqz v10, :cond_f

    .line 82
    .line 83
    :goto_1
    if-eqz v7, :cond_f

    .line 84
    .line 85
    iget v10, v7, Lc0/l;->s:I

    .line 86
    .line 87
    and-int/2addr v10, v11

    .line 88
    if-eqz v10, :cond_e

    .line 89
    .line 90
    move-object v10, v7

    .line 91
    move-object v13, v12

    .line 92
    :goto_2
    if-eqz v10, :cond_e

    .line 93
    .line 94
    instance-of v14, v10, LB0/E0;

    .line 95
    .line 96
    if-eqz v14, :cond_5

    .line 97
    .line 98
    check-cast v10, LB0/E0;

    .line 99
    .line 100
    invoke-interface {v10}, LB0/E0;->o()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v14

    .line 104
    sget-object v15, Lw/j0;->F:Ls/b;

    .line 105
    .line 106
    invoke-virtual {v15, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v14

    .line 110
    if-eqz v14, :cond_4

    .line 111
    .line 112
    invoke-virtual {v6, v10}, Lf0/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v10

    .line 116
    check-cast v10, Ljava/lang/Boolean;

    .line 117
    .line 118
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 119
    .line 120
    .line 121
    move-result v10

    .line 122
    goto :goto_3

    .line 123
    :cond_4
    move v10, v4

    .line 124
    :goto_3
    if-nez v10, :cond_d

    .line 125
    .line 126
    goto/16 :goto_8

    .line 127
    .line 128
    :cond_5
    iget v14, v10, Lc0/l;->s:I

    .line 129
    .line 130
    and-int/2addr v14, v11

    .line 131
    if-eqz v14, :cond_6

    .line 132
    .line 133
    move v14, v4

    .line 134
    goto :goto_4

    .line 135
    :cond_6
    const/4 v14, 0x0

    .line 136
    :goto_4
    if-eqz v14, :cond_d

    .line 137
    .line 138
    instance-of v14, v10, LB0/n;

    .line 139
    .line 140
    if-eqz v14, :cond_d

    .line 141
    .line 142
    move-object v14, v10

    .line 143
    check-cast v14, LB0/n;

    .line 144
    .line 145
    iget-object v14, v14, LB0/n;->F:Lc0/l;

    .line 146
    .line 147
    const/4 v15, 0x0

    .line 148
    :goto_5
    if-eqz v14, :cond_c

    .line 149
    .line 150
    iget v9, v14, Lc0/l;->s:I

    .line 151
    .line 152
    and-int/2addr v9, v11

    .line 153
    if-eqz v9, :cond_7

    .line 154
    .line 155
    move v9, v4

    .line 156
    goto :goto_6

    .line 157
    :cond_7
    const/4 v9, 0x0

    .line 158
    :goto_6
    if-eqz v9, :cond_b

    .line 159
    .line 160
    add-int/lit8 v15, v15, 0x1

    .line 161
    .line 162
    if-ne v15, v4, :cond_8

    .line 163
    .line 164
    move-object v10, v14

    .line 165
    goto :goto_7

    .line 166
    :cond_8
    if-nez v13, :cond_9

    .line 167
    .line 168
    new-instance v13, LR/e;

    .line 169
    .line 170
    const/16 v9, 0x10

    .line 171
    .line 172
    new-array v9, v9, [Lc0/l;

    .line 173
    .line 174
    invoke-direct {v13, v9}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    :cond_9
    if-eqz v10, :cond_a

    .line 178
    .line 179
    invoke-virtual {v13, v10}, LR/e;->c(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    move-object v10, v12

    .line 183
    :cond_a
    invoke-virtual {v13, v14}, LR/e;->c(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    :cond_b
    :goto_7
    iget-object v14, v14, Lc0/l;->v:Lc0/l;

    .line 187
    .line 188
    goto :goto_5

    .line 189
    :cond_c
    if-ne v15, v4, :cond_d

    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_d
    invoke-static {v13}, LB0/g;->f(LR/e;)Lc0/l;

    .line 193
    .line 194
    .line 195
    move-result-object v10

    .line 196
    goto :goto_2

    .line 197
    :cond_e
    iget-object v7, v7, Lc0/l;->u:Lc0/l;

    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_f
    invoke-virtual {v8}, LB0/L;->s()LB0/L;

    .line 201
    .line 202
    .line 203
    move-result-object v8

    .line 204
    if-eqz v8, :cond_10

    .line 205
    .line 206
    iget-object v7, v8, LB0/L;->U:LB0/g0;

    .line 207
    .line 208
    if-eqz v7, :cond_10

    .line 209
    .line 210
    iget-object v7, v7, LB0/g0;->d:LB0/B0;

    .line 211
    .line 212
    goto/16 :goto_0

    .line 213
    .line 214
    :cond_10
    move-object v7, v12

    .line 215
    goto/16 :goto_0

    .line 216
    .line 217
    :cond_11
    :goto_8
    iget-boolean v1, v1, Lkotlin/jvm/internal/u;->q:Z

    .line 218
    .line 219
    if-nez v1, :cond_15

    .line 220
    .line 221
    sget v1, Lv/y;->b:I

    .line 222
    .line 223
    invoke-static {v2}, LB0/g;->w(LB0/m;)Landroid/view/View;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    :goto_9
    if-eqz v1, :cond_13

    .line 232
    .line 233
    instance-of v6, v1, Landroid/view/ViewGroup;

    .line 234
    .line 235
    if-eqz v6, :cond_13

    .line 236
    .line 237
    check-cast v1, Landroid/view/ViewGroup;

    .line 238
    .line 239
    invoke-virtual {v1}, Landroid/view/ViewGroup;->shouldDelayChildPressedState()Z

    .line 240
    .line 241
    .line 242
    move-result v6

    .line 243
    if-eqz v6, :cond_12

    .line 244
    .line 245
    move v1, v4

    .line 246
    goto :goto_a

    .line 247
    :cond_12
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    goto :goto_9

    .line 252
    :cond_13
    const/4 v1, 0x0

    .line 253
    :goto_a
    if-eqz v1, :cond_14

    .line 254
    .line 255
    goto :goto_b

    .line 256
    :cond_14
    const/4 v9, 0x0

    .line 257
    goto :goto_c

    .line 258
    :cond_15
    :goto_b
    move v9, v4

    .line 259
    :goto_c
    if-eqz v9, :cond_16

    .line 260
    .line 261
    sget-wide v6, Lv/y;->a:J

    .line 262
    .line 263
    iput v4, v0, Lv/c;->r:I

    .line 264
    .line 265
    invoke-static {v6, v7, v0}, LM5/y;->h(JLs5/c;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    if-ne v1, v5, :cond_16

    .line 270
    .line 271
    goto :goto_e

    .line 272
    :cond_16
    :goto_d
    new-instance v1, Ly/k;

    .line 273
    .line 274
    iget-wide v6, v0, Lv/c;->t:J

    .line 275
    .line 276
    invoke-direct {v1, v6, v7}, Ly/k;-><init>(J)V

    .line 277
    .line 278
    .line 279
    iput-object v1, v0, Lv/c;->q:Ly/k;

    .line 280
    .line 281
    iput v3, v0, Lv/c;->r:I

    .line 282
    .line 283
    iget-object v3, v0, Lv/c;->u:Ly/i;

    .line 284
    .line 285
    invoke-virtual {v3, v1, v0}, Ly/i;->a(Ly/h;Ls5/c;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    if-ne v3, v5, :cond_17

    .line 290
    .line 291
    :goto_e
    return-object v5

    .line 292
    :cond_17
    :goto_f
    iput-object v1, v2, Lv/x;->O:Ly/k;

    .line 293
    .line 294
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 295
    .line 296
    return-object v1
.end method
