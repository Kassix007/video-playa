.class public final LZ4/H;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic A:LP/W;

.field public final synthetic B:LP/c0;

.field public final synthetic C:LP/W;

.field public final synthetic D:LP/W;

.field public final synthetic E:LP/W;

.field public final synthetic q:LP/W;

.field public final synthetic r:Lcom/web2native/MainActivity;

.field public final synthetic s:LZ4/M;

.field public final synthetic t:LP/W;

.field public final synthetic u:LP/W;

.field public final synthetic v:LP/W;

.field public final synthetic w:LP/W;

.field public final synthetic x:I

.field public final synthetic y:LP/W;

.field public final synthetic z:LP/W;


# direct methods
.method public constructor <init>(LP/W;Lcom/web2native/MainActivity;LZ4/M;LP/W;LP/W;LP/W;LP/W;ILP/W;LP/W;LP/W;LP/c0;LP/W;LP/W;LP/W;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LZ4/H;->q:LP/W;

    iput-object p2, p0, LZ4/H;->r:Lcom/web2native/MainActivity;

    iput-object p3, p0, LZ4/H;->s:LZ4/M;

    iput-object p4, p0, LZ4/H;->t:LP/W;

    iput-object p5, p0, LZ4/H;->u:LP/W;

    iput-object p6, p0, LZ4/H;->v:LP/W;

    iput-object p7, p0, LZ4/H;->w:LP/W;

    iput p8, p0, LZ4/H;->x:I

    iput-object p9, p0, LZ4/H;->y:LP/W;

    iput-object p10, p0, LZ4/H;->z:LP/W;

    iput-object p11, p0, LZ4/H;->A:LP/W;

    iput-object p12, p0, LZ4/H;->B:LP/c0;

    iput-object p13, p0, LZ4/H;->C:LP/W;

    iput-object p14, p0, LZ4/H;->D:LP/W;

    iput-object p15, p0, LZ4/H;->E:LP/W;

    const/4 p1, 0x2

    move-object/from16 p2, p16

    invoke-direct {p0, p1, p2}, Ls5/i;-><init>(ILq5/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, LZ4/H;

    .line 4
    .line 5
    iget-object v15, v0, LZ4/H;->D:LP/W;

    .line 6
    .line 7
    iget-object v2, v0, LZ4/H;->E:LP/W;

    .line 8
    .line 9
    move-object/from16 v16, v2

    .line 10
    .line 11
    iget-object v2, v0, LZ4/H;->q:LP/W;

    .line 12
    .line 13
    iget-object v3, v0, LZ4/H;->r:Lcom/web2native/MainActivity;

    .line 14
    .line 15
    iget-object v4, v0, LZ4/H;->s:LZ4/M;

    .line 16
    .line 17
    iget-object v5, v0, LZ4/H;->t:LP/W;

    .line 18
    .line 19
    iget-object v6, v0, LZ4/H;->u:LP/W;

    .line 20
    .line 21
    iget-object v7, v0, LZ4/H;->v:LP/W;

    .line 22
    .line 23
    iget-object v8, v0, LZ4/H;->w:LP/W;

    .line 24
    .line 25
    iget v9, v0, LZ4/H;->x:I

    .line 26
    .line 27
    iget-object v10, v0, LZ4/H;->y:LP/W;

    .line 28
    .line 29
    iget-object v11, v0, LZ4/H;->z:LP/W;

    .line 30
    .line 31
    iget-object v12, v0, LZ4/H;->A:LP/W;

    .line 32
    .line 33
    iget-object v13, v0, LZ4/H;->B:LP/c0;

    .line 34
    .line 35
    iget-object v14, v0, LZ4/H;->C:LP/W;

    .line 36
    .line 37
    move-object/from16 v17, p2

    .line 38
    .line 39
    invoke-direct/range {v1 .. v17}, LZ4/H;-><init>(LP/W;Lcom/web2native/MainActivity;LZ4/M;LP/W;LP/W;LP/W;LP/W;ILP/W;LP/W;LP/W;LP/c0;LP/W;LP/W;LP/W;Lq5/c;)V

    .line 40
    .line 41
    .line 42
    return-object v1
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
    invoke-virtual {p0, p1, p2}, LZ4/H;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LZ4/H;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LZ4/H;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "FULL_SCREEN"

    .line 4
    .line 5
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    sget v2, LZ4/L;->a:F

    .line 9
    .line 10
    iget-object v2, v1, LZ4/H;->q:LP/W;

    .line 11
    .line 12
    invoke-interface {v2}, LP/S0;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    check-cast v3, Ljava/lang/String;

    .line 17
    .line 18
    if-eqz v3, :cond_e

    .line 19
    .line 20
    iget-object v3, v1, LZ4/H;->s:LZ4/M;

    .line 21
    .line 22
    iget-object v4, v1, LZ4/H;->u:LP/W;

    .line 23
    .line 24
    iget-object v5, v1, LZ4/H;->v:LP/W;

    .line 25
    .line 26
    iget-object v6, v1, LZ4/H;->w:LP/W;

    .line 27
    .line 28
    iget v7, v1, LZ4/H;->x:I

    .line 29
    .line 30
    iget-object v8, v1, LZ4/H;->y:LP/W;

    .line 31
    .line 32
    iget-object v9, v1, LZ4/H;->z:LP/W;

    .line 33
    .line 34
    iget-object v10, v1, LZ4/H;->A:LP/W;

    .line 35
    .line 36
    iget-object v11, v1, LZ4/H;->B:LP/c0;

    .line 37
    .line 38
    iget-object v12, v1, LZ4/H;->C:LP/W;

    .line 39
    .line 40
    iget-object v13, v1, LZ4/H;->D:LP/W;

    .line 41
    .line 42
    iget-object v14, v1, LZ4/H;->E:LP/W;

    .line 43
    .line 44
    iget-object v15, v1, LZ4/H;->r:Lcom/web2native/MainActivity;

    .line 45
    .line 46
    move-object/from16 p1, v2

    .line 47
    .line 48
    invoke-virtual {v15}, Landroid/app/Activity;->getRequestedOrientation()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    move/from16 v16, v7

    .line 53
    .line 54
    new-instance v7, Ljava/lang/Integer;

    .line 55
    .line 56
    invoke-direct {v7, v2}, Ljava/lang/Integer;-><init>(I)V

    .line 57
    .line 58
    .line 59
    iget-object v2, v1, LZ4/H;->t:LP/W;

    .line 60
    .line 61
    invoke-interface {v2, v7}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    :try_start_0
    new-instance v7, LZ4/G;

    .line 66
    .line 67
    invoke-direct {v7, v2}, LZ4/G;-><init>(I)V

    .line 68
    .line 69
    .line 70
    invoke-static {v7}, LE3/h;->d(LB5/c;)La6/q;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    invoke-interface/range {p1 .. p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v17

    .line 78
    move-object/from16 v2, v17

    .line 79
    .line 80
    check-cast v2, Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    sget-object v17, LZ4/r;->Companion:LZ4/q;

    .line 86
    .line 87
    invoke-virtual/range {v17 .. v17}, LZ4/q;->serializer()LV5/a;

    .line 88
    .line 89
    .line 90
    move-result-object v17

    .line 91
    invoke-static/range {v17 .. v17}, LC3/a;->A(LV5/a;)LV5/a;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v7, v1, v2}, La6/c;->a(LV5/a;Ljava/lang/String;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    check-cast v1, LZ4/r;

    .line 100
    .line 101
    invoke-interface {v4, v1}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    invoke-interface {v4}, LP/S0;->getValue()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    check-cast v1, LZ4/r;

    .line 109
    .line 110
    const/4 v2, 0x0

    .line 111
    if-eqz v1, :cond_0

    .line 112
    .line 113
    iget-object v1, v1, LZ4/r;->a:LZ4/o;

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :catch_0
    move-exception v0

    .line 117
    goto/16 :goto_5

    .line 118
    .line 119
    :cond_0
    move-object v1, v2

    .line 120
    :goto_0
    invoke-interface {v5, v1}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    invoke-interface {v5}, LP/S0;->getValue()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    check-cast v1, LZ4/o;

    .line 128
    .line 129
    if-eqz v1, :cond_1

    .line 130
    .line 131
    iget-object v1, v1, LZ4/o;->c:LZ4/f;

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_1
    move-object v1, v2

    .line 135
    :goto_1
    if-nez v1, :cond_2

    .line 136
    .line 137
    const/4 v1, 0x0

    .line 138
    invoke-static {v6, v1}, LZ4/L;->e(LP/W;Z)V

    .line 139
    .line 140
    .line 141
    :cond_2
    invoke-interface {v5}, LP/S0;->getValue()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    check-cast v1, LZ4/o;

    .line 146
    .line 147
    if-eqz v1, :cond_e

    .line 148
    .line 149
    iget-object v1, v1, LZ4/o;->c:LZ4/f;

    .line 150
    .line 151
    if-eqz v1, :cond_e

    .line 152
    .line 153
    if-eqz v3, :cond_3

    .line 154
    .line 155
    const/4 v4, 0x0

    .line 156
    invoke-virtual {v3, v4}, LZ4/M;->c(Z)V

    .line 157
    .line 158
    .line 159
    :cond_3
    invoke-interface {v5}, LP/S0;->getValue()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    check-cast v4, LZ4/o;

    .line 164
    .line 165
    if-eqz v4, :cond_4

    .line 166
    .line 167
    iget-object v4, v4, LZ4/o;->c:LZ4/f;

    .line 168
    .line 169
    if-eqz v4, :cond_4

    .line 170
    .line 171
    iget-object v4, v4, LZ4/f;->d:LZ4/l;

    .line 172
    .line 173
    if-eqz v4, :cond_4

    .line 174
    .line 175
    iget-object v2, v4, LZ4/l;->b:Ljava/lang/String;

    .line 176
    .line 177
    :cond_4
    invoke-interface {v8, v2}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    invoke-interface {v5}, LP/S0;->getValue()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    check-cast v2, LZ4/o;

    .line 185
    .line 186
    invoke-static {v2, v15}, Ll6/d;->k(LZ4/o;Lcom/web2native/MainActivity;)Z

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    if-eqz v2, :cond_5

    .line 191
    .line 192
    const/4 v2, 0x1

    .line 193
    goto :goto_2

    .line 194
    :cond_5
    if-eqz v3, :cond_6

    .line 195
    .line 196
    const-string v2, ""

    .line 197
    .line 198
    invoke-virtual {v3, v2}, LZ4/M;->d(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    :cond_6
    const/4 v2, 0x0

    .line 202
    :goto_2
    invoke-static {v6, v2}, LZ4/L;->e(LP/W;Z)V

    .line 203
    .line 204
    .line 205
    invoke-interface {v6}, LP/S0;->getValue()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    check-cast v2, Ljava/lang/Boolean;

    .line 210
    .line 211
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    if-eqz v2, :cond_e

    .line 216
    .line 217
    iget-object v2, v1, LZ4/f;->a:Ljava/lang/String;

    .line 218
    .line 219
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    invoke-interface {v9, v2}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    iget-object v2, v1, LZ4/f;->b:Ljava/lang/String;

    .line 226
    .line 227
    if-nez v2, :cond_7

    .line 228
    .line 229
    const-string v2, "RIGHT"

    .line 230
    .line 231
    :cond_7
    invoke-interface {v10, v2}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    invoke-interface {v9}, LP/S0;->getValue()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    check-cast v2, Ljava/lang/String;

    .line 239
    .line 240
    invoke-static {v2, v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    const/16 v4, 0xa

    .line 245
    .line 246
    if-eqz v2, :cond_8

    .line 247
    .line 248
    const/4 v2, 0x0

    .line 249
    goto :goto_3

    .line 250
    :cond_8
    move v2, v4

    .line 251
    :goto_3
    invoke-virtual {v11, v2}, LP/c0;->f(I)V

    .line 252
    .line 253
    .line 254
    iget-object v1, v1, LZ4/f;->d:LZ4/l;

    .line 255
    .line 256
    if-eqz v1, :cond_9

    .line 257
    .line 258
    iget-object v1, v1, LZ4/l;->a:Ljava/lang/String;

    .line 259
    .line 260
    if-nez v1, :cond_a

    .line 261
    .line 262
    :cond_9
    const-string v1, "IMAGE"

    .line 263
    .line 264
    :cond_a
    invoke-interface {v12, v1}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    invoke-interface {v5}, LP/S0;->getValue()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    check-cast v1, LZ4/o;

    .line 272
    .line 273
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    iget-object v1, v1, LZ4/o;->c:LZ4/f;

    .line 277
    .line 278
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    iget-object v1, v1, LZ4/f;->c:Ljava/lang/String;

    .line 282
    .line 283
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    invoke-static {v1}, Lj0/B;->b(I)J

    .line 288
    .line 289
    .line 290
    move-result-wide v1

    .line 291
    new-instance v5, Lj0/o;

    .line 292
    .line 293
    invoke-direct {v5, v1, v2}, Lj0/o;-><init>(J)V

    .line 294
    .line 295
    .line 296
    invoke-interface {v13, v5}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    invoke-interface {v9}, LP/S0;->getValue()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    check-cast v1, Ljava/lang/String;

    .line 304
    .line 305
    invoke-static {v1, v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 309
    sget-object v2, Lj0/B;->a:LO3/D;

    .line 310
    .line 311
    if-eqz v0, :cond_b

    .line 312
    .line 313
    :try_start_1
    sget-object v0, Landroidx/compose/foundation/layout/c;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 314
    .line 315
    invoke-static {v0}, LQ2/g;->k(Lc0/m;)Lc0/m;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    invoke-interface {v13}, LP/S0;->getValue()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    check-cast v1, Lj0/o;

    .line 324
    .line 325
    iget-wide v4, v1, Lj0/o;->a:J

    .line 326
    .line 327
    invoke-static {v0, v4, v5, v2}, Landroidx/compose/foundation/a;->a(Lc0/m;JLj0/E;)Lc0/m;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    goto :goto_4

    .line 332
    :cond_b
    const-string v0, "FULL_WIDTH"

    .line 333
    .line 334
    invoke-static {v1, v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    move-result v0

    .line 338
    if-eqz v0, :cond_c

    .line 339
    .line 340
    sget-object v0, Landroidx/compose/foundation/layout/c;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 341
    .line 342
    div-int/lit8 v7, v16, 0x2

    .line 343
    .line 344
    int-to-float v1, v7

    .line 345
    const/high16 v4, 0x7fc00000    # Float.NaN

    .line 346
    .line 347
    invoke-static {v0, v4, v1}, Landroidx/compose/foundation/layout/c;->b(Lc0/m;FF)Lc0/m;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    invoke-static {v0}, LQ2/g;->k(Lc0/m;)Lc0/m;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    const/4 v1, 0x7

    .line 356
    invoke-static {v1}, LH/e;->a(I)LH/d;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    invoke-static {v0, v1}, La/a;->n(Lc0/m;Lj0/E;)Lc0/m;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    invoke-interface {v13}, LP/S0;->getValue()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    check-cast v1, Lj0/o;

    .line 369
    .line 370
    iget-wide v4, v1, Lj0/o;->a:J

    .line 371
    .line 372
    invoke-static {v0, v4, v5, v2}, Landroidx/compose/foundation/a;->a(Lc0/m;JLj0/E;)Lc0/m;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    goto :goto_4

    .line 377
    :cond_c
    invoke-static {}, Landroidx/compose/foundation/layout/c;->h()Lc0/m;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    invoke-static {v0}, LQ2/g;->k(Lc0/m;)Lc0/m;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    invoke-static {v4}, LH/e;->a(I)LH/d;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    invoke-static {v0, v1}, La/a;->n(Lc0/m;Lj0/E;)Lc0/m;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    invoke-interface {v13}, LP/S0;->getValue()Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    check-cast v1, Lj0/o;

    .line 398
    .line 399
    iget-wide v4, v1, Lj0/o;->a:J

    .line 400
    .line 401
    invoke-static {v0, v4, v5, v2}, Landroidx/compose/foundation/a;->a(Lc0/m;JLj0/E;)Lc0/m;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    :goto_4
    invoke-interface {v14, v0}, LP/W;->setValue(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 406
    .line 407
    .line 408
    goto :goto_6

    .line 409
    :goto_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 410
    .line 411
    .line 412
    const/4 v1, 0x0

    .line 413
    if-eqz v3, :cond_d

    .line 414
    .line 415
    invoke-virtual {v3, v1}, LZ4/M;->c(Z)V

    .line 416
    .line 417
    .line 418
    :cond_d
    invoke-static {v6, v1}, LZ4/L;->e(LP/W;Z)V

    .line 419
    .line 420
    .line 421
    :cond_e
    :goto_6
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 422
    .line 423
    return-object v0
.end method
