.class public final LC0/C0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB0/s0;


# instance fields
.field public A:LW0/c;

.field public B:LW0/l;

.field public final C:Ll0/b;

.field public D:I

.field public E:J

.field public F:Lj0/B;

.field public G:Z

.field public H:Z

.field public I:Z

.field public J:Z

.field public final K:LB0/a;

.field public q:Lm0/c;

.field public final r:Lj0/t;

.field public final s:LC0/A;

.field public t:LB5/e;

.field public u:LB5/a;

.field public v:J

.field public w:Z

.field public final x:[F

.field public y:[F

.field public z:Z


# direct methods
.method public constructor <init>(Lm0/c;Lj0/t;LC0/A;LB5/e;LB5/a;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LC0/C0;->q:Lm0/c;

    .line 5
    .line 6
    iput-object p2, p0, LC0/C0;->r:Lj0/t;

    .line 7
    .line 8
    iput-object p3, p0, LC0/C0;->s:LC0/A;

    .line 9
    .line 10
    iput-object p4, p0, LC0/C0;->t:LB5/e;

    .line 11
    .line 12
    iput-object p5, p0, LC0/C0;->u:LB5/a;

    .line 13
    .line 14
    const p1, 0x7fffffff

    .line 15
    .line 16
    .line 17
    int-to-long p1, p1

    .line 18
    const/16 p3, 0x20

    .line 19
    .line 20
    shl-long p3, p1, p3

    .line 21
    .line 22
    const-wide v0, 0xffffffffL

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    and-long/2addr p1, v0

    .line 28
    or-long/2addr p1, p3

    .line 29
    iput-wide p1, p0, LC0/C0;->v:J

    .line 30
    .line 31
    invoke-static {}, Lj0/B;->j()[F

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, LC0/C0;->x:[F

    .line 36
    .line 37
    invoke-static {}, Lcom/google/android/gms/internal/measurement/I1;->B()LW0/d;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, LC0/C0;->A:LW0/c;

    .line 42
    .line 43
    sget-object p1, LW0/l;->q:LW0/l;

    .line 44
    .line 45
    iput-object p1, p0, LC0/C0;->B:LW0/l;

    .line 46
    .line 47
    new-instance p1, Ll0/b;

    .line 48
    .line 49
    invoke-direct {p1}, Ll0/b;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, LC0/C0;->C:Ll0/b;

    .line 53
    .line 54
    sget-wide p1, Lj0/H;->b:J

    .line 55
    .line 56
    iput-wide p1, p0, LC0/C0;->E:J

    .line 57
    .line 58
    const/4 p1, 0x1

    .line 59
    iput-boolean p1, p0, LC0/C0;->I:Z

    .line 60
    .line 61
    new-instance p1, LB0/a;

    .line 62
    .line 63
    const/4 p2, 0x7

    .line 64
    invoke-direct {p1, p2, p0}, LB0/a;-><init>(ILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iput-object p1, p0, LC0/C0;->K:LB0/a;

    .line 68
    .line 69
    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, LC0/C0;->v:J

    .line 2
    .line 3
    invoke-static {p1, p2, v0, v1}, LW0/k;->a(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-wide p1, p0, LC0/C0;->v:J

    .line 10
    .line 11
    iget-boolean p1, p0, LC0/C0;->z:Z

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    iget-boolean p1, p0, LC0/C0;->w:Z

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, LC0/C0;->s:LC0/A;

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 22
    .line 23
    .line 24
    iget-boolean p2, p0, LC0/C0;->z:Z

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    if-eq v0, p2, :cond_0

    .line 28
    .line 29
    iput-boolean v0, p0, LC0/C0;->z:Z

    .line 30
    .line 31
    invoke-virtual {p1, p0, v0}, LC0/A;->B(LB0/s0;Z)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public final b(Li0/a;Z)V
    .locals 1

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, LC0/C0;->j()[F

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0}, LC0/C0;->k()[F

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    :goto_0
    iget-boolean v0, p0, LC0/C0;->I:Z

    .line 13
    .line 14
    if-nez v0, :cond_2

    .line 15
    .line 16
    if-nez p2, :cond_1

    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    iput p2, p1, Li0/a;->b:F

    .line 20
    .line 21
    iput p2, p1, Li0/a;->c:F

    .line 22
    .line 23
    iput p2, p1, Li0/a;->d:F

    .line 24
    .line 25
    iput p2, p1, Li0/a;->e:F

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    invoke-static {p2, p1}, Lj0/B;->p([FLi0/a;)V

    .line 29
    .line 30
    .line 31
    :cond_2
    return-void
.end method

.method public final c(Lj0/C;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v1, Lj0/C;->q:I

    .line 6
    .line 7
    iget v3, v0, LC0/C0;->D:I

    .line 8
    .line 9
    or-int/2addr v2, v3

    .line 10
    iget-object v3, v1, Lj0/C;->D:LW0/l;

    .line 11
    .line 12
    iput-object v3, v0, LC0/C0;->B:LW0/l;

    .line 13
    .line 14
    iget-object v3, v1, Lj0/C;->C:LW0/c;

    .line 15
    .line 16
    iput-object v3, v0, LC0/C0;->A:LW0/c;

    .line 17
    .line 18
    and-int/lit16 v3, v2, 0x1000

    .line 19
    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    iget-wide v4, v1, Lj0/C;->y:J

    .line 23
    .line 24
    iput-wide v4, v0, LC0/C0;->E:J

    .line 25
    .line 26
    :cond_0
    and-int/lit8 v4, v2, 0x1

    .line 27
    .line 28
    if-eqz v4, :cond_2

    .line 29
    .line 30
    iget-object v4, v0, LC0/C0;->q:Lm0/c;

    .line 31
    .line 32
    iget v5, v1, Lj0/C;->r:F

    .line 33
    .line 34
    iget-object v4, v4, Lm0/c;->a:Lm0/e;

    .line 35
    .line 36
    invoke-interface {v4}, Lm0/e;->a()F

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    cmpg-float v6, v6, v5

    .line 41
    .line 42
    if-nez v6, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-interface {v4, v5}, Lm0/e;->h(F)V

    .line 46
    .line 47
    .line 48
    :cond_2
    :goto_0
    and-int/lit8 v4, v2, 0x2

    .line 49
    .line 50
    if-eqz v4, :cond_4

    .line 51
    .line 52
    iget-object v4, v0, LC0/C0;->q:Lm0/c;

    .line 53
    .line 54
    iget v5, v1, Lj0/C;->s:F

    .line 55
    .line 56
    iget-object v4, v4, Lm0/c;->a:Lm0/e;

    .line 57
    .line 58
    invoke-interface {v4}, Lm0/e;->F()F

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    cmpg-float v6, v6, v5

    .line 63
    .line 64
    if-nez v6, :cond_3

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    invoke-interface {v4, v5}, Lm0/e;->l(F)V

    .line 68
    .line 69
    .line 70
    :cond_4
    :goto_1
    and-int/lit8 v4, v2, 0x4

    .line 71
    .line 72
    if-eqz v4, :cond_6

    .line 73
    .line 74
    iget-object v4, v0, LC0/C0;->q:Lm0/c;

    .line 75
    .line 76
    iget v5, v1, Lj0/C;->t:F

    .line 77
    .line 78
    iget-object v4, v4, Lm0/c;->a:Lm0/e;

    .line 79
    .line 80
    invoke-interface {v4}, Lm0/e;->c()F

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    cmpg-float v6, v6, v5

    .line 85
    .line 86
    if-nez v6, :cond_5

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_5
    invoke-interface {v4, v5}, Lm0/e;->e(F)V

    .line 90
    .line 91
    .line 92
    :cond_6
    :goto_2
    and-int/lit8 v4, v2, 0x8

    .line 93
    .line 94
    const/4 v5, 0x0

    .line 95
    if-eqz v4, :cond_8

    .line 96
    .line 97
    iget-object v4, v0, LC0/C0;->q:Lm0/c;

    .line 98
    .line 99
    iget-object v4, v4, Lm0/c;->a:Lm0/e;

    .line 100
    .line 101
    invoke-interface {v4}, Lm0/e;->t()F

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    cmpg-float v6, v6, v5

    .line 106
    .line 107
    if-nez v6, :cond_7

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_7
    invoke-interface {v4}, Lm0/e;->j()V

    .line 111
    .line 112
    .line 113
    :cond_8
    :goto_3
    and-int/lit8 v4, v2, 0x10

    .line 114
    .line 115
    if-eqz v4, :cond_a

    .line 116
    .line 117
    iget-object v4, v0, LC0/C0;->q:Lm0/c;

    .line 118
    .line 119
    iget-object v4, v4, Lm0/c;->a:Lm0/e;

    .line 120
    .line 121
    invoke-interface {v4}, Lm0/e;->o()F

    .line 122
    .line 123
    .line 124
    move-result v6

    .line 125
    cmpg-float v6, v6, v5

    .line 126
    .line 127
    if-nez v6, :cond_9

    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_9
    invoke-interface {v4}, Lm0/e;->f()V

    .line 131
    .line 132
    .line 133
    :cond_a
    :goto_4
    and-int/lit8 v4, v2, 0x20

    .line 134
    .line 135
    const/4 v6, 0x1

    .line 136
    if-eqz v4, :cond_c

    .line 137
    .line 138
    iget-object v4, v0, LC0/C0;->q:Lm0/c;

    .line 139
    .line 140
    iget v7, v1, Lj0/C;->u:F

    .line 141
    .line 142
    iget-object v8, v4, Lm0/c;->a:Lm0/e;

    .line 143
    .line 144
    invoke-interface {v8}, Lm0/e;->E()F

    .line 145
    .line 146
    .line 147
    move-result v9

    .line 148
    cmpg-float v9, v9, v7

    .line 149
    .line 150
    if-nez v9, :cond_b

    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_b
    invoke-interface {v8, v7}, Lm0/e;->b(F)V

    .line 154
    .line 155
    .line 156
    iput-boolean v6, v4, Lm0/c;->g:Z

    .line 157
    .line 158
    invoke-virtual {v4}, Lm0/c;->a()V

    .line 159
    .line 160
    .line 161
    :goto_5
    iget v4, v1, Lj0/C;->u:F

    .line 162
    .line 163
    cmpl-float v4, v4, v5

    .line 164
    .line 165
    if-lez v4, :cond_c

    .line 166
    .line 167
    iget-boolean v4, v0, LC0/C0;->J:Z

    .line 168
    .line 169
    if-nez v4, :cond_c

    .line 170
    .line 171
    iget-object v4, v0, LC0/C0;->u:LB5/a;

    .line 172
    .line 173
    if-eqz v4, :cond_c

    .line 174
    .line 175
    invoke-interface {v4}, LB5/a;->invoke()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    :cond_c
    and-int/lit8 v4, v2, 0x40

    .line 179
    .line 180
    if-eqz v4, :cond_d

    .line 181
    .line 182
    iget-object v4, v0, LC0/C0;->q:Lm0/c;

    .line 183
    .line 184
    iget-wide v7, v1, Lj0/C;->v:J

    .line 185
    .line 186
    iget-object v4, v4, Lm0/c;->a:Lm0/e;

    .line 187
    .line 188
    invoke-interface {v4}, Lm0/e;->J()J

    .line 189
    .line 190
    .line 191
    move-result-wide v9

    .line 192
    invoke-static {v7, v8, v9, v10}, Lj0/o;->c(JJ)Z

    .line 193
    .line 194
    .line 195
    move-result v9

    .line 196
    if-nez v9, :cond_d

    .line 197
    .line 198
    invoke-interface {v4, v7, v8}, Lm0/e;->q(J)V

    .line 199
    .line 200
    .line 201
    :cond_d
    and-int/lit16 v4, v2, 0x80

    .line 202
    .line 203
    if-eqz v4, :cond_e

    .line 204
    .line 205
    iget-object v4, v0, LC0/C0;->q:Lm0/c;

    .line 206
    .line 207
    iget-wide v7, v1, Lj0/C;->w:J

    .line 208
    .line 209
    iget-object v4, v4, Lm0/c;->a:Lm0/e;

    .line 210
    .line 211
    invoke-interface {v4}, Lm0/e;->p()J

    .line 212
    .line 213
    .line 214
    move-result-wide v9

    .line 215
    invoke-static {v7, v8, v9, v10}, Lj0/o;->c(JJ)Z

    .line 216
    .line 217
    .line 218
    move-result v9

    .line 219
    if-nez v9, :cond_e

    .line 220
    .line 221
    invoke-interface {v4, v7, v8}, Lm0/e;->z(J)V

    .line 222
    .line 223
    .line 224
    :cond_e
    and-int/lit16 v4, v2, 0x400

    .line 225
    .line 226
    if-eqz v4, :cond_10

    .line 227
    .line 228
    iget-object v4, v0, LC0/C0;->q:Lm0/c;

    .line 229
    .line 230
    iget-object v4, v4, Lm0/c;->a:Lm0/e;

    .line 231
    .line 232
    invoke-interface {v4}, Lm0/e;->G()F

    .line 233
    .line 234
    .line 235
    move-result v7

    .line 236
    cmpg-float v7, v7, v5

    .line 237
    .line 238
    if-nez v7, :cond_f

    .line 239
    .line 240
    goto :goto_6

    .line 241
    :cond_f
    invoke-interface {v4}, Lm0/e;->k()V

    .line 242
    .line 243
    .line 244
    :cond_10
    :goto_6
    and-int/lit16 v4, v2, 0x100

    .line 245
    .line 246
    if-eqz v4, :cond_12

    .line 247
    .line 248
    iget-object v4, v0, LC0/C0;->q:Lm0/c;

    .line 249
    .line 250
    iget-object v4, v4, Lm0/c;->a:Lm0/e;

    .line 251
    .line 252
    invoke-interface {v4}, Lm0/e;->w()F

    .line 253
    .line 254
    .line 255
    move-result v7

    .line 256
    cmpg-float v7, v7, v5

    .line 257
    .line 258
    if-nez v7, :cond_11

    .line 259
    .line 260
    goto :goto_7

    .line 261
    :cond_11
    invoke-interface {v4}, Lm0/e;->d()V

    .line 262
    .line 263
    .line 264
    :cond_12
    :goto_7
    and-int/lit16 v4, v2, 0x200

    .line 265
    .line 266
    if-eqz v4, :cond_14

    .line 267
    .line 268
    iget-object v4, v0, LC0/C0;->q:Lm0/c;

    .line 269
    .line 270
    iget-object v4, v4, Lm0/c;->a:Lm0/e;

    .line 271
    .line 272
    invoke-interface {v4}, Lm0/e;->D()F

    .line 273
    .line 274
    .line 275
    move-result v7

    .line 276
    cmpg-float v7, v7, v5

    .line 277
    .line 278
    if-nez v7, :cond_13

    .line 279
    .line 280
    goto :goto_8

    .line 281
    :cond_13
    invoke-interface {v4}, Lm0/e;->g()V

    .line 282
    .line 283
    .line 284
    :cond_14
    :goto_8
    and-int/lit16 v4, v2, 0x800

    .line 285
    .line 286
    if-eqz v4, :cond_16

    .line 287
    .line 288
    iget-object v4, v0, LC0/C0;->q:Lm0/c;

    .line 289
    .line 290
    iget v7, v1, Lj0/C;->x:F

    .line 291
    .line 292
    iget-object v4, v4, Lm0/c;->a:Lm0/e;

    .line 293
    .line 294
    invoke-interface {v4}, Lm0/e;->s()F

    .line 295
    .line 296
    .line 297
    move-result v8

    .line 298
    cmpg-float v8, v8, v7

    .line 299
    .line 300
    if-nez v8, :cond_15

    .line 301
    .line 302
    goto :goto_9

    .line 303
    :cond_15
    invoke-interface {v4, v7}, Lm0/e;->m(F)V

    .line 304
    .line 305
    .line 306
    :cond_16
    :goto_9
    const-wide v7, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    const-wide v9, 0xffffffffL

    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    const/16 v4, 0x20

    .line 317
    .line 318
    if-eqz v3, :cond_18

    .line 319
    .line 320
    iget-wide v11, v0, LC0/C0;->E:J

    .line 321
    .line 322
    sget-wide v13, Lj0/H;->b:J

    .line 323
    .line 324
    invoke-static {v11, v12, v13, v14}, Lj0/H;->a(JJ)Z

    .line 325
    .line 326
    .line 327
    move-result v3

    .line 328
    if-eqz v3, :cond_17

    .line 329
    .line 330
    iget-object v3, v0, LC0/C0;->q:Lm0/c;

    .line 331
    .line 332
    iget-wide v11, v3, Lm0/c;->v:J

    .line 333
    .line 334
    invoke-static {v11, v12, v7, v8}, Li0/b;->b(JJ)Z

    .line 335
    .line 336
    .line 337
    move-result v11

    .line 338
    if-nez v11, :cond_18

    .line 339
    .line 340
    iput-wide v7, v3, Lm0/c;->v:J

    .line 341
    .line 342
    iget-object v3, v3, Lm0/c;->a:Lm0/e;

    .line 343
    .line 344
    invoke-interface {v3, v7, v8}, Lm0/e;->I(J)V

    .line 345
    .line 346
    .line 347
    goto :goto_a

    .line 348
    :cond_17
    iget-object v3, v0, LC0/C0;->q:Lm0/c;

    .line 349
    .line 350
    iget-wide v11, v0, LC0/C0;->E:J

    .line 351
    .line 352
    invoke-static {v11, v12}, Lj0/H;->b(J)F

    .line 353
    .line 354
    .line 355
    move-result v11

    .line 356
    iget-wide v12, v0, LC0/C0;->v:J

    .line 357
    .line 358
    shr-long/2addr v12, v4

    .line 359
    long-to-int v12, v12

    .line 360
    int-to-float v12, v12

    .line 361
    mul-float/2addr v11, v12

    .line 362
    iget-wide v12, v0, LC0/C0;->E:J

    .line 363
    .line 364
    invoke-static {v12, v13}, Lj0/H;->c(J)F

    .line 365
    .line 366
    .line 367
    move-result v12

    .line 368
    iget-wide v13, v0, LC0/C0;->v:J

    .line 369
    .line 370
    and-long/2addr v13, v9

    .line 371
    long-to-int v13, v13

    .line 372
    int-to-float v13, v13

    .line 373
    mul-float/2addr v12, v13

    .line 374
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 375
    .line 376
    .line 377
    move-result v11

    .line 378
    int-to-long v13, v11

    .line 379
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 380
    .line 381
    .line 382
    move-result v11

    .line 383
    int-to-long v11, v11

    .line 384
    shl-long/2addr v13, v4

    .line 385
    and-long/2addr v11, v9

    .line 386
    or-long/2addr v11, v13

    .line 387
    iget-wide v13, v3, Lm0/c;->v:J

    .line 388
    .line 389
    invoke-static {v13, v14, v11, v12}, Li0/b;->b(JJ)Z

    .line 390
    .line 391
    .line 392
    move-result v13

    .line 393
    if-nez v13, :cond_18

    .line 394
    .line 395
    iput-wide v11, v3, Lm0/c;->v:J

    .line 396
    .line 397
    iget-object v3, v3, Lm0/c;->a:Lm0/e;

    .line 398
    .line 399
    invoke-interface {v3, v11, v12}, Lm0/e;->I(J)V

    .line 400
    .line 401
    .line 402
    :cond_18
    :goto_a
    and-int/lit16 v3, v2, 0x4000

    .line 403
    .line 404
    if-eqz v3, :cond_19

    .line 405
    .line 406
    iget-object v3, v0, LC0/C0;->q:Lm0/c;

    .line 407
    .line 408
    iget-boolean v11, v1, Lj0/C;->A:Z

    .line 409
    .line 410
    iget-boolean v12, v3, Lm0/c;->w:Z

    .line 411
    .line 412
    if-eq v12, v11, :cond_19

    .line 413
    .line 414
    iput-boolean v11, v3, Lm0/c;->w:Z

    .line 415
    .line 416
    iput-boolean v6, v3, Lm0/c;->g:Z

    .line 417
    .line 418
    invoke-virtual {v3}, Lm0/c;->a()V

    .line 419
    .line 420
    .line 421
    :cond_19
    const/high16 v3, 0x20000

    .line 422
    .line 423
    and-int/2addr v3, v2

    .line 424
    if-eqz v3, :cond_1a

    .line 425
    .line 426
    iget-object v3, v0, LC0/C0;->q:Lm0/c;

    .line 427
    .line 428
    iget-object v3, v3, Lm0/c;->a:Lm0/e;

    .line 429
    .line 430
    :cond_1a
    const v3, 0x8000

    .line 431
    .line 432
    .line 433
    and-int/2addr v3, v2

    .line 434
    const/4 v11, 0x0

    .line 435
    if-eqz v3, :cond_1c

    .line 436
    .line 437
    iget-object v3, v0, LC0/C0;->q:Lm0/c;

    .line 438
    .line 439
    iget-object v3, v3, Lm0/c;->a:Lm0/e;

    .line 440
    .line 441
    invoke-interface {v3}, Lm0/e;->v()I

    .line 442
    .line 443
    .line 444
    move-result v12

    .line 445
    if-nez v12, :cond_1b

    .line 446
    .line 447
    goto :goto_b

    .line 448
    :cond_1b
    invoke-interface {v3, v11}, Lm0/e;->y(I)V

    .line 449
    .line 450
    .line 451
    :cond_1c
    :goto_b
    and-int/lit16 v3, v2, 0x1f1b

    .line 452
    .line 453
    if-eqz v3, :cond_1d

    .line 454
    .line 455
    iput-boolean v6, v0, LC0/C0;->G:Z

    .line 456
    .line 457
    iput-boolean v6, v0, LC0/C0;->H:Z

    .line 458
    .line 459
    :cond_1d
    iget-object v3, v0, LC0/C0;->F:Lj0/B;

    .line 460
    .line 461
    iget-object v12, v1, Lj0/C;->E:Lj0/B;

    .line 462
    .line 463
    invoke-static {v3, v12}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    move-result v3

    .line 467
    if-nez v3, :cond_23

    .line 468
    .line 469
    iget-object v3, v1, Lj0/C;->E:Lj0/B;

    .line 470
    .line 471
    iput-object v3, v0, LC0/C0;->F:Lj0/B;

    .line 472
    .line 473
    if-nez v3, :cond_1e

    .line 474
    .line 475
    goto/16 :goto_d

    .line 476
    .line 477
    :cond_1e
    iget-object v12, v0, LC0/C0;->q:Lm0/c;

    .line 478
    .line 479
    instance-of v13, v3, Lj0/y;

    .line 480
    .line 481
    if-eqz v13, :cond_1f

    .line 482
    .line 483
    move-object v5, v3

    .line 484
    check-cast v5, Lj0/y;

    .line 485
    .line 486
    iget-object v5, v5, Lj0/y;->e:Li0/c;

    .line 487
    .line 488
    iget v7, v5, Li0/c;->a:F

    .line 489
    .line 490
    iget v8, v5, Li0/c;->b:F

    .line 491
    .line 492
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 493
    .line 494
    .line 495
    move-result v11

    .line 496
    int-to-long v13, v11

    .line 497
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 498
    .line 499
    .line 500
    move-result v11

    .line 501
    move-wide v15, v9

    .line 502
    int-to-long v9, v11

    .line 503
    shl-long/2addr v13, v4

    .line 504
    and-long/2addr v9, v15

    .line 505
    or-long/2addr v9, v13

    .line 506
    iget v11, v5, Li0/c;->c:F

    .line 507
    .line 508
    sub-float/2addr v11, v7

    .line 509
    iget v5, v5, Li0/c;->d:F

    .line 510
    .line 511
    sub-float/2addr v5, v8

    .line 512
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 513
    .line 514
    .line 515
    move-result v7

    .line 516
    int-to-long v7, v7

    .line 517
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 518
    .line 519
    .line 520
    move-result v5

    .line 521
    int-to-long v13, v5

    .line 522
    shl-long v4, v7, v4

    .line 523
    .line 524
    and-long v7, v13, v15

    .line 525
    .line 526
    or-long v16, v4, v7

    .line 527
    .line 528
    const/4 v13, 0x0

    .line 529
    move-wide v14, v9

    .line 530
    invoke-virtual/range {v12 .. v17}, Lm0/c;->f(FJJ)V

    .line 531
    .line 532
    .line 533
    goto/16 :goto_c

    .line 534
    .line 535
    :cond_1f
    move-wide v15, v9

    .line 536
    instance-of v9, v3, Lj0/x;

    .line 537
    .line 538
    const-wide/16 v13, 0x0

    .line 539
    .line 540
    const/4 v10, 0x0

    .line 541
    if-eqz v9, :cond_20

    .line 542
    .line 543
    move-object v4, v3

    .line 544
    check-cast v4, Lj0/x;

    .line 545
    .line 546
    iget-object v4, v4, Lj0/x;->e:Lj0/A;

    .line 547
    .line 548
    iput-object v10, v12, Lm0/c;->k:Lj0/B;

    .line 549
    .line 550
    iput-wide v7, v12, Lm0/c;->i:J

    .line 551
    .line 552
    iput-wide v13, v12, Lm0/c;->h:J

    .line 553
    .line 554
    iput v5, v12, Lm0/c;->j:F

    .line 555
    .line 556
    iput-boolean v6, v12, Lm0/c;->g:Z

    .line 557
    .line 558
    iput-boolean v11, v12, Lm0/c;->n:Z

    .line 559
    .line 560
    iput-object v4, v12, Lm0/c;->l:Lj0/A;

    .line 561
    .line 562
    invoke-virtual {v12}, Lm0/c;->a()V

    .line 563
    .line 564
    .line 565
    goto :goto_c

    .line 566
    :cond_20
    instance-of v9, v3, Lj0/z;

    .line 567
    .line 568
    if-eqz v9, :cond_22

    .line 569
    .line 570
    move-object v9, v3

    .line 571
    check-cast v9, Lj0/z;

    .line 572
    .line 573
    move/from16 v17, v4

    .line 574
    .line 575
    iget-object v4, v9, Lj0/z;->f:Lj0/g;

    .line 576
    .line 577
    if-eqz v4, :cond_21

    .line 578
    .line 579
    iput-object v10, v12, Lm0/c;->k:Lj0/B;

    .line 580
    .line 581
    iput-wide v7, v12, Lm0/c;->i:J

    .line 582
    .line 583
    iput-wide v13, v12, Lm0/c;->h:J

    .line 584
    .line 585
    iput v5, v12, Lm0/c;->j:F

    .line 586
    .line 587
    iput-boolean v6, v12, Lm0/c;->g:Z

    .line 588
    .line 589
    iput-boolean v11, v12, Lm0/c;->n:Z

    .line 590
    .line 591
    iput-object v4, v12, Lm0/c;->l:Lj0/A;

    .line 592
    .line 593
    invoke-virtual {v12}, Lm0/c;->a()V

    .line 594
    .line 595
    .line 596
    goto :goto_c

    .line 597
    :cond_21
    iget-object v4, v9, Lj0/z;->e:Li0/d;

    .line 598
    .line 599
    iget v5, v4, Li0/d;->a:F

    .line 600
    .line 601
    iget v7, v4, Li0/d;->b:F

    .line 602
    .line 603
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 604
    .line 605
    .line 606
    move-result v5

    .line 607
    int-to-long v8, v5

    .line 608
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 609
    .line 610
    .line 611
    move-result v5

    .line 612
    int-to-long v10, v5

    .line 613
    shl-long v7, v8, v17

    .line 614
    .line 615
    and-long v9, v10, v15

    .line 616
    .line 617
    or-long/2addr v7, v9

    .line 618
    invoke-virtual {v4}, Li0/d;->b()F

    .line 619
    .line 620
    .line 621
    move-result v5

    .line 622
    invoke-virtual {v4}, Li0/d;->a()F

    .line 623
    .line 624
    .line 625
    move-result v9

    .line 626
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 627
    .line 628
    .line 629
    move-result v5

    .line 630
    int-to-long v10, v5

    .line 631
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 632
    .line 633
    .line 634
    move-result v5

    .line 635
    int-to-long v13, v5

    .line 636
    shl-long v9, v10, v17

    .line 637
    .line 638
    and-long/2addr v13, v15

    .line 639
    or-long/2addr v9, v13

    .line 640
    iget-wide v4, v4, Li0/d;->h:J

    .line 641
    .line 642
    shr-long v4, v4, v17

    .line 643
    .line 644
    long-to-int v4, v4

    .line 645
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 646
    .line 647
    .line 648
    move-result v13

    .line 649
    move-wide v14, v7

    .line 650
    move-wide/from16 v16, v9

    .line 651
    .line 652
    invoke-virtual/range {v12 .. v17}, Lm0/c;->f(FJJ)V

    .line 653
    .line 654
    .line 655
    :cond_22
    :goto_c
    instance-of v3, v3, Lj0/x;

    .line 656
    .line 657
    if-eqz v3, :cond_24

    .line 658
    .line 659
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 660
    .line 661
    const/16 v4, 0x21

    .line 662
    .line 663
    if-ge v3, v4, :cond_24

    .line 664
    .line 665
    iget-object v3, v0, LC0/C0;->u:LB5/a;

    .line 666
    .line 667
    if-eqz v3, :cond_24

    .line 668
    .line 669
    invoke-interface {v3}, LB5/a;->invoke()Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    goto :goto_d

    .line 673
    :cond_23
    move v6, v11

    .line 674
    :cond_24
    :goto_d
    iget v1, v1, Lj0/C;->q:I

    .line 675
    .line 676
    iput v1, v0, LC0/C0;->D:I

    .line 677
    .line 678
    if-nez v2, :cond_25

    .line 679
    .line 680
    if-eqz v6, :cond_26

    .line 681
    .line 682
    :cond_25
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 683
    .line 684
    const/16 v2, 0x1a

    .line 685
    .line 686
    iget-object v3, v0, LC0/C0;->s:LC0/A;

    .line 687
    .line 688
    if-lt v1, v2, :cond_27

    .line 689
    .line 690
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 691
    .line 692
    .line 693
    move-result-object v1

    .line 694
    if-eqz v1, :cond_26

    .line 695
    .line 696
    invoke-static {v1, v3, v3}, LC0/U;->u(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/View;)V

    .line 697
    .line 698
    .line 699
    :cond_26
    return-void

    .line 700
    :cond_27
    invoke-virtual {v3}, Landroid/view/View;->invalidate()V

    .line 701
    .line 702
    .line 703
    return-void
.end method

.method public final d(J)V
    .locals 6

    .line 1
    iget-object v0, p0, LC0/C0;->q:Lm0/c;

    .line 2
    .line 3
    iget-wide v1, v0, Lm0/c;->t:J

    .line 4
    .line 5
    invoke-static {v1, v2, p1, p2}, LW0/i;->a(JJ)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iput-wide p1, v0, Lm0/c;->t:J

    .line 12
    .line 13
    iget-wide v1, v0, Lm0/c;->u:J

    .line 14
    .line 15
    iget-object v0, v0, Lm0/c;->a:Lm0/e;

    .line 16
    .line 17
    const/16 v3, 0x20

    .line 18
    .line 19
    shr-long v3, p1, v3

    .line 20
    .line 21
    long-to-int v3, v3

    .line 22
    const-wide v4, 0xffffffffL

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    and-long/2addr p1, v4

    .line 28
    long-to-int p1, p1

    .line 29
    invoke-interface {v0, v3, p1, v1, v2}, Lm0/e;->C(IIJ)V

    .line 30
    .line 31
    .line 32
    :cond_0
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 33
    .line 34
    const/16 p2, 0x1a

    .line 35
    .line 36
    iget-object v0, p0, LC0/C0;->s:LC0/A;

    .line 37
    .line 38
    if-lt p1, p2, :cond_2

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    if-eqz p1, :cond_1

    .line 45
    .line 46
    invoke-static {p1, v0, v0}, LC0/U;->u(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/View;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    return-void

    .line 50
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final destroy()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LC0/C0;->t:LB5/e;

    .line 3
    .line 4
    iput-object v0, p0, LC0/C0;->u:LB5/a;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, LC0/C0;->w:Z

    .line 8
    .line 9
    iget-boolean v0, p0, LC0/C0;->z:Z

    .line 10
    .line 11
    iget-object v1, p0, LC0/C0;->s:LC0/A;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, LC0/C0;->z:Z

    .line 17
    .line 18
    invoke-virtual {v1, p0, v0}, LC0/A;->B(LB0/s0;Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, LC0/C0;->r:Lj0/t;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget-object v2, p0, LC0/C0;->q:Lm0/c;

    .line 26
    .line 27
    invoke-interface {v0, v2}, Lj0/t;->a(Lm0/c;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, p0}, LC0/A;->K(LB0/s0;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public final e()V
    .locals 13

    .line 1
    iget-boolean v0, p0, LC0/C0;->z:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-wide v0, p0, LC0/C0;->E:J

    .line 6
    .line 7
    sget-wide v2, Lj0/H;->b:J

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, Lj0/H;->a(JJ)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const-wide v1, 0xffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    const/16 v3, 0x20

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, LC0/C0;->q:Lm0/c;

    .line 23
    .line 24
    iget-wide v4, v0, Lm0/c;->u:J

    .line 25
    .line 26
    iget-wide v6, p0, LC0/C0;->v:J

    .line 27
    .line 28
    invoke-static {v4, v5, v6, v7}, LW0/k;->a(JJ)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    iget-object v0, p0, LC0/C0;->q:Lm0/c;

    .line 35
    .line 36
    iget-wide v4, p0, LC0/C0;->E:J

    .line 37
    .line 38
    invoke-static {v4, v5}, Lj0/H;->b(J)F

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    iget-wide v5, p0, LC0/C0;->v:J

    .line 43
    .line 44
    shr-long/2addr v5, v3

    .line 45
    long-to-int v5, v5

    .line 46
    int-to-float v5, v5

    .line 47
    mul-float/2addr v4, v5

    .line 48
    iget-wide v5, p0, LC0/C0;->E:J

    .line 49
    .line 50
    invoke-static {v5, v6}, Lj0/H;->c(J)F

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    iget-wide v6, p0, LC0/C0;->v:J

    .line 55
    .line 56
    and-long/2addr v6, v1

    .line 57
    long-to-int v6, v6

    .line 58
    int-to-float v6, v6

    .line 59
    mul-float/2addr v5, v6

    .line 60
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    int-to-long v6, v4

    .line 65
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    int-to-long v4, v4

    .line 70
    shl-long/2addr v6, v3

    .line 71
    and-long/2addr v4, v1

    .line 72
    or-long/2addr v4, v6

    .line 73
    iget-wide v6, v0, Lm0/c;->v:J

    .line 74
    .line 75
    invoke-static {v6, v7, v4, v5}, Li0/b;->b(JJ)Z

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-nez v6, :cond_0

    .line 80
    .line 81
    iput-wide v4, v0, Lm0/c;->v:J

    .line 82
    .line 83
    iget-object v0, v0, Lm0/c;->a:Lm0/e;

    .line 84
    .line 85
    invoke-interface {v0, v4, v5}, Lm0/e;->I(J)V

    .line 86
    .line 87
    .line 88
    :cond_0
    iget-object v0, p0, LC0/C0;->q:Lm0/c;

    .line 89
    .line 90
    iget-object v4, p0, LC0/C0;->A:LW0/c;

    .line 91
    .line 92
    iget-object v5, p0, LC0/C0;->B:LW0/l;

    .line 93
    .line 94
    iget-wide v6, p0, LC0/C0;->v:J

    .line 95
    .line 96
    iget-wide v8, v0, Lm0/c;->u:J

    .line 97
    .line 98
    iget-object v10, v0, Lm0/c;->a:Lm0/e;

    .line 99
    .line 100
    invoke-static {v8, v9, v6, v7}, LW0/k;->a(JJ)Z

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    if-nez v8, :cond_1

    .line 105
    .line 106
    iput-wide v6, v0, Lm0/c;->u:J

    .line 107
    .line 108
    iget-wide v8, v0, Lm0/c;->t:J

    .line 109
    .line 110
    shr-long v11, v8, v3

    .line 111
    .line 112
    long-to-int v3, v11

    .line 113
    and-long/2addr v1, v8

    .line 114
    long-to-int v1, v1

    .line 115
    invoke-interface {v10, v3, v1, v6, v7}, Lm0/e;->C(IIJ)V

    .line 116
    .line 117
    .line 118
    iget-wide v1, v0, Lm0/c;->i:J

    .line 119
    .line 120
    const-wide v6, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    cmp-long v1, v1, v6

    .line 126
    .line 127
    if-nez v1, :cond_1

    .line 128
    .line 129
    const/4 v1, 0x1

    .line 130
    iput-boolean v1, v0, Lm0/c;->g:Z

    .line 131
    .line 132
    invoke-virtual {v0}, Lm0/c;->a()V

    .line 133
    .line 134
    .line 135
    :cond_1
    iput-object v4, v0, Lm0/c;->b:LW0/c;

    .line 136
    .line 137
    iput-object v5, v0, Lm0/c;->c:LW0/l;

    .line 138
    .line 139
    iget-object v1, p0, LC0/C0;->K:LB0/a;

    .line 140
    .line 141
    iput-object v1, v0, Lm0/c;->d:Lkotlin/jvm/internal/n;

    .line 142
    .line 143
    iget-object v1, v0, Lm0/c;->e:Lm0/a;

    .line 144
    .line 145
    invoke-interface {v10, v4, v5, v0, v1}, Lm0/e;->B(LW0/c;LW0/l;Lm0/c;Lm0/a;)V

    .line 146
    .line 147
    .line 148
    iget-boolean v0, p0, LC0/C0;->z:Z

    .line 149
    .line 150
    if-eqz v0, :cond_2

    .line 151
    .line 152
    const/4 v0, 0x0

    .line 153
    iput-boolean v0, p0, LC0/C0;->z:Z

    .line 154
    .line 155
    iget-object v1, p0, LC0/C0;->s:LC0/A;

    .line 156
    .line 157
    invoke-virtual {v1, p0, v0}, LC0/A;->B(LB0/s0;Z)V

    .line 158
    .line 159
    .line 160
    :cond_2
    return-void
.end method

.method public final f(ZJ)J
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, LC0/C0;->j()[F

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_1

    .line 8
    .line 9
    const-wide p1, 0x7f8000007f800000L    # 1.404448428688076E306

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    return-wide p1

    .line 15
    :cond_0
    invoke-virtual {p0}, LC0/C0;->k()[F

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :cond_1
    iget-boolean v0, p0, LC0/C0;->I:Z

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    return-wide p2

    .line 24
    :cond_2
    invoke-static {p1, p2, p3}, Lj0/B;->o([FJ)J

    .line 25
    .line 26
    .line 27
    move-result-wide p1

    .line 28
    return-wide p1
.end method

.method public final g(Lj0/m;Lm0/c;)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-virtual {v1}, LC0/C0;->e()V

    .line 4
    .line 5
    .line 6
    iget-object v0, v1, LC0/C0;->q:Lm0/c;

    .line 7
    .line 8
    iget-object v0, v0, Lm0/c;->a:Lm0/e;

    .line 9
    .line 10
    invoke-interface {v0}, Lm0/e;->E()F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v2, 0x0

    .line 15
    cmpl-float v0, v0, v2

    .line 16
    .line 17
    if-lez v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    iput-boolean v0, v1, LC0/C0;->J:Z

    .line 23
    .line 24
    iget-object v0, v1, LC0/C0;->C:Ll0/b;

    .line 25
    .line 26
    iget-object v5, v0, Ll0/b;->r:LB0/G0;

    .line 27
    .line 28
    move-object/from16 v6, p1

    .line 29
    .line 30
    invoke-virtual {v5, v6}, LB0/G0;->U(Lj0/m;)V

    .line 31
    .line 32
    .line 33
    move-object/from16 v6, p2

    .line 34
    .line 35
    iput-object v6, v5, LB0/G0;->s:Ljava/lang/Object;

    .line 36
    .line 37
    iget-object v5, v1, LC0/C0;->q:Lm0/c;

    .line 38
    .line 39
    invoke-interface {v0}, Ll0/d;->z()LB0/G0;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-virtual {v6}, LB0/G0;->t()Lj0/m;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    invoke-interface {v0}, Ll0/d;->z()LB0/G0;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object v0, v0, LB0/G0;->s:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Lm0/c;

    .line 54
    .line 55
    iget-object v6, v5, Lm0/c;->a:Lm0/e;

    .line 56
    .line 57
    iget-boolean v8, v5, Lm0/c;->s:Z

    .line 58
    .line 59
    if-eqz v8, :cond_1

    .line 60
    .line 61
    goto/16 :goto_c

    .line 62
    .line 63
    :cond_1
    invoke-virtual {v5}, Lm0/c;->a()V

    .line 64
    .line 65
    .line 66
    invoke-interface {v6}, Lm0/e;->n()Z

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    if-nez v8, :cond_2

    .line 71
    .line 72
    :try_start_0
    iget-object v8, v5, Lm0/c;->a:Lm0/e;

    .line 73
    .line 74
    iget-object v9, v5, Lm0/c;->b:LW0/c;

    .line 75
    .line 76
    iget-object v10, v5, Lm0/c;->c:LW0/l;

    .line 77
    .line 78
    iget-object v11, v5, Lm0/c;->e:Lm0/a;

    .line 79
    .line 80
    invoke-interface {v8, v9, v10, v5, v11}, Lm0/e;->B(LW0/c;LW0/l;Lm0/c;Lm0/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    .line 82
    .line 83
    :catchall_0
    :cond_2
    invoke-interface {v6}, Lm0/e;->E()F

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    cmpl-float v2, v8, v2

    .line 88
    .line 89
    if-lez v2, :cond_3

    .line 90
    .line 91
    const/4 v2, 0x1

    .line 92
    goto :goto_1

    .line 93
    :cond_3
    const/4 v2, 0x0

    .line 94
    :goto_1
    if-eqz v2, :cond_4

    .line 95
    .line 96
    invoke-interface {v7}, Lj0/m;->p()V

    .line 97
    .line 98
    .line 99
    :cond_4
    invoke-static {v7}, Lj0/c;->a(Lj0/m;)Landroid/graphics/Canvas;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    invoke-virtual {v8}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    .line 104
    .line 105
    .line 106
    move-result v14

    .line 107
    if-nez v14, :cond_8

    .line 108
    .line 109
    iget-wide v9, v5, Lm0/c;->t:J

    .line 110
    .line 111
    const/16 v11, 0x20

    .line 112
    .line 113
    shr-long v12, v9, v11

    .line 114
    .line 115
    long-to-int v12, v12

    .line 116
    int-to-float v12, v12

    .line 117
    const-wide v16, 0xffffffffL

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    and-long v9, v9, v16

    .line 123
    .line 124
    long-to-int v9, v9

    .line 125
    int-to-float v10, v9

    .line 126
    move/from16 p1, v11

    .line 127
    .line 128
    move v9, v12

    .line 129
    iget-wide v11, v5, Lm0/c;->u:J

    .line 130
    .line 131
    shr-long v3, v11, p1

    .line 132
    .line 133
    long-to-int v3, v3

    .line 134
    int-to-float v3, v3

    .line 135
    add-float/2addr v3, v9

    .line 136
    and-long v11, v11, v16

    .line 137
    .line 138
    long-to-int v4, v11

    .line 139
    int-to-float v4, v4

    .line 140
    add-float v12, v10, v4

    .line 141
    .line 142
    invoke-interface {v6}, Lm0/e;->c()F

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    invoke-interface {v6}, Lm0/e;->H()I

    .line 147
    .line 148
    .line 149
    move-result v11

    .line 150
    const/high16 v13, 0x3f800000    # 1.0f

    .line 151
    .line 152
    cmpg-float v13, v4, v13

    .line 153
    .line 154
    if-ltz v13, :cond_6

    .line 155
    .line 156
    const/4 v13, 0x3

    .line 157
    if-ne v11, v13, :cond_6

    .line 158
    .line 159
    invoke-interface {v6}, Lm0/e;->v()I

    .line 160
    .line 161
    .line 162
    move-result v13

    .line 163
    const/4 v15, 0x1

    .line 164
    if-ne v13, v15, :cond_5

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_5
    invoke-virtual {v8}, Landroid/graphics/Canvas;->save()I

    .line 168
    .line 169
    .line 170
    :goto_2
    move-object v3, v8

    .line 171
    goto :goto_4

    .line 172
    :cond_6
    :goto_3
    iget-object v13, v5, Lm0/c;->p:LW1/d;

    .line 173
    .line 174
    if-nez v13, :cond_7

    .line 175
    .line 176
    invoke-static {}, Lj0/B;->f()LW1/d;

    .line 177
    .line 178
    .line 179
    move-result-object v13

    .line 180
    iput-object v13, v5, Lm0/c;->p:LW1/d;

    .line 181
    .line 182
    :cond_7
    invoke-virtual {v13, v4}, LW1/d;->c(F)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v13, v11}, LW1/d;->d(I)V

    .line 186
    .line 187
    .line 188
    const/4 v4, 0x0

    .line 189
    invoke-virtual {v13, v4}, LW1/d;->f(Lj0/j;)V

    .line 190
    .line 191
    .line 192
    iget-object v4, v13, LW1/d;->b:Ljava/lang/Object;

    .line 193
    .line 194
    move-object v13, v4

    .line 195
    check-cast v13, Landroid/graphics/Paint;

    .line 196
    .line 197
    move v11, v3

    .line 198
    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;)I

    .line 199
    .line 200
    .line 201
    goto :goto_2

    .line 202
    :goto_4
    invoke-virtual {v3, v9, v10}, Landroid/graphics/Canvas;->translate(FF)V

    .line 203
    .line 204
    .line 205
    invoke-interface {v6}, Lm0/e;->A()Landroid/graphics/Matrix;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    invoke-virtual {v3, v4}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 210
    .line 211
    .line 212
    goto :goto_5

    .line 213
    :cond_8
    move-object v3, v8

    .line 214
    :goto_5
    if-nez v14, :cond_9

    .line 215
    .line 216
    iget-boolean v4, v5, Lm0/c;->w:Z

    .line 217
    .line 218
    if-eqz v4, :cond_9

    .line 219
    .line 220
    const/4 v15, 0x1

    .line 221
    goto :goto_6

    .line 222
    :cond_9
    const/4 v15, 0x0

    .line 223
    :goto_6
    if-eqz v15, :cond_d

    .line 224
    .line 225
    invoke-interface {v7}, Lj0/m;->k()V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v5}, Lm0/c;->d()Lj0/B;

    .line 229
    .line 230
    .line 231
    move-result-object v4

    .line 232
    instance-of v8, v4, Lj0/y;

    .line 233
    .line 234
    if-eqz v8, :cond_a

    .line 235
    .line 236
    invoke-virtual {v4}, Lj0/B;->l()Li0/c;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    iget v8, v4, Li0/c;->a:F

    .line 241
    .line 242
    iget v9, v4, Li0/c;->b:F

    .line 243
    .line 244
    iget v10, v4, Li0/c;->c:F

    .line 245
    .line 246
    iget v11, v4, Li0/c;->d:F

    .line 247
    .line 248
    const/4 v12, 0x1

    .line 249
    invoke-interface/range {v7 .. v12}, Lj0/m;->g(FFFFI)V

    .line 250
    .line 251
    .line 252
    goto :goto_8

    .line 253
    :cond_a
    instance-of v8, v4, Lj0/z;

    .line 254
    .line 255
    if-eqz v8, :cond_c

    .line 256
    .line 257
    iget-object v8, v5, Lm0/c;->m:Lj0/g;

    .line 258
    .line 259
    if-eqz v8, :cond_b

    .line 260
    .line 261
    iget-object v9, v8, Lj0/g;->a:Landroid/graphics/Path;

    .line 262
    .line 263
    invoke-virtual {v9}, Landroid/graphics/Path;->rewind()V

    .line 264
    .line 265
    .line 266
    goto :goto_7

    .line 267
    :cond_b
    invoke-static {}, Lj0/i;->a()Lj0/g;

    .line 268
    .line 269
    .line 270
    move-result-object v8

    .line 271
    iput-object v8, v5, Lm0/c;->m:Lj0/g;

    .line 272
    .line 273
    :goto_7
    check-cast v4, Lj0/z;

    .line 274
    .line 275
    iget-object v4, v4, Lj0/z;->e:Li0/d;

    .line 276
    .line 277
    invoke-static {v8, v4}, Lj0/A;->a(Lj0/A;Li0/d;)V

    .line 278
    .line 279
    .line 280
    invoke-interface {v7, v8}, Lj0/m;->a(Lj0/A;)V

    .line 281
    .line 282
    .line 283
    goto :goto_8

    .line 284
    :cond_c
    instance-of v8, v4, Lj0/x;

    .line 285
    .line 286
    if-eqz v8, :cond_d

    .line 287
    .line 288
    check-cast v4, Lj0/x;

    .line 289
    .line 290
    iget-object v4, v4, Lj0/x;->e:Lj0/A;

    .line 291
    .line 292
    invoke-interface {v7, v4}, Lj0/m;->a(Lj0/A;)V

    .line 293
    .line 294
    .line 295
    :cond_d
    :goto_8
    if-eqz v0, :cond_13

    .line 296
    .line 297
    iget-object v0, v0, Lm0/c;->r:LL/s;

    .line 298
    .line 299
    iget-boolean v4, v0, LL/s;->a:Z

    .line 300
    .line 301
    if-nez v4, :cond_e

    .line 302
    .line 303
    const-string v4, "Only add dependencies during a tracking"

    .line 304
    .line 305
    invoke-static {v4}, Lj0/w;->a(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    :cond_e
    iget-object v4, v0, LL/s;->d:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast v4, Lr/H;

    .line 311
    .line 312
    if-eqz v4, :cond_f

    .line 313
    .line 314
    invoke-virtual {v4, v5}, Lr/H;->a(Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    goto :goto_9

    .line 318
    :cond_f
    iget-object v4, v0, LL/s;->b:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v4, Lm0/c;

    .line 321
    .line 322
    if-eqz v4, :cond_10

    .line 323
    .line 324
    sget v4, Lr/P;->a:I

    .line 325
    .line 326
    new-instance v4, Lr/H;

    .line 327
    .line 328
    invoke-direct {v4}, Lr/H;-><init>()V

    .line 329
    .line 330
    .line 331
    iget-object v8, v0, LL/s;->b:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast v8, Lm0/c;

    .line 334
    .line 335
    invoke-static {v8}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v4, v8}, Lr/H;->a(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    invoke-virtual {v4, v5}, Lr/H;->a(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    iput-object v4, v0, LL/s;->d:Ljava/lang/Object;

    .line 345
    .line 346
    const/4 v4, 0x0

    .line 347
    iput-object v4, v0, LL/s;->b:Ljava/lang/Object;

    .line 348
    .line 349
    goto :goto_9

    .line 350
    :cond_10
    iput-object v5, v0, LL/s;->b:Ljava/lang/Object;

    .line 351
    .line 352
    :goto_9
    iget-object v4, v0, LL/s;->e:Ljava/lang/Object;

    .line 353
    .line 354
    check-cast v4, Lr/H;

    .line 355
    .line 356
    if-eqz v4, :cond_11

    .line 357
    .line 358
    invoke-virtual {v4, v5}, Lr/H;->l(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result v0

    .line 362
    const/16 v18, 0x1

    .line 363
    .line 364
    xor-int/lit8 v0, v0, 0x1

    .line 365
    .line 366
    goto :goto_a

    .line 367
    :cond_11
    const/16 v18, 0x1

    .line 368
    .line 369
    iget-object v4, v0, LL/s;->c:Ljava/lang/Object;

    .line 370
    .line 371
    check-cast v4, Lm0/c;

    .line 372
    .line 373
    if-eq v4, v5, :cond_12

    .line 374
    .line 375
    move/from16 v0, v18

    .line 376
    .line 377
    goto :goto_a

    .line 378
    :cond_12
    const/4 v4, 0x0

    .line 379
    iput-object v4, v0, LL/s;->c:Ljava/lang/Object;

    .line 380
    .line 381
    const/4 v0, 0x0

    .line 382
    :goto_a
    if-eqz v0, :cond_13

    .line 383
    .line 384
    iget v0, v5, Lm0/c;->q:I

    .line 385
    .line 386
    add-int/lit8 v0, v0, 0x1

    .line 387
    .line 388
    iput v0, v5, Lm0/c;->q:I

    .line 389
    .line 390
    :cond_13
    invoke-static {v7}, Lj0/c;->a(Lj0/m;)Landroid/graphics/Canvas;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    invoke-virtual {v0}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    .line 395
    .line 396
    .line 397
    move-result v0

    .line 398
    if-nez v0, :cond_15

    .line 399
    .line 400
    iget-object v0, v5, Lm0/c;->o:Ll0/b;

    .line 401
    .line 402
    if-nez v0, :cond_14

    .line 403
    .line 404
    new-instance v0, Ll0/b;

    .line 405
    .line 406
    invoke-direct {v0}, Ll0/b;-><init>()V

    .line 407
    .line 408
    .line 409
    iput-object v0, v5, Lm0/c;->o:Ll0/b;

    .line 410
    .line 411
    :cond_14
    iget-object v4, v0, Ll0/b;->r:LB0/G0;

    .line 412
    .line 413
    iget-object v6, v5, Lm0/c;->b:LW0/c;

    .line 414
    .line 415
    iget-object v8, v5, Lm0/c;->c:LW0/l;

    .line 416
    .line 417
    iget-wide v9, v5, Lm0/c;->u:J

    .line 418
    .line 419
    invoke-static {v9, v10}, Lcom/google/android/gms/internal/measurement/P1;->d0(J)J

    .line 420
    .line 421
    .line 422
    move-result-wide v9

    .line 423
    iget-object v11, v4, LB0/G0;->t:Ljava/lang/Object;

    .line 424
    .line 425
    check-cast v11, Ll0/b;

    .line 426
    .line 427
    iget-object v11, v11, Ll0/b;->q:Ll0/a;

    .line 428
    .line 429
    iget-object v12, v11, Ll0/a;->a:LW0/c;

    .line 430
    .line 431
    iget-object v11, v11, Ll0/a;->b:LW0/l;

    .line 432
    .line 433
    invoke-virtual {v4}, LB0/G0;->t()Lj0/m;

    .line 434
    .line 435
    .line 436
    move-result-object v13

    .line 437
    move/from16 p1, v2

    .line 438
    .line 439
    invoke-virtual {v4}, LB0/G0;->E()J

    .line 440
    .line 441
    .line 442
    move-result-wide v1

    .line 443
    move-object/from16 v16, v3

    .line 444
    .line 445
    iget-object v3, v4, LB0/G0;->s:Ljava/lang/Object;

    .line 446
    .line 447
    check-cast v3, Lm0/c;

    .line 448
    .line 449
    invoke-virtual {v4, v6}, LB0/G0;->V(LW0/c;)V

    .line 450
    .line 451
    .line 452
    invoke-virtual {v4, v8}, LB0/G0;->W(LW0/l;)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v4, v7}, LB0/G0;->U(Lj0/m;)V

    .line 456
    .line 457
    .line 458
    invoke-virtual {v4, v9, v10}, LB0/G0;->X(J)V

    .line 459
    .line 460
    .line 461
    iput-object v5, v4, LB0/G0;->s:Ljava/lang/Object;

    .line 462
    .line 463
    invoke-interface {v7}, Lj0/m;->k()V

    .line 464
    .line 465
    .line 466
    :try_start_1
    invoke-virtual {v5, v0}, Lm0/c;->c(Ll0/d;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 467
    .line 468
    .line 469
    invoke-interface {v7}, Lj0/m;->i()V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v4, v12}, LB0/G0;->V(LW0/c;)V

    .line 473
    .line 474
    .line 475
    invoke-virtual {v4, v11}, LB0/G0;->W(LW0/l;)V

    .line 476
    .line 477
    .line 478
    invoke-virtual {v4, v13}, LB0/G0;->U(Lj0/m;)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v4, v1, v2}, LB0/G0;->X(J)V

    .line 482
    .line 483
    .line 484
    iput-object v3, v4, LB0/G0;->s:Ljava/lang/Object;

    .line 485
    .line 486
    goto :goto_b

    .line 487
    :catchall_1
    move-exception v0

    .line 488
    invoke-interface {v7}, Lj0/m;->i()V

    .line 489
    .line 490
    .line 491
    invoke-virtual {v4, v12}, LB0/G0;->V(LW0/c;)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v4, v11}, LB0/G0;->W(LW0/l;)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v4, v13}, LB0/G0;->U(Lj0/m;)V

    .line 498
    .line 499
    .line 500
    invoke-virtual {v4, v1, v2}, LB0/G0;->X(J)V

    .line 501
    .line 502
    .line 503
    iput-object v3, v4, LB0/G0;->s:Ljava/lang/Object;

    .line 504
    .line 505
    throw v0

    .line 506
    :cond_15
    move/from16 p1, v2

    .line 507
    .line 508
    move-object/from16 v16, v3

    .line 509
    .line 510
    invoke-interface {v6, v7}, Lm0/e;->x(Lj0/m;)V

    .line 511
    .line 512
    .line 513
    :goto_b
    if-eqz v15, :cond_16

    .line 514
    .line 515
    invoke-interface {v7}, Lj0/m;->i()V

    .line 516
    .line 517
    .line 518
    :cond_16
    if-eqz p1, :cond_17

    .line 519
    .line 520
    invoke-interface {v7}, Lj0/m;->n()V

    .line 521
    .line 522
    .line 523
    :cond_17
    if-nez v14, :cond_18

    .line 524
    .line 525
    invoke-virtual/range {v16 .. v16}, Landroid/graphics/Canvas;->restore()V

    .line 526
    .line 527
    .line 528
    :cond_18
    :goto_c
    return-void
.end method

.method public final getUnderlyingMatrix-sQKQjiQ()[F
    .locals 1

    .line 1
    invoke-virtual {p0}, LC0/C0;->k()[F

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final h(J)Z
    .locals 3

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v0, p1, v0

    .line 4
    .line 5
    long-to-int v0, v0

    .line 6
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const-wide v1, 0xffffffffL

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    and-long/2addr p1, v1

    .line 16
    long-to-int p1, p1

    .line 17
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iget-object p2, p0, LC0/C0;->q:Lm0/c;

    .line 22
    .line 23
    iget-boolean v1, p2, Lm0/c;->w:Z

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p2}, Lm0/c;->d()Lj0/B;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-static {p2, v0, p1}, LC0/W;->l(Lj0/B;FF)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    return p1

    .line 36
    :cond_0
    const/4 p1, 0x1

    .line 37
    return p1
.end method

.method public final i(LB5/e;LB5/a;)V
    .locals 5

    .line 1
    iget-object v0, p0, LC0/C0;->r:Lj0/t;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v1, p0, LC0/C0;->q:Lm0/c;

    .line 6
    .line 7
    iget-boolean v1, v1, Lm0/c;->s:Z

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const-string v1, "layer should have been released before reuse"

    .line 12
    .line 13
    invoke-static {v1}, Ly0/a;->a(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-interface {v0}, Lj0/t;->b()Lm0/c;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, LC0/C0;->q:Lm0/c;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput-boolean v0, p0, LC0/C0;->w:Z

    .line 24
    .line 25
    iput-object p1, p0, LC0/C0;->t:LB5/e;

    .line 26
    .line 27
    iput-object p2, p0, LC0/C0;->u:LB5/a;

    .line 28
    .line 29
    iput-boolean v0, p0, LC0/C0;->G:Z

    .line 30
    .line 31
    iput-boolean v0, p0, LC0/C0;->H:Z

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    iput-boolean p1, p0, LC0/C0;->I:Z

    .line 35
    .line 36
    iget-object p1, p0, LC0/C0;->x:[F

    .line 37
    .line 38
    invoke-static {p1}, Lj0/B;->q([F)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, LC0/C0;->y:[F

    .line 42
    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    invoke-static {p1}, Lj0/B;->q([F)V

    .line 46
    .line 47
    .line 48
    :cond_1
    sget-wide p1, Lj0/H;->b:J

    .line 49
    .line 50
    iput-wide p1, p0, LC0/C0;->E:J

    .line 51
    .line 52
    iput-boolean v0, p0, LC0/C0;->J:Z

    .line 53
    .line 54
    const p1, 0x7fffffff

    .line 55
    .line 56
    .line 57
    int-to-long p1, p1

    .line 58
    const/16 v1, 0x20

    .line 59
    .line 60
    shl-long v1, p1, v1

    .line 61
    .line 62
    const-wide v3, 0xffffffffL

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    and-long/2addr p1, v3

    .line 68
    or-long/2addr p1, v1

    .line 69
    iput-wide p1, p0, LC0/C0;->v:J

    .line 70
    .line 71
    const/4 p1, 0x0

    .line 72
    iput-object p1, p0, LC0/C0;->F:Lj0/B;

    .line 73
    .line 74
    iput v0, p0, LC0/C0;->D:I

    .line 75
    .line 76
    return-void

    .line 77
    :cond_2
    const-string p1, "currently reuse is only supported when we manage the layer lifecycle"

    .line 78
    .line 79
    invoke-static {p1}, LC0/S;->i(Ljava/lang/String;)LC2/e;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    throw p1
.end method

.method public final invalidate()V
    .locals 3

    .line 1
    iget-boolean v0, p0, LC0/C0;->z:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, LC0/C0;->w:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LC0/C0;->s:LC0/A;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 12
    .line 13
    .line 14
    iget-boolean v1, p0, LC0/C0;->z:Z

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    if-eq v2, v1, :cond_0

    .line 18
    .line 19
    iput-boolean v2, p0, LC0/C0;->z:Z

    .line 20
    .line 21
    invoke-virtual {v0, p0, v2}, LC0/A;->B(LB0/s0;Z)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final j()[F
    .locals 5

    .line 1
    iget-object v0, p0, LC0/C0;->y:[F

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lj0/B;->j()[F

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, LC0/C0;->y:[F

    .line 10
    .line 11
    :cond_0
    iget-boolean v1, p0, LC0/C0;->H:Z

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    aget v1, v0, v2

    .line 18
    .line 19
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_3

    .line 24
    .line 25
    return-object v3

    .line 26
    :cond_1
    iput-boolean v2, p0, LC0/C0;->H:Z

    .line 27
    .line 28
    invoke-virtual {p0}, LC0/C0;->k()[F

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-boolean v4, p0, LC0/C0;->I:Z

    .line 33
    .line 34
    if-eqz v4, :cond_2

    .line 35
    .line 36
    return-object v1

    .line 37
    :cond_2
    invoke-static {v1, v0}, LC0/W;->i([F[F)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_4

    .line 42
    .line 43
    :cond_3
    return-object v0

    .line 44
    :cond_4
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 45
    .line 46
    aput v1, v0, v2

    .line 47
    .line 48
    return-object v3
.end method

.method public final k()[F
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, LC0/C0;->G:Z

    .line 4
    .line 5
    iget-object v2, v0, LC0/C0;->x:[F

    .line 6
    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    iget-object v1, v0, LC0/C0;->q:Lm0/c;

    .line 10
    .line 11
    iget-wide v3, v1, Lm0/c;->v:J

    .line 12
    .line 13
    iget-object v1, v1, Lm0/c;->a:Lm0/e;

    .line 14
    .line 15
    const-wide v5, 0x7fffffff7fffffffL

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    and-long/2addr v5, v3

    .line 21
    const-wide v7, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    cmp-long v5, v5, v7

    .line 27
    .line 28
    if-nez v5, :cond_0

    .line 29
    .line 30
    iget-wide v3, v0, LC0/C0;->v:J

    .line 31
    .line 32
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/measurement/P1;->d0(J)J

    .line 33
    .line 34
    .line 35
    move-result-wide v3

    .line 36
    invoke-static {v3, v4}, Ln5/A;->r(J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v3

    .line 40
    :cond_0
    const/16 v5, 0x20

    .line 41
    .line 42
    shr-long v5, v3, v5

    .line 43
    .line 44
    long-to-int v5, v5

    .line 45
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    const-wide v6, 0xffffffffL

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    and-long/2addr v3, v6

    .line 55
    long-to-int v3, v3

    .line 56
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    invoke-interface {v1}, Lm0/e;->t()F

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    invoke-interface {v1}, Lm0/e;->o()F

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    invoke-interface {v1}, Lm0/e;->w()F

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    invoke-interface {v1}, Lm0/e;->D()F

    .line 73
    .line 74
    .line 75
    move-result v8

    .line 76
    invoke-interface {v1}, Lm0/e;->G()F

    .line 77
    .line 78
    .line 79
    move-result v9

    .line 80
    invoke-interface {v1}, Lm0/e;->a()F

    .line 81
    .line 82
    .line 83
    move-result v10

    .line 84
    invoke-interface {v1}, Lm0/e;->F()F

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    float-to-double v11, v7

    .line 89
    const-wide v13, 0x3f91df46a2529d39L    # 0.017453292519943295

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    mul-double/2addr v11, v13

    .line 95
    move-wide v15, v13

    .line 96
    invoke-static {v11, v12}, Ljava/lang/Math;->sin(D)D

    .line 97
    .line 98
    .line 99
    move-result-wide v13

    .line 100
    double-to-float v7, v13

    .line 101
    invoke-static {v11, v12}, Ljava/lang/Math;->cos(D)D

    .line 102
    .line 103
    .line 104
    move-result-wide v11

    .line 105
    double-to-float v11, v11

    .line 106
    neg-float v12, v7

    .line 107
    mul-float v13, v6, v11

    .line 108
    .line 109
    const/high16 v14, 0x3f800000    # 1.0f

    .line 110
    .line 111
    mul-float v17, v14, v7

    .line 112
    .line 113
    sub-float v13, v13, v17

    .line 114
    .line 115
    mul-float/2addr v6, v7

    .line 116
    mul-float v17, v14, v11

    .line 117
    .line 118
    add-float v17, v17, v6

    .line 119
    .line 120
    move v6, v14

    .line 121
    move-wide/from16 v18, v15

    .line 122
    .line 123
    float-to-double v14, v8

    .line 124
    mul-double v14, v14, v18

    .line 125
    .line 126
    move/from16 v16, v6

    .line 127
    .line 128
    move v8, v7

    .line 129
    invoke-static {v14, v15}, Ljava/lang/Math;->sin(D)D

    .line 130
    .line 131
    .line 132
    move-result-wide v6

    .line 133
    double-to-float v6, v6

    .line 134
    invoke-static {v14, v15}, Ljava/lang/Math;->cos(D)D

    .line 135
    .line 136
    .line 137
    move-result-wide v14

    .line 138
    double-to-float v7, v14

    .line 139
    neg-float v14, v6

    .line 140
    mul-float v15, v8, v6

    .line 141
    .line 142
    mul-float/2addr v8, v7

    .line 143
    mul-float v20, v11, v6

    .line 144
    .line 145
    mul-float v21, v11, v7

    .line 146
    .line 147
    mul-float v22, v4, v7

    .line 148
    .line 149
    mul-float v23, v17, v6

    .line 150
    .line 151
    add-float v23, v23, v22

    .line 152
    .line 153
    neg-float v4, v4

    .line 154
    mul-float/2addr v4, v6

    .line 155
    mul-float v17, v17, v7

    .line 156
    .line 157
    add-float v17, v17, v4

    .line 158
    .line 159
    move v6, v3

    .line 160
    float-to-double v3, v9

    .line 161
    mul-double v3, v3, v18

    .line 162
    .line 163
    move-wide/from16 v18, v3

    .line 164
    .line 165
    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->sin(D)D

    .line 166
    .line 167
    .line 168
    move-result-wide v3

    .line 169
    double-to-float v3, v3

    .line 170
    move v9, v6

    .line 171
    move v4, v7

    .line 172
    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->cos(D)D

    .line 173
    .line 174
    .line 175
    move-result-wide v6

    .line 176
    double-to-float v6, v6

    .line 177
    neg-float v7, v3

    .line 178
    mul-float v18, v7, v4

    .line 179
    .line 180
    mul-float v19, v6, v15

    .line 181
    .line 182
    add-float v19, v19, v18

    .line 183
    .line 184
    mul-float/2addr v4, v6

    .line 185
    mul-float/2addr v15, v3

    .line 186
    add-float/2addr v15, v4

    .line 187
    mul-float v4, v3, v11

    .line 188
    .line 189
    mul-float/2addr v11, v6

    .line 190
    mul-float/2addr v7, v14

    .line 191
    mul-float v18, v6, v8

    .line 192
    .line 193
    add-float v18, v18, v7

    .line 194
    .line 195
    mul-float/2addr v6, v14

    .line 196
    mul-float/2addr v3, v8

    .line 197
    add-float/2addr v3, v6

    .line 198
    mul-float/2addr v15, v10

    .line 199
    mul-float/2addr v4, v10

    .line 200
    mul-float/2addr v3, v10

    .line 201
    mul-float v19, v19, v1

    .line 202
    .line 203
    mul-float/2addr v11, v1

    .line 204
    mul-float v18, v18, v1

    .line 205
    .line 206
    mul-float v20, v20, v16

    .line 207
    .line 208
    mul-float v12, v12, v16

    .line 209
    .line 210
    mul-float v21, v21, v16

    .line 211
    .line 212
    array-length v1, v2

    .line 213
    const/16 v6, 0x10

    .line 214
    .line 215
    const/4 v7, 0x0

    .line 216
    if-ge v1, v6, :cond_1

    .line 217
    .line 218
    goto :goto_0

    .line 219
    :cond_1
    aput v15, v2, v7

    .line 220
    .line 221
    const/4 v1, 0x1

    .line 222
    aput v4, v2, v1

    .line 223
    .line 224
    const/4 v1, 0x2

    .line 225
    aput v3, v2, v1

    .line 226
    .line 227
    const/4 v1, 0x3

    .line 228
    const/4 v6, 0x0

    .line 229
    aput v6, v2, v1

    .line 230
    .line 231
    const/4 v1, 0x4

    .line 232
    aput v19, v2, v1

    .line 233
    .line 234
    const/4 v1, 0x5

    .line 235
    aput v11, v2, v1

    .line 236
    .line 237
    const/4 v1, 0x6

    .line 238
    aput v18, v2, v1

    .line 239
    .line 240
    const/4 v1, 0x7

    .line 241
    aput v6, v2, v1

    .line 242
    .line 243
    const/16 v1, 0x8

    .line 244
    .line 245
    aput v20, v2, v1

    .line 246
    .line 247
    const/16 v1, 0x9

    .line 248
    .line 249
    aput v12, v2, v1

    .line 250
    .line 251
    const/16 v1, 0xa

    .line 252
    .line 253
    aput v21, v2, v1

    .line 254
    .line 255
    const/16 v1, 0xb

    .line 256
    .line 257
    aput v6, v2, v1

    .line 258
    .line 259
    neg-float v1, v5

    .line 260
    mul-float/2addr v15, v1

    .line 261
    mul-float v6, v9, v19

    .line 262
    .line 263
    sub-float/2addr v15, v6

    .line 264
    add-float v15, v15, v23

    .line 265
    .line 266
    add-float/2addr v15, v5

    .line 267
    const/16 v5, 0xc

    .line 268
    .line 269
    aput v15, v2, v5

    .line 270
    .line 271
    mul-float/2addr v4, v1

    .line 272
    mul-float v5, v9, v11

    .line 273
    .line 274
    sub-float/2addr v4, v5

    .line 275
    add-float/2addr v4, v13

    .line 276
    add-float/2addr v4, v9

    .line 277
    const/16 v5, 0xd

    .line 278
    .line 279
    aput v4, v2, v5

    .line 280
    .line 281
    mul-float/2addr v1, v3

    .line 282
    mul-float v3, v9, v18

    .line 283
    .line 284
    sub-float/2addr v1, v3

    .line 285
    add-float v1, v1, v17

    .line 286
    .line 287
    const/16 v3, 0xe

    .line 288
    .line 289
    aput v1, v2, v3

    .line 290
    .line 291
    const/16 v1, 0xf

    .line 292
    .line 293
    aput v16, v2, v1

    .line 294
    .line 295
    :goto_0
    iput-boolean v7, v0, LC0/C0;->G:Z

    .line 296
    .line 297
    invoke-static {v2}, Lj0/B;->m([F)Z

    .line 298
    .line 299
    .line 300
    move-result v1

    .line 301
    iput-boolean v1, v0, LC0/C0;->I:Z

    .line 302
    .line 303
    :cond_2
    return-object v2
.end method
