.class public abstract Lu/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lu/m;

.field public static final b:Lu/n;

.field public static final c:Lu/o;

.field public static final d:Lu/p;

.field public static final e:Lu/m;

.field public static final f:Lu/n;

.field public static final g:Lu/o;

.field public static final h:Lu/p;

.field public static final i:[F


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lu/m;

    .line 2
    .line 3
    const/high16 v1, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lu/m;-><init>(F)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lu/d;->a:Lu/m;

    .line 9
    .line 10
    new-instance v0, Lu/n;

    .line 11
    .line 12
    invoke-direct {v0, v1, v1}, Lu/n;-><init>(FF)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lu/d;->b:Lu/n;

    .line 16
    .line 17
    new-instance v0, Lu/o;

    .line 18
    .line 19
    invoke-direct {v0, v1, v1, v1}, Lu/o;-><init>(FFF)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lu/d;->c:Lu/o;

    .line 23
    .line 24
    new-instance v0, Lu/p;

    .line 25
    .line 26
    invoke-direct {v0, v1, v1, v1, v1}, Lu/p;-><init>(FFFF)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lu/d;->d:Lu/p;

    .line 30
    .line 31
    new-instance v0, Lu/m;

    .line 32
    .line 33
    const/high16 v1, -0x800000    # Float.NEGATIVE_INFINITY

    .line 34
    .line 35
    invoke-direct {v0, v1}, Lu/m;-><init>(F)V

    .line 36
    .line 37
    .line 38
    sput-object v0, Lu/d;->e:Lu/m;

    .line 39
    .line 40
    new-instance v0, Lu/n;

    .line 41
    .line 42
    invoke-direct {v0, v1, v1}, Lu/n;-><init>(FF)V

    .line 43
    .line 44
    .line 45
    sput-object v0, Lu/d;->f:Lu/n;

    .line 46
    .line 47
    new-instance v0, Lu/o;

    .line 48
    .line 49
    invoke-direct {v0, v1, v1, v1}, Lu/o;-><init>(FFF)V

    .line 50
    .line 51
    .line 52
    sput-object v0, Lu/d;->g:Lu/o;

    .line 53
    .line 54
    new-instance v0, Lu/p;

    .line 55
    .line 56
    invoke-direct {v0, v1, v1, v1, v1}, Lu/p;-><init>(FFFF)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lu/d;->h:Lu/p;

    .line 60
    .line 61
    const/16 v0, 0x5b

    .line 62
    .line 63
    new-array v0, v0, [F

    .line 64
    .line 65
    sput-object v0, Lu/d;->i:[F

    .line 66
    .line 67
    return-void
.end method

.method public static a(FFI)Lu/l;
    .locals 9

    .line 1
    and-int/lit8 p2, p2, 0x2

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    new-instance v0, Lu/l;

    .line 7
    .line 8
    sget-object v1, Lu/A0;->a:LZ/m;

    .line 9
    .line 10
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    new-instance v3, Lu/m;

    .line 15
    .line 16
    invoke-direct {v3, p1}, Lu/m;-><init>(F)V

    .line 17
    .line 18
    .line 19
    const-wide/high16 v4, -0x8000000000000000L

    .line 20
    .line 21
    const-wide/high16 v6, -0x8000000000000000L

    .line 22
    .line 23
    const/4 v8, 0x0

    .line 24
    invoke-direct/range {v0 .. v8}, Lu/l;-><init>(LZ/m;Ljava/lang/Object;Lu/q;JJZ)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public static final b(FFFLu/k;LB5/e;Ls5/i;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object v2, Lu/A0;->a:LZ/m;

    .line 2
    .line 3
    new-instance v3, Ljava/lang/Float;

    .line 4
    .line 5
    invoke-direct {v3, p0}, Ljava/lang/Float;-><init>(F)V

    .line 6
    .line 7
    .line 8
    new-instance v4, Ljava/lang/Float;

    .line 9
    .line 10
    invoke-direct {v4, p1}, Ljava/lang/Float;-><init>(F)V

    .line 11
    .line 12
    .line 13
    new-instance p0, Ljava/lang/Float;

    .line 14
    .line 15
    invoke-direct {p0, p2}, Ljava/lang/Float;-><init>(F)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    new-instance v5, Lu/m;

    .line 23
    .line 24
    invoke-direct {v5, p0}, Lu/m;-><init>(F)V

    .line 25
    .line 26
    .line 27
    new-instance v0, Lu/n0;

    .line 28
    .line 29
    move-object v1, p3

    .line 30
    invoke-direct/range {v0 .. v5}, Lu/n0;-><init>(Lu/k;LZ/m;Ljava/lang/Object;Ljava/lang/Object;Lu/q;)V

    .line 31
    .line 32
    .line 33
    new-instance v6, Lu/l;

    .line 34
    .line 35
    const/16 p0, 0x38

    .line 36
    .line 37
    invoke-direct {v6, v2, v3, v5, p0}, Lu/l;-><init>(LZ/m;Ljava/lang/Object;Lu/q;I)V

    .line 38
    .line 39
    .line 40
    new-instance v10, LC0/Q0;

    .line 41
    .line 42
    const/4 p0, 0x1

    .line 43
    move-object/from16 p1, p4

    .line 44
    .line 45
    invoke-direct {v10, p1, p0}, LC0/Q0;-><init>(LB5/e;I)V

    .line 46
    .line 47
    .line 48
    const-wide/high16 v8, -0x8000000000000000L

    .line 49
    .line 50
    move-object/from16 v11, p5

    .line 51
    .line 52
    move-object v7, v0

    .line 53
    invoke-static/range {v6 .. v11}, Lu/d;->c(Lu/l;Lu/h;JLB5/c;Ls5/c;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 58
    .line 59
    sget-object p2, Lr5/a;->q:Lr5/a;

    .line 60
    .line 61
    if-ne p0, p2, :cond_0

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    move-object p0, p1

    .line 65
    :goto_0
    if-ne p0, p2, :cond_1

    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_1
    return-object p1
.end method

.method public static final c(Lu/l;Lu/h;JLB5/c;Ls5/c;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v3, p1

    .line 2
    .line 3
    move-object/from16 v0, p5

    .line 4
    .line 5
    instance-of v1, v0, Lu/i0;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    check-cast v1, Lu/i0;

    .line 11
    .line 12
    iget v2, v1, Lu/i0;->v:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v2, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v2, v4

    .line 21
    iput v2, v1, Lu/i0;->v:I

    .line 22
    .line 23
    :goto_0
    move-object v8, v1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v1, Lu/i0;

    .line 26
    .line 27
    invoke-direct {v1, v0}, Ls5/c;-><init>(Lq5/c;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v0, v8, Lu/i0;->u:Ljava/lang/Object;

    .line 32
    .line 33
    iget v1, v8, Lu/i0;->v:I

    .line 34
    .line 35
    const/4 v9, 0x2

    .line 36
    const/4 v10, 0x1

    .line 37
    sget-object v11, Lr5/a;->q:Lr5/a;

    .line 38
    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    if-eq v1, v10, :cond_2

    .line 42
    .line 43
    if-ne v1, v9, :cond_1

    .line 44
    .line 45
    iget-object v1, v8, Lu/i0;->t:Lkotlin/jvm/internal/y;

    .line 46
    .line 47
    iget-object v2, v8, Lu/i0;->s:LB5/c;

    .line 48
    .line 49
    iget-object v3, v8, Lu/i0;->r:Lu/h;

    .line 50
    .line 51
    iget-object v4, v8, Lu/i0;->q:Lu/l;

    .line 52
    .line 53
    :goto_2
    :try_start_0
    invoke-static {v0}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    .line 55
    .line 56
    goto/16 :goto_8

    .line 57
    .line 58
    :catch_0
    move-exception v0

    .line 59
    goto/16 :goto_b

    .line 60
    .line 61
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v0

    .line 69
    :cond_2
    iget-object v1, v8, Lu/i0;->t:Lkotlin/jvm/internal/y;

    .line 70
    .line 71
    iget-object v2, v8, Lu/i0;->s:LB5/c;

    .line 72
    .line 73
    iget-object v3, v8, Lu/i0;->r:Lu/h;

    .line 74
    .line 75
    iget-object v4, v8, Lu/i0;->q:Lu/l;

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_3
    invoke-static {v0}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    const-wide/16 v0, 0x0

    .line 82
    .line 83
    invoke-interface {v3, v0, v1}, Lu/h;->b(J)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v13

    .line 87
    invoke-interface {v3, v0, v1}, Lu/h;->f(J)Lu/q;

    .line 88
    .line 89
    .line 90
    move-result-object v15

    .line 91
    new-instance v1, Lkotlin/jvm/internal/y;

    .line 92
    .line 93
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 94
    .line 95
    .line 96
    const-wide/high16 v4, -0x8000000000000000L

    .line 97
    .line 98
    cmp-long v0, p2, v4

    .line 99
    .line 100
    if-nez v0, :cond_6

    .line 101
    .line 102
    :try_start_1
    invoke-interface {v8}, Lq5/c;->getContext()Lq5/h;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-static {v0}, Lu/d;->m(Lq5/h;)F

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    new-instance v0, Lu/k0;
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_3

    .line 111
    .line 112
    move-object/from16 v5, p0

    .line 113
    .line 114
    move-object/from16 v7, p4

    .line 115
    .line 116
    move-object v2, v13

    .line 117
    move-object v4, v15

    .line 118
    :try_start_2
    invoke-direct/range {v0 .. v7}, Lu/k0;-><init>(Lkotlin/jvm/internal/y;Ljava/lang/Object;Lu/h;Lu/q;Lu/l;FLB5/c;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_2

    .line 119
    .line 120
    .line 121
    move-object v7, v1

    .line 122
    :try_start_3
    iput-object v5, v8, Lu/i0;->q:Lu/l;

    .line 123
    .line 124
    iput-object v3, v8, Lu/i0;->r:Lu/h;

    .line 125
    .line 126
    move-object/from16 v6, p4

    .line 127
    .line 128
    iput-object v6, v8, Lu/i0;->s:LB5/c;

    .line 129
    .line 130
    iput-object v7, v8, Lu/i0;->t:Lkotlin/jvm/internal/y;

    .line 131
    .line 132
    iput v10, v8, Lu/i0;->v:I

    .line 133
    .line 134
    invoke-interface {v3}, Lu/h;->a()Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-eqz v1, :cond_4

    .line 139
    .line 140
    invoke-static {v0, v8}, Lu/d;->r(LB5/c;Ls5/c;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    goto :goto_3

    .line 145
    :cond_4
    new-instance v1, La0/m;

    .line 146
    .line 147
    const/4 v2, 0x1

    .line 148
    invoke-direct {v1, v0, v2}, La0/m;-><init>(LB5/c;I)V

    .line 149
    .line 150
    .line 151
    invoke-interface {v8}, Lq5/c;->getContext()Lq5/h;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-static {v0}, LP/b;->o(Lq5/h;)LP/T;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-interface {v0, v1, v8}, LP/T;->e(LB5/c;Ls5/c;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v0
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_1

    .line 163
    :goto_3
    if-ne v0, v11, :cond_5

    .line 164
    .line 165
    goto/16 :goto_a

    .line 166
    .line 167
    :cond_5
    move-object v4, v5

    .line 168
    move-object v2, v6

    .line 169
    goto :goto_7

    .line 170
    :goto_4
    move-object v4, v5

    .line 171
    :goto_5
    move-object v1, v7

    .line 172
    goto/16 :goto_b

    .line 173
    .line 174
    :catch_1
    move-exception v0

    .line 175
    goto :goto_4

    .line 176
    :catch_2
    move-exception v0

    .line 177
    :goto_6
    move-object v7, v1

    .line 178
    move-object v4, v5

    .line 179
    goto/16 :goto_b

    .line 180
    .line 181
    :catch_3
    move-exception v0

    .line 182
    move-object/from16 v5, p0

    .line 183
    .line 184
    goto :goto_6

    .line 185
    :cond_6
    move-object/from16 v5, p0

    .line 186
    .line 187
    move-object/from16 v6, p4

    .line 188
    .line 189
    move-object v7, v1

    .line 190
    :try_start_4
    new-instance v12, Lu/j;

    .line 191
    .line 192
    invoke-interface {v3}, Lu/h;->d()LZ/m;

    .line 193
    .line 194
    .line 195
    move-result-object v14

    .line 196
    invoke-interface {v3}, Lu/h;->e()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v18

    .line 200
    new-instance v0, Lu/j0;

    .line 201
    .line 202
    const/4 v1, 0x1

    .line 203
    invoke-direct {v0, v5, v1}, Lu/j0;-><init>(Lu/l;I)V

    .line 204
    .line 205
    .line 206
    move-wide/from16 v19, p2

    .line 207
    .line 208
    move-wide/from16 v16, p2

    .line 209
    .line 210
    move-object/from16 v21, v0

    .line 211
    .line 212
    invoke-direct/range {v12 .. v21}, Lu/j;-><init>(Ljava/lang/Object;LZ/m;Lu/q;JLjava/lang/Object;JLB5/a;)V

    .line 213
    .line 214
    .line 215
    invoke-interface {v8}, Lq5/c;->getContext()Lq5/h;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-static {v0}, Lu/d;->m(Lq5/h;)F

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    move-wide/from16 v1, p2

    .line 224
    .line 225
    move-object v4, v3

    .line 226
    move v3, v0

    .line 227
    move-object v0, v12

    .line 228
    invoke-static/range {v0 .. v6}, Lu/d;->l(Lu/j;JFLu/h;Lu/l;LB5/c;)V

    .line 229
    .line 230
    .line 231
    move-object v12, v0

    .line 232
    iput-object v12, v7, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_5

    .line 233
    .line 234
    move-object/from16 v4, p0

    .line 235
    .line 236
    move-object/from16 v3, p1

    .line 237
    .line 238
    move-object/from16 v2, p4

    .line 239
    .line 240
    :goto_7
    move-object v1, v7

    .line 241
    :cond_7
    :goto_8
    :try_start_5
    iget-object v0, v1, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 242
    .line 243
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    check-cast v0, Lu/j;

    .line 247
    .line 248
    iget-object v0, v0, Lu/j;->i:LP/f0;

    .line 249
    .line 250
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    check-cast v0, Ljava/lang/Boolean;

    .line 255
    .line 256
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    if-eqz v0, :cond_9

    .line 261
    .line 262
    invoke-interface {v8}, Lq5/c;->getContext()Lq5/h;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-static {v0}, Lu/d;->m(Lq5/h;)F

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    new-instance v5, Lu/l0;
    :try_end_5
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_0

    .line 271
    .line 272
    move/from16 p2, v0

    .line 273
    .line 274
    move-object/from16 p1, v1

    .line 275
    .line 276
    move-object/from16 p5, v2

    .line 277
    .line 278
    move-object/from16 p3, v3

    .line 279
    .line 280
    move-object/from16 p4, v4

    .line 281
    .line 282
    move-object/from16 p0, v5

    .line 283
    .line 284
    :try_start_6
    invoke-direct/range {p0 .. p5}, Lu/l0;-><init>(Lkotlin/jvm/internal/y;FLu/h;Lu/l;LB5/c;)V
    :try_end_6
    .catch Ljava/util/concurrent/CancellationException; {:try_start_6 .. :try_end_6} :catch_4

    .line 285
    .line 286
    .line 287
    move-object/from16 v0, p0

    .line 288
    .line 289
    move-object/from16 v1, p1

    .line 290
    .line 291
    move-object/from16 v3, p3

    .line 292
    .line 293
    move-object/from16 v4, p4

    .line 294
    .line 295
    move-object/from16 v2, p5

    .line 296
    .line 297
    :try_start_7
    iput-object v4, v8, Lu/i0;->q:Lu/l;

    .line 298
    .line 299
    iput-object v3, v8, Lu/i0;->r:Lu/h;

    .line 300
    .line 301
    iput-object v2, v8, Lu/i0;->s:LB5/c;

    .line 302
    .line 303
    iput-object v1, v8, Lu/i0;->t:Lkotlin/jvm/internal/y;

    .line 304
    .line 305
    iput v9, v8, Lu/i0;->v:I

    .line 306
    .line 307
    invoke-interface {v3}, Lu/h;->a()Z

    .line 308
    .line 309
    .line 310
    move-result v5

    .line 311
    if-eqz v5, :cond_8

    .line 312
    .line 313
    invoke-static {v0, v8}, Lu/d;->r(LB5/c;Ls5/c;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    goto :goto_9

    .line 318
    :cond_8
    new-instance v5, La0/m;

    .line 319
    .line 320
    const/4 v6, 0x1

    .line 321
    invoke-direct {v5, v0, v6}, La0/m;-><init>(LB5/c;I)V

    .line 322
    .line 323
    .line 324
    invoke-interface {v8}, Lq5/c;->getContext()Lq5/h;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    invoke-static {v0}, LP/b;->o(Lq5/h;)LP/T;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    invoke-interface {v0, v5, v8}, LP/T;->e(LB5/c;Ls5/c;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v0
    :try_end_7
    .catch Ljava/util/concurrent/CancellationException; {:try_start_7 .. :try_end_7} :catch_0

    .line 336
    :goto_9
    if-ne v0, v11, :cond_7

    .line 337
    .line 338
    :goto_a
    return-object v11

    .line 339
    :catch_4
    move-exception v0

    .line 340
    move-object/from16 v1, p1

    .line 341
    .line 342
    move-object/from16 v4, p4

    .line 343
    .line 344
    goto :goto_b

    .line 345
    :cond_9
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 346
    .line 347
    return-object v0

    .line 348
    :catch_5
    move-exception v0

    .line 349
    move-object/from16 v4, p0

    .line 350
    .line 351
    goto/16 :goto_5

    .line 352
    .line 353
    :goto_b
    iget-object v2, v1, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 354
    .line 355
    check-cast v2, Lu/j;

    .line 356
    .line 357
    if-nez v2, :cond_a

    .line 358
    .line 359
    goto :goto_c

    .line 360
    :cond_a
    iget-object v2, v2, Lu/j;->i:LP/f0;

    .line 361
    .line 362
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 363
    .line 364
    invoke-virtual {v2, v3}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    :goto_c
    iget-object v1, v1, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 368
    .line 369
    check-cast v1, Lu/j;

    .line 370
    .line 371
    if-eqz v1, :cond_b

    .line 372
    .line 373
    iget-wide v1, v1, Lu/j;->g:J

    .line 374
    .line 375
    iget-wide v5, v4, Lu/l;->t:J

    .line 376
    .line 377
    cmp-long v1, v1, v5

    .line 378
    .line 379
    if-nez v1, :cond_b

    .line 380
    .line 381
    const/4 v1, 0x0

    .line 382
    iput-boolean v1, v4, Lu/l;->v:Z

    .line 383
    .line 384
    :cond_b
    throw v0
.end method

.method public static synthetic d(FFLu/k;LB5/e;Ls5/i;I)Ljava/lang/Object;
    .locals 6

    .line 1
    and-int/lit8 p5, p5, 0x8

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x7

    .line 6
    const/4 p5, 0x0

    .line 7
    invoke-static {p2, p5}, Lu/d;->o(ILjava/lang/Object;)Lu/f0;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    :cond_0
    move-object v3, p2

    .line 12
    const/4 v2, 0x0

    .line 13
    move v0, p0

    .line 14
    move v1, p1

    .line 15
    move-object v4, p3

    .line 16
    move-object v5, p4

    .line 17
    invoke-static/range {v0 .. v5}, Lu/d;->b(FFFLu/k;LB5/e;Ls5/i;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public static final e(Lu/l;Lu/v;ZLB5/c;Ls5/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lu/l;->r:LP/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lu/l;->s:Lu/q;

    .line 8
    .line 9
    iget-object v2, p0, Lu/l;->q:LZ/m;

    .line 10
    .line 11
    new-instance v4, Lu/u;

    .line 12
    .line 13
    invoke-direct {v4, p1, v2, v0, v1}, Lu/u;-><init>(Lu/v;LZ/m;Ljava/lang/Object;Lu/q;)V

    .line 14
    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    iget-wide p1, p0, Lu/l;->t:J

    .line 19
    .line 20
    :goto_0
    move-object v3, p0

    .line 21
    move-wide v5, p1

    .line 22
    move-object v7, p3

    .line 23
    move-object v8, p4

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    const-wide/high16 p1, -0x8000000000000000L

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :goto_1
    invoke-static/range {v3 .. v8}, Lu/d;->c(Lu/l;Lu/h;JLB5/c;Ls5/c;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    sget-object p1, Lr5/a;->q:Lr5/a;

    .line 33
    .line 34
    if-ne p0, p1, :cond_1

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_1
    sget-object p0, Lm5/y;->a:Lm5/y;

    .line 38
    .line 39
    return-object p0
.end method

.method public static final f(Lu/H;FLu/D;LP/o;)Lu/E;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 3
    .line 4
    .line 5
    move-result-object v2

    .line 6
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    sget-object v4, Lu/A0;->a:LZ/m;

    .line 11
    .line 12
    const v7, 0x81b8

    .line 13
    .line 14
    .line 15
    const/4 v8, 0x0

    .line 16
    move-object v1, p0

    .line 17
    move-object v5, p2

    .line 18
    move-object v6, p3

    .line 19
    invoke-static/range {v1 .. v8}, Lu/d;->i(Lu/H;Ljava/lang/Number;Ljava/lang/Number;LZ/m;Lu/D;LP/o;II)Lu/E;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public static final g(Lu/l;Ljava/lang/Float;Lu/k;ZLB5/c;Ls5/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lu/l;->r:LP/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v4

    .line 7
    iget-object v3, p0, Lu/l;->q:LZ/m;

    .line 8
    .line 9
    iget-object v6, p0, Lu/l;->s:Lu/q;

    .line 10
    .line 11
    new-instance v1, Lu/n0;

    .line 12
    .line 13
    move-object v5, p1

    .line 14
    move-object v2, p2

    .line 15
    invoke-direct/range {v1 .. v6}, Lu/n0;-><init>(Lu/k;LZ/m;Ljava/lang/Object;Ljava/lang/Object;Lu/q;)V

    .line 16
    .line 17
    .line 18
    move-object p1, v1

    .line 19
    if-eqz p3, :cond_0

    .line 20
    .line 21
    iget-wide p2, p0, Lu/l;->t:J

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-wide/high16 p2, -0x8000000000000000L

    .line 25
    .line 26
    :goto_0
    invoke-static/range {p0 .. p5}, Lu/d;->c(Lu/l;Lu/h;JLB5/c;Ls5/c;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    sget-object p1, Lr5/a;->q:Lr5/a;

    .line 31
    .line 32
    if-ne p0, p1, :cond_1

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_1
    sget-object p0, Lm5/y;->a:Lm5/y;

    .line 36
    .line 37
    return-object p0
.end method

.method public static synthetic h(Lu/l;Ljava/lang/Float;Lu/f0;Ls5/i;)Ljava/lang/Object;
    .locals 6

    .line 1
    const/4 v3, 0x1

    .line 2
    sget-object v4, Lu/m0;->r:Lu/m0;

    .line 3
    .line 4
    move-object v0, p0

    .line 5
    move-object v1, p1

    .line 6
    move-object v2, p2

    .line 7
    move-object v5, p3

    .line 8
    invoke-static/range {v0 .. v5}, Lu/d;->g(Lu/l;Ljava/lang/Float;Lu/k;ZLB5/c;Ls5/c;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public static final i(Lu/H;Ljava/lang/Number;Ljava/lang/Number;LZ/m;Lu/D;LP/o;II)Lu/E;
    .locals 12

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    move/from16 v1, p6

    .line 4
    .line 5
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    sget-object v3, LP/k;->a:LP/S;

    .line 10
    .line 11
    if-ne v2, v3, :cond_0

    .line 12
    .line 13
    new-instance v4, Lu/E;

    .line 14
    .line 15
    move-object v5, p0

    .line 16
    move-object v6, p1

    .line 17
    move-object v7, p2

    .line 18
    move-object v8, p3

    .line 19
    move-object/from16 v9, p4

    .line 20
    .line 21
    invoke-direct/range {v4 .. v9}, Lu/E;-><init>(Lu/H;Ljava/lang/Number;Ljava/lang/Number;LZ/m;Lu/D;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v4}, LP/o;->d0(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    move-object v2, v4

    .line 28
    :cond_0
    move-object v8, v2

    .line 29
    check-cast v8, Lu/E;

    .line 30
    .line 31
    const v2, 0xe000

    .line 32
    .line 33
    .line 34
    and-int/2addr v2, v1

    .line 35
    xor-int/lit16 v2, v2, 0x6000

    .line 36
    .line 37
    const/16 v4, 0x4000

    .line 38
    .line 39
    move-object/from16 v9, p4

    .line 40
    .line 41
    if-le v2, v4, :cond_1

    .line 42
    .line 43
    invoke-virtual {v0, v9}, LP/o;->i(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_2

    .line 48
    .line 49
    :cond_1
    and-int/lit16 v1, v1, 0x6000

    .line 50
    .line 51
    if-ne v1, v4, :cond_3

    .line 52
    .line 53
    :cond_2
    const/4 v1, 0x1

    .line 54
    goto :goto_0

    .line 55
    :cond_3
    const/4 v1, 0x0

    .line 56
    :goto_0
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    if-nez v1, :cond_4

    .line 61
    .line 62
    if-ne v2, v3, :cond_5

    .line 63
    .line 64
    :cond_4
    new-instance v6, LM/S;

    .line 65
    .line 66
    const/4 v11, 0x3

    .line 67
    move-object v7, p1

    .line 68
    move-object v10, v9

    .line 69
    move-object v9, p2

    .line 70
    invoke-direct/range {v6 .. v11}, LM/S;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v6}, LP/o;->d0(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    move-object v2, v6

    .line 77
    :cond_5
    check-cast v2, LB5/a;

    .line 78
    .line 79
    invoke-static {v2, v0}, LP/b;->g(LB5/a;LP/o;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, p0}, LP/o;->i(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    if-nez v1, :cond_6

    .line 91
    .line 92
    if-ne v2, v3, :cond_7

    .line 93
    .line 94
    :cond_6
    new-instance v2, LA/Y;

    .line 95
    .line 96
    const/16 v1, 0x19

    .line 97
    .line 98
    invoke-direct {v2, v1, p0, v8}, LA/Y;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v2}, LP/o;->d0(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_7
    check-cast v2, LB5/c;

    .line 105
    .line 106
    invoke-static {v8, v2, v0}, LP/b;->c(Ljava/lang/Object;LB5/c;LP/o;)V

    .line 107
    .line 108
    .line 109
    return-object v8
.end method

.method public static final j(Lu/q;)Lu/q;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lu/q;->c()Lu/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lu/q;->b()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, v2}, Lu/q;->a(I)F

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    invoke-virtual {v0, v2, v3}, Lu/q;->e(IF)V

    .line 17
    .line 18
    .line 19
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-object v0
.end method

.method public static k(Lu/l;FFI)Lu/l;
    .locals 9

    .line 1
    and-int/lit8 v0, p3, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lu/l;->r:LP/f0;

    .line 6
    .line 7
    invoke-virtual {p1}, LP/f0;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/lang/Number;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 18
    .line 19
    if-eqz p3, :cond_1

    .line 20
    .line 21
    iget-object p2, p0, Lu/l;->s:Lu/q;

    .line 22
    .line 23
    check-cast p2, Lu/m;

    .line 24
    .line 25
    iget p2, p2, Lu/m;->a:F

    .line 26
    .line 27
    :cond_1
    iget-wide v4, p0, Lu/l;->t:J

    .line 28
    .line 29
    iget-wide v6, p0, Lu/l;->u:J

    .line 30
    .line 31
    iget-boolean v8, p0, Lu/l;->v:Z

    .line 32
    .line 33
    new-instance v0, Lu/l;

    .line 34
    .line 35
    iget-object v1, p0, Lu/l;->q:LZ/m;

    .line 36
    .line 37
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    new-instance v3, Lu/m;

    .line 42
    .line 43
    invoke-direct {v3, p2}, Lu/m;-><init>(F)V

    .line 44
    .line 45
    .line 46
    invoke-direct/range {v0 .. v8}, Lu/l;-><init>(LZ/m;Ljava/lang/Object;Lu/q;JJZ)V

    .line 47
    .line 48
    .line 49
    return-object v0
.end method

.method public static final l(Lu/j;JFLu/h;Lu/l;LB5/c;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v0, p3, v0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    invoke-interface {p4}, Lu/h;->c()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-wide v0, p0, Lu/j;->c:J

    .line 12
    .line 13
    sub-long v0, p1, v0

    .line 14
    .line 15
    long-to-float v0, v0

    .line 16
    div-float/2addr v0, p3

    .line 17
    float-to-long v0, v0

    .line 18
    :goto_0
    iput-wide p1, p0, Lu/j;->g:J

    .line 19
    .line 20
    invoke-interface {p4, v0, v1}, Lu/h;->b(J)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object p2, p0, Lu/j;->e:LP/f0;

    .line 25
    .line 26
    invoke-virtual {p2, p1}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p4, v0, v1}, Lu/h;->f(J)Lu/q;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lu/j;->f:Lu/q;

    .line 34
    .line 35
    invoke-interface {p4, v0, v1}, Lu/h;->g(J)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    iget-wide p1, p0, Lu/j;->g:J

    .line 42
    .line 43
    iput-wide p1, p0, Lu/j;->h:J

    .line 44
    .line 45
    iget-object p1, p0, Lu/j;->i:LP/f0;

    .line 46
    .line 47
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {p1, p2}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-static {p0, p5}, Lu/d;->q(Lu/j;Lu/l;)V

    .line 53
    .line 54
    .line 55
    invoke-interface {p6, p0}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public static final m(Lq5/h;)F
    .locals 1

    .line 1
    sget-object v0, Lc0/b;->D:Lc0/b;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lq5/h;->get(Lq5/g;)Lq5/f;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lc0/p;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Lc0/p;->K()F

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/high16 p0, 0x3f800000    # 1.0f

    .line 17
    .line 18
    :goto_0
    const/4 v0, 0x0

    .line 19
    cmpl-float v0, p0, v0

    .line 20
    .line 21
    if-ltz v0, :cond_1

    .line 22
    .line 23
    return p0

    .line 24
    :cond_1
    const-string v0, "negative scale factor"

    .line 25
    .line 26
    invoke-static {v0}, Lu/P;->b(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return p0
.end method

.method public static n(Lu/w;)Lu/D;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    int-to-long v0, v0

    .line 3
    new-instance v2, Lu/D;

    .line 4
    .line 5
    invoke-direct {v2, p0, v0, v1}, Lu/D;-><init>(Lu/w;J)V

    .line 6
    .line 7
    .line 8
    return-object v2
.end method

.method public static o(ILjava/lang/Object;)Lu/f0;
    .locals 1

    .line 1
    and-int/lit8 v0, p0, 0x2

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const v0, 0x44bb8000    # 1500.0f

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/high16 v0, 0x43c80000    # 400.0f

    .line 10
    .line 11
    :goto_0
    and-int/lit8 p0, p0, 0x4

    .line 12
    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    :cond_1
    new-instance p0, Lu/f0;

    .line 17
    .line 18
    invoke-direct {p0, v0, p1}, Lu/f0;-><init>(FLjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-object p0
.end method

.method public static p(IILu/x;)Lu/z0;
    .locals 1

    .line 1
    and-int/lit8 v0, p1, 0x2

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/16 v0, 0x5a

    .line 8
    .line 9
    :goto_0
    and-int/lit8 p1, p1, 0x4

    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    sget-object p2, Lu/y;->a:Lu/t;

    .line 14
    .line 15
    :cond_1
    new-instance p1, Lu/z0;

    .line 16
    .line 17
    invoke-direct {p1, p0, v0, p2}, Lu/z0;-><init>(IILu/x;)V

    .line 18
    .line 19
    .line 20
    return-object p1
.end method

.method public static final q(Lu/j;Lu/l;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lu/j;->e:LP/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p1, Lu/l;->r:LP/f0;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p1, Lu/l;->s:Lu/q;

    .line 13
    .line 14
    iget-object v1, p0, Lu/j;->f:Lu/q;

    .line 15
    .line 16
    invoke-virtual {v0}, Lu/q;->b()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x0

    .line 21
    :goto_0
    if-ge v3, v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {v1, v3}, Lu/q;->a(I)F

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    invoke-virtual {v0, v3, v4}, Lu/q;->e(IF)V

    .line 28
    .line 29
    .line 30
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-wide v0, p0, Lu/j;->h:J

    .line 34
    .line 35
    iput-wide v0, p1, Lu/l;->u:J

    .line 36
    .line 37
    iget-wide v0, p0, Lu/j;->g:J

    .line 38
    .line 39
    iput-wide v0, p1, Lu/l;->t:J

    .line 40
    .line 41
    iget-object p0, p0, Lu/j;->i:LP/f0;

    .line 42
    .line 43
    invoke-virtual {p0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    iput-boolean p0, p1, Lu/l;->v:Z

    .line 54
    .line 55
    return-void
.end method

.method public static final r(LB5/c;Ls5/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-interface {p1}, Lq5/c;->getContext()Lq5/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LC0/E0;->q:LC0/E0;

    .line 6
    .line 7
    invoke-interface {v0, v1}, Lq5/h;->get(Lq5/g;)Lq5/f;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p1}, Lq5/c;->getContext()Lq5/h;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, LP/b;->o(Lq5/h;)LP/T;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0, p0, p1}, LP/T;->e(LB5/c;Ls5/c;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_0
    new-instance p0, Ljava/lang/ClassCastException;

    .line 27
    .line 28
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 29
    .line 30
    .line 31
    throw p0
.end method
